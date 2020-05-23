#include<iostream>
using namespace std;
int main()
{
  int w,x,y,p,q,r;
  std::cin>>w;
  std::cin>>x;
  std::cin>>y;
  p=w*x;
  q=w*y;
  r=(p-q)-100;
  std::cout<<r;
}