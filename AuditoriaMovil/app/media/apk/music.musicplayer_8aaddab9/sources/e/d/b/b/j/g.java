package e.d.b.b.j;

import e.d.d.p.k.f;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class g implements e.d.d.p.e<e.d.b.b.j.a0.a.e> {
    public static final g a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final e.d.d.p.d f6250b;

    /* renamed from: c  reason: collision with root package name */
    public static final e.d.d.p.d f6251c;

    static {
        e.d.d.p.k.c cVar = new e.d.d.p.k.c(1, f.a.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(cVar.annotationType(), cVar);
        f6250b = new e.d.d.p.d("currentCacheSizeBytes", hashMap == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap), null);
        e.d.d.p.k.c cVar2 = new e.d.d.p.k.c(2, f.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cVar2.annotationType(), cVar2);
        f6251c = new e.d.d.p.d("maxCacheSizeBytes", hashMap2 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap2), null);
    }

    @Override // e.d.d.p.b
    public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
        e.d.b.b.j.a0.a.e eVar = (e.d.b.b.j.a0.a.e) obj;
        e.d.d.p.f fVar2 = fVar;
        fVar2.add(f6250b, eVar.f6132b);
        fVar2.add(f6251c, eVar.f6133c);
    }
}
