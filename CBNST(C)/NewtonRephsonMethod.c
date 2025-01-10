#include<stdio.h>

int eq(float x){

   return (x*x*x*x)-x-10;
}

int main(){

float NegInterval = 0, PosInterval = 0;

float i = 0, j = i+1,xnot = 0;

while(1){

    float Ieq = eq(i);
    float Jeq = eq(j);

    if(Ieq<0 && Jeq>0){

        NegInterval = i;
        PosInterval = j;
        //Now I have to find the x0 

        Ieq = 0-Ieq;

        if(Ieq<Jeq){

            xnot = Ieq;

        }
        else{

            xnot = Jeq;
        }
        break;
    }

    i++;
    j++;

}

printf("The value of xnot for this equation is : %f",xnot);
 
float r = xnot-(eq(xnot));

    return 0;
}