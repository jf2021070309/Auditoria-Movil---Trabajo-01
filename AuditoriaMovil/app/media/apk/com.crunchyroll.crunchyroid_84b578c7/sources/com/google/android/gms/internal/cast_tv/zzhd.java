package com.google.android.gms.internal.cast_tv;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzhd implements zzkw {
    private final zzhc zza;

    private zzhd(zzhc zzhcVar) {
        byte[] bArr = zzic.zzd;
        this.zza = zzhcVar;
        zzhcVar.zza = this;
    }

    public static zzhd zza(zzhc zzhcVar) {
        zzhd zzhdVar = zzhcVar.zza;
        if (zzhdVar != null) {
            return zzhdVar;
        }
        return new zzhd(zzhcVar);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzj(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzi(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzB(int i, int i2) throws IOException {
        this.zza.zzq(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += zzhc.zzy((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                zzhc zzhcVar = this.zza;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzhcVar.zzr((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzhc zzhcVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzhcVar2.zzq(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzD(int i, long j) throws IOException {
        this.zza.zzs(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += zzhc.zzz((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                zzhc zzhcVar = this.zza;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzhcVar.zzt((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzhc zzhcVar2 = this.zza;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzhcVar2.zzs(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzp(i, 3);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzn(i, str);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzH(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzij) {
            zzij zzijVar = (zzij) list;
            while (i2 < list.size()) {
                Object zzf = zzijVar.zzf(i2);
                if (zzf instanceof String) {
                    this.zza.zzn(i, (String) zzf);
                } else {
                    this.zza.zze(i, (zzgu) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzn(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzI(int i, int i2) throws IOException {
        this.zza.zzq(i, i2);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhc.zzy(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzq(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzK(int i, long j) throws IOException {
        this.zza.zzs(i, j);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhc.zzz(((Long) list.get(i4)).longValue());
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzs(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzd(i, z);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzd(int i, zzgu zzguVar) throws IOException {
        this.zza.zze(i, zzguVar);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zzgu) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzi(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzj(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzi(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzp(i, 4);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhc.zzv(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzl(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzk(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzg(i, i2);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzh(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzg(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzm(int i, long j) throws IOException {
        this.zza.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzj(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzi(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzo(int i, float f) throws IOException {
        this.zza.zzg(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzh(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzg(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzq(int i, Object obj, zzjn zzjnVar) throws IOException {
        zzhc zzhcVar = this.zza;
        zzhcVar.zzp(i, 3);
        zzjnVar.zzi((zzjc) obj, zzhcVar.zza);
        zzhcVar.zzp(i, 4);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhc.zzv(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzl(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzk(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzt(int i, long j) throws IOException {
        this.zza.zzs(i, j);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhc.zzz(((Long) list.get(i4)).longValue());
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzs(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzv(int i, zziu zziuVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            this.zza.zzp(i, 2);
            this.zza.zzr(zziv.zzb(zziuVar, entry.getKey(), entry.getValue()));
            zziv.zze(this.zza, zziuVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzw(int i, Object obj, zzjn zzjnVar) throws IOException {
        zzjc zzjcVar = (zzjc) obj;
        zzgz zzgzVar = (zzgz) this.zza;
        zzgzVar.zzr((i << 3) | 2);
        zzgzVar.zzr(((zzgc) zzjcVar).zzk(zzjnVar));
        zzjnVar.zzi(zzjcVar, zzgzVar.zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzg(i, i2);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzp(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzr(i3);
            while (i2 < list.size()) {
                this.zza.zzh(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzg(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkw
    public final void zzz(int i, long j) throws IOException {
        this.zza.zzi(i, j);
    }
}
