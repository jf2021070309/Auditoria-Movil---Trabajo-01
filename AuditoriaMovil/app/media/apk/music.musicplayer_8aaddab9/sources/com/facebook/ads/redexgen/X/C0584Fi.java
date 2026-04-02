package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Fi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0584Fi extends AbstractC0930Sy {
    public static byte[] A02;
    public final /* synthetic */ C1318dS A00;
    public final /* synthetic */ C1309dJ A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, 2, -2, -3, 0};
    }

    public C0584Fi(C1318dS c1318dS, C1309dJ c1309dJ) {
        this.A00 = c1318dS;
        this.A01 = c1309dJ;
    }

    @Override // com.facebook.ads.redexgen.X.O3
    public final void AA1() {
        boolean z;
        this.A00.A0E = true;
        z = this.A00.A0F;
        if (!z) {
            return;
        }
        this.A00.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0930Sy, com.facebook.ads.redexgen.X.O3
    public final void AAH(String str, Map<String, String> map) {
        E5 e5;
        E5 e52;
        InterfaceC0684Jg interfaceC0684Jg;
        String str2;
        E5 e53;
        InterfaceC02430v interfaceC02430v;
        InterfaceC02430v interfaceC02430v2;
        e5 = this.A00.A03;
        e5.A0D().A3X();
        Uri parse = Uri.parse(str);
        if (A00(22, 4, 82).equals(parse.getScheme()) && C02290g.A04(parse.getAuthority())) {
            interfaceC02430v = this.A00.A00;
            if (interfaceC02430v != null) {
                interfaceC02430v2 = this.A00.A00;
                interfaceC02430v2.AAA(this.A00);
            }
        }
        e52 = this.A00.A03;
        interfaceC0684Jg = this.A00.A04;
        AbstractC02280f A00 = C02290g.A00(e52, interfaceC0684Jg, this.A01.A64(), parse, map);
        if (A00 == null) {
            return;
        }
        try {
            e53 = this.A00.A03;
            e53.A0D().A3U();
            A00.A0B();
        } catch (Exception e2) {
            str2 = C1318dS.A0I;
            Log.e(str2, A00(0, 22, 0), e2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0930Sy, com.facebook.ads.redexgen.X.O3
    public final void AAw() {
        E5 e5;
        C1307dH c1307dH;
        C1307dH c1307dH2;
        C1307dH c1307dH3;
        e5 = this.A00.A03;
        InterfaceC1335dj A0D = e5.A0D();
        c1307dH = this.A00.A01;
        A0D.A3Y(c1307dH != null);
        c1307dH2 = this.A00.A01;
        if (c1307dH2 == null) {
            return;
        }
        c1307dH3 = this.A00.A01;
        c1307dH3.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0930Sy, com.facebook.ads.redexgen.X.O3
    public final void ABe() {
        E5 e5;
        C1307dH c1307dH;
        e5 = this.A00.A03;
        e5.A0D().A3a();
        c1307dH = this.A00.A01;
        c1307dH.A07();
    }

    @Override // com.facebook.ads.redexgen.X.O3
    public final void ACr() {
    }
}
