package com.applovin.impl.adview.activity.b;

import android.annotation.SuppressLint;
import android.app.Activity;
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
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
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
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class f extends com.applovin.impl.adview.activity.b.a implements AppLovinCommunicatorSubscriber {
    public boolean A;
    public long B;
    public boolean C;
    private final com.applovin.impl.adview.activity.a.c D;
    private MediaPlayer E;
    private final b F;
    private final a G;
    private final Handler H;
    private final boolean I;
    private int J;
    private int K;
    private boolean L;
    private final AtomicBoolean M;
    private final AtomicBoolean N;
    private long O;
    private long P;
    public final AppLovinVideoView t;
    public final com.applovin.impl.adview.a u;
    public final m v;
    public final ImageView w;
    public final t x;
    public final ProgressBar y;
    public final j z;

    /* loaded from: classes.dex */
    public class a implements u.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.u.a
        public void a(t tVar) {
            f.this.f3167c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            f.this.a(tVar.getAndClearLastClickLocation());
        }

        @Override // com.applovin.impl.adview.u.a
        public void b(t tVar) {
            f.this.f3167c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            f.this.h();
        }

        @Override // com.applovin.impl.adview.u.a
        public void c(t tVar) {
            f.this.f3167c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            f.this.c();
        }
    }

    /* loaded from: classes.dex */
    public class b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private b() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            f.this.a(pointF);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            f.this.f3167c.b("AppLovinFullscreenActivity", "Video completed");
            f.this.L = true;
            f.this.y();
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
            f fVar = f.this;
            fVar.c("Video view error (" + i2 + "," + i3 + ")");
            f.this.t.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
            v vVar = f.this.f3167c;
            vVar.b("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i2 + ", " + i3 + ")");
            if (i2 == 701) {
                f.this.v();
                f.this.f3168d.g();
                return false;
            } else if (i2 != 3) {
                if (i2 == 702) {
                    f.this.w();
                    return false;
                }
                return false;
            } else {
                f.this.z.a();
                f fVar = f.this;
                if (fVar.v != null) {
                    fVar.A();
                }
                f.this.w();
                if (f.this.q.c()) {
                    f.this.e();
                    return false;
                }
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            f.this.E = mediaPlayer;
            mediaPlayer.setOnInfoListener(f.this.F);
            mediaPlayer.setOnErrorListener(f.this.F);
            float f2 = !f.this.A ? 1 : 0;
            mediaPlayer.setVolume(f2, f2);
            f.this.c(mediaPlayer.getDuration());
            f.this.u();
            v vVar = f.this.f3167c;
            StringBuilder y = e.a.d.a.a.y("MediaPlayer prepared: ");
            y.append(f.this.E);
            vVar.b("AppLovinFullscreenActivity", y.toString());
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f fVar = f.this;
            if (view == fVar.v) {
                if (!fVar.s()) {
                    f.this.c();
                    return;
                }
                f.this.e();
                f.this.p();
                f.this.q.b();
            } else if (view == fVar.w) {
                fVar.x();
            } else {
                v vVar = fVar.f3167c;
                vVar.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public f(com.applovin.impl.sdk.ad.e eVar, Activity activity, com.applovin.impl.sdk.m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.D = new com.applovin.impl.adview.activity.a.c(this.a, this.f3169e, this.f3166b);
        b bVar = new b();
        this.F = bVar;
        a aVar = new a();
        this.G = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.H = handler;
        j jVar = new j(handler, this.f3166b);
        this.z = jVar;
        boolean e2 = this.a.e();
        this.I = e2;
        this.A = Utils.isVideoMutedInitially(this.f3166b);
        this.K = -1;
        this.M = new AtomicBoolean();
        this.N = new AtomicBoolean();
        this.O = -2L;
        this.P = 0L;
        if (!eVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity, mVar);
        this.t = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(bVar);
        appLovinVideoView.setOnCompletionListener(bVar);
        appLovinVideoView.setOnErrorListener(bVar);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(mVar, com.applovin.impl.sdk.c.b.aR, activity, bVar));
        c cVar = new c();
        if (eVar.o() >= 0) {
            m mVar2 = new m(eVar.u(), activity);
            this.v = mVar2;
            mVar2.setVisibility(8);
            mVar2.setOnClickListener(cVar);
        } else {
            this.v = null;
        }
        if (a(this.A, mVar)) {
            ImageView imageView = new ImageView(activity);
            this.w = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(cVar);
            e(this.A);
        } else {
            this.w = null;
        }
        String z = eVar.z();
        if (StringUtils.isValidString(z)) {
            u uVar = new u(mVar);
            uVar.a(new WeakReference<>(aVar));
            t tVar = new t(uVar, activity);
            this.x = tVar;
            tVar.a(z);
        } else {
            this.x = null;
        }
        if (e2) {
            com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cG)).intValue(), 16842874);
            this.u = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.u = null;
        }
        if (!eVar.J()) {
            this.y = null;
            return;
        }
        ProgressBar progressBar = new ProgressBar(activity, null, 16842872);
        this.y = progressBar;
        progressBar.setMax(10000);
        progressBar.setPadding(0, 0, 0, 0);
        if (com.applovin.impl.sdk.utils.g.d()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(eVar.K()));
        }
        jVar.a("PROGRESS_BAR", ((Long) mVar.a(com.applovin.impl.sdk.c.b.cD)).longValue(), new j.a() { // from class: com.applovin.impl.adview.activity.b.f.1
            @Override // com.applovin.impl.adview.j.a
            public void a() {
                f fVar = f.this;
                if (fVar.C) {
                    fVar.y.setVisibility(8);
                    return;
                }
                f fVar2 = f.this;
                fVar2.y.setProgress((int) ((fVar.t.getCurrentPosition() / ((float) fVar2.B)) * 10000.0f));
            }

            @Override // com.applovin.impl.adview.j.a
            public boolean b() {
                return !f.this.C;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (this.N.compareAndSet(false, true)) {
            a(this.v, this.a.o(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.5
                @Override // java.lang.Runnable
                public void run() {
                    f.this.O = -1L;
                    f.this.P = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    private void B() {
        t tVar;
        s A = this.a.A();
        if (A == null || !A.e() || this.C || (tVar = this.x) == null) {
            return;
        }
        final boolean z = tVar.getVisibility() == 4;
        final long f2 = A.f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.6
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    p.a(f.this.x, f2, (Runnable) null);
                } else {
                    p.b(f.this.x, f2, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        v vVar;
        String str;
        if (this.C) {
            vVar = this.f3167c;
            str = "Skip video resume - postitial shown";
        } else if (!this.f3166b.ac().a()) {
            if (this.K < 0) {
                this.f3167c.b("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            v vVar2 = this.f3167c;
            StringBuilder y = e.a.d.a.a.y("Resuming video at position ");
            y.append(this.K);
            y.append("ms for MediaPlayer: ");
            y.append(this.E);
            vVar2.b("AppLovinFullscreenActivity", y.toString());
            this.t.seekTo(this.K);
            this.t.start();
            this.z.a();
            this.K = -1;
            a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8
                @Override // java.lang.Runnable
                public void run() {
                    com.applovin.impl.adview.a aVar = f.this.u;
                    if (aVar != null) {
                        aVar.a();
                        f.this.a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                f.this.u.b();
                            }
                        }, 2000L);
                    }
                }
            }, 250L);
            return;
        } else {
            vVar = this.f3167c;
            str = "Skip video resume - app paused";
        }
        vVar.d("AppLovinFullscreenActivity", str);
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

    private void d(boolean z) {
        this.J = z();
        if (z) {
            this.t.pause();
        } else {
            this.t.stopPlayback();
        }
    }

    private void e(boolean z) {
        if (com.applovin.impl.sdk.utils.g.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f3169e.getDrawable(z ? R.drawable.unmute_to_mute : R.drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.w.setScaleType(ImageView.ScaleType.FIT_XY);
                this.w.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri ay = z ? this.a.ay() : this.a.az();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.w.setImageURI(ay);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        this.f3167c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j2) {
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.7
            @Override // java.lang.Runnable
            public void run() {
                f.this.C();
            }
        }, j2);
    }

    public void a(PointF pointF) {
        if (!this.a.B()) {
            B();
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
        this.D.a(this.w, this.v, this.x, this.u, this.y, this.t, this.f3170f, viewGroup);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        a(!this.I);
        this.t.setVideoURI(this.a.g());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.a.ai()) {
            this.q.a(this.a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.3
                @Override // java.lang.Runnable
                public void run() {
                    f.this.a(250L);
                }
            });
        }
        this.t.start();
        if (this.I) {
            v();
        }
        this.f3170f.renderAd(this.a);
        this.f3168d.b(this.I ? 1L : 0L);
        if (this.v != null) {
            this.f3166b.S().a((com.applovin.impl.sdk.e.a) new z(this.f3166b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.4
                @Override // java.lang.Runnable
                public void run() {
                    f.this.A();
                }
            }), o.a.MAIN, this.a.p(), true);
        }
        super.b(this.A);
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        this.f3167c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        c();
    }

    public void c() {
        this.O = SystemClock.elapsedRealtime() - this.P;
        this.f3167c.b("AppLovinFullscreenActivity", e.a.d.a.a.q(e.a.d.a.a.y("Skipping video with skip time: "), this.O, "ms"));
        this.f3168d.f();
        this.f3174j++;
        if (this.a.v()) {
            h();
        } else {
            y();
        }
    }

    public void c(long j2) {
        this.B = j2;
    }

    public void c(String str) {
        v vVar = this.f3167c;
        StringBuilder B = e.a.d.a.a.B("Encountered media error: ", str, " for ad: ");
        B.append(this.a);
        vVar.e("AppLovinFullscreenActivity", B.toString());
        if (this.M.compareAndSet(false, true)) {
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
        } else if (this.C) {
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
        this.f3167c.b("AppLovinFullscreenActivity", "Pausing video");
        this.K = this.t.getCurrentPosition();
        this.t.pause();
        this.z.c();
        v vVar = this.f3167c;
        StringBuilder y = e.a.d.a.a.y("Paused video at position ");
        y.append(this.K);
        y.append("ms");
        vVar.b("AppLovinFullscreenActivity", y.toString());
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        this.z.b();
        this.H.removeCallbacksAndMessages(null);
        m();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    @SuppressLint({"LongLogTag"})
    public void j() {
        this.f3167c.c("AppLovinFullscreenActivity", "Destroying video components");
        try {
            if (this.I) {
                AppLovinCommunicator.getInstance(this.f3169e).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.t;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.t.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.E;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            Log.e("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.j();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void m() {
        super.a(z(), this.I, r(), this.O);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j2 = messageData.getLong("ad_id");
            if (((Boolean) this.f3166b.a(com.applovin.impl.sdk.c.b.eS)).booleanValue() && j2 == this.a.getAdIdNumber() && this.I) {
                int i2 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i2 >= 200 && i2 < 300) || this.L || this.t.isPlaying()) {
                    return;
                }
                c("Video cache error during stream. ResponseCode=" + i2 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean r() {
        return z() >= this.a.L();
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
                long j3 = this.B;
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
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.9
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = f.this.u;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
    }

    public void w() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.10
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = f.this.u;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }

    public void x() {
        MediaPlayer mediaPlayer = this.E;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f2 = !this.A ? 0 : 1;
            mediaPlayer.setVolume(f2, f2);
            boolean z = this.A ? false : true;
            this.A = z;
            e(z);
            a(this.A, 0L);
        } catch (Throwable unused) {
        }
    }

    public void y() {
        this.f3167c.b("AppLovinFullscreenActivity", "Showing postitial...");
        d(this.a.aG());
        this.D.a(this.f3171g, this.f3170f);
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:al_onPoststitialShow(");
        sb.append(this.f3174j);
        sb.append(",");
        a(e.a.d.a.a.p(sb, this.f3175k, ");"), this.a.N());
        if (this.f3171g != null) {
            int i2 = (this.a.q() > 0L ? 1 : (this.a.q() == 0L ? 0 : -1));
            m mVar = this.f3171g;
            if (i2 >= 0) {
                a(mVar, this.a.q(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.2
                    @Override // java.lang.Runnable
                    public void run() {
                        f.this.f3173i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                mVar.setVisibility(0);
            }
        }
        this.C = true;
    }

    public int z() {
        long currentPosition = this.t.getCurrentPosition();
        if (this.L) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.B)) * 100.0f) : this.J;
    }
}
