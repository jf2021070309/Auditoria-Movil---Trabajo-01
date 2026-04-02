package com.amazon.aps.iva.rf;

import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PremiumDubOverlay.kt */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: PremiumDubOverlay.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "premium_dub_overlay");
            return q.a;
        }
    }

    /* compiled from: PremiumDubOverlay.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "premium_dub_overlay_title");
            return q.a;
        }
    }

    /* compiled from: PremiumDubOverlay.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "premium_dub_overlay_subtitle");
            return q.a;
        }
    }

    /* compiled from: PremiumDubOverlay.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "premium_dub_overlay_subscription_button");
            return q.a;
        }
    }

    /* compiled from: PremiumDubOverlay.kt */
    /* renamed from: com.amazon.aps.iva.rf.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0680e extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final C0680e h = new C0680e();

        public C0680e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "premium_dub_overlay_fallback_button");
            return q.a;
        }
    }

    /* compiled from: PremiumDubOverlay.kt */
    /* loaded from: classes.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<String, q> h;
        public final /* synthetic */ com.amazon.aps.iva.rf.f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(com.amazon.aps.iva.xb0.l<? super String, q> lVar, com.amazon.aps.iva.rf.f fVar) {
            super(1);
            this.h = lVar;
            this.i = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fs.b bVar) {
            j.f(bVar, "it");
            this.h.invoke(this.i.c);
            return q.a;
        }
    }

    /* compiled from: PremiumDubOverlay.kt */
    /* loaded from: classes.dex */
    public static final class g extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.rf.f h;
        public final /* synthetic */ com.amazon.aps.iva.rf.c i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<String, q> k;
        public final /* synthetic */ com.amazon.aps.iva.a1.f l;
        public final /* synthetic */ int m;
        public final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(com.amazon.aps.iva.rf.f fVar, com.amazon.aps.iva.rf.c cVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fs.b, q> lVar, com.amazon.aps.iva.xb0.l<? super String, q> lVar2, com.amazon.aps.iva.a1.f fVar2, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = cVar;
            this.j = lVar;
            this.k = lVar2;
            this.l = fVar2;
            this.m = i;
            this.n = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            e.a(this.h, this.i, this.j, this.k, this.l, iVar, com.amazon.aps.iva.ff0.b.I(this.m | 1), this.n);
            return q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.rf.f r38, com.amazon.aps.iva.rf.c r39, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> r40, com.amazon.aps.iva.xb0.l<? super java.lang.String, com.amazon.aps.iva.kb0.q> r41, com.amazon.aps.iva.a1.f r42, com.amazon.aps.iva.o0.i r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rf.e.a(com.amazon.aps.iva.rf.f, com.amazon.aps.iva.rf.c, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
