#include<iostream>
using namespace std;
int main()
{
  int n,v;
  std::cin>>n;
  v=n%2;
  (v==0)?std::cout<<"Even\n":std::cout<<"Odd\n";
}