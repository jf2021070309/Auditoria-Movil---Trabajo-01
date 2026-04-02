package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Hex;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzafa {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzadv zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzadv.zzu(bArr, 0, 0, false);
    }

    public static int zza(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    public static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
