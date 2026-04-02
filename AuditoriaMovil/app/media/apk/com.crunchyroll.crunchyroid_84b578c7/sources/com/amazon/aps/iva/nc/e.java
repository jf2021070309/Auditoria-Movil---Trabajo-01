package com.amazon.aps.iva.nc;

import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.nc.h;
import com.amazon.aps.iva.nc.m;
import com.amazon.aps.iva.rc.o;
import java.io.File;
import java.util.List;
/* compiled from: DataCacheGenerator.java */
/* loaded from: classes.dex */
public final class e implements h, d.a<Object> {
    public final List<com.amazon.aps.iva.kc.f> b;
    public final i<?> c;
    public final h.a d;
    public int e = -1;
    public com.amazon.aps.iva.kc.f f;
    public List<com.amazon.aps.iva.rc.o<File, ?>> g;
    public int h;
    public volatile o.a<?> i;
    public File j;

    public e(List<com.amazon.aps.iva.kc.f> list, i<?> iVar, h.a aVar) {
        this.b = list;
        this.c = iVar;
        this.d = aVar;
    }

    @Override // com.amazon.aps.iva.lc.d.a
    public final void c(Exception exc) {
        this.d.b(this.f, exc, this.i.c, com.amazon.aps.iva.kc.a.DATA_DISK_CACHE);
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
            if (i2 >= this.b.size()) {
                return false;
            }
            com.amazon.aps.iva.kc.f fVar = this.b.get(this.e);
            i<?> iVar2 = this.c;
            File b = ((m.c) iVar2.h).a().b(new f(fVar, iVar2.n));
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
        this.d.a(this.f, obj, this.i.c, com.amazon.aps.iva.kc.a.DATA_DISK_CACHE, this.f);
    }
}
