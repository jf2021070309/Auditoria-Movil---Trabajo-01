package com.amazon.aps.iva.nc;

import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.nc.h;
import com.amazon.aps.iva.nc.m;
import com.amazon.aps.iva.rc.o;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes.dex */
public final class x implements h, d.a<Object> {
    public final h.a b;
    public final i<?> c;
    public int d;
    public int e = -1;
    public com.amazon.aps.iva.kc.f f;
    public List<com.amazon.aps.iva.rc.o<File, ?>> g;
    public int h;
    public volatile o.a<?> i;
    public File j;
    public y k;

    public x(i<?> iVar, h.a aVar) {
        this.c = iVar;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.lc.d.a
    public final void c(Exception exc) {
        this.b.b(this.k, exc, this.i.c, com.amazon.aps.iva.kc.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.amazon.aps.iva.nc.h
    public final void cancel() {
        o.a<?> aVar = this.i;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // com.amazon.aps.iva.nc.h
    public final boolean d() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList a = this.c.a();
        if (a.isEmpty()) {
            return false;
        }
        List<Class<?>> d = this.c.d();
        if (d.isEmpty()) {
            if (File.class.equals(this.c.k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.c.d.getClass() + " to " + this.c.k);
        }
        while (true) {
            List<com.amazon.aps.iva.rc.o<File, ?>> list = this.g;
            if (list != null) {
                if (this.h < list.size()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.i = null;
                    boolean z4 = false;
                    while (!z4) {
                        if (this.h < this.g.size()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            break;
                        }
                        List<com.amazon.aps.iva.rc.o<File, ?>> list2 = this.g;
                        int i = this.h;
                        this.h = i + 1;
                        File file = this.j;
                        i<?> iVar = this.c;
                        this.i = list2.get(i).buildLoadData(file, iVar.e, iVar.f, iVar.i);
                        if (this.i != null) {
                            if (this.c.c(this.i.c.a()) != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                this.i.c.d(this.c.o, this);
                                z4 = true;
                            }
                        }
                    }
                    return z4;
                }
            }
            int i2 = this.e + 1;
            this.e = i2;
            if (i2 >= d.size()) {
                int i3 = this.d + 1;
                this.d = i3;
                if (i3 >= a.size()) {
                    return false;
                }
                this.e = 0;
            }
            com.amazon.aps.iva.kc.f fVar = (com.amazon.aps.iva.kc.f) a.get(this.d);
            Class<?> cls = d.get(this.e);
            com.amazon.aps.iva.kc.l<Z> f = this.c.f(cls);
            i<?> iVar2 = this.c;
            this.k = new y(iVar2.c.a, fVar, iVar2.n, iVar2.e, iVar2.f, f, cls, iVar2.i);
            File b = ((m.c) iVar2.h).a().b(this.k);
            this.j = b;
            if (b != null) {
                this.f = fVar;
                this.g = this.c.c.a().e(b);
                this.h = 0;
            }
        }
    }

    @Override // com.amazon.aps.iva.lc.d.a
    public final void f(Object obj) {
        this.b.a(this.f, obj, this.i.c, com.amazon.aps.iva.kc.a.RESOURCE_DISK_CACHE, this.k);
    }
}
