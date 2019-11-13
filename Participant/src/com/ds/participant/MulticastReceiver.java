package com.ds.participant;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
public class MulticastReceiver extends Thread {
    protected MulticastSocket socket = null;
    protected byte[] buf = new byte[256];
 
    public void run() {
        try {
			socket = new MulticastSocket(4446);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        InetAddress group;
		try {
			group = InetAddress.getByName("230.0.0.0");
		
			socket.joinGroup(group);
		
        while (true) {
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
           
            String received = new String(
              packet.getData(), 0, packet.getLength());
            //if ("end".equals(received)) {
                break;
            //}
        }
        //socket.leaveGroup(group);
		}
        catch(Exception e)
		{
        	
		}
        //socket.close();
    }
}
