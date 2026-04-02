package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
/* renamed from: com.facebook.ads.redexgen.X.aL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1131aL implements InterfaceC03956v {
    public final /* synthetic */ C1127aH A00;

    public C1131aL(C1127aH c1127aH) {
        this.A00 = c1127aH;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        AudioManager audioManager;
        C1127aH c1127aH = this.A00;
        audioManager = c1127aH.A00;
        return c1127aH.A0F(audioManager.isSpeakerphoneOn());
    }
}
