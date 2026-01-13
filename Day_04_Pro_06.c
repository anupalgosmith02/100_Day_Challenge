#include <stdio.h>
#include <string.h>

int main() {
    char s[1000];                // Create a string (array of chars)
    scanf("%[^\n]%*c", s);      // Read input string (including spaces)
    
    printf("Hello, World!\n");  // Print first line
    printf("%s", s);            // Print the input string
    
    return 0;
}
   
