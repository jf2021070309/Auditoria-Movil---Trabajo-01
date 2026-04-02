package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Ua  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0957Ua implements IZ {
    public static String[] A05 = {"JbcDsPAiqgb9rsViVRKehTXv1iFS9Alt", "AfEyeuF2jCfkWNmIQlP22Iq9vQ5XDBZo", "cIPTiq2qkEqnYzKxb3sH3HOJO6VigB4N", "bIuwftDwBGArWYVN2grLSP1kPnHfbgfq", "1GGMxn0jatOJtlepcpEnLiyqpa0L6Zpp", "dBndgbsmlMbgteIClih73P1Nf1skDdlq", "kMZcBPwOEd1j6nxu2sFbdi5kLjNzhQnH", "M7tzCbQcNsxxyZ9EacAqZIMXmH340eiG"};
    public long A00;
    public long A01;
    public C0472Ah A02 = C0472Ah.A04;
    public boolean A03;
    public final IM A04;

    public C0957Ua(IM im) {
        this.A04 = im;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A57();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            long A7G = A7G();
            if (A05[0].charAt(9) == 'F') {
                throw new RuntimeException();
            }
            A05[0] = "yV0nDN2yEP24GlsqsYFBRUnmoDIsFkRQ";
            A02(A7G);
            this.A03 = false;
        }
    }

    public final void A02(long j2) {
        this.A01 = j2;
        if (this.A03) {
            this.A00 = this.A04.A57();
        }
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final C0472Ah A7D() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final long A7G() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A57 = this.A04.A57();
            if (A05[0].charAt(9) != 'F') {
                A05[1] = "ixlqsHFDPmeKY4bwdkSegalU4BLtdIOn";
                long j2 = A57 - this.A00;
                if (this.A02.A01 == 1.0f) {
                    long A00 = AG.A00(j2);
                    if (A05[3].charAt(4) != 'j') {
                        A05[0] = "AIwpqv7aDt0R5Z0o8sSBDj22LkfdUh0v";
                        return elapsedSinceBaseMs + A00;
                    }
                    A05[0] = "vgrMGSSY4L8ja71DPmzZRGyrcWnnIJj3";
                    return elapsedSinceBaseMs + A00;
                }
                return elapsedSinceBaseMs + this.A02.A00(j2);
            }
            throw new RuntimeException();
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final C0472Ah AEk(C0472Ah c0472Ah) {
        if (this.A03) {
            A02(A7G());
        }
        this.A02 = c0472Ah;
        return c0472Ah;
    }
}
