package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Vq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0998Vq implements InterfaceC0551Dx {
    public static String[] A06 = {"kFQyFzcAtW9h", "T9w", "fQaNjl3SJX3d9bVQ", "oZJ95vdSt2TTHBWCj0JXn5a7ndpZ8Bju", "u9yp8kydrxa7", "6VdIrZzllDHdfU7GHzHok5zrzcn9yZKG", "C5", "TRfT7Vv0"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC0544Dq A04;
    public final C0660Ii A05 = new C0660Ii(32);

    public C0998Vq(InterfaceC0544Dq interfaceC0544Dq) {
        this.A04 = interfaceC0544Dq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0551Dx
    public final void A48(C0660Ii c0660Ii, boolean z) {
        int i2 = -1;
        if (z) {
            i2 = c0660Ii.A06() + c0660Ii.A0E();
        }
        boolean z2 = this.A03;
        if (A06[1].length() == 27) {
            throw new RuntimeException();
        }
        A06[7] = "Nc9T8xtu";
        if (z2) {
            if (!z) {
                return;
            }
            this.A03 = false;
            c0660Ii.A0Y(i2);
            this.A00 = 0;
        }
        while (c0660Ii.A04() > 0) {
            int i3 = this.A00;
            if (i3 < 3) {
                if (i3 == 0) {
                    int A0E = c0660Ii.A0E();
                    c0660Ii.A0Y(c0660Ii.A06() - 1);
                    if (A06[7].length() != 8) {
                        throw new RuntimeException();
                    }
                    A06[2] = "aJNwIS78aN3JetqFlJ8G";
                    if (A0E == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int min = Math.min(c0660Ii.A04(), 3 - this.A00);
                c0660Ii.A0c(this.A05.A00, this.A00, min);
                this.A00 += min;
                if (this.A00 == 3) {
                    this.A05.A0W(3);
                    this.A05.A0Z(1);
                    int A0E2 = this.A05.A0E();
                    int A0E3 = this.A05.A0E();
                    this.A02 = (A0E2 & 128) != 0;
                    this.A01 = (((A0E2 & 15) << 8) | A0E3) + 3;
                    if (this.A05.A05() < this.A01) {
                        byte[] bytes = this.A05.A00;
                        this.A05.A0W(Math.min(4098, Math.max(this.A01, bytes.length * 2)));
                        System.arraycopy(bytes, 0, this.A05.A00, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(c0660Ii.A04(), this.A01 - this.A00);
                c0660Ii.A0c(this.A05.A00, this.A00, min2);
                this.A00 += min2;
                int i4 = this.A00;
                int i5 = this.A01;
                if (i4 == i5) {
                    boolean z3 = this.A02;
                    if (A06[7].length() != 8) {
                        throw new RuntimeException();
                    }
                    A06[1] = "WscUDiyP9zB";
                    if (z3) {
                        if (C0676Iy.A09(this.A05.A00, 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        C0660Ii c0660Ii2 = this.A05;
                        int thirdHeaderByte = this.A01 - 4;
                        if (A06[2].length() != 29) {
                            String[] strArr = A06;
                            strArr[3] = "nNiCCranccCPI0NRpeExr6ylwZyZykwG";
                            strArr[5] = "pfAdcnCCuWORkUPhfNuwqkYYK2fT2IOL";
                            c0660Ii2.A0W(thirdHeaderByte);
                        } else {
                            A06[2] = "0kjAgxStX";
                            c0660Ii2.A0W(thirdHeaderByte);
                        }
                    } else {
                        this.A05.A0W(i5);
                    }
                    this.A04.A47(this.A05);
                    this.A00 = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0551Dx
    public final void A8K(C0672Iu c0672Iu, Ce ce, C0550Dw c0550Dw) {
        this.A04.A8K(c0672Iu, ce, c0550Dw);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0551Dx
    public final void AEP() {
        this.A03 = true;
    }
}
