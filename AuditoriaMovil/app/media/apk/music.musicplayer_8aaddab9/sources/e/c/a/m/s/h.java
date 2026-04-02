package e.c.a.m.s;

import e.c.a.m.s.i;
import e.c.a.m.s.l;
import e.c.a.m.t.n;
import e.c.a.m.u.h.f;
import e.c.a.p.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class h<Transcode> {
    public final List<n.a<?>> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<e.c.a.m.k> f5663b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public e.c.a.d f5664c;

    /* renamed from: d  reason: collision with root package name */
    public Object f5665d;

    /* renamed from: e  reason: collision with root package name */
    public int f5666e;

    /* renamed from: f  reason: collision with root package name */
    public int f5667f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f5668g;

    /* renamed from: h  reason: collision with root package name */
    public i.d f5669h;

    /* renamed from: i  reason: collision with root package name */
    public e.c.a.m.m f5670i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, e.c.a.m.q<?>> f5671j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f5672k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5673l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5674m;

    /* renamed from: n  reason: collision with root package name */
    public e.c.a.m.k f5675n;
    public e.c.a.f o;
    public k p;
    public boolean q;
    public boolean r;

    public List<e.c.a.m.k> a() {
        if (!this.f5674m) {
            this.f5674m = true;
            this.f5663b.clear();
            List<n.a<?>> c2 = c();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a<?> aVar = c2.get(i2);
                if (!this.f5663b.contains(aVar.a)) {
                    this.f5663b.add(aVar.a);
                }
                for (int i3 = 0; i3 < aVar.f5805b.size(); i3++) {
                    if (!this.f5663b.contains(aVar.f5805b.get(i3))) {
                        this.f5663b.add(aVar.f5805b.get(i3));
                    }
                }
            }
        }
        return this.f5663b;
    }

    public e.c.a.m.s.d0.a b() {
        return ((l.c) this.f5669h).a();
    }

    public List<n.a<?>> c() {
        if (!this.f5673l) {
            this.f5673l = true;
            this.a.clear();
            List f2 = this.f5664c.f5459c.f(this.f5665d);
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a<?> b2 = ((e.c.a.m.t.n) f2.get(i2)).b(this.f5665d, this.f5666e, this.f5667f, this.f5670i);
                if (b2 != null) {
                    this.a.add(b2);
                }
            }
        }
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <Data> u<Data, ?, Transcode> d(Class<Data> cls) {
        u<Data, ?, Transcode> uVar;
        ArrayList arrayList;
        e.c.a.m.u.h.e eVar;
        e.c.a.g gVar = this.f5664c.f5459c;
        Class<?> cls2 = this.f5668g;
        Class cls3 = (Class<Transcode>) this.f5672k;
        e.c.a.p.c cVar = gVar.f5475i;
        e.c.a.s.i andSet = cVar.f5976c.getAndSet(null);
        if (andSet == null) {
            andSet = new e.c.a.s.i();
        }
        andSet.a = cls;
        andSet.f6029b = cls2;
        andSet.f6030c = cls3;
        synchronized (cVar.f5975b) {
            uVar = (u<Data, ?, Transcode>) cVar.f5975b.getOrDefault(andSet, null);
        }
        cVar.f5976c.set(andSet);
        Objects.requireNonNull(gVar.f5475i);
        if (e.c.a.p.c.a.equals(uVar)) {
            return null;
        }
        if (uVar == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) gVar.f5469c.b(cls, cls2)).iterator();
            while (it.hasNext()) {
                Class<?> cls4 = (Class) it.next();
                Iterator it2 = ((ArrayList) gVar.f5472f.a(cls4, cls3)).iterator();
                while (it2.hasNext()) {
                    Class<?> cls5 = (Class) it2.next();
                    e.c.a.p.e eVar2 = gVar.f5469c;
                    synchronized (eVar2) {
                        arrayList = new ArrayList();
                        for (String str : eVar2.a) {
                            List<e.a<?, ?>> list = eVar2.f5978b.get(str);
                            if (list != null) {
                                for (e.a<?, ?> aVar : list) {
                                    if (aVar.a(cls, cls4)) {
                                        arrayList.add(aVar.f5980c);
                                    }
                                }
                            }
                        }
                    }
                    e.c.a.m.u.h.f fVar = gVar.f5472f;
                    synchronized (fVar) {
                        if (!cls5.isAssignableFrom(cls4)) {
                            for (f.a<?, ?> aVar2 : fVar.a) {
                                if (aVar2.a(cls4, cls5)) {
                                    eVar = aVar2.f5947c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                        }
                        eVar = e.c.a.m.u.h.g.a;
                    }
                    arrayList2.add(new j(cls, cls4, cls5, arrayList, eVar, gVar.f5476j));
                }
            }
            u<Data, ?, Transcode> uVar2 = arrayList2.isEmpty() ? null : new u<>(cls, cls2, cls3, arrayList2, gVar.f5476j);
            e.c.a.p.c cVar2 = gVar.f5475i;
            synchronized (cVar2.f5975b) {
                cVar2.f5975b.put(new e.c.a.s.i(cls, cls2, cls3), uVar2 != null ? uVar2 : e.c.a.p.c.a);
            }
            return uVar2;
        }
        return uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        r1 = (e.c.a.m.d<X>) r3.f5974b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <X> e.c.a.m.d<X> e(X r6) throws e.c.a.g.e {
        /*
            r5 = this;
            e.c.a.d r0 = r5.f5664c
            e.c.a.g r0 = r0.f5459c
            e.c.a.p.a r0 = r0.f5468b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.List<e.c.a.p.a$a<?>> r2 = r0.a     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L38
        L11:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L38
            e.c.a.p.a$a r3 = (e.c.a.p.a.C0129a) r3     // Catch: java.lang.Throwable -> L38
            java.lang.Class<T> r4 = r3.a     // Catch: java.lang.Throwable -> L38
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L11
            e.c.a.m.d<T> r1 = r3.f5974b     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)
            goto L2b
        L29:
            r1 = 0
            monitor-exit(r0)
        L2b:
            if (r1 == 0) goto L2e
            return r1
        L2e:
            e.c.a.g$e r0 = new e.c.a.g$e
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L38:
            r6 = move-exception
            monitor-exit(r0)
            goto L3c
        L3b:
            throw r6
        L3c:
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.m.s.h.e(java.lang.Object):e.c.a.m.d");
    }

    public <Z> e.c.a.m.q<Z> f(Class<Z> cls) {
        e.c.a.m.q<Z> qVar = (e.c.a.m.q<Z>) this.f5671j.get(cls);
        if (qVar == null) {
            Iterator<Map.Entry<Class<?>, e.c.a.m.q<?>>> it = this.f5671j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, e.c.a.m.q<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    qVar = (e.c.a.m.q<Z>) next.getValue();
                    break;
                }
            }
        }
        if (qVar == null) {
            if (this.f5671j.isEmpty() && this.q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return (e.c.a.m.u.b) e.c.a.m.u.b.f5847b;
        }
        return qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean g(Class<?> cls) {
        return d(cls) != null;
    }
}
