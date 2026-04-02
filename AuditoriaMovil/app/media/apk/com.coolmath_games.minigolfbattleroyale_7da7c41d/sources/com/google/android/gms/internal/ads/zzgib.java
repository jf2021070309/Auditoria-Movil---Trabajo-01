package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzD(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzgfq<FT>> void zzE(zzgfn<FT> zzgfnVar, T t, T t2) {
        zzgfnVar.zzb(t2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zzF(zzgio<UT, UB> zzgioVar, T t, T t2) {
        zzgioVar.zzi(t, zzgioVar.zzo(zzgioVar.zzj(t), zzgioVar.zzj(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zzG(int i, List<Integer> list, zzgge zzggeVar, UB ub, zzgio<UT, UB> zzgioVar) {
        if (zzggeVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzggeVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zzH(i, intValue, ub, zzgioVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzggeVar.zza(intValue2)) {
                    ub = (UB) zzH(i, intValue2, ub, zzgioVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zzH(int i, int i2, UB ub, zzgio<UT, UB> zzgioVar) {
        if (ub == null) {
            ub = zzgioVar.zzg();
        }
        zzgioVar.zzb(ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zzI(zzghd zzghdVar, T t, T t2, long j) {
        zzgiy.zzo(t, j, zzghd.zzc(zzgiy.zzn(t, j), zzgiy.zzn(t2, j)));
    }

    public static void zzJ(int i, List<Double> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzB(i, list, z);
    }

    public static void zzK(int i, List<Float> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzA(i, list, z);
    }

    public static void zzL(int i, List<Long> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzx(i, list, z);
    }

    public static void zzM(int i, List<Long> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzy(i, list, z);
    }

    public static void zzN(int i, List<Long> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzK(i, list, z);
    }

    public static void zzO(int i, List<Long> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzz(i, list, z);
    }

    public static void zzP(int i, List<Long> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzI(i, list, z);
    }

    public static void zzQ(int i, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzv(i, list, z);
    }

    public static void zzR(int i, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzG(i, list, z);
    }

    public static void zzS(int i, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzJ(i, list, z);
    }

    public static void zzT(int i, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzw(i, list, z);
    }

    public static void zzU(int i, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzH(i, list, z);
    }

    public static void zzV(int i, List<Integer> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzC(i, list, z);
    }

    public static void zzW(int i, List<Boolean> list, zzgfi zzgfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzD(i, list, z);
    }

    public static void zzX(int i, List<String> list, zzgfi zzgfiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzE(i, list);
    }

    public static void zzY(int i, List<zzgex> list, zzgfi zzgfiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgfiVar.zzF(i, list);
    }

    public static void zzZ(int i, List<?> list, zzgfi zzgfiVar, zzghz zzghzVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgfiVar.zzr(i, list.get(i2), zzghzVar);
        }
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzgga.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzaa(int i, List<?> list, zzgfi zzgfiVar, zzghz zzghzVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgfiVar.zzs(i, list.get(i2), zzghzVar);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggx) {
            zzggx zzggxVar = (zzggx) list;
            i = 0;
            while (i2 < size) {
                i += zzgfh.zzy(zzggxVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgfh.zzy(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzb(list) + (list.size() * zzgfh.zzv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggx) {
            zzggx zzggxVar = (zzggx) list;
            i = 0;
            while (i2 < size) {
                i += zzgfh.zzy(zzggxVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgfh.zzy(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzgfh.zzv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggx) {
            zzggx zzggxVar = (zzggx) list;
            i = 0;
            while (i2 < size) {
                long zzf = zzggxVar.zzf(i2);
                i += zzgfh.zzy((zzf >> 63) ^ (zzf + zzf));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i += zzgfh.zzy((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzgfh.zzv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggb) {
            zzggb zzggbVar = (zzggb) list;
            i = 0;
            while (i2 < size) {
                i += zzgfh.zzw(zzggbVar.zzg(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgfh.zzw(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzgfh.zzv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggb) {
            zzggb zzggbVar = (zzggb) list;
            i = 0;
            while (i2 < size) {
                i += zzgfh.zzw(zzggbVar.zzg(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgfh.zzw(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzgfh.zzv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggb) {
            zzggb zzggbVar = (zzggb) list;
            i = 0;
            while (i2 < size) {
                i += zzgfh.zzx(zzggbVar.zzg(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgfh.zzx(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzgfh.zzv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzggb) {
            zzggb zzggbVar = (zzggb) list;
            i = 0;
            while (i2 < size) {
                int zzg = zzggbVar.zzg(i2);
                i += zzgfh.zzx((zzg >> 31) ^ (zzg + zzg));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i += zzgfh.zzx((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzn(list) + (size * zzgfh.zzv(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgfh.zzx(i << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgfh.zzx(i << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgfh.zzx(i << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i, List<?> list) {
        int zzz;
        int zzz2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzv = zzgfh.zzv(i) * size;
        if (list instanceof zzggs) {
            zzggs zzggsVar = (zzggs) list;
            while (i2 < size) {
                Object zzg = zzggsVar.zzg(i2);
                if (zzg instanceof zzgex) {
                    zzz2 = zzgfh.zzB((zzgex) zzg);
                } else {
                    zzz2 = zzgfh.zzz((String) zzg);
                }
                zzv += zzz2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzgex) {
                    zzz = zzgfh.zzB((zzgex) obj);
                } else {
                    zzz = zzgfh.zzz((String) obj);
                }
                zzv += zzz;
                i2++;
            }
        }
        return zzv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i, Object obj, zzghz zzghzVar) {
        if (obj instanceof zzggq) {
            int zzx = zzgfh.zzx(i << 3);
            int zza2 = ((zzggq) obj).zza();
            return zzx + zzgfh.zzx(zza2) + zza2;
        }
        return zzgfh.zzx(i << 3) + zzgfh.zzC((zzghi) obj, zzghzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i, List<?> list, zzghz zzghzVar) {
        int zzC;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzv = zzgfh.zzv(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzggq) {
                zzC = zzgfh.zzA((zzggq) obj);
            } else {
                zzC = zzgfh.zzC((zzghi) obj, zzghzVar);
            }
            zzv += zzC;
        }
        return zzv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(int i, List<zzgex> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzv = size * zzgfh.zzv(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzv += zzgfh.zzB(list.get(i2));
        }
        return zzv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzz(int i, List<zzghi> list, zzghz zzghzVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += zzgfh.zzF(i, list.get(i3), zzghzVar);
            }
            return i2;
        }
        return 0;
    }
}
