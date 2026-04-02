package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
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

    public zzjr(zzafv zzafvVar, zzjn zzjnVar, int i2, String str) {
        int i3;
        boolean z = false;
        this.zzb = zzjt.zzf(i2, false);
        int i4 = zzafvVar.zzd;
        int i5 = zzjnVar.zzC;
        this.zzc = 1 == (i4 & 1);
        this.zzd = (i4 & 2) != 0;
        zzfoj<String> zzj = zzjnVar.zzt.isEmpty() ? zzfoj.zzj("") : zzjnVar.zzt;
        int i6 = 0;
        while (true) {
            if (i6 >= zzj.size()) {
                i6 = Integer.MAX_VALUE;
                i3 = 0;
                break;
            }
            i3 = zzjt.zzh(zzafvVar, zzj.get(i6), false);
            if (i3 > 0) {
                break;
            }
            i6++;
        }
        this.zze = i6;
        this.zzf = i3;
        int bitCount = Integer.bitCount(0);
        this.zzg = bitCount;
        this.zzi = false;
        int zzh = zzjt.zzh(zzafvVar, str, zzjt.zzg(str) == null);
        this.zzh = zzh;
        if (i3 > 0 || ((zzjnVar.zzt.isEmpty() && bitCount > 0) || this.zzc || (this.zzd && zzh > 0))) {
            z = true;
        }
        this.zza = z;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzjr zzjrVar) {
        zzfny zzb = zzfny.zzj().zzd(this.zzb, zzjrVar.zzb).zza(Integer.valueOf(this.zze), Integer.valueOf(zzjrVar.zze), zzfpw.zzb().zza()).zzb(this.zzf, zzjrVar.zzf).zzb(this.zzg, zzjrVar.zzg).zzd(this.zzc, zzjrVar.zzc).zza(Boolean.valueOf(this.zzd), Boolean.valueOf(zzjrVar.zzd), this.zzf == 0 ? zzfpw.zzb() : zzfpw.zzb().zza()).zzb(this.zzh, zzjrVar.zzh);
        if (this.zzg == 0) {
            zzb = zzb.zzc(false, false);
        }
        return zzb.zze();
    }
}
