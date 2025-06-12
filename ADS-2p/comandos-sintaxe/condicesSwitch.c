#include <stdio.h>

int main(int argc, char const *argv[])
{
    int opcao;

    printf("1. Checar ortografia.\n");
    printf("2. Corrigir erros de ortografia.\n");
    printf("3. Mostrar erros de ortografia\n");
    printf("4. sair\n");
    printf("Digite sua escolha: ");

    opcao = getchar();

    switch (opcao)
    {
    case '1':
        printf("Você selecionou a opcao 1\n");
        break;
    case '2':
        printf("Você selecionou a opcao 2\n");
        break;
    case '3':
        printf("Você selecionou a opcao 3\n");       
        break;
    default:
        printf("Você optou por sair\n");
        break;
    }
}
