package com.amazon.aps.iva.x5;

import com.amazon.aps.iva.t5.a;
import com.amazon.aps.iva.t5.g0;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ReusableBufferedOutputStream.java */
/* loaded from: classes.dex */
public final class p extends BufferedOutputStream {
    public boolean b;

    public p(a.C0731a c0731a) {
        super(c0731a);
    }

    public final void a(OutputStream outputStream) {
        com.amazon.aps.iva.cq.b.C(this.b);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.b = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = g0.a;
        throw th;
    }

    public p(FileOutputStream fileOutputStream, int i) {
        super(fileOutputStream, i);
    }
}
