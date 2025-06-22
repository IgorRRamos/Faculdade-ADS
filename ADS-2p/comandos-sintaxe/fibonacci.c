#include <stdio.h>
int main(int argc, char const *argv[])
{   
    int n1 = 0, n2 = 1, entrada, i;
    printf("Fibonacci sequence: ");
    scanf("%d", &entrada);

    for(i=0; i < entrada; i++)
    {
        printf("%d ", n1);
        int proximo = n1 + n2;
        n1 = n2;
        n2 = proximo;
    }
    {

    }
    
    
    
    
    return 0;
}
