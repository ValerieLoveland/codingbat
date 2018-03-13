/*
* Given two non-negative int values, return true if they have the same last digit, 
* such as with 27 and 57. Note that the % "mod" operator computes remainders, 
* so 17 % 10 is 7.
*/

public boolean lastDigit(int a, int b) {
  if(b>=110){
    if ((a-100)%10==b){
      return true;
    }
  }
  
    if((a%10)==b){
    return true;
  }
  
  if((b%10)==a){
    return true;
  }
  
  else{
  return false;
  }
}
