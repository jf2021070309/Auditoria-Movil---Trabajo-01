package com.amazon.aps.iva.ec;

import com.amazon.aps.iva.cd.c;
import com.amazon.aps.iva.cd.d;
import com.amazon.aps.iva.id.a;
import com.amazon.aps.iva.kc.j;
import com.amazon.aps.iva.kc.k;
import com.amazon.aps.iva.n0.n;
import com.amazon.aps.iva.rc.o;
import com.amazon.aps.iva.rc.p;
import com.amazon.aps.iva.rc.q;
import com.amazon.aps.iva.rc.s;
import com.amazon.aps.iva.zc.d;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: Registry.java */
/* loaded from: classes.dex */
public final class d {
    public final q a;
    public final com.amazon.aps.iva.cd.a b;
    public final com.amazon.aps.iva.cd.c c;
    public final com.amazon.aps.iva.cd.d d;
    public final com.bumptech.glide.load.data.b e;
    public final com.amazon.aps.iva.zc.d f;
    public final com.amazon.aps.iva.p0.e g;
    public final n h = new n(1);
    public final com.amazon.aps.iva.cd.b i = new com.amazon.aps.iva.cd.b();
    public final a.c j;

    /* compiled from: Registry.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
    }

    /* compiled from: Registry.java */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: classes.dex */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m, List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* compiled from: Registry.java */
    /* renamed from: com.amazon.aps.iva.ec.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0220d extends a {
        public C0220d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: classes.dex */
    public static class e extends a {
        public e(Class<?> cls) {
            super(defpackage.e.d("Failed to find source encoder for data class: ", cls));
        }
    }

    public d() {
        a.c cVar = new a.c(new com.amazon.aps.iva.o3.f(20), new com.amazon.aps.iva.id.b(), new com.amazon.aps.iva.id.c());
        this.j = cVar;
        this.a = new q(cVar);
        this.b = new com.amazon.aps.iva.cd.a();
        this.c = new com.amazon.aps.iva.cd.c();
        this.d = new com.amazon.aps.iva.cd.d();
        this.e = new com.bumptech.glide.load.data.b();
        this.f = new com.amazon.aps.iva.zc.d();
        this.g = new com.amazon.aps.iva.p0.e(7);
        List<String> asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String str : asList) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        com.amazon.aps.iva.cd.c cVar2 = this.c;
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.a);
            cVar2.a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar2.a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (!arrayList.contains(str2)) {
                    cVar2.a.add(str2);
                }
            }
        }
    }

    public final void a(j jVar, Class cls, Class cls2, String str) {
        com.amazon.aps.iva.cd.c cVar = this.c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a<>(cls, cls2, jVar));
        }
    }

    public final void b(Class cls, k kVar) {
        com.amazon.aps.iva.cd.d dVar = this.d;
        synchronized (dVar) {
            dVar.a.add(new d.a(cls, kVar));
        }
    }

    public final void c(Class cls, Class cls2, p pVar) {
        q qVar = this.a;
        synchronized (qVar) {
            s sVar = qVar.a;
            synchronized (sVar) {
                s.b bVar = new s.b(cls, cls2, pVar);
                ArrayList arrayList = sVar.a;
                arrayList.add(arrayList.size(), bVar);
            }
            qVar.b.a.clear();
        }
    }

    public final List<ImageHeaderParser> d() {
        List<ImageHeaderParser> list;
        com.amazon.aps.iva.p0.e eVar = this.g;
        synchronized (eVar) {
            list = (List) eVar.b;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new b();
    }

    public final <Model> List<o<Model, ?>> e(Model model) {
        List<o<Model, ?>> list;
        q qVar = this.a;
        qVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (qVar) {
            q.a.C0676a c0676a = (q.a.C0676a) qVar.b.a.get(cls);
            if (c0676a == null) {
                list = null;
            } else {
                list = c0676a.a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(qVar.a.c(cls));
                if (((q.a.C0676a) qVar.b.a.put(cls, new q.a.C0676a(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<o<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                o<Model, ?> oVar = list.get(i);
                if (oVar.handles(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(oVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(model, list);
        }
        throw new c(model);
    }

    public final <X> com.bumptech.glide.load.data.a<X> f(X x) {
        com.bumptech.glide.load.data.a<X> b2;
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            i.l(x);
            a.InterfaceC0945a interfaceC0945a = (a.InterfaceC0945a) bVar.a.get(x.getClass());
            if (interfaceC0945a == null) {
                Iterator it = bVar.a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a.InterfaceC0945a interfaceC0945a2 = (a.InterfaceC0945a) it.next();
                    if (interfaceC0945a2.a().isAssignableFrom(x.getClass())) {
                        interfaceC0945a = interfaceC0945a2;
                        break;
                    }
                }
            }
            if (interfaceC0945a == null) {
                interfaceC0945a = com.bumptech.glide.load.data.b.b;
            }
            b2 = interfaceC0945a.b(x);
        }
        return b2;
    }

    public final void g(a.InterfaceC0945a interfaceC0945a) {
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            bVar.a.put(interfaceC0945a.a(), interfaceC0945a);
        }
    }

    public final void h(Class cls, Class cls2, com.amazon.aps.iva.zc.c cVar) {
        com.amazon.aps.iva.zc.d dVar = this.f;
        synchronized (dVar) {
            dVar.a.add(new d.a(cls, cls2, cVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[Catch: all -> 0x0043, LOOP:0: B:12:0x0023->B:14:0x0029, LOOP_END, TryCatch #3 {, blocks: (B:4:0x0007, B:5:0x0009, B:10:0x001e, B:11:0x001f, B:12:0x0023, B:14:0x0029, B:15:0x0033, B:6:0x000a, B:7:0x000e, B:9:0x001d, B:21:0x003f, B:22:0x0040), top: B:30:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.bumptech.glide.integration.okhttp3.a.C0944a r7) {
        /*
            r6 = this;
            java.lang.Class<com.amazon.aps.iva.rc.g> r0 = com.amazon.aps.iva.rc.g.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            com.amazon.aps.iva.rc.q r2 = r6.a
            monitor-enter(r2)
            com.amazon.aps.iva.rc.s r3 = r2.a     // Catch: java.lang.Throwable -> L43
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L43
            java.util.ArrayList r4 = r3.e()     // Catch: java.lang.Throwable -> L3c
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3c
            com.amazon.aps.iva.rc.s$b r5 = new com.amazon.aps.iva.rc.s$b     // Catch: java.lang.Throwable -> L3e
            r5.<init>(r0, r1, r7)     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r7 = r3.a     // Catch: java.lang.Throwable -> L3e
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L3e
            r7.add(r0, r5)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> L43
        L23:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L33
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L43
            com.amazon.aps.iva.rc.p r0 = (com.amazon.aps.iva.rc.p) r0     // Catch: java.lang.Throwable -> L43
            r0.teardown()     // Catch: java.lang.Throwable -> L43
            goto L23
        L33:
            com.amazon.aps.iva.rc.q$a r7 = r2.b     // Catch: java.lang.Throwable -> L43
            java.util.HashMap r7 = r7.a     // Catch: java.lang.Throwable -> L43
            r7.clear()     // Catch: java.lang.Throwable -> L43
            monitor-exit(r2)
            return
        L3c:
            r7 = move-exception
            goto L41
        L3e:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            throw r7     // Catch: java.lang.Throwable -> L3c
        L41:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            throw r7     // Catch: java.lang.Throwable -> L43
        L43:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ec.d.i(com.bumptech.glide.integration.okhttp3.a$a):void");
    }
}
