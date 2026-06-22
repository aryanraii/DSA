package Strings;

public class RemoveAllOccurrencesofaSubstring_Lc1910 {
    public String removeOccurrences(String s, String part) {
        int n = part.length();
        while(s.length()>0 && s.indexOf(part)!=-1){
               s=s.replaceFirst(part,"");
        }
        return s;
    }
}
