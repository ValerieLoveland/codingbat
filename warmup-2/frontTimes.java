/*
* Given a string and a non-negative int n, we'll say that the front of the string 
* is the first 3 chars, or whatever is there if the string is less than length 3. 
* Return n copies of the front;
*/


public String frontTimes(String str, int n) {
 String smol="";
 String result="";
 if(n==0){
   return "";
 }
 
 if (str.length()<=2){
    //String smol= str;
    for (int i=0;i<n;i++){
    smol=smol+str;
    }
    return smol;
  }
  
  str= str.substring(0,3);
  for(int i=0;i<n; i++){
  result=result+str;    
  }
  
  return result;

  
}


