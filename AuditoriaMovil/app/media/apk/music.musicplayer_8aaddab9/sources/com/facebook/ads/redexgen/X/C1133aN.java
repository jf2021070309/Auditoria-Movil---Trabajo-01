package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
/* renamed from: com.facebook.ads.redexgen.X.aN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1133aN implements InterfaceC03956v {
    public final /* synthetic */ C1127aH A00;

    public C1133aN(C1127aH c1127aH) {
        this.A00 = c1127aH;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        AudioManager audioManager;
        C1127aH c1127aH = this.A00;
        audioManager = c1127aH.A00;
        return c1127aH.A0F(audioManager.isMicrophoneMute());
    }
}
