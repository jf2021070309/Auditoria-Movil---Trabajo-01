package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class zzgib {
    private static final Class<?> zza;
    private static final zzgio<?, ?> zzb;
    private static final zzgio<?, ?> zzc;
    private static final zzgio<?, ?> zzd;

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
        zzd = new zzgiq();
    }

    public static zzgio<?, ?> zzA() {
        return zzb;
    }

    public static zzgio<?, ?> zzB() {
        return zzc;
    }

    public static zzgio<?, ?> zzC() {
        return zzd;
    }

    public static boolean zzD(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T, FT extends zzgfq<FT>> void zzE(zzgfn<FT> zzgfnVar, T t, T t2) {
        zzgfnVar.zzb(t2);
        throw null;
    }

    public static <T, UT, UB> void zzF(zzgio<UT, UB> zzgioVar, T t, T t2) {
        zzgioVar.zzi(t, zzgioVar.zzo(zzgioVar.zzj(t), zzgioVar.zzj(t2)));
    }

    public static <UT, UB> UB zzG(int i2, List<Integer> list, zzgge zzggeVar, UB ub, zzgio<UT, UB> zzgioVar) {
        if (zzggeVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (zzggeVar.zza(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = (UB) zzH(i2, intValue, ub, zzgioVar);
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
                if (!zzggeVar.zza(intValue2)) {
                    ub = (UB) zzH(i2, intValue2, ub, zzgioVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB zzH(int i2, int i3, UB ub, zzgio<UT, UB> zzgioVar) {
        if (ub == null) {
            ub = zzgioVar.zzg();
        }
        zzgioVar.zzb(ub, i2, i3);
        return ub;
    }

    public static <T> void zzI(zzghd zzghdVar, T t, T t2, long j2) {
        zzgiy.zzo(t, j2, zzghd.zzc(zzgiy.zzn(t, j2), zzgiy.zzn(t2, j2)));
    }

    public static void zzJ(int i2, List<Double> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzB(i2, list, z);
    }

    public static void zzK(int i2, List<Float> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzA(i2, list, z);
    }

    public static void zzL(int i2, List<Long> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzx(i2, list, z);
    }

    public static void zzM(int i2, List<Long> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzy(i2, list, z);
    }

    public static void zzN(int i2, List<Long> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzK(i2, list, z);
    }

    public static void zzO(int i2, List<Long> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzz(i2, list, z);
    }

    public static void zzP(int i2, List<Long> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzI(i2, list, z);
    }

    public static void zzQ(int i2, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzv(i2, list, z);
    }

    public static void zzR(int i2, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzG(i2, list, z);
    }

    public static void zzS(int i2, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzJ(i2, list, z);
    }

    public static void zzT(int i2, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzw(i2, list, z);
    }

    public static void zzU(int i2, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzH(i2, list, z);
    }

    public static void zzV(int i2, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzC(i2, list, z);
    }

    public static void zzW(int i2, List<Boolean> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzD(i2, list, z);
    }

    public static void zzX(int i2, List<String> list, zzgfi zzgfiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzE(i2, list);
    }

    public static void zzY(int i2, List<zzgex> list, zzgfi zzgfiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzF(i2, list);
    }

    public static void zzZ(int i2, List<?> list, zzgfi zzgfiVar, zzghz zzghzVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzgfiVar.zzr(i2, list.get(i3), zzghzVar);
        }
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzgga.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzaa(int i2, List<?> list, zzgfi zzgfiVar, zzghz zzghzVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzgfiVar.zzs(i2, list.get(i3), zzghzVar);
        }
    }

    private static zzgio<?, ?> zzab(boolean z) {
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
            return (zzgio) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggx) {
            zzggx zzggxVar = (zzggx) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzgfh.zzy(zzggxVar.zzf(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzgfh.zzy(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzc(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzgfh.zzv(i2) * list.size()) + zzb(list);
    }

    public static int zzd(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggx) {
            zzggx zzggxVar = (zzggx) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzgfh.zzy(zzggxVar.zzf(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzgfh.zzy(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zze(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgfh.zzv(i2) * size) + zzd(list);
    }

    public static int zzf(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggx) {
            zzggx zzggxVar = (zzggx) list;
            i2 = 0;
            while (i3 < size) {
                long zzf = zzggxVar.zzf(i3);
                i2 += zzgfh.zzy((zzf >> 63) ^ (zzf + zzf));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                long longValue = list.get(i3).longValue();
                i2 += zzgfh.zzy((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
        }
        return i2;
    }

    public static int zzg(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgfh.zzv(i2) * size) + zzf(list);
    }

    public static int zzh(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggb) {
            zzggb zzggbVar = (zzggb) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzgfh.zzw(zzggbVar.zzg(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzgfh.zzw(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzi(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgfh.zzv(i2) * size) + zzh(list);
    }

    public static int zzj(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggb) {
            zzggb zzggbVar = (zzggb) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzgfh.zzw(zzggbVar.zzg(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzgfh.zzw(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzk(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgfh.zzv(i2) * size) + zzj(list);
    }

    public static int zzl(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggb) {
            zzggb zzggbVar = (zzggb) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzgfh.zzx(zzggbVar.zzg(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzgfh.zzx(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzm(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgfh.zzv(i2) * size) + zzl(list);
    }

    public static int zzn(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggb) {
            zzggb zzggbVar = (zzggb) list;
            i2 = 0;
            while (i3 < size) {
                int zzg = zzggbVar.zzg(i3);
                i2 += zzgfh.zzx((zzg >> 31) ^ (zzg + zzg));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                int intValue = list.get(i3).intValue();
                i2 += zzgfh.zzx((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
        }
        return i2;
    }

    public static int zzo(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgfh.zzv(i2) * size) + zzn(list);
    }

    public static int zzp(List<?> list) {
        return list.size() * 4;
    }

    public static int zzq(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgfh.zzx(i2 << 3) + 4) * size;
    }

    public static int zzr(List<?> list) {
        return list.size() * 8;
    }

    public static int zzs(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgfh.zzx(i2 << 3) + 8) * size;
    }

    public static int zzt(List<?> list) {
        return list.size();
    }

    public static int zzu(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgfh.zzx(i2 << 3) + 1) * size;
    }

    public static int zzv(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int zzv = zzgfh.zzv(i2) * size;
        if (list instanceof zzggs) {
            zzggs zzggsVar = (zzggs) list;
            while (i3 < size) {
                Object zzg = zzggsVar.zzg(i3);
                zzv = (zzg instanceof zzgex ? zzgfh.zzB((zzgex) zzg) : zzgfh.zzz((String) zzg)) + zzv;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                zzv = (obj instanceof zzgex ? zzgfh.zzB((zzgex) obj) : zzgfh.zzz((String) obj)) + zzv;
                i3++;
            }
        }
        return zzv;
    }

    public static int zzw(int i2, Object obj, zzghz zzghzVar) {
        if (!(obj instanceof zzggq)) {
            return zzgfh.zzC((zzghi) obj, zzghzVar) + zzgfh.zzx(i2 << 3);
        }
        int zzx = zzgfh.zzx(i2 << 3);
        int zza2 = ((zzggq) obj).zza();
        return zzgfh.zzx(zza2) + zza2 + zzx;
    }

    public static int zzx(int i2, List<?> list, zzghz zzghzVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzv = zzgfh.zzv(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            zzv = (obj instanceof zzggq ? zzgfh.zzA((zzggq) obj) : zzgfh.zzC((zzghi) obj, zzghzVar)) + zzv;
        }
        return zzv;
    }

    public static int zzy(int i2, List<zzgex> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzv = zzgfh.zzv(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzv += zzgfh.zzB(list.get(i3));
        }
        return zzv;
    }

    public static int zzz(int i2, List<zzghi> list, zzghz zzghzVar) {
        int size = list.size();
        if (size != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i3 += zzgfh.zzF(i2, list.get(i4), zzghzVar);
            }
            return i3;
        }
        return 0;
    }
}
