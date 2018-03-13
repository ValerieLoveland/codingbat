/*
* Given a string, return a new string where the first and last chars have been exchanged.
*/

public String frontBack(String str) {
  
  if (str.length()<=1){
   return str;
  }
  
 else{
String first = str.substring(0,1);
String last =  str.substring(str.length()-1);
String middle = str.substring(1, str.length()-1);
return last+ middle + first;
 }
 }
