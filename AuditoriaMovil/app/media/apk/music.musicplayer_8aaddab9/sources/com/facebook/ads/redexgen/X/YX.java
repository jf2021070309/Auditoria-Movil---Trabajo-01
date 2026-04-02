package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public class YX implements InterfaceC03956v {
    public final /* synthetic */ YV A00;
    public final /* synthetic */ List A01;

    public YX(YV yv, List list) {
        this.A00 = yv;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        C7A A02;
        HashMap hashMap = new HashMap();
        for (C03946u c03946u : this.A01) {
            if (c03946u.A02()) {
                String str = (String) c03946u.A01();
                YW systemProperty = new YW(str);
                hashMap.put(str, systemProperty);
            }
        }
        A02 = this.A00.A02(hashMap);
        return A02;
    }
}
