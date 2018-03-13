/*
* Given a string, return a string made of the first 2 chars (if present), 
* however include first char only if it is 'o' and include the second 
* only if it is 'z', so "ozymandias" yields "oz".
*/

public String startOz(String str) {
  
  if(str.length()<=1){
  return str;
  }

  if(str.charAt(0)=='o' && str.charAt(1)=='z'){
    return "oz";
    }
    
if(str.charAt(0)!='o' && str.charAt(1)=='z'){
 return "z";
}

if(str.charAt(0)=='o' && str.charAt(1)!='z'){
return "o";
}

 else
return "";
 }
