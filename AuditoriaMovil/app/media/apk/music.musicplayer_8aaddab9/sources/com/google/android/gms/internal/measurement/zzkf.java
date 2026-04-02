package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class zzkf {
    public static final Charset zza = Charset.forName("US-ASCII");
    public static final Charset zzb = Charset.forName("UTF-8");
    public static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzja zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i2 = zzja.zza;
        zziz zzizVar = new zziz(bArr, 0, 0, false, null);
        try {
            zzizVar.zza(0);
            zzf = zzizVar;
        } catch (zzkh e2) {
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
        return ((zzlc) obj).zzbD().zzau((zzlc) obj2).zzaC();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zzb);
    }

    public static boolean zzi(byte[] bArr) {
        return zzmq.zze(bArr);
    }
}
