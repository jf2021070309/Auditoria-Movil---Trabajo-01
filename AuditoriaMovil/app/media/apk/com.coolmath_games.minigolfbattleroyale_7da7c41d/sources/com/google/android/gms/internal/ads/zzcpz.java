package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcpz {
    private zzcom zza;
    private zzcqw zzb;
    private zzfew zzc;
    private zzcrh zzd;
    private zzfbn zze;

    private zzcpz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcpz(zzcql zzcqlVar) {
    }

    public final zzcpz zza(zzcom zzcomVar) {
        this.zza = zzcomVar;
        return this;
    }

    public final zzcpz zzb(zzcqw zzcqwVar) {
        this.zzb = zzcqwVar;
        return this;
    }

    public final zzcoj zzc() {
        zzgli.zzc(this.zza, zzcom.class);
        zzgli.zzc(this.zzb, zzcqw.class);
        if (this.zzc == null) {
            this.zzc = new zzfew();
        }
        if (this.zzd == null) {
            this.zzd = new zzcrh();
        }
        if (this.zze == null) {
            this.zze = new zzfbn();
        }
        return new zzcqu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }
}
