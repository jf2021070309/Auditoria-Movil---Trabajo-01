package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Wb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1007Wb implements InterfaceC0517Cc {
    public static byte[] A0F;
    public static String[] A0G = {"F9KwQMNMxiTjkayDhPM6gvDLkPvUNcLn", "Em4FZTw9NeUBCVsnasMEsqdbQrmSbGq", "", "tDq5h6G1X4d5RY1LfaFLZXWqT85DrCya", "B5R7X", "Y", "Zp00UWtElOmikRSXEs37FpNUTZ5eWL9Y", "wqRNyyxlEoRi9"};
    public static final InterfaceC0519Cf A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public Ce A06;
    public C1009Wd A07;
    public WY A08;
    public boolean A09;
    public final C0660Ii A0C = new C0660Ii(4);
    public final C0660Ii A0B = new C0660Ii(9);
    public final C0660Ii A0E = new C0660Ii(11);
    public final C0660Ii A0D = new C0660Ii();
    public final C1006Wa A0A = new C1006Wa();
    public int A01 = 1;
    public long A04 = -9223372036854775807L;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-117, -111, -101};
    }

    static {
        A03();
        A0H = new C1008Wc();
        A0I = C0676Iy.A08(A01(0, 3, 9));
    }

    private C0660Ii A00(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        if (this.A02 > this.A0D.A05()) {
            C0660Ii c0660Ii = this.A0D;
            c0660Ii.A0b(new byte[Math.max(c0660Ii.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        interfaceC0518Cd.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        if (!this.A09) {
            this.A06.AER(new C1012Wg(-9223372036854775807L));
            this.A09 = true;
        }
        if (this.A04 != -9223372036854775807L) {
            return;
        }
        this.A04 = this.A0A.A0D() == -9223372036854775807L ? -this.A05 : 0L;
    }

    private void A04(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        interfaceC0518Cd.AEy(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        if (interfaceC0518Cd.ADZ(this.A0B.A00, 0, 9, true)) {
            C0660Ii c0660Ii = this.A0B;
            if (A0G[4].length() != 15) {
                String[] strArr = A0G;
                strArr[3] = "xxv79KM5VyarLmUhQqEOMlbbyGFtPWOG";
                strArr[6] = "n0W8PrJEyrqWl4lCbLWkK9bcjvpbO2Fn";
                c0660Ii.A0Y(0);
                this.A0B.A0Z(4);
                int A0E = this.A0B.A0E();
                boolean z = (A0E & 4) != 0;
                boolean hasAudio = (A0E & 1) != 0;
                if (z && this.A07 == null) {
                    this.A07 = new C1009Wd(this.A06.AFI(8, 1));
                }
                if (hasAudio && this.A08 == null) {
                    this.A08 = new WY(this.A06.AFI(9, 2));
                }
                this.A06.A5C();
                this.A00 = (this.A0B.A08() - 9) + 4;
                this.A01 = 2;
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    private boolean A06(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        boolean z = true;
        if (this.A03 == 8 && this.A07 != null) {
            A02();
            this.A07.A00(A00(interfaceC0518Cd), this.A04 + this.A05);
        } else if (this.A03 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(interfaceC0518Cd), this.A04 + this.A05);
        } else if (this.A03 == 18 && !this.A09) {
            this.A0A.A00(A00(interfaceC0518Cd), this.A05);
            long A0D = this.A0A.A0D();
            if (A0D != -9223372036854775807L) {
                this.A06.AER(new C1012Wg(A0D));
                this.A09 = true;
            }
        } else {
            int i2 = this.A02;
            if (A0G[4].length() == 15) {
                throw new RuntimeException();
            }
            A0G[0] = "mShHrd4Vu2jNkvRJUK8UrhhXjzgbGKl1";
            interfaceC0518Cd.AEy(i2);
            z = false;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z;
    }

    private boolean A07(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        if (interfaceC0518Cd.ADZ(this.A0E.A00, 0, 11, true)) {
            this.A0E.A0Y(0);
            this.A03 = this.A0E.A0E();
            this.A02 = this.A0E.A0G();
            this.A05 = this.A0E.A0G();
            this.A05 = ((this.A0E.A0E() << 24) | this.A05) * 1000;
            this.A0E.A0Z(3);
            this.A01 = 4;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void A8I(Ce ce) {
        this.A06 = ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final int ADU(InterfaceC0518Cd interfaceC0518Cd, C0521Cj c0521Cj) throws IOException, InterruptedException {
        while (true) {
            int i2 = this.A01;
            if (i2 != 1) {
                if (i2 == 2) {
                    A04(interfaceC0518Cd);
                } else if (A0G[4].length() == 15) {
                    throw new RuntimeException();
                } else {
                    A0G[4] = "ncW0XwKX3pgCRaaT";
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (A06(interfaceC0518Cd)) {
                                if (A0G[0].charAt(18) != 'j') {
                                    A0G[7] = "5";
                                    return 0;
                                }
                                A0G[7] = "DR5iBP2XCUKx659t";
                                return 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (!A07(interfaceC0518Cd)) {
                        return -1;
                    }
                }
            } else if (!A05(interfaceC0518Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void AEQ(long j2, long j3) {
        this.A01 = 1;
        this.A04 = -9223372036854775807L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final boolean AF0(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        interfaceC0518Cd.AD4(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        interfaceC0518Cd.AD4(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & 250) != 0) {
            return false;
        }
        interfaceC0518Cd.AD4(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int A08 = this.A0C.A08();
        interfaceC0518Cd.AE8();
        interfaceC0518Cd.A3J(A08);
        interfaceC0518Cd.AD4(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        return this.A0C.A08() == 0;
    }
}
