package com.google.android.gms.internal.cast_tv;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Hex;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzic {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzgy zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i = zzgy.zza;
        zzgw zzgwVar = new zzgw(bArr, 0, 0, false, null);
        try {
            zzgwVar.zza(0);
            zzf = zzgwVar;
        } catch (zzie e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zza(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    public static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
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

    public static boolean zze(zzjc zzjcVar) {
        if (!(zzjcVar instanceof zzgd)) {
            return false;
        }
        zzgd zzgdVar = (zzgd) zzjcVar;
        throw null;
    }
}
