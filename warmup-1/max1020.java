/*
* Given 2 positive int values, return the larger value that is in the range 10..20 
* inclusive, or return 0 if neither is in that range.
*/

public int max1020(int a, int b) { 
  if ((a>20 && b>20)||(a<10)&&(b<10)){
    return 0;
  }
  
  if ((a>20 && b<10)||(a<10)&&(b>20)){
    return 0;
  }
 
 if ((a>20)||(a<10)){
   return b;
 }
  
   if ((b>20)||(b<10)){
   return a;
 }
 
  if (b>a){
    return b;
  }
  
  if((a<=20) && (a>=10) || ((b<=20) && (b>=10)) && (a>b)){
    return a;
  }
 
  if((a<=20) && (a>=10) || ((b<=20) && (b>=10)) && (a<b)){
    return b;
  }
  
  else 
  return 0;
}
