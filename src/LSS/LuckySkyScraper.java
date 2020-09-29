package LSS;

public class LuckySkyScraper {

    static public void floorList(int totalRealFloors){
        //loop through real floor numbers
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= totalRealFloors; realFloor++){
            System.out.println("realFloorNo: " + realFloor + " fakeFloorNo: " + fakeFloor);
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);

        }
    }
}
