package e.d.b.b.j;

import e.d.d.p.k.f;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class c implements e.d.d.p.e<e.d.b.b.j.a0.a.b> {
    public static final c a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final e.d.d.p.d f6140b;

    static {
        e.d.d.p.k.c cVar = new e.d.d.p.k.c(1, f.a.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(cVar.annotationType(), cVar);
        f6140b = new e.d.d.p.d("storageMetrics", hashMap == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap), null);
    }

    @Override // e.d.d.p.b
    public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
        fVar.add(f6140b, ((e.d.b.b.j.a0.a.b) obj).f6127b);
    }
}
