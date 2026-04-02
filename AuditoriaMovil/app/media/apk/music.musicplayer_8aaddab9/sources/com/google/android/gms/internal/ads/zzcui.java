package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcui {
    private final zzffc zza;
    private final zzdvi zzb;
    private final zzfal zzc;

    public zzcui(zzdvi zzdviVar, zzfal zzfalVar, zzffc zzffcVar) {
        this.zza = zzffcVar;
        this.zzb = zzdviVar;
        this.zzc = zzfalVar;
    }

    private static String zzb(int i2) {
        int i3 = i2 - 1;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j2, int i2) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
            zzffc zzffcVar = this.zza;
            zzffb zza = zzffb.zza("ad_closed");
            zza.zzh(this.zzc.zzb.zzb);
            zza.zzc("show_time", String.valueOf(j2));
            zza.zzc("ad_format", "app_open_ad");
            zza.zzc("acr", zzb(i2));
            zzffcVar.zza(zza);
            return;
        }
        zzdvh zzd = this.zzb.zzd();
        zzd.zzb(this.zzc.zzb.zzb);
        zzd.zzd("action", "ad_closed");
        zzd.zzd("show_time", String.valueOf(j2));
        zzd.zzd("ad_format", "app_open_ad");
        zzd.zzd("acr", zzb(i2));
        zzd.zze();
    }
}
