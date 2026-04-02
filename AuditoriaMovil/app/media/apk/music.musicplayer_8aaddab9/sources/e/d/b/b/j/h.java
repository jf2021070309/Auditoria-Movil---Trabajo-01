package e.d.b.b.j;

import e.d.d.p.k.f;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class h implements e.d.d.p.e<e.d.b.b.j.a0.a.f> {
    public static final h a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final e.d.d.p.d f6252b;

    /* renamed from: c  reason: collision with root package name */
    public static final e.d.d.p.d f6253c;

    static {
        e.d.d.p.k.c cVar = new e.d.d.p.k.c(1, f.a.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(cVar.annotationType(), cVar);
        f6252b = new e.d.d.p.d("startMs", hashMap == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap), null);
        e.d.d.p.k.c cVar2 = new e.d.d.p.k.c(2, f.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cVar2.annotationType(), cVar2);
        f6253c = new e.d.d.p.d("endMs", hashMap2 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap2), null);
    }

    @Override // e.d.d.p.b
    public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
        e.d.b.b.j.a0.a.f fVar2 = (e.d.b.b.j.a0.a.f) obj;
        e.d.d.p.f fVar3 = fVar;
        fVar3.add(f6252b, fVar2.f6134b);
        fVar3.add(f6253c, fVar2.f6135c);
    }
}
