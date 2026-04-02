package com.amazon.aps.iva.vm;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.nm.c;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.um.f;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xy.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.ArrayList;
/* compiled from: SwitchProfileScreenController.kt */
/* loaded from: classes2.dex */
public final class e extends f0 implements com.amazon.aps.iva.vm.c {
    public final com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> b;
    public final com.amazon.aps.iva.dm.a c;
    public final v0 d;

    /* compiled from: SwitchProfileScreenController.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.em.b, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.em.b bVar) {
            n.A(e.this.d, com.amazon.aps.iva.vm.d.h);
            return q.a;
        }
    }

    /* compiled from: SwitchProfileScreenController.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<Throwable, com.amazon.aps.iva.em.b, q> {
        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(Throwable th, com.amazon.aps.iva.em.b bVar) {
            Throwable th2 = th;
            j.f(th2, "ex");
            n.A(e.this.d, new f(th2));
            return q.a;
        }
    }

    /* compiled from: SwitchProfileScreenController.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.em.b, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.em.b bVar) {
            com.amazon.aps.iva.em.b bVar2 = bVar;
            j.f(bVar2, "profileData");
            n.A(e.this.d, new g(bVar2));
            return q.a;
        }
    }

    /* compiled from: SwitchProfileScreenController.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.wm.a.values().length];
            try {
                iArr[com.amazon.aps.iva.wm.a.SWITCH_PROFILE_EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.wm.a.SWITCH_PROFILE_ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.wm.a.SWITCH_PROFILE_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: SwitchProfileScreenController.kt */
    /* renamed from: com.amazon.aps.iva.vm.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0804e extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.um.e, com.amazon.aps.iva.um.e> {
        public final /* synthetic */ com.amazon.aps.iva.pe0.b<com.amazon.aps.iva.ym.c> h;
        public final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0804e(com.amazon.aps.iva.pe0.b<com.amazon.aps.iva.ym.c> bVar, boolean z) {
            super(1);
            this.h = bVar;
            this.i = z;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.um.e invoke(com.amazon.aps.iva.um.e eVar) {
            com.amazon.aps.iva.um.e eVar2 = eVar;
            j.f(eVar2, "$this$set");
            return com.amazon.aps.iva.um.e.a(eVar2, new g.c(this.h, null), null, this.i, 2);
        }
    }

    public e(com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> bVar, com.amazon.aps.iva.dm.a aVar) {
        j.f(bVar, "navigator");
        j.f(aVar, "profilesGateway");
        this.b = bVar;
        this.c = aVar;
        this.d = x.e(new com.amazon.aps.iva.um.e(new g.c(com.amazon.aps.iva.ym.c.i, null), null, false));
        aVar.b(1L);
        com.amazon.aps.iva.bm.a a2 = aVar.a();
        g0 D = w.D(this);
        a aVar2 = new a();
        b bVar2 = new b();
        c cVar = new c();
        j.f(a2, "<this>");
        com.amazon.aps.iva.dg.b.A(D, new a0(a2, new i(null, aVar2, cVar, bVar2)));
    }

    @Override // com.amazon.aps.iva.ri.a
    public final void K4(com.amazon.aps.iva.um.f fVar) {
        com.amazon.aps.iva.um.f fVar2 = fVar;
        j.f(fVar2, "event");
        if (j.a(fVar2, f.c.a)) {
            N8(true);
        } else if (j.a(fVar2, f.b.a)) {
            N8(false);
        } else {
            boolean a2 = j.a(fVar2, f.a.a);
            com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> bVar = this.b;
            if (a2) {
                bVar.w7(null);
            } else if (j.a(fVar2, f.e.a)) {
                this.c.b(0L);
            } else if (fVar2 instanceof f.d) {
                com.amazon.aps.iva.ym.c cVar = ((f.d) fVar2).a;
                int i = d.a[cVar.e.ordinal()];
                String str = cVar.d;
                String str2 = cVar.c;
                String str3 = cVar.a;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            bVar.v1(c.C0543c.a, new com.amazon.aps.iva.an.b(str3, str, str2));
                            return;
                        }
                        return;
                    }
                    bVar.v1(c.a.a, new com.amazon.aps.iva.mm.a((String) null, (String) null, (String) null, 15));
                    return;
                }
                bVar.v1(c.b.a, new com.amazon.aps.iva.mm.a(str3, str2, str, 8));
            }
        }
    }

    public final void N8(boolean z) {
        com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.ym.c> aVar;
        v0 v0Var = this.d;
        g.c<com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.ym.c>> a2 = ((com.amazon.aps.iva.um.e) v0Var.getValue()).a.a();
        if (a2 != null && (aVar = a2.a) != null) {
            ArrayList arrayList = new ArrayList(r.Y(aVar));
            for (com.amazon.aps.iva.ym.c cVar : aVar) {
                arrayList.add(com.amazon.aps.iva.ym.c.a(cVar, com.amazon.aps.iva.aq.j.A(cVar, z)));
            }
            n.A(v0Var, new C0804e(x.p0(arrayList), z));
        }
    }

    @Override // com.amazon.aps.iva.ri.a
    public final u0<com.amazon.aps.iva.um.e> getState() {
        return this.d;
    }
}
