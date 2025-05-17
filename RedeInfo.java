import java.net.*;
import java.util.*;

public class RedeInfo {
    public static void main(String[] args) {
        try {
            // Obtendo o endereço IP local
            InetAddress ipLocal = InetAddress.getLocalHost();
            System.out.println("Endereço IP local: " + ipLocal.getHostAddress());

            // Listando as interfaces de rede disponíveis
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();
                
                System.out.println("\nInterface: " + networkInterface.getName());
                System.out.println("Endereço MAC: " + Arrays.toString(networkInterface.getHardwareAddress()));
                
                // Exibindo as informações de IP para cada interface
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    System.out.println("Endereço IP: " + inetAddress.getHostAddress());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
