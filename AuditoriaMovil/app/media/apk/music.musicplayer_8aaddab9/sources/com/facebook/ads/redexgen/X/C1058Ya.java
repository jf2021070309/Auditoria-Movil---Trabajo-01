package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
/* renamed from: com.facebook.ads.redexgen.X.Ya  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1058Ya implements InterfaceC03956v {
    public final /* synthetic */ YY A00;

    public C1058Ya(YY yy) {
        this.A00 = yy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        return this.A00.A03(((float) SystemClock.elapsedRealtime()) / 1000.0f);
    }
}
