/*
* Given three int values, a b c, return the largest.
*/

public int intMax(int a, int b, int c) {
  if(a>b&& a>c){
    return a;
  }
  else if(b>c&&b>a){
  return b;
}
else
return c;
}