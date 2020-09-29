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

    static public int roRealFloor(int fakeFloorGoal){
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= fakeFloorGoal; realFloor++){
            if(fakeFloorGoal == fakeFloor){
                return realFloor;
            }do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        return -1;
    }

    static public int roFakeFloor(int realFloorGoal){
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor < realFloorGoal; realFloor++){
            /*
            if(realFloorGoal == fakeFloor){
                return fakeFloor;
            }
            */
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        return fakeFloor;
        //return -1;
    }
}
