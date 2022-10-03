public class Pratik {

    public static void main(String[] args) {
        int[] mainArray = {5,5,9,8,6,6,8,6,6,7,8,7};
        int[] repeaters = new int[4];
        int counter = 0;
        for (int i : mainArray) {
            if(findFrq(i, mainArray)>1 && !isInArray(i, repeaters)){
                repeaters[counter] = i;
                counter++;
            }
        }
        for (int i = 0; i < repeaters.length; i++) {
            System.out.println(repeaters[i] + " , " + findFrq(repeaters[i], mainArray) + " kere tekrarladı");
        }
    }
    public static int findFrq(int i, int[] array){
        int freq = 0;
        for (int j : array) {
            if(i==j){
                freq++;

            }
        }
        return freq;
    }
    public static boolean isInArray(int i, int[] array){
        for (int j : array) {
            if(i==j){
                return true;
            }
        }
        return false;
    }
}
