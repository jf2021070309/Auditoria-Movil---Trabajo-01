package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
/* renamed from: com.facebook.ads.redexgen.X.Bg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0496Bg extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1031Wz A01;

    public C0496Bg(C1031Wz c1031Wz, AudioTrack audioTrack) {
        this.A01 = c1031Wz;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
