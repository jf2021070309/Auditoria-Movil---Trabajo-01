package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzagu {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzahj zzc;
    private static final zzahj zzd;
    private static final zzahj zze;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        zzc = zzY(false);
        zzd = zzY(true);
        zze = new zzahl();
    }

    public static zzahj zzA() {
        return zze;
    }

    public static Object zzB(Object obj, int i, List list, zzaex zzaexVar, Object obj2, zzahj zzahjVar) {
        if (zzaexVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzaexVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = zzC(obj, i, intValue, obj2, zzahjVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzaexVar.zza(intValue2)) {
                    obj2 = zzC(obj, i, intValue2, obj2, zzahjVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzC(Object obj, int i, int i2, Object obj2, zzahj zzahjVar) {
        if (obj2 == null) {
            obj2 = zzahjVar.zzc(obj);
        }
        zzahjVar.zzl(obj2, i, i2);
        return obj2;
    }

    public static void zzD(zzahj zzahjVar, Object obj, Object obj2) {
        zzahjVar.zzo(obj, zzahjVar.zze(zzahjVar.zzd(obj), zzahjVar.zzd(obj2)));
    }

    public static void zzE(Class cls) {
        Class cls2;
        if (!zzaet.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzF(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzc(i, list, z);
        }
    }

    public static void zzG(int i, List list, zzaib zzaibVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zze(i, list);
        }
    }

    public static void zzH(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzg(i, list, z);
        }
    }

    public static void zzI(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzj(i, list, z);
        }
    }

    public static void zzJ(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzl(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzn(i, list, z);
        }
    }

    public static void zzL(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzp(i, list, z);
        }
    }

    public static void zzM(int i, List list, zzaib zzaibVar, zzags zzagsVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzaeb) zzaibVar).zzq(i, list.get(i2), zzagsVar);
            }
        }
    }

    public static void zzN(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzs(i, list, z);
        }
    }

    public static void zzO(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzu(i, list, z);
        }
    }

    public static void zzP(int i, List list, zzaib zzaibVar, zzags zzagsVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzaeb) zzaibVar).zzv(i, list.get(i2), zzagsVar);
            }
        }
    }

    public static void zzQ(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzx(i, list, z);
        }
    }

    public static void zzR(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzz(i, list, z);
        }
    }

    public static void zzS(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzB(i, list, z);
        }
    }

    public static void zzT(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzD(i, list, z);
        }
    }

    public static void zzU(int i, List list, zzaib zzaibVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzG(i, list);
        }
    }

    public static void zzV(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzI(i, list, z);
        }
    }

    public static void zzW(int i, List list, zzaib zzaibVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaibVar.zzK(i, list, z);
        }
    }

    public static boolean zzX(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    private static zzahj zzY(boolean z) {
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
            return (zzahj) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i << 3) + 1) * size;
    }

    public static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzaea.zzx(i << 3) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int zzd2 = ((zzadr) list.get(i2)).zzd();
            zzx += zzaea.zzx(zzd2) + zzd2;
        }
        return zzx;
    }

    public static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            i = 0;
            while (i2 < size) {
                i += zzaea.zzu(zzaeuVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaea.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i, List list, zzags zzagsVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzaea.zzt(i, (zzafz) list.get(i3), zzagsVar);
        }
        return i2;
    }

    public static int zzj(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            i = 0;
            while (i2 < size) {
                i += zzaea.zzu(zzaeuVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaea.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzl(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzaea.zzx(i << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            i = 0;
            while (i2 < size) {
                i += zzaea.zzy(zzafoVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaea.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzn(int i, Object obj, zzags zzagsVar) {
        if (obj instanceof zzaff) {
            int i2 = zzaea.zzb;
            int zza2 = ((zzaff) obj).zza();
            return zzaea.zzx(i << 3) + zzaea.zzx(zza2) + zza2;
        }
        return zzaea.zzx(i << 3) + zzaea.zzv((zzafz) obj, zzagsVar);
    }

    public static int zzo(int i, List list, zzags zzagsVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzaea.zzx(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzaff) {
                int zza2 = ((zzaff) obj).zza();
                zzx = zzaea.zzx(zza2) + zza2 + zzx;
            } else {
                zzx = zzaea.zzv((zzafz) obj, zzagsVar) + zzx;
            }
        }
        return zzx;
    }

    public static int zzp(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            i = 0;
            while (i2 < size) {
                int zze2 = zzaeuVar.zze(i2);
                i += zzaea.zzx((zze2 >> 31) ^ (zze2 + zze2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzaea.zzx((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzr(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            i = 0;
            while (i2 < size) {
                long zze2 = zzafoVar.zze(i2);
                i += zzaea.zzy((zze2 >> 63) ^ (zze2 + zze2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzaea.zzy((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzt(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = zzaea.zzb;
        boolean z = list instanceof zzafh;
        int zzx = zzaea.zzx(i << 3) * size;
        if (z) {
            zzafh zzafhVar = (zzafh) list;
            while (i2 < size) {
                Object zzf = zzafhVar.zzf(i2);
                if (zzf instanceof zzadr) {
                    int zzd2 = ((zzadr) zzf).zzd();
                    zzx = zzaea.zzx(zzd2) + zzd2 + zzx;
                } else {
                    zzx = zzaea.zzw((String) zzf) + zzx;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzadr) {
                    int zzd3 = ((zzadr) obj).zzd();
                    zzx = zzaea.zzx(zzd3) + zzd3 + zzx;
                } else {
                    zzx = zzaea.zzw((String) obj) + zzx;
                }
                i2++;
            }
        }
        return zzx;
    }

    public static int zzu(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            i = 0;
            while (i2 < size) {
                i += zzaea.zzx(zzaeuVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaea.zzx(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzw(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            i = 0;
            while (i2 < size) {
                i += zzaea.zzy(zzafoVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaea.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzahj zzy() {
        return zzc;
    }

    public static zzahj zzz() {
        return zzd;
    }
}
