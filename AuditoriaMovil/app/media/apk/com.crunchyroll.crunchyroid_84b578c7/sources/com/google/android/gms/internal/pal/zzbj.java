package com.google.android.gms.internal.pal;

import android.util.Base64;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzbj {
    public static String zza(byte[] bArr, boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 11;
        }
        return Base64.encodeToString(bArr, i);
    }

    public static byte[] zzb(String str, boolean z) throws IllegalArgumentException {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 11;
        }
        byte[] decode = Base64.decode(str, i);
        if (decode.length == 0 && str.length() > 0) {
            throw new IllegalArgumentException("Unable to decode ".concat(str));
        }
        return decode;
    }
}
