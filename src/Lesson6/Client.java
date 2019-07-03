package Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
    Client client = new Client();
    client.clientStart();
    }
    Socket socket;
    DataInputStream in;
    DataOutputStream out;
    final String IP_ADRESS = "localhost";
    final  int PORT = 8189;

    public void clientStart(){
        try {
            socket = new Socket(IP_ADRESS, PORT);

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);

            Thread outer = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        String strIn = sc.nextLine();
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
                  while (true) {
                      try {
                          String input = in.readUTF();
                          System.out.println(input);


                      } catch (IOException e) {
//                          e.printStackTrace();
                          System.out.println("Server disconect.");
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
        }


        finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

}
