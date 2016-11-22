package problem;

import java.util.Stack;

/**
 * Created by DZCVT40 on 22.11.2016.
 * "baa"
 "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        int windowSize = s.length();
        while(windowSize>1){
            for(int i = 0;i<(s.length()+1-windowSize);i++){
                String currentSubstring = s.substring(i,i+windowSize);
                if(isPalindrome(currentSubstring.toCharArray())){
                    return currentSubstring;
                }
            }
            windowSize--;
        }
        return Character.toString(s.charAt(0));

    }

    public boolean isPalindrome(char[]s){
        if(s.length==1){
            return true;
        }else if(s.length==2){
            return s[0]==s[1];
        }else if(s.length ==3){
            return s[0]==s[2];
        }
        int startIndex = 0;
        int endIndex = s.length-1;
        while(startIndex<endIndex){
            if(s[startIndex]==s[endIndex]){
                startIndex++;
                endIndex--;
            }else{
                return false;
            }
        }
        return true;
    }
}
