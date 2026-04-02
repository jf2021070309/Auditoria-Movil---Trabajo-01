package k;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
/* loaded from: classes2.dex */
public final class w extends a {

    /* renamed from: l  reason: collision with root package name */
    public final Socket f9650l;

    public w(Socket socket) {
        h.o.c.j.e(socket, "socket");
        this.f9650l = socket;
    }

    @Override // k.a
    public IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // k.a
    public void k() {
        try {
            this.f9650l.close();
        } catch (AssertionError e2) {
            if (!e.j.d.w.S(e2)) {
                throw e2;
            }
            o.a.log(Level.WARNING, h.o.c.j.i("Failed to close timed out socket ", this.f9650l), (Throwable) e2);
        } catch (Exception e3) {
            o.a.log(Level.WARNING, h.o.c.j.i("Failed to close timed out socket ", this.f9650l), (Throwable) e3);
        }
    }
}
