package com.amazon.aps.iva.ef0;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: JvmOkio.kt */
/* loaded from: classes4.dex */
public final class c0 extends c {
    public final Socket a;

    public c0(Socket socket) {
        com.amazon.aps.iva.yb0.j.f(socket, "socket");
        this.a = socket;
    }

    @Override // com.amazon.aps.iva.ef0.c
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // com.amazon.aps.iva.ef0.c
    public final void timedOut() {
        Socket socket = this.a;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (r.c(e)) {
                Logger logger = s.a;
                Level level = Level.WARNING;
                logger.log(level, "Failed to close timed out socket " + socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            Logger logger2 = s.a;
            Level level2 = Level.WARNING;
            logger2.log(level2, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
