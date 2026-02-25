#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int N;
    int total;
    
    scanf("%d",&N);
    int Ai[100];
    for (int i = 0; i < N ;i++) {
        scanf("%d",&Ai[i]);
    }
    
    int maks = 0;
    for (int i=0;i < N;i++) {
        for (int j = i +1 ; j < N; j++){
            total = Ai[i] + Ai[j];
            
            if (total > maks){
            maks = total;
        }
        }
    }
    
    printf("%d",maks);  
    return 0;
}