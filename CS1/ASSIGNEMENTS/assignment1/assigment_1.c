#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Data structures
typedef struct student {
    int id;
    char *lname; //stores last name of student
    float *scores; //stores scores of the student. Size is taken from num_scores array.
    float std_avg; //average score of the student (to be calculated)
} student;

typedef struct course {
    char *course_name; //stores course name
    int num_sections; //number of sections
    student **sections;//stores array of student arrays(2D array).
    // Size is num_sections;
    int *num_students;//stores array of number of students in each section.
    // Size is num_sections;
    int *num_scores; //stores array of number of assignments in each section. Size is num_sections;
} course;

// Prototype definition.
course *read_courses(FILE *fp, int *nbr_courses);

student **read_sections(FILE *fp, int num_students[], int num_scores[], int num_sections);

void process_courses(course *courses, int num_courses);

void release_courses(course *courses, int num_courses);


void free_section(student *sections, int num_students);

int main() {
    int testCases;
    int *num_courses;

    struct course *ptr_course;

    num_courses = (int *) malloc(sizeof(int));
    FILE *input_file = fopen("assignment1input.txt", "r");
    //
    fscanf(input_file, "%d", &testCases);

    for (int i = 0; i < testCases; ++i) {
        printf("\ntest case %d\n", i + 1);
        fscanf(input_file, "%d", num_courses);

        ptr_course = read_courses(input_file, num_courses);
        // Get the results.
        process_courses(ptr_course, *num_courses);
    }
    // free allocated memory
    release_courses(ptr_course, *num_courses);
    // free file
    fclose(input_file);
}

// creates an array that has a dimension of nbr_courses and allocate the memory.
// returns the pointer to that array;
course *read_courses(FILE *fp, int *nbr_courses) {
    struct course *courses;
    //Allocate memory for courses
    courses = (struct course *) malloc(*nbr_courses * sizeof(course));

    for (int i = 0; i < *nbr_courses; ++i) {
        //Allocate memory for courses of size number of courses variables ;
        courses[i].course_name = (char *) malloc(20 * sizeof(char));

        // stores course name
        fscanf(fp, "%s", (courses + i)->course_name);
        fscanf(fp, "%d", &courses[i].num_sections);

        //courses[i].sections = (student **) malloc(courses[i].num_sections * sizeof(student *));
        //Allocate memory for courses of size number of courses pointers ;
        courses[i].num_students = (int *) malloc(courses[i].num_sections * sizeof(int));
        courses[i].num_scores = (int *) malloc(courses[i].num_sections * sizeof(int));

        // call sections function to allocate sections
        courses[i].sections = read_sections(fp, courses[i].num_students, courses[i].num_scores,
                                            courses[i].num_sections);


    }

    return courses;

}

// creates an array that has a dimension of num_student and allocate the memory.
// returns the pointer to that array;
student **read_sections(FILE *fp, int num_students[], int num_scores[], int num_sections) {

    struct student **ptr_Sections = (student **) malloc((num_sections) * sizeof(student *));
    for (int i = 0; i < num_sections; ++i) {

        fscanf(fp, "%d", &num_students[i]);
        // allocation sections
        ptr_Sections[i] = (student *) malloc(*(num_students + i) * sizeof(student));

        fscanf(fp, "%d", &num_scores[i]);

        for (int j = 0; j < num_students[i]; ++j) {
            ptr_Sections[i][j].lname = (char *) malloc(20 * sizeof(char));
            ptr_Sections[i][j].scores = (float *) malloc(*(num_scores + i) * sizeof(float));

            fscanf(fp, "%d", &ptr_Sections[i][j].id);
            fscanf(fp, "%s", ptr_Sections[i][j].lname);

            float sum = 0;
            for (int k = 0; k < num_scores[i]; ++k) {
                fscanf(fp, "%f", &ptr_Sections[i][j].scores[k]);

                sum += ptr_Sections[i][j].scores[k];
            }
            // calculate the avg for each students
            ptr_Sections[i][j].std_avg = (sum / num_scores[i]);
        }
    }
    return ptr_Sections;
}

void process_courses(course *courses, int num_courses) {

    int count_pass[num_courses];
    // count the passing number
    for (int i = 0; i < num_courses; i++) {
        int pass_count = 0;
        for (int j = 0; j < courses[i].num_sections; j++) {
            for (int k = 0; k < courses[i].num_students[j]; k++) {
                if (courses[i].sections[j][k].std_avg >= 70) {
                    pass_count++;
                }
            }
        }
        count_pass[i] = pass_count;
    }

    for (int i = 0; i < num_courses; i++) {
        printf("%s\t%d\t ", courses[i].course_name, count_pass[i]);
        int pass_count = 0;

        float max_score;
        char high_name[20];
        int high_id;

        for (int j = 0; j < courses[i].num_sections; j++) {
            float total_avrage_sum = 0.0f;

            // initialization of the counters
            max_score = courses[i].sections[0][0].std_avg;
            high_id = courses[i].sections[0][0].id;

            // copy high score name
            strcpy(high_name, courses[i].sections[0][0].lname);
            for (int k = 0; k < courses[i].num_students[j]; k++) {
                total_avrage_sum += courses[i].sections[j][k].std_avg;

                if (courses[i].sections[j][k].std_avg >= 70) {
                    pass_count++;
                }
                if (courses[i].sections[j][k].std_avg > max_score) {
                    max_score = courses[i].sections[j][k].std_avg;
                    high_id = courses[i].sections[j][k].id;

                    strcpy(high_name, courses[i].sections[j][k].lname);
                }
            }
            printf(" %.2f\t", total_avrage_sum / courses[i].num_students[j]);
        }

        printf("%d\t%s\t%.2f\n", high_id, high_name, max_score);
    }
}

void release_courses(course *courses, int num_courses) {

    // Free memory for courses array.

    for (int i = 0; i < num_courses; i++) {

        // Free memory for section array..
        for (int j = 0; j < courses[i].num_sections; j++) {
            free_section(courses[i].sections[j], courses[i].num_students[j]);
        }

        // free struct courses pointers.
        free(courses[i].course_name);
        free(courses[i].num_students);
        free(courses[i].num_scores);
        free(courses[i].sections);

    }

}

// Function frees all the sections.
void free_section(student *sections, int num_students) {

    // free memory for each struct student allocated memory.
    int i;
    for (i = 0; i < num_students; i++) {
        free(sections[i].lname);
        free(sections[i].scores);
    }

    // free section pointer.
    free(sections);
}
