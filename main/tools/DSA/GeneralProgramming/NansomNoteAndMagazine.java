package main.tools.DSA.GeneralProgramming;

public class NansomNoteAndMagazine {
    public static void main(String[] args) {
        System.out.println(canConstruct( "ransomNote", "magazine"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0; i< ransomNote.length(); i++){
            if(magazine.contains(ransomNote.substring(i,i+1))){
                int n = magazine.indexOf(ransomNote.substring(i,i+1));
                magazine =magazine.substring(0,n)+magazine.substring(n+1,magazine.length());
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
