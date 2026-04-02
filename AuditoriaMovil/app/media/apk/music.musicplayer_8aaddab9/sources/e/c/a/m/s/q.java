package e.c.a.m.s;

import java.util.Objects;
/* loaded from: classes.dex */
public class q<Z> implements w<Z> {
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5745b;

    /* renamed from: c  reason: collision with root package name */
    public final w<Z> f5746c;

    /* renamed from: d  reason: collision with root package name */
    public final a f5747d;

    /* renamed from: e  reason: collision with root package name */
    public final e.c.a.m.k f5748e;

    /* renamed from: f  reason: collision with root package name */
    public int f5749f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5750g;

    /* loaded from: classes.dex */
    public interface a {
        void a(e.c.a.m.k kVar, q<?> qVar);
    }

    public q(w<Z> wVar, boolean z, boolean z2, e.c.a.m.k kVar, a aVar) {
        Objects.requireNonNull(wVar, "Argument must not be null");
        this.f5746c = wVar;
        this.a = z;
        this.f5745b = z2;
        this.f5748e = kVar;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f5747d = aVar;
    }

    @Override // e.c.a.m.s.w
    public synchronized void a() {
        if (this.f5749f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f5750g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f5750g = true;
        if (this.f5745b) {
            this.f5746c.a();
        }
    }

    public synchronized void b() {
        if (this.f5750g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f5749f++;
    }

    @Override // e.c.a.m.s.w
    public Class<Z> c() {
        return this.f5746c.c();
    }

    public void d() {
        boolean z;
        synchronized (this) {
            int i2 = this.f5749f;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i3 = i2 - 1;
            this.f5749f = i3;
            if (i3 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f5747d.a(this.f5748e, this);
        }
    }

    @Override // e.c.a.m.s.w
    public Z get() {
        return this.f5746c.get();
    }

    @Override // e.c.a.m.s.w
    public int getSize() {
        return this.f5746c.getSize();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.f5747d + ", key=" + this.f5748e + ", acquired=" + this.f5749f + ", isRecycled=" + this.f5750g + ", resource=" + this.f5746c + '}';
    }
}
