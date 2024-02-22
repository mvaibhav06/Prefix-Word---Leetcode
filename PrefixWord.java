public class PrefixWord {
    public static int findPrefixWord(String sentence, String searchWord){
        String[] input = sentence.split(" ");
        for (int i=0; i<input.length; i++){
            if (input[i].contains(searchWord)){
                String temp = input[i].substring(0, searchWord.length());
                if (temp.equals(searchWord)) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String sentence = "hellohello hellohellohello";
        System.out.println(findPrefixWord(sentence, "ell"));
    }
}
