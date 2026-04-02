package com.kwad.sdk.core.video.a;

import android.content.Context;
import android.media.TimedText;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.util.Map;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public interface a {
        void aw(int i);
    }

    /* loaded from: classes.dex */
    public interface b {
        void ow();
    }

    /* renamed from: com.kwad.sdk.core.video.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0260c {
        boolean j(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean k(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(c cVar);
    }

    /* loaded from: classes.dex */
    public interface f {
        void ox();
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TimedText timedText);
    }

    /* loaded from: classes.dex */
    public interface h {
        void i(int i, int i2);
    }

    void a(com.kwad.sdk.contentalliance.a.a.b bVar);

    void a(a aVar);

    void a(b bVar);

    void a(InterfaceC0260c interfaceC0260c);

    void a(f fVar);

    void a(g gVar);

    void a(h hVar);

    void b(e eVar);

    void c(d dVar);

    int getAudioSessionId();

    String getCurrentPlayingUrl();

    long getCurrentPosition();

    String getDataSource();

    long getDuration();

    int getMediaPlayerType();

    int getVideoHeight();

    int getVideoWidth();

    boolean isLooping();

    boolean isPlaying();

    void pause();

    boolean prepareAsync();

    void release();

    void reset();

    void seekTo(long j);

    void setAudioStreamType(int i);

    void setDataSource(Context context, Uri uri);

    void setDataSource(Context context, Uri uri, Map<String, String> map);

    void setDataSource(FileDescriptor fileDescriptor);

    void setDataSource(String str);

    void setDisplay(SurfaceHolder surfaceHolder);

    void setLooping(boolean z);

    void setScreenOnWhilePlaying(boolean z);

    void setSpeed(float f2);

    void setSurface(Surface surface);

    void setVolume(float f2, float f3);

    void start();

    void stop();
}
