package m.h0.a;

import e.d.e.p;
import e.d.e.z;
import j.f0;
import j.u;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
import k.g;
import m.j;
/* loaded from: classes2.dex */
public final class c<T> implements j<f0, T> {
    public final e.d.e.j a;

    /* renamed from: b  reason: collision with root package name */
    public final z<T> f9858b;

    public c(e.d.e.j jVar, z<T> zVar) {
        this.a = jVar;
        this.f9858b = zVar;
    }

    @Override // m.j
    public Object a(f0 f0Var) throws IOException {
        f0 f0Var2 = f0Var;
        e.d.e.j jVar = this.a;
        Reader reader = f0Var2.a;
        if (reader == null) {
            g h2 = f0Var2.h();
            u f2 = f0Var2.f();
            reader = new f0.a(h2, f2 != null ? f2.a(j.i0.c.f9276i) : j.i0.c.f9276i);
            f0Var2.a = reader;
        }
        Objects.requireNonNull(jVar);
        e.d.e.e0.a aVar = new e.d.e.e0.a(reader);
        aVar.f7899c = false;
        try {
            T a = this.f9858b.a(aVar);
            if (aVar.g0() == e.d.e.e0.b.END_DOCUMENT) {
                return a;
            }
            throw new p("JSON document was not fully consumed.");
        } finally {
            f0Var2.close();
        }
    }
}
