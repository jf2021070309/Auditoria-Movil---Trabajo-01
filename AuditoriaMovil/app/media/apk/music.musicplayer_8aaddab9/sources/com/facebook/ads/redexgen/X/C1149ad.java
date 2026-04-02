package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.ad  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1149ad implements InterfaceC03956v {
    public static String[] A01 = {"hvm87xlnXDULJgpudJIAxjipYcLfVpPe", "aPn41y0iNcbQ3vA5A69njqeDstAsTpsV", "WXmwgMFdLW61FUxTxJC7XlBGpuRVL7Wu", "ePkGYIfh56SCQIxOGTOw2FZrMqM6oOvD", "H4G3VitdwZHOwCvFNAwNX1rKXwUNte3T", "QqBVensdyxYwCHnIBjshd9TsYmlVQcVc", "Npnx1Hqps9YG5SIKMksWN5UpsP86zlug", "K4PmfDIjqE3AfePNsovy4"};
    public final /* synthetic */ C1134aO A00;

    public C1149ad(C1134aO c1134aO) {
        this.A00 = c1134aO;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() throws Exception {
        C7F c7f;
        c7f = this.A00.A03;
        String A06 = c7f.A06(10005);
        if (A06 != null) {
            C1134aO c1134aO = this.A00;
            if (A01[7].length() != 21) {
                throw new RuntimeException();
            }
            A01[7] = "XG8OcIRWX82QEKbSmFw2M";
            return c1134aO.A08(A06);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
