package e.d.b.b.j;

import e.d.d.p.k.f;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class b implements e.d.d.p.e<e.d.b.b.j.a0.a.a> {
    public static final b a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final e.d.d.p.d f6136b;

    /* renamed from: c  reason: collision with root package name */
    public static final e.d.d.p.d f6137c;

    /* renamed from: d  reason: collision with root package name */
    public static final e.d.d.p.d f6138d;

    /* renamed from: e  reason: collision with root package name */
    public static final e.d.d.p.d f6139e;

    static {
        e.d.d.p.k.c cVar = new e.d.d.p.k.c(1, f.a.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(cVar.annotationType(), cVar);
        f6136b = new e.d.d.p.d("window", hashMap == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap), null);
        e.d.d.p.k.c cVar2 = new e.d.d.p.k.c(2, f.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cVar2.annotationType(), cVar2);
        f6137c = new e.d.d.p.d("logSourceMetrics", hashMap2 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap2), null);
        e.d.d.p.k.c cVar3 = new e.d.d.p.k.c(3, f.a.DEFAULT);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(cVar3.annotationType(), cVar3);
        f6138d = new e.d.d.p.d("globalMetrics", hashMap3 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap3), null);
        e.d.d.p.k.c cVar4 = new e.d.d.p.k.c(4, f.a.DEFAULT);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(cVar4.annotationType(), cVar4);
        f6139e = new e.d.d.p.d("appNamespace", hashMap4 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap4), null);
    }

    @Override // e.d.d.p.b
    public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
        e.d.b.b.j.a0.a.a aVar = (e.d.b.b.j.a0.a.a) obj;
        e.d.d.p.f fVar2 = fVar;
        fVar2.add(f6136b, aVar.f6120b);
        fVar2.add(f6137c, aVar.f6121c);
        fVar2.add(f6138d, aVar.f6122d);
        fVar2.add(f6139e, aVar.f6123e);
    }
}
