package problem;

/**
 * Created by DZCVT40 on 14.7.2016.
 */
public class StringToInteger {
    public int myAtoi(String str) {
        String trimmed = str.trim();
        if(trimmed.length()==0){
            return 0;
        }
        boolean negative  = trimmed.charAt(0)=='-'?true:false;
        int pointer = negative?1:trimmed.charAt(0)=='+'?1:0;
        String result = "";
        int minLength = negative?2:1;
        while(pointer <trimmed.length()&&trimmed.length()>=minLength&&Character.isDigit(trimmed.charAt(pointer))){
            result+=trimmed.charAt(pointer);
            pointer++;
        }
        if(result.length()==0){
            return 0;
        }
        int res = 0;
        try{
            res = Integer.parseInt(result);
        }catch (NumberFormatException ex){
            return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
        return negative?res*-1:res;
    }
}
