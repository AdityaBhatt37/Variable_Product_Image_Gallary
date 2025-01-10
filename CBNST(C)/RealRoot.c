#include <stdio.h>
#include <math.h>

#define F(x) (x*x*x - 2*x - 5)

int main() {
    int i = 0;
    float a, b, c, f;
    printf("Enter the value of interval a and b: ");
    scanf("%f %f", &a, &b);

    do {
        c = (a + b) / 2;
        f = F(c);
        printf("\ni=%d  a=%f b=%f c=%f F(c)=%f", i, a, b, c, f);
        if (F(c) > 0) {
            b = c;
        } else {
            a = c;
        }
        i++;
    } while (fabs(F(c)) > 0.001);

    printf("\n\nApproximate root = %.4f\n", c);

    return 0;
}
