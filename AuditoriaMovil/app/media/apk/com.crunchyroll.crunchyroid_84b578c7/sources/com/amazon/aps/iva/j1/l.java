package com.amazon.aps.iva.j1;

import com.amazon.aps.iva.f1.n0;
import com.amazon.aps.iva.f1.y0;
import com.amazon.aps.iva.f1.z0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
/* compiled from: VectorCompose.kt */
/* loaded from: classes.dex */
public final class l {

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.j1.c> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.j1.c invoke() {
            return new com.amazon.aps.iva.j1.c();
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<com.amazon.aps.iva.j1.f> h;
        public final /* synthetic */ int i;
        public final /* synthetic */ String j;
        public final /* synthetic */ com.amazon.aps.iva.f1.s k;
        public final /* synthetic */ float l;
        public final /* synthetic */ com.amazon.aps.iva.f1.s m;
        public final /* synthetic */ float n;
        public final /* synthetic */ float o;
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;
        public final /* synthetic */ float r;
        public final /* synthetic */ float s;
        public final /* synthetic */ float t;
        public final /* synthetic */ float u;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a0(List<? extends com.amazon.aps.iva.j1.f> list, int i, String str, com.amazon.aps.iva.f1.s sVar, float f, com.amazon.aps.iva.f1.s sVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, int i5, int i6) {
            super(2);
            this.h = list;
            this.i = i;
            this.j = str;
            this.k = sVar;
            this.l = f;
            this.m = sVar2;
            this.n = f2;
            this.o = f3;
            this.p = i2;
            this.q = i3;
            this.r = f4;
            this.s = f5;
            this.t = f6;
            this.u = f7;
            this.v = i4;
            this.w = i5;
            this.x = i6;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            l.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, iVar, com.amazon.aps.iva.ff0.b.I(this.v | 1), com.amazon.aps.iva.ff0.b.I(this.w), this.x);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.c, String, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.c cVar, String str) {
            com.amazon.aps.iva.j1.c cVar2 = cVar;
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(str2, "it");
            cVar2.h = str2;
            cVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.j1.e> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(C0396l c0396l) {
            super(0);
            this.h = c0396l;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.amazon.aps.iva.j1.e, java.lang.Object] */
        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.j1.e invoke() {
            return this.h.invoke();
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.c, Float, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.c cVar, Float f) {
            com.amazon.aps.iva.j1.c cVar2 = cVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            cVar2.i = floatValue;
            cVar2.p = true;
            cVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.c, Float, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.c cVar, Float f) {
            com.amazon.aps.iva.j1.c cVar2 = cVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            cVar2.j = floatValue;
            cVar2.p = true;
            cVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.c, Float, com.amazon.aps.iva.kb0.q> {
        public static final e h = new e();

        public e() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.c cVar, Float f) {
            com.amazon.aps.iva.j1.c cVar2 = cVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            cVar2.k = floatValue;
            cVar2.p = true;
            cVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.c, Float, com.amazon.aps.iva.kb0.q> {
        public static final f h = new f();

        public f() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.c cVar, Float f) {
            com.amazon.aps.iva.j1.c cVar2 = cVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            cVar2.l = floatValue;
            cVar2.p = true;
            cVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.c, Float, com.amazon.aps.iva.kb0.q> {
        public static final g h = new g();

        public g() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.c cVar, Float f) {
            com.amazon.aps.iva.j1.c cVar2 = cVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            cVar2.m = floatValue;
            cVar2.p = true;
            cVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.c, Float, com.amazon.aps.iva.kb0.q> {
        public static final h h = new h();

        public h() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.c cVar, Float f) {
            com.amazon.aps.iva.j1.c cVar2 = cVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            cVar2.n = floatValue;
            cVar2.p = true;
            cVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.c, Float, com.amazon.aps.iva.kb0.q> {
        public static final i h = new i();

        public i() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.c cVar, Float f) {
            com.amazon.aps.iva.j1.c cVar2 = cVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            cVar2.o = floatValue;
            cVar2.p = true;
            cVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.c, List<? extends com.amazon.aps.iva.j1.f>, com.amazon.aps.iva.kb0.q> {
        public static final j h = new j();

        public j() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.c cVar, List<? extends com.amazon.aps.iva.j1.f> list) {
            com.amazon.aps.iva.j1.c cVar2 = cVar;
            List<? extends com.amazon.aps.iva.j1.f> list2 = list;
            com.amazon.aps.iva.yb0.j.f(cVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(list2, "it");
            cVar2.d = list2;
            cVar2.e = true;
            cVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String h;
        public final /* synthetic */ float i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;
        public final /* synthetic */ float l;
        public final /* synthetic */ float m;
        public final /* synthetic */ float n;
        public final /* synthetic */ float o;
        public final /* synthetic */ List<com.amazon.aps.iva.j1.f> p;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends com.amazon.aps.iva.j1.f> list, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i, int i2) {
            super(2);
            this.h = str;
            this.i = f;
            this.j = f2;
            this.k = f3;
            this.l = f4;
            this.m = f5;
            this.n = f6;
            this.o = f7;
            this.p = list;
            this.q = pVar;
            this.r = i;
            this.s = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            l.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, iVar, com.amazon.aps.iva.ff0.b.I(this.r | 1), this.s);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* renamed from: com.amazon.aps.iva.j1.l$l  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0396l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.j1.e> {
        public static final C0396l h = new C0396l();

        public C0396l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.j1.e invoke() {
            return new com.amazon.aps.iva.j1.e();
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, y0, com.amazon.aps.iva.kb0.q> {
        public static final m h = new m();

        public m() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, y0 y0Var) {
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            int i = y0Var.a;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            eVar2.h = i;
            eVar2.o = true;
            eVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, Float, com.amazon.aps.iva.kb0.q> {
        public static final n h = new n();

        public n() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, Float f) {
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            eVar2.j = floatValue;
            eVar2.o = true;
            eVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, Float, com.amazon.aps.iva.kb0.q> {
        public static final o h = new o();

        public o() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, Float f) {
            boolean z;
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            if (eVar2.k == floatValue) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                eVar2.k = floatValue;
                eVar2.p = true;
                eVar2.c();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, Float, com.amazon.aps.iva.kb0.q> {
        public static final p h = new p();

        public p() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, Float f) {
            boolean z;
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            if (eVar2.l == floatValue) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                eVar2.l = floatValue;
                eVar2.p = true;
                eVar2.c();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, Float, com.amazon.aps.iva.kb0.q> {
        public static final q h = new q();

        public q() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, Float f) {
            boolean z;
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            if (eVar2.m == floatValue) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                eVar2.m = floatValue;
                eVar2.p = true;
                eVar2.c();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, String, com.amazon.aps.iva.kb0.q> {
        public static final r h = new r();

        public r() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, String str) {
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(str, "it");
            eVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, List<? extends com.amazon.aps.iva.j1.f>, com.amazon.aps.iva.kb0.q> {
        public static final s h = new s();

        public s() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, List<? extends com.amazon.aps.iva.j1.f> list) {
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            List<? extends com.amazon.aps.iva.j1.f> list2 = list;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(list2, "it");
            eVar2.d = list2;
            eVar2.n = true;
            eVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, n0, com.amazon.aps.iva.kb0.q> {
        public static final t h = new t();

        public t() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, n0 n0Var) {
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            int i = n0Var.a;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            eVar2.s.f(i);
            eVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, com.amazon.aps.iva.f1.s, com.amazon.aps.iva.kb0.q> {
        public static final u h = new u();

        public u() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, com.amazon.aps.iva.f1.s sVar) {
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            eVar2.b = sVar;
            eVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, Float, com.amazon.aps.iva.kb0.q> {
        public static final v h = new v();

        public v() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, Float f) {
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            eVar2.c = floatValue;
            eVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, com.amazon.aps.iva.f1.s, com.amazon.aps.iva.kb0.q> {
        public static final w h = new w();

        public w() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, com.amazon.aps.iva.f1.s sVar) {
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            eVar2.g = sVar;
            eVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, Float, com.amazon.aps.iva.kb0.q> {
        public static final x h = new x();

        public x() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, Float f) {
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            eVar2.e = floatValue;
            eVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, Float, com.amazon.aps.iva.kb0.q> {
        public static final y h = new y();

        public y() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, Float f) {
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            float floatValue = f.floatValue();
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            eVar2.f = floatValue;
            eVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class z extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.j1.e, z0, com.amazon.aps.iva.kb0.q> {
        public static final z h = new z();

        public z() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j1.e eVar, z0 z0Var) {
            com.amazon.aps.iva.j1.e eVar2 = eVar;
            int i = z0Var.a;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$set");
            eVar2.i = i;
            eVar2.o = true;
            eVar2.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, java.util.List<? extends com.amazon.aps.iva.j1.f> r27, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r28, com.amazon.aps.iva.o0.i r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j1.l.a(java.lang.String, float, float, float, float, float, float, float, java.util.List, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void b(List<? extends com.amazon.aps.iva.j1.f> list, int i2, String str, com.amazon.aps.iva.f1.s sVar, float f2, com.amazon.aps.iva.f1.s sVar2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, com.amazon.aps.iva.o0.i iVar, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        com.amazon.aps.iva.yb0.j.f(list, "pathData");
        com.amazon.aps.iva.o0.j g2 = iVar.g(-1478270750);
        if ((i7 & 2) != 0) {
            int i11 = com.amazon.aps.iva.j1.o.a;
            i8 = 0;
        } else {
            i8 = i2;
        }
        String str2 = (i7 & 4) != 0 ? "" : str;
        com.amazon.aps.iva.f1.s sVar3 = (i7 & 8) != 0 ? null : sVar;
        float f9 = (i7 & 16) != 0 ? 1.0f : f2;
        com.amazon.aps.iva.f1.s sVar4 = (i7 & 32) != 0 ? null : sVar2;
        float f10 = (i7 & 64) != 0 ? 1.0f : f3;
        float f11 = (i7 & 128) != 0 ? 0.0f : f4;
        if ((i7 & 256) != 0) {
            int i12 = com.amazon.aps.iva.j1.o.a;
            i9 = 0;
        } else {
            i9 = i3;
        }
        if ((i7 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            int i13 = com.amazon.aps.iva.j1.o.a;
            i10 = 0;
        } else {
            i10 = i4;
        }
        float f12 = (i7 & 1024) != 0 ? 4.0f : f5;
        float f13 = (i7 & 2048) != 0 ? 0.0f : f6;
        float f14 = (i7 & 4096) != 0 ? 1.0f : f7;
        float f15 = (i7 & 8192) != 0 ? 0.0f : f8;
        e0.b bVar = e0.a;
        g2.s(1886828752);
        if (g2.a instanceof com.amazon.aps.iva.j1.j) {
            g2.z0();
            if (g2.M) {
                g2.w(new b0(C0396l.h));
            } else {
                g2.m();
            }
            com.amazon.aps.iva.cq.b.k0(g2, str2, r.h);
            com.amazon.aps.iva.cq.b.k0(g2, list, s.h);
            com.amazon.aps.iva.cq.b.k0(g2, new n0(i8), t.h);
            com.amazon.aps.iva.cq.b.k0(g2, sVar3, u.h);
            com.amazon.aps.iva.cq.b.k0(g2, Float.valueOf(f9), v.h);
            com.amazon.aps.iva.cq.b.k0(g2, sVar4, w.h);
            com.amazon.aps.iva.cq.b.k0(g2, Float.valueOf(f10), x.h);
            com.amazon.aps.iva.cq.b.k0(g2, Float.valueOf(f11), y.h);
            com.amazon.aps.iva.cq.b.k0(g2, new z0(i10), z.h);
            com.amazon.aps.iva.cq.b.k0(g2, new y0(i9), m.h);
            com.amazon.aps.iva.cq.b.k0(g2, Float.valueOf(f12), n.h);
            com.amazon.aps.iva.cq.b.k0(g2, Float.valueOf(f13), o.h);
            com.amazon.aps.iva.cq.b.k0(g2, Float.valueOf(f14), p.h);
            com.amazon.aps.iva.cq.b.k0(g2, Float.valueOf(f15), q.h);
            g2.U(true);
            g2.U(false);
            j2 X = g2.X();
            if (X == null) {
                return;
            }
            X.d = new a0(list, i8, str2, sVar3, f9, sVar4, f10, f11, i9, i10, f12, f13, f14, f15, i5, i6, i7);
            return;
        }
        com.amazon.aps.iva.cq.b.W();
        throw null;
    }
}
