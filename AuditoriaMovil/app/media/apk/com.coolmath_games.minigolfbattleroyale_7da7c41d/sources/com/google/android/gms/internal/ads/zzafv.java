package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzafv {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    private int zzH;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final String zzi;
    public final zzaiv zzj;
    public final String zzk;
    public final String zzl;
    public final int zzm;
    public final List<byte[]> zzn;
    public final zzn zzo;
    public final long zzp;
    public final int zzq;
    public final int zzr;
    public final float zzs;
    public final int zzt;
    public final float zzu;
    public final byte[] zzv;
    public final int zzw;
    public final zzj zzx;
    public final int zzy;
    public final int zzz;
    private static final zzafv zzG = new zzafv(new zzaft());
    public static final zzadw<zzafv> zzF = zzafs.zza;

    private zzafv(zzaft zzaftVar) {
        this.zza = zzaft.zza(zzaftVar);
        this.zzb = zzaft.zzb(zzaftVar);
        this.zzc = zzamq.zzq(zzaft.zzc(zzaftVar));
        this.zzd = zzaft.zzd(zzaftVar);
        this.zze = 0;
        this.zzf = zzaft.zze(zzaftVar);
        int zzf = zzaft.zzf(zzaftVar);
        this.zzg = zzf;
        this.zzh = zzf == -1 ? this.zzf : zzf;
        this.zzi = zzaft.zzg(zzaftVar);
        this.zzj = zzaft.zzh(zzaftVar);
        this.zzk = zzaft.zzi(zzaftVar);
        this.zzl = zzaft.zzj(zzaftVar);
        this.zzm = zzaft.zzk(zzaftVar);
        this.zzn = zzaft.zzl(zzaftVar) == null ? Collections.emptyList() : zzaft.zzl(zzaftVar);
        this.zzo = zzaft.zzm(zzaftVar);
        this.zzp = zzaft.zzn(zzaftVar);
        this.zzq = zzaft.zzo(zzaftVar);
        this.zzr = zzaft.zzp(zzaftVar);
        this.zzs = zzaft.zzq(zzaftVar);
        this.zzt = zzaft.zzr(zzaftVar) == -1 ? 0 : zzaft.zzr(zzaftVar);
        this.zzu = zzaft.zzs(zzaftVar) == -1.0f ? 1.0f : zzaft.zzs(zzaftVar);
        this.zzv = zzaft.zzt(zzaftVar);
        this.zzw = zzaft.zzu(zzaftVar);
        this.zzx = zzaft.zzv(zzaftVar);
        this.zzy = zzaft.zzw(zzaftVar);
        this.zzz = zzaft.zzx(zzaftVar);
        this.zzA = zzaft.zzy(zzaftVar);
        this.zzB = zzaft.zzz(zzaftVar) == -1 ? 0 : zzaft.zzz(zzaftVar);
        this.zzC = zzaft.zzA(zzaftVar) != -1 ? zzaft.zzA(zzaftVar) : 0;
        this.zzD = zzaft.zzB(zzaftVar);
        this.zzE = (zzaft.zzC(zzaftVar) != 0 || this.zzo == null) ? zzaft.zzC(zzaftVar) : 1;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafv zzafvVar = (zzafv) obj;
            int i2 = this.zzH;
            if ((i2 == 0 || (i = zzafvVar.zzH) == 0 || i2 == i) && this.zzd == zzafvVar.zzd && this.zzf == zzafvVar.zzf && this.zzg == zzafvVar.zzg && this.zzm == zzafvVar.zzm && this.zzp == zzafvVar.zzp && this.zzq == zzafvVar.zzq && this.zzr == zzafvVar.zzr && this.zzt == zzafvVar.zzt && this.zzw == zzafvVar.zzw && this.zzy == zzafvVar.zzy && this.zzz == zzafvVar.zzz && this.zzA == zzafvVar.zzA && this.zzB == zzafvVar.zzB && this.zzC == zzafvVar.zzC && this.zzD == zzafvVar.zzD && this.zzE == zzafvVar.zzE && Float.compare(this.zzs, zzafvVar.zzs) == 0 && Float.compare(this.zzu, zzafvVar.zzu) == 0 && zzamq.zzc(this.zza, zzafvVar.zza) && zzamq.zzc(this.zzb, zzafvVar.zzb) && zzamq.zzc(this.zzi, zzafvVar.zzi) && zzamq.zzc(this.zzk, zzafvVar.zzk) && zzamq.zzc(this.zzl, zzafvVar.zzl) && zzamq.zzc(this.zzc, zzafvVar.zzc) && Arrays.equals(this.zzv, zzafvVar.zzv) && zzamq.zzc(this.zzj, zzafvVar.zzj) && zzamq.zzc(this.zzx, zzafvVar.zzx) && zzamq.zzc(this.zzo, zzafvVar.zzo) && zzd(zzafvVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzk;
        String str4 = this.zzl;
        String str5 = this.zzi;
        int i = this.zzh;
        String str6 = this.zzc;
        int i2 = this.zzq;
        int i3 = this.zzr;
        float f = this.zzs;
        int i4 = this.zzy;
        int i5 = this.zzz;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final zzaft zza() {
        return new zzaft(this, null);
    }

    public final zzafv zzb(int i) {
        zzaft zzaftVar = new zzaft(this, null);
        zzaftVar.zzag(i);
        return new zzafv(zzaftVar);
    }

    public final int zzc() {
        int i;
        int i2 = this.zzq;
        if (i2 == -1 || (i = this.zzr) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean zzd(zzafv zzafvVar) {
        if (this.zzn.size() == zzafvVar.zzn.size()) {
            for (int i = 0; i < this.zzn.size(); i++) {
                if (!Arrays.equals(this.zzn.get(i), zzafvVar.zzn.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzH;
        if (i == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.zzb;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.zzc;
            int hashCode3 = (((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zzd) * 961) + this.zzf) * 31) + this.zzg) * 31;
            String str4 = this.zzi;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            zzaiv zzaivVar = this.zzj;
            int hashCode5 = (hashCode4 + (zzaivVar == null ? 0 : zzaivVar.hashCode())) * 31;
            String str5 = this.zzk;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.zzl;
            int hashCode7 = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.zzm) * 31) + ((int) this.zzp)) * 31) + this.zzq) * 31) + this.zzr) * 31) + Float.floatToIntBits(this.zzs)) * 31) + this.zzt) * 31) + Float.floatToIntBits(this.zzu)) * 31) + this.zzw) * 31) + this.zzy) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE;
            this.zzH = hashCode7;
            return hashCode7;
        }
        return i;
    }
}
