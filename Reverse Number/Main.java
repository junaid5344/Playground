#include<iostream>
using namespace std; 
int main()
{
    long  num, reverse = 0, temp, remainder;
 cin>>num;
    temp = num;
    while (num > 0)
    {
        remainder = num % 10;
        reverse = reverse * 10 + remainder;
        num /= 10;
    }
    cout<<reverse;
  return 0;
}