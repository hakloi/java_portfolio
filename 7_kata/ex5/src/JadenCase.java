public class JadenCase {
    public static void main(String[] args)
    {
        String phrase = "How can mirrors be real if our eyes aren't real";
        if (phrase != null && !phrase.isEmpty()){
            String[] words = phrase.split("\\s");
            StringBuilder sb = new StringBuilder();
       
            for (String s: words){
                if (!s.equals("")){
                      sb.append(Character.toUpperCase(s.charAt(0)));
                      sb.append(s.substring(1));
                }
                  sb.append(" ");
              }
      
              System.out.print(sb.toString().trim()); 
          } else{
            System.out.print("null"); 
          }
              
          }
    }