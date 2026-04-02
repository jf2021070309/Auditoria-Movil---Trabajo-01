package e.d.d.l;

import e.d.d.t.a;
/* loaded from: classes.dex */
public class e0<T> implements e.d.d.t.b<T>, e.d.d.t.a<T> {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public a.InterfaceC0163a<T> f7095b;

    /* renamed from: c  reason: collision with root package name */
    public volatile e.d.d.t.b<T> f7096c;

    public e0(a.InterfaceC0163a<T> interfaceC0163a, e.d.d.t.b<T> bVar) {
        this.f7095b = interfaceC0163a;
        this.f7096c = bVar;
    }

    public static <T> e0<T> a() {
        return new e0<>(new a.InterfaceC0163a() { // from class: e.d.d.l.k
            @Override // e.d.d.t.a.InterfaceC0163a
            public final void a(e.d.d.t.b bVar) {
                int i2 = e0.a;
            }
        }, j.a);
    }

    public static <T> e0<T> b(e.d.d.t.b<T> bVar) {
        return new e0<>(null, bVar);
    }

    public void c(e.d.d.t.b<T> bVar) {
        a.InterfaceC0163a<T> interfaceC0163a;
        if (this.f7096c != j.a) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0163a = this.f7095b;
            this.f7095b = null;
            this.f7096c = bVar;
        }
        interfaceC0163a.a(bVar);
    }

    public void d(final a.InterfaceC0163a<T> interfaceC0163a) {
        e.d.d.t.b<T> bVar;
        e.d.d.t.b<T> bVar2 = this.f7096c;
        j jVar = j.a;
        if (bVar2 != jVar) {
            interfaceC0163a.a(bVar2);
            return;
        }
        e.d.d.t.b<T> bVar3 = null;
        synchronized (this) {
            bVar = this.f7096c;
            if (bVar != jVar) {
                bVar3 = bVar;
            } else {
                final a.InterfaceC0163a<T> interfaceC0163a2 = this.f7095b;
                this.f7095b = new a.InterfaceC0163a() { // from class: e.d.d.l.l
                    @Override // e.d.d.t.a.InterfaceC0163a
                    public final void a(e.d.d.t.b bVar4) {
                        a.InterfaceC0163a interfaceC0163a3 = a.InterfaceC0163a.this;
                        a.InterfaceC0163a interfaceC0163a4 = interfaceC0163a;
                        interfaceC0163a3.a(bVar4);
                        interfaceC0163a4.a(bVar4);
                    }
                };
            }
        }
        if (bVar3 != null) {
            interfaceC0163a.a(bVar);
        }
    }

    @Override // e.d.d.t.b
    public T get() {
        return this.f7096c.get();
    }
}
