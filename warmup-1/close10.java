/*
* Given 2 int values, return whichever value is nearest to the value 10, 
* or return 0 in the event of a tie. Note that Math.abs(n) returns 
* the absolute value of a number.
*/

public int close10(int a, int b) {
  
  if (a==b){
  return 0;
}
 if(Math.abs(a-10) == Math.abs(b-10)){
    return 0;
  }

 if(10 - Math.abs(a) > 10- Math.abs(b)){
    return a;
  }

  if(10 - Math.abs(a) < 10 - Math.abs(b)){
    return b;
  }

  else 
  return 0;
}
