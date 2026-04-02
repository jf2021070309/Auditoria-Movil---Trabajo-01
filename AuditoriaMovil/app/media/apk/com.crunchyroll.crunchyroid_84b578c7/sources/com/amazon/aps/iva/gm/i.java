package com.amazon.aps.iva.gm;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.p1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.gm.z;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.crunchyroll.crunchyroid.R;
import java.util.Locale;
/* compiled from: AssetSelectionScreenContent.kt */
/* loaded from: classes2.dex */
public final class i {

    /* compiled from: AssetSelectionScreenContent.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<z, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(z zVar) {
            com.amazon.aps.iva.yb0.j.f(zVar, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AssetSelectionScreenContent.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<z, com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.xb0.l<? super z, com.amazon.aps.iva.kb0.q> lVar) {
            super(0);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.invoke(z.b.a);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AssetSelectionScreenContent.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ y h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<z, com.amazon.aps.iva.kb0.q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(y yVar, com.amazon.aps.iva.xb0.l<? super z, com.amazon.aps.iva.kb0.q> lVar, int i) {
            super(2);
            this.h = yVar;
            this.i = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                y yVar = this.h;
                if (yVar.a instanceof g.c) {
                    com.amazon.aps.iva.a1.f a = com.amazon.aps.iva.a2.o.a(androidx.compose.foundation.layout.d.i(f.a.c, 0.0f, 0.0f, 0, 0.0f, 11), false, j.h);
                    String upperCase = defpackage.i.E(R.string.multiple_profiles_select_asset_done, iVar2).toUpperCase(Locale.ROOT);
                    com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    boolean z = yVar.c;
                    iVar2.s(1157296644);
                    com.amazon.aps.iva.xb0.l<z, com.amazon.aps.iva.kb0.q> lVar = this.i;
                    boolean H = iVar2.H(lVar);
                    Object t = iVar2.t();
                    if (H || t == i.a.a) {
                        t = new k(lVar);
                        iVar2.n(t);
                    }
                    iVar2.G();
                    com.amazon.aps.iva.zn.a.b(upperCase, (com.amazon.aps.iva.xb0.l) t, a, z, iVar2, 0, 0);
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AssetSelectionScreenContent.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.pe0.a<? extends com.amazon.aps.iva.hm.e>, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ boolean h;
        public final /* synthetic */ com.amazon.aps.iva.gm.a i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<z, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(boolean z, com.amazon.aps.iva.gm.a aVar, com.amazon.aps.iva.xb0.l<? super z, com.amazon.aps.iva.kb0.q> lVar, int i) {
            super(3);
            this.h = z;
            this.i = aVar;
            this.j = lVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.pe0.a<? extends com.amazon.aps.iva.hm.e> aVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.pe0.a<? extends com.amazon.aps.iva.hm.e> aVar2 = aVar;
            num.intValue();
            com.amazon.aps.iva.yb0.j.f(aVar2, "collections");
            e0.b bVar = e0.a;
            float f = 24;
            float f2 = 0;
            com.amazon.aps.iva.e0.b.a(com.amazon.aps.iva.a2.o.a(f.a.c, false, l.h), null, new p1(f2, f2, f2, f), false, com.amazon.aps.iva.d0.a.g(f), null, null, false, new w(aVar2, this.h, this.i, this.j, this.k), iVar, 24960, 234);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AssetSelectionScreenContent.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<z, com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.amazon.aps.iva.xb0.l<? super z, com.amazon.aps.iva.kb0.q> lVar) {
            super(0);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.invoke(z.d.a);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AssetSelectionScreenContent.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ y h;
        public final /* synthetic */ int i;
        public final /* synthetic */ com.amazon.aps.iva.gm.a j;
        public final /* synthetic */ com.amazon.aps.iva.fm.a k;
        public final /* synthetic */ com.amazon.aps.iva.a1.f l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<z, com.amazon.aps.iva.kb0.q> m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(y yVar, int i, com.amazon.aps.iva.gm.a aVar, com.amazon.aps.iva.fm.a aVar2, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l<? super z, com.amazon.aps.iva.kb0.q> lVar, int i2, int i3) {
            super(2);
            this.h = yVar;
            this.i = i;
            this.j = aVar;
            this.k = aVar2;
            this.l = fVar;
            this.m = lVar;
            this.n = i2;
            this.o = i3;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            i.a(this.h, this.i, this.j, this.k, this.l, this.m, iVar, com.amazon.aps.iva.ff0.b.I(this.n | 1), this.o);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0182, code lost:
        if (com.amazon.aps.iva.yb0.j.a(r0.e0(), java.lang.Integer.valueOf(r8)) == false) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.gm.y r41, int r42, com.amazon.aps.iva.gm.a r43, com.amazon.aps.iva.fm.a r44, com.amazon.aps.iva.a1.f r45, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.gm.z, com.amazon.aps.iva.kb0.q> r46, com.amazon.aps.iva.o0.i r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gm.i.a(com.amazon.aps.iva.gm.y, int, com.amazon.aps.iva.gm.a, com.amazon.aps.iva.fm.a, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
