package e.d.b.b.j.c0;

import e.d.b.b.j.c0.h.q;
import e.d.b.b.j.c0.h.r;
import e.d.b.b.j.c0.h.t;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class f implements g.a.a {
    public final g.a.a<e.d.b.b.j.e0.a> a;

    public f(g.a.a<e.d.b.b.j.e0.a> aVar) {
        this.a = aVar;
    }

    @Override // g.a.a
    public Object get() {
        e.d.b.b.j.e0.a aVar = this.a.get();
        HashMap hashMap = new HashMap();
        e.d.b.b.d dVar = e.d.b.b.d.DEFAULT;
        t.a.AbstractC0135a a = t.a.a();
        a.b(30000L);
        a.c(86400000L);
        hashMap.put(dVar, a.a());
        e.d.b.b.d dVar2 = e.d.b.b.d.HIGHEST;
        t.a.AbstractC0135a a2 = t.a.a();
        a2.b(1000L);
        a2.c(86400000L);
        hashMap.put(dVar2, a2.a());
        e.d.b.b.d dVar3 = e.d.b.b.d.VERY_LOW;
        t.a.AbstractC0135a a3 = t.a.a();
        a3.b(86400000L);
        a3.c(86400000L);
        Set<t.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(t.b.NETWORK_UNMETERED, t.b.DEVICE_IDLE)));
        r.b bVar = (r.b) a3;
        Objects.requireNonNull(unmodifiableSet, "Null flags");
        bVar.f6181c = unmodifiableSet;
        hashMap.put(dVar3, bVar.a());
        Objects.requireNonNull(aVar, "missing required property: clock");
        int size = hashMap.keySet().size();
        e.d.b.b.d.values();
        if (size >= 3) {
            new HashMap();
            return new q(aVar, hashMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
}
