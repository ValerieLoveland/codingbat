/* 
* Given a string, if the string "del" appears starting at index 1, return a string 
* where that "del" has been deleted. Otherwise, return the string unchanged.
*/

public String delDel(String str) {
  if (str.length()<=2){
    return str;
  }
  if ((str.charAt(1) == 'd') && (str.charAt(2) == 'e') && (str.charAt(3) == 'l')){
  str= str.replace("del", "");
  return str;
  }
  
  else{
    return str;
  }
}
