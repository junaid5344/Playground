#include<iostream>
using namespace std;
int main()
{
  int n,a,b,i,c;
  cin>>n;
  a=121;
  b=11;
  if(n==1)
  {
    cout<<a<<" ";
  }
  else
  {
    cout<<"121"<<" ";
    for(i=2;i<=n;i++)
    {
      b=b+4;
      c=b*b;
      cout<<c<<" ";
    }}}