package com.facebook.ads.redexgen.X;

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;
/* loaded from: assets/audience_network.dex */
public class Z7 implements InterfaceC03956v {
    public final /* synthetic */ Z5 A00;

    public Z7(Z5 z5) {
        this.A00 = z5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() throws Exception {
        C7A A02;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        HashMap hashMap = new HashMap();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            hashMap.put(nextElement.getDisplayName(), new Z6(nextElement.getInetAddresses(), null));
        }
        A02 = this.A00.A02(hashMap);
        return A02;
    }
}
