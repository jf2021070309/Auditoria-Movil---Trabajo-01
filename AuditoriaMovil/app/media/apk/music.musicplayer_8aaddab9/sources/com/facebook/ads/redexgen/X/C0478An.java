package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.An  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0478An extends c0 {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public C0484At A03;
    public int[] A04;
    public final C1046Xo A05;
    public final PN A06;
    public final PO A07;

    public C0478An(C1046Xo c1046Xo, PO po, PN pn) {
        super(c1046Xo);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1046Xo;
        this.A07 = po;
        this.A06 = pn;
        this.A01 = -1;
        this.A03 = new C0484At(this, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0 != 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r0 == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        super.A1J(r17, r18, r19, r20);
     */
    @Override // com.facebook.ads.redexgen.X.C4T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1J(com.facebook.ads.redexgen.X.C03244b r17, com.facebook.ads.redexgen.X.C03314i r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0478An.A1J(com.facebook.ads.redexgen.X.4b, com.facebook.ads.redexgen.X.4i, int, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.c0, com.facebook.ads.redexgen.X.C4T
    public final void A1t(int i2) {
        A2F(i2, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.c0, com.facebook.ads.redexgen.X.C4T
    public final void A21(F6 f6, C03314i c03314i, int i2) {
        this.A03.A0A(i2);
        A1L(this.A03);
    }

    public final void A2K(double d2) {
        if (d2 <= 0.0d) {
            d2 = 1.0d;
        }
        this.A00 = (float) (50.0d / d2);
        this.A03 = new C0484At(this, this.A05);
    }

    public final void A2L(int i2) {
        this.A01 = i2;
    }

    public final void A2M(int i2) {
        this.A02 = i2;
    }
}
