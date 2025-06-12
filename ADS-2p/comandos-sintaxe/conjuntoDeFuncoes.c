#include <stdio.h>
#include <string.h>

int main()
{
    char nome1[10]; char nome2[10];

    printf("Digite um nome: ");
    gets(nome1);

    printf("Digite outro nome: ");
    gets(nome2);

    
    printf("%i, %i\n", strlen(nome1), strlen(nome2));
    
    strcpy(nome1, nome2);
    printf(nome1, "\n");

    
    
   
    
    return 0;
}
