package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.amazon.aps.iva.if0.c;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzcc {
    private static final zzcc zza = new zzcc();

    private zzcc() {
    }

    public static final zzcc zza() {
        return zza;
    }

    public final void zzb(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new zzcb(this, webView, sb2));
                return;
            } else {
                webView.loadUrl(sb2);
                return;
            }
        }
        zzbq.zza.booleanValue();
    }

    public final void zzc(WebView webView) {
        zzb(webView, "finishSession", new Object[0]);
    }

    public final void zzd(WebView webView, c cVar) {
        zzb(webView, "init", cVar);
    }

    public final void zze(WebView webView, float f) {
        zzb(webView, "setDeviceVolume", Float.valueOf(f));
    }

    public final void zzf(WebView webView, String str) {
        zzb(webView, "setNativeViewHierarchy", str);
    }

    public final void zzg(WebView webView, String str, c cVar, c cVar2, c cVar3) {
        zzb(webView, "startSession", str, cVar, cVar2, cVar3);
    }
}
