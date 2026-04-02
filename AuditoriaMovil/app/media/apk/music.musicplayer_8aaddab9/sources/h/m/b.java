package h.m;

import h.m.f;
import h.m.f.a;
import h.o.b.l;
import h.o.c.j;
/* loaded from: classes2.dex */
public abstract class b<B extends f.a, E extends B> implements f.b<E> {
    public final l<f.a, E> a;

    /* renamed from: b  reason: collision with root package name */
    public final f.b<?> f8929b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.o.b.l<h.m.f$a, E extends B>, java.lang.Object, h.o.b.l<? super h.m.f$a, ? extends E extends B>] */
    public b(f.b<B> bVar, l<? super f.a, ? extends E> lVar) {
        j.e(bVar, "baseKey");
        j.e(lVar, "safeCast");
        this.a = lVar;
        this.f8929b = bVar instanceof b ? (f.b<B>) ((b) bVar).f8929b : bVar;
    }
}
