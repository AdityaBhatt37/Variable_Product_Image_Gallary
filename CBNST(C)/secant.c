#include<stdio.h>
#include<math.h>

#define F(x)  x*x*x - 2*x - 5

int main(){

int step=1,N;

float x0,x1,x2,f0,f1,f2,e;

printf("Enter initial guess : ");
scanf("%f %f",&x0,&x1);

printf("Enter tollerable error : ");
scanf("%f",&e);

printf("Enter maximum iteration : ");
scanf("%d",&N);

do{

    f0 = F(x0);
    f1 = F(x1);

    if(f0 == f1){

        printf("Mathematical Error");
        exit(0);
    }

    x2 = x1-(x1-x0)*f1/(f1-f0);

    f2 = F(x2);
    
    x0 = x1;
    f0 = f1;

    x1 = x2;
    f1 = f2;

    step = step + 1;

    if(step>N){

        printf("Cant be converse");
        exit(0);
    }
}while(fabs(f2)>e);

printf("The real root of the equation is : %f",x2);


    return 0;
}