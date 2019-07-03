package Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Sever {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;

        DataInputStream in;
        DataOutputStream out;

        try {
            server =  new ServerSocket(8189);
            System.out.println("Start sever!");
            socket = server.accept();
            System.out.println("Join client");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);

            Thread outer = new Thread(new Runnable() {
                @Override
                public void run() {
//                    Scanner sc = new Scanner(System.in);
                    while (true){
                        String strIn = sc.nextLine();
//                        System.out.println(strIn);
                        try {
                            out.writeUTF(strIn);
                        } catch (IOException e) {
                            System.out.println("Disconect.");
                            break;
//                            e.printStackTrace();
                        }
                    }
                }
            });

            Thread inner = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        try {
                            String input = in.readUTF();
                            System.out.println(input);
                        } catch (IOException e) {
//                            e.printStackTrace();
                            System.out.println("Client disconect.");
                            break;
                        }
                    }

                }
            });
            outer.start();
            inner.start();

            try {
                outer.join();
                inner.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {

            }
        }
    }
}
