package com.kwad.sdk.core.video.videoview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.video.a.c;
import com.kwad.sdk.core.video.a.e;
import com.kwad.sdk.core.video.a.f;
import com.kwad.sdk.core.view.AdBasePvFrameLayout;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.g;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.y;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
@Deprecated
/* loaded from: classes.dex */
public final class a extends AdBasePvFrameLayout implements TextureView.SurfaceTextureListener, c {
    private static AtomicBoolean awi = new AtomicBoolean(false);
    private int RW;
    private com.kwad.sdk.core.video.a.c RX;
    private int RY;
    private long RZ;
    private com.kwad.sdk.contentalliance.a.a.b Sb;
    private c.e Si;
    private c.h Sj;
    private c.b Sk;
    private c.InterfaceC0260c Sl;
    private c.d Sm;
    private c.a Sn;
    private SurfaceTexture Su;
    private Surface Sv;
    private AudioManager awe;
    private com.kwad.sdk.core.video.a awf;
    private b awg;
    private boolean awh;
    private boolean awj;
    private boolean awk;
    private ImageView awl;
    private com.kwad.sdk.contentalliance.a.a.a cT;
    private FrameLayout hm;
    private Context mContext;
    private Map<String, String> mHeaders;
    private String mUrl;

    public a(Context context) {
        this(context, null);
    }

    private a(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.RW = 0;
        this.awh = false;
        this.awj = false;
        this.awk = false;
        this.Si = new c.e() { // from class: com.kwad.sdk.core.video.videoview.a.1
            @Override // com.kwad.sdk.core.video.a.c.e
            public final void a(com.kwad.sdk.core.video.a.c cVar) {
                a.this.RW = 2;
                a.this.awg.onPlayStateChanged(a.this.RW);
                com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", "onPrepared ——> STATE_PREPARED");
                cVar.start();
                if (a.this.awh) {
                    cVar.seekTo((int) y.Q(a.this.mContext, a.this.mUrl));
                }
                if (a.this.RZ != 0) {
                    cVar.seekTo((int) a.this.RZ);
                }
            }
        };
        this.Sj = new c.h() { // from class: com.kwad.sdk.core.video.videoview.a.2
            @Override // com.kwad.sdk.core.video.a.c.h
            public final void i(int i, int i2) {
                if (!a.this.awk || i2 <= i) {
                    a.this.awf.adaptVideoSize(i, i2);
                    com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", "onVideoSizeChanged ——> width：" + i + "， height：" + i2);
                }
            }
        };
        this.Sk = new c.b() { // from class: com.kwad.sdk.core.video.videoview.a.3
            @Override // com.kwad.sdk.core.video.a.c.b
            public final void ow() {
                if (a.this.RW != 9) {
                    a.this.RW = 9;
                    a.this.awg.onPlayStateChanged(a.this.RW);
                    com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", "onCompletion ——> STATE_COMPLETED");
                    a.this.hm.setKeepScreenOn(false);
                }
            }
        };
        this.Sl = new c.InterfaceC0260c() { // from class: com.kwad.sdk.core.video.videoview.a.4
            @Override // com.kwad.sdk.core.video.a.c.InterfaceC0260c
            public final boolean j(int i, int i2) {
                if (i != -38) {
                    a.this.RW = -1;
                    a.this.awg.m(i, i2);
                    a.this.awg.onPlayStateChanged(a.this.RW);
                    com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", "onError ——> STATE_ERROR ———— what：" + i + ", extra: " + i2);
                    return true;
                }
                return true;
            }
        };
        this.Sm = new c.d() { // from class: com.kwad.sdk.core.video.videoview.a.5
            @Override // com.kwad.sdk.core.video.a.c.d
            public final boolean k(int i, int i2) {
                String str;
                String str2;
                if (i == 3) {
                    a.this.RW = 4;
                    a.this.awg.onPlayStateChanged(a.this.RW);
                    str = "onInfo ——> MEDIA_INFO_VIDEO_RENDERING_START：STATE_PLAYING";
                } else if (i == 701) {
                    if (a.this.RW == 5 || a.this.RW == 7) {
                        a.this.RW = 7;
                        str2 = "onInfo ——> MEDIA_INFO_BUFFERING_START：STATE_BUFFERING_PAUSED";
                    } else {
                        a.this.RW = 6;
                        str2 = "onInfo ——> MEDIA_INFO_BUFFERING_START：STATE_BUFFERING_PLAYING";
                    }
                    com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", str2);
                    a.this.awg.onPlayStateChanged(a.this.RW);
                    return true;
                } else if (i == 702) {
                    if (a.this.RW == 6) {
                        a.this.RW = 4;
                        a.this.awg.onPlayStateChanged(a.this.RW);
                        com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", "onInfo ——> MEDIA_INFO_BUFFERING_END： STATE_PLAYING");
                    }
                    if (a.this.RW != 7) {
                        return true;
                    }
                    a.this.RW = 5;
                    a.this.awg.onPlayStateChanged(a.this.RW);
                    str = "onInfo ——> MEDIA_INFO_BUFFERING_END： STATE_PAUSED";
                } else if (i == 10001) {
                    if (a.this.awf == null) {
                        return true;
                    }
                    a.this.awf.setRotation(i2);
                    str = "视频旋转角度：" + i2;
                } else if (i == 801) {
                    str = "视频不能seekTo，为直播视频";
                } else {
                    str = "onInfo ——> what：" + i;
                }
                com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", str);
                return true;
            }
        };
        this.Sn = new c.a() { // from class: com.kwad.sdk.core.video.videoview.a.6
            @Override // com.kwad.sdk.core.video.a.c.a
            public final void aw(int i) {
                a.this.RY = i;
            }
        };
        this.mContext = context;
        init();
    }

    private ImageView Dt() {
        ImageView imageView = new ImageView(this.mContext);
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return imageView;
    }

    private boolean Du() {
        return this.RW == 6;
    }

    private void Dw() {
        if (this.RX == null) {
            f fVar = (f) ServiceProvider.get(f.class);
            boolean z = true;
            boolean z2 = fVar != null && fVar.xr();
            if (fVar == null || !fVar.xs()) {
                z = false;
            }
            com.kwad.sdk.core.video.a.c a = e.a(this.mContext, false, z2, z);
            this.RX = a;
            a.setAudioStreamType(3);
            if (this.awj) {
                return;
            }
            this.RX.setVolume(0.0f, 0.0f);
        }
    }

    private void Dx() {
        this.hm.removeView(this.awf);
        this.hm.addView(this.awf, 0, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    private void Dy() {
        com.kwad.sdk.contentalliance.a.a.a aVar;
        this.hm.setKeepScreenOn(true);
        this.RX.b(this.Si);
        this.RX.a(this.Sj);
        this.RX.a(this.Sk);
        this.RX.a(this.Sl);
        this.RX.c(this.Sm);
        this.RX.a(this.Sn);
        try {
            com.kwad.sdk.contentalliance.a.a.b bVar = this.Sb;
            if (bVar != null && (aVar = this.cT) != null) {
                bVar.akf = aVar;
            }
            this.RX.a(this.Sb);
            if (this.Sv == null) {
                this.Sv = new Surface(this.Su);
            }
            this.RX.setSurface(this.Sv);
            if (this.RX.prepareAsync()) {
                this.RW = 1;
                this.awg.onPlayStateChanged(1);
                com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", "STATE_PREPARING");
            }
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            com.kwad.sdk.core.e.c.e("KSVideoPlayerViewView", "打开播放器发生错误", e);
        }
    }

    private void Dz() {
        AudioManager audioManager = this.awe;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(null);
            this.awe = null;
        }
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            cVar.release();
            this.RX = null;
        }
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.sdk.core.video.videoview.a.7
            @Override // java.lang.Runnable
            public final void run() {
                a.this.hm.removeView(a.this.awf);
            }
        });
        Surface surface = this.Sv;
        if (surface != null) {
            surface.release();
            this.Sv = null;
        }
        SurfaceTexture surfaceTexture = this.Su;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.Su = null;
        }
        this.RW = 0;
    }

    private void cB(AdTemplate adTemplate) {
        g gVar = (g) ServiceProvider.get(g.class);
        if (gVar != null) {
            gVar.load(this.awl, d.co(adTemplate), adTemplate);
        }
    }

    private void init() {
        this.awl = Dt();
        this.hm = new FrameLayout(this.mContext);
        addView(this.hm, new FrameLayout.LayoutParams(-1, -1));
    }

    private void qL() {
        if (this.awf == null) {
            com.kwad.sdk.core.video.a aVar = new com.kwad.sdk.core.video.a(this.mContext);
            this.awf = aVar;
            aVar.setSurfaceTextureListener(this);
        }
    }

    private void setPlayType(int i) {
        com.kwad.sdk.contentalliance.a.a.b bVar = this.Sb;
        if (bVar == null || bVar.videoPlayerStatus == null) {
            return;
        }
        this.Sb.videoPlayerStatus.mVideoPlayerType = i;
    }

    @Override // com.kwad.sdk.core.video.videoview.c
    public final boolean Dv() {
        return this.RW == 7;
    }

    public final void a(com.kwad.sdk.contentalliance.a.a.b bVar, Map<String, String> map) {
        this.Sb = bVar;
        this.mUrl = bVar.videoUrl;
        this.mHeaders = null;
        cB(bVar.adTemplate);
    }

    @Override // com.kwad.sdk.core.video.videoview.c
    public final int getBufferPercentage() {
        return this.RY;
    }

    public final b getController() {
        return this.awg;
    }

    @Override // com.kwad.sdk.core.video.videoview.c
    public final long getCurrentPosition() {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            return cVar.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.kwad.sdk.core.video.videoview.c
    public final long getDuration() {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            return cVar.getDuration();
        }
        return 0L;
    }

    public final int getMaxVolume() {
        AudioManager audioManager = this.awe;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 0;
    }

    public final b getVideoController() {
        return this.awg;
    }

    public final int getVolume() {
        AudioManager audioManager = this.awe;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 0;
    }

    public final boolean isCompleted() {
        return this.RW == 9;
    }

    @Override // com.kwad.sdk.core.video.videoview.c
    public final boolean isIdle() {
        return this.RW == 0;
    }

    @Override // com.kwad.sdk.core.video.videoview.c
    public final boolean isPaused() {
        return this.RW == 5;
    }

    public final boolean isPlaying() {
        return this.RW == 4;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceTexture surfaceTexture2 = this.Su;
        if (surfaceTexture2 != null) {
            this.awf.setSurfaceTexture(surfaceTexture2);
            return;
        }
        this.Su = surfaceTexture;
        Dy();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.kwad.sdk.core.video.videoview.c
    public final void pause() {
        String str;
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar == null) {
            return;
        }
        int i = this.RW;
        if (i == 4) {
            cVar.pause();
            this.RW = 5;
            this.awg.onPlayStateChanged(5);
            str = "STATE_PAUSED";
        } else if (i != 6) {
            return;
        } else {
            cVar.pause();
            this.RW = 7;
            this.awg.onPlayStateChanged(7);
            str = "STATE_BUFFERING_PAUSED";
        }
        com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", str);
    }

    @Override // com.kwad.sdk.core.video.videoview.c
    public final void release() {
        Context context;
        String str;
        long currentPosition;
        if (this.awh) {
            if (isPlaying() || Du() || Dv() || isPaused()) {
                context = this.mContext;
                str = this.mUrl;
                currentPosition = getCurrentPosition();
            } else if (isCompleted()) {
                context = this.mContext;
                str = this.mUrl;
                currentPosition = 0;
            }
            y.e(context, str, currentPosition);
        }
        Dz();
        b bVar = this.awg;
        if (bVar != null) {
            bVar.reset();
        }
    }

    @Override // com.kwad.sdk.core.video.videoview.c
    public final void restart() {
        int i = this.RW;
        if (i == 5) {
            this.RX.start();
            this.RW = 4;
            this.awg.onPlayStateChanged(4);
            setPlayType(2);
            com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", "STATE_PLAYING");
        } else if (i == 7) {
            this.RX.start();
            this.RW = 6;
            this.awg.onPlayStateChanged(6);
            com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", "STATE_BUFFERING_PLAYING");
        } else if (i == 9 || i == -1) {
            this.RX.reset();
            Dy();
            setPlayType(3);
        } else {
            com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", "KSVideoPlayer在状态为 " + this.RW + " 时不能调用restart()方法.");
        }
    }

    public final void seekTo(int i) {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            cVar.seekTo(i);
        }
    }

    public final void setController(b bVar) {
        this.hm.removeView(this.awg);
        this.awg = bVar;
        bVar.reset();
        this.hm.addView(this.awg, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.kwad.sdk.core.video.videoview.c
    public final void setKsPlayLogParam(com.kwad.sdk.contentalliance.a.a.a aVar) {
        this.cT = aVar;
    }

    public final void setLooping(boolean z) {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            cVar.setLooping(z);
        }
    }

    public final void setPortraitFullscreen(boolean z) {
        this.awk = z;
    }

    public final void setVideoSoundEnable(boolean z) {
        this.awj = z;
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            if (z) {
                cVar.setVolume(1.0f, 1.0f);
            } else {
                cVar.setVolume(0.0f, 0.0f);
            }
        }
    }

    public final void setVolume(int i) {
        AudioManager audioManager = this.awe;
        if (audioManager != null) {
            audioManager.setStreamVolume(3, i, 0);
        }
    }

    @Override // com.kwad.sdk.core.video.videoview.c
    public final void start() {
        if (this.RW != 0) {
            com.kwad.sdk.core.e.c.i("KSVideoPlayerViewView", "KSVideoPlayer只有在状态为STATE_IDLE时才能调用start方法.");
            return;
        }
        Dw();
        qL();
        Dx();
        com.kwad.sdk.contentalliance.a.a.b bVar = this.Sb;
        if (bVar == null || bVar.videoPlayerStatus == null) {
            return;
        }
        setPlayType(this.Sb.videoPlayerStatus.mVideoPlayerType == 0 ? 1 : 3);
    }
}
