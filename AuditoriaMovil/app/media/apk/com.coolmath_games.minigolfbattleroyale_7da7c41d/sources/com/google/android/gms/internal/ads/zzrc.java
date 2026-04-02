package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzrc implements zzqz {
    private final zzamf zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzrc(zzqw zzqwVar) {
        zzamf zzamfVar = zzqwVar.zza;
        this.zza = zzamfVar;
        zzamfVar.zzh(12);
        this.zzc = this.zza.zzB() & 255;
        this.zzb = this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzn();
        }
        if (i == 16) {
            return this.zza.zzo();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 == 0) {
            int zzn = this.zza.zzn();
            this.zze = zzn;
            return (zzn & 240) >> 4;
        }
        return this.zze & 15;
    }
}
