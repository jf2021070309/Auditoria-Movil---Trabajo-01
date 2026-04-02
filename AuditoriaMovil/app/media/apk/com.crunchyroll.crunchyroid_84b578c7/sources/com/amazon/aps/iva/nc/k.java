package com.amazon.aps.iva.nc;

import android.util.Log;
import com.amazon.aps.iva.ec.d;
import com.amazon.aps.iva.id.a;
import com.amazon.aps.iva.nc.j;
import com.amazon.aps.iva.rc.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* compiled from: DecodePath.java */
/* loaded from: classes.dex */
public final class k<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;
    public final List<? extends com.amazon.aps.iva.kc.j<DataType, ResourceType>> b;
    public final com.amazon.aps.iva.zc.c<ResourceType, Transcode> c;
    public final com.amazon.aps.iva.o3.d<List<Throwable>> d;
    public final String e;

    public k(Class cls, Class cls2, Class cls3, List list, com.amazon.aps.iva.zc.c cVar, a.c cVar2) {
        this.a = cls;
        this.b = list;
        this.c = cVar;
        this.d = cVar2;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w a(int i, int i2, com.amazon.aps.iva.kc.h hVar, com.bumptech.glide.load.data.a aVar, j.c cVar) throws r {
        w wVar;
        com.amazon.aps.iva.kc.l lVar;
        boolean z;
        com.amazon.aps.iva.kc.c cVar2;
        boolean z2;
        com.amazon.aps.iva.kc.f fVar;
        com.amazon.aps.iva.o3.d<List<Throwable>> dVar = this.d;
        List<Throwable> b = dVar.b();
        defpackage.i.l(b);
        List<Throwable> list = b;
        try {
            w<ResourceType> b2 = b(aVar, i, i2, hVar, list);
            dVar.a(list);
            j jVar = j.this;
            jVar.getClass();
            Class<?> cls = b2.get().getClass();
            com.amazon.aps.iva.kc.a aVar2 = com.amazon.aps.iva.kc.a.RESOURCE_DISK_CACHE;
            com.amazon.aps.iva.kc.a aVar3 = cVar.a;
            i<R> iVar = jVar.b;
            com.amazon.aps.iva.kc.k kVar = null;
            if (aVar3 != aVar2) {
                com.amazon.aps.iva.kc.l f = iVar.f(cls);
                wVar = f.b(jVar.i, b2, jVar.m, jVar.n);
                lVar = f;
            } else {
                wVar = b2;
                lVar = null;
            }
            if (!b2.equals(wVar)) {
                b2.b();
            }
            if (iVar.c.a().d.a(wVar.d()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                com.amazon.aps.iva.ec.d a = iVar.c.a();
                a.getClass();
                com.amazon.aps.iva.kc.k a2 = a.d.a(wVar.d());
                if (a2 != null) {
                    cVar2 = a2.d(jVar.p);
                    kVar = a2;
                } else {
                    throw new d.C0220d(wVar.d());
                }
            } else {
                cVar2 = com.amazon.aps.iva.kc.c.NONE;
            }
            com.amazon.aps.iva.kc.f fVar2 = jVar.x;
            ArrayList b3 = iVar.b();
            int size = b3.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    if (((o.a) b3.get(i3)).a.equals(fVar2)) {
                        z2 = true;
                        break;
                    }
                    i3++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (jVar.o.d(!z2, aVar3, cVar2)) {
                if (kVar != null) {
                    int i4 = j.a.c[cVar2.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            fVar = new y(iVar.c.a, jVar.x, jVar.j, jVar.m, jVar.n, lVar, cls, jVar.p);
                        } else {
                            throw new IllegalArgumentException("Unknown strategy: " + cVar2);
                        }
                    } else {
                        fVar = new f(jVar.x, jVar.j);
                    }
                    v<Z> vVar = (v) v.f.b();
                    defpackage.i.l(vVar);
                    vVar.e = false;
                    vVar.d = true;
                    vVar.c = wVar;
                    j.d<?> dVar2 = jVar.g;
                    dVar2.a = fVar;
                    dVar2.b = kVar;
                    dVar2.c = vVar;
                    wVar = vVar;
                } else {
                    throw new d.C0220d(wVar.get().getClass());
                }
            }
            return this.c.i(wVar, hVar);
        } catch (Throwable th) {
            dVar.a(list);
            throw th;
        }
    }

    public final w<ResourceType> b(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, com.amazon.aps.iva.kc.h hVar, List<Throwable> list) throws r {
        List<? extends com.amazon.aps.iva.kc.j<DataType, ResourceType>> list2 = this.b;
        int size = list2.size();
        w<ResourceType> wVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            com.amazon.aps.iva.kc.j<DataType, ResourceType> jVar = list2.get(i3);
            try {
                if (jVar.b(aVar.a(), hVar)) {
                    wVar = jVar.a(aVar.a(), i, i2, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(jVar);
                }
                list.add(e);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new r(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
