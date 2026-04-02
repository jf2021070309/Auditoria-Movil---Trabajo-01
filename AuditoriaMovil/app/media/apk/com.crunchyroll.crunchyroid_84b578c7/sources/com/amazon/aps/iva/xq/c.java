package com.amazon.aps.iva.xq;

import com.amazon.aps.iva.fr.a;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.xq.e;
import com.amazon.aps.iva.xq.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: RumActionScope.kt */
/* loaded from: classes2.dex */
public final class c implements h {
    public final h a;
    public final boolean b;
    public final com.amazon.aps.iva.wq.d c;
    public final com.amazon.aps.iva.aq.a d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public com.amazon.aps.iva.sq.d i;
    public String j;
    public final long k;
    public long l;
    public final LinkedHashMap m;
    public final ArrayList n;
    public long o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public boolean t;

    /* compiled from: RumActionScope.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<WeakReference<Object>, Boolean> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(WeakReference<Object> weakReference) {
            boolean z;
            WeakReference<Object> weakReference2 = weakReference;
            com.amazon.aps.iva.yb0.j.f(weakReference2, "it");
            if (weakReference2.get() == null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public c() {
        throw null;
    }

    public c(h hVar, boolean z, com.amazon.aps.iva.vq.d dVar, com.amazon.aps.iva.sq.d dVar2, String str, Map map, long j, com.amazon.aps.iva.wq.d dVar3, com.amazon.aps.iva.aq.a aVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "parentScope");
        com.amazon.aps.iva.yb0.j.f(dVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(dVar2, "initialType");
        com.amazon.aps.iva.yb0.j.f(str, "initialName");
        com.amazon.aps.iva.yb0.j.f(map, "initialAttributes");
        this.a = hVar;
        this.b = z;
        this.c = dVar3;
        this.d = aVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.e = timeUnit.toNanos(100L);
        this.f = timeUnit.toNanos(5000L);
        this.g = dVar.a + j;
        this.h = j0.d("randomUUID().toString()");
        this.i = dVar2;
        this.j = str;
        long j2 = dVar.b;
        this.k = j2;
        this.l = j2;
        LinkedHashMap b0 = i0.b0(map);
        b0.putAll(com.amazon.aps.iva.sq.c.a);
        this.m = b0;
        this.n = new ArrayList();
    }

    @Override // com.amazon.aps.iva.xq.h
    public final h a(f fVar, com.amazon.aps.iva.sp.c<Object> cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        com.amazon.aps.iva.yb0.j.f(cVar, "writer");
        long j = fVar.a().b;
        boolean z4 = false;
        if (j - this.l > this.e) {
            z = true;
        } else {
            z = false;
        }
        if (j - this.k > this.f) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = this.n;
        t.h0(arrayList, a.h);
        if (this.b && !this.t) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && arrayList.isEmpty() && !z3) {
            z4 = true;
        }
        if (z4) {
            d(this.l, cVar);
        } else if (z2) {
            d(j, cVar);
        } else if (fVar instanceof f.p) {
            d(this.l, cVar);
        } else if (fVar instanceof f.t) {
            arrayList.clear();
            d(j, cVar);
        } else if (fVar instanceof f.y) {
            arrayList.clear();
            d(j, cVar);
        } else if (fVar instanceof f.u) {
            f.u uVar = (f.u) fVar;
            com.amazon.aps.iva.sq.d dVar = uVar.a;
            if (dVar != null) {
                this.i = dVar;
            }
            String str = uVar.b;
            if (str != null) {
                this.j = str;
            }
            this.m.putAll(uVar.c);
            this.t = true;
            this.l = j;
        } else if (fVar instanceof f.s) {
            this.l = j;
            this.o++;
            arrayList.add(new WeakReference(((f.s) fVar).a));
        } else if (fVar instanceof f.v) {
            f.v vVar = (f.v) fVar;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (com.amazon.aps.iva.yb0.j.a(((WeakReference) obj).get(), vVar.a)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            WeakReference weakReference = (WeakReference) obj;
            if (weakReference != null) {
                arrayList.remove(weakReference);
                this.l = j;
            }
        } else if (fVar instanceof f.d) {
            this.l = j;
            this.p++;
            if (((f.d) fVar).e) {
                this.q++;
                d(j, cVar);
            }
        } else if (fVar instanceof f.w) {
            c(j, ((f.w) fVar).a);
        } else if (fVar instanceof f.x) {
            f.x xVar = (f.x) fVar;
            c(j, null);
        } else if (fVar instanceof f.e) {
            this.l = j;
            this.r++;
        }
        if (this.s) {
            return null;
        }
        return this;
    }

    @Override // com.amazon.aps.iva.xq.h
    public final com.amazon.aps.iva.vq.a b() {
        return this.a.b();
    }

    public final void c(long j, String str) {
        Object obj;
        ArrayList arrayList = this.n;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (com.amazon.aps.iva.yb0.j.a(((WeakReference) obj).get(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        WeakReference weakReference = (WeakReference) obj;
        if (weakReference != null) {
            arrayList.remove(weakReference);
            this.l = j;
            this.o--;
            this.p++;
        }
    }

    public final void d(long j, com.amazon.aps.iva.sp.c<Object> cVar) {
        a.d dVar;
        if (this.s) {
            return;
        }
        com.amazon.aps.iva.sq.d dVar2 = this.i;
        LinkedHashMap linkedHashMap = this.m;
        linkedHashMap.putAll(com.amazon.aps.iva.sq.c.a);
        com.amazon.aps.iva.vq.a b = b();
        com.amazon.aps.iva.eq.b b2 = com.amazon.aps.iva.lp.a.k.b();
        long j2 = this.g;
        com.amazon.aps.iva.yb0.j.f(dVar2, "<this>");
        switch (e.a.d[dVar2.ordinal()]) {
            case 1:
                dVar = a.d.TAP;
                break;
            case 2:
                dVar = a.d.SCROLL;
                break;
            case 3:
                dVar = a.d.SWIPE;
                break;
            case 4:
                dVar = a.d.CLICK;
                break;
            case 5:
                dVar = a.d.BACK;
                break;
            case 6:
                dVar = a.d.CUSTOM;
                break;
            default:
                throw new com.amazon.aps.iva.kb0.h();
        }
        a.C0257a c0257a = new a.C0257a(dVar, this.h, Long.valueOf(Math.max(j - this.k, 1L)), new a.x(this.j), new a.o(this.p), new a.j(this.q), new a.q(this.r), new a.t(this.o));
        String str = b.c;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = b.e;
        if (str3 != null) {
            str2 = str3;
        }
        a.z zVar = new a.z(str, str2, b.d);
        a.e eVar = new a.e(b.a);
        a.b bVar = new a.b(b.b, a.c.USER, null);
        a.u uVar = (a.u) this.c.d.getValue();
        a.y yVar = new a.y(b2.a, b2.b, b2.c, b2.d);
        com.amazon.aps.iva.aq.a aVar = this.d;
        cVar.b(new com.amazon.aps.iva.fr.a(j2, eVar, bVar, uVar, zVar, yVar, new a.r(aVar.h(), aVar.d(), aVar.g()), new a.m(e.a(aVar.e()), aVar.getDeviceName(), aVar.c(), aVar.f(), aVar.a()), new a.k(new a.l(a.s.PLAN_1), 2), new a.i(linkedHashMap), c0257a));
        this.s = true;
    }

    @Override // com.amazon.aps.iva.xq.h
    public final boolean isActive() {
        return !this.t;
    }
}
