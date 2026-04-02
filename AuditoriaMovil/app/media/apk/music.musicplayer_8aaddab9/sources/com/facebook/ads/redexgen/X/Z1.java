package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
/* loaded from: assets/audience_network.dex */
public class Z1 implements InterfaceC03956v {
    public final /* synthetic */ C1069Yl A00;

    public Z1(C1069Yl c1069Yl) {
        this.A00 = c1069Yl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        String[] strArr;
        String[] strArr2;
        C6C c6c;
        String[] strArr3;
        strArr = this.A00.A06;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList();
            strArr2 = this.A00.A06;
            int length = strArr2.length;
            c6c = this.A00.A03;
            int min = Math.min(length, c6c.A0U());
            for (int i2 = 0; i2 < min; i2++) {
                strArr3 = this.A00.A06;
                arrayList.add(strArr3[i2]);
            }
            return this.A00.A0E(arrayList);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
