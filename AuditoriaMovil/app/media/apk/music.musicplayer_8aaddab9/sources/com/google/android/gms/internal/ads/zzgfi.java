package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public final class zzgfi {
    private final zzgfh zza;

    private zzgfi(zzgfh zzgfhVar) {
        zzggk.zzb(zzgfhVar, "output");
        this.zza = zzgfhVar;
        zzgfhVar.zza = this;
    }

    public static zzgfi zza(zzgfh zzgfhVar) {
        zzgfi zzgfiVar = zzgfhVar.zza;
        return zzgfiVar != null ? zzgfiVar : new zzgfi(zzgfhVar);
    }

    public final void zzA(int i2, List<Float> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzd(i2, Float.floatToRawIntBits(list.get(i3).floatValue()));
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).floatValue();
            i4 += 4;
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzm(Float.floatToRawIntBits(list.get(i3).floatValue()));
            i3++;
        }
    }

    public final void zzB(int i2, List<Double> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, Double.doubleToRawLongBits(list.get(i3).doubleValue()));
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).doubleValue();
            i4 += 8;
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzo(Double.doubleToRawLongBits(list.get(i3).doubleValue()));
            i3++;
        }
    }

    public final void zzC(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzb(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzgfh.zzw(list.get(i5).intValue());
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzk(list.get(i3).intValue());
            i3++;
        }
    }

    public final void zzD(int i2, List<Boolean> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzg(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).booleanValue();
            i4++;
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzj(list.get(i3).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public final void zzE(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzggs)) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, list.get(i3));
                i3++;
            }
            return;
        }
        zzggs zzggsVar = (zzggs) list;
        while (i3 < list.size()) {
            Object zzg = zzggsVar.zzg(i3);
            if (zzg instanceof String) {
                this.zza.zzh(i2, (String) zzg);
            } else {
                this.zza.zzi(i2, (zzgex) zzg);
            }
            i3++;
        }
    }

    public final void zzF(int i2, List<zzgex> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zzi(i2, list.get(i3));
        }
    }

    public final void zzG(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzc(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzgfh.zzx(list.get(i5).intValue());
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzl(list.get(i3).intValue());
            i3++;
        }
    }

    public final void zzH(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzd(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzm(list.get(i3).intValue());
            i3++;
        }
    }

    public final void zzI(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzo(list.get(i3).longValue());
            i3++;
        }
    }

    public final void zzJ(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzgfh zzgfhVar = this.zza;
                int intValue = list.get(i3).intValue();
                zzgfhVar.zzc(i2, (intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue2 = list.get(i5).intValue();
            i4 += zzgfh.zzx((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            zzgfh zzgfhVar2 = this.zza;
            int intValue3 = list.get(i3).intValue();
            zzgfhVar2.zzl((intValue3 >> 31) ^ (intValue3 + intValue3));
            i3++;
        }
    }

    public final void zzK(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzgfh zzgfhVar = this.zza;
                long longValue = list.get(i3).longValue();
                zzgfhVar.zze(i2, (longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long longValue2 = list.get(i5).longValue();
            i4 += zzgfh.zzy((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            zzgfh zzgfhVar2 = this.zza;
            long longValue3 = list.get(i3).longValue();
            zzgfhVar2.zzn((longValue3 >> 63) ^ (longValue3 + longValue3));
            i3++;
        }
    }

    public final void zzb(int i2, int i3) throws IOException {
        this.zza.zzd(i2, i3);
    }

    public final void zzc(int i2, long j2) throws IOException {
        this.zza.zze(i2, j2);
    }

    public final void zzd(int i2, long j2) throws IOException {
        this.zza.zzf(i2, j2);
    }

    public final void zze(int i2, float f2) throws IOException {
        this.zza.zzd(i2, Float.floatToRawIntBits(f2));
    }

    public final void zzf(int i2, double d2) throws IOException {
        this.zza.zzf(i2, Double.doubleToRawLongBits(d2));
    }

    public final void zzg(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    public final void zzh(int i2, long j2) throws IOException {
        this.zza.zze(i2, j2);
    }

    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    public final void zzj(int i2, long j2) throws IOException {
        this.zza.zzf(i2, j2);
    }

    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzd(i2, i3);
    }

    public final void zzl(int i2, boolean z) throws IOException {
        this.zza.zzg(i2, z);
    }

    public final void zzm(int i2, String str) throws IOException {
        this.zza.zzh(i2, str);
    }

    public final void zzn(int i2, zzgex zzgexVar) throws IOException {
        this.zza.zzi(i2, zzgexVar);
    }

    public final void zzo(int i2, int i3) throws IOException {
        this.zza.zzc(i2, i3);
    }

    public final void zzp(int i2, int i3) throws IOException {
        this.zza.zzc(i2, (i3 >> 31) ^ (i3 + i3));
    }

    public final void zzq(int i2, long j2) throws IOException {
        this.zza.zze(i2, (j2 >> 63) ^ (j2 + j2));
    }

    public final void zzr(int i2, Object obj, zzghz zzghzVar) throws IOException {
        zzghi zzghiVar = (zzghi) obj;
        zzgfe zzgfeVar = (zzgfe) this.zza;
        zzgfeVar.zzl((i2 << 3) | 2);
        zzgeg zzgegVar = (zzgeg) zzghiVar;
        int zzap = zzgegVar.zzap();
        if (zzap == -1) {
            zzap = zzghzVar.zze(zzgegVar);
            zzgegVar.zzaq(zzap);
        }
        zzgfeVar.zzl(zzap);
        zzghzVar.zzn(zzghiVar, zzgfeVar.zza);
    }

    public final void zzs(int i2, Object obj, zzghz zzghzVar) throws IOException {
        zzgfh zzgfhVar = this.zza;
        zzgfhVar.zza(i2, 3);
        zzghzVar.zzn((zzghi) obj, zzgfhVar.zza);
        zzgfhVar.zza(i2, 4);
    }

    public final void zzt(int i2) throws IOException {
        this.zza.zza(i2, 3);
    }

    public final void zzu(int i2) throws IOException {
        this.zza.zza(i2, 4);
    }

    public final void zzv(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzb(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzgfh.zzw(list.get(i5).intValue());
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzk(list.get(i3).intValue());
            i3++;
        }
    }

    public final void zzw(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzd(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzm(list.get(i3).intValue());
            i3++;
        }
    }

    public final void zzx(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zze(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzgfh.zzy(list.get(i5).longValue());
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzn(list.get(i3).longValue());
            i3++;
        }
    }

    public final void zzy(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zze(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzgfh.zzy(list.get(i5).longValue());
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzn(list.get(i3).longValue());
            i3++;
        }
    }

    public final void zzz(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.zza.zzl(i4);
        while (i3 < list.size()) {
            this.zza.zzo(list.get(i3).longValue());
            i3++;
        }
    }
}
