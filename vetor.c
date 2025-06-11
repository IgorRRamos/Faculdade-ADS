#include    <stdio.h>

int main(int argc, char const *argv[])
{
   float notas[3], media;

   for(int i=0;i<=3;i++)
   {
    printf("Digite a nota: ");
    scanf("%f", &notas[i]);
    media += notas[i];
    if(i == 3){
        media = media / 4;
    }
   }
   printf("A media das notas é: %f\n", media);

    return 0;
}
