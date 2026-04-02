package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class zzgd {
    private static final Class<?> zza;
    private static final zzgp<?, ?> zzb;
    private static final zzgp<?, ?> zzc;
    private static final zzgp<?, ?> zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzj(false);
        zzc = zzj(true);
        zzd = new zzgr();
    }

    public static zzgp<?, ?> zza() {
        return zzb;
    }

    public static zzgp<?, ?> zzb() {
        return zzc;
    }

    public static zzgp<?, ?> zzc() {
        return zzd;
    }

    public static <UT, UB> UB zzd(int i2, List<Integer> list, zzet zzetVar, UB ub, zzgp<UT, UB> zzgpVar) {
        if (zzetVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (zzetVar.zza()) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = (UB) zze(i2, intValue, ub, zzgpVar);
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
                if (!zzetVar.zza()) {
                    ub = (UB) zze(i2, intValue2, ub, zzgpVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB zze(int i2, int i3, UB ub, zzgp<UT, UB> zzgpVar) {
        if (ub == null) {
            ub = zzgpVar.zzc();
        }
        zzgpVar.zzd(ub, i2, i3);
        return ub;
    }

    public static <T, UT, UB> void zzf(zzgp<UT, UB> zzgpVar, T t, T t2) {
        zzgpVar.zzf(t, zzgpVar.zzb(zzgpVar.zza(t), zzgpVar.zza(t2)));
    }

    public static void zzg(Class<?> cls) {
        Class<?> cls2;
        if (!zzeq.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzh(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> void zzi(zzfl zzflVar, T t, T t2, long j2) {
        zzgz.zzp(t, j2, zzfl.zza(zzgz.zzf(t, j2), zzgz.zzf(t2, j2)));
    }

    private static zzgp<?, ?> zzj(boolean z) {
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
            return (zzgp) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
