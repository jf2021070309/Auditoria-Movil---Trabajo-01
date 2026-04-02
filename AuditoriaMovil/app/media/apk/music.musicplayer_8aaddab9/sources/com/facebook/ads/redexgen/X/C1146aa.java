package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.io.File;
/* renamed from: com.facebook.ads.redexgen.X.aa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1146aa implements InterfaceC03956v {
    public final /* synthetic */ C1134aO A00;

    public C1146aa(C1134aO c1134aO) {
        this.A00 = c1134aO;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        Context context;
        context = this.A00.A00;
        return this.A00.A06(new File(context.getApplicationInfo().publicSourceDir).length());
    }
}
