package m.h0.a;

import e.d.e.z;
import j.a0;
import j.c0;
import j.u;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import k.d;
import k.e;
import m.j;
/* loaded from: classes2.dex */
public final class b<T> implements j<T, c0> {
    public static final u a = u.b("application/json; charset=UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f9855b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    public final e.d.e.j f9856c;

    /* renamed from: d  reason: collision with root package name */
    public final z<T> f9857d;

    public b(e.d.e.j jVar, z<T> zVar) {
        this.f9856c = jVar;
        this.f9857d = zVar;
    }

    @Override // m.j
    public c0 a(Object obj) throws IOException {
        d dVar = new d();
        e.d.e.e0.c e2 = this.f9856c.e(new OutputStreamWriter(new e(dVar), f9855b));
        this.f9857d.b(e2, obj);
        e2.close();
        return new a0(a, dVar.z());
    }
}
