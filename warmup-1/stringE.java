/*
* Return true if the given string contains between 1 and 3 'e' chars.
*/

public boolean stringE(String str) {
  char charToDetect='e';
  int count =0;
    
  for(int i=0; i<str.length(); i++){
  if (str.charAt(i)==charToDetect){
   count ++;
  }
  }
      
  if(count<=3 && count>0){
return true;
   
  }
  else
  return false;
}
