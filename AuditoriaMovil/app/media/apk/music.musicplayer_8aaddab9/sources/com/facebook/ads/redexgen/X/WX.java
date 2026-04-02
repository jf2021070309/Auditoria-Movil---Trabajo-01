package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class WX implements Cu {
    public static byte[] A07;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0527Cw A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C0526Ct> A05 = new ArrayDeque<>();
    public final D1 A04 = new D1();

    static {
        A05();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{101, -118, -110, 125, -120, -123, Byte.MIN_VALUE, 60, -127, -120, -127, -119, -127, -118, -112, 60, -112, -107, -116, -127, 60, -73, -36, -28, -49, -38, -41, -46, -114, -44, -38, -35, -49, -30, -114, -31, -41, -24, -45, -88, -114, -95, -58, -50, -71, -60, -63, -68, 120, -63, -58, -52, -67, -65, -67, -54, 120, -53, -63, -46, -67, -110, 120, -64, -31, -33, -42, -37, -44, -115, -46, -39, -46, -38, -46, -37, -31, -115, -32, -42, -25, -46, -89, -115};
    }

    private double A00(InterfaceC0518Cd interfaceC0518Cd, int i2) throws IOException, InterruptedException {
        long A02 = A02(interfaceC0518Cd, i2);
        if (i2 == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    private long A01(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        interfaceC0518Cd.AE8();
        while (true) {
            interfaceC0518Cd.AD4(this.A06, 0, 4);
            int A00 = D1.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) D1.A01(this.A06, A00, false);
                if (this.A03.A8X(A01)) {
                    interfaceC0518Cd.AEy(A00);
                    return A01;
                }
            }
            interfaceC0518Cd.AEy(1);
        }
    }

    private long A02(InterfaceC0518Cd interfaceC0518Cd, int i2) throws IOException, InterruptedException {
        interfaceC0518Cd.readFully(this.A06, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.A06[i3] & 255);
        }
        return j2;
    }

    private String A04(InterfaceC0518Cd interfaceC0518Cd, int trimmedLength) throws IOException, InterruptedException {
        if (trimmedLength == 0) {
            return A03(0, 0, 34);
        }
        byte[] bArr = new byte[trimmedLength];
        interfaceC0518Cd.readFully(bArr, 0, trimmedLength);
        while (trimmedLength > 0 && bArr[trimmedLength - 1] == 0) {
            trimmedLength--;
        }
        return new String(bArr, 0, trimmedLength);
    }

    @Override // com.facebook.ads.redexgen.X.Cu
    public final void A8J(InterfaceC0527Cw interfaceC0527Cw) {
        this.A03 = interfaceC0527Cw;
    }

    @Override // com.facebook.ads.redexgen.X.Cu
    public final boolean ADW(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        long j2;
        int i2;
        IJ.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty()) {
                long A7E = interfaceC0518Cd.A7E();
                j2 = this.A05.peek().A01;
                if (A7E >= j2) {
                    InterfaceC0527Cw interfaceC0527Cw = this.A03;
                    i2 = this.A05.pop().A00;
                    interfaceC0527Cw.A5B(i2);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long A05 = this.A04.A05(interfaceC0518Cd, true, false, 4);
                if (A05 == -2) {
                    A05 = A01(interfaceC0518Cd);
                }
                if (A05 == -1) {
                    return false;
                }
                this.A00 = (int) A05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(interfaceC0518Cd, false, true, 8);
                this.A01 = 2;
            }
            int A6S = this.A03.A6S(this.A00);
            if (A6S != 0) {
                if (A6S == 1) {
                    long A7E2 = interfaceC0518Cd.A7E();
                    this.A05.push(new C0526Ct(this.A00, A7E2 + this.A02));
                    this.A03.AF3(this.A00, A7E2, this.A02);
                    this.A01 = 0;
                    return true;
                } else if (A6S == 2) {
                    long j3 = this.A02;
                    if (j3 <= 8) {
                        this.A03.A8L(this.A00, A02(interfaceC0518Cd, (int) j3));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C0470Af(A03(41, 22, 60) + this.A02);
                } else if (A6S == 3) {
                    long j4 = this.A02;
                    if (j4 <= 2147483647L) {
                        this.A03.AFB(this.A00, A04(interfaceC0518Cd, (int) j4));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C0470Af(A03(63, 21, 81) + this.A02);
                } else if (A6S == 4) {
                    this.A03.A3q(this.A00, (int) this.A02, interfaceC0518Cd);
                    this.A01 = 0;
                    return true;
                } else if (A6S == 5) {
                    long j5 = this.A02;
                    if (j5 == 4 || j5 == 8) {
                        this.A03.A5Q(this.A00, A00(interfaceC0518Cd, (int) this.A02));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C0470Af(A03(21, 20, 82) + this.A02);
                } else {
                    throw new C0470Af(A03(0, 21, 0) + A6S);
                }
            }
            interfaceC0518Cd.AEy((int) this.A02);
            this.A01 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Cu
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
