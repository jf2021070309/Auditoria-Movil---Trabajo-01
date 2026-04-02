package bo.app;

import com.braze.support.BrazeLogger;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final class o5 extends SSLSocketFactory {
    public static final a b = new a(null);
    private SSLSocketFactory a;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.b = list;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Enabling SSL protocols: " + this.b;
        }
    }

    public o5() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        com.amazon.aps.iva.yb0.j.e(socketFactory, "sslContext.socketFactory");
        this.a = socketFactory;
    }

    private final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            com.amazon.aps.iva.yb0.j.e(supportedProtocols, "socket.supportedProtocols");
            for (String str : supportedProtocols) {
                if (!com.amazon.aps.iva.yb0.j.a(str, "SSLv3")) {
                    com.amazon.aps.iva.yb0.j.e(str, "protocol");
                    arrayList.add(str);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(arrayList), 2, (Object) null);
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        Socket createSocket = this.a.createSocket();
        com.amazon.aps.iva.yb0.j.e(createSocket, "internalSSLSocketFactory.createSocket()");
        return a(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.a.getDefaultCipherSuites();
        com.amazon.aps.iva.yb0.j.e(defaultCipherSuites, "internalSSLSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.a.getSupportedCipherSuites();
        com.amazon.aps.iva.yb0.j.e(supportedCipherSuites, "internalSSLSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        com.amazon.aps.iva.yb0.j.f(socket, "socket");
        com.amazon.aps.iva.yb0.j.f(str, "host");
        Socket createSocket = this.a.createSocket(socket, str, i, z);
        com.amazon.aps.iva.yb0.j.e(createSocket, "internalSSLSocketFactory…t, host, port, autoClose)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        com.amazon.aps.iva.yb0.j.f(str, "host");
        Socket createSocket = this.a.createSocket(str, i);
        com.amazon.aps.iva.yb0.j.e(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        com.amazon.aps.iva.yb0.j.f(str, "host");
        com.amazon.aps.iva.yb0.j.f(inetAddress, "localHost");
        Socket createSocket = this.a.createSocket(str, i, inetAddress, i2);
        com.amazon.aps.iva.yb0.j.e(createSocket, "internalSSLSocketFactory…rt, localHost, localPort)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        com.amazon.aps.iva.yb0.j.f(inetAddress, "host");
        Socket createSocket = this.a.createSocket(inetAddress, i);
        com.amazon.aps.iva.yb0.j.e(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        com.amazon.aps.iva.yb0.j.f(inetAddress, "address");
        com.amazon.aps.iva.yb0.j.f(inetAddress2, "localAddress");
        Socket createSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
        com.amazon.aps.iva.yb0.j.e(createSocket, "internalSSLSocketFactory… localAddress, localPort)");
        return a(createSocket);
    }
}
