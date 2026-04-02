package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Qk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0864Qk {
    void A7t();

    boolean A85();

    boolean A86();

    boolean A8b();

    void AD2(boolean z, int i2);

    void AEw(int i2);

    void AF1(EnumC0853Pz enumC0853Pz, int i2);

    void AF8(int i2);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC0853Pz getStartReason();

    EnumC0866Qm getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i2);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f2);

    void setVideoMPD(@Nullable String str);

    void setVideoStateChangeListener(@Nullable InterfaceC0867Qn interfaceC0867Qn);

    void setup(Uri uri);
}
