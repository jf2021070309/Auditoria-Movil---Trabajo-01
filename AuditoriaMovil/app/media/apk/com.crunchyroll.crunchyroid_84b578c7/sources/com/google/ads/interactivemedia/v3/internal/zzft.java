package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.hf0.a;
import com.amazon.aps.iva.i9.g;
import com.amazon.aps.iva.j9.c0;
import com.amazon.aps.iva.j9.f0;
import com.amazon.aps.iva.j9.g0;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
@SuppressLint({"SetJavaScriptEnabled", "NewApi"})
/* loaded from: classes2.dex */
public final class zzft {
    private final WebView zza;
    private final Handler zzb;
    private zzfq zzc;
    private boolean zzd = false;

    public zzft(Handler handler, WebView webView, Uri uri) {
        this.zzb = handler;
        this.zza = webView;
        webView.setBackgroundColor(0);
        webView.getSettings().setMixedContentMode(0);
        webView.getSettings().setJavaScriptEnabled(true);
        if (w.G("WEB_MESSAGE_LISTENER")) {
            String format = String.format("%s://%s", uri.getScheme(), uri.getHost());
            format = uri.getPort() != -1 ? String.format("%s:%s", format, Integer.valueOf(uri.getPort())) : format;
            zzfp zzfpVar = new zzfp(this);
            zzst zzm = zzst.zzm(format);
            int i = g.a;
            if (f0.g.c()) {
                g0.b.a.createWebView(webView).addWebMessageListener("androidWebViewCompatSender", (String[]) zzm.toArray(new String[0]), new a.C0338a(new c0(zzfpVar)));
            } else {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
        }
        webView.setWebViewClient(new zzfs(this));
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
    }

    public final WebView zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzfn
            @Override // java.lang.Runnable
            public final void run() {
                zzft.this.zzc();
            }
        });
    }

    public final /* synthetic */ void zzc() {
        this.zzd = true;
        this.zza.destroy();
    }

    public final /* synthetic */ void zzd(zzff zzffVar) {
        String zzg = zzffVar.zzg();
        if (this.zzd) {
            String zzffVar2 = zzffVar.toString();
            zzhd.zzd("Attempted to send bridge message after cleanup: " + zzffVar2 + "; " + zzg);
            return;
        }
        String zzffVar3 = zzffVar.toString();
        zzhd.zzc("Sending Javascript msg: " + zzffVar3 + "; URL: " + zzg);
        try {
            this.zza.evaluateJavascript(zzg, null);
        } catch (IllegalStateException unused) {
            this.zza.loadUrl(zzg);
        }
    }

    public final void zze(String str) {
        this.zza.loadUrl(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032 A[Catch: Exception -> 0x0047, IllegalArgumentException -> 0x0060, TryCatch #2 {IllegalArgumentException -> 0x0060, Exception -> 0x0047, blocks: (B:3:0x0004, B:21:0x0036, B:19:0x002d, B:20:0x0032), top: B:29:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = ", Message Type: "
            java.lang.String r1 = "Received Javascript msg: "
            int r2 = r7.hashCode()     // Catch: java.lang.Exception -> L47 java.lang.IllegalArgumentException -> L60
            r3 = 48
            r4 = 1
            if (r2 == r3) goto L1c
            r3 = 52
            if (r2 == r3) goto L12
            goto L26
        L12:
            java.lang.String r2 = "4"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L26
            r2 = r4
            goto L27
        L1c:
            java.lang.String r2 = "0"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L26
            r2 = 0
            goto L27
        L26:
            r2 = -1
        L27:
            if (r2 == 0) goto L32
            if (r2 == r4) goto L2d
            r2 = 0
            goto L36
        L2d:
            com.google.ads.interactivemedia.v3.internal.zzff r2 = com.google.ads.interactivemedia.v3.internal.zzff.zzd(r6)     // Catch: java.lang.Exception -> L47 java.lang.IllegalArgumentException -> L60
            goto L36
        L32:
            com.google.ads.interactivemedia.v3.internal.zzff r2 = com.google.ads.interactivemedia.v3.internal.zzff.zzc(r6)     // Catch: java.lang.Exception -> L47 java.lang.IllegalArgumentException -> L60
        L36:
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L47 java.lang.IllegalArgumentException -> L60
            java.lang.String r1 = r1.concat(r3)     // Catch: java.lang.Exception -> L47 java.lang.IllegalArgumentException -> L60
            com.google.ads.interactivemedia.v3.internal.zzhd.zzc(r1)     // Catch: java.lang.Exception -> L47 java.lang.IllegalArgumentException -> L60
            com.google.ads.interactivemedia.v3.internal.zzfq r6 = r5.zzc
            r6.zzl(r2)
            return
        L47:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid internal message. Message could not be be parsed: "
            r2.<init>(r3)
            r2.append(r6)
            r2.append(r0)
            r2.append(r7)
            java.lang.String r6 = r2.toString()
            com.google.ads.interactivemedia.v3.internal.zzhd.zzb(r6, r1)
            return
        L60:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid internal message. Make sure the Google IMA SDK library is up to date. Message: "
            r1.<init>(r2)
            r1.append(r6)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            com.google.ads.interactivemedia.v3.internal.zzhd.zzd(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzft.zzf(java.lang.String, java.lang.String):void");
    }

    public final void zzg(zzfq zzfqVar) {
        this.zzc = zzfqVar;
    }

    public final void zzh(final zzff zzffVar) {
        this.zzb.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzfo
            @Override // java.lang.Runnable
            public final void run() {
                zzft.this.zzd(zzffVar);
            }
        });
    }
}
