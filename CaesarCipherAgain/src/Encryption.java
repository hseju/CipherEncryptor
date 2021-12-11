public class Encryption {

    String encrypt(String message, int key){
        StringBuilder encryp = new StringBuilder(message);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlpha = alpha.substring(key) + alpha.substring(0,key);

        for(int i=0; i<encryp.length(); i++){
            char ch = encryp.charAt(i);
            if(Character.isLowerCase(ch)){
                char chUpper = Character.toUpperCase(ch);
                int index = alpha.indexOf(chUpper);
                if(index!= -1){
                    char enChar = shiftedAlpha.charAt(index);
                    encryp.setCharAt(i, Character.toLowerCase(enChar));
                }
            }

            int index = alpha.indexOf(ch);
            if(index!= -1){
                char enChar = shiftedAlpha.charAt(index);
                encryp.setCharAt(i, enChar);
            }
        }

        return encryp.toString();

    }
}
