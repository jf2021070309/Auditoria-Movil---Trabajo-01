package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.dQ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1316dQ extends L7 {
    public final /* synthetic */ C1315dP A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1316dQ(C1315dP c1315dP, Map map, Map map2) {
        this.A00 = c1315dP;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        AnonymousClass11 anonymousClass11;
        C1046Xo c1046Xo;
        AnonymousClass11 anonymousClass112;
        anonymousClass11 = this.A00.A01;
        if (!TextUtils.isEmpty(anonymousClass11.A0Y())) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.A02);
            hashMap.putAll(this.A01);
            c1046Xo = this.A00.A09;
            InterfaceC0684Jg A08 = c1046Xo.A08();
            anonymousClass112 = this.A00.A01;
            A08.A9J(anonymousClass112.A0Y(), hashMap);
        }
    }
}
