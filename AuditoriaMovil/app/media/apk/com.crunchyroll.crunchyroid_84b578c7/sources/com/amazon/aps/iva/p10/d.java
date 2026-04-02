package com.amazon.aps.iva.p10;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.r;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SubgenreCarouselPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements c {
    public final l<com.amazon.aps.iva.p10.a, q> b;
    public final r<Panel, Integer, Integer, String, q> c;
    public com.amazon.aps.iva.p10.a d;
    public int e;

    /* compiled from: SubgenreCarouselPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.a00.b.values().length];
            try {
                iArr[com.amazon.aps.iva.a00.b.Popularity.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.a00.b.NewlyAdded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.a00.b.Alphabetical.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(e eVar, l<? super com.amazon.aps.iva.p10.a, q> lVar, r<? super Panel, ? super Integer, ? super Integer, ? super String, q> rVar) {
        super(eVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(eVar, "view");
        com.amazon.aps.iva.yb0.j.f(lVar, "openBrowseAll");
        com.amazon.aps.iva.yb0.j.f(rVar, "onItemClick");
        this.b = lVar;
        this.c = rVar;
    }

    @Override // com.amazon.aps.iva.p10.c
    public final void V3() {
        com.amazon.aps.iva.p10.a aVar = this.d;
        if (aVar != null) {
            this.b.invoke(aVar);
        } else {
            com.amazon.aps.iva.yb0.j.m("subgenreCarouselDataModel");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r2 == null) goto L19;
     */
    @Override // com.amazon.aps.iva.p10.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.ellation.crunchyroll.model.Panel r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "panel"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            int r0 = r5.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.amazon.aps.iva.p10.a r1 = r5.d
            r2 = 0
            if (r1 == 0) goto L46
            com.amazon.aps.iva.a00.b r3 = r1.e
            if (r3 == 0) goto L37
            int[] r4 = com.amazon.aps.iva.p10.d.a.a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 1
            if (r3 == r4) goto L33
            r4 = 2
            if (r3 == r4) goto L30
            r4 = 3
            if (r3 != r4) goto L2a
            goto L35
        L2a:
            com.amazon.aps.iva.kb0.h r6 = new com.amazon.aps.iva.kb0.h
            r6.<init>()
            throw r6
        L30:
            java.lang.String r2 = "new"
            goto L35
        L33:
            java.lang.String r2 = "popular"
        L35:
            if (r2 != 0) goto L40
        L37:
            com.amazon.aps.iva.l10.a r1 = r1.d
            if (r1 == 0) goto L3e
            java.lang.String r2 = r1.b
            goto L40
        L3e:
            java.lang.String r2 = ""
        L40:
            com.amazon.aps.iva.xb0.r<com.ellation.crunchyroll.model.Panel, java.lang.Integer, java.lang.Integer, java.lang.String, com.amazon.aps.iva.kb0.q> r1 = r5.c
            r1.K(r6, r0, r7, r2)
            return
        L46:
            java.lang.String r6 = "subgenreCarouselDataModel"
            com.amazon.aps.iva.yb0.j.m(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p10.d.i(com.ellation.crunchyroll.model.Panel, int):void");
    }
}
