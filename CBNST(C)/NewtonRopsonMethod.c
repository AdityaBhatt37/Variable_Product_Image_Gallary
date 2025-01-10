#include<stdio.h>
#include<math.h>

#define F(x) x*x*x*-2-x-5

int main(){

int i = 1;
float a,b,c,f;

printf("Enter initial guess : ");
scanf("%f %f",&a,&b);

do{

    c = (a+b)/2;
    f = F(c);

    if(F(c)<0){

        a = c;
    }
    else{

        b = c;
    }

    i++;

}while(fabs(F(c))>0.001);

printf("The real root of the equation is : %.4f",c);

    return 0;
}



// #include <stdio.h>


// float EqM(float x){


//   return (x*x*x)-2*x-11;


// }

// int main() {
//     float x = 0; 

//     float FirstInterval = 0, SecondInterval = 0;

//     float i = 0, j = i + 1;

//     while (1) {
//         float IEq = EqM(i);
//         float JEq = EqM(j);

//         if (IEq < 0 && JEq > 0) {
//             FirstInterval = i; 
//             SecondInterval = j; 
//             break;
//         }

//         i++;
//         j++;
//     }


//     int max_iterations = 100; // maximum number of iterations
//     int it;

//     for (it = 0; it < max_iterations; it++) {
//         float Formula = (FirstInterval + SecondInterval) / 2;

//         EqM(Formula);

//         if (EqM(Formula)> 0)
//             SecondInterval = Formula;
//         else
//             FirstInterval = Formula;


//     }

//     printf("Root found at: %f\n", (FirstInterval + SecondInterval) / 2);
   

//     return 0;
// }






// #include<stdio.h>
// #include<math.h>
// #define F(x) x*x*x-2*x-5
// int main()
// {
//     int i=1;
//     float a,b,c,f;
//     printf("Enter the value of interval a and b:");
//     scanf("%f %f",&a,&b);
//     do
//     {
//         c=(a+b)/2;
//         f=F(c);
//         printf("\n i=%d     a=%f    b=%f    c=%f    F(c)=%f",i,a,b,c,f);
//         if(F(c)<0)
//         {
//             a=c;
//         }
//         else
//         {
//             b=c;
//         }
//         i++;
//     } while (fabs(F(c))>0.001);
//     printf("\n \n approximate root = %.4f \n",c);
//      return 0;
// }


// #include<stdio.h>
// #include<math.h>

// #define F(x) x*x*x-2*x-5

// int main(){

// int i = 1;

// float a,b,c,f;

// printf("Enter first and second interval: ",&a,&b);

// scanf("%f %f",&a,&b);

// do{

//     c = (a+b)/2;
//     f = F(c);

//     printf("\n i = %d a = %f b = %f c = %f f = %f",i,a,b,c,f);

//     if(F(c)<0){

//         a = c;
//     }
//     else{

//         b = c;
//     }

//     i++;
// }while(fabs(F(c))>0.001);

// printf("\nThe approximate root is : %.4f",c);

//     return 0;
// }