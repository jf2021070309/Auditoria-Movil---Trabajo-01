package com.amazon.aps.iva.u30;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
/* compiled from: SearchResultCard.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final com.amazon.aps.iva.a1.f a = androidx.compose.foundation.c.b(f.a.c, com.amazon.aps.iva.ao.a.u, p0.a);

    /* compiled from: SearchResultCard.kt */
    /* renamed from: com.amazon.aps.iva.u30.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0754a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0754a(com.amazon.aps.iva.xb0.a<q> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke();
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "result_image_data_large");
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "result_metadata_large");
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "result_image_data");
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "result_metadata");
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ Panel h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<Boolean> i;
        public final /* synthetic */ String j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> l;
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> m;
        public final /* synthetic */ WatchlistStatus n;
        public final /* synthetic */ com.amazon.aps.iva.a1.f o;
        public final /* synthetic */ String p;
        public final /* synthetic */ boolean q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Panel panel, com.amazon.aps.iva.xb0.a<Boolean> aVar, String str, boolean z, com.amazon.aps.iva.xb0.a<q> aVar2, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> aVar3, WatchlistStatus watchlistStatus, com.amazon.aps.iva.a1.f fVar, String str2, boolean z2, int i, int i2) {
            super(2);
            this.h = panel;
            this.i = aVar;
            this.j = str;
            this.k = z;
            this.l = aVar2;
            this.m = aVar3;
            this.n = watchlistStatus;
            this.o = fVar;
            this.p = str2;
            this.q = z2;
            this.r = i;
            this.s = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, iVar, com.amazon.aps.iva.ff0.b.I(this.r | 1), this.s);
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ Panel h;
        public final /* synthetic */ LabelUiModel i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<Boolean> j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ WatchlistStatus l;
        public final /* synthetic */ com.amazon.aps.iva.a1.f m;
        public final /* synthetic */ String n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Panel panel, LabelUiModel labelUiModel, com.amazon.aps.iva.xb0.a<Boolean> aVar, boolean z, WatchlistStatus watchlistStatus, com.amazon.aps.iva.a1.f fVar, String str, int i, int i2) {
            super(2);
            this.h = panel;
            this.i = labelUiModel;
            this.j = aVar;
            this.k = z;
            this.l = watchlistStatus;
            this.m = fVar;
            this.n = str;
            this.o = i;
            this.p = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, iVar, com.amazon.aps.iva.ff0.b.I(this.o | 1), this.p);
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final h h = new h();

        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "episode_parent_title");
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final i h = new i();

        public i() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "episode_title");
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final j h = new j();

        public j() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "movie_title");
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final k h = new k();

        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "movie_metadata");
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final l h = new l();

        public l() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "episode_metadata");
            return q.a;
        }
    }

    /* compiled from: SearchResultCard.kt */
    /* loaded from: classes2.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ Panel h;
        public final /* synthetic */ String i;
        public final /* synthetic */ LabelUiModel j;
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ com.amazon.aps.iva.a1.f m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Panel panel, String str, LabelUiModel labelUiModel, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> aVar, boolean z, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = panel;
            this.i = str;
            this.j = labelUiModel;
            this.k = aVar;
            this.l = z;
            this.m = fVar;
            this.n = i;
            this.o = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.c(this.h, this.i, this.j, this.k, this.l, this.m, iVar, com.amazon.aps.iva.ff0.b.I(this.n | 1), this.o);
            return q.a;
        }
    }

    static {
        com.amazon.aps.iva.qe0.h hVar = com.amazon.aps.iva.qe0.h.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.ellation.crunchyroll.model.Panel r31, com.amazon.aps.iva.xb0.a<java.lang.Boolean> r32, java.lang.String r33, boolean r34, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r35, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> r36, com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r37, com.amazon.aps.iva.a1.f r38, java.lang.String r39, boolean r40, com.amazon.aps.iva.o0.i r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u30.a.a(com.ellation.crunchyroll.model.Panel, com.amazon.aps.iva.xb0.a, java.lang.String, boolean, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.pe0.a, com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus, com.amazon.aps.iva.a1.f, java.lang.String, boolean, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.ellation.crunchyroll.model.Panel r31, com.ellation.crunchyroll.ui.labels.LabelUiModel r32, com.amazon.aps.iva.xb0.a<java.lang.Boolean> r33, boolean r34, com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r35, com.amazon.aps.iva.a1.f r36, java.lang.String r37, com.amazon.aps.iva.o0.i r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u30.a.b(com.ellation.crunchyroll.model.Panel, com.ellation.crunchyroll.ui.labels.LabelUiModel, com.amazon.aps.iva.xb0.a, boolean, com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus, com.amazon.aps.iva.a1.f, java.lang.String, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.ellation.crunchyroll.model.Panel r49, java.lang.String r50, com.ellation.crunchyroll.ui.labels.LabelUiModel r51, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> r52, boolean r53, com.amazon.aps.iva.a1.f r54, com.amazon.aps.iva.o0.i r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u30.a.c(com.ellation.crunchyroll.model.Panel, java.lang.String, com.ellation.crunchyroll.ui.labels.LabelUiModel, com.amazon.aps.iva.pe0.a, boolean, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
