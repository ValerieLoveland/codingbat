/*
* Given 2 int values, return true if they are both in the range 30..40 
* inclusive, or they are both in the range 40..50 inclusive.
*/

public boolean in3050(int a, int b) {
  if((a<=50) && (a>=40) && (b<=50) && (b>=40) || (a<=40) && (a>=30) && (b<=40) && (b>=30)){
  return true;
}
else
return false;
}
