package com.applovin.impl.adview.activity.b;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
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
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class e extends com.applovin.impl.adview.activity.b.a implements AppLovinCommunicatorSubscriber {
    private final com.applovin.impl.adview.a A;
    private final n B;
    private final ImageView C;
    private final v D;
    private final ProgressBar E;
    private final a F;
    private final Handler G;
    private final boolean H;
    private long I;
    private AtomicBoolean J;
    private AtomicBoolean K;
    private long L;
    private long M;
    protected final PlayerView r;
    protected final SimpleExoPlayer s;
    protected final k t;
    protected boolean u;
    protected long v;
    protected int w;
    protected boolean x;
    protected boolean y;
    private final com.applovin.impl.adview.activity.a.c z;

    /* loaded from: classes.dex */
    private class a implements w.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.w.a
        public void a(v vVar) {
            e.this.c.b("InterActivityV2", "Clicking through from video button...");
            e.this.a(vVar.getAndClearLastClickLocation());
        }

        @Override // com.applovin.impl.adview.w.a
        public void b(v vVar) {
            e.this.c.b("InterActivityV2", "Closing ad from video button...");
            e.this.g();
        }

        @Override // com.applovin.impl.adview.w.a
        public void c(v vVar) {
            e.this.c.b("InterActivityV2", "Skipping video from video button...");
            e.this.u();
        }
    }

    /* loaded from: classes.dex */
    private class b implements AppLovinTouchToClickListener.OnClickListener, Player.EventListener, PlayerControlView.VisibilityListener {
        private b() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            e.this.a(pointF);
        }

        public void onPlaybackStateChanged(int i) {
            r rVar = e.this.c;
            rVar.b("InterActivityV2", "Player state changed to state " + i + " and will play when ready: " + e.this.s.getPlayWhenReady());
            if (i == 2) {
                if (e.this.A != null) {
                    e.this.A.a();
                }
                e.this.e.g();
            } else if (i != 3) {
                if (i == 4) {
                    e.this.c.b("InterActivityV2", "Video completed");
                    e.this.y = true;
                    e.this.w();
                }
            } else {
                e.this.s.setVolume(!e.this.u ? 1 : 0);
                e eVar = e.this;
                eVar.v = eVar.s.getDuration();
                e.this.s();
                r rVar2 = e.this.c;
                rVar2.b("InterActivityV2", "MediaPlayer prepared: " + e.this.s);
                e.this.t.a();
                if (e.this.B != null) {
                    e.this.y();
                }
                if (e.this.A != null) {
                    e.this.A.b();
                }
                if (e.this.o.d()) {
                    e.this.c();
                }
            }
        }

        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            e eVar = e.this;
            eVar.c("Video view error (" + exoPlaybackException + ")");
            e.this.g();
        }

        public void onVisibilityChange(int i) {
            if (i == 0) {
                e.this.r.hideController();
            }
        }
    }

    /* loaded from: classes.dex */
    private class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == e.this.B) {
                if (!e.this.q()) {
                    e.this.u();
                    return;
                }
                e.this.c();
                e.this.n();
                e.this.o.b();
            } else if (view == e.this.C) {
                e.this.v();
            } else {
                r rVar = e.this.c;
                rVar.e("InterActivityV2", "Unhandled click on widget: " + view);
            }
        }
    }

    public e(com.applovin.impl.sdk.a.g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(gVar, appLovinFullscreenActivity, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.z = new com.applovin.impl.adview.activity.a.c(this.a, this.d, this.b);
        this.F = new a();
        this.G = new Handler(Looper.getMainLooper());
        this.t = new k(this.G, this.b);
        this.H = this.a.f();
        this.u = t();
        this.I = -1L;
        this.J = new AtomicBoolean();
        this.K = new AtomicBoolean();
        this.L = -2L;
        this.M = 0L;
        if (!gVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        c cVar = new c();
        if (gVar.s() >= 0) {
            n nVar = new n(gVar.w(), appLovinFullscreenActivity);
            this.B = nVar;
            nVar.setVisibility(8);
            this.B.setOnClickListener(cVar);
        } else {
            this.B = null;
        }
        if (a(this.u, kVar)) {
            ImageView imageView = new ImageView(appLovinFullscreenActivity);
            this.C = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.C.setClickable(true);
            this.C.setOnClickListener(cVar);
            d(this.u);
        } else {
            this.C = null;
        }
        String B = gVar.B();
        if (StringUtils.isValidString(B)) {
            w wVar = new w(kVar);
            wVar.a(new WeakReference<>(this.F));
            v vVar = new v(wVar, appLovinFullscreenActivity);
            this.D = vVar;
            vVar.a(B);
        } else {
            this.D = null;
        }
        if (this.H) {
            com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(appLovinFullscreenActivity, ((Integer) kVar.a(com.applovin.impl.sdk.c.b.cF)).intValue(), 16842874);
            this.A = aVar;
            aVar.setColor(Color.parseColor("#75FFFFFF"));
            this.A.setBackgroundColor(Color.parseColor("#00000000"));
            this.A.setVisibility(8);
            AppLovinCommunicator.getInstance(appLovinFullscreenActivity).subscribe(this, "video_caching_failed");
        } else {
            this.A = null;
        }
        if (gVar.N()) {
            ProgressBar progressBar = new ProgressBar(appLovinFullscreenActivity, null, 16842872);
            this.E = progressBar;
            progressBar.setMax(10000);
            this.E.setPadding(0, 0, 0, 0);
            if (com.applovin.impl.sdk.utils.f.d()) {
                this.E.setProgressTintList(ColorStateList.valueOf(gVar.O()));
            }
            this.t.a("PROGRESS_BAR", ((Long) kVar.a(com.applovin.impl.sdk.c.b.cA)).longValue(), new k.a() { // from class: com.applovin.impl.adview.activity.b.e.1
                @Override // com.applovin.impl.adview.k.a
                public void a() {
                    if (e.this.x) {
                        e.this.E.setVisibility(8);
                        return;
                    }
                    e.this.E.setProgress((int) ((((float) e.this.s.getCurrentPosition()) / ((float) e.this.v)) * 10000.0f));
                }

                @Override // com.applovin.impl.adview.k.a
                public boolean b() {
                    return !e.this.x;
                }
            });
        } else {
            this.E = null;
        }
        this.s = new SimpleExoPlayer.Builder(appLovinFullscreenActivity).build();
        b bVar = new b();
        this.s.addListener(bVar);
        this.s.setRepeatMode(0);
        PlayerView playerView = new PlayerView(appLovinFullscreenActivity);
        this.r = playerView;
        playerView.hideController();
        this.r.setControllerVisibilityListener(bVar);
        this.r.setPlayer(this.s);
        this.r.setOnTouchListener(new AppLovinTouchToClickListener(kVar, com.applovin.impl.sdk.c.b.aJ, appLovinFullscreenActivity, bVar));
        x();
    }

    private void C() {
        v vVar;
        u C = this.a.C();
        if (C == null || !C.e() || this.x || (vVar = this.D) == null) {
            return;
        }
        final boolean z = vVar.getVisibility() == 4;
        final long f = C.f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    o.a(e.this.D, f, (Runnable) null);
                } else {
                    o.b(e.this.D, f, null);
                }
            }
        });
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

    protected void A() {
        r rVar;
        String str;
        if (this.x) {
            rVar = this.c;
            str = "Skip video resume - postitial shown";
        } else if (!this.b.ab().a()) {
            long j = this.I;
            if (j < 0) {
                r rVar2 = this.c;
                rVar2.b("InterActivityV2", "Invalid last video position, isVideoPlaying=" + this.s.isPlaying());
                return;
            }
            long aL = this.a.aL();
            if (aL > 0) {
                j = Math.max(0L, j - aL);
                this.s.seekTo(j);
            }
            r rVar3 = this.c;
            rVar3.b("InterActivityV2", "Resuming video at position " + j + "ms for MediaPlayer: " + this.s);
            this.s.setPlayWhenReady(true);
            this.t.a();
            this.I = -1L;
            if (this.s.isPlaying()) {
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.7
                @Override // java.lang.Runnable
                public void run() {
                    if (e.this.A != null) {
                        e.this.A.a();
                    }
                }
            });
            return;
        } else {
            rVar = this.c;
            str = "Skip video resume - app paused";
        }
        rVar.d("InterActivityV2", str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int B() {
        long currentPosition = this.s.getCurrentPosition();
        if (this.y) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.v)) * 100.0f) : this.w;
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        this.c.b("InterActivityV2", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(PointF pointF) {
        if (!this.a.D()) {
            C();
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
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.6
            @Override // java.lang.Runnable
            public void run() {
                e.this.A();
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        r rVar;
        String str;
        this.c.b("InterActivityV2", "Pausing video");
        if (this.s.isPlaying()) {
            this.I = this.s.getCurrentPosition();
            this.s.setPlayWhenReady(false);
            this.t.c();
            rVar = this.c;
            str = "Paused video at position " + this.I + "ms";
        } else {
            rVar = this.c;
            str = "Nothing to pause";
        }
        rVar.b("InterActivityV2", str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str) {
        r rVar = this.c;
        rVar.e("InterActivityV2", "Encountered media error: " + str + " for ad: " + this.a);
        if (this.J.compareAndSet(false, true)) {
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
        } else if (this.x) {
        } else {
            c();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        this.z.a(this.C, this.B, this.D, this.A, this.E, this.r, this.f);
        this.s.setPlayWhenReady(true);
        if (this.a.am()) {
            this.o.a(this.a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.2
                @Override // java.lang.Runnable
                public void run() {
                    e.this.b(250L);
                }
            });
        }
        if (this.H) {
            this.A.a();
        }
        this.f.renderAd(this.a);
        this.e.b(this.H ? 1L : 0L);
        if (this.B != null) {
            this.b.Q().a((com.applovin.impl.sdk.e.a) new y(this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.3
                @Override // java.lang.Runnable
                public void run() {
                    e.this.y();
                }
            }), o.a.MAIN, this.a.t(), true);
        }
        super.b(this.u);
    }

    protected void d(boolean z) {
        if (com.applovin.impl.sdk.utils.f.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.d.getDrawable(z ? R.drawable.unmute_to_mute : R.drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.C.setScaleType(ImageView.ScaleType.FIT_XY);
                this.C.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aE = z ? this.a.aE() : this.a.aF();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.C.setImageURI(aE);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        this.t.b();
        this.G.removeCallbacksAndMessages(null);
        l();
        super.g();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void i() {
        this.s.release();
        if (this.H) {
            AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
        }
        super.i();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void l() {
        super.a(B(), this.H, p(), this.L);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.eO)).booleanValue() && j == this.a.getAdIdNumber() && this.H) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.y || this.s.isPlaying()) {
                    return;
                }
                c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.adview.activity.b.a
    public boolean p() {
        return B() >= this.a.P();
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
                long j = this.v;
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
        this.L = SystemClock.elapsedRealtime() - this.M;
        r rVar = this.c;
        rVar.b("InterActivityV2", "Skipping video with skip time: " + this.L + "ms");
        this.e.f();
        if (this.a.x()) {
            g();
        } else {
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
        boolean z = !this.u ? 1 : 0;
        this.u = z;
        this.s.setVolume(!z ? 1 : 0);
        d(this.u);
        a(this.u, 0L);
    }

    public void w() {
        z();
        this.z.a(this.g, this.f);
        a("javascript:al_onPoststitialShow();", this.a.R());
        if (this.g != null) {
            if (this.a.u() >= 0) {
                a(this.g, this.a.u(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.8
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.g.setVisibility(0);
            }
        }
        this.x = true;
    }

    protected void x() {
        a(!this.H);
        this.s.setMediaSource(new ProgressiveMediaSource.Factory(new DefaultDataSourceFactory(this.d, Util.getUserAgent(this.d, "com.applovin.sdk"))).createMediaSource(MediaItem.fromUri(this.a.h())));
        this.s.prepare();
        this.s.setPlayWhenReady(false);
    }

    protected void y() {
        if (this.K.compareAndSet(false, true)) {
            a(this.B, this.a.s(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.4
                @Override // java.lang.Runnable
                public void run() {
                    e.this.L = -1L;
                    e.this.M = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    protected void z() {
        this.w = B();
        this.s.setPlayWhenReady(false);
    }
}
