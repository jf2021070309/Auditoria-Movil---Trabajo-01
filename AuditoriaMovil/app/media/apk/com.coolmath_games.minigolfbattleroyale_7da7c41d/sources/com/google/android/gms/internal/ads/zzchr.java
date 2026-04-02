package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzchr implements zzfrz {
    final /* synthetic */ zzchp zza;
    final /* synthetic */ zzchn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchr(zzchs zzchsVar, zzchp zzchpVar, zzchn zzchnVar) {
        this.zza = zzchpVar;
        this.zzb = zzchnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
