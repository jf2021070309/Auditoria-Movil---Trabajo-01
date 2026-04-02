package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public class zzw {
    public static final zzw zza;
    @Deprecated
    public static final zzw zzb;
    public static final zzadw<zzw> zzz;
    public final int zzc = Integer.MAX_VALUE;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = 0;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk;
    public final int zzl;
    public final boolean zzm;
    public final zzfoj<String> zzn;
    public final zzfoj<String> zzo;
    public final int zzp;
    public final int zzq;
    public final int zzr;
    public final zzfoj<String> zzs;
    public final zzfoj<String> zzt;
    public final int zzu;
    public final boolean zzv;
    public final boolean zzw;
    public final boolean zzx;
    public final zzfot<Integer> zzy;

    static {
        zzw zzwVar = new zzw(new zzv());
        zza = zzwVar;
        zzb = zzwVar;
        zzz = zzu.zza;
    }

    public zzw(zzv zzvVar) {
        int i2;
        int i3;
        boolean z;
        zzfoj<String> zzfojVar;
        zzfoj<String> zzfojVar2;
        zzfoj<String> zzfojVar3;
        zzfoj<String> zzfojVar4;
        int i4;
        zzfot<Integer> zzfotVar;
        i2 = zzvVar.zza;
        this.zzk = i2;
        i3 = zzvVar.zzb;
        this.zzl = i3;
        z = zzvVar.zzc;
        this.zzm = z;
        zzfojVar = zzvVar.zzd;
        this.zzn = zzfojVar;
        zzfojVar2 = zzvVar.zze;
        this.zzo = zzfojVar2;
        this.zzp = 0;
        this.zzq = Integer.MAX_VALUE;
        this.zzr = Integer.MAX_VALUE;
        zzfojVar3 = zzvVar.zzf;
        this.zzs = zzfojVar3;
        zzfojVar4 = zzvVar.zzg;
        this.zzt = zzfojVar4;
        i4 = zzvVar.zzh;
        this.zzu = i4;
        this.zzv = false;
        this.zzw = false;
        this.zzx = false;
        zzfotVar = zzvVar.zzi;
        this.zzy = zzfotVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzw zzwVar = (zzw) obj;
            if (this.zzm == zzwVar.zzm && this.zzk == zzwVar.zzk && this.zzl == zzwVar.zzl && this.zzn.equals(zzwVar.zzn) && this.zzo.equals(zzwVar.zzo) && this.zzs.equals(zzwVar.zzs) && this.zzt.equals(zzwVar.zzt) && this.zzu == zzwVar.zzu && this.zzy.equals(zzwVar.zzy)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.zzn.hashCode();
        int hashCode2 = this.zzo.hashCode();
        int hashCode3 = this.zzs.hashCode();
        int hashCode4 = this.zzt.hashCode();
        return this.zzy.hashCode() + ((((hashCode4 + ((hashCode3 + ((((((hashCode2 + ((hashCode + (((((((this.zzm ? 1 : 0) - 1048002209) * 31) + this.zzk) * 31) + this.zzl) * 31)) * 31)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 31)) * 31) + this.zzu) * 923521);
    }
}
