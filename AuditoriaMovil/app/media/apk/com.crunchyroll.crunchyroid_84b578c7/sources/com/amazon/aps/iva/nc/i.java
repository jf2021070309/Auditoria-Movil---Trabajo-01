package com.amazon.aps.iva.nc;

import com.amazon.aps.iva.cd.c;
import com.amazon.aps.iva.nc.j;
import com.amazon.aps.iva.rc.o;
import com.amazon.aps.iva.zc.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: DecodeHelper.java */
/* loaded from: classes.dex */
public final class i<Transcode> {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public com.bumptech.glide.c c;
    public Object d;
    public int e;
    public int f;
    public Class<?> g;
    public j.e h;
    public com.amazon.aps.iva.kc.h i;
    public Map<Class<?>, com.amazon.aps.iva.kc.l<?>> j;
    public Class<Transcode> k;
    public boolean l;
    public boolean m;
    public com.amazon.aps.iva.kc.f n;
    public com.amazon.aps.iva.ec.c o;
    public l p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList b = b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                o.a aVar = (o.a) b.get(i);
                if (!arrayList.contains(aVar.a)) {
                    arrayList.add(aVar.a);
                }
                int i2 = 0;
                while (true) {
                    List<com.amazon.aps.iva.kc.f> list = aVar.b;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add(list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List e = this.c.a().e(this.d);
            int size = e.size();
            for (int i = 0; i < size; i++) {
                o.a buildLoadData = ((com.amazon.aps.iva.rc.o) e.get(i)).buildLoadData(this.d, this.e, this.f, this.i);
                if (buildLoadData != null) {
                    arrayList.add(buildLoadData);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data> u<Data, ?, Transcode> c(Class<Data> cls) {
        u<Data, ?, Transcode> uVar;
        u<Data, ?, Transcode> uVar2;
        Object obj;
        ArrayList arrayList;
        boolean z;
        com.amazon.aps.iva.zc.c cVar;
        boolean z2;
        com.amazon.aps.iva.ec.d a = this.c.a();
        Class<?> cls2 = this.g;
        Class cls3 = (Class<Transcode>) this.k;
        com.amazon.aps.iva.cd.b bVar = a.i;
        com.amazon.aps.iva.hd.k andSet = bVar.b.getAndSet(null);
        if (andSet == null) {
            andSet = new com.amazon.aps.iva.hd.k();
        }
        andSet.a = cls;
        andSet.b = cls2;
        andSet.c = cls3;
        synchronized (bVar.a) {
            uVar = (u<Data, ?, Transcode>) bVar.a.getOrDefault(andSet, null);
        }
        bVar.b.set(andSet);
        a.i.getClass();
        if (com.amazon.aps.iva.cd.b.c.equals(uVar)) {
            return null;
        }
        if (uVar == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = a.c.b(cls, cls2).iterator();
            while (it.hasNext()) {
                Class<?> cls4 = (Class) it.next();
                Iterator it2 = a.f.a(cls4, cls3).iterator();
                while (it2.hasNext()) {
                    Class cls5 = (Class) it2.next();
                    com.amazon.aps.iva.cd.c cVar2 = a.c;
                    synchronized (cVar2) {
                        arrayList = new ArrayList();
                        Iterator it3 = cVar2.a.iterator();
                        while (it3.hasNext()) {
                            List<c.a> list = (List) cVar2.b.get((String) it3.next());
                            if (list != null) {
                                for (c.a aVar : list) {
                                    if (aVar.a.isAssignableFrom(cls) && cls4.isAssignableFrom(aVar.b)) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        arrayList.add(aVar.c);
                                    }
                                }
                            }
                        }
                    }
                    com.amazon.aps.iva.zc.d dVar = a.f;
                    synchronized (dVar) {
                        if (cls5.isAssignableFrom(cls4)) {
                            cVar = com.amazon.aps.iva.a0.k.l;
                        } else {
                            Iterator it4 = dVar.a.iterator();
                            while (it4.hasNext()) {
                                d.a aVar2 = (d.a) it4.next();
                                if (aVar2.a.isAssignableFrom(cls4) && cls5.isAssignableFrom(aVar2.b)) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    cVar = aVar2.c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                        }
                    }
                    arrayList2.add(new k(cls, cls4, cls5, arrayList, cVar, a.j));
                }
            }
            if (arrayList2.isEmpty()) {
                uVar2 = null;
            } else {
                uVar2 = new u<>(cls, cls2, cls3, arrayList2, a.j);
            }
            com.amazon.aps.iva.cd.b bVar2 = a.i;
            synchronized (bVar2.a) {
                com.amazon.aps.iva.x.h hVar = bVar2.a;
                com.amazon.aps.iva.hd.k kVar = new com.amazon.aps.iva.hd.k(cls, cls2, cls3);
                if (uVar2 != null) {
                    obj = uVar2;
                } else {
                    obj = com.amazon.aps.iva.cd.b.c;
                }
                hVar.put(kVar, obj);
            }
            return uVar2;
        }
        return uVar;
    }

    public final List<Class<?>> d() {
        List<Class<?>> list;
        ArrayList d;
        com.amazon.aps.iva.ec.d a = this.c.a();
        Class<?> cls = this.d.getClass();
        Class<?> cls2 = this.g;
        Class cls3 = this.k;
        com.amazon.aps.iva.n0.n nVar = a.h;
        com.amazon.aps.iva.hd.k kVar = (com.amazon.aps.iva.hd.k) ((AtomicReference) nVar.a).getAndSet(null);
        if (kVar == null) {
            kVar = new com.amazon.aps.iva.hd.k(cls, cls2, cls3);
        } else {
            kVar.a = cls;
            kVar.b = cls2;
            kVar.c = cls3;
        }
        synchronized (((com.amazon.aps.iva.x.a) nVar.b)) {
            list = (List) ((com.amazon.aps.iva.x.a) nVar.b).getOrDefault(kVar, null);
        }
        ((AtomicReference) nVar.a).set(kVar);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            com.amazon.aps.iva.rc.q qVar = a.a;
            synchronized (qVar) {
                d = qVar.a.d(cls);
            }
            Iterator it = d.iterator();
            while (it.hasNext()) {
                Iterator it2 = a.c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!a.f.a(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            com.amazon.aps.iva.n0.n nVar2 = a.h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((com.amazon.aps.iva.x.a) nVar2.b)) {
                ((com.amazon.aps.iva.x.a) nVar2.b).put(new com.amazon.aps.iva.hd.k(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        r1 = (com.amazon.aps.iva.kc.d<X>) r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <X> com.amazon.aps.iva.kc.d<X> e(X r6) throws com.amazon.aps.iva.ec.d.e {
        /*
            r5 = this;
            com.bumptech.glide.c r0 = r5.c
            com.amazon.aps.iva.ec.d r0 = r0.a()
            com.amazon.aps.iva.cd.a r0 = r0.b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.a     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3a
            com.amazon.aps.iva.cd.a$a r3 = (com.amazon.aps.iva.cd.a.C0168a) r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<T> r4 = r3.a     // Catch: java.lang.Throwable -> L3a
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L13
            com.amazon.aps.iva.kc.d<T> r1 = r3.b     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            goto L2d
        L2b:
            monitor-exit(r0)
            r1 = 0
        L2d:
            if (r1 == 0) goto L30
            return r1
        L30:
            com.amazon.aps.iva.ec.d$e r0 = new com.amazon.aps.iva.ec.d$e
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L3a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.nc.i.e(java.lang.Object):com.amazon.aps.iva.kc.d");
    }

    public final <Z> com.amazon.aps.iva.kc.l<Z> f(Class<Z> cls) {
        com.amazon.aps.iva.kc.l<Z> lVar = (com.amazon.aps.iva.kc.l<Z>) this.j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, com.amazon.aps.iva.kc.l<?>>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, com.amazon.aps.iva.kc.l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    lVar = (com.amazon.aps.iva.kc.l<Z>) next.getValue();
                    break;
                }
            }
        }
        if (lVar == null) {
            if (this.j.isEmpty() && this.q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return com.amazon.aps.iva.tc.b.b;
        }
        return lVar;
    }
}
