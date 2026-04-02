package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzjr implements Comparable<zzjr> {
    public final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final boolean zzi;

    public zzjr(zzafv zzafvVar, zzjn zzjnVar, int i, String str) {
        zzfoj<String> zzfojVar;
        int i2;
        boolean z = false;
        this.zzb = zzjt.zzf(i, false);
        int i3 = zzafvVar.zzd;
        int i4 = zzjnVar.zzC;
        this.zzc = 1 == (i3 & 1);
        this.zzd = (i3 & 2) != 0;
        if (zzjnVar.zzt.isEmpty()) {
            zzfojVar = zzfoj.zzj("");
        } else {
            zzfojVar = zzjnVar.zzt;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= zzfojVar.size()) {
                i5 = Integer.MAX_VALUE;
                i2 = 0;
                break;
            }
            boolean z2 = zzjnVar.zzv;
            i2 = zzjt.zzh(zzafvVar, zzfojVar.get(i5), false);
            if (i2 > 0) {
                break;
            }
            i5++;
        }
        this.zze = i5;
        this.zzf = i2;
        int i6 = zzafvVar.zze;
        int i7 = zzjnVar.zzu;
        this.zzg = Integer.bitCount(0);
        int i8 = zzafvVar.zze;
        this.zzi = false;
        this.zzh = zzjt.zzh(zzafvVar, str, zzjt.zzg(str) == null);
        if (this.zzf > 0 || ((zzjnVar.zzt.isEmpty() && this.zzg > 0) || this.zzc || (this.zzd && this.zzh > 0))) {
            z = true;
        }
        this.zza = z;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzjr zzjrVar) {
        zzfny zzb = zzfny.zzj().zzd(this.zzb, zzjrVar.zzb).zza(Integer.valueOf(this.zze), Integer.valueOf(zzjrVar.zze), zzfpw.zzb().zza()).zzb(this.zzf, zzjrVar.zzf).zzb(this.zzg, zzjrVar.zzg).zzd(this.zzc, zzjrVar.zzc).zza(Boolean.valueOf(this.zzd), Boolean.valueOf(zzjrVar.zzd), this.zzf == 0 ? zzfpw.zzb() : zzfpw.zzb().zza()).zzb(this.zzh, zzjrVar.zzh);
        if (this.zzg == 0) {
            boolean z = zzjrVar.zzi;
            zzb = zzb.zzc(false, false);
        }
        return zzb.zze();
    }
}
