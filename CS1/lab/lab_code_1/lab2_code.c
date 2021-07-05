#include <stdio.h>
#include <stdlib.h>

typedef struct student {
    char lname[50];
    int assigment;
    int finalexam;
    int *quiz;
    int total;

} student;

student *readDate(FILE *in, int *noOfRecords, int *noOfquiz) {
    student *ptr;
    fscanf(in, "%d %d", noOfRecords, noOfquiz);
    ptr = (student *) malloc(*noOfRecords * sizeof(struct student));
    for (int i = 0; i < *noOfRecords; ++i) {
        fscanf(in, "%s %d", ptr[i].lname, &ptr[i].assigment);
        ptr[i].quiz = (int *) malloc(*noOfquiz * sizeof(int));
        int quizSum = 0;
        for (int j = 0; j < *noOfquiz; ++j) {
            fscanf(in, "%d", &ptr[i].quiz[j]);
            quizSum += ptr[i].quiz[j];

        }
        fscanf(in, "%d", &ptr[i].finalexam);
        ptr[i].total = quizSum + ptr[i].assigment + ptr[i].finalexam;
    }
    return ptr;
}

int main() {
    student *ptr;
    FILE *infile, *outfile;
    int noofRecords, noofquiz;
    infile = fopen("/Users/meroa006/CLionProjects/LAb2/input.txt", "r");
    if (infile != NULL) {

        ptr = readDate(infile, &noofRecords, &noofquiz);
    } else {
        printf("File does not exist");
        exit(-1);
    }
    int max_total = 0;
    int max_total_index = 0;
    for (int i = 0; i < noofRecords; i++) {
        if (ptr[i].total > max_total) {
            max_total = ptr[i].total;
            max_total_index = i;
        }

    }
    outfile = fopen("output.txt", "w");
   
    fprintf(outfile, "%s %d\n", ptr[max_total_index].lname, ptr[max_total_index].total);
    printf("%s %d\n", ptr[2].lname, ptr[max_total_index].total);

    for (int k = 0; k < noofRecords; k++) {
        free(ptr[k].quiz);

    }
    free(ptr);
    fclose(infile);
    fclose(outfile);

    return 0;
}
