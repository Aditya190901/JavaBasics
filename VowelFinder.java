// Find vowels from String

public class VowelFinder {
    public static void main(String[] args) {
        String str = "dfghje";

        str = str.toLowerCase();
        char [] ch = str.toCharArray();
        int l = ch.length;
        boolean foundVowel = false;
        for(int i=0;i<l;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                System.out.println("Yes");
                foundVowel = true;
                break;
            }
        }

        if(!foundVowel){
            System.out.println("No");
        }
        
    }
}
