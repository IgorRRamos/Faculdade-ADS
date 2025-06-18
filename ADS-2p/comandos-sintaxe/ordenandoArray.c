#include <stdio.h>

void insertionSortC(int array[], int tamanho)
{
    int i, j, tmp;
    for (i = 1; i < tamanho; i++)
    {
        j = i;
        while (j > 0 && array[j - 1] > array[j])
        {
            tmp = array[j];
            array[j] = array[j - 1];
            array[j - 1] = tmp;
            j--;
        }
    }
}

int main(int argc, char const *argv[])
{
    int array[100], tamanho, ordem;

    printf("\nDigite o tamanho do vetor: ");
    scanf("%d", &tamanho);
    printf("\nAgora digite os valores... \n");

    for (int i = 0; i < tamanho; i++)
    {
        printf("Digite o valor %d:", i + 1);
        scanf("%d", &array[i]);
    }

    insertionSortC(array, tamanho);

    printf("Resultado: \n");

    for (int i = 0; i < tamanho; i++)
    {
        printf("%d\n", array[i]);
    }

    return 0;
}
