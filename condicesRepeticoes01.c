#include <stdio.h>

int main(int argc, char const *argv[])
{
    int opcao;

    printf("1. Checar ortografia.");
    printf("2. Corrigir erros de ortografia.");
    printf("3. Mostrar erros de ortografia");
    printf("4. sair");

    opcao = getchar();

    switch (opcao)
    {
    case 1:
        printf("Você selecionou a opcao 1");
        break;
    case 2:
        printf("Você selecionou a opcao 2");
        break;
    case 3:
        printf("Você selecionou a opcao 3");       
        break;
    default:
        printf("Você optou por sair");
        break;
    }
}
