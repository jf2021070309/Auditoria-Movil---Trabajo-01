package e.d.d.m.j;

import e.d.d.l.e0;
import e.d.d.m.j.l.c0;
import e.d.d.t.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class d implements c {
    public static final g a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    public final e.d.d.t.a<c> f7141b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference<c> f7142c = new AtomicReference<>(null);

    /* loaded from: classes2.dex */
    public static final class b implements g {
        public b(a aVar) {
        }
    }

    public d(e.d.d.t.a<c> aVar) {
        this.f7141b = aVar;
        ((e0) aVar).d(new a.InterfaceC0163a() { // from class: e.d.d.m.j.a
            @Override // e.d.d.t.a.InterfaceC0163a
            public final void a(e.d.d.t.b bVar) {
                d dVar = d.this;
                Objects.requireNonNull(dVar);
                f.a.a(3);
                dVar.f7142c.set((c) bVar.get());
            }
        });
    }

    @Override // e.d.d.m.j.c
    public g a(String str) {
        c cVar = this.f7142c.get();
        return cVar == null ? a : cVar.a(str);
    }

    @Override // e.d.d.m.j.c
    public boolean b() {
        c cVar = this.f7142c.get();
        return cVar != null && cVar.b();
    }

    @Override // e.d.d.m.j.c
    public void c(final String str, final String str2, final long j2, final c0 c0Var) {
        f.a.a(2);
        ((e0) this.f7141b).d(new a.InterfaceC0163a() { // from class: e.d.d.m.j.b
            @Override // e.d.d.t.a.InterfaceC0163a
            public final void a(e.d.d.t.b bVar) {
                ((c) bVar.get()).c(str, str2, j2, c0Var);
            }
        });
    }

    @Override // e.d.d.m.j.c
    public boolean d(String str) {
        c cVar = this.f7142c.get();
        return cVar != null && cVar.d(str);
    }
}
