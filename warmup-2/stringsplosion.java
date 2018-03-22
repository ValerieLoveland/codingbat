public String stringSplosion(String str) {
  String newString="";
  for (int i=0;i<=str.length();i++){
    newString = newString + str.substring(0,i);
  }
  return newString;
}
