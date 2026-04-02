package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import android.webkit.WebView;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.c;
import java.util.Iterator;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public class zzcj {
    private zzdh zza;
    private long zzb;
    private int zzc;

    public zzcj() {
        zzb();
        this.zza = new zzdh(null);
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j) {
        if (j >= this.zzb && this.zzc != 3) {
            this.zzc = 3;
            zzcc.zza().zzf(zza(), str);
        }
    }

    public final void zze(String str, long j) {
        if (j >= this.zzb) {
            this.zzc = 2;
            zzcc.zza().zzf(zza(), str);
        }
    }

    public void zzf(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar, com.google.ads.interactivemedia.omid.library.adsession.zzc zzcVar) {
        zzg(zzeVar, zzcVar, null);
    }

    public final void zzg(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar, com.google.ads.interactivemedia.omid.library.adsession.zzc zzcVar, c cVar) {
        String zzi = zzeVar.zzi();
        c cVar2 = new c();
        zzcn.zze(cVar2, "environment", "app");
        zzcn.zze(cVar2, "adSessionType", zzcVar.zzc());
        c cVar3 = new c();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzcn.zze(cVar3, "deviceType", str + "; " + str2);
        zzcn.zze(cVar3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzcn.zze(cVar3, "os", "Android");
        zzcn.zze(cVar2, "deviceInfo", cVar3);
        a aVar = new a();
        aVar.put("clid");
        aVar.put("vlid");
        zzcn.zze(cVar2, "supports", aVar);
        c cVar4 = new c();
        zzcn.zze(cVar4, "partnerName", zzcVar.zzd().zzb());
        zzcn.zze(cVar4, "partnerVersion", zzcVar.zzd().zzc());
        zzcn.zze(cVar2, "omidNativeInfo", cVar4);
        c cVar5 = new c();
        zzcn.zze(cVar5, "libraryVersion", "1.3.37-google_20220829");
        zzcn.zze(cVar5, "appId", zzca.zzb().zza().getApplicationContext().getPackageName());
        zzcn.zze(cVar2, "app", cVar5);
        if (zzcVar.zze() != null) {
            zzcn.zze(cVar2, "contentUrl", zzcVar.zze());
        }
        zzcn.zze(cVar2, "customReferenceData", zzcVar.zzf());
        c cVar6 = new c();
        Iterator it = zzcVar.zzg().iterator();
        if (!it.hasNext()) {
            zzcc.zza().zzg(zza(), zzi, cVar2, cVar6, cVar);
        } else {
            com.google.ads.interactivemedia.omid.library.adsession.zzj zzjVar = (com.google.ads.interactivemedia.omid.library.adsession.zzj) it.next();
            throw null;
        }
    }

    public final void zzh(float f) {
        zzcc.zza().zze(zza(), f);
    }

    public final void zzi(WebView webView) {
        this.zza = new zzdh(webView);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        if (this.zza.get() != 0) {
            return true;
        }
        return false;
    }
}
