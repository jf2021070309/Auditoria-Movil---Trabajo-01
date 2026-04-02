package com.amazon.aps.iva.nc;
/* compiled from: EngineResource.java */
/* loaded from: classes.dex */
public final class q<Z> implements w<Z> {
    public final boolean b;
    public final boolean c;
    public final w<Z> d;
    public final a e;
    public final com.amazon.aps.iva.kc.f f;
    public int g;
    public boolean h;

    /* compiled from: EngineResource.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(com.amazon.aps.iva.kc.f fVar, q<?> qVar);
    }

    public q(w<Z> wVar, boolean z, boolean z2, com.amazon.aps.iva.kc.f fVar, a aVar) {
        defpackage.i.l(wVar);
        this.d = wVar;
        this.b = z;
        this.c = z2;
        this.f = fVar;
        defpackage.i.l(aVar);
        this.e = aVar;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final int a() {
        return this.d.a();
    }

    @Override // com.amazon.aps.iva.nc.w
    public final synchronized void b() {
        if (this.g <= 0) {
            if (!this.h) {
                this.h = true;
                if (this.c) {
                    this.d.b();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final synchronized void c() {
        if (!this.h) {
            this.g++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Class<Z> d() {
        return this.d.d();
    }

    public final void e() {
        boolean z;
        synchronized (this) {
            int i = this.g;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.g = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.e.a(this.f, this);
        }
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Z get() {
        return this.d.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.b + ", listener=" + this.e + ", key=" + this.f + ", acquired=" + this.g + ", isRecycled=" + this.h + ", resource=" + this.d + '}';
    }
}
