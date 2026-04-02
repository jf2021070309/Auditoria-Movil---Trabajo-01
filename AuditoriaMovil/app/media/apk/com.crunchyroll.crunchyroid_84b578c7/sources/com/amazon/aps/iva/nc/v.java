package com.amazon.aps.iva.nc;

import com.amazon.aps.iva.id.a;
import com.amazon.aps.iva.id.d;
/* compiled from: LockedResource.java */
/* loaded from: classes.dex */
public final class v<Z> implements w<Z>, a.d {
    public static final a.c f = com.amazon.aps.iva.id.a.a(20, new a());
    public final d.a b = new d.a();
    public w<Z> c;
    public boolean d;
    public boolean e;

    /* compiled from: LockedResource.java */
    /* loaded from: classes.dex */
    public class a implements a.b<v<?>> {
        @Override // com.amazon.aps.iva.id.a.b
        public final v<?> a() {
            return new v<>();
        }
    }

    @Override // com.amazon.aps.iva.nc.w
    public final int a() {
        return this.c.a();
    }

    @Override // com.amazon.aps.iva.nc.w
    public final synchronized void b() {
        this.b.a();
        this.e = true;
        if (!this.d) {
            this.c.b();
            this.c = null;
            f.a(this);
        }
    }

    @Override // com.amazon.aps.iva.id.a.d
    public final d.a c() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Class<Z> d() {
        return this.c.d();
    }

    public final synchronized void e() {
        this.b.a();
        if (this.d) {
            this.d = false;
            if (this.e) {
                b();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Z get() {
        return this.c.get();
    }
}
