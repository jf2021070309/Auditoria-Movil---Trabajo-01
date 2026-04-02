package com.google.android.gms.internal.ads;

import java.security.SecureRandom;
/* loaded from: classes.dex */
public final class zzgds {
    private static final ThreadLocal<SecureRandom> zza = new zzgdr();

    public static byte[] zza(int i2) {
        byte[] bArr = new byte[i2];
        zza.get().nextBytes(bArr);
        return bArr;
    }
}
