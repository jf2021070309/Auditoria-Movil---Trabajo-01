package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzaet {
    private static final Class zza;
    private static final zzafi zzb;
    private static final zzafi zzc;
    private static final zzafi zzd;

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
        zzd = new zzafk();
    }

    public static zzafi zzA() {
        return zzc;
    }

    public static zzafi zzB() {
        return zzd;
    }

    public static Object zzC(int i, List list, zzadd zzaddVar, Object obj, zzafi zzafiVar) {
        if (zzaddVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzaddVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = zzD(i, intValue, obj, zzafiVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzaddVar.zza(intValue2)) {
                    obj = zzD(i, intValue2, obj, zzafiVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i, int i2, Object obj, zzafi zzafiVar) {
        if (obj == null) {
            obj = zzafiVar.zzf();
        }
        zzafiVar.zzl(obj, i, i2);
        return obj;
    }

    public static void zzE(zzacn zzacnVar, Object obj, Object obj2) {
        zzacnVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzafi zzafiVar, Object obj, Object obj2) {
        zzafiVar.zzo(obj, zzafiVar.zze(zzafiVar.zzd(obj), zzafiVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzacz.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzc(i, list, z);
        }
    }

    public static void zzI(int i, List list, zzaga zzagaVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zze(i, list);
        }
    }

    public static void zzJ(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzg(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzj(i, list, z);
        }
    }

    public static void zzL(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzl(i, list, z);
        }
    }

    public static void zzM(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzn(i, list, z);
        }
    }

    public static void zzN(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzp(i, list, z);
        }
    }

    public static void zzO(int i, List list, zzaga zzagaVar, zzaer zzaerVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzaci) zzagaVar).zzq(i, list.get(i2), zzaerVar);
            }
        }
    }

    public static void zzP(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzs(i, list, z);
        }
    }

    public static void zzQ(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzu(i, list, z);
        }
    }

    public static void zzR(int i, List list, zzaga zzagaVar, zzaer zzaerVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzaci) zzagaVar).zzv(i, list.get(i2), zzaerVar);
            }
        }
    }

    public static void zzS(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzx(i, list, z);
        }
    }

    public static void zzT(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzz(i, list, z);
        }
    }

    public static void zzU(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzB(i, list, z);
        }
    }

    public static void zzV(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzD(i, list, z);
        }
    }

    public static void zzW(int i, List list, zzaga zzagaVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzG(i, list);
        }
    }

    public static void zzX(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzI(i, list, z);
        }
    }

    public static void zzY(int i, List list, zzaga zzagaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzagaVar.zzK(i, list, z);
        }
    }

    public static boolean zzZ(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzA(i << 3) + 1) * size;
    }

    public static void zzaa(zzaea zzaeaVar, Object obj, Object obj2, long j) {
        zzafs.zzs(obj, j, zzaea.zzc(zzafs.zzf(obj, j), zzafs.zzf(obj2, j)));
    }

    private static zzafi zzab(boolean z) {
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
            return (zzafi) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzach.zzz(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzz += zzach.zzt((zzaby) list.get(i2));
        }
        return zzz;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i) * size) + zze(list);
    }

    public static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            i = 0;
            while (i2 < size) {
                i += zzach.zzv(zzadaVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzach.zzv(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzA(i << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzA(i << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List list, zzaer zzaerVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzach.zzu(i, (zzaef) list.get(i3), zzaerVar);
        }
        return i2;
    }

    public static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            i = 0;
            while (i2 < size) {
                i += zzach.zzv(zzadaVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzach.zzv(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzach.zzz(i) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadu) {
            zzadu zzaduVar = (zzadu) list;
            i = 0;
            while (i2 < size) {
                i += zzach.zzB(zzaduVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzach.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzo(int i, Object obj, zzaer zzaerVar) {
        if (obj instanceof zzadl) {
            int zzA = zzach.zzA(i << 3);
            int zza2 = ((zzadl) obj).zza();
            return zzach.zzA(zza2) + zza2 + zzA;
        }
        return zzach.zzx((zzaef) obj, zzaerVar) + zzach.zzA(i << 3);
    }

    public static int zzp(int i, List list, zzaer zzaerVar) {
        int zzx;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzach.zzz(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzadl) {
                zzx = zzach.zzw((zzadl) obj);
            } else {
                zzx = zzach.zzx((zzaef) obj, zzaerVar);
            }
            zzz = zzx + zzz;
        }
        return zzz;
    }

    public static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            i = 0;
            while (i2 < size) {
                int zze = zzadaVar.zze(i2);
                i += zzach.zzA((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzach.zzA((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadu) {
            zzadu zzaduVar = (zzadu) list;
            i = 0;
            while (i2 < size) {
                long zze = zzaduVar.zze(i2);
                i += zzach.zzB((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzach.zzB((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzu(int i, List list) {
        int zzy;
        int zzy2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzach.zzz(i) * size;
        if (list instanceof zzadn) {
            zzadn zzadnVar = (zzadn) list;
            while (i2 < size) {
                Object zzf = zzadnVar.zzf(i2);
                if (zzf instanceof zzaby) {
                    zzy2 = zzach.zzt((zzaby) zzf);
                } else {
                    zzy2 = zzach.zzy((String) zzf);
                }
                zzz = zzy2 + zzz;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzaby) {
                    zzy = zzach.zzt((zzaby) obj);
                } else {
                    zzy = zzach.zzy((String) obj);
                }
                zzz = zzy + zzz;
                i2++;
            }
        }
        return zzz;
    }

    public static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            i = 0;
            while (i2 < size) {
                i += zzach.zzA(zzadaVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzach.zzA(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadu) {
            zzadu zzaduVar = (zzadu) list;
            i = 0;
            while (i2 < size) {
                i += zzach.zzB(zzaduVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzach.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzafi zzz() {
        return zzb;
    }
}
