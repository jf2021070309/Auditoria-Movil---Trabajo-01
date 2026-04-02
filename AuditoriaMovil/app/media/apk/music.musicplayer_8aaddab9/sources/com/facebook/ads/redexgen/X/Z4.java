package com.facebook.ads.redexgen.X;

import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: assets/audience_network.dex */
public class Z4 implements InterfaceC03956v {
    public final /* synthetic */ C1069Yl A00;

    public Z4(C1069Yl c1069Yl) {
        this.A00 = c1069Yl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ServiceInfo[] serviceInfoArr;
        ServiceInfo[] serviceInfoArr2;
        C6C c6c;
        ServiceInfo[] serviceInfoArr3;
        serviceInfoArr = this.A00.A05;
        if (serviceInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            serviceInfoArr2 = this.A00.A05;
            int length = serviceInfoArr2.length;
            c6c = this.A00.A03;
            int min = Math.min(length, c6c.A0U());
            for (int i2 = 0; i2 < min; i2++) {
                serviceInfoArr3 = this.A00.A05;
                arrayList.add(serviceInfoArr3[i2].name);
            }
            Collections.sort(arrayList);
            return this.A00.A0E(arrayList);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
