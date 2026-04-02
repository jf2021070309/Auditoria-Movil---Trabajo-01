package com.applovin.impl.adview.activity.b;

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
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.adview.k;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.u;
import com.applovin.impl.adview.v;
import com.applovin.impl.adview.w;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.y;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.o;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.vungle.warren.AdLoader;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class f extends com.applovin.impl.adview.activity.b.a implements AppLovinCommunicatorSubscriber {
    private final ImageView A;
    private final v B;
    private final ProgressBar C;
    private final b D;
    private final a E;
    private final Handler F;
    private final boolean G;
    private int H;
    private int I;
    private boolean J;
    private AtomicBoolean K;
    private AtomicBoolean L;
    private long M;
    private long N;
    protected final AppLovinVideoView r;
    protected final k s;
    protected boolean t;
    protected long u;
    protected boolean v;
    private final com.applovin.impl.adview.activity.a.c w;
    private MediaPlayer x;
    private final com.applovin.impl.adview.a y;
    private final n z;

    /* loaded from: classes.dex */
    private class a implements w.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.w.a
        public void a(v vVar) {
            f.this.c.b("InterActivityV2", "Clicking through from video button...");
            f.this.a(vVar.getAndClearLastClickLocation());
        }

        @Override // com.applovin.impl.adview.w.a
        public void b(v vVar) {
            f.this.c.b("InterActivityV2", "Closing ad from video button...");
            f.this.g();
        }

        @Override // com.applovin.impl.adview.w.a
        public void c(v vVar) {
            f.this.c.b("InterActivityV2", "Skipping video from video button...");
            f.this.u();
        }
    }

    /* loaded from: classes.dex */
    private class b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private b() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            f.this.a(pointF);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            f.this.c.b("InterActivityV2", "Video completed");
            f.this.J = true;
            f.this.w();
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            f fVar = f.this;
            fVar.c("Video view error (" + i + "," + i2 + ")");
            f.this.r.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            r rVar = f.this.c;
            rVar.b("InterActivityV2", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            if (i == 701) {
                if (f.this.y != null) {
                    f.this.y.a();
                }
                f.this.e.g();
                return false;
            } else if (i != 3) {
                if (i != 702 || f.this.y == null) {
                    return false;
                }
                f.this.y.b();
                return false;
            } else {
                f.this.s.a();
                if (f.this.z != null) {
                    f.this.y();
                }
                if (f.this.y != null) {
                    f.this.y.b();
                }
                if (f.this.o.d()) {
                    f.this.c();
                    return false;
                }
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            f.this.x = mediaPlayer;
            mediaPlayer.setOnInfoListener(f.this.D);
            mediaPlayer.setOnErrorListener(f.this.D);
            float f = !f.this.t ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            f.this.u = mediaPlayer.getDuration();
            f.this.s();
            f.this.c.b("InterActivityV2", "MediaPlayer prepared: " + f.this.x);
        }
    }

    /* loaded from: classes.dex */
    private class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == f.this.z) {
                if (!f.this.q()) {
                    f.this.u();
                    return;
                }
                f.this.c();
                f.this.n();
                f.this.o.b();
            } else if (view == f.this.A) {
                f.this.v();
            } else {
                r rVar = f.this.c;
                rVar.e("InterActivityV2", "Unhandled click on widget: " + view);
            }
        }
    }

    public f(com.applovin.impl.sdk.a.g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(gVar, appLovinFullscreenActivity, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.w = new com.applovin.impl.adview.activity.a.c(this.a, this.d, this.b);
        this.D = new b();
        this.E = new a();
        this.F = new Handler(Looper.getMainLooper());
        this.s = new k(this.F, this.b);
        this.G = this.a.f();
        this.t = t();
        this.I = -1;
        this.K = new AtomicBoolean();
        this.L = new AtomicBoolean();
        this.M = -2L;
        this.N = 0L;
        if (!gVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(appLovinFullscreenActivity, kVar);
        this.r = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(this.D);
        this.r.setOnCompletionListener(this.D);
        this.r.setOnErrorListener(this.D);
        this.r.setOnTouchListener(new AppLovinTouchToClickListener(kVar, com.applovin.impl.sdk.c.b.aJ, appLovinFullscreenActivity, this.D));
        c cVar = new c();
        if (gVar.s() >= 0) {
            n nVar = new n(gVar.w(), appLovinFullscreenActivity);
            this.z = nVar;
            nVar.setVisibility(8);
            this.z.setOnClickListener(cVar);
        } else {
            this.z = null;
        }
        if (a(this.t, kVar)) {
            ImageView imageView = new ImageView(appLovinFullscreenActivity);
            this.A = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.A.setClickable(true);
            this.A.setOnClickListener(cVar);
            e(this.t);
        } else {
            this.A = null;
        }
        String B = gVar.B();
        if (StringUtils.isValidString(B)) {
            w wVar = new w(kVar);
            wVar.a(new WeakReference<>(this.E));
            v vVar = new v(wVar, appLovinFullscreenActivity);
            this.B = vVar;
            vVar.a(B);
        } else {
            this.B = null;
        }
        if (this.G) {
            com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(appLovinFullscreenActivity, ((Integer) kVar.a(com.applovin.impl.sdk.c.b.cF)).intValue(), 16842874);
            this.y = aVar;
            aVar.setColor(Color.parseColor("#75FFFFFF"));
            this.y.setBackgroundColor(Color.parseColor("#00000000"));
            this.y.setVisibility(8);
            AppLovinCommunicator.getInstance(appLovinFullscreenActivity).subscribe(this, "video_caching_failed");
        } else {
            this.y = null;
        }
        if (!gVar.N()) {
            this.C = null;
            return;
        }
        ProgressBar progressBar = new ProgressBar(appLovinFullscreenActivity, null, 16842872);
        this.C = progressBar;
        progressBar.setMax(10000);
        this.C.setPadding(0, 0, 0, 0);
        if (com.applovin.impl.sdk.utils.f.d()) {
            this.C.setProgressTintList(ColorStateList.valueOf(gVar.O()));
        }
        this.s.a("PROGRESS_BAR", ((Long) kVar.a(com.applovin.impl.sdk.c.b.cA)).longValue(), new k.a() { // from class: com.applovin.impl.adview.activity.b.f.1
            @Override // com.applovin.impl.adview.k.a
            public void a() {
                if (f.this.v) {
                    f.this.C.setVisibility(8);
                    return;
                }
                f.this.C.setProgress((int) ((f.this.r.getCurrentPosition() / ((float) f.this.u)) * 10000.0f));
            }

            @Override // com.applovin.impl.adview.k.a
            public boolean b() {
                return !f.this.v;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        r rVar;
        String str;
        if (this.v) {
            rVar = this.c;
            str = "Skip video resume - postitial shown";
        } else if (!this.b.ab().a()) {
            if (this.I < 0) {
                this.c.b("InterActivityV2", "Invalid last video position");
                return;
            }
            r rVar2 = this.c;
            rVar2.b("InterActivityV2", "Resuming video at position " + this.I + "ms for MediaPlayer: " + this.x);
            this.r.seekTo(this.I);
            this.r.start();
            this.s.a();
            this.I = -1;
            a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.7
                @Override // java.lang.Runnable
                public void run() {
                    if (f.this.y != null) {
                        f.this.y.a();
                        f.this.a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                f.this.y.b();
                            }
                        }, AdLoader.RETRY_DELAY);
                    }
                }
            }, 250L);
            return;
        } else {
            rVar = this.c;
            str = "Skip video resume - app paused";
        }
        rVar.d("InterActivityV2", str);
    }

    private static boolean a(boolean z, com.applovin.impl.sdk.k kVar) {
        if (((Boolean) kVar.a(com.applovin.impl.sdk.c.b.cr)).booleanValue()) {
            if (!((Boolean) kVar.a(com.applovin.impl.sdk.c.b.cs)).booleanValue() || z) {
                return true;
            }
            return ((Boolean) kVar.a(com.applovin.impl.sdk.c.b.cu)).booleanValue();
        }
        return false;
    }

    private void d(boolean z) {
        this.H = x();
        if (z) {
            this.r.pause();
        } else {
            this.r.stopPlayback();
        }
    }

    private void e(boolean z) {
        if (com.applovin.impl.sdk.utils.f.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.d.getDrawable(z ? R.drawable.unmute_to_mute : R.drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.A.setScaleType(ImageView.ScaleType.FIT_XY);
                this.A.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aE = z ? this.a.aE() : this.a.aF();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.A.setImageURI(aE);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (this.L.compareAndSet(false, true)) {
            a(this.z, this.a.s(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.4
                @Override // java.lang.Runnable
                public void run() {
                    f.this.M = -1L;
                    f.this.N = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    private void z() {
        v vVar;
        u C = this.a.C();
        if (C == null || !C.e() || this.v || (vVar = this.B) == null) {
            return;
        }
        final boolean z = vVar.getVisibility() == 4;
        final long f = C.f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    o.a(f.this.B, f, (Runnable) null);
                } else {
                    o.b(f.this.B, f, null);
                }
            }
        });
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        this.c.b("InterActivityV2", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(PointF pointF) {
        if (!this.a.D()) {
            z();
            return;
        }
        this.c.b("InterActivityV2", "Clicking through video");
        Uri k = this.a.k();
        if (k != null) {
            i.a(this.l, this.a);
            this.b.t().trackAndLaunchVideoClick(this.a, this.f, k, pointF);
            this.e.b();
        }
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        this.c.b("InterActivityV2", "Skipping video from prompt");
        u();
    }

    public void b(long j) {
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.6
            @Override // java.lang.Runnable
            public void run() {
                f.this.A();
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.c.b("InterActivityV2", "Pausing video");
        this.I = this.r.getCurrentPosition();
        this.r.pause();
        this.s.c();
        r rVar = this.c;
        rVar.b("InterActivityV2", "Paused video at position " + this.I + "ms");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str) {
        r rVar = this.c;
        rVar.e("InterActivityV2", "Encountered media error: " + str + " for ad: " + this.a);
        if (this.K.compareAndSet(false, true)) {
            if (this.m instanceof com.applovin.impl.sdk.a.i) {
                ((com.applovin.impl.sdk.a.i) this.m).onAdDisplayFailed(str);
            }
            g();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void c(boolean z) {
        super.c(z);
        if (z) {
            b(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.eN)).booleanValue() ? 0L : 250L);
        } else if (this.v) {
        } else {
            c();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        this.w.a(this.A, this.z, this.B, this.y, this.C, this.r, this.f);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        a(!this.G);
        this.r.setVideoURI(this.a.h());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.a.am()) {
            this.o.a(this.a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.2
                @Override // java.lang.Runnable
                public void run() {
                    f.this.b(250L);
                }
            });
        }
        this.r.start();
        if (this.G) {
            this.y.a();
        }
        this.f.renderAd(this.a);
        this.e.b(this.G ? 1L : 0L);
        if (this.z != null) {
            this.b.Q().a((com.applovin.impl.sdk.e.a) new y(this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.3
                @Override // java.lang.Runnable
                public void run() {
                    f.this.y();
                }
            }), o.a.MAIN, this.a.t(), true);
        }
        super.b(this.t);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        this.s.b();
        this.F.removeCallbacksAndMessages(null);
        l();
        super.g();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void i() {
        this.c.c("InterActivityV2", "Destroying video components");
        try {
            if (this.G) {
                AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
            }
            if (this.r != null) {
                this.r.pause();
                this.r.stopPlayback();
            }
            if (this.x != null) {
                this.x.release();
            }
        } catch (Throwable th) {
            Log.e("InterActivityV2", "Unable to destroy presenter", th);
        }
        super.i();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void l() {
        super.a(x(), this.G, p(), this.M);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.eO)).booleanValue() && j == this.a.getAdIdNumber() && this.G) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.J || this.r.isPlaying()) {
                    return;
                }
                c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.adview.activity.b.a
    public boolean p() {
        return x() >= this.a.P();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean q() {
        return r() && !p();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void s() {
        long ad;
        long millis;
        if (this.a.ac() >= 0 || this.a.ad() >= 0) {
            if (this.a.ac() >= 0) {
                ad = this.a.ac();
            } else {
                com.applovin.impl.sdk.a.a aVar = (com.applovin.impl.sdk.a.a) this.a;
                long j = this.u;
                long j2 = j > 0 ? 0 + j : 0L;
                if (aVar.ae()) {
                    int l = (int) ((com.applovin.impl.sdk.a.a) this.a).l();
                    if (l > 0) {
                        millis = TimeUnit.SECONDS.toMillis(l);
                    } else {
                        int u = (int) aVar.u();
                        if (u > 0) {
                            millis = TimeUnit.SECONDS.toMillis(u);
                        }
                    }
                    j2 += millis;
                }
                ad = (long) (j2 * (this.a.ad() / 100.0d));
            }
            a(ad);
        }
    }

    public void u() {
        this.M = SystemClock.elapsedRealtime() - this.N;
        r rVar = this.c;
        rVar.b("InterActivityV2", "Skipping video with skip time: " + this.M + "ms");
        this.e.f();
        if (this.a.x()) {
            g();
        } else {
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
        if (this.x == null) {
            return;
        }
        try {
            float f = !this.t ? 0 : 1;
            this.x.setVolume(f, f);
            boolean z = this.t ? false : true;
            this.t = z;
            e(z);
            a(this.t, 0L);
        } catch (Throwable unused) {
        }
    }

    public void w() {
        this.c.b("InterActivityV2", "Showing postitial...");
        d(this.a.aM());
        this.w.a(this.g, this.f);
        a("javascript:al_onPoststitialShow();", this.a.R());
        if (this.g != null) {
            if (this.a.u() >= 0) {
                a(this.g, this.a.u(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8
                    @Override // java.lang.Runnable
                    public void run() {
                        f.this.i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.g.setVisibility(0);
            }
        }
        this.v = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int x() {
        long currentPosition = this.r.getCurrentPosition();
        if (this.J) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.u)) * 100.0f) : this.H;
    }
}
