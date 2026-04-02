package com.facebook.ads.redexgen.X;

import ch.qos.logback.classic.Level;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.aE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1124aE implements InterfaceC03956v {
    public static byte[] A01;
    public static String[] A02 = {"ksa9uXkx89dXxbCURV7PiRCel6d7bK9j", "eXuTZs6W3v0JJtnWIbv2wG4QRruqx6j8", "WGgalorghCXwLSZ9oN", "BSejCupF6vxF", "vAQOCQWHxXMHYUUvXYDH6ypyDqGR6HRf", "iKQXn2EsxsEQ3pyGOtesmJGftglzEEjH", "dCL4N6ovXvI3jfuXevzoM7RKt4XsOwpl", "Cl5pJnrztL7k"};
    public final /* synthetic */ C1113a3 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = copyOfRange[i5] - i4;
            if (A02[4].charAt(5) == 'u') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "eya4WcuMkKlP";
            strArr[7] = "iVKlWYkTLkVv";
            copyOfRange[i5] = (byte) (i6 - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-56, -63, -66, -58, -77, -71, -73};
    }

    static {
        A01();
    }

    public C1124aE(C1113a3 c1113a3) {
        this.A00 = c1113a3;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        return this.A00.A0A(A00(0, 7, 21), Level.ALL_INT);
    }
}
