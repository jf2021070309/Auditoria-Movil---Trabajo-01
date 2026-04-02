package com.google.android.gms.internal.cast_tv;

import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzjp {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzke zzc;
    private static final zzke zzd;
    private static final zzke zze;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        zzc = zzX(false);
        zzd = zzX(true);
        zze = new zzkg();
    }

    public static zzke zzA() {
        return zze;
    }

    public static Object zzB(Object obj, int i, int i2, Object obj2, zzke zzkeVar) {
        if (obj2 == null) {
            obj2 = zzkeVar.zzc(obj);
        }
        zzkeVar.zzg(obj2, i, i2);
        return obj2;
    }

    public static void zzC(zzke zzkeVar, Object obj, Object obj2) {
        zzkeVar.zzj(obj, zzkeVar.zze(zzkeVar.zzd(obj), zzkeVar.zzd(obj2)));
    }

    public static void zzD(Class cls) {
        Class cls2;
        if (!zzht.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzE(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzc(i, list, z);
        }
    }

    public static void zzF(int i, List list, zzkw zzkwVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zze(i, list);
        }
    }

    public static void zzG(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzg(i, list, z);
        }
    }

    public static void zzH(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzj(i, list, z);
        }
    }

    public static void zzI(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzl(i, list, z);
        }
    }

    public static void zzJ(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzn(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzp(i, list, z);
        }
    }

    public static void zzL(int i, List list, zzkw zzkwVar, zzjn zzjnVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzhd) zzkwVar).zzq(i, list.get(i2), zzjnVar);
            }
        }
    }

    public static void zzM(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzs(i, list, z);
        }
    }

    public static void zzN(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzu(i, list, z);
        }
    }

    public static void zzO(int i, List list, zzkw zzkwVar, zzjn zzjnVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzhd) zzkwVar).zzw(i, list.get(i2), zzjnVar);
            }
        }
    }

    public static void zzP(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzy(i, list, z);
        }
    }

    public static void zzQ(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzA(i, list, z);
        }
    }

    public static void zzR(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzC(i, list, z);
        }
    }

    public static void zzS(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzE(i, list, z);
        }
    }

    public static void zzT(int i, List list, zzkw zzkwVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzH(i, list);
        }
    }

    public static void zzU(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzJ(i, list, z);
        }
    }

    public static void zzV(int i, List list, zzkw zzkwVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzkwVar.zzL(i, list, z);
        }
    }

    public static boolean zzW(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    private static zzke zzX(boolean z) {
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
            return (zzke) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhc.zzy(i << 3) + 1) * size;
    }

    public static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = zzhc.zzy(i << 3) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int zzd2 = ((zzgu) list.get(i2)).zzd();
            zzy += zzhc.zzy(zzd2) + zzd2;
        }
        return zzy;
    }

    public static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhc.zzy(i << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhu) {
            zzhu zzhuVar = (zzhu) list;
            i = 0;
            while (i2 < size) {
                i += zzhc.zzv(zzhuVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhc.zzv(((Integer) list.get(i2)).intValue());
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
        return (zzhc.zzy(i << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhc.zzy(i << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i, List list, zzjn zzjnVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzhc.zzu(i, (zzjc) list.get(i3), zzjnVar);
        }
        return i2;
    }

    public static int zzj(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhc.zzy(i << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhu) {
            zzhu zzhuVar = (zzhu) list;
            i = 0;
            while (i2 < size) {
                i += zzhc.zzv(zzhuVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhc.zzv(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzl(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzhc.zzy(i << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziq) {
            zziq zziqVar = (zziq) list;
            i = 0;
            while (i2 < size) {
                i += zzhc.zzz(zziqVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhc.zzz(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzn(int i, Object obj, zzjn zzjnVar) {
        if (obj instanceof zzih) {
            int i2 = zzhc.zzb;
            int zza2 = ((zzih) obj).zza();
            return zzhc.zzy(i << 3) + zzhc.zzy(zza2) + zza2;
        }
        return zzhc.zzy(i << 3) + zzhc.zzw((zzjc) obj, zzjnVar);
    }

    public static int zzo(int i, List list, zzjn zzjnVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = zzhc.zzy(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzih) {
                int zza2 = ((zzih) obj).zza();
                zzy = zzhc.zzy(zza2) + zza2 + zzy;
            } else {
                zzy = zzhc.zzw((zzjc) obj, zzjnVar) + zzy;
            }
        }
        return zzy;
    }

    public static int zzp(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhc.zzy(i << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhu) {
            zzhu zzhuVar = (zzhu) list;
            i = 0;
            while (i2 < size) {
                int zze2 = zzhuVar.zze(i2);
                i += zzhc.zzy((zze2 >> 31) ^ (zze2 + zze2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzhc.zzy((intValue >> 31) ^ (intValue + intValue));
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
        return (zzhc.zzy(i << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziq) {
            zziq zziqVar = (zziq) list;
            i = 0;
            while (i2 < size) {
                long zze2 = zziqVar.zze(i2);
                i += zzhc.zzz((zze2 >> 63) ^ (zze2 + zze2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzhc.zzz((longValue >> 63) ^ (longValue + longValue));
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
        int i3 = zzhc.zzb;
        boolean z = list instanceof zzij;
        int zzy = zzhc.zzy(i << 3) * size;
        if (z) {
            zzij zzijVar = (zzij) list;
            while (i2 < size) {
                Object zzf = zzijVar.zzf(i2);
                if (zzf instanceof zzgu) {
                    int zzd2 = ((zzgu) zzf).zzd();
                    zzy = zzhc.zzy(zzd2) + zzd2 + zzy;
                } else {
                    zzy = zzhc.zzx((String) zzf) + zzy;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzgu) {
                    int zzd3 = ((zzgu) obj).zzd();
                    zzy = zzhc.zzy(zzd3) + zzd3 + zzy;
                } else {
                    zzy = zzhc.zzx((String) obj) + zzy;
                }
                i2++;
            }
        }
        return zzy;
    }

    public static int zzu(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhc.zzy(i << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhu) {
            zzhu zzhuVar = (zzhu) list;
            i = 0;
            while (i2 < size) {
                i += zzhc.zzy(zzhuVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhc.zzy(((Integer) list.get(i2)).intValue());
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
        return (zzhc.zzy(i << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziq) {
            zziq zziqVar = (zziq) list;
            i = 0;
            while (i2 < size) {
                i += zzhc.zzz(zziqVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhc.zzz(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzke zzy() {
        return zzc;
    }

    public static zzke zzz() {
        return zzd;
    }
}
