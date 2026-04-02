package com.amazon.aps.iva.ef0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
/* loaded from: classes4.dex */
public final class r {
    public static final w a(b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "<this>");
        return new w(b0Var);
    }

    public static final x b(d0 d0Var) {
        com.amazon.aps.iva.yb0.j.f(d0Var, "<this>");
        return new x(d0Var);
    }

    public static final boolean c(AssertionError assertionError) {
        boolean z;
        Logger logger = s.a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z = com.amazon.aps.iva.oe0.q.i0(message, "getsockname failed", false);
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public static final b0 d(Socket socket) throws IOException {
        Logger logger = s.a;
        com.amazon.aps.iva.yb0.j.f(socket, "<this>");
        c0 c0Var = new c0(socket);
        OutputStream outputStream = socket.getOutputStream();
        com.amazon.aps.iva.yb0.j.e(outputStream, "getOutputStream(...)");
        return c0Var.sink(new u(outputStream, c0Var));
    }

    public static u e(File file) throws FileNotFoundException {
        Logger logger = s.a;
        com.amazon.aps.iva.yb0.j.f(file, "<this>");
        return new u(new FileOutputStream(file, false), new e0());
    }

    public static final q f(InputStream inputStream) {
        Logger logger = s.a;
        com.amazon.aps.iva.yb0.j.f(inputStream, "<this>");
        return new q(inputStream, new e0());
    }

    public static final d0 g(Socket socket) throws IOException {
        Logger logger = s.a;
        com.amazon.aps.iva.yb0.j.f(socket, "<this>");
        c0 c0Var = new c0(socket);
        InputStream inputStream = socket.getInputStream();
        com.amazon.aps.iva.yb0.j.e(inputStream, "getInputStream(...)");
        return c0Var.source(new q(inputStream, c0Var));
    }
}
