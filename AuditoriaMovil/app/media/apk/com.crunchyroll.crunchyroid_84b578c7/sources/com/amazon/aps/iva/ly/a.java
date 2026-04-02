package com.amazon.aps.iva.ly;

import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.a0;
import com.amazon.aps.iva.a2.b0;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
/* compiled from: CrImage.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ l<Object>[] a = {e.b(a.class, "imageUrlKey", "getImageUrlKey(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)};
    public static final b0<String> b = new b0<>("ImageUrlKey", a0.h);

    /* compiled from: CrImage.kt */
    /* renamed from: com.amazon.aps.iva.ly.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0495a extends com.amazon.aps.iva.yb0.l implements q<f, i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ long h;
        public final /* synthetic */ f i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0495a(long j, f fVar, int i) {
            super(3);
            this.h = j;
            this.i = fVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(f fVar, i iVar, Integer num) {
            i iVar2 = iVar;
            int intValue = num.intValue();
            j.f(fVar, "it");
            if ((intValue & 81) == 16 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                long j = this.h;
                f fVar2 = this.i;
                int i = this.j;
                a.b(fVar2, j, iVar2, ((i >> 12) & 14) | ((i << 3) & 112), 0);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrImage.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(1);
            this.h = str;
            this.i = str2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            String str = this.h;
            if (str == null) {
                str = "image";
            }
            y.e(c0Var2, str);
            a.b.a(c0Var2, a.a[0], this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrImage.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ec.f<Drawable>, com.amazon.aps.iva.ec.f<Drawable>> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ec.f<Drawable> invoke(com.amazon.aps.iva.ec.f<Drawable> fVar) {
            com.amazon.aps.iva.ec.f<Drawable> fVar2 = fVar;
            j.f(fVar2, "it");
            Cloneable d = fVar2.d(com.amazon.aps.iva.nc.l.a);
            j.e(d, "it.diskCacheStrategy(DiskCacheStrategy.ALL)");
            return (com.amazon.aps.iva.ec.f) d;
        }
    }

    /* compiled from: CrImage.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements p<i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f h;
        public final /* synthetic */ String i;
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<Image> j;
        public final /* synthetic */ com.amazon.aps.iva.s1.f k;
        public final /* synthetic */ long l;
        public final /* synthetic */ float m;
        public final /* synthetic */ q<f, i, Integer, com.amazon.aps.iva.kb0.q> n;
        public final /* synthetic */ String o;
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(f fVar, String str, com.amazon.aps.iva.pe0.a<Image> aVar, com.amazon.aps.iva.s1.f fVar2, long j, float f, q<? super f, ? super i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, String str2, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = str;
            this.j = aVar;
            this.k = fVar2;
            this.l = j;
            this.m = f;
            this.n = qVar;
            this.o = str2;
            this.p = i;
            this.q = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, iVar, com.amazon.aps.iva.ff0.b.I(this.p | 1), this.q);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.a1.f r29, java.lang.String r30, com.amazon.aps.iva.pe0.a<com.ellation.crunchyroll.api.etp.model.Image> r31, com.amazon.aps.iva.s1.f r32, long r33, float r35, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.a1.f, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r36, java.lang.String r37, com.amazon.aps.iva.o0.i r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ly.a.a(com.amazon.aps.iva.a1.f, java.lang.String, com.amazon.aps.iva.pe0.a, com.amazon.aps.iva.s1.f, long, float, com.amazon.aps.iva.xb0.q, java.lang.String, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void b(f fVar, long j, i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        f b2;
        com.amazon.aps.iva.o0.j g = iVar.g(1630941437);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.d(j)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.H(fVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && g.h()) {
            g.A();
        } else {
            if (i6 != 0) {
                fVar = f.a.c;
            }
            e0.b bVar = e0.a;
            b2 = androidx.compose.foundation.c.b(fVar, j, p0.a);
            com.amazon.aps.iva.d0.f.a(b2, g, 0);
        }
        f fVar2 = fVar;
        j2 X = g.X();
        if (X != null) {
            X.d = new com.amazon.aps.iva.ly.b(fVar2, j, i, i2);
        }
    }
}
