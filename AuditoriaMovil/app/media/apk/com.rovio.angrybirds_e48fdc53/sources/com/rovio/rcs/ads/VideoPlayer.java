package com.rovio.rcs.ads;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.rovio.rcs.ads.WebViewAd;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class VideoPlayer implements AudioManager.OnAudioFocusChangeListener {
    private static final String TAG = "VideoPlayer";
    private static final boolean VERBOSE_LOGGING = false;
    private boolean A;
    private WebViewAd B;
    private String a;
    private int b;
    private String c;
    private Activity d;
    private ViewGroup e;
    private int h;
    private float l;
    private BroadcastReceiver v;
    private VideoPlayerListener z;
    private VideoView f = null;
    private boolean g = false;
    private int i = 0;
    private int j = 0;
    private Runnable k = null;
    private VideoAdsUI m = null;
    private RelativeLayout n = null;
    private Animation o = null;
    private Animation p = null;
    private Animation q = null;
    private View r = null;
    private boolean s = false;
    private Runnable t = null;
    private Handler u = null;
    private boolean w = false;
    private WeakReference<MediaPlayer> x = null;
    private long y = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface VideoPlayerListener {
        void onCustomControlClicked(String str, float f);

        void onEndCardClick(String str);

        void onEndCardTrackEvent(String str, String str2);

        void onVideoEnded(boolean z, float f);

        void onVideoTrackEvent(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VideoPlayer(VideoPlayerListener videoPlayerListener, Activity activity, ViewGroup viewGroup, String str, int i, String str2) {
        this.a = "";
        this.b = 0;
        this.l = 96.0f;
        this.v = null;
        this.z = null;
        this.d = activity;
        this.e = viewGroup;
        this.z = videoPlayerListener;
        this.a = str;
        this.b = i;
        this.c = str2;
        try {
            JSONObject jSONObject = new JSONObject(this.c);
            if (jSONObject.has("videoCompletePercentage")) {
                this.l = jSONObject.getInt("videoCompletePercentage");
            }
        } catch (JSONException e) {
        }
        this.v = new BroadcastReceiver() { // from class: com.rovio.rcs.ads.VideoPlayer.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                boolean z = true;
                int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
                if (intExtra > -1) {
                    VideoPlayer videoPlayer = VideoPlayer.this;
                    if (intExtra != 0 && intExtra != 1) {
                        z = false;
                    }
                    videoPlayer.w = z;
                    VideoPlayer.this.f();
                }
            }
        };
        this.d.registerReceiver(this.v, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    public int getDuration() {
        return this.i;
    }

    public float getVideoCompletionThreshold() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.m != null && this.x != null && this.x.get() != null) {
            float f = this.w ? 0.0f : 1.0f;
            this.x.get().setVolume(f, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WebViewAd webViewAd) {
        this.B = webViewAd;
        this.B.a(this.e);
        try {
            JSONObject jSONObject = new JSONObject(this.c);
            if (jSONObject.has("autoHideSeconds")) {
                this.B.a(new JSONObject(jSONObject, new String[]{"autoHideSeconds"}).toString());
            }
        } catch (JSONException e) {
        }
        this.B.a(new WebViewAd.WebViewAdListener() { // from class: com.rovio.rcs.ads.VideoPlayer.2
            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onUrlLoaded(boolean z) {
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onLinkClicked(String str) {
                VideoPlayer.this.z.onEndCardClick(str);
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onRovioTrackEvent(String str, String str2) {
                VideoPlayer.this.z.onEndCardTrackEvent(str, str2);
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onVideoEnded(String str, float f) {
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onVideoStarted() {
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onViewVisible() {
                VideoPlayer.this.a("companionImpression");
                VideoPlayer.this.a(false);
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onViewHidden() {
                VideoPlayer.this.z.onVideoEnded(false, VideoPlayer.this.m());
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onViewExpanded() {
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onViewCollapsed() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.q != null) {
            this.q.cancel();
        }
        n();
        g();
        h();
        if (this.b == 2) {
            i();
        }
        this.f.setVideoPath(this.a);
        if (this.p == null) {
            this.p = new AlphaAnimation(0.0f, 1.0f);
            this.p.setDuration(400L);
            this.p.setAnimationListener(new Animation.AnimationListener() { // from class: com.rovio.rcs.ads.VideoPlayer.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    VideoPlayer.this.p = null;
                    VideoPlayer.this.j();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            this.n.startAnimation(this.p);
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        k();
        a(true);
        if (this.B != null) {
            this.B.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.d.unregisterReceiver(this.v);
        a(false);
        if (this.B != null) {
            this.B.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class MediaPlayerView extends RelativeLayout {
        public MediaPlayerView(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void onWindowFocusChanged(boolean z) {
            if (VideoPlayer.this.A && z) {
                VideoPlayer.this.A = false;
                VideoPlayer.this.d();
            }
        }
    }

    private void g() {
        if (this.n == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.n = new MediaPlayerView(this.d);
            this.n.setBackgroundColor(-16777216);
            this.n.setOnTouchListener(new View.OnTouchListener() { // from class: com.rovio.rcs.ads.VideoPlayer.4
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0 && VideoPlayer.this.m != null) {
                        VideoPlayer.this.m.b();
                        return true;
                    }
                    return true;
                }
            });
            this.e.addView(this.n, layoutParams);
        }
    }

    private void h() {
        if (this.f == null) {
            this.f = new VideoView(this.d.getApplicationContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f.setLayoutParams(layoutParams);
            this.f.setZOrderMediaOverlay(true);
            this.f.setBackgroundColor(-16777216);
            this.g = false;
            this.i = 0;
            this.h = 0;
            this.s = false;
            this.j = 0;
            ((AudioManager) this.d.getSystemService("audio")).requestAudioFocus(this, 3, 2);
            this.f.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.rovio.rcs.ads.VideoPlayer.5
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer) {
                    VideoPlayer.this.x = new WeakReference(mediaPlayer);
                    mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.rovio.rcs.ads.VideoPlayer.5.1
                        @Override // android.media.MediaPlayer.OnInfoListener
                        public boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                            if (i == 701) {
                                VideoPlayer.this.o();
                            } else if (i == 702) {
                                VideoPlayer.this.p();
                            } else if (Build.VERSION.SDK_INT >= 17 && i == 3) {
                                VideoPlayer.this.f.setBackgroundColor(0);
                            }
                            return false;
                        }
                    });
                    VideoPlayer.this.f();
                    if (VideoPlayer.this.g) {
                        if (Build.VERSION.SDK_INT >= 17) {
                            VideoPlayer.this.f.setBackgroundColor(-16777216);
                        }
                        VideoPlayer.this.p();
                        return;
                    }
                    VideoPlayer.this.i = VideoPlayer.this.f.getDuration();
                    VideoPlayer.this.f.postDelayed(VideoPlayer.this.k, 100L);
                    VideoPlayer.this.j();
                }
            });
            this.f.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.rovio.rcs.ads.VideoPlayer.6
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    VideoPlayer.this.h = VideoPlayer.this.i;
                    VideoPlayer.this.a(false, 100.0f);
                }
            });
            this.f.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.rovio.rcs.ads.VideoPlayer.7
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    float f;
                    int currentPosition = mediaPlayer.getCurrentPosition();
                    if (currentPosition < 0 || currentPosition > VideoPlayer.this.i) {
                        currentPosition = VideoPlayer.this.h;
                    }
                    if (VideoPlayer.this.i > 0 && currentPosition > 0 && currentPosition <= VideoPlayer.this.i) {
                        f = (currentPosition * 100) / VideoPlayer.this.i;
                    } else {
                        f = 0.0f;
                    }
                    VideoPlayer.this.a(true, f);
                    return true;
                }
            });
            this.k = new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayer.8
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoPlayer.this.f != null && VideoPlayer.this.i > 0) {
                        if (VideoPlayer.this.f.isPlaying()) {
                            VideoPlayer.this.h = VideoPlayer.this.f.getCurrentPosition();
                            VideoPlayer.this.a((VideoPlayer.this.h * 100) / VideoPlayer.this.i);
                        }
                        VideoPlayer.this.f.postDelayed(VideoPlayer.this.k, VideoPlayer.this.i / 10);
                    }
                }
            };
            this.n.addView(this.f);
        }
    }

    private void i() {
        if (this.m == null) {
            this.m = new VideoAdsUI(this.d, this.f, this.c);
            this.m.a(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayer.9
                @Override // java.lang.Runnable
                public void run() {
                    VideoPlayer.this.a("skip");
                    VideoPlayer.this.l();
                }
            });
            this.m.b(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayer.10
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - VideoPlayer.this.y > 500) {
                        VideoPlayer.this.y = currentTimeMillis;
                        float m = VideoPlayer.this.m();
                        VideoPlayer.this.a(m);
                        VideoPlayer.this.z.onCustomControlClicked("link", m);
                        VideoPlayer.this.s = true;
                    }
                }
            });
            this.n.addView(this.m, new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.p == null && this.i != 0) {
            if (this.m != null) {
                this.m.startTimers();
            }
            p();
            f();
            if (Build.VERSION.SDK_INT < 17) {
                this.f.setBackgroundColor(0);
            }
            this.f.seekTo(0);
            this.f.start();
            a("Impression");
            a("start");
        }
    }

    private void k() {
        if (this.f != null) {
            float m = m();
            b(false, m);
            this.z.onVideoEnded(false, m);
            if (this.f.isPlaying()) {
                this.f.stopPlayback();
            }
        }
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.B != null) {
            if (this.f != null && this.f.isPlaying()) {
                this.f.stopPlayback();
            }
            this.B.d();
            return;
        }
        k();
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float m() {
        float f = 0.0f;
        if (this.f != null && this.f.isPlaying()) {
            f = this.f.getCurrentPosition() / this.f.getDuration();
        } else if (this.i > 0 && this.h > 0 && this.h <= this.i) {
            f = this.h / this.i;
        }
        return f * 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, float f) {
        b(z, f);
        if (this.B != null && f > this.l) {
            this.B.d();
            return;
        }
        this.z.onVideoEnded(z, f);
        a(true);
    }

    private void b(boolean z, float f) {
        a(f);
        if (z) {
            a("Error");
        } else if (f > this.l) {
            a("complete");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f) {
        if (this.j == 0 && f >= 25.0f && f < 50.0f) {
            this.j++;
            a("firstQuartile");
        } else if (this.j == 1 && f >= 50.0f && f < 75.0f) {
            this.j++;
            a("midpoint");
        } else if (this.j == 2 && f >= 75.0f && f < 100.0f) {
            this.j++;
            a("thirdQuartile");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.z.onVideoTrackEvent(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.m != null) {
            if (this.n != null) {
                this.n.removeView(this.m);
            }
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.x != null) {
            this.x.clear();
        }
        p();
        if (this.p != null) {
            this.p.setAnimationListener(null);
            this.p.cancel();
            this.p = null;
        }
        if (this.f != null) {
            this.f.removeCallbacks(this.k);
            this.k = null;
            if (this.f.isPlaying()) {
                this.f.stopPlayback();
            } else {
                this.f.suspend();
            }
            ((AudioManager) this.d.getSystemService("audio")).abandonAudioFocus(this);
            this.f.setBackgroundColor(-16777216);
            this.f.post(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayer.11
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoPlayer.this.n != null) {
                        VideoPlayer.this.n.removeView(VideoPlayer.this.f);
                    }
                    VideoPlayer.this.f = null;
                }
            });
        }
        if (this.n != null) {
            if (z) {
                if (this.q == null) {
                    this.q = new AlphaAnimation(1.0f, 0.0f);
                    this.q.setDuration(400L);
                    this.q.setAnimationListener(new Animation.AnimationListener() { // from class: com.rovio.rcs.ads.VideoPlayer.12
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            VideoPlayer.this.q = null;
                            new Handler().post(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayer.12.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (VideoPlayer.this.n != null) {
                                        VideoPlayer.this.n();
                                        VideoPlayer.this.e.removeView(VideoPlayer.this.n);
                                        VideoPlayer.this.n = null;
                                    }
                                }
                            });
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    this.n.startAnimation(this.q);
                    return;
                }
                return;
            }
            n();
            this.e.removeView(this.n);
            this.n = null;
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (this.f != null && this.g) {
            if (this.n.hasWindowFocus()) {
                if (this.s && this.m != null) {
                    this.m.a();
                }
                this.f.seekTo(this.h);
                this.f.start();
                if (!this.f.isPlaying()) {
                    o();
                }
                this.f.postDelayed(this.k, 100L);
                return;
            }
            this.A = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (this.f != null) {
            if (this.x != null) {
                this.x.clear();
            }
            this.g = this.f.isPlaying();
            this.h = this.f.getCurrentPosition();
            this.f.pause();
            this.f.removeCallbacks(this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.r == null) {
            ProgressBar progressBar = new ProgressBar(this.d, null, 16842874);
            progressBar.setIndeterminate(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            RelativeLayout relativeLayout = new RelativeLayout(this.d);
            relativeLayout.setBackgroundColor(-16777216);
            relativeLayout.addView(progressBar, layoutParams);
            this.n.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
            if (this.m != null) {
                this.m.bringToFront();
            }
            this.r = relativeLayout;
            if (this.t == null) {
                this.t = new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayer.13
                    @Override // java.lang.Runnable
                    public void run() {
                        VideoPlayer.this.a(true, VideoPlayer.this.m());
                    }
                };
            }
            this.u = new Handler();
            this.u.postDelayed(this.t, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.r != null) {
            this.u.removeCallbacks(this.t);
            this.o = new AlphaAnimation(1.0f, 0.0f);
            this.o.setDuration(400L);
            this.o.setAnimationListener(new Animation.AnimationListener() { // from class: com.rovio.rcs.ads.VideoPlayer.14
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    new Handler().post(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayer.14.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (VideoPlayer.this.r != null) {
                                if (VideoPlayer.this.n != null) {
                                    VideoPlayer.this.n.removeView(VideoPlayer.this.r);
                                }
                                VideoPlayer.this.r = null;
                            }
                        }
                    });
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            this.r.startAnimation(this.o);
        }
    }
}
