package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzev {
    public static final Charset zza = Charset.forName("UTF-8");
    public static final Charset zzb = Charset.forName("ISO-8859-1");
    public static final byte[] zzc;
    public static final ByteBuffer zzd;
    public static final zzee zze;

    static {
        byte[] bArr = new byte[0];
        zzc = bArr;
        zzd = ByteBuffer.wrap(bArr);
        int i2 = zzee.zza;
        zzed zzedVar = new zzed(bArr, 0, 0, false, null);
        try {
            zzedVar.zza(0);
            zze = zzedVar;
        } catch (zzew e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int zzd2 = zzd(length, bArr, 0, length);
        if (zzd2 == 0) {
            return 1;
        }
        return zzd2;
    }

    public static int zzc(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int zzd(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static <T> T zze(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T zzf(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static Object zzg(Object obj, Object obj2) {
        return ((zzfq) obj).zze().zzc((zzfq) obj2).zzg();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static boolean zzi(byte[] bArr) {
        return zzhd.zzc(bArr);
    }
}
