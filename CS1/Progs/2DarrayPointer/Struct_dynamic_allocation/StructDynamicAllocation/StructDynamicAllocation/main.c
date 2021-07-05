//
//  main.c
//  StructDynamicAllocation
//
//  Created by Asad mero on 5/25/21.
//  Copyright © 2021 Asad merouani. All rights reserved.
//

#include <stdio.h>
#include <time.h>
#include <stdlib.h>

// Functions protpypes
struct integer* createRandBigInt( int numDigits);


struct point{
    int x;
    int y;
};
struct integer{
    int* digits;
    int size;
};

// Main function
int main() {
    
    //
    int numberDigit;
    // seed the random function
    srand(time(0));
    struct point* p;
    p = (struct point*) malloc(10*sizeof(struct point));
    
    for (int i =0 ; i< 10; i++) {
        p[i].x = i+1;
        p[i].y = 6+i;
    }
    
    for (int i =0 ; i< 10; i++){
        printf("%d %d %d\n",i, p[i].x, p[i].y );
    }
    
    //
    printf("enter the number of digits\n");
    scanf("%d", &numberDigit);
    
    struct integer* block = createRandBigInt(numberDigit);
    
    printf("the size of the strcut is:%d\n", block->size);
    
    // Display the digit's values int the intger struct.
    for (int i =0 ; i< numberDigit; i++){
        printf("the value of the digits %d is:%d\n",i , *(block->digits + i));
      }
 
    free(p);
    free(block);
    return 0;
}

// pre
// post
struct integer* createRandBigInt( int numDigits){
    struct integer* temp;
    
    temp = (struct integer*)malloc(sizeof(struct integer));
    temp->digits = (int*)malloc(numDigits*sizeof(int));
    temp->size = numDigits;
    
    for (int i =0; i< numDigits; i++) {
        temp->digits[i]= rand() % 10;
    }
    
    return temp;
}
