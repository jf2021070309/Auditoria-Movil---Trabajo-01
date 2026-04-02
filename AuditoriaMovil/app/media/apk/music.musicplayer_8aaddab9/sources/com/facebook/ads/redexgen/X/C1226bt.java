package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.bt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1226bt implements C4N {
    public static String[] A01 = {"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    public final /* synthetic */ F6 A00;

    public C1226bt(F6 f6) {
        this.A00 = f6;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    public final void A9x(AbstractC03344l abstractC03344l) {
        boolean A0A;
        abstractC03344l.A0Z(true);
        if (abstractC03344l.A06 != null && abstractC03344l.A07 == null) {
            abstractC03344l.A06 = null;
        }
        abstractC03344l.A07 = null;
        A0A = abstractC03344l.A0A();
        if (!A0A && !this.A00.A1z(abstractC03344l.A0H) && abstractC03344l.A0e()) {
            F6 f6 = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            A01[0] = "BbBTSQcWyeSpGVnm";
            f6.removeDetachedView(abstractC03344l.A0H, false);
        }
    }
}
