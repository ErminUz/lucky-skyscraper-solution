package LSS;

public class Main {
    public static void main(String[] args) {
        //System.out.println(LuckySkyScraper.roRealFloor(15));
        for(var floor = 1; floor <= 220; floor++){
            System.out.print("Floor: " + floor);
            var fakeFloor = LuckySkyScraper.roFakeFloor(floor);
            System.out.print(" Fakefloor: " + floor);
            var backToRealFloor = LuckySkyScraper.roRealFloor(fakeFloor);
            System.out.println(" Back to real " + backToRealFloor);
        }
    }
}
