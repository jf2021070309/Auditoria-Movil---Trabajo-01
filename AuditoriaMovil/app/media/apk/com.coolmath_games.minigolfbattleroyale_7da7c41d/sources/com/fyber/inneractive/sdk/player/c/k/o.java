package com.fyber.inneractive.sdk.player.c.k;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class o extends BufferedOutputStream {
    private boolean a;

    public o(OutputStream outputStream) {
        super(outputStream);
    }

    public o(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            t.a(th);
        }
    }

    public final void a(OutputStream outputStream) {
        a.b(this.a);
        this.out = outputStream;
        this.count = 0;
        this.a = false;
    }
}
