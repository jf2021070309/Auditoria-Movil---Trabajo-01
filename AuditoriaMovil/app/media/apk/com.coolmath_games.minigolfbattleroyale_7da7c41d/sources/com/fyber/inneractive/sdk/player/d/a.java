package com.fyber.inneractive.sdk.player.d;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.m;
import com.vungle.warren.AdLoader;
import com.vungle.warren.analytics.AnalyticsEvent;
import java.util.Locale;
/* loaded from: classes.dex */
public final class a extends MediaPlayer implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
    Context a;
    Handler e;
    HandlerThread f;
    Handler g;
    private InterfaceC0066a l;
    private Surface m;
    private SurfaceHolder n;
    private long o;
    private Runnable q;
    private Runnable r;
    public volatile com.fyber.inneractive.sdk.player.enums.b b = com.fyber.inneractive.sdk.player.enums.b.Idle;
    public boolean c = false;
    public boolean d = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private Exception k = null;
    private int p = 0;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    private int v = 0;

    /* renamed from: com.fyber.inneractive.sdk.player.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0066a {
        void a(com.fyber.inneractive.sdk.player.enums.b bVar);

        void a(Exception exc);
    }

    static /* synthetic */ boolean j(a aVar) {
        aVar.i = true;
        return true;
    }

    public a(Context context, InterfaceC0066a interfaceC0066a, Handler handler) {
        this.a = context;
        this.l = interfaceC0066a;
        this.e = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f = handlerThread;
        handlerThread.start();
        this.g = new Handler(this.f.getLooper());
        this.r = new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.3
            @Override // java.lang.Runnable
            public final void run() {
                a.h(a.this);
            }
        };
    }

    @Override // android.media.MediaPlayer
    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    @Override // android.media.MediaPlayer
    public final void setDisplay(final SurfaceHolder surfaceHolder) {
        IAlog.b("%s setDisplay called", c());
        if (!a()) {
            IAlog.b("%s setDisplay called when player is not ready!", c());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.n;
        if (surfaceHolder2 != null && surfaceHolder2.equals(surfaceHolder)) {
            IAlog.b("%s setDisplay called with existing surface. ignoring!", c());
            return;
        }
        this.n = surfaceHolder;
        a(new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, surfaceHolder);
            }
        });
    }

    @Override // android.media.MediaPlayer
    public final void setSurface(final Surface surface) {
        IAlog.b("%s setSurface called", c());
        Surface surface2 = this.m;
        if (surface2 != null && surface2.equals(surface)) {
            IAlog.b("%s setSurface called with existing surface. ignoring!", c());
            return;
        }
        this.m = surface;
        a(new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.6
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, surface);
            }
        });
    }

    public final boolean a() {
        return (this.b == com.fyber.inneractive.sdk.player.enums.b.Idle || this.b == com.fyber.inneractive.sdk.player.enums.b.Preparing) ? false : true;
    }

    @Override // android.media.MediaPlayer
    public final boolean isPlaying() {
        return a() && this.b != com.fyber.inneractive.sdk.player.enums.b.Paused && super.isPlaying();
    }

    @Override // android.media.MediaPlayer
    public final int getDuration() {
        return this.s;
    }

    @Override // android.media.MediaPlayer
    public final int getCurrentPosition() {
        if (a()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoWidth() {
        return this.u;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoHeight() {
        return this.v;
    }

    public final void a(String str) {
        IAlog.a aVar = new IAlog.a(c(), "loadUri");
        this.i = false;
        this.j = false;
        this.k = null;
        if (isPlaying()) {
            IAlog.b("%s loadUri stopping play before refresh", c());
            stop();
        }
        this.o = System.currentTimeMillis();
        d();
        IAlog.b("%s calling setDataSource with %s", c(), str);
        try {
            setDataSource(str);
            IAlog.b("%s setDataSource succeeded, calling prepareAsync", c());
            a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e) {
                IAlog.e("%s prepareAsync failed with illegal mState exception: %s", c(), e.getMessage());
                int i = this.p + 1;
                this.p = i;
                if (i < 5) {
                    a(str);
                }
                if (this.p == 5) {
                    this.k = e;
                }
                this.p = 0;
            }
            aVar.a();
        } catch (Exception e2) {
            IAlog.e("%s error setting data source %s", c(), str);
            IAlog.e("%s exception message: %s", c(), e2.getMessage());
            this.k = e2;
        }
    }

    @Override // android.media.MediaPlayer
    public final void release() {
        if (!this.h) {
            a(new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.7
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this);
                    if (a.this.g != null) {
                        a.this.g.removeCallbacksAndMessages(null);
                        a.this.g = null;
                    }
                    a.this.f = null;
                    Looper.myLooper().quit();
                }
            });
        }
        this.l = null;
        this.r = null;
        this.h = true;
        IAlog.b("%s release called", c());
    }

    @Override // android.media.MediaPlayer
    public final void reset() {
        IAlog.b("%s reset called", c());
        if (this.q != null) {
            m.a().removeCallbacks(this.q);
        }
        a(new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.8
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d();
            }
        });
    }

    @Override // android.media.MediaPlayer
    public final void start() {
        IAlog.b("%s Start called", c());
        if (!a()) {
            IAlog.b("%s MediaPlayer: Start called when player is not ready! - mState = %s", c(), this.b);
        } else if (this.b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            this.c = true;
        } else if (isPlaying()) {
            IAlog.b("%s MediaPlayer: Start called when player is already playing. do nothing", c());
        } else {
            a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
            a(new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.9
                @Override // java.lang.Runnable
                public final void run() {
                    a.c(a.this);
                }
            });
        }
    }

    @Override // android.media.MediaPlayer
    public final void stop() {
        IAlog.a aVar = new IAlog.a(c(), "stop");
        if (a()) {
            super.stop();
        }
        IAlog.b("%s stop called", c());
        aVar.a();
    }

    @Override // android.media.MediaPlayer
    public final void pause() {
        if (this.b == com.fyber.inneractive.sdk.player.enums.b.Idle || this.b == com.fyber.inneractive.sdk.player.enums.b.Completed || this.b == com.fyber.inneractive.sdk.player.enums.b.Paused || this.b == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            IAlog.b("%s paused called when player is in mState: %s ignoring", c(), this.b);
            return;
        }
        a(com.fyber.inneractive.sdk.player.enums.b.Paused);
        if (a()) {
            a(new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.11
                @Override // java.lang.Runnable
                public final void run() {
                    a.d(a.this);
                }
            });
        } else {
            IAlog.b("%s paused called when player is not ready!", c());
        }
        IAlog.b("%s pause", c());
    }

    public final void b() {
        this.d = true;
        if (a()) {
            a(new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.12
                @Override // java.lang.Runnable
                public final void run() {
                    a.e(a.this);
                }
            });
        } else {
            IAlog.b("%s mute called when player is not ready!", c());
        }
        IAlog.b("%s mute", c());
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.b("%s onPrepared %s gotPrepared = %s", c(), this, Boolean.valueOf(this.j));
        IAlog.b("%sMedia prepare time took %d msec", c(), Long.valueOf(System.currentTimeMillis() - this.o));
        if (this.b != com.fyber.inneractive.sdk.player.enums.b.Preparing && this.b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.d("%s onPrepared: previous error encountered. Aborting", c());
        } else if (this.j) {
            IAlog.b("%s onPrepared called again??? We are already prepared", c());
        } else {
            this.j = true;
            e();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.t = getDuration();
        a(com.fyber.inneractive.sdk.player.enums.b.Completed);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, final int i, final int i2) {
        IAlog.d("%s onError code = %d code2 = %d", c(), Integer.valueOf(i), Integer.valueOf(i2));
        d();
        this.e.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.l != null) {
                    a.this.l.a(new b(String.format(Locale.ENGLISH, "Player Error: %d, %d", Integer.valueOf(i), Integer.valueOf(i2))));
                }
            }
        });
        return true;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.b("%s onSeekComplete called current position = %d", c(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.b("%s onSeekComplete called when Story is not seeking", c());
            return;
        }
        if (this.d) {
            b();
        }
        if (this.c) {
            IAlog.b("%s onSeekComplete mPlayAfterSeek = true", c());
            this.b = com.fyber.inneractive.sdk.player.enums.b.Paused;
            start();
            return;
        }
        IAlog.b("%s onSeekComplete mPlayAfterSeek = false", c());
        a(com.fyber.inneractive.sdk.player.enums.b.Paused);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.b("%s onVideoSizeChanged %d, %d", c(), Integer.valueOf(i), Integer.valueOf(i2));
        if (this.i) {
            return;
        }
        if (this.q != null) {
            m.a().removeCallbacks(this.q);
            IAlog.b("%s onVideoSizeChanged cancelling prepared runnable", c());
        }
        this.i = true;
        if (i == 0 || i2 == 0) {
            IAlog.d("%s onVideoSizeChanged - Invalid video size!", c());
            onError(this, 0, 0);
            return;
        }
        IAlog.b("%sMedia got video size time took %d msec", c(), Long.valueOf(System.currentTimeMillis() - this.o));
        this.u = i;
        this.v = i2;
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        IAlog.a aVar = new IAlog.a(c(), "reset");
        if (this.b == com.fyber.inneractive.sdk.player.enums.b.Idle) {
            IAlog.b("%s reset called, but player is already resetted. Do nothing", c());
            return;
        }
        a(com.fyber.inneractive.sdk.player.enums.b.Idle);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.j) {
            if (this.i) {
                IAlog.b("%sMedia load time took %d msec", c(), Long.valueOf(System.currentTimeMillis() - this.o));
                this.s = super.getDuration();
                a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                if (this.d) {
                    b();
                    return;
                }
                return;
            }
            IAlog.b("%sGot prepared only, waiting for video size", c());
            if (this.q == null) {
                this.q = new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        IAlog.b("%sCannot wait for video size anymore", a.this.c());
                        if (a.this.getDuration() == 0) {
                            IAlog.b("%sCannot wait for video size anymore. duration is still 0 - aborting", a.this.c());
                            a aVar = a.this;
                            aVar.onError(aVar, 0, 0);
                            return;
                        }
                        IAlog.b("%sCannot wait for video size anymore. moving into ready", a.this.c());
                        a.j(a.this);
                        a.this.e();
                    }
                };
            }
            m.a().postDelayed(this.q, AdLoader.RETRY_DELAY);
        }
    }

    public final void a(final com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.b("%s updatePlayerState - %s", c(), bVar);
        synchronized (this.b) {
            if (this.b == bVar) {
                IAlog.b("%s updatePlayerState - mState didn't change!", c());
            } else {
                IAlog.b("%s updatePlayerState - changing from %s to %s", c(), this.b, bVar);
                this.b = bVar;
                this.e.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (a.this.l != null) {
                            a.this.l.a(bVar);
                        }
                    }
                });
            }
        }
    }

    public final void a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f;
        if (handlerThread != null && handlerThread.isAlive() && !this.f.isInterrupted() && (handler2 = this.g) != null) {
            handler2.post(runnable);
        }
        if ((this.u == 0 || this.v == 0 || this.s == 0) && (handler = this.g) != null) {
            handler.post(this.r);
        }
    }

    public final String c() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + ": ";
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {
        public b(String str) {
            super(str);
        }

        public b(Throwable th, String str) {
            super(str, th);
        }
    }

    static /* synthetic */ void a(a aVar, SurfaceHolder surfaceHolder) {
        IAlog.a aVar2 = new IAlog.a(aVar.c(), "setDisplayInternal");
        IAlog.b("%s setDisplay called with %s", aVar.c(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.b("%s setDisplay with null! current display cleared", aVar.c());
            } else {
                IAlog.b("%s setDisplay - replacing surface holder!", aVar.c());
            }
            aVar2.a();
        } catch (Exception unused) {
            IAlog.b("%s super.setDisplay threw exception!", aVar.c());
        }
    }

    static /* synthetic */ void a(a aVar, Surface surface) {
        IAlog.a aVar2 = new IAlog.a(aVar.c(), "setSurface");
        IAlog.b("%s setSurface called with %s", aVar.c(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                IAlog.b("%s setSurface with null! current surface cleared", aVar.c());
            } else {
                IAlog.b("%s setSurface - replacing surface!", aVar.c());
            }
            aVar2.a();
        } catch (Exception unused) {
            IAlog.b("%s super.setSurface threw exception!", aVar.c());
        }
    }

    static /* synthetic */ void a(a aVar) {
        IAlog.a aVar2 = new IAlog.a(aVar.c(), "release");
        super.release();
        aVar2.a();
    }

    static /* synthetic */ void c(a aVar) {
        IAlog.a aVar2 = new IAlog.a(aVar.c(), "start");
        com.fyber.inneractive.sdk.player.enums.b bVar = aVar.b;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress) {
            super.start();
            aVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
        } else {
            IAlog.b("%s Start called in wrong mState! %s", aVar.c(), bVar);
            if (aVar.b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
                aVar.c = true;
            }
        }
        aVar2.a();
    }

    static /* synthetic */ void a(a aVar, int i) {
        IAlog.a aVar2 = new IAlog.a(aVar.c(), "seekTo");
        super.seekTo(i);
        aVar2.a();
    }

    static /* synthetic */ void d(a aVar) {
        IAlog.a aVar2 = new IAlog.a(aVar.c(), "delayed pause");
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.b("%s paused called cannot set to pause, canceled", aVar.c());
        }
        aVar2.a();
    }

    static /* synthetic */ void e(a aVar) {
        IAlog.a aVar2 = new IAlog.a(aVar.c(), AnalyticsEvent.Ad.mute);
        aVar.setVolume(0.0f, 0.0f);
        aVar2.a();
    }

    static /* synthetic */ void f(a aVar) {
        IAlog.a aVar2 = new IAlog.a(aVar.c(), AnalyticsEvent.Ad.unmute);
        AudioManager audioManager = (AudioManager) aVar.a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = streamVolume / streamMaxVolume;
        IAlog.b("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", aVar.c(), Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
        if (f == 0.0f) {
            f = 0.1f;
        }
        aVar.setVolume(f, f);
        aVar2.a();
    }

    static /* synthetic */ void h(a aVar) {
        if (aVar.a()) {
            aVar.u = super.getVideoWidth();
            aVar.v = super.getVideoHeight();
            aVar.s = super.getDuration();
        }
    }
}
