package com.facebook.ads.redexgen.X;

import android.widget.MediaController;
/* renamed from: com.facebook.ads.redexgen.X.Qe  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0858Qe implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"T46fCpiGc88W2sm67KitVw29EyPc3", "CnzVRlVQiaWVzZBS", "ndpW2a6BPo0GfPTTlqn3VUL3zbZB353", "6dBvfVqLyh6nhF4N5m", "imXeYKfRY50epxOYIoCDJpdee5DGPOn9", "a2YCts1Ck8i", "mjIxnllGj7l0AybsaVU42LegCoMqgA9", "OPSSIwvLFtyh4B3JmayX8W92hCUnvGiN"};
    public final /* synthetic */ I0 A00;

    public C0858Qe(I0 i0) {
        this.A00 = i0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        QZ qz;
        QZ qz2;
        qz = this.A00.A0C;
        if (qz != null) {
            qz2 = this.A00.A0C;
            return qz2.A04();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        QZ qz;
        QZ qz2;
        qz = this.A00.A0C;
        if (qz != null) {
            qz2 = this.A00.A0C;
            return qz2.A05();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        QZ qz;
        QZ qz2;
        qz = this.A00.A0C;
        if (qz != null) {
            qz2 = this.A00.A0C;
            if (qz2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC0867Qn interfaceC0867Qn;
        InterfaceC0867Qn interfaceC0867Qn2;
        interfaceC0867Qn = this.A00.A0F;
        if (interfaceC0867Qn != null) {
            interfaceC0867Qn2 = this.A00.A0F;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "BHfWGVDMvGTMo8ZI3A6S5KtrLH6Ee";
            interfaceC0867Qn2.ABO();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i2) {
        this.A00.seekTo(i2);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC0867Qn interfaceC0867Qn;
        InterfaceC0867Qn interfaceC0867Qn2;
        interfaceC0867Qn = this.A00.A0F;
        if (interfaceC0867Qn != null) {
            interfaceC0867Qn2 = this.A00.A0F;
            interfaceC0867Qn2.ABP();
        }
    }
}
