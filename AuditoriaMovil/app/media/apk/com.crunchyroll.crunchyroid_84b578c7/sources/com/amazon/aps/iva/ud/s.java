package com.amazon.aps.iva.ud;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.amazon.aps.iva.b5.c;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.q4.c;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.duration.SmallDurationFormatter;
import com.ellation.crunchyroll.ui.labels.MaturityRatingType;
import java.io.File;
/* compiled from: ContinueWatchingCard.kt */
/* loaded from: classes.dex */
public final class s {

    /* compiled from: ContinueWatchingCard.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.sd.a h;
        public final /* synthetic */ float i;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.sd.a aVar, float f, boolean z) {
            super(2);
            this.h = aVar;
            this.i = f;
            this.j = z;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                com.amazon.aps.iva.sd.a aVar = this.h;
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(aVar.d).getAbsolutePath());
                com.amazon.aps.iva.yb0.j.e(decodeFile, "bitmap");
                com.amazon.aps.iva.p4.d dVar = new com.amazon.aps.iva.p4.d(decodeFile);
                n.a aVar2 = n.a.b;
                com.amazon.aps.iva.p4.n p = com.amazon.aps.iva.ff0.b.p(aVar2);
                com.amazon.aps.iva.yb0.j.f(p, "$this$cornerRadius");
                float f = this.i;
                com.amazon.aps.iva.p4.q.a(dVar, "", p.d(new com.amazon.aps.iva.r4.l(new c.a(f))), 0, iVar2, 56, 0);
                com.amazon.aps.iva.p4.a aVar3 = new com.amazon.aps.iva.p4.a(R.drawable.background_widget_item_gradient);
                com.amazon.aps.iva.p4.n p2 = com.amazon.aps.iva.ff0.b.p(aVar2);
                com.amazon.aps.iva.yb0.j.f(p2, "$this$cornerRadius");
                com.amazon.aps.iva.p4.q.a(aVar3, "", p2.d(new com.amazon.aps.iva.r4.l(new c.a(f))), 0, iVar2, 56, 8);
                iVar2.s(-1893718829);
                if (aVar.j != MaturityRatingType.UNDEFINED) {
                    com.amazon.aps.iva.y4.b.a(com.amazon.aps.iva.e.w.K(aVar2, 16), null, com.amazon.aps.iva.v0.b.b(iVar2, -1822853501, new o(aVar)), iVar2, 384, 2);
                }
                iVar2.G();
                com.amazon.aps.iva.y4.c.a(com.amazon.aps.iva.e.w.K(com.amazon.aps.iva.ff0.b.L(com.amazon.aps.iva.ff0.b.o(aVar2)), 16), 0, 2, com.amazon.aps.iva.v0.b.b(iVar2, -889892954, new r(this.j, aVar)), iVar2, 3072, 2);
                com.amazon.aps.iva.y4.b.a(com.amazon.aps.iva.ab.x.A(com.amazon.aps.iva.ff0.b.p(aVar2), new com.amazon.aps.iva.s4.j(n.class, com.amazon.aps.iva.e.w.m(new c.b(new c.a("uiModel"), aVar)))), null, f.a, iVar2, 384, 2);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ContinueWatchingCard.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.sd.a h;
        public final /* synthetic */ com.amazon.aps.iva.p4.n i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ float k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.sd.a aVar, com.amazon.aps.iva.p4.n nVar, boolean z, float f, int i, int i2) {
            super(2);
            this.h = aVar;
            this.i = nVar;
            this.j = z;
            this.k = f;
            this.l = i;
            this.m = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            s.a(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.sd.a r13, com.amazon.aps.iva.p4.n r14, boolean r15, float r16, com.amazon.aps.iva.o0.i r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ud.s.a(com.amazon.aps.iva.sd.a, com.amazon.aps.iva.p4.n, boolean, float, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void b(com.amazon.aps.iva.sd.f fVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        com.amazon.aps.iva.o0.j g = iVar.g(1984555772);
        if ((i & 14) == 0) {
            if (g.H(fVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && g.h()) {
            g.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.a5.d.a(SmallDurationFormatter.Companion.create$default(SmallDurationFormatter.Companion, (Context) g.i(com.amazon.aps.iva.p4.h.b), null, 2, null).formatTimeLeft(fVar.c, fVar.b), com.amazon.aps.iva.ff0.b.q(n.a.b), new com.amazon.aps.iva.a5.e(new com.amazon.aps.iva.b5.e(R.color.cr_white_opacity_70), new com.amazon.aps.iva.o2.m(com.amazon.aps.iva.e.z.z(14)), null, new com.amazon.aps.iva.a5.c(4), 44), 1, g, 3072, 0);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new t(fVar, i);
        }
    }
}
