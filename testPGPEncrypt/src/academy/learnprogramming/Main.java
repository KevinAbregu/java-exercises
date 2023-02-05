package academy.learnprogramming;


public class Main {


    public static void main(String[] args) throws Exception {

        PGPFileProcessor pgpFileProcessor = new PGPFileProcessor();
        pgpFileProcessor.encrypt();
        pgpFileProcessor.decrypt();
    }
}
