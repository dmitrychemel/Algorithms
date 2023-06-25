package homework6;

public class GoodVersion {
    public static void main(String[] args) {
        boolean[] array = new boolean[]{true,true,true,true,true,true,true};
        int successIndex = firstFailedVersion(array);
        System.out.println(successIndex);
    }

    public static int firstFailedVersion(boolean[] successVersions){

        for (int i = 0; i < successVersions.length; i++) {
            if(successVersions[i] == false){
                return i;
            }
        }
        return -1;
    }
}
