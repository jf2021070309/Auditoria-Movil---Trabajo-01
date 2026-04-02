package com.google.ads.interactivemedia.pal;

import com.google.android.gms.internal.pal.zzjb;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes2.dex */
public final class zzax {
    private final zzs zza;
    private final String zzb;

    public zzax(zzs zzsVar, String str) {
        this.zza = zzsVar;
        this.zzb = str;
    }

    public final void zza(int i, String str) {
        if (str == null) {
            str = "null";
        }
        zzjb zzjbVar = new zzjb();
        zzjbVar.zza(zzaw.DEVICE_TYPE.zza(), String.valueOf(4));
        zzjbVar.zza(zzaw.EVENT_TYPE.zza(), String.valueOf(i - 1));
        zzjbVar.zza(zzaw.SPAM_CORRELATOR.zza(), this.zzb);
        zzjbVar.zza(zzaw.SPAM_SIGNAL.zza(), str);
        this.zza.zza("asscs", "116", zzjbVar.zzc());
    }
}
