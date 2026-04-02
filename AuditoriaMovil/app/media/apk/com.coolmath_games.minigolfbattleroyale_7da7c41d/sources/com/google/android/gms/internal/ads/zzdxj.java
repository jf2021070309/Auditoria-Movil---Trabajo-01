package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdxj extends zzbro {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzchl zzd;
    final /* synthetic */ zzdxk zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxj(zzdxk zzdxkVar, Object obj, String str, long j, zzchl zzchlVar) {
        this.zze = zzdxkVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
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
            this.zzd.zzc(true);
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
            this.zzd.zzc(false);
        }
    }
}
