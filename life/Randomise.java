package life;

/**
 * A class that defines parameters
 * that depend on a random number.
 */
class Randomise {
    protected static int random(Integer min, Integer max){
        double range = Math.abs(max - min);
        double result = (Math.random() * range) + (min <= max ? min : max);
        return (int) result;
    }

    public static int getTemperament(){
        int i = random(0 , 4000);
        if (i <= 1000) return Constants.CHOLERIC;
        else if ((i > 1000) && (i <= 2000)) return Constants.PHLEGMATIC;
        else if ((i > 2000) && (i <= 3000)) return Constants.SANGUINE;
        else return Constants.MELANCHOLIC;
    }

    public static int getGender(){
        int i = random(0 , 20000);
        if (i < 10000) return Constants.MALE;
        else return Constants.FEMALE;
    }

    public static double getDouble(){
        return Math.random();
    }

    public static int getDigit(){
        return (int) (Math.random() * 10);
    }

    public static boolean getProbabilityDeath(int age){
        int i = random(1,50000);
        return i > 10000 && i < (10100) + (age * 10);
    }
}
