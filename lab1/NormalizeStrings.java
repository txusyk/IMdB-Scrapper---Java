package lab1;

/**
 * Created by Josu on 03/10/2016.
 */
public class NormalizeStrings extends Thread {

        // Constructor, getter & setter
/*
    pWord = pWord.replaceAll("Ã¤", "a");
    pWord = pWord.replaceAll("Ã«", "e");
    pWord = pWord.replaceAll("Ã¯", "i");
    pWord = pWord.replaceAll("Ã¶", "o");
    pWord = pWord.replaceAll("Ã¼", "u");
    pWord = pWord.replaceAll("Ã„", "A");
    pWord = pWord.replaceAll("Ã‹", "E");
    pWord = pWord.replaceAll("Ã�", "I");
    pWord = pWord.replaceAll("Ã–", "O");
    pWord = pWord.replaceAll("Ãœ", "U");
    pWord = pWord.replaceAll("Ã§", "c");
    pWord = pWord.replaceAll("Ã ", "a");
    pWord = pWord.replaceAll("Ã¨", "e");
    pWord = pWord.replaceAll("Ã¬", "i");
    pWord = pWord.replaceAll("Ã²", "o");
    pWord = pWord.replaceAll("Ã¹", "u");
    pWord = pWord.replaceAll("Ã€", "A");
    pWord = pWord.replaceAll("Ãˆ", "E");
    pWord = pWord.replaceAll("ÃŒ", "I");
    pWord = pWord.replaceAll("Ã’", "O");
    pWord = pWord.replaceAll("Ã™", "U");
    pWord = pWord.replaceAll("Ã§", "c");
    pWord = pWord.replaceAll("Ã‡", "C");
    pWord = pWord.replaceAll("�", "A");*/

    private static NormalizeStrings myNormalizeString;

    public static NormalizeStrings getMyNormalizeString(){
        if (myNormalizeString == null){
            myNormalizeString = new NormalizeStrings();
        }
        return myNormalizeString;
    }

        public void run(String[] pLine) {

            for (int i = 0; i < pLine.length; i++) {
                this.waitXseconds(pLine[i].length());
                if (pLine[i].contains("Ã¡")) {
                    pLine[i].replaceAll("Ã¡", "a");
                }else if (pLine[i].contains("Ã©")) {
                    pLine[i].replaceAll("Ã©", "e");
                }else if (pLine[i].contains("Ã­")) {
                    pLine[i].replaceAll("Ã­", "i");
                }else if (pLine[i].contains("Ã³")) {
                    pLine[i].replaceAll("Ã³", "o");
                }else if (pLine[i].contains("Ãº")) {
                    pLine[i].replaceAll("Ãº", "u");
                }else if (pLine[i].contains("Ã�")) {
                    pLine[i].replaceAll("Ã�", "A");
                }else if (pLine[i].contains("Ã‰")) {
                    pLine[i].replaceAll("Ã‰", "E");
                }else if (pLine[i].contains("Ã�")) {
                    pLine[i].replaceAll("Ã�", "I");
                }else if (pLine[i].contains("Ã“")) {
                    pLine[i].replaceAll("Ã“", "O");
                }else if (pLine[i].contains("Ãš")) {
                    pLine[i].replaceAll("Ãš", "U");
                }
            }
        }

        private void waitXseconds(int segundos) {
            try {
                Thread.sleep(segundos * 1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

    }

