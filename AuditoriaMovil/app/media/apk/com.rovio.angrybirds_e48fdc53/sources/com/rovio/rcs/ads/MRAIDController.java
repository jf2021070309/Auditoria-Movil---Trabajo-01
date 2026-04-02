package com.rovio.rcs.ads;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.rovio.fusion.Globals;
import com.rovio.rcs.ads.WebViewAd;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class MRAIDController {
    private static final String TAG = "MRAIDController";
    private WebViewAd.MraidListener b;
    private float d;
    private boolean f;
    private final boolean a = false;
    private ViewState c = ViewState.DEFAULT;
    private boolean e = false;
    private int g = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum ViewState {
        LOADING,
        DEFAULT,
        EXPANDED,
        HIDDEN,
        RESIZED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MRAIDController(WebViewAd.MraidListener mraidListener, boolean z) {
        this.f = false;
        this.b = mraidListener;
        this.f = z;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Globals.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.d = displayMetrics.density;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.e = z;
        a("{viewable: " + this.e + "}", 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        a("{currentPosition:{x: " + Math.round(i / this.d) + ", y: " + Math.round(i2 / this.d) + ", width: " + Math.round(i3 / this.d) + ", height: " + Math.round(i4 / this.d) + "}}", 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.c == ViewState.EXPANDED || this.c == ViewState.RESIZED;
    }

    private String b() {
        switch (this.c) {
            case LOADING:
                return "loading";
            case DEFAULT:
                return DownloadSettingKeys.BugFix.DEFAULT;
            case EXPANDED:
                return "expanded";
            case HIDDEN:
                return "hidden";
            case RESIZED:
                return "resized";
            default:
                return "";
        }
    }

    @JavascriptInterface
    public void expand(String str, boolean z) {
        if ((this.c == ViewState.DEFAULT || this.c == ViewState.RESIZED) && !this.f) {
            if (!URLUtil.isValidUrl(str)) {
                str = null;
            }
            this.c = ViewState.EXPANDED;
            this.b.a(str);
            this.b.a(z, 0);
            a("{state: '" + b() + "'}", 1);
        }
    }

    private int a(String str) {
        if (str.equals("top-left")) {
            return 51;
        }
        if (str.equals("top-right")) {
            return 53;
        }
        if (str.equals("center")) {
            return 17;
        }
        if (str.equals("bottom-left")) {
            return 83;
        }
        if (str.equals("bottom-right")) {
            return 85;
        }
        if (str.equals("top-center")) {
            return 49;
        }
        if (!str.equals("bottom-center")) {
            return 0;
        }
        return 81;
    }

    @JavascriptInterface
    public void resize(int i, int i2, int i3, int i4, String str, boolean z) {
        if ((this.c == ViewState.DEFAULT || this.c == ViewState.RESIZED) && !this.f) {
            this.c = ViewState.RESIZED;
            this.b.a(Math.round(this.d * i3), Math.round(this.d * i4), Math.round(this.d * i), Math.round(this.d * i2), z);
            this.b.a(true, a(str));
            a("{state: '" + b() + "'}", 1);
        }
    }

    @JavascriptInterface
    public void useCustomClose(boolean z) {
        if (this.f || a()) {
            this.b.a(z, 0);
        }
    }

    @JavascriptInterface
    public void open(String str) {
        this.b.b(str);
    }

    @JavascriptInterface
    public void playVideo(String str) {
        this.b.c(str);
    }

    @JavascriptInterface
    public void close() {
        if (a()) {
            this.b.b();
            this.g &= -3;
            this.c = ViewState.DEFAULT;
        } else {
            this.b.a();
            this.c = ViewState.HIDDEN;
        }
        a("{ state: '" + b() + "' }", 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        if ((this.g & i) != i) {
            this.g |= i;
            Display defaultDisplay = Globals.getActivity().getWindowManager().getDefaultDisplay();
            a("{state:'" + b() + "',screenSize:{width:" + Math.round(defaultDisplay.getWidth() / this.d) + ",height:" + Math.round(defaultDisplay.getHeight() / this.d) + "},viewable:" + this.e + ",maxSize:{width:" + Math.round(Globals.getRootViewGroup().getWidth() / this.d) + ",height:" + Math.round(Globals.getRootViewGroup().getHeight() / this.d) + "}}", i);
            a("{placementType : '" + (this.f ? GMAdConstant.RIT_TYPE_INTERSTITIAL : "inline") + "'}", i);
            b(i);
            this.b.a("window.mraidbridge.fireReadyEvent()", i);
        }
    }

    void b(int i) {
        a("{support:{sms:false,tel:false,calendar:false,storePicture:false,inlineVideo:" + c() + "}}", i);
    }

    private boolean c() {
        if (Build.VERSION.SDK_INT < 11) {
            return false;
        }
        return Globals.getRootViewGroup().isHardwareAccelerated();
    }

    private void a(String str, int i) {
        String str2 = "window.mraidbridge.fireChangeEvent(" + str + ");";
        WebViewAd.MraidListener mraidListener = this.b;
        if (this.c != ViewState.EXPANDED) {
            i &= -3;
        }
        mraidListener.a(str2, i);
    }
}
