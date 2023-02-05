public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount >= 0 && smallCount >= 0 && goal >= 0){
            if((bigCount * 5 + smallCount) >= goal) {
                while(bigCount > 0){
                    if(goal-5 >= 0){
                        goal = goal - 5;
                    }else {
                        break;
                    }
                    bigCount--;
                }
                return (goal <= smallCount);
            }
        }
        return false;
    }
}
