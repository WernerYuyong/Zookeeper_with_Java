
class EnglishAlphabet {
    public static StringBuilder createEnglishAlphabet() {
        StringBuilder englishAlphabet = new StringBuilder();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            englishAlphabet.append(ch).append(ch < 'Z' ? " " : "");
        }
        return englishAlphabet;
    }
}