package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    public zzjj(zzafv zzafvVar, zzjn zzjnVar, int i) {
        int i2;
        int i3;
        int i4;
        this.zzc = zzjnVar;
        this.zzb = zzjt.zzg(zzafvVar.zzc);
        int i5 = 0;
        this.zzd = zzjt.zzf(i, false);
        int i6 = 0;
        while (true) {
            i2 = Integer.MAX_VALUE;
            if (i6 >= zzjnVar.zzo.size()) {
                i3 = 0;
                i6 = Integer.MAX_VALUE;
                break;
            }
            i3 = zzjt.zzh(zzafvVar, zzjnVar.zzo.get(i6), false);
            if (i3 > 0) {
                break;
            }
            i6++;
        }
        this.zzf = i6;
        this.zze = i3;
        int i7 = zzafvVar.zze;
        int i8 = zzjnVar.zzp;
        this.zzg = Integer.bitCount(0);
        this.zzj = 1 == (zzafvVar.zzd & 1);
        this.zzk = zzafvVar.zzy;
        this.zzl = zzafvVar.zzz;
        this.zzm = zzafvVar.zzh;
        if (zzafvVar.zzh != -1) {
            int i9 = zzjnVar.zzr;
        }
        if (zzafvVar.zzy != -1) {
            int i10 = zzjnVar.zzq;
        }
        this.zza = true;
        String[] zzY = zzamq.zzY();
        int i11 = 0;
        while (true) {
            if (i11 >= zzY.length) {
                i4 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            }
            i4 = zzjt.zzh(zzafvVar, zzY[i11], false);
            if (i4 > 0) {
                break;
            }
            i11++;
        }
        this.zzh = i11;
        this.zzi = i4;
        while (true) {
            if (i5 < zzjnVar.zzs.size()) {
                String str = zzafvVar.zzl;
                if (str != null && str.equals(zzjnVar.zzs.get(i5))) {
                    i2 = i5;
                    break;
                }
                i5++;
            } else {
                break;
            }
        }
        this.zzn = i2;
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
        zzfny zzb = zzfny.zzj().zzd(this.zzd, zzjjVar.zzd).zza(Integer.valueOf(this.zzf), Integer.valueOf(zzjjVar.zzf), zzfpw.zzb().zza()).zzb(this.zze, zzjjVar.zze).zzb(this.zzg, zzjjVar.zzg);
        boolean z = zzjjVar.zza;
        zzfny zza2 = zzb.zzd(true, true).zza(Integer.valueOf(this.zzn), Integer.valueOf(zzjjVar.zzn), zzfpw.zzb().zza());
        Integer valueOf = Integer.valueOf(this.zzm);
        Integer valueOf2 = Integer.valueOf(zzjjVar.zzm);
        boolean z2 = this.zzc.zzw;
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
