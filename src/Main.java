public class Main {
    public static void main(String[] args)
    {
    }

    public static double kal(Animals[] animals)
    {
        double sumOfKal = 0;
        for(int i = 0; i < animals.length; i++)
        {
            sumOfKal += animals[i].getKaloriot();
        }
        return sumOfKal;
    }

    public static void playSingFunc(Animals[] animals)
    {

        for(int i = 0; i < animals.length; i++)
        {
            if(animals[i] instanceof Bird)
            {
                ((Bird) animals[i]).Sing();
            }
        }
    }

    public static void playDanceFunc(Animals[] animals)
    {

        for(int i = 0; i < animals.length; i++)
        {
            if(animals[i] instanceof Bird)
            {
                ((Bird) animals[i]).Dance();
            }
            else if(animals[i] instanceof Snake)
            {
                ((Snake) animals[i]).Dance();
            }
        }
    }

    public static String highestFat(Animals[] animals)
    {
        int index = 0;
        int fatPerc = 0;
        for(int i = 0; i < animals.length; i++)
        {
            if(animals[i] instanceof Hipo)
            {
                if(((Hipo) animals[i]).getFatPerc() > fatPerc)
                {
                    fatPerc =((Hipo) animals[i]).getFatPerc();
                    index = i;
                }
            }
        }
        return ((Hipo) animals[index]).getName();
    }
}
