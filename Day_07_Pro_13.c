#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";

    
    int x;
    double y;
    char str[100];
    
    scanf("%d",&x);
 scanf("%lf", &y);
        getchar();
    fgets(str, 100, stdin);

    printf("%d\n", i + x);
    printf("%.1lf\n", d + y);
    printf("%s%s", s, str);


    

    return 0;
}
