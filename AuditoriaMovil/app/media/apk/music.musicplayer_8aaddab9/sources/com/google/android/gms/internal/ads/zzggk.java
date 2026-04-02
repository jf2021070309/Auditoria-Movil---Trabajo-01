package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzggk {
    public static final Charset zza = Charset.forName("UTF-8");
    public static final Charset zzb = Charset.forName("ISO-8859-1");
    public static final byte[] zzc;
    public static final ByteBuffer zzd;
    public static final zzgfc zze;

    static {
        byte[] bArr = new byte[0];
        zzc = bArr;
        zzd = ByteBuffer.wrap(bArr);
        zze = zzgfc.zzF(bArr, 0, 0, false);
    }

    public static <T> T zza(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T zzb(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static boolean zzc(byte[] bArr) {
        return zzgjd.zza(bArr);
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static int zze(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int zzf(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzg(byte[] bArr) {
        int length = bArr.length;
        int zzh = zzh(length, bArr, 0, length);
        if (zzh == 0) {
            return 1;
        }
        return zzh;
    }

    public static int zzh(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static Object zzi(Object obj, Object obj2) {
        return ((zzghi) obj).zzaL().zzad((zzghi) obj2).zzak();
    }
}
