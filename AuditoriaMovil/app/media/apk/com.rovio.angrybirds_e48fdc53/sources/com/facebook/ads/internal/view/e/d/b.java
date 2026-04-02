package com.facebook.ads.internal.view.e.d;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
/* loaded from: classes2.dex */
public class b extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, c {
    private static final String s = b.class.getSimpleName();
    private Uri a;
    private e b;
    private Surface c;
    private MediaPlayer d;
    private MediaController e;
    private d f;
    private d g;
    private d h;
    private boolean i;
    private View j;
    private int k;
    private long l;
    private int m;
    private int n;
    private float o;
    private boolean p;
    private int q;
    private boolean r;
    private int t;
    private boolean u;
    private com.facebook.ads.internal.view.e.a.a v;
    private final MediaController.MediaPlayerControl w;

    public b(Context context) {
        super(context);
        this.f = d.IDLE;
        this.g = d.IDLE;
        this.h = d.IDLE;
        this.i = false;
        this.k = 0;
        this.m = 0;
        this.n = 0;
        this.o = 1.0f;
        this.p = false;
        this.q = 3;
        this.r = false;
        this.t = 0;
        this.u = false;
        this.v = com.facebook.ads.internal.view.e.a.a.NOT_STARTED;
        this.w = new MediaController.MediaPlayerControl() { // from class: com.facebook.ads.internal.view.e.d.b.1
            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canPause() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canSeekBackward() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canSeekForward() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getAudioSessionId() {
                if (b.this.d != null) {
                    return b.this.d.getAudioSessionId();
                }
                return 0;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getBufferPercentage() {
                return 0;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getCurrentPosition() {
                return b.this.getCurrentPosition();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getDuration() {
                return b.this.getDuration();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean isPlaying() {
                return b.this.d != null && b.this.d.isPlaying();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void pause() {
                b.this.a(true);
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void seekTo(int i) {
                b.this.a(i);
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void start() {
                b.this.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
            }
        };
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = d.IDLE;
        this.g = d.IDLE;
        this.h = d.IDLE;
        this.i = false;
        this.k = 0;
        this.m = 0;
        this.n = 0;
        this.o = 1.0f;
        this.p = false;
        this.q = 3;
        this.r = false;
        this.t = 0;
        this.u = false;
        this.v = com.facebook.ads.internal.view.e.a.a.NOT_STARTED;
        this.w = new MediaController.MediaPlayerControl() { // from class: com.facebook.ads.internal.view.e.d.b.1
            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canPause() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canSeekBackward() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canSeekForward() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getAudioSessionId() {
                if (b.this.d != null) {
                    return b.this.d.getAudioSessionId();
                }
                return 0;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getBufferPercentage() {
                return 0;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getCurrentPosition() {
                return b.this.getCurrentPosition();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getDuration() {
                return b.this.getDuration();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean isPlaying() {
                return b.this.d != null && b.this.d.isPlaying();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void pause() {
                b.this.a(true);
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void seekTo(int i) {
                b.this.a(i);
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void start() {
                b.this.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
            }
        };
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = d.IDLE;
        this.g = d.IDLE;
        this.h = d.IDLE;
        this.i = false;
        this.k = 0;
        this.m = 0;
        this.n = 0;
        this.o = 1.0f;
        this.p = false;
        this.q = 3;
        this.r = false;
        this.t = 0;
        this.u = false;
        this.v = com.facebook.ads.internal.view.e.a.a.NOT_STARTED;
        this.w = new MediaController.MediaPlayerControl() { // from class: com.facebook.ads.internal.view.e.d.b.1
            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canPause() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canSeekBackward() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canSeekForward() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getAudioSessionId() {
                if (b.this.d != null) {
                    return b.this.d.getAudioSessionId();
                }
                return 0;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getBufferPercentage() {
                return 0;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getCurrentPosition() {
                return b.this.getCurrentPosition();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getDuration() {
                return b.this.getDuration();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean isPlaying() {
                return b.this.d != null && b.this.d.isPlaying();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void pause() {
                b.this.a(true);
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void seekTo(int i2) {
                b.this.a(i2);
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void start() {
                b.this.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
            }
        };
    }

    public b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f = d.IDLE;
        this.g = d.IDLE;
        this.h = d.IDLE;
        this.i = false;
        this.k = 0;
        this.m = 0;
        this.n = 0;
        this.o = 1.0f;
        this.p = false;
        this.q = 3;
        this.r = false;
        this.t = 0;
        this.u = false;
        this.v = com.facebook.ads.internal.view.e.a.a.NOT_STARTED;
        this.w = new MediaController.MediaPlayerControl() { // from class: com.facebook.ads.internal.view.e.d.b.1
            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canPause() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canSeekBackward() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean canSeekForward() {
                return true;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getAudioSessionId() {
                if (b.this.d != null) {
                    return b.this.d.getAudioSessionId();
                }
                return 0;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getBufferPercentage() {
                return 0;
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getCurrentPosition() {
                return b.this.getCurrentPosition();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public int getDuration() {
                return b.this.getDuration();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public boolean isPlaying() {
                return b.this.d != null && b.this.d.isPlaying();
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void pause() {
                b.this.a(true);
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void seekTo(int i22) {
                b.this.a(i22);
            }

            @Override // android.widget.MediaController.MediaPlayerControl
            public void start() {
                b.this.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
            }
        };
    }

    private boolean a(Surface surface) {
        if (this.d == null) {
            return false;
        }
        try {
            this.d.setSurface(surface);
            return true;
        } catch (IllegalStateException e) {
            com.facebook.ads.internal.q.d.a.a(e, getContext());
            Log.d(s, "The MediaPlayer failed", e);
            return false;
        }
    }

    private boolean f() {
        return this.f == d.PREPARED || this.f == d.STARTED || this.f == d.PAUSED || this.f == d.PLAYBACK_COMPLETED;
    }

    private boolean g() {
        if (this.d == null) {
            return false;
        }
        try {
            this.d.reset();
            return true;
        } catch (IllegalStateException e) {
            com.facebook.ads.internal.q.d.a.a(e, getContext());
            Log.d(s, "The MediaPlayer failed", e);
            return false;
        }
    }

    private boolean h() {
        return (this.f == d.PREPARING || this.f == d.PREPARED) ? false : true;
    }

    private boolean i() {
        return (this.f == d.PREPARING || this.f == d.PREPARED) ? false : true;
    }

    private void setVideoState(d dVar) {
        if (dVar != this.f) {
            this.f = dVar;
            if (this.b != null) {
                this.b.a(dVar);
            }
        }
    }

    public void a() {
        if (this.r) {
            return;
        }
        a(false);
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void a(int i) {
        if (this.d == null || !f()) {
            this.k = i;
        } else if (i >= getDuration() || i <= 0) {
        } else {
            this.t = getCurrentPosition();
            this.k = i;
            this.d.seekTo(i);
        }
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void a(com.facebook.ads.internal.view.e.a.a aVar) {
        this.g = d.STARTED;
        this.v = aVar;
        if (this.f == d.STARTED || this.f == d.PREPARED || this.f == d.IDLE || this.f == d.PAUSED || this.f == d.PLAYBACK_COMPLETED) {
            if (this.d == null) {
                setup(this.a);
            } else {
                if (this.k > 0) {
                    this.d.seekTo(this.k);
                }
                this.d.start();
                setVideoState(d.STARTED);
            }
        }
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void a(boolean z) {
        this.g = d.PAUSED;
        if (this.d == null) {
            setVideoState(d.IDLE);
        } else if (i()) {
            if (z) {
                this.h = d.PAUSED;
                this.i = true;
            }
            this.d.pause();
            if (this.f != d.PLAYBACK_COMPLETED) {
                setVideoState(d.PAUSED);
            }
        }
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void b() {
        setVideoState(d.PLAYBACK_COMPLETED);
        c();
        this.k = 0;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void b(boolean z) {
        if (this.e != null) {
            this.e.setVisibility(8);
        }
        this.u = true;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void c() {
        this.g = d.IDLE;
        if (this.d != null) {
            int currentPosition = this.d.getCurrentPosition();
            if (currentPosition > 0) {
                this.k = currentPosition;
            }
            this.d.stop();
            g();
            this.d.release();
            this.d = null;
            if (this.e != null) {
                this.e.hide();
                this.e.setEnabled(false);
            }
        }
        setVideoState(d.IDLE);
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public boolean d() {
        if (this.d == null || Build.VERSION.SDK_INT < 16) {
            return false;
        }
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.d.getTrackInfo()) {
                if (trackInfo.getTrackType() == 2) {
                    return true;
                }
            }
            return false;
        } catch (IllegalStateException e) {
            Log.e(s, "Couldn't retrieve video information", e);
            return true;
        }
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void e() {
        if (this.d != null) {
            a((Surface) null);
            this.d.setOnBufferingUpdateListener(null);
            this.d.setOnCompletionListener(null);
            this.d.setOnErrorListener(null);
            this.d.setOnInfoListener(null);
            this.d.setOnPreparedListener(null);
            this.d.setOnVideoSizeChangedListener(null);
            this.d.setOnSeekCompleteListener(null);
            g();
            this.d = null;
        }
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public int getCurrentPosition() {
        if (this.d != null) {
            return this.d.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public int getDuration() {
        if (this.d == null) {
            return 0;
        }
        if (getState() == d.STARTED || getState() == d.PAUSED || getState() == d.PREPARED || getState() == d.PLAYBACK_COMPLETED) {
            return this.d.getDuration();
        }
        return 0;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public long getInitialBufferTime() {
        return this.l;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public com.facebook.ads.internal.view.e.a.a getStartReason() {
        return this.v;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public d getState() {
        return this.f;
    }

    public d getTargetState() {
        return this.g;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public int getVideoHeight() {
        return this.n;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public int getVideoWidth() {
        return this.m;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public float getVolume() {
        return this.o;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.d != null) {
            this.d.pause();
        }
        setVideoState(d.PLAYBACK_COMPLETED);
        a(0);
        this.k = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.q <= 0 || getState() != d.STARTED) {
            setVideoState(d.ERROR);
            c();
            return true;
        }
        this.q--;
        c();
        a(this.v);
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        switch (i) {
            case 701:
                setVideoState(d.BUFFERING);
                return false;
            case 702:
                if (h()) {
                    setVideoState(d.STARTED);
                    return false;
                }
                return false;
            default:
                return false;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.m, i);
        int defaultSize2 = getDefaultSize(this.n, i2);
        if (this.m > 0 && this.n > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            defaultSize2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.m * defaultSize2 < this.n * size) {
                    defaultSize = (this.m * defaultSize2) / this.n;
                } else if (this.m * defaultSize2 > this.n * size) {
                    defaultSize2 = (this.n * size) / this.m;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode == 1073741824) {
                int i3 = (this.n * size) / this.m;
                if (mode2 != Integer.MIN_VALUE || i3 <= defaultSize2) {
                    defaultSize2 = i3;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode2 == 1073741824) {
                defaultSize = (this.m * defaultSize2) / this.n;
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                int i4 = this.m;
                int i5 = this.n;
                if (mode2 != Integer.MIN_VALUE || i5 <= defaultSize2) {
                    defaultSize2 = i5;
                    defaultSize = i4;
                } else {
                    defaultSize = (this.m * defaultSize2) / this.n;
                }
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize2 = (this.n * size) / this.m;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        setVideoState(d.PREPARED);
        if (this.p && !this.u) {
            this.e = new MediaController(getContext());
            this.e.setAnchorView(this.j == null ? this : this.j);
            this.e.setMediaPlayer(this.w);
            this.e.setEnabled(true);
        }
        setRequestedVolume(this.o);
        this.m = mediaPlayer.getVideoWidth();
        this.n = mediaPlayer.getVideoHeight();
        if (this.k > 0) {
            if (this.k >= this.d.getDuration()) {
                this.k = 0;
            }
            this.d.seekTo(this.k);
            this.k = 0;
        }
        if (this.g == d.STARTED) {
            a(this.v);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.b == null) {
            return;
        }
        this.b.a(this.t, this.k);
        this.k = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.c == null) {
            this.c = new Surface(surfaceTexture);
        }
        if (!a(this.c)) {
            setVideoState(d.ERROR);
            e();
            return;
        }
        this.i = false;
        if (this.f != d.PAUSED || this.h == d.PAUSED) {
            return;
        }
        a(this.v);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        a((Surface) null);
        if (this.c != null) {
            this.c.release();
            this.c = null;
        }
        if (!this.i) {
            this.h = this.p ? d.STARTED : this.f;
            this.i = true;
        }
        if (this.f != d.PAUSED) {
            a(false);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.m = mediaPlayer.getVideoWidth();
        this.n = mediaPlayer.getVideoHeight();
        if (this.m == 0 || this.n == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.d == null) {
            return;
        }
        if (this.e == null || !this.e.isShowing()) {
            if (z) {
                this.i = false;
                if (this.f != d.PAUSED || this.h == d.PAUSED) {
                    return;
                }
                a(this.v);
                return;
            }
            if (!this.i) {
                this.h = this.p ? d.STARTED : this.f;
                this.i = true;
            }
            if (this.f != d.PAUSED) {
                a();
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else if (AdInternalSettings.isDebugBuild()) {
            Log.w(s, "Google always throw an exception with setBackgroundDrawable on Nougat above. so we silently ignore it.");
        }
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.r = z;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setControlsAnchorView(View view) {
        this.j = view;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.d.b.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                if (!b.this.u && b.this.e != null && motionEvent.getAction() == 1) {
                    if (b.this.e.isShowing()) {
                        b.this.e.hide();
                    } else {
                        b.this.e.show();
                    }
                }
                return true;
            }
        });
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else if (AdInternalSettings.isDebugBuild()) {
            Log.w(s, "Google always throw an exception with setForeground on Nougat above. so we silently ignore it.");
        }
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setFullScreen(boolean z) {
        this.p = z;
        if (!this.p || this.u) {
            return;
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.d.b.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!b.this.u && b.this.e != null && motionEvent.getAction() == 1) {
                    if (b.this.e.isShowing()) {
                        b.this.e.hide();
                    } else {
                        b.this.e.show();
                    }
                }
                return true;
            }
        });
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setRequestedVolume(float f) {
        this.o = f;
        if (this.d == null || this.f == d.PREPARING || this.f == d.IDLE) {
            return;
        }
        this.d.setVolume(f, f);
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setVideoMPD(String str) {
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setVideoStateChangeListener(e eVar) {
        this.b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.internal.view.e.d.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setup(android.net.Uri r9) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.e.d.b.setup(android.net.Uri):void");
    }
}
