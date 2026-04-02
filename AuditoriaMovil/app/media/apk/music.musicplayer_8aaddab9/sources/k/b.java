package k;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class b implements v {
    public final /* synthetic */ a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f9618b;

    public b(a aVar, v vVar) {
        this.a = aVar;
        this.f9618b = vVar;
    }

    @Override // k.v
    public void E(d dVar, long j2) {
        h.o.c.j.e(dVar, "source");
        a0.b(dVar.f9620b, 0L, j2);
        while (true) {
            long j3 = 0;
            if (j2 <= 0) {
                return;
            }
            s sVar = dVar.a;
            h.o.c.j.c(sVar);
            while (true) {
                if (j3 >= 65536) {
                    break;
                }
                j3 += sVar.f9640c - sVar.f9639b;
                if (j3 >= j2) {
                    j3 = j2;
                    break;
                } else {
                    sVar = sVar.f9643f;
                    h.o.c.j.c(sVar);
                }
            }
            a aVar = this.a;
            v vVar = this.f9618b;
            aVar.h();
            try {
                vVar.E(dVar, j3);
                if (aVar.i()) {
                    throw aVar.j(null);
                }
                j2 -= j3;
            } catch (IOException e2) {
                if (!aVar.i()) {
                    throw e2;
                }
                throw aVar.j(e2);
            } finally {
                aVar.i();
            }
        }
    }

    @Override // k.v
    public y c() {
        return this.a;
    }

    @Override // k.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar = this.a;
        v vVar = this.f9618b;
        aVar.h();
        try {
            vVar.close();
            if (aVar.i()) {
                throw aVar.j(null);
            }
        } catch (IOException e2) {
            if (!aVar.i()) {
                throw e2;
            }
            throw aVar.j(e2);
        } finally {
            aVar.i();
        }
    }

    @Override // k.v, java.io.Flushable
    public void flush() {
        a aVar = this.a;
        v vVar = this.f9618b;
        aVar.h();
        try {
            vVar.flush();
            if (aVar.i()) {
                throw aVar.j(null);
            }
        } catch (IOException e2) {
            if (!aVar.i()) {
                throw e2;
            }
            throw aVar.j(e2);
        } finally {
            aVar.i();
        }
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AsyncTimeout.sink(");
        y.append(this.f9618b);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}
