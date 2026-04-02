package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
/* loaded from: assets/audience_network.dex */
public class Q9 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C04157v A00;

    public Q9(C04157v c04157v) {
        this.A00 = c04157v;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        new Handler(Looper.getMainLooper()).post(new KS(this, i2));
    }
}
