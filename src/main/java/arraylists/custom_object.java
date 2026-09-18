package arraylists;

import java.util.ArrayList;

public class custom_object {
    static class student{
        String name;
        int age;

        public student(String name,int age) //student kiyana object eka return karanawa
        {
            this.name=name;
            this.age=age;
        }
    }

    public static void main(String[] args) {
        ArrayList<student> abc=new ArrayList<>();

        abc.add(new student("kamal",33));
    }
}
