public String stringBits(String str) {
  String newStr = "";
   if (str.length()>=0){
  for (int i=0; i<str.length(); i+=2){
  newStr = newStr + str.charAt(i);}}

return newStr;}
