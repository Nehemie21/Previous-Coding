/******************************************************************************
 * @file: latin_square_functions.c
 *
 * WISC NETID: pluviose
 * CANVAS USERNAME: MeleEvergreen-Nehemie Pluviose
 * WISC ID NUMBER: 9082152753
 * OTHER COMMENTS FOR THE GRADER (OPTIONAL)
 *
 * @creator: MeleEvergreen (pluviose@wisc.edu)
 * @modified: SUBMISSION DATE: 11/13/2021
 *****************************************************************************/

#include <assert.h>
#include <stdio.h>
#include <stdlib.h>

#include "latin_square_functions.h"

// Set this to 1 to enable dbgprintf statements, make sure to set it back to 0
// before submitting!
#define DEBUG               0
#define dbgprintf(...)      if (DEBUG) { printf(__VA_ARGS__); }
#define dbgprint_latin_square(n, LS) if (DEBUG) { Print_Latin_Square(n, LS); }

/******************************************************************************
 * Data Types and Structures
 *****************************************************************************/

// ADD ANY ADDITIONAL DATA TYPES OR STRUCTSvHERE

/******************************************************************************
 * Globals
 *****************************************************************************/
extern void Print_Latin_Square(const size_t n, char **latin_square);

/******************************************************************************
 * Helper functions
 *****************************************************************************/

// ADD ANY HELPER FUNCTIONS YOU MIGHT WRITE HERE

/******************************************************************************
 * Verificaiton functions
 *****************************************************************************/

/*
 * This function takes the name of the file containing the latin square
 * and reads in the data to the latin_square parameter.
 *
 * There are many approaches that will work to read in the latin square data.
 * In any approach you choose, you will need to do at least the following:
 *     1) open the file
 *     2) read in the text from the file
 *     3) figure out the dimensions of the latin square (n)
 *     4) reserve memory for the latin_square. This requires 2 steps
 *         4a) reserve an array of pointers to the rows
 *         4b) reserve an array of characters for each row
 *     5) fill in the latin_square data structure
 *     6) close the file
 *
 * @param filename The name of the file to read in
 * @param latin_square_in A pointer to the latin square variable in main
 * @param n The value of both dimensions of the latin square (i.e. nxn)
 */
void Read_Latin_Square_File(const char *filename,
			    char ***latin_square_in,
			    size_t *n) {
  /* BEGIN MODIFYING CODE HERE */

  FILE *fp;

    // Open the file
  fp = fopen(filename, "r");

  if(fp == NULL)
    {
      //      printf("Something went wrong\n");
      exit(1);
    }


  // printf("Made it out\n");

  // We can determine the n by counting the number of new lines
  int nCounter = 0;

  // inspiration by the below stackoverflow link
  //https://stackoverflow.com/questions/19743996/dimensions-of-a-matrix-in-c/19744331#19744331

  int check = 0;
  int checkNumbertwo = 0;
  
  while((check = fgetc(fp)) != EOF)
    {

      if(check == ' ')
	break;
      else if(check == '\n'
	      && checkNumbertwo != '\n')
	nCounter = nCounter + 1;

      checkNumbertwo = check;
    }

  *n = nCounter;
  // printf("nCounter: %d, n: %d" , nCounter, *n);

  rewind(fp);
  //   fclose(fp);

  //FILE *fptr;

  //fptr = fopen(filename, "r");
  
  
  //  *latin_square_in = (char **) malloc((*n * *n) * sizeof(char *));

 
  *latin_square_in = (char **) malloc(*n * sizeof(char *));

  for(int i = 0; i < *n; i++)
    {

      //      *(*latin_square_in + i) = (char*) malloc(*n * sizeof(char *));
      *(*latin_square_in + i) = (char *) malloc((*n + 1) * sizeof(char *));

    }
  
  for(int i = 0; i < *n; i++)
    {

      for(int j = 0; j < *n; j++)
	{
	  if((check = fgetc(fp)) == '\n')
	     check = fgetc(fp);
	  
	   char val = check;

	   //	   printf("Check: %d, Val: %c\n\n", check, val);
	   // printf("i: %d , j: %d\n\n" , i, j);
	   
	   // *(*((*latin_square_in + i) + j)) = val;
	   //  *(*(*(latin_square_in + (i * sizeof(char *))) + (j * sizeof(char *))))) = val;
	   //      *(*(*(latin_square_in + (i * sizeof(char *))) + (j * sizeof(char *)))) = val;
	   // *(*(*(latin_square_in + (i)) + j)) = val;

	   *((*(*latin_square_in + i))+j) = val;

	   if(j == *n - 1)
	     {
	       *((*(*latin_square_in + i)) + (j+1)) = '\0';

	     }
	   // printf("Hello Everyone!\n");
	}
  
      //  if((check = fgetc(fp)) == '\n')
       // {
	   // check = fgetc(fp);
	  // }

    }

//free(*latin_square_in);


  fclose(fp);
  //    free(fp);
  //  free(val);
  //  free(nCounter);
  // free(check);
  // free(checkNumbertwo);
  //Read the text from the file
  /*  for(int i = 0; i < n; i++)
    {

	
      char *ptr = malloc(n * sizeof(char));
      int counter = 0;
      while((check = fgetc(fp)) != '\n')
	{
	  // char *ptr = malloc(n * sizeof(char));
	  *ptr = check;
	  counter++;
	  
	  ptr = (ptr + counter);
	  
	}

	}*/

  
  /* END MODIFYING CODE HERE */
  
}

/*
 * This function checks to see that exactly n symbols are used and that
 * each symbol is used exactly n times.
 *
 * @param n The value of both dimensions of the latin square (i.e. nxn)
 * @param latin_square_in A pointer to the latin square variable in main
 * @return 1 if valid, 0 if not
 */
int Verify_Alphabet(const size_t n, char **latin_square) {
  if (latin_square == NULL) {
    printf("Verify_Alphabet - latin_square is NULL\n");
    return 0;
  }

  /* BEGIN MODIFYING CODE HERE */

  //  char *ptr = latin_square;
  // char *ptr = *latin_square;
  
  for(int i = 0; i < n; i++)
    {
      // int counter = 1;
      //May not need the star for these approaches.
      //Keep that noted
      // char check = *(latin_square + i * sizeof(char));
      //char check = (latin_square + i * sizeof(char));
      char check = *(*(latin_square + i *sizeof(char)));
      // printf("Check %c\n" , check);
      // printf("For i \n");
      
      for(int j = 1; j < n; j++)
	{

	  //  printf("For j\n");
	  
	  int counter = 0;
	  // point to the beginning of a row in Latin square 
	  // original
	  //	  ptr = *(latin_square + j * n * sizeof(char));
	  // ptr = (*latin_square + j * n * sizeof(char));
	  
	  for(int k = 0; k < n; k++)
	    {

	      //  printf("For k\n");
	      
	      //compare each element in a row to the element in the first row
	    //original
	      //char compare = *(ptr + k * sizeof(char));
	      //char compare = (*ptr + k * sizeof(char));
	      //char compare = *(ptr + k);
	      char compare = *(*(latin_square + j) + k);
	      

	      //     printf("Check: %c, Compare %c\n", check, compare);
	      // printf("i %d, j %d, k %d \n", i, j, k);
	      
	      if(check == compare)
		counter++;
	      
	    }


	   if(counter != 1)
	     {
	       //	       free(ptr);
	       return 0;
	     }
	}
	   

      //  if(counter != n)
      //	{
      //  return 0;
      //	} 



    }
  
  // free(ptr);
  
  /* END MODIFYING CODE HERE */
  return 1;
}

/*
 * This function verifies that no symbol is used twice in a row or column.
 * It prints an error message alerting the user which rows or columns have
 * duplicate symbols. This means that you will have at most n row error prints
 * and n column error prints.
 *
 * Note: Test all rows first then test all columns.
 *
 * Error messages have been included for you. Do not change the format out the
 * print statements, as our grading scripts will use exact string matching. You
 * change the variable passed as the formatting argument to printf.
 *
 * @param n The value of both dimensions of the latin square (i.e. nxn)
 * @param latin_square_in A pointer to the latin square variable in main
 * @return 1 if valid, 0 if not
 */
int Verify_Rows_and_Columns(const size_t n, char **latin_square){
  if (latin_square == NULL) {
    printf("Verify_Rows_and_Columns - latin_square is NULL\n");
    return 0;
  }
  /* BEGIN MODIFYING CODE HERE */

  int val = -1;
  int verify = -1;
  //Check for the rows
  //char *ptr = *latin_square;
  //char *ptr = latin_square;
  
  for(int i = 0; i < n; i++)
    {

      //Getting the value at a index in a row row
      //This is so it goes to each row
      // char check = *(latin_square+i*sizeof(char));
      
      for(int j = 0; j < n; j++)
	{
	  // this for loop, we are comparing elements in the i^th row
	  //We get one element, and in the next for loop, 
	  //	  char check = *(latin_square+j*sizeof(char));
	  char check = *(*(latin_square + i) + j);
	  
	  for(int k = j + 1; k < n; k++)
	    {
	      

	      // char compare = *(*(latin_square + j) + k);
	      // char compare = *(*ptr + j)+k);
	      char compare = *(*(latin_square + i) + k);
	      
	      if(check == compare
		 )
		{
		  //		  free(latin_square);
		  //  free(*latin_square);
		  //		  //free(ptr);
		  // printf("Error in row %d\n", i);
			  val = 0;
			  //	  continue;
			  		  //return 0;
			  	  verify = 0;
			  //			  break;
		}

	      //	      if(verify == 0)
	      //	break;



	     }

	  // if(verify == 0)
	  // {

	      // verify = -1;
	  //  break;
	  // }
	  
	  
	}
      //      ptr = (ptr +(n * sizeof(char)));
      // ptr = *(ptr + (n * sizeof(char)));
            if(verify == 0)
      	{

	    printf("Error in row %d\n", i);
	  
	   verify = -1;
	  // break;

	  	}


    }

  // ptr = *latin_square;
  //ptr = latin_square;
  int verifyCols = -1;
  
  for(int i = 0; i < n; i++)
    {



      for(int j = 0; j < n; j++)
	{

	  // char checkCols = *((ptr+( j * n) * sizeof(char)));
	  char checkCols = *(*(latin_square + j) + i);
	  
	  for(int k = j + 1; k < n * sizeof(char); k++)
	    {

	      // char compareCols = *(ptr + (k * n)* sizeof(char) );
	      // char compareCols = *(*ptr + (j*n)+k)   ???
	      char compareCols = *(*(latin_square + k) + i);
	      
	      if(checkCols == compareCols
		 )
		{
		  //	  free(ptr);
		  //	  free(latin_square);
		  // free(*latin_square);
		  
		  //  printf("Error in column %d\n", i);
		  val = 0;
		  verifyCols = 0;
		  // break;
		  // return 0;
		  
		}
	      
	    }
	  

	}

       if(verifyCols == 0)
		{

	   printf("Error in column %d\n", i);
	  verifyCols = -1;
	  	}

      // ptr = *(latin_square + ((i+1) * sizeof(char)));
      
    }
  // printf("Error in row %d\n", i);

  // printf("Error in column %d\n", i);
  // free(ptr);

  if(val == 0)
    return 0;
  /* END MODIFYING CODE HERE */
  return 1;
}

/*
 * This function calls free to allow all memory used by the latin_square
 * verification program to be reclaimed.
 *
 * Note: you will have n+1 calls to free
 *
 * @param n The value of both dimensions of the latin square (i.e. nxn)
 * @param latin_square_in A pointer to the latin square variable in main
 */
void Free_Memory(const size_t n, char **latin_square) {

  /* BEGIN MODIFYING CODE HERE */
  //https://stackoverflow.com/questions/54917715/transpose-matrix-using-pointer-in-c
  //Similar approached that was used in Malloc Lecture 11
  //Also used the above link for reference

  //  char **t = malloc(n * sizeof(char*));

  //In lecture, this example was used to get the columns of the transpose
  //and add spacing to it
  //However, we cannot use t[0]
  //So instead, we can use *(t+0) 
  /* for(int i = 0; i < n; i++)
    {
      *(t+0)= malloc(n * sizeof(char));
      

    }*/
  
  for(int i = 0; i < n; i++)
    {
      // for(int j = 0; j < n; j++)
      //{

	  //In lecture, *(*(t+1)+j) = m[i][j]
	  //but we have to use *(*(t+1)+j) = *(*(latin_square +j)+i);
	  //in order to traverse through the array with using []
	  // and to also successfully transpose the array
	  //	  *(*(t+i)+j) = *(*(latin_square +j)+i);

	  free(*(latin_square + i));
	  //	  free(*(latin_square + j)+i);
	  
	  //}
      
    }

  free(latin_square);

  

  /*for(int i = 0; i < n + 1; i++)
    {
           free(*(t+i));
    }*/

  //    free(t);
  //free(*t);
    //    free(**t);
  // free(latin_square);

    //free(*latin_square);
  //  free(**latin_square);
  // free(***latin_square);
  
    /*for(int i = 0; i < n; i++)
    {

      //      free(*(*latin_square + i));
      free((*latin_square + i));
      free( &(*(latin_square + i)));
      }*/
  
  
    /* for(int i =0; i < n; i++)

    {

      for(int j = 0; j < n; j++)
	{

	  
	    free( &(*(*(latin_square + i)+j)) );

	  // free( *(*latin_square + i) + j );

	  // free( ((*latin_square + i) + j );
	}
     
	}*/

  // free(n);
  /* END MODIFYING CODE HERE */
}


