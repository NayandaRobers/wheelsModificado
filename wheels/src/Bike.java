
public class Bike {
    protected static Bike[] bikeList = new Bike[5];

    protected int deposit = 0;
    protected int rate = 0;
    protected int bikeNumber = 0;

    static {
        int j = 0;
        for(int i = 10; i < 15; i++){
            Bike b = new Bike(i, i, (j*100));
            bikeList[j] = b;
            j++;
        }
    }

    public Bike(int dep, int rat, int num){
        deposit = dep;
        rate = rat;
        bikeNumber = num;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getRate() {
        return rate;
    }

    public int getBikeNumber() {
        return bikeNumber;
    }

    public static Bike findBikeByNumber(int bikeNum){
        int numberOfBikes = bikeList.length;

        for(int i =0;i<numberOfBikes;i++){
            if(bikeList[i].getBikeNumber() == bikeNum){
                System.out.println("Bike with number ´" + bikeNum + "´ found" + "\n");
                return bikeList[i];
            }
        }
        System.out.println("Bike with number´" + bikeNum + "´not found" + "\n");
        return null;
    }

    public void showDetails(){
        System.out.println("Details for bike number ´" + bikeNumber + "´");
        System.out.println("DEPOSIT:" + deposit);
        System.out.println("RATE: " + rate + "\n");
    }

    public int calculateCost(int numberOfDays){
        return deposit + (rate * numberOfDays);
    }
}

