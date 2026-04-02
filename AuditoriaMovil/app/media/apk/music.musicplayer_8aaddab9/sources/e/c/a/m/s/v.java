package e.c.a.m.s;

import e.c.a.s.k.a;
import e.c.a.s.k.d;
import java.util.Objects;
/* loaded from: classes.dex */
public final class v<Z> implements w<Z>, a.d {
    public static final c.i.j.c<v<?>> a = e.c.a.s.k.a.a(20, new a());

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.s.k.d f5760b = new d.b();

    /* renamed from: c  reason: collision with root package name */
    public w<Z> f5761c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5762d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5763e;

    /* loaded from: classes.dex */
    public class a implements a.b<v<?>> {
        @Override // e.c.a.s.k.a.b
        public v<?> a() {
            return new v<>();
        }
    }

    public static <Z> v<Z> d(w<Z> wVar) {
        v<Z> vVar = (v<Z>) a.b();
        Objects.requireNonNull(vVar, "Argument must not be null");
        vVar.f5763e = false;
        vVar.f5762d = true;
        vVar.f5761c = wVar;
        return vVar;
    }

    @Override // e.c.a.m.s.w
    public synchronized void a() {
        this.f5760b.a();
        this.f5763e = true;
        if (!this.f5762d) {
            this.f5761c.a();
            this.f5761c = null;
            a.a(this);
        }
    }

    @Override // e.c.a.s.k.a.d
    public e.c.a.s.k.d b() {
        return this.f5760b;
    }

    @Override // e.c.a.m.s.w
    public Class<Z> c() {
        return this.f5761c.c();
    }

    public synchronized void e() {
        this.f5760b.a();
        if (!this.f5762d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f5762d = false;
        if (this.f5763e) {
            a();
        }
    }

    @Override // e.c.a.m.s.w
    public Z get() {
        return this.f5761c.get();
    }

    @Override // e.c.a.m.s.w
    public int getSize() {
        return this.f5761c.getSize();
    }
}
