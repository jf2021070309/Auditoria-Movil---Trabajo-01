package com.applovin.impl.adview;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.MediaController;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.e.o;
import java.util.Map;
/* loaded from: classes.dex */
public class AppLovinVideoViewV2 extends SurfaceView implements MediaController.MediaPlayerControl {
    private final MediaPlayer.OnCompletionListener A;
    private final MediaPlayer.OnInfoListener B;
    private final MediaPlayer.OnErrorListener C;
    private final MediaPlayer.OnBufferingUpdateListener D;
    private final MediaPlayer.OnSeekCompleteListener E;
    private final com.applovin.impl.sdk.r a;
    private final g.d b;
    private final com.applovin.impl.sdk.k c;
    private Uri d;
    private int e;
    private int f;
    private SurfaceHolder g;
    private MediaPlayer h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private MediaPlayer.OnCompletionListener n;
    private MediaPlayer.OnPreparedListener o;
    private int p;
    private MediaPlayer.OnErrorListener q;
    private MediaPlayer.OnInfoListener r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private AudioManager w;
    private int x;
    private final MediaPlayer.OnVideoSizeChangedListener y;
    private final MediaPlayer.OnPreparedListener z;

    public AppLovinVideoViewV2(g.d dVar, Context context, com.applovin.impl.sdk.k kVar) {
        super(context);
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = null;
        this.x = 1;
        this.y = new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.applovin.impl.adview.AppLovinVideoViewV2.3
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                AppLovinVideoViewV2.this.j = mediaPlayer.getVideoWidth();
                AppLovinVideoViewV2.this.k = mediaPlayer.getVideoHeight();
                if (AppLovinVideoViewV2.this.j == 0 || AppLovinVideoViewV2.this.k == 0) {
                    return;
                }
                AppLovinVideoViewV2.this.getHolder().setFixedSize(AppLovinVideoViewV2.this.j, AppLovinVideoViewV2.this.k);
                AppLovinVideoViewV2.this.requestLayout();
            }
        };
        this.z = new MediaPlayer.OnPreparedListener() { // from class: com.applovin.impl.adview.AppLovinVideoViewV2.4
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                AppLovinVideoViewV2.this.e = 2;
                AppLovinVideoViewV2 appLovinVideoViewV2 = AppLovinVideoViewV2.this;
                appLovinVideoViewV2.t = appLovinVideoViewV2.u = appLovinVideoViewV2.v = true;
                if (AppLovinVideoViewV2.this.o != null) {
                    AppLovinVideoViewV2.this.o.onPrepared(AppLovinVideoViewV2.this.h);
                }
                AppLovinVideoViewV2.this.j = mediaPlayer.getVideoWidth();
                AppLovinVideoViewV2.this.k = mediaPlayer.getVideoHeight();
                int i = AppLovinVideoViewV2.this.s;
                if (i != 0) {
                    AppLovinVideoViewV2.this.seekTo(i);
                }
                if (AppLovinVideoViewV2.this.j != 0 && AppLovinVideoViewV2.this.k != 0) {
                    AppLovinVideoViewV2.this.getHolder().setFixedSize(AppLovinVideoViewV2.this.j, AppLovinVideoViewV2.this.k);
                    if (AppLovinVideoViewV2.this.l != AppLovinVideoViewV2.this.j || AppLovinVideoViewV2.this.m != AppLovinVideoViewV2.this.k || AppLovinVideoViewV2.this.f != 3) {
                        return;
                    }
                } else if (AppLovinVideoViewV2.this.f != 3) {
                    return;
                }
                AppLovinVideoViewV2.this.start();
            }
        };
        this.A = new MediaPlayer.OnCompletionListener() { // from class: com.applovin.impl.adview.AppLovinVideoViewV2.5
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                AppLovinVideoViewV2.this.e = 5;
                AppLovinVideoViewV2.this.f = 5;
                if (AppLovinVideoViewV2.this.n != null) {
                    AppLovinVideoViewV2.this.n.onCompletion(AppLovinVideoViewV2.this.h);
                }
                if (AppLovinVideoViewV2.this.x != 0) {
                    AppLovinVideoViewV2.this.w.abandonAudioFocus(null);
                }
            }
        };
        this.B = new MediaPlayer.OnInfoListener() { // from class: com.applovin.impl.adview.AppLovinVideoViewV2.6
            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                if (AppLovinVideoViewV2.this.r != null) {
                    AppLovinVideoViewV2.this.r.onInfo(mediaPlayer, i, i2);
                    return true;
                }
                return true;
            }
        };
        this.C = new MediaPlayer.OnErrorListener() { // from class: com.applovin.impl.adview.AppLovinVideoViewV2.7
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                com.applovin.impl.sdk.r rVar = AppLovinVideoViewV2.this.a;
                rVar.b("AppLovinVideoView", "Media player error: " + i + ", " + i2);
                AppLovinVideoViewV2.this.e = -1;
                AppLovinVideoViewV2.this.f = -1;
                if (AppLovinVideoViewV2.this.q == null || AppLovinVideoViewV2.this.q.onError(AppLovinVideoViewV2.this.h, i, i2)) {
                }
                return true;
            }
        };
        this.D = new MediaPlayer.OnBufferingUpdateListener() { // from class: com.applovin.impl.adview.AppLovinVideoViewV2.8
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                com.applovin.impl.sdk.r rVar = AppLovinVideoViewV2.this.a;
                rVar.b("AppLovinVideoView", "Buffered: " + i + "%");
                AppLovinVideoViewV2.this.p = i;
            }
        };
        this.E = new MediaPlayer.OnSeekCompleteListener() { // from class: com.applovin.impl.adview.AppLovinVideoViewV2.9
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(MediaPlayer mediaPlayer) {
                AppLovinVideoViewV2.this.a.b("AppLovinVideoView", "Seek finished");
            }
        };
        this.b = dVar;
        this.a = kVar.z();
        this.c = kVar;
        this.w = (AudioManager) context.getSystemService("audio");
        getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.applovin.impl.adview.AppLovinVideoViewV2.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                AppLovinVideoViewV2.this.a.b("AppLovinVideoView", "Surface changed with format: " + i + ", width: " + i2 + ", height: " + i3);
                AppLovinVideoViewV2.this.l = i2;
                AppLovinVideoViewV2.this.m = i3;
                boolean z = false;
                boolean z2 = AppLovinVideoViewV2.this.f == 3 || AppLovinVideoViewV2.this.f == 4;
                if (AppLovinVideoViewV2.this.j == i2 && AppLovinVideoViewV2.this.k == i3) {
                    z = true;
                }
                if (AppLovinVideoViewV2.this.h != null && z2 && z) {
                    if (AppLovinVideoViewV2.this.s != 0) {
                        AppLovinVideoViewV2 appLovinVideoViewV2 = AppLovinVideoViewV2.this;
                        appLovinVideoViewV2.seekTo(appLovinVideoViewV2.s);
                    }
                    AppLovinVideoViewV2.this.start();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                AppLovinVideoViewV2.this.a.b("AppLovinVideoView", "Surface created");
                AppLovinVideoViewV2.this.g = surfaceHolder;
                if (AppLovinVideoViewV2.this.h != null) {
                    AppLovinVideoViewV2.this.h.setSurface(surfaceHolder.getSurface());
                } else {
                    AppLovinVideoViewV2.this.a();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                AppLovinVideoViewV2.this.a.b("AppLovinVideoView", "Surface destroyed");
                AppLovinVideoViewV2.this.g = null;
            }
        });
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.e = 0;
        this.f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.a.b("AppLovinVideoView", "Opening video");
        if (this.d == null || this.g == null) {
            return;
        }
        if (this.h != null) {
            this.a.b("AppLovinVideoView", "Using existing MediaPlayer");
            this.h.start();
            return;
        }
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.h = mediaPlayer;
            if (this.i != 0) {
                mediaPlayer.setAudioSessionId(this.i);
            } else {
                this.i = mediaPlayer.getAudioSessionId();
            }
            this.h.setOnPreparedListener(this.z);
            this.h.setOnVideoSizeChangedListener(this.y);
            this.h.setOnCompletionListener(this.A);
            this.h.setOnErrorListener(this.C);
            this.h.setOnInfoListener(this.B);
            this.h.setOnBufferingUpdateListener(this.D);
            this.h.setOnSeekCompleteListener(this.E);
            this.p = 0;
            this.h.setDataSource(getContext(), this.d, (Map<String, String>) null);
            this.h.setDisplay(this.g);
            this.h.setScreenOnWhilePlaying(true);
            this.h.prepareAsync();
            this.e = 1;
        } catch (Throwable th) {
            com.applovin.impl.sdk.r.c("AppLovinVideoView", "Unable to open video: " + this.d, th);
            this.e = -1;
            this.f = -1;
            this.C.onError(this.h, 1, 0);
        }
    }

    private boolean b() {
        int i;
        return (this.h == null || (i = this.e) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.t;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.u;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.i == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.i = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.i;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.h != null) {
            return this.p;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (b()) {
            return this.h.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (b()) {
            return this.h.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return b() && this.h.isPlaying();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.j, i);
        int defaultSize2 = getDefaultSize(this.k, i2);
        if (this.j > 0 && this.k > 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            boolean z = this.j * defaultSize2 < this.k * defaultSize;
            boolean z2 = this.j * defaultSize2 > this.k * defaultSize;
            if (this.b == g.d.RESIZE_ASPECT) {
                if (z) {
                    defaultSize = (this.j * size2) / this.k;
                    defaultSize2 = size2;
                } else {
                    if (z2) {
                        defaultSize2 = (this.k * size) / this.j;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (this.b == g.d.RESIZE_ASPECT_FILL) {
                if (z) {
                    defaultSize2 = (int) (this.k * (size / this.j));
                    defaultSize = size;
                } else {
                    if (z2) {
                        defaultSize = (int) (this.j * (size2 / this.k));
                        defaultSize2 = size2;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        this.a.b("AppLovinVideoView", "Pausing video");
        if (b() && this.h.isPlaying()) {
            this.h.pause();
        }
        this.f = 4;
    }

    public void resume() {
        this.a.b("AppLovinVideoView", "Resuming video");
        a();
    }

    public void seekAndStart(long j) {
        com.applovin.impl.sdk.r rVar = this.a;
        rVar.b("AppLovinVideoView", "Seeking and starting to " + j + "ms...");
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) j);
        } else {
            this.a.e("AppLovinVideoView", "Media player unavailable");
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        com.applovin.impl.sdk.r rVar = this.a;
        rVar.b("AppLovinVideoView", "Seeking to " + i + "ms");
        if (b()) {
            this.h.seekTo(i);
            i = 0;
        } else {
            this.a.b("AppLovinVideoView", "Seek delayed");
        }
        this.s = i;
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.n = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.q = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.r = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.o = onPreparedListener;
    }

    public void setVideoURI(Uri uri) {
        com.applovin.impl.sdk.r rVar = this.a;
        rVar.b("AppLovinVideoView", "Setting video uri: " + uri);
        this.d = uri;
        this.s = 0;
        a();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        this.a.b("AppLovinVideoView", "Starting video");
        if (b()) {
            this.h.start();
        }
        this.f = 3;
    }

    public void stopPlayback() {
        this.a.b("AppLovinVideoView", "Stopping playback");
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            final MediaPlayer mediaPlayer2 = this.h;
            this.h = null;
            this.e = 0;
            this.f = 0;
            this.w.abandonAudioFocus(null);
            if (((Boolean) this.c.a(com.applovin.impl.sdk.c.b.eI)).booleanValue()) {
                this.c.Q().a(new com.applovin.impl.sdk.e.y(this.c, new Runnable() { // from class: com.applovin.impl.adview.AppLovinVideoViewV2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        mediaPlayer2.release();
                    }
                }), o.a.BACKGROUND);
            } else {
                mediaPlayer2.release();
            }
        }
    }
}
