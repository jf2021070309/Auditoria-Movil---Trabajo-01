package com.google.android.gms.internal.pal;

import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Hex;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzxn {
    private static final Charset zza = Charset.forName(Hex.DEFAULT_CHARSET_NAME);

    public static byte[] zza(String str, int i) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        zzxm zzxmVar = new zzxm(2, new byte[(length * 3) / 4]);
        if (zzxmVar.zza(bytes, 0, length, true)) {
            int i2 = zzxmVar.zzb;
            byte[] bArr = zzxmVar.zza;
            if (i2 == bArr.length) {
                return bArr;
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            return bArr2;
        }
        throw new IllegalArgumentException("bad base-64");
    }
}
