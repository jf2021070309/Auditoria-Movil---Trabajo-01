package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class W7 implements InterfaceC0517Cc {
    public static byte[] A04;
    public static String[] A05 = {"P5w0t5YmbfCx1ojda5KKDsEMO6jqUmnr", "UdOatSKcJailVD", "", "xAiF", "epl8GGi5jyNsT2QZHjLNLopZqyhNzplR", "TY8pRi4pa4JcG30Kuv61m", "fOMFGQDuqjq2usuY2YJ2oGF", "ObZwfJQfEiVxl"};
    public static final InterfaceC0519Cf A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final W6 A02;
    public final C0660Ii A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{15, 2, 117};
    }

    static {
        A01();
        A06 = new W8();
        A07 = C0676Iy.A08(A00(0, 3, 127));
    }

    public W7() {
        this(0L);
    }

    public W7(long j2) {
        this.A01 = j2;
        this.A02 = new W6();
        this.A03 = new C0660Ii(2786);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void A8I(Ce ce) {
        this.A02.A4U(ce, new C0550Dw(0, 1));
        ce.A5C();
        ce.AER(new C1012Wg(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final int ADU(InterfaceC0518Cd interfaceC0518Cd, C0521Cj c0521Cj) throws IOException, InterruptedException {
        int read = interfaceC0518Cd.read(this.A03.A00, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.AD1(this.A01, true);
            this.A00 = true;
        }
        this.A02.A47(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void AEQ(long j2, long j3) {
        this.A00 = false;
        this.A02.AEP();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final boolean AF0(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        C0660Ii c0660Ii = new C0660Ii(10);
        int i2 = 0;
        while (true) {
            interfaceC0518Cd.AD4(c0660Ii.A00, 0, 10);
            if (A05[7].length() != 13) {
                throw new RuntimeException();
            }
            A05[5] = "IuOldmz1qGC5b";
            c0660Ii.A0Y(0);
            if (c0660Ii.A0G() != A07) {
                interfaceC0518Cd.AE8();
                interfaceC0518Cd.A3J(i2);
                int startPosition = i2;
                int i3 = 0;
                while (true) {
                    interfaceC0518Cd.AD4(c0660Ii.A00, 0, 5);
                    c0660Ii.A0Y(0);
                    if (c0660Ii.A0I() != 2935) {
                        i3 = 0;
                        interfaceC0518Cd.AE8();
                        startPosition++;
                        if (startPosition - i2 >= 8192) {
                            return false;
                        }
                        interfaceC0518Cd.A3J(startPosition);
                    } else {
                        i3++;
                        if (A05[5].length() != 29) {
                            String[] strArr = A05;
                            strArr[3] = "a4rI";
                            strArr[6] = "EnE3h5gngskpWhoTVRGnZEO";
                            if (i3 >= 4) {
                                return true;
                            }
                        } else if (i3 >= 4) {
                            return true;
                        }
                        int A052 = BA.A05(c0660Ii.A00);
                        if (A052 == -1) {
                            return false;
                        }
                        int syncBytes = A052 - 5;
                        interfaceC0518Cd.A3J(syncBytes);
                    }
                }
            } else {
                c0660Ii.A0Z(3);
                int A0D = c0660Ii.A0D();
                int syncBytes2 = A0D + 10;
                i2 += syncBytes2;
                interfaceC0518Cd.A3J(A0D);
            }
        }
    }
}
