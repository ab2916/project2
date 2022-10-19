import java.util.ArrayList;
public class Park {
    private Animals [] animal = new Animals[1000];
    private int numOfAnimals;

    public Park()
    {
        this.numOfAnimals = 0;
    }

    public void addAnimals(Animals animals)
    {
        animal[numOfAnimals] = animals;
        numOfAnimals++;
    }

    public ArrayList<Animals> getList()
    {
        ArrayList<Animals> list = new ArrayList<Animals>();
        for(int i = 0; i < numOfAnimals; i++)
        {
            if(animal[i].getAge() > 10 && animal[i].isTorefAl())
            {
                list.add(animal[i]);
            }
        }
        return list;
    }

    public int predatoryBirds()
    {
        int num = 0;
        for(int i = 0; i < numOfAnimals; i++)
        {
            if(animal[i] instanceof Reptile || animal[i] instanceof Bird)
            {
                if(animal[i].isTorefAl())
                {
                    num++;
                }
            }
        }
        return num;
    }
}
