package com.amit.serialization;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = new User();
        user.setId(1);
        user.setName("Mike");
        user.setAddress(new Address(216,"Kodathi","bangalore","india"));
        System.out.println("original user.."+user.toString());
        //Serialization
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("user.txt")));
        out.writeObject(user);
        out.close();
        out.flush();

        //Deserialization
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("user.txt")));
        User deserializedUser = (User)in.readObject();
        System.out.println("deserialized user..."+deserializedUser.toString());
    }
}
