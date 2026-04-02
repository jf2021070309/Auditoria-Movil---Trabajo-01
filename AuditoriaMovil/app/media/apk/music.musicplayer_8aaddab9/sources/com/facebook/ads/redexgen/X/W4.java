package com.facebook.ads.redexgen.X;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class W4 implements InterfaceC0517Cc {
    public static byte[] A04;
    public static String[] A05 = {"6Yd3MlxO6zs0On0JMF5Pwnois3aNTjpE", "MmQBoaYzrmdPmtEAYQ3R1Y6Mcsh6By7B", "7RUBoC8KCwVWfiCX9SWb", "GS41ND25W7ytYawGpGonJQP9IOOENLXr", "lL4oomLzy5vPLaNFQ0K", "J26", "emQAR3GMgLzBn72fJq6a", "GcSIxJRAUXsHB0u2DOmppTTbOqtsj228"};
    public static final InterfaceC0519Cf A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final W3 A02;
    public final C0660Ii A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ SyslogConstants.LOG_CLOCK);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{27, 22, 97};
    }

    static {
        A01();
        A06 = new W5();
        A07 = C0676Iy.A08(A00(0, 3, 42));
    }

    public W4() {
        this(0L);
    }

    public W4(long j2) {
        this.A01 = j2;
        this.A02 = new W3(true);
        this.A03 = new C0660Ii(200);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void A8I(Ce ce) {
        this.A02.A4U(ce, new C0550Dw(0, 1));
        ce.A5C();
        ce.AER(new C1012Wg(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final int ADU(InterfaceC0518Cd interfaceC0518Cd, C0521Cj c0521Cj) throws IOException, InterruptedException {
        int read = interfaceC0518Cd.read(this.A03.A00, 0, 200);
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
        C0659Ih c0659Ih = new C0659Ih(c0660Ii.A00);
        int validFramesCount = 0;
        while (true) {
            interfaceC0518Cd.AD4(c0660Ii.A00, 0, 10);
            c0660Ii.A0Y(0);
            if (c0660Ii.A0G() != A07) {
                break;
            }
            c0660Ii.A0Z(3);
            int A0D = c0660Ii.A0D();
            int length = A0D + 10;
            validFramesCount += length;
            interfaceC0518Cd.A3J(A0D);
        }
        interfaceC0518Cd.AE8();
        interfaceC0518Cd.A3J(validFramesCount);
        int i2 = validFramesCount;
        int i3 = 0;
        if (A05[4].length() == 20) {
            throw new RuntimeException();
        }
        A05[1] = "mY90xJHLqPMDpFXgmiZe2UkYD68ZyI7P";
        int i4 = 0;
        while (true) {
            interfaceC0518Cd.AD4(c0660Ii.A00, 0, 2);
            c0660Ii.A0Y(0);
            int validFramesSize = c0660Ii.A0I();
            if ((65526 & validFramesSize) != 65520) {
                i4 = 0;
                i3 = 0;
                interfaceC0518Cd.AE8();
                i2++;
                if (i2 - validFramesCount >= 8192) {
                    return false;
                }
                interfaceC0518Cd.A3J(i2);
            } else {
                i4++;
                if (i4 >= 4 && i3 > 188) {
                    return true;
                }
                interfaceC0518Cd.AD4(c0660Ii.A00, 0, 4);
                c0659Ih.A07(14);
                int A042 = c0659Ih.A04(13);
                if (A042 <= 6) {
                    return false;
                }
                int syncBytes = A042 - 6;
                interfaceC0518Cd.A3J(syncBytes);
                i3 += A042;
            }
        }
    }
}
