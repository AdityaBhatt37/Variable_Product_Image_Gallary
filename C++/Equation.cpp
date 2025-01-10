#include<iostream>
using namespace std;

int main(){
    
    
    int x = 2,n = 2,fact = 1,i,j,result = 1;
    
    for(i = 1; i<=n; i++){
        
     
     for(j = 1; j<=i; j++){
         
         
         fact = fact*j;
     }  
     
     if(j>1){
         
          result = (x+(x/fact));
     }
        
     
    }   
    
    cout << result;
    
    return 0;
}