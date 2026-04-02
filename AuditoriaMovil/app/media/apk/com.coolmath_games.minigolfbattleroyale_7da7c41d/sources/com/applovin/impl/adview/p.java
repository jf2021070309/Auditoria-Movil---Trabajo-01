package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.k;
import com.applovin.impl.adview.w;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.facebook.appevents.codeless.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class p extends Activity implements l, f.a {
    public static volatile q lastKnownWrapper;
    private FrameLayout C;
    private j D;
    private View E;
    private j F;
    private View G;
    private h H;
    private ImageView I;
    private com.applovin.impl.sdk.b.b K;
    private v L;
    private ProgressBar M;
    private w.a N;
    private a O;
    private com.applovin.impl.sdk.utils.m P;
    private com.applovin.impl.sdk.utils.a Q;
    private AppLovinBroadcastManager.Receiver R;
    private o a;
    private q b;
    private com.applovin.impl.sdk.d.d c;
    protected k countdownManager;
    public volatile com.applovin.impl.sdk.a.g currentAd;
    public com.applovin.impl.sdk.r logger;
    public com.applovin.impl.sdk.k sdk;
    public AppLovinVideoView videoView;
    private boolean z;
    private volatile boolean d = false;
    private volatile boolean e = false;
    private volatile boolean f = false;
    private volatile boolean g = false;
    private volatile boolean h = false;
    private volatile boolean i = false;
    private volatile boolean j = false;
    protected volatile boolean postitialWasDisplayed = false;
    private boolean k = false;
    protected volatile boolean videoMuted = false;
    private volatile boolean l = false;
    private boolean m = true;
    private boolean n = false;
    protected int computedLengthSeconds = 0;
    private long o = 0;
    private long p = 0;
    private long q = 0;
    private long r = 0;
    private long s = -2;
    private int t = 0;
    private int u = Integer.MIN_VALUE;
    private AtomicBoolean v = new AtomicBoolean(false);
    private AtomicBoolean w = new AtomicBoolean(false);
    private AtomicBoolean x = new AtomicBoolean(false);
    private int y = com.applovin.impl.sdk.f.a;
    private final Handler A = new Handler(Looper.getMainLooper());
    private final Handler B = new Handler(Looper.getMainLooper());
    private WeakReference<MediaPlayer> J = new WeakReference<>(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.adview.p$27  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass27 implements MediaPlayer.OnPreparedListener {
        AnonymousClass27() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            p.this.J = new WeakReference(mediaPlayer);
            float f = !p.this.i() ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            int videoWidth = mediaPlayer.getVideoWidth();
            int videoHeight = mediaPlayer.getVideoHeight();
            p.this.computedLengthSeconds = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            p.this.videoView.setVideoSize(videoWidth, videoHeight);
            SurfaceHolder holder = p.this.videoView.getHolder();
            if (holder.getSurface() != null) {
                mediaPlayer.setDisplay(holder);
            }
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.applovin.impl.adview.p.27.1
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer2, final int i, final int i2) {
                    p.this.B.post(new Runnable() { // from class: com.applovin.impl.adview.p.27.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            p pVar = p.this;
                            pVar.handleMediaError("Media player error (" + i + "," + i2 + ")");
                        }
                    });
                    return true;
                }
            });
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.applovin.impl.adview.p.27.2
                @Override // android.media.MediaPlayer.OnInfoListener
                public boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                    if (i != 3) {
                        if (i == 701) {
                            p.this.y();
                            if (p.this.c != null) {
                                p.this.c.g();
                                return false;
                            }
                            return false;
                        } else if (i != 702) {
                            return false;
                        }
                    }
                    p.this.z();
                    return false;
                }
            });
            if (p.this.p == 0) {
                p.this.q();
                p.this.k();
                p.this.v();
                p.this.u();
                p.this.playVideo();
                p.this.I();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (!C()) {
            skipVideo();
            return;
        }
        M();
        pauseReportRewardTask();
        this.logger.b("InterActivity", "Prompting incentivized ad close warning");
        this.K.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        d s;
        if (this.currentAd.U() && (s = this.a.getAdViewController().s()) != null) {
            s.a("javascript:al_onCloseButtonTapped();");
        }
        if (!D()) {
            dismiss();
            return;
        }
        this.logger.b("InterActivity", "Prompting incentivized non-video ad close warning");
        this.K.c();
    }

    private boolean C() {
        return G() && !isFullyWatched() && ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.bp)).booleanValue() && this.K != null;
    }

    private boolean D() {
        return H() && !F() && ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.bu)).booleanValue() && this.K != null;
    }

    private int E() {
        if (this.currentAd instanceof com.applovin.impl.sdk.a.a) {
            float l = ((com.applovin.impl.sdk.a.a) this.currentAd).l();
            if (l <= 0.0f) {
                l = (float) this.currentAd.u();
            }
            return (int) Math.min((Utils.millisToSeconds(System.currentTimeMillis() - this.o) / l) * 100.0d, 100.0d);
        }
        return 0;
    }

    private boolean F() {
        return E() >= this.currentAd.P();
    }

    private boolean G() {
        return AppLovinAdType.INCENTIVIZED.equals(this.currentAd.getType());
    }

    private boolean H() {
        return !this.currentAd.hasVideoUrl() && G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r0 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
        if (r0 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        r0 = java.util.concurrent.TimeUnit.SECONDS.toMillis(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I() {
        /*
            r7 = this;
            com.applovin.impl.sdk.a.g r0 = r7.currentAd
            if (r0 == 0) goto Ldf
            com.applovin.impl.sdk.a.g r0 = r7.currentAd
            long r0 = r0.ac()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L18
            com.applovin.impl.sdk.a.g r0 = r7.currentAd
            int r0 = r0.ad()
            if (r0 < 0) goto Ldf
        L18:
            com.applovin.impl.sdk.utils.m r0 = r7.P
            if (r0 != 0) goto Ldf
            com.applovin.impl.sdk.a.g r0 = r7.currentAd
            long r0 = r0.ac()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L2e
            com.applovin.impl.sdk.a.g r0 = r7.currentAd
            long r0 = r0.ac()
            goto Laf
        L2e:
            boolean r0 = r7.isVastAd()
            if (r0 == 0) goto L69
            com.applovin.impl.sdk.a.g r0 = r7.currentAd
            com.applovin.impl.a.a r0 = (com.applovin.impl.a.a) r0
            com.applovin.impl.a.j r1 = r0.l()
            if (r1 == 0) goto L51
            int r4 = r1.b()
            if (r4 <= 0) goto L51
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            int r1 = r1.b()
            long r5 = (long) r1
            long r4 = r4.toMillis(r5)
            long r2 = r2 + r4
            goto L5b
        L51:
            com.applovin.impl.adview.AppLovinVideoView r1 = r7.videoView
            int r1 = r1.getDuration()
            if (r1 <= 0) goto L5b
            long r4 = (long) r1
            long r2 = r2 + r4
        L5b:
            boolean r1 = r0.ae()
            if (r1 == 0) goto La2
            long r0 = r0.u()
            int r0 = (int) r0
            if (r0 <= 0) goto La2
            goto L9a
        L69:
            com.applovin.impl.sdk.a.g r0 = r7.currentAd
            boolean r0 = r0 instanceof com.applovin.impl.sdk.a.a
            if (r0 == 0) goto La2
            com.applovin.impl.sdk.a.g r0 = r7.currentAd
            com.applovin.impl.sdk.a.a r0 = (com.applovin.impl.sdk.a.a) r0
            com.applovin.impl.adview.AppLovinVideoView r1 = r7.videoView
            int r1 = r1.getDuration()
            if (r1 <= 0) goto L7d
            long r4 = (long) r1
            long r2 = r2 + r4
        L7d:
            boolean r1 = r0.ae()
            if (r1 == 0) goto La2
            float r1 = r0.l()
            int r1 = (int) r1
            if (r1 <= 0) goto L93
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = (long) r1
            long r0 = r0.toMillis(r4)
        L91:
            long r2 = r2 + r0
            goto La2
        L93:
            long r0 = r0.u()
            int r0 = (int) r0
            if (r0 <= 0) goto La2
        L9a:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = (long) r0
            long r0 = r1.toMillis(r4)
            goto L91
        La2:
            double r0 = (double) r2
            com.applovin.impl.sdk.a.g r2 = r7.currentAd
            int r2 = r2.ad()
            double r2 = (double) r2
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r4
            double r0 = r0 * r2
            long r0 = (long) r0
        Laf:
            com.applovin.impl.sdk.r r2 = r7.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Scheduling report reward in "
            r3.append(r4)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r4.toSeconds(r0)
            r3.append(r4)
            java.lang.String r4 = " seconds..."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "InterActivity"
            r2.b(r4, r3)
            com.applovin.impl.sdk.k r2 = r7.sdk
            com.applovin.impl.adview.p$17 r3 = new com.applovin.impl.adview.p$17
            r3.<init>()
            com.applovin.impl.sdk.utils.m r0 = com.applovin.impl.sdk.utils.m.a(r0, r2, r3)
            r7.P = r0
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.p.I():void");
    }

    private void J() {
        View view;
        com.applovin.impl.sdk.r rVar;
        StringBuilder sb;
        String str;
        o oVar = this.a;
        if (oVar == null) {
            exitWithError("AdView was null");
            return;
        }
        oVar.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.impl.adview.p.18
            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adDisplayed(AppLovinAd appLovinAd) {
                if (p.this.e) {
                    return;
                }
                p.this.a(appLovinAd);
            }

            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adHidden(AppLovinAd appLovinAd) {
                p.this.b(appLovinAd);
            }
        });
        this.a.setAdClickListener(new AppLovinAdClickListener() { // from class: com.applovin.impl.adview.p.19
            @Override // com.applovin.sdk.AppLovinAdClickListener
            public void adClicked(AppLovinAd appLovinAd) {
                com.applovin.impl.sdk.utils.i.a(p.this.b.e(), appLovinAd);
            }
        });
        this.currentAd = this.b.b();
        if (this.w.compareAndSet(false, true)) {
            this.sdk.t().trackImpression(this.currentAd);
            this.currentAd.setHasShown(true);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(this);
        this.C = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        this.C.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.countdownManager = new k(this.A, this.sdk);
        j();
        if (this.currentAd.isVideoAd()) {
            this.l = this.currentAd.f();
            if (this.l) {
                rVar = this.logger;
                sb = new StringBuilder();
                str = "Preparing stream for ";
            } else {
                rVar = this.logger;
                sb = new StringBuilder();
                str = "Preparing cached video playback for ";
            }
            sb.append(str);
            sb.append(this.currentAd.h());
            rVar.b("InterActivity", sb.toString());
            com.applovin.impl.sdk.d.d dVar = this.c;
            if (dVar != null) {
                dVar.b(this.l ? 1L : 0L);
            }
        }
        this.videoMuted = i();
        Uri h = this.currentAd.h();
        a(h);
        if (h == null) {
            I();
        }
        this.D.bringToFront();
        if (n() && (view = this.E) != null) {
            view.bringToFront();
        }
        j jVar = this.F;
        if (jVar != null) {
            jVar.bringToFront();
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.eD)).booleanValue()) {
            this.C.addView(this.a);
            this.a.setVisibility(4);
        }
        this.a.renderAd(this.currentAd);
        if (this.currentAd.hasVideoUrl()) {
            return;
        }
        if (H()) {
            d(this.currentAd);
        }
        showPostitial();
    }

    private void K() {
        if (this.videoView != null) {
            boolean z = false;
            try {
                z = this.currentAd.aM();
            } catch (Throwable unused) {
            }
            this.t = getVideoPercentViewed();
            if (z) {
                this.videoView.pause();
            } else {
                this.videoView.stopPlayback();
            }
        }
    }

    private boolean L() {
        return this.videoMuted;
    }

    private void M() {
        AppLovinVideoView appLovinVideoView = this.videoView;
        this.sdk.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Integer>>) com.applovin.impl.sdk.c.d.u, (com.applovin.impl.sdk.c.d<Integer>) Integer.valueOf(appLovinVideoView != null ? appLovinVideoView.getCurrentPosition() : 0));
        this.sdk.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.v, (com.applovin.impl.sdk.c.d<Boolean>) true);
        try {
            this.countdownManager.c();
        } catch (Throwable th) {
            this.logger.b("InterActivity", "Unable to pause countdown timers", th);
        }
        AppLovinVideoView appLovinVideoView2 = this.videoView;
        if (appLovinVideoView2 != null) {
            appLovinVideoView2.pause();
        }
    }

    private void N() {
        long max = Math.max(0L, ((Long) this.sdk.a(com.applovin.impl.sdk.c.b.cD)).longValue());
        if (max <= 0) {
            this.sdk.z().b("InterActivity", "Resuming video immediately");
            O();
            return;
        }
        com.applovin.impl.sdk.r z = this.sdk.z();
        z.b("InterActivity", "Resuming video with delay of " + max);
        this.B.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.p.20
            @Override // java.lang.Runnable
            public void run() {
                p.this.O();
            }
        }, max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        AppLovinVideoView appLovinVideoView;
        if (this.postitialWasDisplayed || (appLovinVideoView = this.videoView) == null || appLovinVideoView.isPlaying()) {
            return;
        }
        this.videoView.seekTo(((Integer) this.sdk.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Integer>>) com.applovin.impl.sdk.c.d.u, (com.applovin.impl.sdk.c.d<Integer>) Integer.valueOf(this.videoView.getDuration()))).intValue());
        this.videoView.start();
        this.countdownManager.a();
    }

    private void P() {
        if (this.h) {
            return;
        }
        boolean z = true;
        this.h = true;
        try {
            int videoPercentViewed = getVideoPercentViewed();
            if (this.currentAd.hasVideoUrl()) {
                a(this.currentAd, videoPercentViewed, isFullyWatched());
                if (this.c != null) {
                    this.c.c(videoPercentViewed);
                }
            } else if ((this.currentAd instanceof com.applovin.impl.sdk.a.a) && H()) {
                int E = E();
                com.applovin.impl.sdk.r rVar = this.logger;
                rVar.b("InterActivity", "Rewarded playable engaged at " + E + " percent");
                com.applovin.impl.sdk.a.g gVar = this.currentAd;
                double d = (double) E;
                if (E < this.currentAd.P()) {
                    z = false;
                }
                a(gVar, d, z);
            }
            this.sdk.t().trackVideoEnd(this.currentAd, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.o), videoPercentViewed, this.l);
            this.sdk.t().trackFullScreenAdClosed(this.currentAd, SystemClock.elapsedRealtime() - this.q, this.s, this.z, this.y);
        } catch (Throwable th) {
            com.applovin.impl.sdk.r rVar2 = this.logger;
            if (rVar2 != null) {
                rVar2.b("InterActivity", "Failed to notify end listener.", th);
            }
        }
    }

    private int a(int i) {
        return AppLovinSdkUtils.dpToPx(this, i);
    }

    private int a(int i, boolean z) {
        if (z) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        } else if (i == 0) {
            return 1;
        } else {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 9;
            }
            return i == 3 ? 8 : -1;
        }
    }

    private void a(long j, final j jVar) {
        this.B.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.p.10
            @Override // java.lang.Runnable
            public void run() {
                if (jVar.equals(p.this.D)) {
                    p.this.m();
                } else if (jVar.equals(p.this.F)) {
                    p.this.o();
                }
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PointF pointF) {
        if (!this.currentAd.D() || this.currentAd.k() == null) {
            e();
            f();
            return;
        }
        this.sdk.z().b("InterActivity", "Clicking through video...");
        clickThroughFromVideo(pointF);
    }

    private void a(Uri uri) {
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(this, this.sdk);
        this.videoView = appLovinVideoView;
        if (uri != null) {
            appLovinVideoView.setOnPreparedListener(new AnonymousClass27());
            this.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.applovin.impl.adview.p.28
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    p.this.h();
                }
            });
            this.videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.applovin.impl.adview.p.29
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, final int i, final int i2) {
                    p.this.B.post(new Runnable() { // from class: com.applovin.impl.adview.p.29.1
                        @Override // java.lang.Runnable
                        public void run() {
                            p pVar = p.this;
                            pVar.handleMediaError("Video view error (" + i + "," + i2 + ")");
                        }
                    });
                    return true;
                }
            });
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            this.videoView.setVideoURI(uri);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
        this.videoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        this.videoView.setOnTouchListener(new AppLovinTouchToClickListener(this.sdk, this, new AppLovinTouchToClickListener.OnClickListener() { // from class: com.applovin.impl.adview.p.2
            @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
            public void onClick(View view, PointF pointF) {
                p.this.a(pointF);
            }
        }));
        this.C.addView(this.videoView);
        setContentView(this.C);
        p();
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final View view, final boolean z, long j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.adview.p.25
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (z) {
                    return;
                }
                view.setVisibility(4);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        com.applovin.impl.sdk.utils.i.a(this.b.d(), appLovinAd);
        this.e = true;
        this.sdk.ac().a(appLovinAd);
        this.sdk.ak().a(appLovinAd);
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.adview.p.21
            @Override // java.lang.Runnable
            public void run() {
                p pVar = p.this;
                pVar.b(pVar.videoMuted);
            }
        }, ((Long) this.sdk.a(com.applovin.impl.sdk.c.b.cH)).longValue());
    }

    private void a(AppLovinAd appLovinAd, double d, boolean z) {
        com.applovin.impl.sdk.utils.i.a(this.b.c(), appLovinAd, d, z);
    }

    private void a(final String str) {
        q qVar = this.b;
        if (qVar != null) {
            final AppLovinAdDisplayListener d = qVar.d();
            if ((d instanceof com.applovin.impl.sdk.a.i) && this.x.compareAndSet(false, true)) {
                runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.p.26
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.applovin.impl.sdk.a.i) d).onAdDisplayFailed(str);
                    }
                });
            }
        }
    }

    private void a(final String str, long j) {
        if (j >= 0) {
            this.B.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.p.22
                @Override // java.lang.Runnable
                public void run() {
                    d s = p.this.a.getAdViewController().s();
                    if (s == null || !StringUtils.isValidString(str)) {
                        return;
                    }
                    s.a(str);
                }
            }, j);
        }
    }

    private void a(boolean z) {
        if (!com.applovin.impl.sdk.utils.f.d()) {
            Uri aE = z ? this.currentAd.aE() : this.currentAd.aF();
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            this.I.setImageURI(aE);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getDrawable(z ? R.drawable.unmute_to_mute : R.drawable.mute_to_unmute);
        if (animatedVectorDrawable != null) {
            this.I.setScaleType(ImageView.ScaleType.FIT_XY);
            this.I.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
        }
    }

    private boolean a() {
        int identifier = getResources().getIdentifier((String) this.sdk.a(com.applovin.impl.sdk.c.b.co), "bool", Constants.PLATFORM);
        return identifier > 0 && getResources().getBoolean(identifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    private void b(int i) {
        try {
            setRequestedOrientation(i);
        } catch (Throwable th) {
            this.sdk.z().b("InterActivity", "Failed to set requested orientation", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r7 == 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r7 == 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
        if (r7 == 1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(int r7, boolean r8) {
        /*
            r6 = this;
            com.applovin.impl.sdk.k r0 = r6.sdk
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.c.b.cm
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.applovin.impl.adview.q r1 = r6.b
            com.applovin.impl.sdk.a.g$b r1 = r1.f()
            com.applovin.impl.sdk.a.g$b r2 = com.applovin.impl.sdk.a.g.b.ACTIVITY_PORTRAIT
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 != r2) goto L3b
            r1 = 9
            if (r8 == 0) goto L2c
            if (r7 == r5) goto L24
            if (r7 == r3) goto L24
            goto L30
        L24:
            if (r0 == 0) goto L63
            if (r7 != r5) goto L30
        L28:
            r6.b(r1)
            goto L63
        L2c:
            if (r7 == 0) goto L34
            if (r7 == r4) goto L34
        L30:
            r6.b(r5)
            goto L63
        L34:
            if (r0 == 0) goto L63
            if (r7 != 0) goto L39
            goto L30
        L39:
            r5 = r1
            goto L30
        L3b:
            com.applovin.impl.adview.q r1 = r6.b
            com.applovin.impl.sdk.a.g$b r1 = r1.f()
            com.applovin.impl.sdk.a.g$b r2 = com.applovin.impl.sdk.a.g.b.ACTIVITY_LANDSCAPE
            if (r1 != r2) goto L63
            r1 = 8
            r2 = 0
            if (r8 == 0) goto L56
            if (r7 == 0) goto L4f
            if (r7 == r4) goto L4f
            goto L5a
        L4f:
            if (r0 == 0) goto L63
            if (r7 != r4) goto L54
            goto L28
        L54:
            r1 = r2
            goto L28
        L56:
            if (r7 == r5) goto L5e
            if (r7 == r3) goto L5e
        L5a:
            r6.b(r2)
            goto L63
        L5e:
            if (r0 == 0) goto L63
            if (r7 != r5) goto L28
            goto L54
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.p.b(int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AppLovinAd appLovinAd) {
        dismiss();
        c(appLovinAd);
    }

    private void b(String str) {
        com.applovin.impl.sdk.a.g gVar = this.currentAd;
        if (gVar == null || !gVar.V()) {
            return;
        }
        a(str, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        d s;
        if (!this.currentAd.T() || (s = this.a.getAdViewController().s()) == null) {
            return;
        }
        try {
            s.a(z ? "javascript:al_mute();" : "javascript:al_unmute();");
        } catch (Throwable th) {
            this.logger.b("InterActivity", "Unable to forward mute setting to template.", th);
        }
    }

    private void c(AppLovinAd appLovinAd) {
        if (this.f) {
            return;
        }
        this.f = true;
        q qVar = this.b;
        if (qVar != null) {
            com.applovin.impl.sdk.utils.i.b(qVar.d(), appLovinAd);
        }
        this.sdk.ac().b(appLovinAd);
        this.sdk.ak().a();
    }

    private void c(boolean z) {
        this.videoMuted = z;
        MediaPlayer mediaPlayer = this.J.get();
        if (mediaPlayer != null) {
            float f = z ? 0 : 1;
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException e) {
                this.logger.b("InterActivity", "Failed to set MediaPlayer muted: " + z, e);
            }
        }
    }

    private boolean c() {
        com.applovin.impl.sdk.k kVar;
        if (this.b == null || (kVar = this.sdk) == null || ((Boolean) kVar.a(com.applovin.impl.sdk.c.b.ci)).booleanValue()) {
            return true;
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cj)).booleanValue() && this.i) {
            return true;
        }
        return ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.ck)).booleanValue() && this.postitialWasDisplayed;
    }

    private void d() {
        int i;
        if (this.sdk == null || !isFinishing()) {
            if (this.currentAd != null && (i = this.u) != Integer.MIN_VALUE) {
                b(i);
            }
            finish();
        }
    }

    private void d(AppLovinAd appLovinAd) {
        if (this.g) {
            return;
        }
        this.g = true;
        com.applovin.impl.sdk.utils.i.a(this.b.c(), appLovinAd);
    }

    private void e() {
        h hVar;
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cp)).booleanValue() || (hVar = this.H) == null || hVar.getVisibility() == 8) {
            return;
        }
        a(this.H, this.H.getVisibility() == 4, 750L);
    }

    private void f() {
        v vVar;
        u C = this.currentAd.C();
        if (C == null || !C.e() || this.postitialWasDisplayed || (vVar = this.L) == null) {
            return;
        }
        a(this.L, vVar.getVisibility() == 4, C.f());
    }

    private void g() {
        com.applovin.impl.sdk.k kVar = this.sdk;
        if (kVar != null) {
            kVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.v, (com.applovin.impl.sdk.c.d<Boolean>) false);
            this.sdk.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Integer>>) com.applovin.impl.sdk.c.d.u, (com.applovin.impl.sdk.c.d<Integer>) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.d = true;
        showPostitial();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        return ((Integer) this.sdk.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Integer>>) com.applovin.impl.sdk.c.d.u, (com.applovin.impl.sdk.c.d<Integer>) 0)).intValue() > 0 ? this.videoMuted : ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cv)).booleanValue() ? this.sdk.p().isMuted() : ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.ct)).booleanValue();
    }

    private void j() {
        j a = j.a(this.currentAd.v(), this);
        this.D = a;
        a.setVisibility(8);
        this.D.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.p.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                p.this.B();
            }
        });
        int a2 = a(this.currentAd.X());
        int i = (this.currentAd.aa() ? 3 : 5) | 48;
        int i2 = (this.currentAd.ab() ? 3 : 5) | 48;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2, i | 48);
        this.D.a(a2);
        int a3 = a(this.currentAd.Y());
        int a4 = a(this.currentAd.Z());
        layoutParams.setMargins(a4, a3, a4, a3);
        this.C.addView(this.D, layoutParams);
        j a5 = j.a(this.currentAd.w(), this);
        this.F = a5;
        a5.setVisibility(8);
        this.F.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.p.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                p.this.A();
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a2, a2, i2);
        layoutParams2.setMargins(a4, a3, a4, a3);
        this.F.a(a2);
        this.C.addView(this.F, layoutParams2);
        this.F.bringToFront();
        if (n()) {
            int a6 = a(((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.bA)).intValue());
            View view = new View(this);
            this.E = view;
            view.setBackgroundColor(0);
            this.E.setVisibility(8);
            View view2 = new View(this);
            this.G = view2;
            view2.setBackgroundColor(0);
            this.G.setVisibility(8);
            int i3 = a2 + a6;
            int a7 = a3 - a(5);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3, i);
            layoutParams3.setMargins(a7, a7, a7, a7);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i3, i3, i2);
            layoutParams4.setMargins(a7, a7, a7, a7);
            this.E.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.p.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    p.this.D.performClick();
                }
            });
            this.G.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.p.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    p.this.F.performClick();
                }
            });
            this.C.addView(this.E, layoutParams3);
            this.E.bringToFront();
            this.C.addView(this.G, layoutParams4);
            this.G.bringToFront();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.I == null) {
            try {
                this.videoMuted = i();
                this.I = new ImageView(this);
                if (l()) {
                    this.sdk.z().b("InterActivity", "Mute button should be hidden");
                    return;
                }
                int a = a(((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cw)).intValue());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a, ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cy)).intValue());
                this.I.setScaleType(ImageView.ScaleType.FIT_CENTER);
                int a2 = a(((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cx)).intValue());
                layoutParams.setMargins(a2, a2, a2, a2);
                if ((this.videoMuted ? this.currentAd.aE() : this.currentAd.aF()) == null) {
                    this.sdk.z().e("InterActivity", "Attempting to add mute button but could not find uri");
                    return;
                }
                com.applovin.impl.sdk.r z = this.sdk.z();
                z.b("InterActivity", "Added mute button with params: " + layoutParams);
                a(this.videoMuted);
                this.I.setClickable(true);
                this.I.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.p.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        p.this.toggleMute();
                    }
                });
                this.C.addView(this.I, layoutParams);
                this.I.bringToFront();
            } catch (Exception e) {
                this.sdk.z().a("InterActivity", "Failed to attach mute button", e);
            }
        }
    }

    private boolean l() {
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cr)).booleanValue()) {
            if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cs)).booleanValue() || i()) {
                return false;
            }
            return !((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cu)).booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.p.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (p.this.i) {
                        p.this.D.setVisibility(0);
                        return;
                    }
                    p.this.q = SystemClock.elapsedRealtime();
                    p.this.i = true;
                    if (p.this.n() && p.this.E != null) {
                        p.this.E.setVisibility(0);
                        p.this.E.bringToFront();
                    }
                    p.this.D.setVisibility(0);
                    p.this.D.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(400L);
                    alphaAnimation.setRepeatCount(0);
                    p.this.D.startAnimation(alphaAnimation);
                } catch (Throwable unused) {
                    p.this.dismiss();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        return ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.bA)).intValue() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.p.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (p.this.j || p.this.F == null) {
                        return;
                    }
                    p.this.s = -1L;
                    p.this.r = SystemClock.elapsedRealtime();
                    p.this.j = true;
                    p.this.F.setVisibility(0);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(400L);
                    alphaAnimation.setRepeatCount(0);
                    p.this.F.startAnimation(alphaAnimation);
                    if (!p.this.n() || p.this.G == null) {
                        return;
                    }
                    p.this.G.setVisibility(0);
                    p.this.G.bringToFront();
                } catch (Throwable th) {
                    com.applovin.impl.sdk.r rVar = p.this.logger;
                    rVar.d("InterActivity", "Unable to show skip button: " + th);
                }
            }
        });
    }

    private void p() {
        j jVar;
        if (this.currentAd.s() >= 0) {
            if (!this.k || (jVar = this.F) == null) {
                jVar = this.D;
            }
            a(Utils.secondsToMillisLong((float) this.currentAd.s()), jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        boolean z = ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.ch)).booleanValue() && t() > 0;
        if (this.H == null && z) {
            this.H = new h(this);
            int G = this.currentAd.G();
            this.H.setTextColor(G);
            this.H.setTextSize(((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cg)).intValue());
            this.H.setFinishedStrokeColor(G);
            this.H.setFinishedStrokeWidth(((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cf)).intValue());
            this.H.setMax(t());
            this.H.setProgress(t());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.ce)).intValue()), a(((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.ce)).intValue()), ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cd)).intValue());
            int a = a(((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cc)).intValue());
            layoutParams.setMargins(a, a, a, a);
            this.C.addView(this.H, layoutParams);
            this.H.bringToFront();
            this.H.setVisibility(0);
            final long s = s();
            this.countdownManager.a("COUNTDOWN_CLOCK", 1000L, new k.a() { // from class: com.applovin.impl.adview.p.11
                @Override // com.applovin.impl.adview.k.a
                public void a() {
                    if (p.this.H != null) {
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(s - p.this.videoView.getCurrentPosition());
                        if (seconds <= 0) {
                            p.this.H.setVisibility(8);
                            p.this.n = true;
                        } else if (p.this.r()) {
                            p.this.H.setProgress((int) seconds);
                        }
                    }
                }

                @Override // com.applovin.impl.adview.k.a
                public boolean b() {
                    return p.this.r();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r() {
        return (this.n || this.postitialWasDisplayed || !this.videoView.isPlaying()) ? false : true;
    }

    private long s() {
        return TimeUnit.SECONDS.toMillis(t());
    }

    private int t() {
        int F = this.currentAd.F();
        return (F <= 0 && ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cG)).booleanValue()) ? this.computedLengthSeconds + 1 : F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.M == null && this.currentAd.N()) {
            this.logger.c("InterActivity", "Attaching video progress bar...");
            ProgressBar progressBar = new ProgressBar(this, null, 16842872);
            this.M = progressBar;
            progressBar.setMax(((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cB)).intValue());
            this.M.setPadding(0, 0, 0, 0);
            if (com.applovin.impl.sdk.utils.f.d()) {
                try {
                    this.M.setProgressTintList(ColorStateList.valueOf(this.currentAd.O()));
                } catch (Throwable th) {
                    this.logger.b("InterActivity", "Unable to update progress bar color.", th);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.videoView.getWidth(), 20, 80);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cC)).intValue());
            this.C.addView(this.M, layoutParams);
            this.M.bringToFront();
            this.countdownManager.a("PROGRESS_BAR", ((Long) this.sdk.a(com.applovin.impl.sdk.c.b.cA)).longValue(), new k.a() { // from class: com.applovin.impl.adview.p.13
                @Override // com.applovin.impl.adview.k.a
                public void a() {
                    if (p.this.M != null) {
                        if (!p.this.shouldContinueFullLengthVideoCountdown()) {
                            p.this.M.setVisibility(8);
                            return;
                        }
                        p.this.M.setProgress((int) ((p.this.videoView.getCurrentPosition() / p.this.videoView.getDuration()) * ((Integer) p.this.sdk.a(com.applovin.impl.sdk.c.b.cB)).intValue()));
                    }
                }

                @Override // com.applovin.impl.adview.k.a
                public boolean b() {
                    return p.this.shouldContinueFullLengthVideoCountdown();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        final u C = this.currentAd.C();
        if (StringUtils.isValidString(this.currentAd.B()) && C != null && this.L == null) {
            this.logger.c("InterActivity", "Attaching video button...");
            this.L = w();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) ((C.a() / 100.0d) * this.videoView.getWidth()), (int) ((C.b() / 100.0d) * this.videoView.getHeight()), C.d());
            int a = a(C.c());
            layoutParams.setMargins(a, a, a, a);
            this.C.addView(this.L, layoutParams);
            this.L.bringToFront();
            if (C.i() > 0.0f) {
                this.L.setVisibility(4);
                this.B.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.p.14
                    @Override // java.lang.Runnable
                    public void run() {
                        long g = C.g();
                        p pVar = p.this;
                        pVar.a((View) pVar.L, true, g);
                        p.this.L.bringToFront();
                    }
                }, Utils.secondsToMillisLong(C.i()));
            }
            if (C.j() > 0.0f) {
                this.B.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.p.15
                    @Override // java.lang.Runnable
                    public void run() {
                        long h = C.h();
                        p pVar = p.this;
                        pVar.a((View) pVar.L, false, h);
                    }
                }, Utils.secondsToMillisLong(C.j()));
            }
        }
    }

    private v w() {
        com.applovin.impl.sdk.r rVar = this.logger;
        rVar.b("InterActivity", "Create video button with HTML = " + this.currentAd.B());
        w wVar = new w(this.sdk);
        this.N = new w.a() { // from class: com.applovin.impl.adview.p.16
            @Override // com.applovin.impl.adview.w.a
            public void a(v vVar) {
                p.this.logger.b("InterActivity", "Clicking through from video button...");
                p.this.clickThroughFromVideo(vVar.getAndClearLastClickLocation());
            }

            @Override // com.applovin.impl.adview.w.a
            public void b(v vVar) {
                p.this.logger.b("InterActivity", "Closing ad from video button...");
                p.this.dismiss();
            }

            @Override // com.applovin.impl.adview.w.a
            public void c(v vVar) {
                p.this.logger.b("InterActivity", "Skipping video from video button...");
                p.this.skipVideo();
            }
        };
        wVar.a(new WeakReference<>(this.N));
        v vVar = new v(wVar, getApplicationContext());
        vVar.a(this.currentAd.B());
        return vVar;
    }

    private void x() {
        if (this.l) {
            a aVar = new a(this, ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cF)).intValue(), 16842874);
            this.O = aVar;
            aVar.setColor(Color.parseColor("#75FFFFFF"));
            this.O.setBackgroundColor(Color.parseColor("#00000000"));
            this.O.setVisibility(8);
            this.C.addView(this.O, new FrameLayout.LayoutParams(-1, -1, 17));
            this.C.bringChildToFront(this.O);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        a aVar = this.O;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        a aVar = this.O;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void clickThroughFromVideo(PointF pointF) {
        try {
            this.sdk.t().trackAndLaunchVideoClick(this.currentAd, this.a, this.currentAd.k(), pointF);
            com.applovin.impl.sdk.utils.i.a(this.b.e(), this.currentAd);
            if (this.c != null) {
                this.c.b();
            }
        } catch (Throwable th) {
            this.sdk.z().b("InterActivity", "Encountered error while clicking through video.", th);
        }
    }

    public void continueVideo() {
        O();
    }

    @Override // com.applovin.impl.adview.l
    public void dismiss() {
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        com.applovin.impl.sdk.r.f("InterActivity", "Dismissing ad after " + currentTimeMillis + " milliseconds elapsed");
        com.applovin.impl.sdk.k kVar = this.sdk;
        if (kVar != null) {
            if (((Boolean) kVar.a(com.applovin.impl.sdk.c.b.cq)).booleanValue()) {
                stopService(new Intent(getBaseContext(), AppKilledService.class));
                this.sdk.ai().unregisterReceiver(this.R);
            }
            this.sdk.ah().b(this);
        }
        g();
        P();
        if (this.b != null) {
            if (this.currentAd != null) {
                c(this.currentAd);
                com.applovin.impl.sdk.d.d dVar = this.c;
                if (dVar != null) {
                    dVar.c();
                    this.c = null;
                }
                a("javascript:al_onPoststitialDismiss();", this.currentAd.S());
            }
            this.b.g();
        }
        lastKnownWrapper = null;
        d();
    }

    public void exitWithError(String str) {
        a(str);
        try {
            com.applovin.impl.sdk.r.c("InterActivity", "Failed to properly render an Interstitial Activity, due to error: " + str, new Throwable("Initialized = " + q.b + "; CleanedUp = " + q.c));
            c(new com.applovin.impl.sdk.a.h(this.currentAd != null ? this.currentAd.getAdZone() : com.applovin.impl.sdk.a.d.a(str), this.sdk));
        } catch (Exception e) {
            com.applovin.impl.sdk.r.c("InterActivity", "Failed to show a video ad due to error:", e);
        }
        dismiss();
    }

    public boolean getPostitialWasDisplayed() {
        return this.postitialWasDisplayed;
    }

    public int getVideoPercentViewed() {
        if (this.d) {
            return 100;
        }
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            int duration = appLovinVideoView.getDuration();
            return duration > 0 ? (int) ((this.videoView.getCurrentPosition() / duration) * 100.0d) : this.t;
        }
        this.logger.e("InterActivity", "No video view detected on video end");
        return 0;
    }

    public void handleMediaError(String str) {
        this.logger.e("InterActivity", str);
        if (this.v.compareAndSet(false, true)) {
            a(str);
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isFullyWatched() {
        return getVideoPercentViewed() >= this.currentAd.P();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isVastAd() {
        return this.currentAd instanceof com.applovin.impl.a.a;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        j jVar;
        if (this.currentAd != null) {
            if (this.currentAd.aC() && !this.postitialWasDisplayed) {
                return;
            }
            if (this.currentAd.aD() && this.postitialWasDisplayed) {
                return;
            }
        }
        if (c()) {
            this.logger.b("InterActivity", "Back button was pressed; forwarding to Android for handling...");
        } else {
            try {
                if (!this.postitialWasDisplayed && this.k && this.F != null && this.F.getVisibility() == 0 && this.F.getAlpha() > 0.0f) {
                    this.logger.b("InterActivity", "Back button was pressed; forwarding as a click to skip button.");
                    jVar = this.F;
                } else if (this.D == null || this.D.getVisibility() != 0 || this.D.getAlpha() <= 0.0f) {
                    this.logger.b("InterActivity", "Back button was pressed, but was not eligible for dismissal.");
                    b("javascript:al_onBackPressed();");
                    return;
                } else {
                    this.logger.b("InterActivity", "Back button was pressed; forwarding as a click to close button.");
                    jVar = this.D;
                }
                jVar.performClick();
                b("javascript:al_onBackPressed();");
                return;
            } catch (Exception unused) {
            }
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d2  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.p.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (r4.currentAd != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (r4.currentAd == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
        P();
        c(r4.currentAd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
        super.onDestroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
        return;
     */
    /* JADX WARN: Finally extract failed */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDestroy() {
        /*
            r4 = this;
            com.applovin.impl.adview.o r0 = r4.a     // Catch: java.lang.Throwable -> L67
            r1 = 0
            if (r0 == 0) goto L1d
            com.applovin.impl.adview.o r0 = r4.a     // Catch: java.lang.Throwable -> L67
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Throwable -> L67
            boolean r2 = r0 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L16
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L67
            com.applovin.impl.adview.o r2 = r4.a     // Catch: java.lang.Throwable -> L67
            r0.removeView(r2)     // Catch: java.lang.Throwable -> L67
        L16:
            com.applovin.impl.adview.o r0 = r4.a     // Catch: java.lang.Throwable -> L67
            r0.destroy()     // Catch: java.lang.Throwable -> L67
            r4.a = r1     // Catch: java.lang.Throwable -> L67
        L1d:
            com.applovin.impl.adview.AppLovinVideoView r0 = r4.videoView     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L2b
            com.applovin.impl.adview.AppLovinVideoView r0 = r4.videoView     // Catch: java.lang.Throwable -> L67
            r0.pause()     // Catch: java.lang.Throwable -> L67
            com.applovin.impl.adview.AppLovinVideoView r0 = r4.videoView     // Catch: java.lang.Throwable -> L67
            r0.stopPlayback()     // Catch: java.lang.Throwable -> L67
        L2b:
            com.applovin.impl.sdk.k r0 = r4.sdk     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L47
            java.lang.ref.WeakReference<android.media.MediaPlayer> r0 = r4.J     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L67
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L3c
            r0.release()     // Catch: java.lang.Throwable -> L67
        L3c:
            com.applovin.impl.sdk.k r0 = r4.sdk     // Catch: java.lang.Throwable -> L67
            com.applovin.impl.sdk.a r0 = r0.ad()     // Catch: java.lang.Throwable -> L67
            com.applovin.impl.sdk.utils.a r2 = r4.Q     // Catch: java.lang.Throwable -> L67
            r0.b(r2)     // Catch: java.lang.Throwable -> L67
        L47:
            com.applovin.impl.adview.k r0 = r4.countdownManager     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L50
            com.applovin.impl.adview.k r0 = r4.countdownManager     // Catch: java.lang.Throwable -> L67
            r0.b()     // Catch: java.lang.Throwable -> L67
        L50:
            android.os.Handler r0 = r4.B     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L59
            android.os.Handler r0 = r4.B     // Catch: java.lang.Throwable -> L67
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L67
        L59:
            android.os.Handler r0 = r4.A     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L62
            android.os.Handler r0 = r4.A     // Catch: java.lang.Throwable -> L67
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L67
        L62:
            com.applovin.impl.sdk.a.g r0 = r4.currentAd
            if (r0 == 0) goto L81
            goto L79
        L67:
            r0 = move-exception
            com.applovin.impl.sdk.r r1 = r4.logger     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L75
            com.applovin.impl.sdk.r r1 = r4.logger     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "InterActivity"
            java.lang.String r3 = "Unable to destroy video view"
            r1.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L85
        L75:
            com.applovin.impl.sdk.a.g r0 = r4.currentAd
            if (r0 == 0) goto L81
        L79:
            r4.P()
            com.applovin.impl.sdk.a.g r0 = r4.currentAd
            r4.c(r0)
        L81:
            super.onDestroy()
            return
        L85:
            r0 = move-exception
            com.applovin.impl.sdk.a.g r1 = r4.currentAd
            if (r1 == 0) goto L92
            r4.P()
            com.applovin.impl.sdk.a.g r1 = r4.currentAd
            r4.c(r1)
        L92:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.p.onDestroy():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.logger.b("InterActivity", "App paused...");
        this.p = System.currentTimeMillis();
        if (this.postitialWasDisplayed) {
            M();
        }
        this.K.a();
        pauseReportRewardTask();
        b("javascript:al_onAppPaused();");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (r2 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
        a(0, r0);
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r5 = this;
            super.onResume()     // Catch: java.lang.IllegalArgumentException -> Lb7
            com.applovin.impl.sdk.r r0 = r5.logger
            java.lang.String r1 = "InterActivity"
            java.lang.String r2 = "App resumed..."
            r0.b(r1, r2)
            boolean r0 = r5.m
            if (r0 != 0) goto L9e
            com.applovin.impl.sdk.d.d r0 = r5.c
            if (r0 == 0) goto L1e
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r5.p
            long r1 = r1 - r3
            r0.d(r1)
        L1e:
            com.applovin.impl.sdk.k r0 = r5.sdk
            com.applovin.impl.sdk.c.d<java.lang.Boolean> r1 = com.applovin.impl.sdk.c.d.v
            r2 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.b(r1, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 0
            if (r0 == 0) goto L68
            com.applovin.impl.sdk.b.b r0 = r5.K
            boolean r0 = r0.d()
            if (r0 != 0) goto L68
            boolean r0 = r5.postitialWasDisplayed
            if (r0 != 0) goto L68
            r5.N()
            r5.y()
            com.applovin.impl.sdk.a.g r0 = r5.currentAd
            if (r0 == 0) goto L9a
            com.applovin.impl.sdk.k r0 = r5.sdk
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.c.b.cb
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9a
            boolean r0 = r5.postitialWasDisplayed
            if (r0 != 0) goto L9a
            boolean r0 = r5.k
            if (r0 == 0) goto L9a
            com.applovin.impl.adview.j r0 = r5.F
            if (r0 == 0) goto L9a
            goto L97
        L68:
            com.applovin.impl.sdk.a.g r0 = r5.currentAd
            boolean r0 = r0 instanceof com.applovin.impl.sdk.a.a
            if (r0 == 0) goto L79
            com.applovin.impl.sdk.a.g r0 = r5.currentAd
            com.applovin.impl.sdk.a.a r0 = (com.applovin.impl.sdk.a.a) r0
            boolean r0 = r0.m()
            if (r0 == 0) goto L79
            r2 = 1
        L79:
            com.applovin.impl.sdk.a.g r0 = r5.currentAd
            if (r0 == 0) goto L9a
            com.applovin.impl.sdk.k r0 = r5.sdk
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.c.b.cb
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9a
            boolean r0 = r5.postitialWasDisplayed
            if (r0 == 0) goto L9a
            com.applovin.impl.adview.j r0 = r5.D
            if (r0 == 0) goto L9a
            if (r2 != 0) goto L9a
        L97:
            r5.a(r3, r0)
        L9a:
            r5.resumeReportRewardTask()
            goto Lb1
        L9e:
            com.applovin.impl.sdk.b.b r0 = r5.K
            boolean r0 = r0.d()
            if (r0 != 0) goto Lb1
            boolean r0 = r5.postitialWasDisplayed
            if (r0 != 0) goto Lb1
            com.applovin.impl.sdk.a.g r0 = r5.currentAd
            if (r0 == 0) goto Lb1
            r5.y()
        Lb1:
            java.lang.String r0 = "javascript:al_onAppResumed();"
            r5.b(r0)
            return
        Lb7:
            java.lang.String r0 = "Error was encountered in onResume()."
            r5.exitWithError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.p.onResume():void");
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onRingerModeChanged(int i) {
        String str;
        if (this.y != com.applovin.impl.sdk.f.a) {
            this.z = true;
        }
        d s = this.a.getAdViewController().s();
        if (s != null) {
            if (!com.applovin.impl.sdk.f.a(i) || com.applovin.impl.sdk.f.a(this.y)) {
                str = i == 2 ? "javascript:al_muteSwitchOff();" : "javascript:al_muteSwitchOff();";
            } else {
                str = "javascript:al_muteSwitchOn();";
            }
            s.a(str);
        }
        this.y = i;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("instance_impression_tracked", this.w.get());
        bundle.putInt("original_orientation", this.u);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        String str;
        super.onWindowFocusChanged(z);
        com.applovin.impl.sdk.k kVar = this.sdk;
        if (z) {
            if (kVar != null) {
                this.logger.b("InterActivity", "Window gained focus");
                try {
                    if (com.applovin.impl.sdk.utils.f.c() && ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cz)).booleanValue() && a()) {
                        b();
                        this.B.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.p.24
                            @Override // java.lang.Runnable
                            public void run() {
                                p.this.b();
                            }
                        }, 2500L);
                    } else {
                        getWindow().setFlags(1024, 1024);
                    }
                    if (!this.postitialWasDisplayed) {
                        N();
                        resumeReportRewardTask();
                    }
                } catch (Throwable th) {
                    this.logger.b("InterActivity", "Setting window flags failed.", th);
                }
                this.m = false;
                b("javascript:al_onWindowFocusChanged( " + z + " );");
            }
            str = "Window gained focus. SDK is null.";
        } else if (kVar != null) {
            this.logger.b("InterActivity", "Window lost focus");
            if (!this.postitialWasDisplayed) {
                M();
                pauseReportRewardTask();
            }
            this.m = false;
            b("javascript:al_onWindowFocusChanged( " + z + " );");
        } else {
            str = "Window lost focus. SDK is null.";
        }
        com.applovin.impl.sdk.r.f("InterActivity", str);
        this.m = false;
        b("javascript:al_onWindowFocusChanged( " + z + " );");
    }

    public void pauseReportRewardTask() {
        com.applovin.impl.sdk.utils.m mVar = this.P;
        if (mVar != null) {
            mVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void playVideo() {
        d(this.currentAd);
        this.videoView.start();
        this.countdownManager.a();
    }

    public void resumeReportRewardTask() {
        com.applovin.impl.sdk.utils.m mVar = this.P;
        if (mVar != null) {
            mVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean shouldContinueFullLengthVideoCountdown() {
        return (this.d || this.postitialWasDisplayed) ? false : true;
    }

    public void showPostitial() {
        try {
            K();
            if (this.a != null) {
                ViewParent parent = this.a.getParent();
                if ((parent instanceof ViewGroup) && (!((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.eD)).booleanValue() || parent != this.C)) {
                    ((ViewGroup) parent).removeView(this.a);
                }
                FrameLayout frameLayout = ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.eD)).booleanValue() ? this.C : new FrameLayout(this);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setBackgroundColor(this.currentAd.H());
                if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.eD)).booleanValue()) {
                    this.a.setVisibility(0);
                } else {
                    frameLayout.addView(this.a);
                }
                if (this.C != null) {
                    if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.eD)).booleanValue()) {
                        com.applovin.impl.sdk.utils.b.a(this.C, this.a);
                    } else {
                        this.C.removeAllViewsInLayout();
                    }
                }
                if (n() && this.E != null) {
                    if (this.E.getParent() instanceof ViewGroup) {
                        ((ViewGroup) this.E.getParent()).removeView(this.E);
                    }
                    frameLayout.addView(this.E);
                    this.E.bringToFront();
                }
                if (this.D != null) {
                    ViewParent parent2 = this.D.getParent();
                    if (parent2 instanceof ViewGroup) {
                        ((ViewGroup) parent2).removeView(this.D);
                    }
                    frameLayout.addView(this.D);
                    this.D.bringToFront();
                }
                if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.eD)).booleanValue()) {
                    setContentView(frameLayout);
                }
                if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()) {
                    this.a.setVisibility(4);
                    this.a.setVisibility(0);
                }
                a("javascript:al_onPoststitialShow();", this.currentAd.R());
            }
            if ((this.currentAd instanceof com.applovin.impl.sdk.a.a) && ((com.applovin.impl.sdk.a.a) this.currentAd).m()) {
                this.logger.b("InterActivity", "Skip showing of close button");
            } else if (this.currentAd.u() >= 0) {
                a(Utils.secondsToMillisLong((float) this.currentAd.u()), this.D);
            } else if (this.currentAd.u() == -2) {
                this.D.setVisibility(0);
            } else {
                a(0L, this.D);
            }
            this.postitialWasDisplayed = true;
        } catch (Throwable th) {
            this.logger.b("InterActivity", "Encountered error while showing postitial. Dismissing...", th);
            dismiss();
        }
    }

    public void skipVideo() {
        this.s = SystemClock.elapsedRealtime() - this.r;
        com.applovin.impl.sdk.d.d dVar = this.c;
        if (dVar != null) {
            dVar.f();
        }
        if (this.currentAd.x()) {
            dismiss();
        } else {
            showPostitial();
        }
    }

    public void toggleMute() {
        boolean z = !L();
        try {
            c(z);
            a(z);
            b(z);
        } catch (Throwable th) {
            this.logger.b("InterActivity", "Unable to set volume to " + z, th);
        }
    }
}
