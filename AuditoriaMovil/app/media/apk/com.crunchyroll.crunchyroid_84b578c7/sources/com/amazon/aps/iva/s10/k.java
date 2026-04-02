package com.amazon.aps.iva.s10;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.ot.a;
import com.amazon.aps.iva.r10.j0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
/* compiled from: HistoryItemCard.kt */
/* loaded from: classes2.dex */
public final class k {

    /* compiled from: HistoryItemCard.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "cr_image");
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
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
            y.e(c0Var2, "card_badges");
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
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
            y.e(c0Var2, "progress_bar");
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
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
            y.e(c0Var2, "duration_label");
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ String h;
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<Image> i;
        public final /* synthetic */ LabelUiModel j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ float l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ com.amazon.aps.iva.a1.f n;
        public final /* synthetic */ com.amazon.aps.iva.pe0.b<String> o;
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, com.amazon.aps.iva.pe0.a<Image> aVar, LabelUiModel labelUiModel, boolean z, float f, boolean z2, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.pe0.b<String> bVar, int i, int i2) {
            super(2);
            this.h = str;
            this.i = aVar;
            this.j = labelUiModel;
            this.k = z;
            this.l = f;
            this.m = z2;
            this.n = fVar;
            this.o = bVar;
            this.p = i;
            this.q = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            k.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, iVar, com.amazon.aps.iva.ff0.b.I(this.p | 1), this.q);
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ j0 h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(j0 j0Var, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q> aVar2) {
            super(0);
            this.h = j0Var;
            this.i = aVar;
            this.j = aVar2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            if (this.h == j0.DISABLED) {
                this.i.invoke();
            } else {
                this.j.invoke();
            }
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final g h = new g();

        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "history_item_card");
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.amazon.aps.iva.xb0.a<q> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke();
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.r10.y h;
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> k;
        public final /* synthetic */ j0 l;
        public final /* synthetic */ com.amazon.aps.iva.a1.f m;
        public final /* synthetic */ com.amazon.aps.iva.pe0.b<String> n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.r10.y yVar, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> aVar, com.amazon.aps.iva.xb0.a<q> aVar2, com.amazon.aps.iva.xb0.a<q> aVar3, j0 j0Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.pe0.b<String> bVar, int i, int i2) {
            super(2);
            this.h = yVar;
            this.i = aVar;
            this.j = aVar2;
            this.k = aVar3;
            this.l = j0Var;
            this.m = fVar;
            this.n = bVar;
            this.o = i;
            this.p = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            k.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, iVar, com.amazon.aps.iva.ff0.b.I(this.o | 1), this.p);
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
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

    /* compiled from: HistoryItemCard.kt */
    /* renamed from: com.amazon.aps.iva.s10.k$k  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0693k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final C0693k h = new C0693k();

        public C0693k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "parent_title");
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
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
            y.e(c0Var2, "episode_title");
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
    /* loaded from: classes2.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.r10.y h;
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.amazon.aps.iva.r10.y yVar, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> aVar, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = yVar;
            this.i = aVar;
            this.j = fVar;
            this.k = i;
            this.l = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            k.c(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l);
            return q.a;
        }
    }

    /* compiled from: HistoryItemCard.kt */
    /* loaded from: classes2.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ boolean h;
        public final /* synthetic */ com.amazon.aps.iva.pe0.b<String> i;
        public final /* synthetic */ String j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z, com.amazon.aps.iva.pe0.b<String> bVar, String str, int i, int i2) {
            super(2);
            this.h = z;
            this.i = bVar;
            this.j = str;
            this.k = i;
            this.l = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            k.d(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l);
            return q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r25, com.amazon.aps.iva.pe0.a<com.ellation.crunchyroll.api.etp.model.Image> r26, com.ellation.crunchyroll.ui.labels.LabelUiModel r27, boolean r28, float r29, boolean r30, com.amazon.aps.iva.a1.f r31, com.amazon.aps.iva.pe0.b<java.lang.String> r32, com.amazon.aps.iva.o0.i r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s10.k.a(java.lang.String, com.amazon.aps.iva.pe0.a, com.ellation.crunchyroll.ui.labels.LabelUiModel, boolean, float, boolean, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.pe0.b, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.amazon.aps.iva.r10.y r27, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> r28, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r29, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r30, com.amazon.aps.iva.r10.j0 r31, com.amazon.aps.iva.a1.f r32, com.amazon.aps.iva.pe0.b<java.lang.String> r33, com.amazon.aps.iva.o0.i r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s10.k.b(com.amazon.aps.iva.r10.y, com.amazon.aps.iva.pe0.a, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.r10.j0, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.pe0.b, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0391  */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.amazon.aps.iva.r10.y r36, com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> r37, com.amazon.aps.iva.a1.f r38, com.amazon.aps.iva.o0.i r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s10.k.c(com.amazon.aps.iva.r10.y, com.amazon.aps.iva.pe0.a, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void d(boolean z, com.amazon.aps.iva.pe0.b<String> bVar, String str, com.amazon.aps.iva.o0.i iVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        com.amazon.aps.iva.ot.a dVar;
        com.amazon.aps.iva.o0.j g2 = iVar.g(-1477404313);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (g2.a(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (g2.H(bVar)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (g2.H(str)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i4 & 731) == 146 && g2.h()) {
            g2.A();
        } else {
            if (i8 != 0) {
                str = null;
            }
            e0.b bVar2 = e0.a;
            if (bVar.contains("premium")) {
                dVar = a.f.d;
            } else if (z) {
                dVar = a.h.d;
            } else {
                com.amazon.aps.iva.yb0.j.c(str);
                dVar = new a.d(str);
            }
            com.amazon.aps.iva.ot.b.a(dVar, androidx.compose.foundation.layout.a.a(f.a.c, 1.7777778f), g2, 48, 0);
        }
        String str2 = str;
        j2 X = g2.X();
        if (X != null) {
            X.d = new n(z, bVar, str2, i2, i3);
        }
    }
}
