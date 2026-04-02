package com.google.android.gms.internal.measurement;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
/* loaded from: classes2.dex */
final class zzmr {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc = zzq();
    private static final Class<?> zzd = zziq.zza();
    private static final boolean zze = zzr(Long.TYPE);
    private static final boolean zzf;
    private static final zzmq zzg;
    private static final boolean zzh;
    private static final boolean zzi;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0162  */
    static {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmr.<clinit>():void");
    }

    private zzmr() {
    }

    private static int zzA(Class<?> cls) {
        if (zzi) {
            return zzg.zzj(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i = zziq.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC == null) {
            Field zzC2 = zzC(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
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
    public static void zzD(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int zzk = zzg.zzk(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzg.zzl(obj, j2, ((b & UByte.MAX_VALUE) << i) | (zzk & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int zzk = zzg.zzk(obj, j2);
        int i = (((int) j) & 3) << 3;
        zzg.zzl(obj, j2, ((b & UByte.MAX_VALUE) << i) | (zzk & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza() {
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zzc(Class<T> cls) {
        try {
            return (T) zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(Object obj, long j) {
        return zzg.zzk(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zze(Object obj, long j, int i) {
        zzg.zzl(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzf(Object obj, long j) {
        return zzg.zzm(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzg(Object obj, long j, long j2) {
        zzg.zzn(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzh(Object obj, long j) {
        return zzg.zzb(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzi(Object obj, long j, boolean z) {
        zzg.zzc(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzj(Object obj, long j) {
        return zzg.zzd(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzk(Object obj, long j, float f) {
        zzg.zze(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzl(Object obj, long j) {
        return zzg.zzf(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzm(Object obj, long j, double d) {
        zzg.zzg(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzn(Object obj, long j) {
        return zzg.zzo(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzo(Object obj, long j, Object obj2) {
        zzg.zzp(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzp(byte[] bArr, long j, byte b) {
        zzg.zza(bArr, zza + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzq() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmn());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzr(Class<?> cls) {
        int i = zziq.zza;
        try {
            Class<?> cls2 = zzd;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ void zzs(Throwable th) {
        Logger logger = Logger.getLogger(zzmr.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzv(Object obj, long j) {
        return ((byte) ((zzg.zzk(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzw(Object obj, long j) {
        return ((byte) ((zzg.zzk(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    private static int zzz(Class<?> cls) {
        if (zzi) {
            return zzg.zzi(cls);
        }
        return -1;
    }
}
