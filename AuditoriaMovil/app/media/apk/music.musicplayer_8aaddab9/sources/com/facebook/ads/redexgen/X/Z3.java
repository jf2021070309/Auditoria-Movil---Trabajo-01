package com.facebook.ads.redexgen.X;

import android.content.pm.ServiceInfo;
/* loaded from: assets/audience_network.dex */
public class Z3 implements InterfaceC03956v {
    public static String[] A01 = {"Kjl9x1nXLMp", "FYT6FJfE388FncoeBbUW5LDH7Ti6Kpnc", "Yxd2XW5tX0tpbE5v80iFGWNMQ7F", "Eun4caaboMQouomEKTkKbMJy1uWMR8C3", "2B", "gVUv49X3C1I0CRHiCQrxfKc2j3pZm33W", "VtV7HGxoJcmYVE0XtMWfAnTQdxbbthfO", "Muv0aFmfDz7QlEQw1d"};
    public final /* synthetic */ C1069Yl A00;

    public Z3(C1069Yl c1069Yl) {
        this.A00 = c1069Yl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ServiceInfo[] serviceInfoArr;
        ServiceInfo[] serviceInfoArr2;
        serviceInfoArr = this.A00.A05;
        if (serviceInfoArr != null) {
            C1069Yl c1069Yl = this.A00;
            serviceInfoArr2 = c1069Yl.A05;
            return c1069Yl.A04(serviceInfoArr2.length);
        }
        C1069Yl c1069Yl2 = this.A00;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            String[] strArr2 = A01;
            strArr2[0] = "czOc910r7ol";
            strArr2[2] = "WgsI1fVM7Yu7d9q7aeaJmksjNii";
            return c1069Yl2.A07(AnonymousClass76.A07);
        }
        throw new RuntimeException();
    }
}
