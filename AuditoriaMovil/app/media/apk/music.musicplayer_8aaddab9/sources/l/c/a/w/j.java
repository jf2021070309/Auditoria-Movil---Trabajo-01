package l.c.a.w;

import l.c.a.p;
import l.c.a.q;
/* loaded from: classes2.dex */
public final class j {
    public static final k<p> a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final k<l.c.a.t.h> f9809b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final k<l> f9810c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final k<p> f9811d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final k<q> f9812e = new e();

    /* renamed from: f  reason: collision with root package name */
    public static final k<l.c.a.e> f9813f = new f();

    /* renamed from: g  reason: collision with root package name */
    public static final k<l.c.a.g> f9814g = new g();

    /* loaded from: classes2.dex */
    public class a implements k<p> {
        @Override // l.c.a.w.k
        public p a(l.c.a.w.e eVar) {
            return (p) eVar.query(this);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements k<l.c.a.t.h> {
        @Override // l.c.a.w.k
        public l.c.a.t.h a(l.c.a.w.e eVar) {
            return (l.c.a.t.h) eVar.query(this);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements k<l> {
        @Override // l.c.a.w.k
        public l a(l.c.a.w.e eVar) {
            return (l) eVar.query(this);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements k<p> {
        @Override // l.c.a.w.k
        public p a(l.c.a.w.e eVar) {
            p pVar = (p) eVar.query(j.a);
            return pVar != null ? pVar : (p) eVar.query(j.f9812e);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements k<q> {
        @Override // l.c.a.w.k
        public q a(l.c.a.w.e eVar) {
            l.c.a.w.a aVar = l.c.a.w.a.OFFSET_SECONDS;
            if (eVar.isSupported(aVar)) {
                return q.K(eVar.get(aVar));
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class f implements k<l.c.a.e> {
        @Override // l.c.a.w.k
        public l.c.a.e a(l.c.a.w.e eVar) {
            l.c.a.w.a aVar = l.c.a.w.a.EPOCH_DAY;
            if (eVar.isSupported(aVar)) {
                return l.c.a.e.l0(eVar.getLong(aVar));
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class g implements k<l.c.a.g> {
        @Override // l.c.a.w.k
        public l.c.a.g a(l.c.a.w.e eVar) {
            l.c.a.w.a aVar = l.c.a.w.a.NANO_OF_DAY;
            if (eVar.isSupported(aVar)) {
                return l.c.a.g.z(eVar.getLong(aVar));
            }
            return null;
        }
    }
}
