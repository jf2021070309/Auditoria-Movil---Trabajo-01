package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.ConditionVariable;
/* renamed from: com.facebook.ads.redexgen.X.Bf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0495Bf extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1031Wz A01;

    public C0495Bf(C1031Wz c1031Wz, AudioTrack audioTrack) {
        this.A01 = c1031Wz;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.flush();
            this.A00.release();
            conditionVariable = this.A01.A0f;
            conditionVariable.open();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
