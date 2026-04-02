package com.facebook.ads.redexgen.X;

import ch.qos.logback.classic.Level;
import java.util.HashMap;
/* renamed from: com.facebook.ads.redexgen.X.aG  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1126aG implements InterfaceC03956v {
    public final /* synthetic */ C1113a3 A00;
    public final /* synthetic */ HashMap A01;

    public C1126aG(C1113a3 c1113a3, HashMap hashMap) {
        this.A00 = c1113a3;
        this.A01 = hashMap;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        return this.A00.A05(Level.ALL_INT, this.A01);
    }
}
