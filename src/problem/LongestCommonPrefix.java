package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DZCVT40 on 13.7.2016.
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String shortest = strs[0];
        for (int i =1; i<strs.length;i++){
            if(strs[i].length()<shortest.length()){
                shortest = strs[i];
            }
        }
        boolean inAll = true;
        for (int j = shortest.length();j>0;j--){
            String prefix = shortest.substring(0,j);
            for(int k = 0;k<strs.length;k++){
                    if(!strs[k].startsWith(prefix)){
                        inAll = false;
                        break;
                    }

            }
            if(inAll){
                return prefix;
            }else{
                inAll = true;
            }

        }
        return "";
    }
}
