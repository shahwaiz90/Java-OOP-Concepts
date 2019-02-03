package parent;

import child.ChildA;
import child.ChildB;
import child.ChildC;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList<ParentClass> arrayList = new ArrayList<>();
        arrayList.add(new ChildA());
        arrayList.add(new ChildB());
        arrayList.add(new ChildC());

        //Deciding on RunTime which function to call
        for (ParentClass parentClass : arrayList) {
            System.out.println("Classes Names: " + parentClass.printClass());
        }


    }
}
