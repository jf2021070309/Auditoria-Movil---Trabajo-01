package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class zzgiy {
    public static final long zza;
    public static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class<?> zzd;
    private static final boolean zze;
    private static final boolean zzf;
    private static final zzgix zzg;
    private static final boolean zzh;
    private static final boolean zzi;
    private static final long zzj;

    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0141  */
    static {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgiy.<clinit>():void");
    }

    private zzgiy() {
    }

    public static /* synthetic */ void zzB(Throwable th) {
        Logger.getLogger(zzgiy.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzC(Class<?> cls) {
        if (zzi) {
            return zzg.zzk(cls);
        }
        return -1;
    }

    private static int zzD(Class<?> cls) {
        if (zzi) {
            return zzg.zzl(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i2 = zzgei.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF == null) {
            Field zzF2 = zzF(Buffer.class, "address");
            if (zzF2 == null || zzF2.getType() != Long.TYPE) {
                return null;
            }
            return zzF2;
        }
        return zzF;
    }

    private static Field zzF(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        zzgix zzgixVar = zzg;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        zzgixVar.zzn(obj, j3, ((255 & b2) << i2) | (zzgixVar.zzm(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        zzgix zzgixVar = zzg;
        int i2 = (((int) j2) & 3) << 3;
        zzgixVar.zzn(obj, j3, ((255 & b2) << i2) | (zzgixVar.zzm(obj, j3) & ((255 << i2) ^ (-1))));
    }

    public static boolean zza() {
        return zzi;
    }

    public static boolean zzb() {
        return zzh;
    }

    public static <T> T zzc(Class<T> cls) {
        try {
            return (T) zzc.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int zzd(Object obj, long j2) {
        return zzg.zzm(obj, j2);
    }

    public static void zze(Object obj, long j2, int i2) {
        zzg.zzn(obj, j2, i2);
    }

    public static long zzf(Object obj, long j2) {
        return zzg.zzo(obj, j2);
    }

    public static void zzg(Object obj, long j2, long j3) {
        zzg.zzp(obj, j2, j3);
    }

    public static boolean zzh(Object obj, long j2) {
        return zzg.zzb(obj, j2);
    }

    public static void zzi(Object obj, long j2, boolean z) {
        zzg.zzc(obj, j2, z);
    }

    public static float zzj(Object obj, long j2) {
        return zzg.zzd(obj, j2);
    }

    public static void zzk(Object obj, long j2, float f2) {
        zzg.zze(obj, j2, f2);
    }

    public static double zzl(Object obj, long j2) {
        return zzg.zzf(obj, j2);
    }

    public static void zzm(Object obj, long j2, double d2) {
        zzg.zzg(obj, j2, d2);
    }

    public static Object zzn(Object obj, long j2) {
        return zzg.zzq(obj, j2);
    }

    public static void zzo(Object obj, long j2, Object obj2) {
        zzg.zzr(obj, j2, obj2);
    }

    public static void zzp(byte[] bArr, long j2, byte b2) {
        zzg.zza(bArr, zza + j2, b2);
    }

    public static void zzq(long j2, byte[] bArr, long j3, long j4) {
        zzg.zzi(j2, bArr, j3, j4);
    }

    public static byte zzr(long j2) {
        return zzg.zzh(j2);
    }

    public static long zzs(ByteBuffer byteBuffer) {
        return zzg.zzo(byteBuffer, zzj);
    }

    public static Unsafe zzt() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgiu());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzu(Class<?> cls) {
        int i2 = zzgei.zza;
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

    public static /* synthetic */ boolean zzx(Object obj, long j2) {
        return ((byte) ((zzg.zzm(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzy(Object obj, long j2) {
        return ((byte) ((zzg.zzm(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }
}
