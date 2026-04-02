package com.google.ads.interactivemedia.pal;

import com.amazon.aps.iva.q.c0;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes2.dex */
public final class NonceLoaderException extends Exception {
    private final int zza;

    public NonceLoaderException(int i, Exception exc) {
        super(c0.a("NonceLoader exception, errorCode : ", i), exc);
        this.zza = i;
    }

    public static NonceLoaderException zzb(int i) {
        return new NonceLoaderException(i, new Exception());
    }

    public final int zza() {
        return this.zza;
    }
}
