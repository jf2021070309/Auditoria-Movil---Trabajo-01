package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public final class zzml {
    public static final long zza;
    public static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class<?> zzd;
    private static final boolean zze;
    private static final boolean zzf;
    private static final zzmk zzg;
    private static final boolean zzh;
    private static final boolean zzi;

    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    static {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.<clinit>():void");
    }

    private zzml() {
    }

    private static int zzA(Class<?> cls) {
        if (zzi) {
            return zzg.zzi(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i2 = zzij.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC == null) {
            Field zzC2 = zzC(Buffer.class, "address");
            if (zzC2 == null || zzC2.getType() != Long.TYPE) {
                return null;
            }
            return zzC2;
        }
        return zzC;
    }

    private static Field zzC(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        zzmk zzmkVar = zzg;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        zzmkVar.zzn(obj, j3, ((255 & b2) << i2) | (zzmkVar.zzj(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        zzmk zzmkVar = zzg;
        int i2 = (((int) j2) & 3) << 3;
        zzmkVar.zzn(obj, j3, ((255 & b2) << i2) | (zzmkVar.zzj(obj, j3) & ((255 << i2) ^ (-1))));
    }

    public static double zza(Object obj, long j2) {
        return zzg.zza(obj, j2);
    }

    public static float zzb(Object obj, long j2) {
        return zzg.zzb(obj, j2);
    }

    public static int zzc(Object obj, long j2) {
        return zzg.zzj(obj, j2);
    }

    public static long zzd(Object obj, long j2) {
        return zzg.zzk(obj, j2);
    }

    public static <T> T zze(Class<T> cls) {
        try {
            return (T) zzc.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object zzf(Object obj, long j2) {
        return zzg.zzm(obj, j2);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmh());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzml.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzm(Object obj, long j2, boolean z) {
        zzg.zzc(obj, j2, z);
    }

    public static void zzn(byte[] bArr, long j2, byte b2) {
        zzg.zzd(bArr, zza + j2, b2);
    }

    public static void zzo(Object obj, long j2, double d2) {
        zzg.zze(obj, j2, d2);
    }

    public static void zzp(Object obj, long j2, float f2) {
        zzg.zzf(obj, j2, f2);
    }

    public static void zzq(Object obj, long j2, int i2) {
        zzg.zzn(obj, j2, i2);
    }

    public static void zzr(Object obj, long j2, long j3) {
        zzg.zzo(obj, j2, j3);
    }

    public static void zzs(Object obj, long j2, Object obj2) {
        zzg.zzp(obj, j2, obj2);
    }

    public static /* synthetic */ boolean zzt(Object obj, long j2) {
        return ((byte) ((zzg.zzj(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzu(Object obj, long j2) {
        return ((byte) ((zzg.zzj(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzv(Class<?> cls) {
        int i2 = zzij.zza;
        try {
            Class<?> cls2 = zzd;
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

    public static boolean zzw(Object obj, long j2) {
        return zzg.zzg(obj, j2);
    }

    public static boolean zzx() {
        return zzi;
    }

    public static boolean zzy() {
        return zzh;
    }

    private static int zzz(Class<?> cls) {
        if (zzi) {
            return zzg.zzh(cls);
        }
        return -1;
    }
}
