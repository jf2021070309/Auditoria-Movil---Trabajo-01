package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class zzlp {
    private static final Class<?> zza;
    private static final zzmb<?, ?> zzb;
    private static final zzmb<?, ?> zzc;
    private static final zzmb<?, ?> zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzmd();
    }

    public static zzmb<?, ?> zzA() {
        return zzc;
    }

    public static zzmb<?, ?> zzB() {
        return zzd;
    }

    public static <UT, UB> UB zzC(int i2, List<Integer> list, zzkb zzkbVar, UB ub, zzmb<UT, UB> zzmbVar) {
        if (zzkbVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (zzkbVar.zza(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = (UB) zzD(i2, intValue, ub, zzmbVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzkbVar.zza(intValue2)) {
                    ub = (UB) zzD(i2, intValue2, ub, zzmbVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB zzD(int i2, int i3, UB ub, zzmb<UT, UB> zzmbVar) {
        if (ub == null) {
            ub = zzmbVar.zze();
        }
        zzmbVar.zzf(ub, i2, i3);
        return ub;
    }

    public static <T, FT extends zzjn<FT>> void zzE(zzjk<FT> zzjkVar, T t, T t2) {
        zzjkVar.zza(t2);
        throw null;
    }

    public static <T, UT, UB> void zzF(zzmb<UT, UB> zzmbVar, T t, T t2) {
        zzmbVar.zzh(t, zzmbVar.zzd(zzmbVar.zzc(t), zzmbVar.zzc(t2)));
    }

    public static void zzG(Class<?> cls) {
        Class<?> cls2;
        if (!zzjx.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> void zzI(zzkx zzkxVar, T t, T t2, long j2) {
        zzml.zzs(t, j2, zzkx.zzb(zzml.zzf(t, j2), zzml.zzf(t2, j2)));
    }

    public static void zzJ(int i2, List<Boolean> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzc(i2, list, z);
    }

    public static void zzK(int i2, List<zzix> list, zzjf zzjfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zze(i2, list);
    }

    public static void zzL(int i2, List<Double> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzg(i2, list, z);
    }

    public static void zzM(int i2, List<Integer> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzj(i2, list, z);
    }

    public static void zzN(int i2, List<Integer> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzl(i2, list, z);
    }

    public static void zzO(int i2, List<Long> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzn(i2, list, z);
    }

    public static void zzP(int i2, List<Float> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzp(i2, list, z);
    }

    public static void zzQ(int i2, List<?> list, zzjf zzjfVar, zzln zzlnVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzjfVar.zzq(i2, list.get(i3), zzlnVar);
        }
    }

    public static void zzR(int i2, List<Integer> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzs(i2, list, z);
    }

    public static void zzS(int i2, List<Long> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzu(i2, list, z);
    }

    public static void zzT(int i2, List<?> list, zzjf zzjfVar, zzln zzlnVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzjfVar.zzv(i2, list.get(i3), zzlnVar);
        }
    }

    public static void zzU(int i2, List<Integer> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzx(i2, list, z);
    }

    public static void zzV(int i2, List<Long> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzz(i2, list, z);
    }

    public static void zzW(int i2, List<Integer> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzB(i2, list, z);
    }

    public static void zzX(int i2, List<Long> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzD(i2, list, z);
    }

    public static void zzY(int i2, List<String> list, zzjf zzjfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzG(i2, list);
    }

    public static void zzZ(int i2, List<Integer> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzI(i2, list, z);
    }

    public static int zza(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzA(i2 << 3) + 1) * size;
    }

    public static void zzaa(int i2, List<Long> list, zzjf zzjfVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzK(i2, list, z);
    }

    private static zzmb<?, ?> zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzmb) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List<?> list) {
        return list.size();
    }

    public static int zzc(int i2, List<zzix> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzje.zzz(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzz += zzje.zzt(list.get(i3));
        }
        return zzz;
    }

    public static int zzd(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i2) * size) + zze(list);
    }

    public static int zze(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzje.zzv(zzjyVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzje.zzv(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzf(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzA(i2 << 3) + 4) * size;
    }

    public static int zzg(List<?> list) {
        return list.size() * 4;
    }

    public static int zzh(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzA(i2 << 3) + 8) * size;
    }

    public static int zzi(List<?> list) {
        return list.size() * 8;
    }

    public static int zzj(int i2, List<zzlc> list, zzln zzlnVar) {
        int size = list.size();
        if (size != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i3 += zzje.zzu(i2, list.get(i4), zzlnVar);
            }
            return i3;
        }
        return 0;
    }

    public static int zzk(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i2) * size) + zzl(list);
    }

    public static int zzl(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzje.zzv(zzjyVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzje.zzv(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzm(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzje.zzz(i2) * list.size()) + zzn(list);
    }

    public static int zzn(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzje.zzB(zzkrVar.zza(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzje.zzB(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzo(int i2, Object obj, zzln zzlnVar) {
        if (!(obj instanceof zzkk)) {
            return zzje.zzx((zzlc) obj, zzlnVar) + zzje.zzA(i2 << 3);
        }
        int zzA = zzje.zzA(i2 << 3);
        int zza2 = ((zzkk) obj).zza();
        return zzje.zzA(zza2) + zza2 + zzA;
    }

    public static int zzp(int i2, List<?> list, zzln zzlnVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzje.zzz(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            zzz = (obj instanceof zzkk ? zzje.zzw((zzkk) obj) : zzje.zzx((zzlc) obj, zzlnVar)) + zzz;
        }
        return zzz;
    }

    public static int zzq(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i2) * size) + zzr(list);
    }

    public static int zzr(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            i2 = 0;
            while (i3 < size) {
                int zze = zzjyVar.zze(i3);
                i2 += zzje.zzA((zze >> 31) ^ (zze + zze));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                int intValue = list.get(i3).intValue();
                i2 += zzje.zzA((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
        }
        return i2;
    }

    public static int zzs(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i2) * size) + zzt(list);
    }

    public static int zzt(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            i2 = 0;
            while (i3 < size) {
                long zza2 = zzkrVar.zza(i3);
                i2 += zzje.zzB((zza2 >> 63) ^ (zza2 + zza2));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                long longValue = list.get(i3).longValue();
                i2 += zzje.zzB((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
        }
        return i2;
    }

    public static int zzu(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzje.zzz(i2) * size;
        if (list instanceof zzkm) {
            zzkm zzkmVar = (zzkm) list;
            while (i3 < size) {
                Object zzf = zzkmVar.zzf(i3);
                zzz = (zzf instanceof zzix ? zzje.zzt((zzix) zzf) : zzje.zzy((String) zzf)) + zzz;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                zzz = (obj instanceof zzix ? zzje.zzt((zzix) obj) : zzje.zzy((String) obj)) + zzz;
                i3++;
            }
        }
        return zzz;
    }

    public static int zzv(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i2) * size) + zzw(list);
    }

    public static int zzw(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzje.zzA(zzjyVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzje.zzA(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzx(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i2) * size) + zzy(list);
    }

    public static int zzy(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzje.zzB(zzkrVar.zza(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzje.zzB(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static zzmb<?, ?> zzz() {
        return zzb;
    }
}
