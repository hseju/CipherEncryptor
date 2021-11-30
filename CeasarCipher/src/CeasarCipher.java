public class CeasarCipher {


    public static void main(String [] args){
        int key1 = 8;
        int key2 = 21;

        Encrypt encrypted = new Encrypt();
        EncryptTwo encrypted2 = new EncryptTwo();
        String message = "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
        String encryption= encrypted.encrypt(message, key1);

        System.out.println(encryption);

        String encryption2 = encrypted2.encrypt(message, key1, key2);
        System.out.println(encryption2);

    }
}
