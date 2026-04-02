package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcku implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcla zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcku(zzcla zzclaVar, String str, String str2, int i, int i2, boolean z) {
        this.zze = zzclaVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        zzcla.zzs(this.zze, "onPrecacheEvent", hashMap);
    }
}
