package com.zipoapps.premiumhelper.toto;

import h.o.c.j;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes2.dex */
public final class Tls12SocketFactory extends SSLSocketFactory {
    private final String[] TLS_V12_ONLY;
    private final SSLSocketFactory delegate;

    public Tls12SocketFactory(SSLSocketFactory sSLSocketFactory) {
        j.e(sSLSocketFactory, "delegate");
        this.delegate = sSLSocketFactory;
        this.TLS_V12_ONLY = new String[]{"TLSv1.2"};
    }

    private final Socket patch(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(this.TLS_V12_ONLY);
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2) {
        Socket createSocket = this.delegate.createSocket(str, i2);
        j.d(createSocket, "delegate.createSocket(host, port)");
        return patch(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        Socket createSocket = this.delegate.createSocket(str, i2, inetAddress, i3);
        j.d(createSocket, "delegate.createSocket(ho…rt, localHost, localPort)");
        return patch(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2) {
        Socket createSocket = this.delegate.createSocket(inetAddress, i2);
        j.d(createSocket, "delegate.createSocket(host, port)");
        return patch(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        Socket createSocket = this.delegate.createSocket(inetAddress, i2, inetAddress2, i3);
        j.d(createSocket, "delegate.createSocket(ad… localAddress, localPort)");
        return patch(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i2, boolean z) {
        Socket createSocket = this.delegate.createSocket(socket, str, i2, z);
        j.d(createSocket, "delegate.createSocket(s, host, port, autoClose)");
        return patch(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.delegate.getDefaultCipherSuites();
        j.d(defaultCipherSuites, "delegate.defaultCipherSuites");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.delegate.getSupportedCipherSuites();
        j.d(supportedCipherSuites, "delegate.supportedCipherSuites");
        return supportedCipherSuites;
    }
}
