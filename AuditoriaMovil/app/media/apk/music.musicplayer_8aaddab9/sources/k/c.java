package k;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class c implements x {
    public final /* synthetic */ a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f9619b;

    public c(a aVar, x xVar) {
        this.a = aVar;
        this.f9619b = xVar;
    }

    @Override // k.x
    public long S(d dVar, long j2) {
        h.o.c.j.e(dVar, "sink");
        a aVar = this.a;
        x xVar = this.f9619b;
        aVar.h();
        try {
            long S = xVar.S(dVar, j2);
            if (aVar.i()) {
                throw aVar.j(null);
            }
            return S;
        } catch (IOException e2) {
            if (aVar.i()) {
                throw aVar.j(e2);
            }
            throw e2;
        } finally {
            aVar.i();
        }
    }

    @Override // k.x
    public y c() {
        return this.a;
    }

    @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar = this.a;
        x xVar = this.f9619b;
        aVar.h();
        try {
            xVar.close();
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
        StringBuilder y = e.a.d.a.a.y("AsyncTimeout.source(");
        y.append(this.f9619b);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}
