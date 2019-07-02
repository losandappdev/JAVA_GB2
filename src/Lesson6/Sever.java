package Lesson6;

import com.sun.corba.se.spi.activation.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Sever {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;

        try {
            server =  new ServerSocket(8083);
            System.out.println("Start sever!");
            socket = server.accept();
            System.out.println("Join client");

            Scanner sc = new Scanner(socket.getInputStream());

            while (true){
                String str = sc.nextLine();
                System.out.println(str);
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
