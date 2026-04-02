package com.facebook.ads.internal.view.e.d;

import android.net.Uri;
import android.view.View;
/* loaded from: classes2.dex */
public interface c {
    void a(int i);

    void a(com.facebook.ads.internal.view.e.a.a aVar);

    void a(boolean z);

    void b();

    void b(boolean z);

    void c();

    boolean d();

    void e();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    com.facebook.ads.internal.view.e.a.a getStartReason();

    d getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(e eVar);

    void setup(Uri uri);
}
