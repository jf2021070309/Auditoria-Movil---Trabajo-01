package com.amazon.aps.iva.rc;

import com.amazon.aps.iva.ec.d;
import com.amazon.aps.iva.id.a;
import com.amazon.aps.iva.rc.o;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes.dex */
public final class s {
    public static final c e = new c();
    public static final a f = new a();
    public final ArrayList a;
    public final c b;
    public final HashSet c;
    public final com.amazon.aps.iva.o3.d<List<Throwable>> d;

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class a implements o<Object, Object> {
        @Override // com.amazon.aps.iva.rc.o
        public final o.a<Object> buildLoadData(Object obj, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
            return null;
        }

        @Override // com.amazon.aps.iva.rc.o
        public final boolean handles(Object obj) {
            return false;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {
        public final Class<Model> a;
        public final Class<Data> b;
        public final p<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
            this.a = cls;
            this.b = cls2;
            this.c = pVar;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    public s(a.c cVar) {
        c cVar2 = e;
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = cVar;
        this.b = cVar2;
    }

    public final <Model, Data> o<Model, Data> a(b<?, ?> bVar) {
        o<Model, Data> oVar = (o<Model, Data>) bVar.c.build(this);
        defpackage.i.l(oVar);
        return oVar;
    }

    public final synchronized <Model, Data> o<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                b<?, ?> bVar = (b) it.next();
                if (this.c.contains(bVar)) {
                    z = true;
                } else {
                    if (!bVar.a.isAssignableFrom(cls) || !bVar.b.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        this.c.add(bVar);
                        arrayList.add(a(bVar));
                        this.c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.b;
                com.amazon.aps.iva.o3.d<List<Throwable>> dVar = this.d;
                cVar.getClass();
                return new r(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            } else if (z) {
                return f;
            } else {
                throw new d.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.c.contains(bVar) && bVar.a.isAssignableFrom(cls)) {
                    this.c.add(bVar);
                    o build = bVar.c.build(this);
                    defpackage.i.l(build);
                    arrayList.add(build);
                    this.c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.b) && bVar.a.isAssignableFrom(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList e() {
        ArrayList arrayList;
        boolean z;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.a.isAssignableFrom(g.class) && bVar.b.isAssignableFrom(InputStream.class)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                it.remove();
                arrayList.add(bVar.c);
            }
        }
        return arrayList;
    }
}
