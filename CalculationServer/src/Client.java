import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        while (true) {

            try (DatagramSocket sock = new DatagramSocket()) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("\nEnter numbers in format 'a+b:' ");
                String message = scanner.nextLine();

                if (!message.matches("(\\d{0,9}+\\+\\d{0,9})")){
                    System.out.println("Format is not right, enter again in format 'a+b' ");
                    return;
                }
                if (message.isEmpty()) {
                    System.out.println("No input");
                    return;
                } else if (message.isBlank()) {
                    System.out.println("No input");
                    return;
                } else if (!message.contains("+")) {
                    System.out.println("No adding symbol");
                    return;
                }

                InetAddress ia = InetAddress.getByName("localhost");
                byte[] buff = message.getBytes();

                DatagramPacket p = new DatagramPacket(buff, buff.length, ia, 1081);

                sock.send(p);

                System.out.println("Request sent");

                buff = new byte[256];
                p = new DatagramPacket(buff, buff.length, ia, 1081);
                System.out.println("Wait for result");

                sock.receive(p);

                System.out.print("Result: ");
                System.out.print(new String(p.getData(), 0, p.getLength()));

            } catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        }
    }
}