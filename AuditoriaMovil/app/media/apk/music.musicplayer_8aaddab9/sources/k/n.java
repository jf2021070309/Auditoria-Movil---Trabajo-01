package k;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
public class n implements x {
    public final InputStream a;

    /* renamed from: b  reason: collision with root package name */
    public final y f9633b;

    public n(InputStream inputStream, y yVar) {
        h.o.c.j.e(inputStream, "input");
        h.o.c.j.e(yVar, "timeout");
        this.a = inputStream;
        this.f9633b = yVar;
    }

    @Override // k.x
    public long S(d dVar, long j2) {
        h.o.c.j.e(dVar, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (j2 >= 0) {
            try {
                this.f9633b.f();
                s a0 = dVar.a0(1);
                int read = this.a.read(a0.a, a0.f9640c, (int) Math.min(j2, 8192 - a0.f9640c));
                if (read != -1) {
                    a0.f9640c += read;
                    long j3 = read;
                    dVar.f9620b += j3;
                    return j3;
                } else if (a0.f9639b == a0.f9640c) {
                    dVar.a = a0.a();
                    t.a(a0);
                    return -1L;
                } else {
                    return -1L;
                }
            } catch (AssertionError e2) {
                if (e.j.d.w.S(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }
        throw new IllegalArgumentException(h.o.c.j.i("byteCount < 0: ", Long.valueOf(j2)).toString());
    }

    @Override // k.x
    public y c() {
        return this.f9633b;
    }

    @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("source(");
        y.append(this.a);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}
