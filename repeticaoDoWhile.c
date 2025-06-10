#include <stdio.h>

int main(int argc, char const *argv[])
{
    int num=0;

    printf("Por favor digite um numero: ");
    scanf("%i", &num);

    do{
    
        printf("Por favor digite um numero: ");
        scanf("%i", &num);

    }while(num < 20);

    printf("Fim do programa!\n");

    return 0;
}
