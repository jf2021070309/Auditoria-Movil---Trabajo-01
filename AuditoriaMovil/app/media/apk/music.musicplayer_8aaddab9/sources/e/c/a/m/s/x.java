package e.c.a.m.s;

import e.c.a.m.r.d;
import e.c.a.m.s.g;
import e.c.a.m.t.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class x implements g, d.a<Object> {
    public final g.a a;

    /* renamed from: b  reason: collision with root package name */
    public final h<?> f5764b;

    /* renamed from: c  reason: collision with root package name */
    public int f5765c;

    /* renamed from: d  reason: collision with root package name */
    public int f5766d = -1;

    /* renamed from: e  reason: collision with root package name */
    public e.c.a.m.k f5767e;

    /* renamed from: f  reason: collision with root package name */
    public List<e.c.a.m.t.n<File, ?>> f5768f;

    /* renamed from: g  reason: collision with root package name */
    public int f5769g;

    /* renamed from: h  reason: collision with root package name */
    public volatile n.a<?> f5770h;

    /* renamed from: i  reason: collision with root package name */
    public File f5771i;

    /* renamed from: j  reason: collision with root package name */
    public y f5772j;

    public x(h<?> hVar, g.a aVar) {
        this.f5764b = hVar;
        this.a = aVar;
    }

    @Override // e.c.a.m.s.g
    public boolean b() {
        List<Class<?>> orDefault;
        List<Class<?>> d2;
        List<e.c.a.m.k> a = this.f5764b.a();
        if (a.isEmpty()) {
            return false;
        }
        h<?> hVar = this.f5764b;
        e.c.a.g gVar = hVar.f5664c.f5459c;
        Class<?> cls = hVar.f5665d.getClass();
        Class<?> cls2 = hVar.f5668g;
        Class<?> cls3 = hVar.f5672k;
        e.c.a.p.d dVar = gVar.f5474h;
        e.c.a.s.i andSet = dVar.a.getAndSet(null);
        if (andSet == null) {
            andSet = new e.c.a.s.i(cls, cls2, cls3);
        } else {
            andSet.a = cls;
            andSet.f6029b = cls2;
            andSet.f6030c = cls3;
        }
        synchronized (dVar.f5977b) {
            orDefault = dVar.f5977b.getOrDefault(andSet, null);
        }
        dVar.a.set(andSet);
        ArrayList arrayList = orDefault;
        if (orDefault == null) {
            ArrayList arrayList2 = new ArrayList();
            e.c.a.m.t.p pVar = gVar.a;
            synchronized (pVar) {
                d2 = pVar.a.d(cls);
            }
            Iterator it = ((ArrayList) d2).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) gVar.f5469c.b((Class) it.next(), cls2)).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((ArrayList) gVar.f5472f.a(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            e.c.a.p.d dVar2 = gVar.f5474h;
            List<Class<?>> unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (dVar2.f5977b) {
                dVar2.f5977b.put(new e.c.a.s.i(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            if (File.class.equals(this.f5764b.f5672k)) {
                return false;
            }
            StringBuilder y = e.a.d.a.a.y("Failed to find any load path from ");
            y.append(this.f5764b.f5665d.getClass());
            y.append(" to ");
            y.append(this.f5764b.f5672k);
            throw new IllegalStateException(y.toString());
        }
        while (true) {
            List<e.c.a.m.t.n<File, ?>> list = this.f5768f;
            if (list != null) {
                if (this.f5769g < list.size()) {
                    this.f5770h = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f5769g < this.f5768f.size())) {
                            break;
                        }
                        List<e.c.a.m.t.n<File, ?>> list2 = this.f5768f;
                        int i2 = this.f5769g;
                        this.f5769g = i2 + 1;
                        File file = this.f5771i;
                        h<?> hVar2 = this.f5764b;
                        this.f5770h = list2.get(i2).b(file, hVar2.f5666e, hVar2.f5667f, hVar2.f5670i);
                        if (this.f5770h != null && this.f5764b.g(this.f5770h.f5806c.a())) {
                            this.f5770h.f5806c.e(this.f5764b.o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i3 = this.f5766d + 1;
            this.f5766d = i3;
            if (i3 >= arrayList.size()) {
                int i4 = this.f5765c + 1;
                this.f5765c = i4;
                if (i4 >= a.size()) {
                    return false;
                }
                this.f5766d = 0;
            }
            e.c.a.m.k kVar = a.get(this.f5765c);
            Class<?> cls5 = arrayList.get(this.f5766d);
            e.c.a.m.q<Z> f2 = this.f5764b.f(cls5);
            h<?> hVar3 = this.f5764b;
            this.f5772j = new y(hVar3.f5664c.f5458b, kVar, hVar3.f5675n, hVar3.f5666e, hVar3.f5667f, f2, cls5, hVar3.f5670i);
            File b2 = hVar3.b().b(this.f5772j);
            this.f5771i = b2;
            if (b2 != null) {
                this.f5767e = kVar;
                this.f5768f = this.f5764b.f5664c.f5459c.f(b2);
                this.f5769g = 0;
            }
        }
    }

    @Override // e.c.a.m.r.d.a
    public void c(Exception exc) {
        this.a.a(this.f5772j, exc, this.f5770h.f5806c, e.c.a.m.a.RESOURCE_DISK_CACHE);
    }

    @Override // e.c.a.m.s.g
    public void cancel() {
        n.a<?> aVar = this.f5770h;
        if (aVar != null) {
            aVar.f5806c.cancel();
        }
    }

    @Override // e.c.a.m.r.d.a
    public void f(Object obj) {
        this.a.d(this.f5767e, obj, this.f5770h.f5806c, e.c.a.m.a.RESOURCE_DISK_CACHE, this.f5772j);
    }
}
