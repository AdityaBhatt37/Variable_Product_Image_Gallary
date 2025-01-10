#include<stdio.h>
#include<math.h>

#define f(x) (x*x*x - 2*x - 5)

int main() {
    int i, n;
    float x1, x2, x3;

    printf("Enter the initial values of x1 and x2: ");
    scanf("%f %f", &x1, &x2);

    printf("Enter the number of iterations: ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++) {
        x3 = (x1 * f(x2) - x2 * f(x1)) / (f(x2) - f(x1));

        if(f(x1) * f(x3) < 0)
            x2 = x3;
        else
            x1 = x3;
    }

    printf("The root of the iteration is: %f\n", x3);

    return 0;
}
