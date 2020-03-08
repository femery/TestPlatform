package Backtracking.t401;

import java.util.ArrayList;
import java.util.List;

public class t401 {
    public static void main(String[] args) {
        // && (s.equals("false") == false)
        t401 t=new t401();
        List<String> list=t.readBinaryWatch(2);
        int i=0;
        for(String s:list){
            if(i%5==0){
                System.out.println();
            }
            System.out.print(s+"  ");
            i++;
        }


    }
    public List<String> readBinaryWatch(int num) {

        List<String> list = new ArrayList<>();
        int[] res = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        readBinary(res, 0, list, num);
        return list;
    }

    public void readBinary(int[] res, int n, List<String> list, int num) {
        if (n == num) {
            String s = numToStr(res, num);

            if ((!list.contains(s))) {
                list.add(s);
            }
            return;
        }

        for (int i = 0; i < res.length; i++) {

            if (!check(res, i)) {
                continue;
            }
            res[i] = 1;
            readBinary(res, n + 1, list, num);
            res[i] = 0;

        }


    }

    public String numToStr(int[] res, int num) {
        int h = 0;
        int min = 0;

        for (int i = 0; i < 4; i++) {
            if (res[i] != 0) {
                h = (int) Math.pow(2, i) + h;
            }
        }

        for (int j = 4; j < res.length; j++) {
            if (res[j] != 0) {
                min = (int) Math.pow(2, (j - 4)) + min;
            }
        }

        if (min < 10) {
            String res1 = "" + h + ":0" + min;
            return res1;
        } else {
            String res2 = "" + h + ":" + min;
            return res2;
        }

    }

    public boolean check(int[] res, int a) {
        if (res[a] == 1) {
            return false;
        }
        int[] res2 = res.clone();

        res2[a] = 1;
        int h = 0;
        int min = 0;
        for (int i = 0; i < 4; i++) {
            if (res2[i] != 0) {
                h = (int) Math.pow(2, i) + h;
            }
            if (h > 11) {
                return false;
            }
        }

        for (int j = 4; j < res2.length; j++) {
            if (res2[j] != 0) {
                min = (int) Math.pow(2, (j - 4)) + min;
            }
            if (min > 59) {
                return false;
            }
        }

        return true;

    }
}