package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
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
import ch.qos.logback.core.util.FileSize;
import e.a.d.a.a;
@TargetApi(11)
/* loaded from: classes.dex */
public final class zzcmk extends WebChromeClient {
    private final zzcml zza;

    public zzcmk(zzcml zzcmlVar) {
        this.zza = zzcmlVar;
    }

    private static final Context zzb(WebView webView) {
        if (webView instanceof zzcml) {
            zzcml zzcmlVar = (zzcml) webView;
            Activity zzj = zzcmlVar.zzj();
            return zzj != null ? zzj : zzcmlVar.getContext();
        }
        return webView.getContext();
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcml)) {
            zzcgt.zzi("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzN = ((zzcml) webView).zzN();
        if (zzN == null) {
            zzcgt.zzi("Tried to close an AdWebView not associated with an overlay.");
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
        a.M(sb, "JS: ", message, " (", sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i2 = zzcmj.zza[consoleMessage.messageLevel().ordinal()];
        if (i2 == 1) {
            zzcgt.zzf(sb2);
        } else if (i2 == 2) {
            zzcgt.zzi(sb2);
        } else if (i2 == 3 || i2 == 4) {
            zzcgt.zzh(sb2);
        } else if (i2 != 5) {
            zzcgt.zzh(sb2);
        } else {
            zzcgt.zzd(sb2);
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
    public final void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        long j5 = 5242880 - j4;
        if (j5 <= 0) {
            quotaUpdater.updateQuota(j2);
            return;
        }
        if (j2 == 0) {
            if (j3 > j5 || j3 > FileSize.MB_COEFFICIENT) {
                j3 = 0;
            }
        } else if (j3 == 0) {
            j3 = Math.min(Math.min(131072L, j5) + j2, (long) FileSize.MB_COEFFICIENT);
        } else {
            if (j3 <= Math.min(FileSize.MB_COEFFICIENT - j2, j5)) {
                j2 += j3;
            }
            j3 = j2;
        }
        quotaUpdater.updateQuota(j3);
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
            zzcgt.zzi("Could not get ad overlay when hiding custom view.");
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
    public final void onReachedMaxAppCacheSize(long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = j2 + 131072;
        if (5242880 - j3 < j4) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j4);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zza.zzN();
        if (zzN == null) {
            zzcgt.zzi("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzN.zzx(view, customViewCallback);
        zzN.zzw(i2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzcml zzcmlVar;
        com.google.android.gms.ads.internal.zzb zzc;
        try {
            zzcmlVar = this.zza;
        } catch (WindowManager.BadTokenException e2) {
            zzcgt.zzj("Fail to display Dialog.", e2);
        }
        if (zzcmlVar != null && zzcmlVar.zzR() != null && this.zza.zzR().zzc() != null && (zzc = this.zza.zzR().zzc()) != null && !zzc.zzb()) {
            StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzc.zzc(sb.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builder.setView(linearLayout).setPositiveButton(17039370, new zzcmi(jsPromptResult, editText)).setNegativeButton(17039360, new zzcmh(jsPromptResult)).setOnCancelListener(new zzcmg(jsPromptResult)).create().show();
        } else {
            builder.setMessage(str3).setPositiveButton(17039370, new zzcmf(jsResult)).setNegativeButton(17039360, new zzcme(jsResult)).setOnCancelListener(new zzcmd(jsResult)).create().show();
        }
        return true;
    }
}
