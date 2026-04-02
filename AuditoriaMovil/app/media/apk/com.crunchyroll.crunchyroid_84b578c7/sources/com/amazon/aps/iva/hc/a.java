package com.amazon.aps.iva.hc;

import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.hc.n;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.s;
/* compiled from: Transition.kt */
/* loaded from: classes.dex */
public final class a implements n {
    public static final a a = new a();
    public static final c b = c.h;
    public static final b c = b.h;

    /* compiled from: Transition.kt */
    /* renamed from: com.amazon.aps.iva.hc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0329a implements n.a {
        public static final C0329a a = new C0329a();

        @Override // com.amazon.aps.iva.hc.n.a
        public final void build() {
            a aVar = a.a;
        }
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements s<com.amazon.aps.iva.h1.e, com.amazon.aps.iva.i1.c, com.amazon.aps.iva.e1.g, Float, y, q> {
        public static final b h = new b();

        public b() {
            super(5);
        }

        @Override // com.amazon.aps.iva.xb0.s
        public final q V0(com.amazon.aps.iva.h1.e eVar, com.amazon.aps.iva.i1.c cVar, com.amazon.aps.iva.e1.g gVar, Float f, y yVar) {
            com.amazon.aps.iva.h1.e eVar2 = eVar;
            com.amazon.aps.iva.i1.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$null");
            com.amazon.aps.iva.yb0.j.f(cVar2, "painter");
            cVar2.m18drawx_KDEd0(eVar2, gVar.a, f.floatValue(), yVar);
            return q.a;
        }
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements s<com.amazon.aps.iva.h1.e, com.amazon.aps.iva.i1.c, com.amazon.aps.iva.e1.g, Float, y, q> {
        public static final c h = new c();

        public c() {
            super(5);
        }

        @Override // com.amazon.aps.iva.xb0.s
        public final q V0(com.amazon.aps.iva.h1.e eVar, com.amazon.aps.iva.i1.c cVar, com.amazon.aps.iva.e1.g gVar, Float f, y yVar) {
            long j = gVar.a;
            f.floatValue();
            com.amazon.aps.iva.yb0.j.f(eVar, "$this$null");
            com.amazon.aps.iva.yb0.j.f(cVar, "<anonymous parameter 0>");
            return q.a;
        }
    }

    @Override // com.amazon.aps.iva.hc.n
    public final q b() {
        return q.a;
    }

    @Override // com.amazon.aps.iva.hc.n
    public final q stop() {
        return q.a;
    }

    @Override // com.amazon.aps.iva.hc.n
    public final void a() {
    }

    @Override // com.amazon.aps.iva.hc.n
    public final void c() {
    }
}
