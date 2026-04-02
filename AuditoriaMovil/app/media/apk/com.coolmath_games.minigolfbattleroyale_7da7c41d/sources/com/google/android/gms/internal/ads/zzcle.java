package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcle extends zzcla {
    public zzcle(zzcjb zzcjbVar) {
        super(zzcjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zzd(String str) {
        String zzd = zzcgm.zzd(str);
        zzcjb zzcjbVar = this.zzc.get();
        if (zzcjbVar != null && zzd != null) {
            zzcjbVar.zzu(zzd, this);
        }
        com.google.android.gms.ads.internal.util.zze.zzi("VideoStreamNoopCache is doing nothing.");
        zzr(str, zzd, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzm() {
    }
}
