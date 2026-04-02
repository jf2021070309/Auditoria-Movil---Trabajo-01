package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.internal.security.CertificateUtil;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcmk extends WebChromeClient {
    private final zzcml zza;

    public zzcmk(zzcml zzcmlVar) {
        this.zza = zzcmlVar;
    }

    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcml)) {
            return webView.getContext();
        }
        zzcml zzcmlVar = (zzcml) webView;
        Activity zzj = zzcmlVar.zzj();
        return zzj != null ? zzj : zzcmlVar.getContext();
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcml)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzN = ((zzcml) webView).zzN();
        if (zzN == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzN.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzcmj.zza[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            com.google.android.gms.ads.internal.util.zze.zzf(sb2);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.zze.zzi(sb2);
        } else if (i == 3 || i == 4) {
            com.google.android.gms.ads.internal.util.zze.zzh(sb2);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.util.zze.zzd(sb2);
        } else {
            com.google.android.gms.ads.internal.util.zze.zzh(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzS() != null) {
            webView2.setWebViewClient(this.zza.zzS());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min((long) PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j4), (long) PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } else {
            if (j2 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (!com.google.android.gms.ads.internal.util.zzs.zzE(this.zza.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (!com.google.android.gms.ads.internal.util.zzs.zzE(this.zza.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zza.zzN();
        if (zzN == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not get ad overlay when hiding custom view.");
        } else {
            zzN.zzc();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zza.zzN();
        if (zzN == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzN.zzx(view, customViewCallback);
        zzN.zzw(i);
    }

    protected final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzcml zzcmlVar;
        com.google.android.gms.ads.internal.zzb zzc;
        try {
            zzcmlVar = this.zza;
        } catch (WindowManager.BadTokenException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Fail to display Dialog.", e);
        }
        if (zzcmlVar == null || zzcmlVar.zzR() == null || this.zza.zzR().zzc() == null || (zzc = this.zza.zzR().zzc()) == null || zzc.zzb()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(str2);
            if (!z) {
                builder.setMessage(str3).setPositiveButton(17039370, new zzcmf(jsResult)).setNegativeButton(17039360, new zzcme(jsResult)).setOnCancelListener(new zzcmd(jsResult)).create().show();
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builder.setView(linearLayout).setPositiveButton(17039370, new zzcmi(jsPromptResult, editText)).setNegativeButton(17039360, new zzcmh(jsPromptResult)).setOnCancelListener(new zzcmg(jsPromptResult)).create().show();
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str3).length());
        sb.append("window.");
        sb.append(str);
        sb.append("('");
        sb.append(str3);
        sb.append("')");
        zzc.zzc(sb.toString());
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
