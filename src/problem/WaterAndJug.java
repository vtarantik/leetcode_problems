package problem;

/**
 * Created by DZCVT40 on 27.6.2016.
 */
public class WaterAndJug {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x < 0 || y < 0 || x + y < z||(x==0&&y!=z&&z!=0)||(y==0&&(x!=z&&z!=0))) {
            return false;
        }

        int bigger = x >= y ? x : y;
        int smaller = x <= y ? x : y;
        if (smaller + smaller == z) {
            return true;
        }
        if ((bigger - smaller + smaller) == z) {
            return true;
        }
        if ((bigger - smaller) <= smaller && (bigger - smaller + bigger == z)) {
            return true;
        }


        int biggerModulo = bigger % smaller;
        if (biggerModulo <= smaller) {
            if (biggerModulo + bigger == z) {
                return true;
            }
        }
        if (smaller + (smaller - (biggerModulo - smaller)) == z || biggerModulo - (smaller - (biggerModulo - smaller)) == z || smaller == z || biggerModulo == z || smaller + biggerModulo == z || biggerModulo + (biggerModulo - smaller) == z || smaller + (smaller - biggerModulo) == z || smaller + biggerModulo == z) {
            return true;
        }




        int multiplicator = 1;
        int result;
        boolean done = true;
        while (done) {
            result = bigger - multiplicator * (bigger - smaller);
            if (result == z||result+smaller==z) {
                return true;
            }else if(result == 0){
                return false;
            } else if (result < 0) {
                bigger = smaller-result;
                multiplicator=1;
            } else {
                multiplicator++;
            }
        }


        return false;
    }

}
