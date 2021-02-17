package gov.ng.gifmis;

public class Stage2 {
    static String timesTable(int numberTimes, int ww){
        String answer = "";
        for (int i = 1; i <= ww; i++){
            int calculation = numberTimes * i;
            String begin = numberTimes + " x ";
            String endd = " = "+ calculation + "\n";
            answer += begin + i + endd;
        }
        return answer;
    }

    static String timeTable2Fifty(){
        int[] digits = {1,2,3,4,5,6,7,8,9,10,11,12};
        String result = "";
        for (int i = 1; i <= 50; i++){
//            System.out.println("Calculating for "+i+" Times Table");
            for (int j = 0; j < digits.length + 1; j++) {
                int calculation = j * i;
                int begin = j;
                int end = i;
                result += i + " X " + j + " = " + calculation + "\n";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(timeTable2Fifty());
        System.out.println(timesTable(23,3));
    }
}
