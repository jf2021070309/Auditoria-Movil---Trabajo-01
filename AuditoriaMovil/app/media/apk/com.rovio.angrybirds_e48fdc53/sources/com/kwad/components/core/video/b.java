package com.kwad.components.core.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.kwad.sdk.core.video.a.c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class b {
    private static boolean RU = false;
    private static final AtomicInteger RV = new AtomicInteger(0);
    private int RF;
    private int RG;
    private com.kwad.sdk.core.video.a.c RX;
    private int RY;
    private long RZ;
    private Runnable Sa;
    private com.kwad.sdk.contentalliance.a.a.b Sb;
    private Context mContext;
    private DetailVideoView mDetailVideoView;
    private String TAG = "MediaPlayerImpl";
    private volatile int RW = 0;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private long mStartTime = 0;
    private int Sc = 0;
    private List<c.d> Sd = new CopyOnWriteArrayList();
    private final AtomicBoolean Se = new AtomicBoolean(false);
    private boolean Sf = false;
    private volatile List<k> Sg = new CopyOnWriteArrayList();
    private volatile List<c.e> Sh = new CopyOnWriteArrayList();
    private c.e Si = new c.e() { // from class: com.kwad.components.core.video.b.1
        @Override // com.kwad.sdk.core.video.a.c.e
        public final void a(com.kwad.sdk.core.video.a.c cVar) {
            String str = b.this.TAG;
            com.kwad.sdk.core.e.c.i(str, "onPrepared:" + b.getStateString(b.this.RW) + "->STATE_PREPARED");
            b.this.RW = 2;
            b bVar = b.this;
            bVar.onPlayStateChanged(bVar.RW);
            for (c.e eVar : b.this.Sh) {
                eVar.a(b.this.RX);
            }
        }
    };
    private c.h Sj = new c.h() { // from class: com.kwad.components.core.video.b.3
        @Override // com.kwad.sdk.core.video.a.c.h
        public final void i(int i, int i2) {
            if (b.this.mDetailVideoView != null) {
                b.this.mDetailVideoView.adaptVideoSize(i, i2);
            }
            String str = b.this.TAG;
            com.kwad.sdk.core.e.c.i(str, "onVideoSizeChanged ——> width：" + i + "， height：" + i2);
        }
    };
    private c.b Sk = new c.b() { // from class: com.kwad.components.core.video.b.4
        @Override // com.kwad.sdk.core.video.a.c.b
        public final void ow() {
            b.this.RW = 9;
            b bVar = b.this;
            bVar.onPlayStateChanged(bVar.RW);
            com.kwad.sdk.core.video.a.a.a.dI("videoFinishPlay");
        }
    };
    private c.InterfaceC0260c Sl = new c.InterfaceC0260c() { // from class: com.kwad.components.core.video.b.5
        @Override // com.kwad.sdk.core.video.a.c.InterfaceC0260c
        public final boolean j(int i, int i2) {
            if (i != -38) {
                b.this.RW = -1;
                b.this.RF = i;
                b.this.RG = i2;
                b bVar = b.this;
                bVar.onPlayStateChanged(bVar.RW);
                com.kwad.sdk.core.video.a.a.a.dI("videoPlayError");
                String str = b.this.TAG;
                com.kwad.sdk.core.e.c.i(str, "onError ——> STATE_ERROR ———— what：" + i + ", extra: " + i2);
                return true;
            }
            return true;
        }
    };
    private c.d Sm = new c.d() { // from class: com.kwad.components.core.video.b.6
        @Override // com.kwad.sdk.core.video.a.c.d
        public final boolean k(int i, int i2) {
            String str;
            StringBuilder sb;
            String str2;
            String str3;
            String str4;
            if (i != 3) {
                if (i == 701) {
                    if (b.this.RW == 5 || b.this.RW == 7) {
                        b.this.RW = 7;
                        str3 = b.this.TAG;
                        str4 = "onInfo ——> MEDIA_INFO_BUFFERING_START：STATE_BUFFERING_PAUSED";
                    } else {
                        b.this.RW = 6;
                        str3 = b.this.TAG;
                        str4 = "onInfo ——> MEDIA_INFO_BUFFERING_START：STATE_BUFFERING_PLAYING";
                    }
                    com.kwad.sdk.core.e.c.i(str3, str4);
                    b bVar = b.this;
                    bVar.onPlayStateChanged(bVar.RW);
                } else if (i == 702) {
                    if (b.this.RW == 6) {
                        b.this.RW = 4;
                        b bVar2 = b.this;
                        bVar2.onPlayStateChanged(bVar2.RW);
                        com.kwad.sdk.core.e.c.i(b.this.TAG, "onInfo ——> MEDIA_INFO_BUFFERING_END： STATE_PLAYING");
                    }
                    if (b.this.RW == 7) {
                        b.this.RW = 5;
                        b bVar3 = b.this;
                        bVar3.onPlayStateChanged(bVar3.RW);
                        str = b.this.TAG;
                        str2 = "onInfo ——> MEDIA_INFO_BUFFERING_END： STATE_PAUSED";
                        com.kwad.sdk.core.e.c.i(str, str2);
                    }
                } else if (i != 10001) {
                    if (i == 801) {
                        str = b.this.TAG;
                        str2 = "视频不能seekTo，为直播视频";
                        com.kwad.sdk.core.e.c.i(str, str2);
                    } else {
                        str = b.this.TAG;
                        sb = new StringBuilder("onInfo ——> what：");
                        sb.append(i);
                    }
                }
                b bVar4 = b.this;
                bVar4.a(bVar4.RX, i, i2);
                return true;
            }
            b.this.RW = 4;
            b bVar5 = b.this;
            bVar5.onPlayStateChanged(bVar5.RW);
            str = b.this.TAG;
            sb = new StringBuilder("onInfo ——> MEDIA_INFO_VIDEO_RENDERING_START：STATE_PLAYING, TIME ELAPSED: ");
            sb.append(System.currentTimeMillis() - b.this.mStartTime);
            str2 = sb.toString();
            com.kwad.sdk.core.e.c.i(str, str2);
            b bVar42 = b.this;
            bVar42.a(bVar42.RX, i, i2);
            return true;
        }
    };
    private c.a Sn = new c.a() { // from class: com.kwad.components.core.video.b.7
        @Override // com.kwad.sdk.core.video.a.c.a
        public final void aw(int i) {
            b.this.RY = i;
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        void onReleaseSuccess();
    }

    public b(DetailVideoView detailVideoView) {
        this.mDetailVideoView = detailVideoView;
        if (detailVideoView != null) {
            this.mContext = detailVideoView.getContext().getApplicationContext();
        }
    }

    private void a(com.kwad.sdk.contentalliance.a.a.b bVar, boolean z, DetailVideoView detailVideoView, com.kwad.sdk.core.video.a.c cVar) {
        com.kwad.sdk.core.e.c.i(this.TAG, "initMediaPlayer");
        if (bVar == null || detailVideoView == null || cVar == null) {
            return;
        }
        if (this.mContext == null) {
            this.mContext = detailVideoView.getContext().getApplicationContext();
        }
        this.Sf = z;
        this.Sb = bVar;
        DetailVideoView detailVideoView2 = this.mDetailVideoView;
        if (detailVideoView2 != detailVideoView) {
            com.kwad.sdk.core.e.c.i(this.TAG, "initMediaPlayer videoView changed");
            if (detailVideoView2 != null) {
                detailVideoView2.setMediaPlayer(null);
                detailVideoView.setKeepScreenOn(detailVideoView2.getKeepScreenOn());
                detailVideoView2.setKeepScreenOn(false);
            }
            this.mDetailVideoView = detailVideoView;
        }
        detailVideoView.setMediaPlayer(this);
        if (this.RX != cVar) {
            com.kwad.sdk.core.e.c.i(this.TAG, "initMediaPlayer mediaPlayer changed");
            com.kwad.sdk.core.video.a.c cVar2 = this.RX;
            if (cVar2 != null) {
                cVar.setLooping(cVar2.isLooping());
                qH();
                this.RX.release();
            }
            this.RX = cVar;
            reset();
            qG();
            cVar.setAudioStreamType(3);
        } else {
            com.kwad.sdk.core.e.c.i(this.TAG, "initMediaPlayer mediaPlayer not changed");
            reset();
            qH();
            qG();
        }
        this.RX.setSurface(detailVideoView.Sv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(com.kwad.sdk.core.video.a.c cVar, a aVar) {
        if (cVar == null) {
            return;
        }
        try {
            cVar.release();
            if (aVar != null) {
                aVar.onReleaseSuccess();
            }
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    public static String getStateString(int i) {
        switch (i) {
            case -1:
                return "STATE_ERROR";
            case 0:
                return "STATE_IDLE";
            case 1:
                return "STATE_PREPARING";
            case 2:
                return "STATE_PREPARED";
            case 3:
                return "STATE_STARTED";
            case 4:
                return "STATE_PLAYING";
            case 5:
                return "STATE_PAUSED";
            case 6:
                return "STATE_BUFFERING_PLAYING";
            case 7:
                return "STATE_BUFFERING_PAUSED";
            case 8:
                return "PLAYER_STATE_STOPPED";
            case 9:
                return "STATE_COMPLETED";
            default:
                return "STATE_UNKNOWN";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qD() {
        long currentPosition = getCurrentPosition();
        long duration = getDuration();
        if (this.Sg != null) {
            for (k kVar : this.Sg) {
                kVar.onMediaPlayProgress(duration, currentPosition);
            }
        }
    }

    private void qG() {
        this.RX.b(this.Si);
        this.RX.a(this.Sj);
        this.RX.a(this.Sk);
        this.RX.a(this.Sl);
        this.RX.c(this.Sm);
        this.RX.a(this.Sn);
    }

    private void qH() {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar == null) {
            return;
        }
        cVar.a((c.InterfaceC0260c) null);
        this.RX.a((c.b) null);
        this.RX.b(null);
        this.RX.a((c.h) null);
        this.RX.c(null);
        this.RX.a((c.f) null);
        this.RX.a((c.a) null);
    }

    private void qJ() {
        qK();
        if (this.Sa == null) {
            this.Sa = new Runnable() { // from class: com.kwad.components.core.video.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.qD();
                    if (b.this.Sa != null) {
                        b.this.mHandler.postDelayed(b.this.Sa, 500L);
                    }
                }
            };
        }
        this.mHandler.post(this.Sa);
    }

    private void qK() {
        Runnable runnable = this.Sa;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
            this.Sa = null;
        }
    }

    private void reset() {
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "reset:" + getStateString(this.RW) + "->STATE_IDLE");
        this.RX.reset();
        this.RW = 0;
    }

    private void setKeepScreenOn(boolean z) {
        DetailVideoView detailVideoView = this.mDetailVideoView;
        if (detailVideoView != null) {
            detailVideoView.setKeepScreenOn(z);
        }
    }

    private void setPlayType(int i) {
        com.kwad.sdk.contentalliance.a.a.b bVar = this.Sb;
        if (bVar == null || bVar.videoPlayerStatus == null) {
            return;
        }
        this.Sb.videoPlayerStatus.mVideoPlayerType = i;
    }

    public final void a(a aVar) {
        a(aVar, true);
    }

    public final void a(final a aVar, boolean z) {
        if (this.RX == null) {
            return;
        }
        setKeepScreenOn(false);
        this.mHandler.removeCallbacksAndMessages(null);
        qK();
        qH();
        this.mDetailVideoView = null;
        final com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            if (z) {
                com.kwad.sdk.utils.g.execute(new Runnable() { // from class: com.kwad.components.core.video.b.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar = b.this;
                        b.a(cVar, aVar);
                    }
                });
            } else {
                a(cVar, aVar);
            }
            this.RX = null;
        }
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "release:" + getStateString(this.RW) + "->STATE_IDLE");
        this.RW = 0;
        this.Sc = 0;
    }

    public final void a(com.kwad.sdk.contentalliance.a.a.a aVar) {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar instanceof com.kwad.sdk.core.video.a.d) {
            ((com.kwad.sdk.core.video.a.d) cVar).a(aVar);
        }
    }

    public final void a(com.kwad.sdk.contentalliance.a.a.b bVar) {
        try {
            if (TextUtils.isEmpty(bVar.videoUrl)) {
                com.kwad.sdk.core.e.c.e(this.TAG, "videoUrl is null");
                return;
            }
            String str = this.TAG;
            com.kwad.sdk.core.e.c.d(str, "videoUrl=" + bVar.videoUrl);
            this.RX.a(bVar);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    public final void a(com.kwad.sdk.contentalliance.a.a.b bVar, DetailVideoView detailVideoView) {
        a(bVar, true, false, detailVideoView);
    }

    public final void a(com.kwad.sdk.contentalliance.a.a.b bVar, boolean z, boolean z2, DetailVideoView detailVideoView) {
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "initMediaPlayer enablePreLoad:" + z);
        if (bVar == null || detailVideoView == null) {
            return;
        }
        com.kwad.sdk.core.video.a.c a2 = com.kwad.sdk.core.video.a.e.a(this.mContext, z, com.kwad.sdk.core.config.d.xr(), com.kwad.sdk.core.config.d.xs());
        a2.setLooping(false);
        a(bVar, z2, detailVideoView, a2);
    }

    public final void a(c.d dVar) {
        if (dVar == null) {
            return;
        }
        this.Sd.add(dVar);
    }

    public final void a(c.e eVar) {
        this.Sh.add(eVar);
    }

    public final void a(com.kwad.sdk.core.video.a.c cVar, int i, int i2) {
        Iterator<c.d> it = this.Sd.iterator();
        while (it.hasNext()) {
            c.d next = it.next();
            if (next == null) {
                it.remove();
            } else {
                next.k(i, i2);
            }
        }
    }

    public final void b(c.d dVar) {
        if (dVar == null) {
            return;
        }
        this.Sd.remove(dVar);
    }

    public final void c(k kVar) {
        this.Sg.add(kVar);
    }

    public final void clear() {
        this.Sg.clear();
    }

    public final void d(k kVar) {
        this.Sg.remove(kVar);
    }

    public final int getBufferPercentage() {
        return this.RY;
    }

    public final String getCurrentPlayingUrl() {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        return cVar == null ? "" : cVar.getCurrentPlayingUrl();
    }

    public final long getCurrentPosition() {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            return cVar.getCurrentPosition();
        }
        return 0L;
    }

    public final long getDuration() {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            return cVar.getDuration();
        }
        return 0L;
    }

    public final int getMediaPlayerType() {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            return cVar.getMediaPlayerType();
        }
        return 0;
    }

    public final long getPlayDuration() {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            return cVar.getCurrentPosition();
        }
        return 0L;
    }

    public final int getVideoHeight() {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            return cVar.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoWidth() {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            return cVar.getVideoWidth();
        }
        return 0;
    }

    public final boolean isPlaying() {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            return cVar.isPlaying();
        }
        return false;
    }

    public final boolean isPrepared() {
        return this.RW == 2 || this.RW == 3 || this.RW == 5 || this.RW == 8 || this.RW == 9;
    }

    public final boolean isPreparing() {
        return this.RW == 1;
    }

    public final void onPlayStateChanged(int i) {
        if (this.Sg == null) {
            return;
        }
        for (k kVar : this.Sg) {
            if (kVar != null) {
                switch (i) {
                    case -1:
                        setKeepScreenOn(false);
                        qK();
                        kVar.onMediaPlayError(this.RF, this.RG);
                        continue;
                    case 1:
                        kVar.onMediaPreparing();
                        continue;
                    case 2:
                        kVar.onMediaPrepared();
                        continue;
                    case 3:
                        setKeepScreenOn(true);
                        kVar.onMediaPlayStart();
                        continue;
                    case 4:
                        setKeepScreenOn(true);
                        kVar.onMediaPlaying();
                        continue;
                    case 5:
                        setKeepScreenOn(false);
                        kVar.onMediaPlayPaused();
                        continue;
                    case 6:
                        kVar.onVideoPlayBufferingPlaying();
                        continue;
                    case 7:
                        kVar.onVideoPlayBufferingPaused();
                        continue;
                    case 9:
                        try {
                            com.kwad.sdk.core.video.a.c cVar = this.RX;
                            if (cVar != null && !cVar.isLooping()) {
                                setKeepScreenOn(false);
                                qK();
                            }
                            kVar.onMediaPlayCompleted();
                            continue;
                        } catch (Exception e) {
                            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                            break;
                        }
                        break;
                }
            }
        }
    }

    public final boolean pause() {
        boolean z;
        com.kwad.sdk.core.e.c.i(this.TAG, "pause mCurrentState: " + getStateString(this.RW));
        if (this.RW == 4) {
            this.RX.pause();
            com.kwad.sdk.core.e.c.i(this.TAG, "pause STATE_PLAYING->STATE_PAUSED");
            this.RW = 5;
            onPlayStateChanged(this.RW);
            com.kwad.sdk.core.video.a.a.a.dI("videoPausePlay");
            z = true;
        } else {
            z = false;
        }
        if (this.RW == 6) {
            this.RX.pause();
            com.kwad.sdk.core.e.c.i(this.TAG, "pause STATE_BUFFERING_PLAYING->STATE_PAUSED");
            this.RW = 7;
            onPlayStateChanged(this.RW);
            z = true;
        }
        if (this.RW == 3) {
            this.RX.pause();
            com.kwad.sdk.core.e.c.i(this.TAG, "pause STATE_STARTED->STATE_PAUSED");
            this.RW = 5;
            onPlayStateChanged(this.RW);
            com.kwad.sdk.core.video.a.a.a.dI("videoPausePlay");
            z = true;
        }
        if (this.RW == 9 && this.RX.isLooping()) {
            this.RX.pause();
            com.kwad.sdk.core.e.c.i(this.TAG, "pause " + getStateString(this.RW) + "->STATE_PAUSED");
            this.RW = 5;
            onPlayStateChanged(this.RW);
            return true;
        }
        return z;
    }

    public final void prepareAsync() {
        if (this.RX == null) {
            return;
        }
        if (this.Sf) {
            if (this.Se.compareAndSet(false, true)) {
                com.kwad.sdk.utils.g.execute(new Runnable() { // from class: com.kwad.components.core.video.b.8
                    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7 A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #4 {Exception -> 0x00d5, blocks: (B:20:0x00c0, B:21:0x00c6, B:22:0x00c7, B:23:0x00d0), top: B:39:0x00c0 }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            r6 = this;
                            com.kwad.components.core.video.b r0 = com.kwad.components.core.video.b.this
                            java.lang.String r0 = com.kwad.components.core.video.b.b(r0)
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            java.lang.String r2 = "prepareAsync now:"
                            r1.<init>(r2)
                            com.kwad.components.core.video.b r2 = com.kwad.components.core.video.b.this
                            int r2 = com.kwad.components.core.video.b.c(r2)
                            java.lang.String r2 = com.kwad.components.core.video.b.getStateString(r2)
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            com.kwad.sdk.core.e.c.i(r0, r1)
                            com.kwad.components.core.video.b r0 = com.kwad.components.core.video.b.this
                            com.kwad.sdk.core.video.a.c r0 = com.kwad.components.core.video.b.e(r0)
                            if (r0 != 0) goto L2a
                            return
                        L2a:
                            r0 = 0
                            com.kwad.components.core.video.b r1 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L95
                            com.kwad.sdk.core.video.a.c r1 = com.kwad.components.core.video.b.e(r1)     // Catch: java.lang.Throwable -> L95
                            monitor-enter(r1)     // Catch: java.lang.Throwable -> L95
                            com.kwad.components.core.video.b r2 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L92
                            com.kwad.sdk.contentalliance.a.a.b r3 = com.kwad.components.core.video.b.h(r2)     // Catch: java.lang.Throwable -> L92
                            r2.a(r3)     // Catch: java.lang.Throwable -> L92
                            com.kwad.components.core.video.b r2 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L92
                            com.kwad.sdk.core.video.a.c r2 = com.kwad.components.core.video.b.e(r2)     // Catch: java.lang.Throwable -> L92
                            boolean r2 = r2.prepareAsync()     // Catch: java.lang.Throwable -> L92
                            com.kwad.components.core.video.b r3 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L92
                            java.lang.String r3 = com.kwad.components.core.video.b.b(r3)     // Catch: java.lang.Throwable -> L92
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
                            java.lang.String r5 = "prepareAsync:"
                            r4.<init>(r5)     // Catch: java.lang.Throwable -> L92
                            com.kwad.components.core.video.b r5 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L92
                            int r5 = com.kwad.components.core.video.b.c(r5)     // Catch: java.lang.Throwable -> L92
                            java.lang.String r5 = com.kwad.components.core.video.b.getStateString(r5)     // Catch: java.lang.Throwable -> L92
                            r4.append(r5)     // Catch: java.lang.Throwable -> L92
                            java.lang.String r5 = "->STATE_PREPARING, success: "
                            r4.append(r5)     // Catch: java.lang.Throwable -> L92
                            r4.append(r2)     // Catch: java.lang.Throwable -> L92
                            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L92
                            com.kwad.sdk.core.e.c.i(r3, r4)     // Catch: java.lang.Throwable -> L92
                            com.kwad.components.core.video.b r3 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L92
                            r4 = 1
                            com.kwad.components.core.video.b.a(r3, r4)     // Catch: java.lang.Throwable -> L92
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L92
                            if (r2 == 0) goto L86
                            com.kwad.components.core.video.b r1 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L95
                            android.os.Handler r1 = com.kwad.components.core.video.b.i(r1)     // Catch: java.lang.Throwable -> L95
                            com.kwad.components.core.video.b$8$1 r2 = new com.kwad.components.core.video.b$8$1     // Catch: java.lang.Throwable -> L95
                            r2.<init>()     // Catch: java.lang.Throwable -> L95
                            r1.post(r2)     // Catch: java.lang.Throwable -> L95
                            goto Lb7
                        L86:
                            com.kwad.components.core.video.b r1 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L95
                            java.lang.String r1 = com.kwad.components.core.video.b.b(r1)     // Catch: java.lang.Throwable -> L95
                            java.lang.String r2 = "prepareAsync failed"
                            com.kwad.sdk.core.e.c.e(r1, r2)     // Catch: java.lang.Throwable -> L95
                            goto Lb7
                        L92:
                            r2 = move-exception
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L92
                            throw r2     // Catch: java.lang.Throwable -> L95
                        L95:
                            r1 = move-exception
                            com.kwad.components.core.video.b r2 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> Lda
                            java.lang.String r2 = com.kwad.components.core.video.b.b(r2)     // Catch: java.lang.Throwable -> Lda
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lda
                            java.lang.String r4 = "prepareAsync Exception:"
                            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lda
                            com.kwad.components.core.video.b r4 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> Lda
                            int r4 = com.kwad.components.core.video.b.c(r4)     // Catch: java.lang.Throwable -> Lda
                            java.lang.String r4 = com.kwad.components.core.video.b.getStateString(r4)     // Catch: java.lang.Throwable -> Lda
                            r3.append(r4)     // Catch: java.lang.Throwable -> Lda
                            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lda
                            com.kwad.sdk.core.e.c.e(r2, r3, r1)     // Catch: java.lang.Throwable -> Lda
                        Lb7:
                            com.kwad.components.core.video.b r1 = com.kwad.components.core.video.b.this
                            java.util.concurrent.atomic.AtomicBoolean r1 = com.kwad.components.core.video.b.j(r1)
                            r1.set(r0)
                            com.kwad.components.core.video.b r0 = com.kwad.components.core.video.b.this     // Catch: java.lang.Exception -> Ld5
                            java.util.concurrent.atomic.AtomicBoolean r0 = com.kwad.components.core.video.b.j(r0)     // Catch: java.lang.Exception -> Ld5
                            monitor-enter(r0)     // Catch: java.lang.Exception -> Ld5
                            com.kwad.components.core.video.b r1 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> Ld2
                            java.util.concurrent.atomic.AtomicBoolean r1 = com.kwad.components.core.video.b.j(r1)     // Catch: java.lang.Throwable -> Ld2
                            r1.notifyAll()     // Catch: java.lang.Throwable -> Ld2
                            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld2
                            goto Ld9
                        Ld2:
                            r1 = move-exception
                            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld2
                            throw r1     // Catch: java.lang.Exception -> Ld5
                        Ld5:
                            r0 = move-exception
                            com.kwad.sdk.core.e.c.printStackTrace(r0)
                        Ld9:
                            return
                        Lda:
                            r1 = move-exception
                            com.kwad.components.core.video.b r2 = com.kwad.components.core.video.b.this
                            java.util.concurrent.atomic.AtomicBoolean r2 = com.kwad.components.core.video.b.j(r2)
                            r2.set(r0)
                            throw r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.core.video.b.AnonymousClass8.run():void");
                    }
                });
                return;
            }
            return;
        }
        try {
            a(this.Sb);
            if (!this.RX.prepareAsync()) {
                com.kwad.sdk.core.e.c.e(this.TAG, "prepareAsync failed");
                return;
            }
            String str = this.TAG;
            com.kwad.sdk.core.e.c.i(str, "prepareAsync:" + getStateString(this.RW) + "->STATE_PREPARING");
            this.RW = 1;
            onPlayStateChanged(this.RW);
        } catch (Throwable th) {
            if (getMediaPlayerType() != 2) {
                int i = this.Sc;
                this.Sc = i + 1;
                if (i <= 4) {
                    qI();
                }
            }
            String str2 = this.TAG;
            com.kwad.sdk.core.e.c.i(str2, "prepareAsync Exception:" + getStateString(this.RW));
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }

    public final com.kwad.sdk.core.video.a.c qF() {
        return this.RX;
    }

    public final void qI() {
        if (this.RX == null) {
            com.kwad.sdk.core.e.c.w("resetAndPlay", "mMediaPlayer is null");
        } else if (this.RW == 2 || this.RW == 3 || this.RW == 4 || this.RW == 5) {
            com.kwad.sdk.core.e.c.w("resetAndPlay", "can not resetAndPlay in sate:" + this.RW);
        } else {
            reset();
            qH();
            qG();
            prepareAsync();
        }
    }

    public final void release() {
        a((a) null);
    }

    public final void releaseSync() {
        a((a) null, false);
    }

    public final void restart() {
        if (this.RX != null && this.RW == 9) {
            start();
        }
        setPlayType(3);
    }

    public final void resume() {
        if (this.RX == null) {
            com.kwad.sdk.core.e.c.e(this.TAG, "resume but mMediaPlayer is null");
            return;
        }
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "resume mCurrentState: " + getStateString(this.RW));
        if (this.RW == 2 || this.RW == 0) {
            String str2 = this.TAG;
            com.kwad.sdk.core.e.c.i(str2, "resume:" + getStateString(this.RW) + "->start()");
            start();
        } else if (this.RW == 5) {
            this.RX.start();
            String str3 = this.TAG;
            com.kwad.sdk.core.e.c.i(str3, "resume:" + getStateString(this.RW) + "->STATE_PLAYING");
            this.RW = 4;
            onPlayStateChanged(this.RW);
            setPlayType(2);
            com.kwad.sdk.core.video.a.a.a.dI("videoResumePlay");
        } else if (this.RW != 7) {
            if (this.RW != 1) {
                String str4 = this.TAG;
                com.kwad.sdk.core.e.c.w(str4, "resume: " + getStateString(this.RW) + " 此时不能调用resume()方法.");
            }
        } else {
            this.RX.start();
            String str5 = this.TAG;
            com.kwad.sdk.core.e.c.i(str5, "resume:" + getStateString(this.RW) + "->STATE_BUFFERING_PLAYING");
            this.RW = 6;
            onPlayStateChanged(this.RW);
        }
    }

    public final void seekTo(long j) {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            cVar.seekTo(j);
        }
    }

    public final void setAudioEnabled(boolean z) {
        float f = z ? 1.0f : 0.0f;
        setVolume(f, f);
    }

    public final void setRadius(float f, float f2, float f3, float f4) {
        this.mDetailVideoView.setRadius(f, f2, f3, f4);
    }

    public final void setSpeed(float f) {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar == null) {
            return;
        }
        cVar.setSpeed(f);
    }

    public final void setSurface(Surface surface) {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar != null) {
            cVar.setSurface(surface);
        }
    }

    public final void setVolume(float f, float f2) {
        com.kwad.sdk.core.video.a.c cVar = this.RX;
        if (cVar == null) {
            return;
        }
        try {
            cVar.setVolume(f, f2);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
        if (r6.RW == 9) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            r6 = this;
            java.lang.String r0 = r6.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "start mCurrentState: "
            r1.<init>(r2)
            int r2 = r6.RW
            java.lang.String r2 = getStateString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.e.c.i(r0, r1)
            int r0 = r6.RW
            java.lang.String r1 = "videoStartPlay"
            r2 = 2
            if (r0 != 0) goto L4e
            java.lang.String r0 = r6.TAG
            java.lang.String r3 = "start, still not prepared well, prepare again"
            com.kwad.sdk.core.e.c.i(r0, r3)
            r6.prepareAsync()
            int r0 = r6.getMediaPlayerType()
            if (r0 != r2) goto L4d
            boolean r0 = r6.Sf
            if (r0 == 0) goto L45
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.Se
            boolean r0 = r0.get()
            if (r0 == 0) goto L45
            com.kwad.components.core.video.b$9 r0 = new com.kwad.components.core.video.b$9
            r0.<init>()
            com.kwad.sdk.utils.g.execute(r0)
            return
        L45:
            com.kwad.sdk.core.video.a.c r0 = r6.RX
            r0.start()
            com.kwad.sdk.core.video.a.a.a.dI(r1)
        L4d:
            return
        L4e:
            int r0 = r6.RW
            r3 = 9
            if (r0 == r2) goto L58
            int r0 = r6.RW
            if (r0 != r3) goto Lbe
        L58:
            long r4 = java.lang.System.currentTimeMillis()
            r6.mStartTime = r4
            com.kwad.sdk.core.video.a.c r0 = r6.RX
            r0.start()
            com.kwad.sdk.core.video.a.a.a.dI(r1)
            long r0 = r6.RZ
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L75
            com.kwad.sdk.core.video.a.c r4 = r6.RX
            int r0 = (int) r0
            long r0 = (long) r0
            r4.seekTo(r0)
        L75:
            java.lang.String r0 = r6.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "start:"
            r1.<init>(r4)
            int r4 = r6.RW
            java.lang.String r4 = getStateString(r4)
            r1.append(r4)
            java.lang.String r4 = "->STATE_STARTED"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.e.c.i(r0, r1)
            com.kwad.sdk.contentalliance.a.a.b r0 = r6.Sb
            r1 = 3
            if (r0 == 0) goto Lb4
            com.kwad.sdk.core.response.model.VideoPlayerStatus r0 = r0.videoPlayerStatus
            if (r0 == 0) goto Lb4
            int r0 = r6.RW
            if (r0 != r2) goto Lad
            com.kwad.sdk.contentalliance.a.a.b r0 = r6.Sb
            com.kwad.sdk.core.response.model.VideoPlayerStatus r0 = r0.videoPlayerStatus
            int r0 = r0.mVideoPlayerType
            if (r0 != 0) goto Lb1
            r0 = 1
            r6.setPlayType(r0)
            goto Lb4
        Lad:
            int r0 = r6.RW
            if (r0 != r3) goto Lb4
        Lb1:
            r6.setPlayType(r1)
        Lb4:
            r6.RW = r1
            int r0 = r6.RW
            r6.onPlayStateChanged(r0)
            r6.qJ()
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.core.video.b.start():void");
    }

    public final void start(long j) {
        this.RZ = j;
        start();
    }

    public final void stopAndPrepareAsync() {
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "stopAndPrepareAsync mCurrentState:" + this.RW);
        if (this.RW == 1 || this.RW == 2) {
            return;
        }
        if (this.RW != 3 && this.RW != 4 && this.RW != 5 && this.RW != 6 && this.RW != 7 && this.RW != 8 && this.RW != 9) {
            release();
            return;
        }
        try {
            this.RX.stop();
            this.RW = 8;
            onPlayStateChanged(this.RW);
            prepareAsync();
        } catch (Exception e) {
            release();
            String str2 = this.TAG;
            com.kwad.sdk.core.e.c.e(str2, "stopAndPrepareAsync mCurrentState:" + this.RW);
        }
    }
}
