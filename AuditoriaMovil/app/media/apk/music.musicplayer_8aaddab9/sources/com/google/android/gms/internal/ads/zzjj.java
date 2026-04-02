package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzjj implements Comparable<zzjj> {
    public final boolean zza;
    private final String zzb;
    private final zzjn zzc;
    private final boolean zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final boolean zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;

    public zzjj(zzafv zzafvVar, zzjn zzjnVar, int i2) {
        int i3;
        int i4;
        int i5;
        this.zzc = zzjnVar;
        this.zzb = zzjt.zzg(zzafvVar.zzc);
        int i6 = 0;
        this.zzd = zzjt.zzf(i2, false);
        int i7 = 0;
        while (true) {
            i3 = Integer.MAX_VALUE;
            if (i7 >= zzjnVar.zzo.size()) {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = zzjt.zzh(zzafvVar, zzjnVar.zzo.get(i7), false);
            if (i4 > 0) {
                break;
            }
            i7++;
        }
        this.zzf = i7;
        this.zze = i4;
        this.zzg = Integer.bitCount(0);
        this.zzj = 1 == (zzafvVar.zzd & 1);
        this.zzk = zzafvVar.zzy;
        this.zzl = zzafvVar.zzz;
        this.zzm = zzafvVar.zzh;
        this.zza = true;
        String[] zzY = zzamq.zzY();
        int i8 = 0;
        while (true) {
            if (i8 >= zzY.length) {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
            i5 = zzjt.zzh(zzafvVar, zzY[i8], false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.zzh = i8;
        this.zzi = i5;
        while (true) {
            if (i6 < zzjnVar.zzs.size()) {
                String str = zzafvVar.zzl;
                if (str != null && str.equals(zzjnVar.zzs.get(i6))) {
                    i3 = i6;
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        this.zzn = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzjj zzjjVar) {
        zzfpw zzfpwVar;
        zzfpw zza;
        zzfpw zzfpwVar2;
        if (this.zzd) {
            zza = zzjt.zzb;
        } else {
            zzfpwVar = zzjt.zzb;
            zza = zzfpwVar.zza();
        }
        zzfny zza2 = zzfny.zzj().zzd(this.zzd, zzjjVar.zzd).zza(Integer.valueOf(this.zzf), Integer.valueOf(zzjjVar.zzf), zzfpw.zzb().zza()).zzb(this.zze, zzjjVar.zze).zzb(this.zzg, zzjjVar.zzg).zzd(true, true).zza(Integer.valueOf(this.zzn), Integer.valueOf(zzjjVar.zzn), zzfpw.zzb().zza());
        Integer valueOf = Integer.valueOf(this.zzm);
        Integer valueOf2 = Integer.valueOf(zzjjVar.zzm);
        boolean z = this.zzc.zzw;
        zzfpwVar2 = zzjt.zzc;
        zzfny zza3 = zza2.zza(valueOf, valueOf2, zzfpwVar2).zzd(this.zzj, zzjjVar.zzj).zza(Integer.valueOf(this.zzh), Integer.valueOf(zzjjVar.zzh), zzfpw.zzb().zza()).zzb(this.zzi, zzjjVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzjjVar.zzk), zza).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzjjVar.zzl), zza);
        Integer valueOf3 = Integer.valueOf(this.zzm);
        Integer valueOf4 = Integer.valueOf(zzjjVar.zzm);
        if (!zzamq.zzc(this.zzb, zzjjVar.zzb)) {
            zza = zzjt.zzc;
        }
        return zza3.zza(valueOf3, valueOf4, zza).zze();
    }
}
