package com.google.android.gms.internal.ads;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgiy {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc = zzt();
    private static final Class<?> zzd = zzgei.zza();
    private static final boolean zze = zzu(Long.TYPE);
    private static final boolean zzf;
    private static final zzgix zzg;
    private static final boolean zzh;
    private static final boolean zzi;
    private static final long zzj;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    static {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgiy.<clinit>():void");
    }

    private zzgiy() {
    }

    static /* synthetic */ void zzB(Throwable th) {
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
        int i = zzgei.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF == null) {
            Field zzF2 = zzF(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
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
    public static void zzG(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int zzm = zzg.zzm(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzg.zzn(obj, j2, ((b & UByte.MAX_VALUE) << i) | (zzm & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int zzm = zzg.zzm(obj, j2);
        int i = (((int) j) & 3) << 3;
        zzg.zzn(obj, j2, ((b & UByte.MAX_VALUE) << i) | (zzm & (~(255 << i))));
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
        return zzg.zzm(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zze(Object obj, long j, int i) {
        zzg.zzn(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzf(Object obj, long j) {
        return zzg.zzo(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzg(Object obj, long j, long j2) {
        zzg.zzp(obj, j, j2);
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
        return zzg.zzq(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzo(Object obj, long j, Object obj2) {
        zzg.zzr(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzp(byte[] bArr, long j, byte b) {
        zzg.zza(bArr, zza + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzq(long j, byte[] bArr, long j2, long j3) {
        zzg.zzi(j, bArr, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte zzr(long j) {
        return zzg.zzh(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzs(ByteBuffer byteBuffer) {
        return zzg.zzo(byteBuffer, zzj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzt() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgiu());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzu(Class<?> cls) {
        int i = zzgei.zza;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzx(Object obj, long j) {
        return ((byte) ((zzg.zzm(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzy(Object obj, long j) {
        return ((byte) ((zzg.zzm(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
