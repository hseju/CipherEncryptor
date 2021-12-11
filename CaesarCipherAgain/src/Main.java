import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        //input message to be encrypted
        String message = "Welcome aboard to alpha, beta, metaverse day 2050.";
        //creating object for Encryption class
        Encryption  encryption =new Encryption();
        String encryptedMsg = encryption.encrypt(message,17);

        System.out.println(encryptedMsg);//printing out encrypted message

        //Decrypting the encypted message above, firsly creating an object for Decrypt class
        Decrypt decryption = new Decrypt();

        //freqs is an array containing max counts of alphabets
        int [] freqs = decryption.decrypt(encryptedMsg);

        int indexAtMaxAlpha = decryption.maxIndex(freqs);  // to find the index which has the max count

        //4 is assumed based on the most used charater 'e', if the message is not decryted by this then,
        //human/eyeball method can be used available from Decryption Class
        int Dkey = indexAtMaxAlpha -4;
        if(indexAtMaxAlpha<4){
            Dkey = 26-(4-indexAtMaxAlpha);
        }

        String dcryptedMsg = encryption.encrypt(encryptedMsg,26-Dkey);

        System.out.println(dcryptedMsg);
    }
}
