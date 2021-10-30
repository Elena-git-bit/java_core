package Lesson2;

public class CheckArray {
    public static void checkArray(int a, int b) {
        if (a != 4 || b != 4 ) {
            throw new MyArraySizeException("Массив должен быть 4*4");
        }
        //Array.createRandom2Massive(a,b);




        transferArray(Array.createRandom2Massive(a,b));


// Если я запускаю трансформацию в этом же методе - массив множится ( не смогла разобраться, почему. Сделала в отдельном методе)
    /*    for (int i=0; i<Array.createRandom2Massive(a,b).length; i++ ) {
            for (int j=0; j<Array.createRandom2Massive(a,b)[i].length; j++){
                transferToNumber(Array.createRandom2Massive(a,b)[i][j]);
            }
        }*/
        System.out.println("god");

    }

    public static void transferArray (String [][] arr) {

        for (int i=0; i<arr.length; i++ ) {
            for (int j=0; j<arr[i].length; j++){
                transferToNumber(arr[i][j]);
            }

        }
    }

    static class MyArraySizeException extends IndexOutOfBoundsException {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    static class MyArrayDataException extends NumberFormatException {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    public static int transferToNumber(String s) {
        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            throw new MyArrayDataException("Нельзя преобразовать в число ");
        }
    }
//не считается у меня сумма
    public static int summMass(int myArray[][]) {
        int x = myArray.length;
        int summ = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                summ += myArray[i][j];
            }
        }

        return summ;
    }
}