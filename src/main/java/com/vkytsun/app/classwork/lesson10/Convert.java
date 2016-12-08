package com.vkytsun.app.classwork.lesson10;


public class Convert {
    public static void main(String[] args) {
        /*String s = "1,2,3,4,5,6,7,8";
        String [] filteredData = s.split(",");
        String summary = filteredData[2];
        int summaInt = Integer.parseInt(summary);
        System.out.println(summaInt);
        int summar = 3333;
        String sum = String.valueOf(summar);
        System.out.println(sum);
*/

        double a = 'A';
        String AB = String.valueOf(a);
        System.out.println(AB);
        double BA = Double.parseDouble(AB);
        System.out.println(BA);

        long b = '1';
        String ABC = String.valueOf(b);
        System.out.println(ABC);
        long CBA = Long.parseLong(ABC);
        System.out.println(CBA);

        boolean C1 = true;
        String display = String.valueOf(C1);
        System.out.println(display);
        boolean C2 = Boolean.parseBoolean(display);
        System.out.println(C2);

    }
}
