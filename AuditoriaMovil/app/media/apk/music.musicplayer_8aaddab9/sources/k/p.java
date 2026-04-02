package k;

import ch.qos.logback.core.CoreConstants;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class p implements v {
    public final OutputStream a;

    /* renamed from: b  reason: collision with root package name */
    public final y f9634b;

    public p(OutputStream outputStream, y yVar) {
        h.o.c.j.e(outputStream, "out");
        h.o.c.j.e(yVar, "timeout");
        this.a = outputStream;
        this.f9634b = yVar;
    }

    @Override // k.v
    public void E(d dVar, long j2) {
        h.o.c.j.e(dVar, "source");
        a0.b(dVar.f9620b, 0L, j2);
        while (j2 > 0) {
            this.f9634b.f();
            s sVar = dVar.a;
            h.o.c.j.c(sVar);
            int min = (int) Math.min(j2, sVar.f9640c - sVar.f9639b);
            this.a.write(sVar.a, sVar.f9639b, min);
            int i2 = sVar.f9639b + min;
            sVar.f9639b = i2;
            long j3 = min;
            j2 -= j3;
            dVar.f9620b -= j3;
            if (i2 == sVar.f9640c) {
                dVar.a = sVar.a();
                t.a(sVar);
            }
        }
    }

    @Override // k.v
    public y c() {
        return this.f9634b;
    }

    @Override // k.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // k.v, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("sink(");
        y.append(this.a);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}
