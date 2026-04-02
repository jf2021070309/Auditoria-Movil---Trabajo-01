package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzu implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;

    public zzu(zzv zzvVar, zzw zzwVar, String str, String str2) {
        this.zza = zzwVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        Cast.MessageReceivedCallback messageReceivedCallback;
        Logger logger;
        CastDevice castDevice;
        map = this.zza.zzk;
        synchronized (map) {
            map2 = this.zza.zzk;
            messageReceivedCallback = (Cast.MessageReceivedCallback) map2.get(this.zzb);
        }
        if (messageReceivedCallback != null) {
            zzw zzwVar = this.zza;
            String str = this.zzb;
            String str2 = this.zzc;
            castDevice = zzwVar.zzi;
            messageReceivedCallback.onMessageReceived(castDevice, str, str2);
            return;
        }
        String str3 = this.zzb;
        logger = zzw.zze;
        logger.d("Discarded message for unknown namespace '%s'", str3);
    }
}
