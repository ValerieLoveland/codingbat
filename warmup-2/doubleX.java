boolean doubleX(String str) {
  int howLong=str.length();
  int i=str.indexOf("x");
  
  if (i ==-1){
  return false;}
  
  int j=str.indexOf("xx");
  
  if (j ==-1){
  return false;}
  
  
     if ((str.substring(i+1).equals("x")) && (!str.substring(i+1).equals("x"))){
       return false;
     }
  
   
   if (str.substring(i+1, i+2).equals("x"));
   return str.substring(i+1, i+2).equals("x"); 
}
