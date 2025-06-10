#include <stdio.h>

int main(int argc, char const *argv[])
{
    int soma=0;

    for (int contador = 0; contador < 10; contador++)
    {
        if (contador % 2 == 0)
        {
            soma += contador;
            printf("Sequencial: %i \n", contador);
        }
    }
    printf("\n");

    printf("O valor total dos numeros pares somados é: %i\n", soma);

    return 0;
}
