package com.rovio.rcs.ads;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.internal.ServerProtocol;
import com.rovio.rcs.ads.AdsWebView;
import com.rovio.rcs.ads.VideoPlayer;
import com.rovio.rcs.ads.VideoPlayerBridge;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class WebViewAd extends WebViewClient {
    private static final boolean ENABLE_JAVA_CONSOLE_PRINTING = false;
    private static final String TAG = "WebViewAd";
    private static final int TRANSPARENT_COLOR;
    private static final boolean VERBOSE_LOGGING = false;
    private int p;
    private Runnable u;
    private WebViewAdListener w;
    private Activity x;
    private ViewGroup y;
    private int a = -1;
    private int b = -1;
    private int c = -1;
    private int d = -1;
    private int e = 0;
    private FrameLayout f = null;
    private FrameLayout g = null;
    private WebView h = null;
    private WebView i = null;
    private boolean j = false;
    private boolean k = true;
    private int l = 0;
    private boolean m = false;
    private int n = 53;
    private boolean o = false;
    private ImageButton q = null;
    private boolean r = true;
    private JSBindings s = JSBindings.NONE;
    private Runnable t = null;
    private MRAIDController v = null;
    private boolean z = false;
    private VideoPlayerBridge.VideoPlayerWrapper A = null;
    private boolean B = false;
    private BannerAnimation C = BannerAnimation.VERTICAL_SLIDE;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum BannerAnimation {
        NONE,
        FADE,
        FADE_IN,
        VERTICAL_SLIDE
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum JSBindings {
        NONE,
        ROVIO,
        MRAID
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface WebViewAdListener {
        void onLinkClicked(String str);

        void onRovioTrackEvent(String str, String str2);

        void onUrlLoaded(boolean z);

        void onVideoEnded(String str, float f);

        void onVideoStarted();

        void onViewCollapsed();

        void onViewExpanded();

        void onViewHidden();

        void onViewVisible();
    }

    static {
        TRANSPARENT_COLOR = Build.VERSION.SDK_INT >= 11 ? 16777216 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebViewAd(WebViewAdListener webViewAdListener, Activity activity, ViewGroup viewGroup) {
        this.w = null;
        this.w = webViewAdListener;
        this.x = activity;
        this.y = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebViewAd(WebViewAdListener webViewAdListener, Activity activity) {
        this.w = null;
        this.w = webViewAdListener;
        this.x = activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup) {
        this.y = viewGroup;
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WebViewAdListener webViewAdListener) {
        this.w = webViewAdListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebViewAdListener a() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.r = false;
        this.o = Build.VERSION.SDK_INT <= 17;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f) {
        this.e = Math.round(100.0f * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.k = true;
        this.l = 0;
        this.C = BannerAnimation.VERTICAL_SLIDE;
        this.p = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("userClosable")) {
                this.k = jSONObject.getBoolean("userClosable");
            }
            if (this.k && jSONObject.has("minViewTimeSeconds")) {
                this.l = jSONObject.getInt("minViewTimeSeconds") * 1000;
            }
            if (jSONObject.has("animation")) {
                String string = jSONObject.getString("animation");
                if (string.equals("none")) {
                    this.C = BannerAnimation.NONE;
                } else if (string.equals("fade")) {
                    this.C = BannerAnimation.FADE;
                } else if (string.equals("fade-in")) {
                    this.C = BannerAnimation.FADE_IN;
                } else if (string.equals("vertical-slide")) {
                    this.C = BannerAnimation.VERTICAL_SLIDE;
                }
            }
            if (jSONObject.has("scrollable")) {
                this.z = jSONObject.getBoolean("scrollable");
            }
            if (jSONObject.has("disableHwAcceleration")) {
                this.o = jSONObject.getBoolean("disableHwAcceleration");
            }
            if (jSONObject.has("autoHideSeconds")) {
                this.p = jSONObject.getInt("autoHideSeconds") * 1000;
            }
        } catch (JSONException e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        if (str.equals("rovio")) {
            this.s = JSBindings.ROVIO;
        } else if (str.equals("mraid")) {
            this.s = JSBindings.MRAID;
        } else {
            this.s = JSBindings.NONE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.A != null) {
            this.A.destroy();
        }
        if (this.f != null) {
            this.y.removeView(this.f);
            this.f = null;
        }
        if (this.i != null) {
            this.i.destroy();
            this.i = null;
        }
        if (this.h != null) {
            this.h.destroy();
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str) {
        this.h = b(this.r);
        g();
        this.j = false;
        j();
        this.h.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        this.h = b(this.r);
        g();
        this.j = false;
        j();
        this.h.loadDataWithBaseURL(null, str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.h != null) {
            this.j = false;
            this.h.reload();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (this.f != null && this.f.getVisibility() != 0) {
            c(this.r && this.k && this.l == 0);
            this.y.bringChildToFront(this.f);
            this.h.requestFocus();
            Animation animation = null;
            if (this.r || this.C == BannerAnimation.FADE || this.C == BannerAnimation.FADE_IN) {
                animation = new AlphaAnimation(0.0f, 1.0f);
                if (this.r) {
                    animation.setInterpolator(new AccelerateInterpolator(4.0f));
                }
            } else if (this.C == BannerAnimation.VERTICAL_SLIDE) {
                animation = new TranslateAnimation(0.0f, 0.0f, -(this.b + this.d), 0.0f);
            }
            if (animation != null) {
                animation.setDuration(400L);
                animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.rovio.rcs.ads.WebViewAd.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation2) {
                        if (WebViewAd.this.r && WebViewAd.this.k && WebViewAd.this.l > 0) {
                            WebViewAd.this.t = new Runnable() { // from class: com.rovio.rcs.ads.WebViewAd.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    WebViewAd.this.c(true);
                                    WebViewAd.this.t = null;
                                }
                            };
                            WebViewAd.this.f.postDelayed(WebViewAd.this.t, WebViewAd.this.l);
                        }
                        WebViewAd.this.w.onViewVisible();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation2) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation2) {
                    }
                });
                this.f.startAnimation(animation);
            }
            this.f.setVisibility(0);
            this.f.requestLayout();
            e(true);
            if (this.r && this.p > 0) {
                this.u = new Runnable() { // from class: com.rovio.rcs.ads.WebViewAd.2
                    @Override // java.lang.Runnable
                    public void run() {
                        WebViewAd.this.h();
                    }
                };
                this.f.postDelayed(this.u, this.p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r7) {
        /*
            r6 = this;
            r1 = 0
            r5 = 4
            r4 = 0
            android.widget.FrameLayout r0 = r6.f
            if (r0 == 0) goto Lf
            android.widget.FrameLayout r0 = r6.f
            int r0 = r0.getVisibility()
            if (r0 != r5) goto L10
        Lf:
            return
        L10:
            android.widget.FrameLayout r0 = r6.f
            r0.clearAnimation()
            if (r7 == 0) goto L6a
            boolean r0 = r6.r
            if (r0 != 0) goto L21
            com.rovio.rcs.ads.WebViewAd$BannerAnimation r0 = r6.C
            com.rovio.rcs.ads.WebViewAd$BannerAnimation r2 = com.rovio.rcs.ads.WebViewAd.BannerAnimation.FADE
            if (r0 != r2) goto L52
        L21:
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4)
        L28:
            if (r0 == 0) goto L65
            r2 = 400(0x190, double:1.976E-321)
            r0.setDuration(r2)
            com.rovio.rcs.ads.WebViewAd$3 r2 = new com.rovio.rcs.ads.WebViewAd$3
            r2.<init>()
            r0.setAnimationListener(r2)
            android.widget.FrameLayout r2 = r6.f
            r2.startAnimation(r0)
        L3c:
            android.widget.FrameLayout r0 = r6.f
            r0.setVisibility(r5)
            java.lang.Runnable r0 = r6.t
            if (r0 == 0) goto L4e
            android.widget.FrameLayout r0 = r6.f
            java.lang.Runnable r2 = r6.t
            r0.removeCallbacks(r2)
            r6.t = r1
        L4e:
            r6.f()
            goto Lf
        L52:
            com.rovio.rcs.ads.WebViewAd$BannerAnimation r0 = r6.C
            com.rovio.rcs.ads.WebViewAd$BannerAnimation r2 = com.rovio.rcs.ads.WebViewAd.BannerAnimation.VERTICAL_SLIDE
            if (r0 != r2) goto L6a
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            int r2 = r6.b
            int r3 = r6.d
            int r2 = r2 + r3
            int r2 = -r2
            float r2 = (float) r2
            r0.<init>(r4, r4, r4, r2)
            goto L28
        L65:
            r0 = 0
            r6.e(r0)
            goto L3c
        L6a:
            r0 = r1
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rovio.rcs.ads.WebViewAd.a(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.u != null) {
            this.f.removeCallbacks(this.u);
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str) {
        a(this.h, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebView b(boolean z) {
        AdsWebView adsWebView = new AdsWebView(this.x);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (z) {
            layoutParams.gravity = 17;
        }
        adsWebView.setLayoutParams(layoutParams);
        adsWebView.setWebViewClient(this);
        if (z) {
            adsWebView.setBackgroundColor(-16777216);
        } else {
            adsWebView.setBackgroundColor(TRANSPARENT_COLOR);
        }
        adsWebView.getSettings().setJavaScriptEnabled(true);
        adsWebView.getSettings().setAllowFileAccess(false);
        adsWebView.getSettings().setGeolocationEnabled(false);
        adsWebView.setScrollBarStyle(0);
        adsWebView.setOverScrollMode(2);
        adsWebView.setOverScrollMode(2);
        try {
            if (Build.VERSION.SDK_INT >= 11 && (Build.VERSION.SDK_INT < 16 || this.o)) {
                adsWebView.setLayerType(1, null);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                adsWebView.getSettings().setLoadWithOverviewMode(true);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    WebSettings.class.getMethod("setMixedContentMode", Integer.TYPE).invoke(adsWebView.getSettings(), 0);
                } catch (Exception e) {
                    Log.e(TAG, "Failed setMixedContentMode:" + e.toString());
                }
            }
        } catch (Exception e2) {
            Log.e(TAG, "Tried to call non-existent method:" + e2.toString());
        }
        adsWebView.setHorizontalScrollBarEnabled(false);
        adsWebView.setVerticalScrollBarEnabled(false);
        adsWebView.setOnKeyListener(new View.OnKeyListener() { // from class: com.rovio.rcs.ads.WebViewAd.4
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == 4) {
                    if (WebViewAd.this.r || WebViewAd.this.s == JSBindings.MRAID) {
                        boolean z2 = WebViewAd.this.v != null && WebViewAd.this.v.a();
                        if ((WebViewAd.this.k && WebViewAd.this.t == null && WebViewAd.this.r) || z2) {
                            WebViewAd.this.h();
                        }
                        return WebViewAd.this.r || z2;
                    }
                    return false;
                }
                return false;
            }
        });
        adsWebView.setOnTouchListener(new View.OnTouchListener() { // from class: com.rovio.rcs.ads.WebViewAd.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (WebViewAd.this.r) {
                    WebViewAd.this.f();
                } else if (!WebViewAd.this.z) {
                    return !(WebViewAd.this.v != null && WebViewAd.this.v.a()) && motionEvent.getAction() == 2;
                }
                return false;
            }
        });
        return adsWebView;
    }

    private void g() {
        if (this.f == null && this.y != null && this.h != null) {
            if (!this.r && this.e > 0) {
                this.h.setInitialScale(this.e);
            }
            this.f = new FrameLayout(this.x);
            this.f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f.setVisibility(4);
            this.g = new FrameLayout(this.x);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.c, this.d);
            if (this.a >= 0 && this.b >= 0) {
                layoutParams.gravity = 48;
                layoutParams.leftMargin = this.a;
                layoutParams.topMargin = this.b;
            }
            this.g.addView(this.h);
            this.f.addView(this.g, layoutParams);
            this.y.addView(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.s == JSBindings.MRAID) {
            this.v.close();
        } else {
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        if (z) {
            if (this.q == null) {
                this.q = new ImageButton(this.x);
                this.q.setBackgroundResource(0);
                this.q.setVisibility(8);
                this.q.setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.ads.WebViewAd.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        WebViewAd.this.h();
                    }
                });
            }
            if (this.m) {
                this.q.setImageDrawable(null);
            } else {
                this.q.setImageResource(this.x.getResources().getIdentifier("rovio_ads_close_btn_selector", "drawable", this.x.getPackageName()));
            }
            FrameLayout frameLayout = this.i != null ? this.f : this.g;
            this.q.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, this.n));
            int round = Math.round(14.0f * this.x.getResources().getDisplayMetrics().density);
            this.q.setPadding(0, round, round, 0);
            if (this.q.getVisibility() != 0) {
                this.q.setVisibility(0);
                frameLayout.addView(this.q);
            } else {
                this.q.requestLayout();
            }
            this.q.bringToFront();
        } else if (this.q != null && this.q.getVisibility() == 0) {
            ViewGroup viewGroup = (ViewGroup) this.q.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.q);
            }
            this.q.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WebView webView) {
        if (this.v == null) {
            this.v = new MRAIDController(new MraidListener(), this.r);
        }
        webView.addJavascriptInterface(this.v, "MRAIDController");
        a(webView, MRAIDJs.MRAID_JS);
    }

    private void i() {
        this.h.addJavascriptInterface(new RovioTrackingInterface(), "RovioTrackingInterface");
        a(this.h, "if (typeof(Rovio) == 'undefined') { Rovio = {}; };if (typeof(Rovio.Platform) == 'undefined') { Rovio.Platform = {}; };if (typeof(Rovio.Platform.WebView) == 'undefined') { Rovio.Platform.WebView = {}; };if (typeof(Rovio.Skynest) == 'undefined') { Rovio.Skynest = {}; };if (typeof(Rovio.Skynest.Ads) == 'undefined') { Rovio.Skynest.Ads = {}; };Rovio.Skynest.Ads.trackImpression = function (adId) {RovioTrackingInterface.rovioTrackEvent(\"impression\", adId);};Rovio.Skynest.Ads.trackClick = function (linkId) {RovioTrackingInterface.rovioTrackEvent(\"click\", linkId);};Rovio.Skynest.Ads.playVideo = function (videoUrl, videoId, link, linkId) {RovioTrackingInterface.rovioPlayVideo(videoUrl, videoId, link, linkId);};Rovio.Skynest.Ads.trackCustom = function (customId) {RovioTrackingInterface.rovioTrackEvent(\"custom\", customId);};Rovio.Skynest.Ads.close = function () {RovioTrackingInterface.close();};");
    }

    private void j() {
        if (this.s == JSBindings.ROVIO) {
            i();
        } else if (this.s == JSBindings.MRAID) {
            a(this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WebView webView, String str) {
        if (webView != null) {
            webView.loadUrl("javascript:" + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        this.w.onLinkClicked(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final String str2, final String str3, final String str4) {
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewAd.8
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewAd.this.f != null && !WebViewAd.this.B && WebViewAd.this.f.getVisibility() != 4) {
                    if (WebViewAd.this.A != null) {
                        WebViewAd.this.A.destroy();
                    }
                    WebViewAd.this.A = new VideoPlayerBridge.VideoPlayerWrapper(new VideoPlayer.VideoPlayerListener() { // from class: com.rovio.rcs.ads.WebViewAd.8.1
                        @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
                        public void onVideoEnded(boolean z, float f) {
                            if (WebViewAd.this.f.getVisibility() != 4) {
                                WebViewAd.this.w.onVideoEnded(str2, f);
                            }
                            WebViewAd.this.B = false;
                        }

                        @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
                        public void onVideoTrackEvent(String str5) {
                            if (str5 == "start" && WebViewAd.this.f.getVisibility() != 4) {
                                WebViewAd.this.w.onVideoStarted();
                            }
                        }

                        @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
                        public void onCustomControlClicked(String str5, float f) {
                            if (WebViewAd.this.f.getVisibility() != 4) {
                                WebViewAd.this.w.onLinkClicked(str3);
                                WebViewAd.this.w.onRovioTrackEvent("click", str4);
                            }
                        }

                        @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
                        public void onEndCardClick(String str5) {
                        }

                        @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
                        public void onEndCardTrackEvent(String str5, String str6) {
                        }
                    });
                    WebViewAd.this.A.setUIMode(2, "{\"userClosable\": true, \"linkDisabled\": " + (str3.isEmpty() ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false") + ", \"rewardable\": true}");
                    WebViewAd.this.A.load(str);
                    WebViewAd.this.A.show();
                    WebViewAd.this.B = true;
                }
            }
        });
    }

    private int k() {
        if (Build.VERSION.SDK_INT >= 13) {
            Point point = new Point();
            this.x.getWindowManager().getDefaultDisplay().getSize(point);
            return point.x;
        }
        return this.x.getWindowManager().getDefaultDisplay().getWidth();
    }

    private int l() {
        if (Build.VERSION.SDK_INT >= 13) {
            Point point = new Point();
            this.x.getWindowManager().getDefaultDisplay().getSize(point);
            return point.y;
        }
        return this.x.getWindowManager().getDefaultDisplay().getHeight();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f(str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.h != null && !this.j && this.s == JSBindings.MRAID && this.v != null) {
            if (webView == this.h) {
                this.v.a(1);
                ((AdsWebView) webView).a(new AdsWebView.OnSizeChangedListener() { // from class: com.rovio.rcs.ads.WebViewAd.9
                    @Override // com.rovio.rcs.ads.AdsWebView.OnSizeChangedListener
                    public void onSizeChanged(int i, int i2, int i3, int i4) {
                        if (WebViewAd.this.v != null) {
                            WebViewAd.this.v.a(WebViewAd.this.g.getLeft() + i, WebViewAd.this.g.getTop() + i2, i3 - i, i4 - i2);
                        }
                    }
                });
            } else if (webView == this.i) {
                this.v.a(2);
                ((AdsWebView) webView).a(new AdsWebView.OnSizeChangedListener() { // from class: com.rovio.rcs.ads.WebViewAd.10
                    @Override // com.rovio.rcs.ads.AdsWebView.OnSizeChangedListener
                    public void onSizeChanged(int i, int i2, int i3, int i4) {
                        if (WebViewAd.this.v != null) {
                            WebViewAd.this.v.a(i, i2, i3 - i, i4 - i2);
                        }
                    }
                });
            }
            if (this.r) {
                if (this.y != null) {
                    this.v.a(0, 0, this.y.getWidth(), this.y.getHeight());
                } else {
                    this.v.a(0, 0, k(), l());
                }
            } else {
                this.v.a(this.a, this.b, this.c, this.d);
            }
        }
        if (webView == this.h) {
            d(!this.j);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.j = true;
        d(false);
    }

    private void d(boolean z) {
        if (this.h != null) {
            this.w.onUrlLoaded(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        if (this.s == JSBindings.ROVIO) {
            e("if (typeof Rovio.Platform.WebView.onVisibilityChanged === 'function') {Rovio.Platform.WebView.onVisibilityChanged(" + (z ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false") + ");}");
        } else if (this.s == JSBindings.MRAID && this.v != null) {
            this.v.a(z);
        }
        if (!z) {
            this.w.onViewHidden();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class RovioTrackingInterface {
        RovioTrackingInterface() {
        }

        @JavascriptInterface
        public void rovioTrackEvent(String str, String str2) {
            WebViewAd.this.w.onRovioTrackEvent(str, str2);
        }

        @JavascriptInterface
        public void rovioPlayVideo(String str, String str2, String str3, String str4) {
            WebViewAd.this.a(str, str2, str3, str4);
        }

        @JavascriptInterface
        public boolean rovioLaunchApp(String str) {
            PackageManager packageManager = WebViewAd.this.x.getPackageManager();
            try {
                packageManager.getPackageInfo(str, 1);
                try {
                    WebViewAd.this.x.startActivity(packageManager.getLaunchIntentForPackage(str));
                    return true;
                } catch (Exception e) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                return false;
            }
        }

        @JavascriptInterface
        public void close() {
            WebViewAd.this.a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewAd.RovioTrackingInterface.1
                @Override // java.lang.Runnable
                public void run() {
                    WebViewAd.this.a(false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        this.x.runOnUiThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        this.g.setLayoutParams(layoutParams);
        this.g.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class MraidListener {
        static final int BOTH_VIEWS = 3;
        static final int EXPANDED_VIEW = 2;
        static final int MAIN_VIEW = 1;
        private static final String TAG = "MraidListener";

        MraidListener() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            WebViewAd.this.a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewAd.MraidListener.1
                @Override // java.lang.Runnable
                public void run() {
                    if (WebViewAd.this.f != null) {
                        WebViewAd.this.a(true);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            WebViewAd.this.a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewAd.MraidListener.2
                @Override // java.lang.Runnable
                public void run() {
                    if (WebViewAd.this.f != null) {
                        if (WebViewAd.this.i != null) {
                            WebViewAd.this.i.setVisibility(8);
                            WebViewAd.this.f.removeView(WebViewAd.this.i);
                            WebViewAd.this.i.destroy();
                            WebViewAd.this.i = null;
                        } else {
                            WebViewAd.this.b(WebViewAd.this.a, WebViewAd.this.b, WebViewAd.this.c, WebViewAd.this.d);
                            WebViewAd.this.h.setBackgroundColor(WebViewAd.TRANSPARENT_COLOR);
                        }
                        WebViewAd.this.c(false);
                        WebViewAd.this.w.onViewCollapsed();
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(final String str) {
            WebViewAd.this.a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewAd.MraidListener.3
                @Override // java.lang.Runnable
                public void run() {
                    if (WebViewAd.this.f != null) {
                        if (WebViewAd.this.i == null && str != null) {
                            WebViewAd.this.i = WebViewAd.this.b(true);
                            WebViewAd.this.i.setVisibility(0);
                            WebViewAd.this.f.addView(WebViewAd.this.i, new FrameLayout.LayoutParams(-1, -1, 17));
                            WebViewAd.this.a(WebViewAd.this.i);
                            WebViewAd.this.i.loadUrl(str);
                        } else if (str == null) {
                            WebViewAd.this.b(0, 0, -1, -1);
                            if (Build.VERSION.SDK_INT >= 11) {
                                WebViewAd.this.h.setBackgroundColor(1996488704);
                            }
                        }
                        WebViewAd.this.w.onViewExpanded();
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a(int i, int i2, int i3) {
            return Math.max(i2, Math.min(i, i3));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(final int i, final int i2, final int i3, final int i4, final boolean z) {
            WebViewAd.this.a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewAd.MraidListener.4
                @Override // java.lang.Runnable
                public void run() {
                    if (WebViewAd.this.f != null) {
                        int i5 = i;
                        int i6 = i2;
                        int i7 = i3;
                        int i8 = i4;
                        if (!z) {
                            i7 = MraidListener.this.a(i3, 1, WebViewAd.this.f.getWidth());
                            i8 = MraidListener.this.a(i4, 1, WebViewAd.this.f.getHeight());
                            i5 = MraidListener.this.a(i, 0, WebViewAd.this.f.getWidth() - i3);
                            i6 = MraidListener.this.a(i2, 0, WebViewAd.this.f.getHeight() - i4);
                        }
                        WebViewAd.this.b(i5, i6, i7, i8);
                        WebViewAd.this.w.onViewExpanded();
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(String str) {
            WebViewAd.this.f(str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(String str) {
            WebViewAd.this.a(str, "", "", "");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(final boolean z, final int i) {
            WebViewAd.this.a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewAd.MraidListener.5
                @Override // java.lang.Runnable
                public void run() {
                    WebViewAd.this.m = z;
                    if (i != 0) {
                        WebViewAd.this.n = i;
                    }
                    if (WebViewAd.this.f != null && WebViewAd.this.t == null) {
                        WebViewAd.this.c(true);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(final String str, final int i) {
            WebViewAd.this.a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewAd.MraidListener.6
                @Override // java.lang.Runnable
                public void run() {
                    if ((i & 1) == 1) {
                        WebViewAd.this.a(WebViewAd.this.h, str);
                    }
                    if ((i & 2) == 2) {
                        WebViewAd.this.a(WebViewAd.this.i, str);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (this.h != null) {
            this.h.resumeTimers();
        }
    }
}
