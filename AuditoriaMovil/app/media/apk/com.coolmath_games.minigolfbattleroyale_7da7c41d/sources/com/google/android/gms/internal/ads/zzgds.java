package com.google.android.gms.internal.ads;

import java.security.SecureRandom;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgds {
    private static final ThreadLocal<SecureRandom> zza = new zzgdr();

    public static byte[] zza(int i) {
        byte[] bArr = new byte[i];
        zza.get().nextBytes(bArr);
        return bArr;
    }
}
