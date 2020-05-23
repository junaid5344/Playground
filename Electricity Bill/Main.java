#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a;
  if(a<=200)
  { c=a*0.5;
  cout<<"Rs."<<c;}
  
  else if(a<=400)
  {
    d=((a*0.65)+100);
      cout<<"Rs."<<d;}
 else if(a<=600)
  {
    int e=((a*0.80)+200);
      cout<<"Rs."<<e;}
  
  else if(a>=600)
  {
    int f=((a*1.25)+425);
    cout<<"Rs."<<f;}
}
  
