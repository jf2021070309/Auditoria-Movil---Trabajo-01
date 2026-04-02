package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.amazon.aps.iva.if0.c;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzcm extends zzcj {
    private WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzcm(Map map, String str) {
        this.zzc = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcj
    public final void zzc() {
        long convert;
        super.zzc();
        if (this.zzb == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzcl(this), Math.max(4000 - convert, 2000L));
        this.zza = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcj
    public final void zzf(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar, com.google.ads.interactivemedia.omid.library.adsession.zzc zzcVar) {
        c cVar = new c();
        Map zzh = zzcVar.zzh();
        for (String str : zzh.keySet()) {
            zzcn.zze(cVar, str, (com.google.ads.interactivemedia.omid.library.adsession.zzj) zzh.get(str));
        }
        zzg(zzeVar, zzcVar, cVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcj
    public final void zzj() {
        WebView webView = new WebView(zzca.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        zzi(this.zza);
        WebView webView2 = this.zza;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        com.google.ads.interactivemedia.omid.library.adsession.zzj zzjVar = (com.google.ads.interactivemedia.omid.library.adsession.zzj) this.zzc.get((String) it.next());
        throw null;
    }
}
