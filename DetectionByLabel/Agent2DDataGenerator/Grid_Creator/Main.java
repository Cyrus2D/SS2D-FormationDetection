import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int counter = 0;
        int[] a = new int[27];
        File file = new File("/home/arshia/Arshia/2D/TensorFlowTrain-master/Keras/Classification/Data");
        Scanner scanner =  new Scanner(file);
        while(scanner.hasNext()) {
            //resetting the grid vectors
            for (int i = 0; i < 25; i++) {
                a[i] = 0;
            }

            String temp = scanner.nextLine();
            String[] tempstr =  new String[26];
            double[] tempdbl = new double[25];

            //making the vector
            tempstr = temp.split(" ");
            for (int i = 1; i < 26; i++) {
                tempdbl[i - 1] = Double.parseDouble(tempstr[i]);
            }
            for (int i = 5; i < 24; i += 2) {
                if(tempdbl[i] < -17) {
                    if(tempdbl[i - 1] < -104 / 3) {
                        a[0]++;
                    }
                    else if(-104 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < -52 / 3) {
                        a[1]++;
                    }
                    else if(-52 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < 0) {
                        a[2]++;
                    }
                    else if(0 < tempdbl[i - 1] && tempdbl[i - 1] < 52 /3) {
                        a[3]++;
                    }
                    else if(52 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < 104 / 3) {
                        a[4]++;
                    }
                    else {
                        a[5]++;
                    }
                }
                else if(tempdbl[i] > -17 && tempdbl[i] < 0) {
                    if(tempdbl[i - 1] < -104 / 3) {
                        a[6]++;
                    }
                    else if(-104 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < -52 / 3) {
                        a[7]++;
                    }
                    else if(-52 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < 0) {
                        a[8]++;
                    }
                    else if(0 < tempdbl[i - 1] && tempdbl[i - 1] < 52 /3) {
                        a[9]++;
                    }
                    else if(52 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < 104 / 3) {
                        a[10]++;
                    }
                    else {
                        a[11]++;
                    }
                }
                else if(tempdbl[i] < 0 && tempdbl[i] < 17) {
                    if(tempdbl[i - 1] < -104 / 3) {
                        a[12]++;
                    }
                    else if(-104 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < -52 / 3) {
                        a[13]++;
                    }
                    else if(-52 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < 0) {
                        a[14]++;
                    }
                    else if(0 < tempdbl[i - 1] && tempdbl[i - 1] < 52 /3) {
                        a[15]++;
                    }
                    else if(52 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < 104 / 3) {
                        a[16]++;
                    }
                    else {
                        a[17]++;
                    }
                }
                else {
                    if(tempdbl[i - 1] < -104 / 3) {
                        a[18]++;
                    }
                    else if(-104 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < -52 / 3) {
                        a[19]++;
                    }
                    else if(-52 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < 0) {
                        a[20]++;
                    }
                    else if(0 < tempdbl[i - 1] && tempdbl[i - 1] < 52 /3) {
                        a[21]++;
                    }
                    else if(52 / 3 < tempdbl[i - 1] && tempdbl[i - 1] < 104 / 3) {
                        a[22]++;
                    }
                    else {
                        a[23]++;
                    }
                }
            }
            a[24] = (int) tempdbl[0];
            a[25] = (int) tempdbl[1];
            a[26] = (int) Double.parseDouble(tempstr[25]);

            //making the data
            System.out.print("&& ");
            for (int i = 0; i < 27; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
