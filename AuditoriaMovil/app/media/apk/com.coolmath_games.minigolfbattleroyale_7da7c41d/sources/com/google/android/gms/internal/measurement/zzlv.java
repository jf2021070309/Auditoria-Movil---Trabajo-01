package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzlv {
    private static final Class<?> zza;
    private static final zzmh<?, ?> zzb;
    private static final zzmh<?, ?> zzc;
    private static final zzmh<?, ?> zzd;

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
        zzd = new zzmj();
    }

    public static zzmh<?, ?> zzA() {
        return zzb;
    }

    public static zzmh<?, ?> zzB() {
        return zzc;
    }

    public static zzmh<?, ?> zzC() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzD(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzjt<FT>> void zzE(zzjq<FT> zzjqVar, T t, T t2) {
        zzjqVar.zzb(t2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zzF(zzmh<UT, UB> zzmhVar, T t, T t2) {
        zzmhVar.zzc(t, zzmhVar.zzf(zzmhVar.zzd(t), zzmhVar.zzd(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zzG(int i, List<Integer> list, zzkh zzkhVar, UB ub, zzmh<UT, UB> zzmhVar) {
        if (zzkhVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzkhVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zzH(i, intValue, ub, zzmhVar);
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
                if (!zzkhVar.zza(intValue2)) {
                    ub = (UB) zzH(i, intValue2, ub, zzmhVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB zzH(int i, int i2, UB ub, zzmh<UT, UB> zzmhVar) {
        if (ub == null) {
            ub = zzmhVar.zzb();
        }
        zzmhVar.zza(ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zzI(zzld zzldVar, T t, T t2, long j) {
        zzmr.zzo(t, j, zzld.zzb(zzmr.zzn(t, j), zzmr.zzn(t2, j)));
    }

    public static void zzJ(int i, List<Double> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzB(i, list, z);
    }

    public static void zzK(int i, List<Float> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzA(i, list, z);
    }

    public static void zzL(int i, List<Long> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzx(i, list, z);
    }

    public static void zzM(int i, List<Long> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzy(i, list, z);
    }

    public static void zzN(int i, List<Long> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzK(i, list, z);
    }

    public static void zzO(int i, List<Long> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzz(i, list, z);
    }

    public static void zzP(int i, List<Long> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzI(i, list, z);
    }

    public static void zzQ(int i, List<Integer> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzv(i, list, z);
    }

    public static void zzR(int i, List<Integer> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzG(i, list, z);
    }

    public static void zzS(int i, List<Integer> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzJ(i, list, z);
    }

    public static void zzT(int i, List<Integer> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzw(i, list, z);
    }

    public static void zzU(int i, List<Integer> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzH(i, list, z);
    }

    public static void zzV(int i, List<Integer> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzC(i, list, z);
    }

    public static void zzW(int i, List<Boolean> list, zzjl zzjlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzD(i, list, z);
    }

    public static void zzX(int i, List<String> list, zzjl zzjlVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzE(i, list);
    }

    public static void zzY(int i, List<zzjd> list, zzjl zzjlVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjlVar.zzF(i, list);
    }

    public static void zzZ(int i, List<?> list, zzjl zzjlVar, zzlt zzltVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzjlVar.zzr(i, list.get(i2), zzltVar);
        }
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzkd.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzaa(int i, List<?> list, zzjl zzjlVar, zzlt zzltVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzjlVar.zzs(i, list.get(i2), zzltVar);
        }
    }

    private static zzmh<?, ?> zzab(boolean z) {
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
            return (zzmh) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
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
        if (list instanceof zzkx) {
            zzkx zzkxVar = (zzkx) list;
            i = 0;
            while (i2 < size) {
                i += zzjk.zzx(zzkxVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjk.zzx(list.get(i2).longValue());
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
        return zzb(list) + (list.size() * zzjk.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkx) {
            zzkx zzkxVar = (zzkx) list;
            i = 0;
            while (i2 < size) {
                i += zzjk.zzx(zzkxVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjk.zzx(list.get(i2).longValue());
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
        return zzd(list) + (size * zzjk.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkx) {
            zzkx zzkxVar = (zzkx) list;
            i = 0;
            while (i2 < size) {
                long zzc2 = zzkxVar.zzc(i2);
                i += zzjk.zzx((zzc2 >> 63) ^ (zzc2 + zzc2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i += zzjk.zzx((longValue >> 63) ^ (longValue + longValue));
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
        return zzf(list) + (size * zzjk.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            i = 0;
            while (i2 < size) {
                i += zzjk.zzv(zzkeVar.zzg(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjk.zzv(list.get(i2).intValue());
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
        return zzh(list) + (size * zzjk.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            i = 0;
            while (i2 < size) {
                i += zzjk.zzv(zzkeVar.zzg(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjk.zzv(list.get(i2).intValue());
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
        return zzj(list) + (size * zzjk.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            i = 0;
            while (i2 < size) {
                i += zzjk.zzw(zzkeVar.zzg(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjk.zzw(list.get(i2).intValue());
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
        return zzl(list) + (size * zzjk.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            i = 0;
            while (i2 < size) {
                int zzg = zzkeVar.zzg(i2);
                i += zzjk.zzw((zzg >> 31) ^ (zzg + zzg));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i += zzjk.zzw((intValue >> 31) ^ (intValue + intValue));
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
        return zzn(list) + (size * zzjk.zzu(i));
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
        return size * (zzjk.zzw(i << 3) + 4);
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
        return size * (zzjk.zzw(i << 3) + 8);
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
        return size * (zzjk.zzw(i << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i, List<?> list) {
        int zzy;
        int zzy2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzu = zzjk.zzu(i) * size;
        if (list instanceof zzks) {
            zzks zzksVar = (zzks) list;
            while (i2 < size) {
                Object zzg = zzksVar.zzg(i2);
                if (zzg instanceof zzjd) {
                    zzy2 = zzjk.zzA((zzjd) zzg);
                } else {
                    zzy2 = zzjk.zzy((String) zzg);
                }
                zzu += zzy2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzjd) {
                    zzy = zzjk.zzA((zzjd) obj);
                } else {
                    zzy = zzjk.zzy((String) obj);
                }
                zzu += zzy;
                i2++;
            }
        }
        return zzu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i, Object obj, zzlt zzltVar) {
        if (obj instanceof zzkq) {
            int zzw = zzjk.zzw(i << 3);
            int zza2 = ((zzkq) obj).zza();
            return zzw + zzjk.zzw(zza2) + zza2;
        }
        return zzjk.zzw(i << 3) + zzjk.zzB((zzli) obj, zzltVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i, List<?> list, zzlt zzltVar) {
        int zzB;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = zzjk.zzu(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzkq) {
                zzB = zzjk.zzz((zzkq) obj);
            } else {
                zzB = zzjk.zzB((zzli) obj, zzltVar);
            }
            zzu += zzB;
        }
        return zzu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(int i, List<zzjd> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = size * zzjk.zzu(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzu += zzjk.zzA(list.get(i2));
        }
        return zzu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzz(int i, List<zzli> list, zzlt zzltVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += zzjk.zzE(i, list.get(i3), zzltVar);
            }
            return i2;
        }
        return 0;
    }
}
