package com.amazon.aps.iva.ef0;

import com.amazon.aps.iva.j0.j0;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: InflaterSource.kt */
/* loaded from: classes4.dex */
public final class p implements d0 {
    public final h b;
    public final Inflater c;
    public int d;
    public boolean e;

    public p(x xVar, Inflater inflater) {
        this.b = xVar;
        this.c = inflater;
    }

    public final long a(e eVar, long j) throws IOException {
        boolean z;
        Inflater inflater = this.c;
        com.amazon.aps.iva.yb0.j.f(eVar, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.e) {
                if (i == 0) {
                    return 0L;
                }
                try {
                    y G = eVar.G(1);
                    int min = (int) Math.min(j, 8192 - G.c);
                    boolean needsInput = inflater.needsInput();
                    h hVar = this.b;
                    if (needsInput && !hVar.Y()) {
                        y yVar = hVar.d().b;
                        com.amazon.aps.iva.yb0.j.c(yVar);
                        int i2 = yVar.c;
                        int i3 = yVar.b;
                        int i4 = i2 - i3;
                        this.d = i4;
                        inflater.setInput(yVar.a, i3, i4);
                    }
                    int inflate = inflater.inflate(G.a, G.c, min);
                    int i5 = this.d;
                    if (i5 != 0) {
                        int remaining = i5 - inflater.getRemaining();
                        this.d -= remaining;
                        hVar.e(remaining);
                    }
                    if (inflate > 0) {
                        G.c += inflate;
                        long j2 = inflate;
                        eVar.c += j2;
                        return j2;
                    }
                    if (G.b == G.c) {
                        eVar.b = G.a();
                        z.a(G);
                    }
                    return 0L;
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(j0.f("byteCount < 0: ", j).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.c.end();
        this.e = true;
        this.b.close();
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public final long read(e eVar, long j) throws IOException {
        com.amazon.aps.iva.yb0.j.f(eVar, "sink");
        do {
            long a = a(eVar, j);
            if (a > 0) {
                return a;
            }
            Inflater inflater = this.c;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.b.Y());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public final e0 timeout() {
        return this.b.timeout();
    }
}
