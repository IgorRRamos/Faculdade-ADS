#include <stdio.h>

int main(int argc, char const *argv[])
{
    float media, nota1, nota2, nota3, nota4;

    printf("Digite a nota 1: ");
    scanf("%f", &nota1);
    printf("Digite a nota 2: ");
    scanf("%f", &nota2);
    printf("Digite a nota 3: ");
    scanf("%f", &nota3);
    printf("Digite a nota 4: ");
    scanf("%f", &nota4);
    media = (nota1 + nota2 + nota3 + nota4) / 4.0;
    printf("A media das notas informadas é: %f\n", media);


    return 0;
}
