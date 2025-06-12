#include <stdio.h>

int main(int argc, char const *argv[])
{
    int opcao=0;

    do
    {
        printf("1-Sair\n");
        printf("2-Cadastrar\n");
        printf("3-Excluir\n");
        printf("Opcao: ");
        scanf("%i", &opcao);

        switch(opcao){
            case 1:
            printf("Bye!\n");
            break;
            case 2:
            printf("Vamos inserir!\n");
            break;
            case 3:
            printf("Vamos excluir!\n");
            break;
            default:
            printf("Escolha uma opcao valida!\n");
            break;
        }


    }
    while (opcao != 1);
    
    




    return 0;
}
