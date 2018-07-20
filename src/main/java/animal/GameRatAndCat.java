package animal;

import java.io.*;
import java.util.*;
import java.util.Collections;

public class GameRatAndCat {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 10);
        Cat cat1 = new Cat("Tom", 9);
        Cat cat2 = new Cat("Tom", 10);

        Rat rat = new Rat("Jerry", 13, 10);
        Rat rat1 = new Rat("Jerry", 9, 10);
        Rat rat2 = new Rat("Jerry", 9, 10);

        System.out.println(cat.cath(rat));
        cat.eat(rat);

        System.out.println(cat1.cath(rat1));
        cat1.eat(rat1);

        System.out.println(cat2.cath(rat2));
        cat2.eat(rat2);

        System.out.println("------------");

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Heo", 30));
        catList.add(new Cat("Ga", 15));
        catList.add(new Cat("Dog", 3));

        List<Rat> ratList = new ArrayList<>();
        ratList.add(new Rat("Xuka", 20, 10));
        ratList.add(new Rat("Nobita", 15, 12));
        ratList.add(new Rat("Viet Nam", 3, 8));
        ratList.add(new Rat("Viet Nam", 3, 8));

        Scanner scanner = new Scanner(System.in);

        //Tìm kiếm theo tên mèo
        System.out.println("Enter a name cat:");
        String nameCat = scanner.nextLine();
        String findCat = "";
        for (int i = 0; i < catList.size(); i++) {
            if (nameCat.equalsIgnoreCase(catList.get(i).getName())) {
                findCat += catList.get(i).toString();
            }
        }
        System.out.println(findCat);

        //Tìm kiếm theo tên chuột
        System.out.println("Enter a name rat:");
        String nameRat = scanner.nextLine();
        String findRat = "";
        for (int i = 0; i < ratList.size(); i++) {
            if (nameRat.equalsIgnoreCase(ratList.get(i).getName())) {
                findRat += ratList.get(i).toString() + "\n";
            }
        }
        System.out.println(findRat);


        //Sắp xếp và in theo tên mèo
        System.out.println("---------------");
        Collections.sort(catList, new SortTheCatName());
        for (Cat x : catList) {
            System.out.println(x);
        }


        //Sắp xếp và in theo tên chuột
        System.out.println("---------------");
        Collections.sort(ratList, new SortTheRatName());
        for (Rat x : ratList) {
            System.out.println(x);
        }

        System.out.println("----------------");
        //Bắt hết chuột
        String catResult = "";
        for (int i = 0; i < ratList.size(); i++) {
            cat.eat(ratList.get(i));
            catResult += cat.toString() + "\n";
        }

        //phần đọc và ghi file
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./src/main/resources/result_cat_catch_rat.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeUTF(catResult);

            fileOutputStream.close();
            dataOutputStream.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }


        try {
            FileInputStream fileInputStream = new FileInputStream("./src/main/resources/result_cat_catch_rat.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            String resultFileWriter = dataInputStream.readUTF();

            fileInputStream.close();
            dataInputStream.close();

            System.out.println(resultFileWriter);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
