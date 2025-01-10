#include<iostream>
using namespace std;


class c1{

 public:
    int a = 3;
    
    void func(){

        cout << "This is the function of our class";
    }


};
int main(){

cout<<"hello World";

 c1 obj;
 obj.a;
 cout << endl;

 obj.func();
 cout << endl;

    return 0;
}