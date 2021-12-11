public class Decrypt {

    int [] decrypt(String message) {

        StringBuilder decrypt = new StringBuilder(message);
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        int[] counts = new int[26]; //creating an array to hold all characters indexes occurence count

        //loop through the encrypted message character by character
        for (int i = 0; i < decrypt.length(); i++) {

            char ch = Character.toLowerCase(decrypt.charAt(i));
            int index = alpha.indexOf(ch);
            if (index != -1) {
                counts[index] += 1;
            }
        }
        return counts;
    }


       int maxIndex(int [] Counts){
            int max = Counts[0] ;
            for(int k=0; k<Counts.length; k++){

                if(max <Counts[k]){
                    max = k;
                }
            }

            return max;
        }


}
