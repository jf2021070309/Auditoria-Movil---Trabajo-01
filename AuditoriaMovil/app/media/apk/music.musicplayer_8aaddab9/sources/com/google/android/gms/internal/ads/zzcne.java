package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import e.a.d.a.a;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
@VisibleForTesting
@ParametersAreNonnullByDefault
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class zzcne extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcml {
    public static final /* synthetic */ int zza = 0;
    @GuardedBy("this")
    private boolean zzA;
    @GuardedBy("this")
    private boolean zzB;
    @GuardedBy("this")
    private zzblt zzC;
    @GuardedBy("this")
    private zzblq zzD;
    @GuardedBy("this")
    private zzaxq zzE;
    @GuardedBy("this")
    private int zzF;
    @GuardedBy("this")
    private int zzG;
    private zzbjx zzH;
    private final zzbjx zzI;
    private zzbjx zzJ;
    private final zzbjy zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.zzl zzO;
    @GuardedBy("this")
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzcl zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map<String, zzcla> zzV;
    private final WindowManager zzW;
    private final zzazb zzX;
    private final zzcoa zzb;
    private final zzaas zzc;
    private final zzbkk zzd;
    private final zzcgz zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzezz zzj;
    private zzfac zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcms zzn;
    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    @GuardedBy("this")
    private IObjectWrapper zzp;
    @GuardedBy("this")
    private zzcob zzq;
    @GuardedBy("this")
    private final String zzr;
    @GuardedBy("this")
    private boolean zzs;
    @GuardedBy("this")
    private boolean zzt;
    @GuardedBy("this")
    private boolean zzu;
    @GuardedBy("this")
    private boolean zzv;
    @GuardedBy("this")
    private Boolean zzw;
    @GuardedBy("this")
    private boolean zzx;
    @GuardedBy("this")
    private final String zzy;
    @GuardedBy("this")
    private zzcnh zzz;

    @VisibleForTesting
    public zzcne(zzcoa zzcoaVar, zzcob zzcobVar, String str, boolean z, boolean z2, zzaas zzaasVar, zzbkk zzbkkVar, zzcgz zzcgzVar, zzbka zzbkaVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzazb zzazbVar, zzezz zzezzVar, zzfac zzfacVar) {
        super(zzcoaVar);
        zzfac zzfacVar2;
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzcoaVar;
        this.zzq = zzcobVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzaasVar;
        this.zzd = zzbkkVar;
        this.zze = zzcgzVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzy = com.google.android.gms.ads.internal.util.zzs.zzy(windowManager);
        this.zzh = zzy;
        this.zzi = zzy.density;
        this.zzX = zzazbVar;
        this.zzj = zzezzVar;
        this.zzk = zzfacVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzcl(zzcoaVar.zza(), this, this, null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            zzcgt.zzg("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zzi(zzcoaVar, zzcgzVar.zza));
        com.google.android.gms.ads.internal.zzt.zze().zza(getContext(), settings);
        setDownloadListener(this);
        zzaX();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(new zzcnm(this, new zzcnl(this) { // from class: com.google.android.gms.internal.ads.zzcnj
                private final zzcml zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzcnl
                public final void zza(Uri uri) {
                    zzcms zzaS = ((zzcne) this.zza).zzaS();
                    if (zzaS == null) {
                        zzcgt.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    } else {
                        zzaS.zzF(uri);
                    }
                }
            }), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbc();
        zzbjy zzbjyVar = new zzbjy(new zzbka(true, "make_wv", this.zzr));
        this.zzK = zzbjyVar;
        zzbjyVar.zzc().zza(null);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() && (zzfacVar2 = this.zzk) != null && zzfacVar2.zzb != null) {
            zzbjyVar.zzc().zzd("gqi", this.zzk.zzb);
        }
        zzbjyVar.zzc();
        zzbjx zzf = zzbka.zzf();
        this.zzI = zzf;
        zzbjyVar.zza("native:view_create", zzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.zzt.zze().zzc(zzcoaVar);
        com.google.android.gms.ads.internal.zzt.zzg().zzm();
    }

    private final synchronized void zzaU(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "AdWebViewImpl.loadUrlUnsafe");
            zzcgt.zzj("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzaV() {
        Boolean zzg = com.google.android.gms.ads.internal.zzt.zzg().zzg();
        this.zzw = zzg;
        if (zzg == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    private final void zzaW() {
        zzbjs.zza(this.zzK.zzc(), this.zzI, "aeh2");
    }

    private final synchronized void zzaX() {
        zzezz zzezzVar = this.zzj;
        if (zzezzVar != null && zzezzVar.zzaj) {
            zzcgt.zzd("Disabling hardware acceleration on an overlay.");
            zzaY();
            return;
        }
        if (!this.zzu && !this.zzq.zzg()) {
            zzcgt.zzd("Enabling hardware acceleration on an AdView.");
            zzaZ();
            return;
        }
        zzcgt.zzd("Enabling hardware acceleration on an overlay.");
        zzaZ();
    }

    private final synchronized void zzaY() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final synchronized void zzaZ() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzba() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzg().zzn();
    }

    private final synchronized void zzbb() {
        Map<String, zzcla> map = this.zzV;
        if (map != null) {
            for (zzcla zzclaVar : map.values()) {
                zzclaVar.release();
            }
        }
        this.zzV = null;
    }

    private final void zzbc() {
        zzbjy zzbjyVar = this.zzK;
        if (zzbjyVar == null) {
            return;
        }
        zzbka zzc = zzbjyVar.zzc();
        zzbjq zze = com.google.android.gms.ads.internal.zzt.zzg().zze();
        if (zze != null) {
            zze.zzb(zzc);
        }
    }

    private final void zzbd(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        zze("onAdVisibilityChanged", hashMap);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final synchronized void destroy() {
        zzbc();
        this.zzQ.zzc();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzq();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzx();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zza(this);
        zzbb();
        this.zzt = true;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzhc)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzY();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
        com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
        zzaU("about:blank");
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!zzX()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzcgt.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzx();
                    com.google.android.gms.ads.internal.zzt.zzy().zza(this);
                    zzbb();
                    zzba();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzX()) {
            zzcgt.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzX()) {
            zzcgt.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final synchronized void loadUrl(String str) {
        if (zzX()) {
            zzcgt.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final void onAdClicked() {
        if (this.zzn != null) {
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzX()) {
            this.zzQ.zzd();
        }
        boolean z = this.zzA;
        zzcms zzcmsVar = this.zzn;
        if (zzcmsVar != null && zzcmsVar.zze()) {
            if (!this.zzB) {
                this.zzn.zzg();
                this.zzn.zzh();
                this.zzB = true;
            }
            zzaM();
            z = true;
        }
        zzbd(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcms zzcmsVar;
        synchronized (this) {
            if (!zzX()) {
                this.zzQ.zze();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzcmsVar = this.zzn) != null && zzcmsVar.zze() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zzg();
                this.zzn.zzh();
                this.zzB = false;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzP(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzcgt.zzd(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaM = zzaM();
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzN();
        if (zzN == null || !zzaM) {
            return;
        }
        zzN.zzB();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01c7 A[Catch: all -> 0x01ed, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b6, B:57:0x00d2, B:59:0x00db, B:58:0x00d7, B:62:0x00e0, B:65:0x00e5, B:67:0x00ed, B:70:0x00f8, B:79:0x011e, B:81:0x0125, B:86:0x012d, B:88:0x013f, B:90:0x014d, B:99:0x0162, B:101:0x01af, B:102:0x01b3, B:104:0x01ba, B:109:0x01c7, B:111:0x01cd, B:112:0x01d0, B:114:0x01d4, B:115:0x01dd, B:118:0x01e8), top: B:124:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013f A[Catch: all -> 0x01ed, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b6, B:57:0x00d2, B:59:0x00db, B:58:0x00d7, B:62:0x00e0, B:65:0x00e5, B:67:0x00ed, B:70:0x00f8, B:79:0x011e, B:81:0x0125, B:86:0x012d, B:88:0x013f, B:90:0x014d, B:99:0x0162, B:101:0x01af, B:102:0x01b3, B:104:0x01ba, B:109:0x01c7, B:111:0x01cd, B:112:0x01d0, B:114:0x01d4, B:115:0x01dd, B:118:0x01e8), top: B:124:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0162 A[Catch: all -> 0x01ed, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b6, B:57:0x00d2, B:59:0x00db, B:58:0x00d7, B:62:0x00e0, B:65:0x00e5, B:67:0x00ed, B:70:0x00f8, B:79:0x011e, B:81:0x0125, B:86:0x012d, B:88:0x013f, B:90:0x014d, B:99:0x0162, B:101:0x01af, B:102:0x01b3, B:104:0x01ba, B:109:0x01c7, B:111:0x01cd, B:112:0x01d0, B:114:0x01d4, B:115:0x01dd, B:118:0x01e8), top: B:124:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcne.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e2) {
            zzcgt.zzg("Could not pause webview.", e2);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e2) {
            zzcgt.zzg("Could not resume webview.", e2);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zze() || this.zzn.zzf()) {
            zzaas zzaasVar = this.zzc;
            if (zzaasVar != null) {
                zzaasVar.zzd(motionEvent);
            }
            zzbkk zzbkkVar = this.zzd;
            if (zzbkkVar != null) {
                zzbkkVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                zzblt zzbltVar = this.zzC;
                if (zzbltVar != null) {
                    zzbltVar.zzb(motionEvent);
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcms) {
            this.zzn = (zzcms) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e2) {
            zzcgt.zzg("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized void zzA() {
        zzblq zzblqVar = this.zzD;
        if (zzblqVar != null) {
            zzblqVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzB(int i2) {
        this.zzM = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzC(int i2) {
        this.zzN = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final int zzD() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final int zzE() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcmc
    public final zzezz zzF() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcnw
    public final View zzH() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzI() {
        zzaW();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzJ(int i2) {
        if (i2 == 0) {
            zzbjs.zza(this.zzK.zzc(), this.zzI, "aebb2");
        }
        zzaW();
        this.zzK.zzc();
        this.zzK.zzc().zzd("close_type", String.valueOf(i2));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.zze.zza);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzK() {
        if (this.zzH == null) {
            zzbjs.zza(this.zzK.zzc(), this.zzI, "aes2");
            this.zzK.zzc();
            zzbjx zzf = zzbka.zzf();
            this.zzH = zzf;
            this.zzK.zza("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zze("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzL() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final Context zzM() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzO() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcnt
    public final synchronized zzcob zzP() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized String zzQ() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final /* bridge */ /* synthetic */ zzcnz zzR() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final WebViewClient zzS() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized boolean zzT() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcnu
    public final zzaas zzU() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized IObjectWrapper zzV() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized boolean zzW() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized boolean zzX() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzba();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcnd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized boolean zzZ() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final boolean zzaA() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcni
    public final zzfac zzaB() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzaC(zzezz zzezzVar, zzfac zzfacVar) {
        this.zzj = zzezzVar;
        this.zzk = zzfacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzaD(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzu(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final zzfsm<String> zzaE() {
        zzbkk zzbkkVar = this.zzd;
        return zzbkkVar == null ? zzfsd.zza(null) : zzbkkVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zzn.zzo(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final void zzaG(boolean z, int i2, boolean z2) {
        this.zzn.zzq(z, i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final void zzaH(boolean z, int i2, String str, boolean z2) {
        this.zzn.zzr(z, i2, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final void zzaI(boolean z, int i2, String str, String str2, boolean z2) {
        this.zzn.zzs(z, i2, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final void zzaJ(com.google.android.gms.ads.internal.util.zzbu zzbuVar, zzedq zzedqVar, zzdvi zzdviVar, zzffc zzffcVar, String str, String str2, int i2) {
        this.zzn.zzp(zzbuVar, zzedqVar, zzdviVar, zzffcVar, str, str2, i2);
    }

    public final boolean zzaM() {
        int i2;
        int i3;
        boolean z = false;
        if (this.zzn.zzd() || this.zzn.zze()) {
            zzber.zza();
            DisplayMetrics displayMetrics = this.zzh;
            int zzq = zzcgm.zzq(displayMetrics, displayMetrics.widthPixels);
            zzber.zza();
            DisplayMetrics displayMetrics2 = this.zzh;
            int zzq2 = zzcgm.zzq(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i2 = zzq;
                i3 = zzq2;
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzT = com.google.android.gms.ads.internal.util.zzs.zzT(zza2);
                zzber.zza();
                int zzq3 = zzcgm.zzq(this.zzh, zzT[0]);
                zzber.zza();
                i3 = zzcgm.zzq(this.zzh, zzT[1]);
                i2 = zzq3;
            }
            int i4 = this.zzS;
            if (i4 == zzq && this.zzR == zzq2 && this.zzT == i2 && this.zzU == i3) {
                return false;
            }
            z = (i4 == zzq && this.zzR == zzq2) ? true : true;
            this.zzS = zzq;
            this.zzR = zzq2;
            this.zzT = i2;
            this.zzU = i3;
            new zzbyp(this, "").zzk(zzq, zzq2, i2, i3, this.zzh.density, this.zzW.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    public final synchronized void zzaN(String str) {
        if (zzX()) {
            zzcgt.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @TargetApi(19)
    public final synchronized void zzaO(String str, ValueCallback<String> valueCallback) {
        if (zzX()) {
            zzcgt.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    public final void zzaP(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaN(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
            return;
        }
        if (zzaR() == null) {
            zzaV();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
        }
    }

    @VisibleForTesting
    public final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzg().zzf(bool);
    }

    @VisibleForTesting
    public final synchronized Boolean zzaR() {
        return this.zzw;
    }

    public final zzcms zzaS() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized boolean zzaa() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzab(String str, zzbpr<? super zzcml> zzbprVar) {
        zzcms zzcmsVar = this.zzn;
        if (zzcmsVar != null) {
            zzcmsVar.zzu(str, zzbprVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzac(String str, zzbpr<? super zzcml> zzbprVar) {
        zzcms zzcmsVar = this.zzn;
        if (zzcmsVar != null) {
            zzcmsVar.zzv(str, zzbprVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzad(String str, Predicate<zzbpr<? super zzcml>> predicate) {
        zzcms zzcmsVar = this.zzn;
        if (zzcmsVar != null) {
            zzcmsVar.zzw(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzaf(zzcob zzcobVar) {
        this.zzq = zzcobVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzag(boolean z) {
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaX();
        if (z != z2) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzL)).booleanValue() || !this.zzq.zzg()) {
                new zzbyp(this, "").zzj(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzai(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zza(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzaj(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzt(this.zzn.zzd(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzak(IObjectWrapper iObjectWrapper) {
        this.zzp = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzal(int i2) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzw(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzam(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzO = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzan(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzao() {
        if (this.zzJ == null) {
            this.zzK.zzc();
            zzbjx zzf = zzbka.zzf();
            this.zzJ = zzf;
            this.zzK.zza("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzap(zzblt zzbltVar) {
        this.zzC = zzbltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized zzblt zzaq() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzar(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i2 = this.zzF + (true != z ? -1 : 1);
        this.zzF = i2;
        if (i2 > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzas() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzat(String str, String str2, String str3) {
        String str4;
        if (zzX()) {
            zzcgt.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) zzbet.zzc().zzc(zzbjl.zzK);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e2) {
            zzcgt.zzj("Unable to build MRAID_ENV", e2);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, zzcns.zza(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzau() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzav(boolean z) {
        this.zzn.zzD(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzaw(zzblq zzblqVar) {
        this.zzD = zzblqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzax(zzaxq zzaxqVar) {
        this.zzE = zzaxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized zzaxq zzay() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final boolean zzaz(final boolean z, final int i2) {
        destroy();
        this.zzX.zzb(new zzaza(z, i2) { // from class: com.google.android.gms.internal.ads.zzcnb
            private final boolean zza;
            private final int zzb;

            {
                this.zza = z;
                this.zzb = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzaza
            public final void zza(zzbao zzbaoVar) {
                boolean z2 = this.zza;
                int i3 = this.zzb;
                int i4 = zzcne.zza;
                zzbct zzc = zzbcu.zzc();
                if (zzc.zza() != z2) {
                    zzc.zzb(z2);
                }
                zzc.zzc(i3);
                zzbaoVar.zzj(zzc.zzah());
            }
        });
        this.zzX.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdio
    public final void zzb() {
        zzcms zzcmsVar = this.zzn;
        if (zzcmsVar != null) {
            zzcmsVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzbl(String str, String str2) {
        zzaP(a.t(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbm() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbm();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbn() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final void zzc(zzawc zzawcVar) {
        boolean z;
        synchronized (this) {
            z = zzawcVar.zzj;
            this.zzA = z;
        }
        zzbd(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        zzcgt.zzd(sb2.length() != 0 ? "Dispatching AFMA event: ".concat(sb2) : new String("Dispatching AFMA event: "));
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zze(String str, Map<String, ?> map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.zzt.zzc().zzj(map));
        } catch (JSONException unused) {
            zzcgt.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final zzciq zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzg(boolean z) {
        this.zzn.zzB(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcjb
    public final synchronized zzcnh zzh() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final zzbjx zzi() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcnn, com.google.android.gms.internal.ads.zzcjb
    public final Activity zzj() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcjb
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzN();
        if (zzN != null) {
            zzN.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized String zzm() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized String zzn() {
        zzfac zzfacVar = this.zzk;
        if (zzfacVar != null) {
            return zzfacVar.zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized void zzo(int i2) {
        this.zzL = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized int zzp() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcjb
    public final zzbjy zzq() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzr(String str, JSONObject jSONObject) {
        zzbl(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized zzcla zzs(String str) {
        Map<String, zzcla> map = this.zzV;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcnv, com.google.android.gms.internal.ads.zzcjb
    public final zzcgz zzt() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcjb
    public final synchronized void zzu(String str, zzcla zzclaVar) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzclaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzv(boolean z, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j2));
        zze("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzw(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcjb
    public final synchronized void zzx(zzcnh zzcnhVar) {
        if (this.zzz != null) {
            zzcgt.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcnhVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final int zzy() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final int zzz() {
        return getMeasuredWidth();
    }
}
