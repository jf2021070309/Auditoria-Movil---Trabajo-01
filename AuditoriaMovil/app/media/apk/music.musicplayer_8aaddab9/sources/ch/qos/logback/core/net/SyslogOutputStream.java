package ch.qos.logback.core.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
/* loaded from: classes.dex */
public class SyslogOutputStream extends OutputStream {
    private static final int MAX_LEN = 1024;
    private InetAddress address;
    private ByteArrayOutputStream baos = new ByteArrayOutputStream();
    private DatagramSocket ds = new DatagramSocket();
    private final int port;

    public SyslogOutputStream(String str, int i2) throws UnknownHostException, SocketException {
        this.address = InetAddress.getByName(str);
        this.port = i2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        DatagramSocket datagramSocket = this.ds;
        if (datagramSocket != null) {
            datagramSocket.close();
        }
        this.address = null;
        this.ds = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        DatagramSocket datagramSocket;
        byte[] byteArray = this.baos.toByteArray();
        DatagramPacket datagramPacket = new DatagramPacket(byteArray, byteArray.length, this.address, this.port);
        if (this.baos.size() > 1024) {
            this.baos = new ByteArrayOutputStream();
        } else {
            this.baos.reset();
        }
        if (byteArray.length == 0 || (datagramSocket = this.ds) == null) {
            return;
        }
        datagramSocket.send(datagramPacket);
    }

    public int getPort() {
        return this.port;
    }

    public int getSendBufferSize() throws SocketException {
        return this.ds.getSendBufferSize();
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        this.baos.write(i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        this.baos.write(bArr, i2, i3);
    }
}
