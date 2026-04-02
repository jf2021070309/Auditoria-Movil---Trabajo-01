package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzdxj extends zzbro {
    public final /* synthetic */ Object zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzchl zzd;
    public final /* synthetic */ zzdxk zze;

    public zzdxj(zzdxk zzdxkVar, Object obj, String str, long j2, zzchl zzchlVar) {
        this.zze = zzdxkVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j2;
        this.zzd = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zze() {
        zzdvr zzdvrVar;
        zzdht zzdhtVar;
        synchronized (this.zza) {
            this.zze.zzu(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zzc));
            zzdvrVar = this.zze.zzl;
            zzdvrVar.zzb(this.zzb);
            zzdhtVar = this.zze.zzo;
            zzdhtVar.zzb(this.zzb);
            this.zzd.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzf(String str) {
        zzdvr zzdvrVar;
        zzdht zzdhtVar;
        synchronized (this.zza) {
            this.zze.zzu(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zzc));
            zzdvrVar = this.zze.zzl;
            zzdvrVar.zzc(this.zzb, "error");
            zzdhtVar = this.zze.zzo;
            zzdhtVar.zzc(this.zzb, "error");
            this.zzd.zzc(Boolean.FALSE);
        }
    }
}
