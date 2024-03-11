import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {

    public static void main(String[] args) {

        while (true) {

            try (DatagramSocket datagramSocket = new DatagramSocket(1081)) {

                byte[] buffer = new byte[256];


                DatagramPacket p = new DatagramPacket(buffer, buffer.length);
                System.out.println("Awaiting numbers");


                datagramSocket.receive(p);


                String mesajPrimit = new String(p.getData(), 0, p.getLength());
                String[] numere =   mesajPrimit.split("\\+");


                int numar1 = Integer.parseInt(numere[0]);
                int numar2 = Integer.parseInt(numere[1]);

                String result = String.valueOf(Sum(numar1, numar2));
                buffer = result.getBytes();

                p = new DatagramPacket(buffer, buffer.length, p.getAddress(), p.getPort());

                datagramSocket.send(p);

                System.out.println("Result = " + result);
                System.out.println("Result sent");
            } catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        }
    }

    public static int Sum (int a, int b)
    {
        return a+b;
    }

}