#include<iostream>
using namespace std;
int main()
{
int a,b,c,l,m,n,x,y,z;
cin>>a>>b>>c>>l>>m>>n>>x>>y>>z;
  int d1,t1,d2,t2,d3,t3;
 d1=(a*b)/100;
 t1= a-d1+c;
 d2=(l*m)/100;
 t2= l-d2+n;
d3= (x*y)/100;
t3= x-d3+z;
cout<<"In Flipkart Rs."<<t1<<"\n";
 cout<<"In Snapdeal Rs."<<t2<<"\n";
cout<<"In Amazon Rs."<<t3<<"\n";
if(t1<=t2 && t1<=t3)
{
cout<<"He will prefer Flipkart";
}
else if(t2<=t3 && t2<=t1)
{
cout<<"He will prefer Snapdeal";
}
else
{
cout<<"He will prefer Amazon";
}
}  
  

