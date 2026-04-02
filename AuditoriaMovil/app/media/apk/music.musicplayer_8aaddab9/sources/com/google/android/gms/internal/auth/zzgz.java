package com.google.android.gms.internal.auth;

import e.a.d.a.a;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class zzgz {
    public static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzgy zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    static {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzgz.<clinit>():void");
    }

    private zzgz() {
    }

    public static double zza(Object obj, long j2) {
        return zzf.zza(obj, j2);
    }

    public static float zzb(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    public static int zzc(Object obj, long j2) {
        return zzf.zzi(obj, j2);
    }

    public static long zzd(Object obj, long j2) {
        return zzf.zzj(obj, j2);
    }

    public static <T> T zze(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object zzf(Object obj, long j2) {
        return zzf.zzl(obj, j2);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgv());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zzh(Throwable th) {
        Logger logger = Logger.getLogger(zzgz.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", a.r(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }

    public static /* synthetic */ void zzi(Object obj, long j2, boolean z) {
        long j3 = (-4) & j2;
        zzgy zzgyVar = zzf;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        int i3 = (255 << i2) ^ (-1);
        zzgyVar.zzm(obj, j3, ((z ? 1 : 0) << i2) | (i3 & zzgyVar.zzi(obj, j3)));
    }

    public static /* synthetic */ void zzj(Object obj, long j2, boolean z) {
        long j3 = (-4) & j2;
        zzgy zzgyVar = zzf;
        int i2 = (((int) j2) & 3) << 3;
        int i3 = (255 << i2) ^ (-1);
        zzgyVar.zzm(obj, j3, ((z ? 1 : 0) << i2) | (i3 & zzgyVar.zzi(obj, j3)));
    }

    public static void zzk(Object obj, long j2, boolean z) {
        zzf.zzc(obj, j2, z);
    }

    public static void zzl(Object obj, long j2, double d2) {
        zzf.zzd(obj, j2, d2);
    }

    public static void zzm(Object obj, long j2, float f2) {
        zzf.zze(obj, j2, f2);
    }

    public static void zzn(Object obj, long j2, int i2) {
        zzf.zzm(obj, j2, i2);
    }

    public static void zzo(Object obj, long j2, long j3) {
        zzf.zzn(obj, j2, j3);
    }

    public static void zzp(Object obj, long j2, Object obj2) {
        zzf.zzo(obj, j2, obj2);
    }

    public static /* synthetic */ boolean zzq(Object obj, long j2) {
        return ((byte) ((zzf.zzi(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzr(Object obj, long j2) {
        return ((byte) ((zzf.zzi(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzs(Class<?> cls) {
        int i2 = zzdo.zza;
        try {
            Class<?> cls2 = zzc;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzt(Object obj, long j2) {
        return zzf.zzf(obj, j2);
    }

    public static boolean zzu() {
        return zzh;
    }

    public static boolean zzv() {
        return zzg;
    }

    private static int zzw(Class<?> cls) {
        if (zzh) {
            return zzf.zzg(cls);
        }
        return -1;
    }

    private static int zzx(Class<?> cls) {
        if (zzh) {
            return zzf.zzh(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i2 = zzdo.zza;
        Field zzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (zzz == null) {
            Field zzz2 = zzz(Buffer.class, "address");
            if (zzz2 == null || zzz2.getType() != Long.TYPE) {
                return null;
            }
            return zzz2;
        }
        return zzz;
    }

    private static Field zzz(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
