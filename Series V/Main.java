#include<iostream>
using namespace std;
int main()
{
  int n,i,a=11,x=4,num;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    num=a*a;
    cout<<num<<" ";
    a=a+4;
  }
  return 0;
  
}  
