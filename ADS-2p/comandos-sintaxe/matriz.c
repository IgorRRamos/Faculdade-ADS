#include <stdio.h>

int main(int argc, char const *argv[])
{
    float notas[4][4], media=0;

    for(int i=0;i<4;i++)
    {
        for(int j=0;j< 4;j++)
        {
            printf("Digite a nota do aluno %i: ", i + 1);
            scanf("%f", &notas[i][j]);
        }

    }

    int escolha;

    printf("Digite o numero do aluno que deseja calcular a media: ");
    scanf("%i", &escolha);

    for(int i=0;i< 4;i++)
    {
        media+=notas[escolha][i];
    }

    media /= 4;
    
    printf("A media do aluno é: %.1ff\n", media);


    return 0;
}
