package com.applovin.impl.adview.activity.b;

import android.app.Activity;
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
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.s;
import com.applovin.impl.adview.t;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.p;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
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
    public final j A;
    public boolean B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    private final com.applovin.impl.adview.activity.a.c G;
    private final a H;
    private final Handler I;
    private final boolean J;
    private long K;
    private final AtomicBoolean L;
    private final AtomicBoolean M;
    private long N;
    private long O;
    public final PlayerView t;
    public final SimpleExoPlayer u;
    public final com.applovin.impl.adview.a v;
    public final m w;
    public final ImageView x;
    public final t y;
    public final ProgressBar z;

    /* loaded from: classes.dex */
    public class a implements u.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.u.a
        public void a(t tVar) {
            e.this.f3167c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            e.this.a(tVar.getAndClearLastClickLocation());
        }

        @Override // com.applovin.impl.adview.u.a
        public void b(t tVar) {
            e.this.f3167c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            e.this.h();
        }

        @Override // com.applovin.impl.adview.u.a
        public void c(t tVar) {
            e.this.f3167c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            e.this.c();
        }
    }

    /* loaded from: classes.dex */
    public class b implements AppLovinTouchToClickListener.OnClickListener, Player.EventListener, PlayerControlView.VisibilityListener {
        private b() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            e.this.a(pointF);
        }

        public void onPlaybackStateChanged(int i2) {
            v vVar = e.this.f3167c;
            StringBuilder z = e.a.d.a.a.z("Player state changed to state ", i2, " and will play when ready: ");
            z.append(e.this.u.getPlayWhenReady());
            vVar.b("AppLovinFullscreenActivity", z.toString());
            if (i2 == 2) {
                e.this.v();
                e.this.f3168d.g();
            } else if (i2 != 3) {
                if (i2 == 4) {
                    e.this.f3167c.b("AppLovinFullscreenActivity", "Video completed");
                    e eVar = e.this;
                    eVar.F = true;
                    eVar.y();
                }
            } else {
                e eVar2 = e.this;
                eVar2.u.setVolume(!eVar2.B ? 1 : 0);
                e eVar3 = e.this;
                eVar3.c(eVar3.u.getDuration());
                e.this.u();
                v vVar2 = e.this.f3167c;
                StringBuilder y = e.a.d.a.a.y("MediaPlayer prepared: ");
                y.append(e.this.u);
                vVar2.b("AppLovinFullscreenActivity", y.toString());
                e.this.A.a();
                e eVar4 = e.this;
                if (eVar4.w != null) {
                    eVar4.A();
                }
                e.this.w();
                if (e.this.q.c()) {
                    e.this.e();
                }
            }
        }

        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            e eVar = e.this;
            eVar.c("Video view error (" + exoPlaybackException + ")");
            e.this.h();
        }

        public void onVisibilityChange(int i2) {
            if (i2 == 0) {
                e.this.t.hideController();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = e.this;
            if (view == eVar.w) {
                if (!eVar.s()) {
                    e.this.c();
                    return;
                }
                e.this.e();
                e.this.p();
                e.this.q.b();
            } else if (view == eVar.x) {
                eVar.x();
            } else {
                v vVar = eVar.f3167c;
                vVar.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public e(com.applovin.impl.sdk.ad.e eVar, Activity activity, com.applovin.impl.sdk.m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.G = new com.applovin.impl.adview.activity.a.c(this.a, this.f3169e, this.f3166b);
        a aVar = new a();
        this.H = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.I = handler;
        j jVar = new j(handler, this.f3166b);
        this.A = jVar;
        boolean e2 = this.a.e();
        this.J = e2;
        this.B = Utils.isVideoMutedInitially(this.f3166b);
        this.K = -1L;
        this.L = new AtomicBoolean();
        this.M = new AtomicBoolean();
        this.N = -2L;
        this.O = 0L;
        if (!eVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        c cVar = new c();
        if (eVar.o() >= 0) {
            m mVar2 = new m(eVar.u(), activity);
            this.w = mVar2;
            mVar2.setVisibility(8);
            mVar2.setOnClickListener(cVar);
        } else {
            this.w = null;
        }
        if (a(this.B, mVar)) {
            ImageView imageView = new ImageView(activity);
            this.x = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(cVar);
            d(this.B);
        } else {
            this.x = null;
        }
        String z = eVar.z();
        if (StringUtils.isValidString(z)) {
            u uVar = new u(mVar);
            uVar.a(new WeakReference<>(aVar));
            t tVar = new t(uVar, activity);
            this.y = tVar;
            tVar.a(z);
        } else {
            this.y = null;
        }
        if (e2) {
            com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cG)).intValue(), 16842874);
            this.v = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.v = null;
        }
        if (eVar.J()) {
            ProgressBar progressBar = new ProgressBar(activity, null, 16842872);
            this.z = progressBar;
            progressBar.setMax(10000);
            progressBar.setPadding(0, 0, 0, 0);
            if (com.applovin.impl.sdk.utils.g.d()) {
                progressBar.setProgressTintList(ColorStateList.valueOf(eVar.K()));
            }
            jVar.a("PROGRESS_BAR", ((Long) mVar.a(com.applovin.impl.sdk.c.b.cD)).longValue(), new j.a() { // from class: com.applovin.impl.adview.activity.b.e.1
                @Override // com.applovin.impl.adview.j.a
                public void a() {
                    e eVar2 = e.this;
                    if (eVar2.E) {
                        eVar2.z.setVisibility(8);
                        return;
                    }
                    e eVar3 = e.this;
                    eVar3.z.setProgress((int) ((((float) eVar2.u.getCurrentPosition()) / ((float) eVar3.C)) * 10000.0f));
                }

                @Override // com.applovin.impl.adview.j.a
                public boolean b() {
                    return !e.this.E;
                }
            });
        } else {
            this.z = null;
        }
        SimpleExoPlayer build = new SimpleExoPlayer.Builder(activity).build();
        this.u = build;
        b bVar = new b();
        build.addListener(bVar);
        build.setRepeatMode(0);
        PlayerView playerView = new PlayerView(activity);
        this.t = playerView;
        playerView.hideController();
        playerView.setControllerVisibilityListener(bVar);
        playerView.setPlayer(build);
        playerView.setOnTouchListener(new AppLovinTouchToClickListener(mVar, com.applovin.impl.sdk.c.b.aR, activity, bVar));
        z();
    }

    private void E() {
        t tVar;
        s A = this.a.A();
        if (A == null || !A.e() || this.E || (tVar = this.y) == null) {
            return;
        }
        final boolean z = tVar.getVisibility() == 4;
        final long f2 = A.f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    p.a(e.this.y, f2, (Runnable) null);
                } else {
                    p.b(e.this.y, f2, null);
                }
            }
        });
    }

    private static boolean a(boolean z, com.applovin.impl.sdk.m mVar) {
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cv)).booleanValue()) {
            if (!((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cw)).booleanValue() || z) {
                return true;
            }
            return ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cy)).booleanValue();
        }
        return false;
    }

    public void A() {
        if (this.M.compareAndSet(false, true)) {
            a(this.w, this.a.o(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.4
                @Override // java.lang.Runnable
                public void run() {
                    e.this.N = -1L;
                    e.this.O = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    public void B() {
        this.D = D();
        this.u.setPlayWhenReady(false);
    }

    public void C() {
        v vVar;
        String str;
        if (this.E) {
            vVar = this.f3167c;
            str = "Skip video resume - postitial shown";
        } else if (!this.f3166b.ac().a()) {
            long j2 = this.K;
            if (j2 < 0) {
                v vVar2 = this.f3167c;
                StringBuilder y = e.a.d.a.a.y("Invalid last video position, isVideoPlaying=");
                y.append(this.u.isPlaying());
                vVar2.b("AppLovinFullscreenActivity", y.toString());
                return;
            }
            long aF = this.a.aF();
            if (aF > 0) {
                j2 = Math.max(0L, j2 - aF);
                this.u.seekTo(j2);
            }
            v vVar3 = this.f3167c;
            vVar3.b("AppLovinFullscreenActivity", "Resuming video at position " + j2 + "ms for MediaPlayer: " + this.u);
            this.u.setPlayWhenReady(true);
            this.A.a();
            this.K = -1L;
            if (this.u.isPlaying()) {
                return;
            }
            v();
            return;
        } else {
            vVar = this.f3167c;
            str = "Skip video resume - app paused";
        }
        vVar.d("AppLovinFullscreenActivity", str);
    }

    public int D() {
        long currentPosition = this.u.getCurrentPosition();
        if (this.F) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.C)) * 100.0f) : this.D;
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        this.f3167c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j2) {
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.6
            @Override // java.lang.Runnable
            public void run() {
                e.this.C();
            }
        }, j2);
    }

    public void a(PointF pointF) {
        if (!this.a.B()) {
            E();
            return;
        }
        this.f3167c.b("AppLovinFullscreenActivity", "Clicking through video");
        Uri j2 = this.a.j();
        if (j2 != null) {
            com.applovin.impl.sdk.utils.j.a(this.f3178n, this.a);
            AppLovinAdView appLovinAdView = this.f3170f;
            this.f3166b.u().trackAndLaunchVideoClick(this.a, j2, pointF, appLovinAdView != null ? appLovinAdView.getContext() : this.f3166b.L());
            this.f3168d.b();
            this.f3175k++;
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.G.a(this.x, this.w, this.y, this.v, this.z, this.t, this.f3170f, viewGroup);
        this.u.setPlayWhenReady(true);
        if (this.a.ai()) {
            this.q.a(this.a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.2
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a(250L);
                }
            });
        }
        if (this.J) {
            v();
        }
        this.f3170f.renderAd(this.a);
        this.f3168d.b(this.J ? 1L : 0L);
        if (this.w != null) {
            this.f3166b.S().a((com.applovin.impl.sdk.e.a) new z(this.f3166b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.3
                @Override // java.lang.Runnable
                public void run() {
                    e.this.A();
                }
            }), o.a.MAIN, this.a.p(), true);
        }
        super.b(this.B);
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        this.f3167c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        c();
    }

    public void c() {
        this.N = SystemClock.elapsedRealtime() - this.O;
        this.f3167c.b("AppLovinFullscreenActivity", e.a.d.a.a.q(e.a.d.a.a.y("Skipping video with skip time: "), this.N, "ms"));
        this.f3168d.f();
        this.f3174j++;
        if (this.a.v()) {
            h();
        } else {
            y();
        }
    }

    public void c(long j2) {
        this.C = j2;
    }

    public void c(String str) {
        v vVar = this.f3167c;
        StringBuilder B = e.a.d.a.a.B("Encountered media error: ", str, " for ad: ");
        B.append(this.a);
        vVar.e("AppLovinFullscreenActivity", B.toString());
        if (this.L.compareAndSet(false, true)) {
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.o;
            if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.g) {
                ((com.applovin.impl.sdk.ad.g) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            h();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void c(boolean z) {
        super.c(z);
        if (z) {
            a(((Boolean) this.f3166b.a(com.applovin.impl.sdk.c.b.eR)).booleanValue() ? 0L : 250L);
        } else if (this.E) {
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    public void d(boolean z) {
        if (com.applovin.impl.sdk.utils.g.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f3169e.getDrawable(z ? R.drawable.unmute_to_mute : R.drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.x.setScaleType(ImageView.ScaleType.FIT_XY);
                this.x.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri ay = z ? this.a.ay() : this.a.az();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.x.setImageURI(ay);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
        v vVar;
        String str;
        this.f3167c.b("AppLovinFullscreenActivity", "Pausing video");
        if (this.u.isPlaying()) {
            this.K = this.u.getCurrentPosition();
            this.u.setPlayWhenReady(false);
            this.A.c();
            vVar = this.f3167c;
            str = e.a.d.a.a.q(e.a.d.a.a.y("Paused video at position "), this.K, "ms");
        } else {
            vVar = this.f3167c;
            str = "Nothing to pause";
        }
        vVar.b("AppLovinFullscreenActivity", str);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        this.A.b();
        this.I.removeCallbacksAndMessages(null);
        m();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void j() {
        this.u.release();
        if (this.J) {
            AppLovinCommunicator.getInstance(this.f3169e).unsubscribe(this, "video_caching_failed");
        }
        super.j();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void m() {
        super.a(D(), this.J, r(), this.N);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j2 = messageData.getLong("ad_id");
            if (((Boolean) this.f3166b.a(com.applovin.impl.sdk.c.b.eS)).booleanValue() && j2 == this.a.getAdIdNumber() && this.J) {
                int i2 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i2 >= 200 && i2 < 300) || this.F || this.u.isPlaying()) {
                    return;
                }
                c("Video cache error during stream. ResponseCode=" + i2 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean r() {
        return D() >= this.a.L();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean s() {
        return t() && !r();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void u() {
        long j2;
        int k2;
        if (this.a.Y() >= 0 || this.a.Z() >= 0) {
            int i2 = (this.a.Y() > 0L ? 1 : (this.a.Y() == 0L ? 0 : -1));
            com.applovin.impl.sdk.ad.e eVar = this.a;
            if (i2 >= 0) {
                j2 = eVar.Y();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
                long j3 = this.C;
                long j4 = j3 > 0 ? 0 + j3 : 0L;
                if (aVar.aa() && ((k2 = (int) ((com.applovin.impl.sdk.ad.a) this.a).k()) > 0 || (k2 = (int) aVar.q()) > 0)) {
                    j4 += TimeUnit.SECONDS.toMillis(k2);
                }
                double d2 = j4;
                double Z = this.a.Z();
                Double.isNaN(Z);
                Double.isNaN(d2);
                j2 = (long) ((Z / 100.0d) * d2);
            }
            b(j2);
        }
    }

    public void v() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.7
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = e.this.v;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
    }

    public void w() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.8
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = e.this.v;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }

    public void x() {
        boolean z = !this.B ? 1 : 0;
        this.B = z;
        this.u.setVolume(!z ? 1 : 0);
        d(this.B);
        a(this.B, 0L);
    }

    public void y() {
        B();
        this.G.a(this.f3171g, this.f3170f);
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:al_onPoststitialShow(");
        sb.append(this.f3174j);
        sb.append(",");
        a(e.a.d.a.a.p(sb, this.f3175k, ");"), this.a.N());
        if (this.f3171g != null) {
            int i2 = (this.a.q() > 0L ? 1 : (this.a.q() == 0L ? 0 : -1));
            m mVar = this.f3171g;
            if (i2 >= 0) {
                a(mVar, this.a.q(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.9
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.f3173i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                mVar.setVisibility(0);
            }
        }
        this.E = true;
    }

    public void z() {
        a(!this.J);
        Activity activity = this.f3169e;
        this.u.setMediaSource(new ProgressiveMediaSource.Factory(new DefaultDataSourceFactory(activity, Util.getUserAgent(activity, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).createMediaSource(MediaItem.fromUri(this.a.g())));
        this.u.prepare();
        this.u.setPlayWhenReady(false);
    }
}
