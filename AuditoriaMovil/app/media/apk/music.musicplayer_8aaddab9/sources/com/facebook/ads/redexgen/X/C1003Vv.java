package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
/* renamed from: com.facebook.ads.redexgen.X.Vv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1003Vv implements InterfaceC0536Di {
    public static byte[] A0K;
    public static String[] A0L = {"hgUALiBHRBx3rc9PT3qyJLJuKriNjQIA", "JcSPF8dLSzFIe8gapkYyYGiPDe1iVZ7T", "a8IrrF5hi8IFjeZ2lIy6xY1armnYmb5o", "dI536DedIqR9AIwKwKzHAZoNzdw0gd0o", "spoCU0rWYssiPe95xKAIpCDVtAt9VbvV", "ZT5oGWr6FGwuE", "k3I4LHvMKlhfRum43HVkkWOAjRBPWhRl", "GOwjxx90kdElmS0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Format A0C;
    public InterfaceC0525Co A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public final String A0J;
    public final C0660Ii A0I = new C0660Ii(1024);
    public final C0659Ih A0H = new C0659Ih(this.A0I.A00);

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = (copyOfRange[i5] - i4) - 35;
            String[] strArr = A0L;
            if (strArr[1].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[3] = "gooppkWHFs0OH8ZO7KHmI5JoYki0niEb";
            strArr2[4] = "gQ32BKgMXcn7uGYeyK4g8BO1uII782R4";
            copyOfRange[i5] = (byte) i6;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0K = new byte[]{-87, -67, -84, -79, -73, 119, -75, -72, 124, -87, 117, -76, -87, -68, -75};
    }

    static {
        A04();
    }

    public C1003Vv(@Nullable String str) {
        this.A0J = str;
    }

    private int A00(C0659Ih c0659Ih) throws C0470Af {
        int A01 = c0659Ih.A01();
        Pair<Integer, Integer> A02 = IN.A02(c0659Ih, true);
        this.A05 = ((Integer) A02.first).intValue();
        this.A02 = ((Integer) A02.second).intValue();
        return A01 - c0659Ih.A01();
    }

    private int A01(C0659Ih c0659Ih) throws C0470Af {
        int A04;
        int i2 = 0;
        if (this.A03 == 0) {
            do {
                A04 = c0659Ih.A04(8);
                i2 += A04;
            } while (A04 == 255);
            return i2;
        }
        throw new C0470Af();
    }

    public static long A02(C0659Ih c0659Ih) {
        return c0659Ih.A04((c0659Ih.A04(2) + 1) * 8);
    }

    private void A05(int i2) {
        this.A0I.A0W(i2);
        this.A0H.A0B(this.A0I.A00);
    }

    private void A06(C0659Ih c0659Ih) throws C0470Af {
        if (!c0659Ih.A0F()) {
            this.A0G = true;
            A08(c0659Ih);
        } else if (!this.A0G) {
            return;
        }
        if (this.A00 == 0) {
            if (this.A04 == 0) {
                A09(c0659Ih, A01(c0659Ih));
                if (this.A0F) {
                    c0659Ih.A08((int) this.A09);
                    return;
                }
                return;
            }
            throw new C0470Af();
        }
        throw new C0470Af();
    }

    private void A07(C0659Ih c0659Ih) {
        this.A03 = c0659Ih.A04(3);
        int i2 = this.A03;
        if (i2 == 0) {
            c0659Ih.A08(8);
        } else if (i2 != 1) {
            if (i2 != 3 && i2 != 4 && i2 != 5) {
                if (i2 != 6) {
                    if (A0L[7].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0L;
                    strArr[1] = "QJhjenmrzPYVr6mrKS1ywIZfks2sEqmv";
                    strArr[0] = "rtM7Stfru76sVtn814uyI2mxrEEn9Ydu";
                    if (i2 != 7) {
                        return;
                    }
                }
                c0659Ih.A08(1);
                return;
            }
            c0659Ih.A08(6);
        } else {
            c0659Ih.A08(9);
        }
    }

    private void A08(C0659Ih c0659Ih) throws C0470Af {
        boolean A0F;
        int numProgram = c0659Ih.A04(1);
        int bitsRead = numProgram == 1 ? c0659Ih.A04(1) : 0;
        this.A00 = bitsRead;
        if (this.A00 == 0) {
            if (numProgram == 1) {
                A02(c0659Ih);
            }
            if (c0659Ih.A0F()) {
                this.A04 = c0659Ih.A04(6);
                int A04 = c0659Ih.A04(4);
                int A042 = c0659Ih.A04(3);
                if (A04 == 0 && A042 == 0) {
                    if (numProgram == 0) {
                        int readBits = c0659Ih.A03();
                        int A00 = A00(c0659Ih);
                        c0659Ih.A07(readBits);
                        int readBits2 = A00 + 7;
                        byte[] initData = new byte[readBits2 / 8];
                        c0659Ih.A0D(initData, 0, A00);
                        Format A07 = Format.A07(this.A0E, A03(0, 15, 37), null, -1, -1, this.A02, this.A05, Collections.singletonList(initData), null, 0, this.A0J);
                        if (!A07.equals(this.A0C)) {
                            this.A0C = A07;
                            this.A0A = 1024000000 / A07.A0C;
                            this.A0D.A5U(A07);
                        }
                    } else {
                        int A02 = (int) A02(c0659Ih);
                        int bitsRead2 = A00(c0659Ih);
                        c0659Ih.A08(A02 - bitsRead2);
                    }
                    A07(c0659Ih);
                    this.A0F = c0659Ih.A0F();
                    this.A09 = 0L;
                    if (this.A0F) {
                        if (numProgram == 1) {
                            this.A09 = A02(c0659Ih);
                        } else {
                            do {
                                A0F = c0659Ih.A0F();
                                this.A09 = (this.A09 << 8) + c0659Ih.A04(8);
                            } while (A0F);
                        }
                    }
                    if (c0659Ih.A0F()) {
                        c0659Ih.A08(8);
                        return;
                    }
                    return;
                }
                throw new C0470Af();
            }
            throw new C0470Af();
        }
        throw new C0470Af();
    }

    private void A09(C0659Ih c0659Ih, int i2) {
        int A03 = c0659Ih.A03();
        if ((A03 & 7) == 0) {
            this.A0I.A0Y(A03 >> 3);
        } else {
            c0659Ih.A0D(this.A0I.A00, 0, i2 * 8);
            this.A0I.A0Y(0);
        }
        this.A0D.AEL(this.A0I, i2);
        this.A0D.AEM(this.A0B, 1, i2, 0, null);
        this.A0B += this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void A47(C0660Ii c0660Ii) throws C0470Af {
        while (c0660Ii.A04() > 0) {
            int i2 = this.A08;
            if (i2 != 0) {
                if (i2 == 1) {
                    int A0E = c0660Ii.A0E();
                    if ((A0E & 224) == 224) {
                        this.A07 = A0E;
                        this.A08 = 2;
                    } else if (A0E != 86) {
                        this.A08 = 0;
                    }
                } else if (A0L[7].length() != 15) {
                    throw new RuntimeException();
                } else {
                    String[] strArr = A0L;
                    strArr[3] = "eXMY6UfuU8mptnxKZK3KjbCMiU1pAKNs";
                    strArr[4] = "BrFOrdIatggcu5HdAKqvOHyOVIidANWA";
                    if (i2 == 2) {
                        this.A06 = ((this.A07 & (-225)) << 8) | c0660Ii.A0E();
                        if (this.A06 > this.A0I.A00.length) {
                            A05(this.A06);
                        }
                        this.A01 = 0;
                        this.A08 = 3;
                    } else if (i2 == 3) {
                        int min = Math.min(c0660Ii.A04(), this.A06 - this.A01);
                        c0660Ii.A0c(this.A0H.A00, this.A01, min);
                        this.A01 += min;
                        if (this.A01 == this.A06) {
                            this.A0H.A07(0);
                            A06(this.A0H);
                            this.A08 = 0;
                        }
                    }
                }
            } else if (c0660Ii.A0E() == 86) {
                this.A08 = 1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void A4U(Ce ce, C0550Dw c0550Dw) {
        c0550Dw.A05();
        this.A0D = ce.AFI(c0550Dw.A03(), 1);
        this.A0E = c0550Dw.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AD0() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AD1(long j2, boolean z) {
        this.A0B = j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AEP() {
        this.A08 = 0;
        this.A0G = false;
    }
}
