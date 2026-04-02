package com.facebook.ads.internal.view.e.d;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
/* loaded from: classes2.dex */
public class a extends TextureView implements TextureView.SurfaceTextureListener, c, ExoPlayer.EventListener, SimpleExoPlayer.VideoListener {
    private static final String a = a.class.getSimpleName();
    private Uri b;
    private String c;
    private e d;
    private Surface e;
    private SimpleExoPlayer f;
    private MediaController g;
    private d h;
    private d i;
    private d j;
    private boolean k;
    private View l;
    private boolean m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private int r;
    private int s;
    private float t;
    private int u;
    private boolean v;
    private boolean w;
    private com.facebook.ads.internal.view.e.a.a x;
    private boolean y;

    public a(Context context) {
        super(context);
        this.h = d.IDLE;
        this.i = d.IDLE;
        this.j = d.IDLE;
        this.k = false;
        this.m = false;
        this.n = false;
        this.t = 1.0f;
        this.u = -1;
        this.v = false;
        this.w = false;
        this.x = com.facebook.ads.internal.view.e.a.a.NOT_STARTED;
        this.y = false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = d.IDLE;
        this.i = d.IDLE;
        this.j = d.IDLE;
        this.k = false;
        this.m = false;
        this.n = false;
        this.t = 1.0f;
        this.u = -1;
        this.v = false;
        this.w = false;
        this.x = com.facebook.ads.internal.view.e.a.a.NOT_STARTED;
        this.y = false;
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = d.IDLE;
        this.i = d.IDLE;
        this.j = d.IDLE;
        this.k = false;
        this.m = false;
        this.n = false;
        this.t = 1.0f;
        this.u = -1;
        this.v = false;
        this.w = false;
        this.x = com.facebook.ads.internal.view.e.a.a.NOT_STARTED;
        this.y = false;
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.h = d.IDLE;
        this.i = d.IDLE;
        this.j = d.IDLE;
        this.k = false;
        this.m = false;
        this.n = false;
        this.t = 1.0f;
        this.u = -1;
        this.v = false;
        this.w = false;
        this.x = com.facebook.ads.internal.view.e.a.a.NOT_STARTED;
        this.y = false;
    }

    private void f() {
        DefaultBandwidthMeter defaultBandwidthMeter = new DefaultBandwidthMeter();
        this.f = ExoPlayerFactory.newSimpleInstance(getContext(), new DefaultTrackSelector(new AdaptiveTrackSelection.Factory(defaultBandwidthMeter)), new DefaultLoadControl());
        this.f.setVideoListener(this);
        this.f.addListener(this);
        this.f.setPlayWhenReady(false);
        if (this.n && !this.v) {
            this.g = new MediaController(getContext());
            this.g.setAnchorView(this.l == null ? this : this.l);
            this.g.setMediaPlayer(new MediaController.MediaPlayerControl() { // from class: com.facebook.ads.internal.view.e.d.a.1
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
                    if (a.this.f != null) {
                        return a.this.f.getAudioSessionId();
                    }
                    return 0;
                }

                @Override // android.widget.MediaController.MediaPlayerControl
                public int getBufferPercentage() {
                    if (a.this.f != null) {
                        return a.this.f.getBufferedPercentage();
                    }
                    return 0;
                }

                @Override // android.widget.MediaController.MediaPlayerControl
                public int getCurrentPosition() {
                    return a.this.getCurrentPosition();
                }

                @Override // android.widget.MediaController.MediaPlayerControl
                public int getDuration() {
                    return a.this.getDuration();
                }

                @Override // android.widget.MediaController.MediaPlayerControl
                public boolean isPlaying() {
                    return a.this.f != null && a.this.f.getPlayWhenReady();
                }

                @Override // android.widget.MediaController.MediaPlayerControl
                public void pause() {
                    a.this.a(true);
                }

                @Override // android.widget.MediaController.MediaPlayerControl
                public void seekTo(int i) {
                    a.this.a(i);
                }

                @Override // android.widget.MediaController.MediaPlayerControl
                public void start() {
                    a.this.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
                }
            });
            this.g.setEnabled(true);
        }
        if (this.c == null || this.c.length() == 0 || this.y) {
            this.f.prepare(new ExtractorMediaSource(this.b, new DefaultDataSourceFactory(getContext(), Util.getUserAgent(getContext(), "ads"), defaultBandwidthMeter), new DefaultExtractorsFactory(), (Handler) null, (ExtractorMediaSource.EventListener) null));
        }
        setVideoState(d.PREPARING);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    private void g() {
        if (this.e != null) {
            this.e.release();
            this.e = null;
        }
        if (this.f != null) {
            this.f.release();
            this.f = null;
        }
        this.g = null;
        this.m = false;
        setVideoState(d.IDLE);
    }

    private void setVideoState(d dVar) {
        if (dVar != this.h) {
            this.h = dVar;
            if (this.h == d.STARTED) {
                this.m = true;
            }
            if (this.d != null) {
                this.d.a(dVar);
            }
        }
    }

    public void a() {
        if (this.w) {
            return;
        }
        a(false);
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void a(int i) {
        if (this.f == null) {
            this.q = i;
            return;
        }
        this.u = getCurrentPosition();
        this.f.seekTo(i);
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void a(com.facebook.ads.internal.view.e.a.a aVar) {
        this.i = d.STARTED;
        this.x = aVar;
        if (this.f == null) {
            setup(this.b);
        } else if (this.h == d.PREPARED || this.h == d.PAUSED || this.h == d.PLAYBACK_COMPLETED) {
            this.f.setPlayWhenReady(true);
            setVideoState(d.STARTED);
        }
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void a(boolean z) {
        if (this.f != null) {
            this.f.setPlayWhenReady(false);
        } else {
            setVideoState(d.IDLE);
        }
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void b() {
        setVideoState(d.PLAYBACK_COMPLETED);
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void b(boolean z) {
        this.v = z;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void c() {
        this.i = d.IDLE;
        if (this.f != null) {
            this.f.stop();
            this.f.release();
            this.f = null;
        }
        setVideoState(d.IDLE);
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public boolean d() {
        return (this.f == null || this.f.getAudioFormat() == null) ? false : true;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void e() {
        g();
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public int getCurrentPosition() {
        if (this.f != null) {
            return (int) this.f.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public int getDuration() {
        if (this.f == null) {
            return 0;
        }
        return (int) this.f.getDuration();
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public long getInitialBufferTime() {
        return this.p;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public com.facebook.ads.internal.view.e.a.a getStartReason() {
        return this.x;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public d getState() {
        return this.h;
    }

    public d getTargetState() {
        return this.i;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public int getVideoHeight() {
        return this.s;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public int getVideoWidth() {
        return this.r;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public float getVolume() {
        return this.t;
    }

    public void onLoadingChanged(boolean z) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.r, i);
        int defaultSize2 = getDefaultSize(this.s, i2);
        if (this.r > 0 && this.s > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            defaultSize2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.r * defaultSize2 < this.s * size) {
                    defaultSize = (this.r * defaultSize2) / this.s;
                } else if (this.r * defaultSize2 > this.s * size) {
                    defaultSize2 = (this.s * size) / this.r;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode == 1073741824) {
                int i3 = (this.s * size) / this.r;
                if (mode2 != Integer.MIN_VALUE || i3 <= defaultSize2) {
                    defaultSize2 = i3;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode2 == 1073741824) {
                defaultSize = (this.r * defaultSize2) / this.s;
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                int i4 = this.r;
                int i5 = this.s;
                if (mode2 != Integer.MIN_VALUE || i5 <= defaultSize2) {
                    defaultSize2 = i5;
                    defaultSize = i4;
                } else {
                    defaultSize = (this.r * defaultSize2) / this.s;
                }
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize2 = (this.s * size) / this.r;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        setVideoState(d.ERROR);
        exoPlaybackException.printStackTrace();
        com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(exoPlaybackException, "[ExoPlayer] Error during playback of ExoPlayer"));
    }

    public void onPlayerStateChanged(boolean z, int i) {
        switch (i) {
            case 1:
                setVideoState(d.IDLE);
                return;
            case 2:
                if (this.u >= 0) {
                    int i2 = this.u;
                    this.u = -1;
                    this.d.a(i2, getCurrentPosition());
                    return;
                }
                return;
            case 3:
                if (this.o != 0) {
                    this.p = System.currentTimeMillis() - this.o;
                }
                setRequestedVolume(this.t);
                if (this.q > 0 && this.q < this.f.getDuration()) {
                    this.f.seekTo(this.q);
                    this.q = 0L;
                }
                if (this.f.getCurrentPosition() != 0 && !z && this.m) {
                    setVideoState(d.PAUSED);
                    return;
                } else if (z || this.h == d.PLAYBACK_COMPLETED) {
                    return;
                } else {
                    setVideoState(d.PREPARED);
                    if (this.i == d.STARTED) {
                        a(this.x);
                        this.i = d.IDLE;
                        return;
                    }
                    return;
                }
            case 4:
                if (z) {
                    setVideoState(d.PLAYBACK_COMPLETED);
                }
                if (this.f != null) {
                    this.f.setPlayWhenReady(false);
                    if (!z) {
                        this.f.seekToDefaultPosition();
                    }
                }
                this.m = false;
                return;
            default:
                return;
        }
    }

    public void onPositionDiscontinuity() {
    }

    public void onRenderedFirstFrame() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.e != null) {
            this.e.release();
        }
        this.e = new Surface(surfaceTexture);
        if (this.f == null) {
            return;
        }
        this.f.setVideoSurface(this.e);
        this.k = false;
        if (this.h != d.PAUSED || this.j == d.PAUSED) {
            return;
        }
        a(this.x);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.e != null) {
            this.e.release();
            this.e = null;
            if (this.f != null) {
                this.f.setVideoSurface((Surface) null);
            }
        }
        if (!this.k) {
            this.j = this.n ? d.STARTED : this.h;
            this.k = true;
        }
        if (this.h != d.PAUSED) {
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

    public void onTimelineChanged(Timeline timeline, Object obj) {
    }

    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        this.r = i;
        this.s = i2;
        if (this.r == 0 || this.s == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f == null) {
            return;
        }
        if (this.g == null || !this.g.isShowing()) {
            if (z) {
                this.k = false;
                if (this.h != d.PAUSED || this.j == d.PAUSED) {
                    return;
                }
                a(this.x);
                return;
            }
            if (!this.k) {
                this.j = this.n ? d.STARTED : this.h;
                this.k = true;
            }
            if (this.h != d.PAUSED) {
                a();
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else if (AdInternalSettings.isDebugBuild()) {
            Log.w(a, "Google always throw an exception with setBackgroundDrawable on Nougat above. so we silently ignore it.");
        }
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.w = z;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setControlsAnchorView(View view) {
        this.l = view;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.d.a.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                if (a.this.g != null && motionEvent.getAction() == 1) {
                    if (a.this.g.isShowing()) {
                        a.this.g.hide();
                    } else {
                        a.this.g.show();
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
            Log.w(a, "Google always throw an exception with setForeground on Nougat above. so we silently ignore it.");
        }
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setFullScreen(boolean z) {
        this.n = z;
        if (!z || this.v) {
            return;
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.d.a.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (a.this.g != null && motionEvent.getAction() == 1) {
                    if (a.this.g.isShowing()) {
                        a.this.g.hide();
                    } else {
                        a.this.g.show();
                    }
                }
                return true;
            }
        });
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setRequestedVolume(float f) {
        this.t = f;
        if (this.f == null || this.h == d.PREPARING || this.h == d.IDLE) {
            return;
        }
        this.f.setVolume(f);
    }

    public void setTestMode(boolean z) {
        this.y = z;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setVideoMPD(String str) {
        this.c = str;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setVideoStateChangeListener(e eVar) {
        this.d = eVar;
    }

    @Override // com.facebook.ads.internal.view.e.d.c
    public void setup(Uri uri) {
        if (this.f != null) {
            g();
        }
        this.b = uri;
        setSurfaceTextureListener(this);
        f();
    }
}
