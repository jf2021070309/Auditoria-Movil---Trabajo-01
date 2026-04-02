package j.i0.f;

import j.d0;
import j.t;
import j.w;
import j.z;
import java.io.IOException;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class a implements t {
    public final w a;

    public a(w wVar) {
        this.a = wVar;
    }

    @Override // j.t
    public d0 a(t.a aVar) throws IOException {
        j.i0.g.f fVar = (j.i0.g.f) aVar;
        z zVar = fVar.f9329f;
        g gVar = fVar.f9325b;
        boolean z = !zVar.f9602b.equals("GET");
        w wVar = this.a;
        Objects.requireNonNull(gVar);
        int i2 = fVar.f9332i;
        int i3 = fVar.f9333j;
        int i4 = fVar.f9334k;
        Objects.requireNonNull(wVar);
        try {
            j.i0.g.c i5 = gVar.e(i2, i3, i4, 0, wVar.v, z).i(wVar, aVar, gVar);
            synchronized (gVar.f9311d) {
                gVar.f9321n = i5;
            }
            return fVar.b(zVar, gVar, i5, gVar.b());
        } catch (IOException e2) {
            throw new e(e2);
        }
    }
}
