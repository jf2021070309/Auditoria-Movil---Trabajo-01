package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzjf {
    private final zzje zza;

    private zzjf(zzje zzjeVar) {
        zzkf.zzf(zzjeVar, "output");
        this.zza = zzjeVar;
        zzjeVar.zza = this;
    }

    public static zzjf zza(zzje zzjeVar) {
        zzjf zzjfVar = zzjeVar.zza;
        return zzjfVar != null ? zzjfVar : new zzjf(zzjeVar);
    }

    public final void zzA(int i2, int i3) throws IOException {
        this.zza.zzp(i2, (i3 >> 31) ^ (i3 + i3));
    }

    public final void zzB(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzje zzjeVar = this.zza;
                int intValue = list.get(i3).intValue();
                zzjeVar.zzp(i2, (intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue2 = list.get(i5).intValue();
            i4 += zzje.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            zzje zzjeVar2 = this.zza;
            int intValue3 = list.get(i3).intValue();
            zzjeVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i3++;
        }
    }

    public final void zzC(int i2, long j2) throws IOException {
        this.zza.zzr(i2, (j2 >> 63) ^ (j2 + j2));
    }

    public final void zzD(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzje zzjeVar = this.zza;
                long longValue = list.get(i3).longValue();
                zzjeVar.zzr(i2, (longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long longValue2 = list.get(i5).longValue();
            i4 += zzje.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            zzje zzjeVar2 = this.zza;
            long longValue3 = list.get(i3).longValue();
            zzjeVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i3++;
        }
    }

    @Deprecated
    public final void zzE(int i2) throws IOException {
        this.zza.zzo(i2, 3);
    }

    public final void zzF(int i2, String str) throws IOException {
        this.zza.zzm(i2, str);
    }

    public final void zzG(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkm)) {
            while (i3 < list.size()) {
                this.zza.zzm(i2, list.get(i3));
                i3++;
            }
            return;
        }
        zzkm zzkmVar = (zzkm) list;
        while (i3 < list.size()) {
            Object zzf = zzkmVar.zzf(i3);
            if (zzf instanceof String) {
                this.zza.zzm(i2, (String) zzf);
            } else {
                this.zza.zze(i2, (zzix) zzf);
            }
            i3++;
        }
    }

    public final void zzH(int i2, int i3) throws IOException {
        this.zza.zzp(i2, i3);
    }

    public final void zzI(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzp(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzje.zzA(list.get(i5).intValue());
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzq(list.get(i3).intValue());
            i3++;
        }
    }

    public final void zzJ(int i2, long j2) throws IOException {
        this.zza.zzr(i2, j2);
    }

    public final void zzK(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzr(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzje.zzB(list.get(i5).longValue());
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzs(list.get(i3).longValue());
            i3++;
        }
    }

    public final void zzb(int i2, boolean z) throws IOException {
        this.zza.zzd(i2, z);
    }

    public final void zzc(int i2, List<Boolean> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzd(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).booleanValue();
            i4++;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzb(list.get(i3).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public final void zzd(int i2, zzix zzixVar) throws IOException {
        this.zza.zze(i2, zzixVar);
    }

    public final void zze(int i2, List<zzix> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zze(i2, list.get(i3));
        }
    }

    public final void zzf(int i2, double d2) throws IOException {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d2));
    }

    public final void zzg(int i2, List<Double> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(list.get(i3).doubleValue()));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).doubleValue();
            i4 += 8;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(list.get(i3).doubleValue()));
            i3++;
        }
    }

    @Deprecated
    public final void zzh(int i2) throws IOException {
        this.zza.zzo(i2, 4);
    }

    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    public final void zzj(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzj(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzje.zzv(list.get(i5).intValue());
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzk(list.get(i3).intValue());
            i3++;
        }
    }

    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    public final void zzl(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzg(list.get(i3).intValue());
            i3++;
        }
    }

    public final void zzm(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    public final void zzn(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzi(list.get(i3).longValue());
            i3++;
        }
    }

    public final void zzo(int i2, float f2) throws IOException {
        this.zza.zzf(i2, Float.floatToRawIntBits(f2));
    }

    public final void zzp(int i2, List<Float> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, Float.floatToRawIntBits(list.get(i3).floatValue()));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).floatValue();
            i4 += 4;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(list.get(i3).floatValue()));
            i3++;
        }
    }

    public final void zzq(int i2, Object obj, zzln zzlnVar) throws IOException {
        zzje zzjeVar = this.zza;
        zzjeVar.zzo(i2, 3);
        zzlnVar.zzm((zzlc) obj, zzjeVar.zza);
        zzjeVar.zzo(i2, 4);
    }

    public final void zzr(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    public final void zzs(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzj(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzje.zzv(list.get(i5).intValue());
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzk(list.get(i3).intValue());
            i3++;
        }
    }

    public final void zzt(int i2, long j2) throws IOException {
        this.zza.zzr(i2, j2);
    }

    public final void zzu(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzr(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzje.zzB(list.get(i5).longValue());
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzs(list.get(i3).longValue());
            i3++;
        }
    }

    public final void zzv(int i2, Object obj, zzln zzlnVar) throws IOException {
        zzlc zzlcVar = (zzlc) obj;
        zzjc zzjcVar = (zzjc) this.zza;
        zzjcVar.zzq((i2 << 3) | 2);
        zzih zzihVar = (zzih) zzlcVar;
        int zzbo = zzihVar.zzbo();
        if (zzbo == -1) {
            zzbo = zzlnVar.zza(zzihVar);
            zzihVar.zzbr(zzbo);
        }
        zzjcVar.zzq(zzbo);
        zzlnVar.zzm(zzlcVar, zzjcVar.zza);
    }

    public final void zzw(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    public final void zzx(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzg(list.get(i3).intValue());
            i3++;
        }
    }

    public final void zzy(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    public final void zzz(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzi(list.get(i3).longValue());
            i3++;
        }
    }
}
