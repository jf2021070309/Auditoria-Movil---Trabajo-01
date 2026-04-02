package d.a.a.b.b.a;

import ch.qos.logback.core.net.server.ServerSocketListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/* loaded from: classes.dex */
public class b extends ServerSocketListener<a> {
    public b(ServerSocket serverSocket) {
        super(serverSocket);
    }

    @Override // ch.qos.logback.core.net.server.ServerSocketListener
    public a createClient(String str, Socket socket) throws IOException {
        return new d(str, socket);
    }
}
