package com.google.android.gms.internal.pal;

import android.util.Base64;
import com.google.ads.interactivemedia.pal.NonceLoaderException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import org.apache.commons.codec.binary.Hex;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzbb implements zzba {
    private final zzjy zza;

    public zzbb(zzjy zzjyVar) {
        this.zza = zzjyVar;
    }

    @Override // com.google.android.gms.internal.pal.zzba
    public final String zza(String str) throws NonceLoaderException {
        try {
            return Base64.encodeToString(this.zza.zza(str.getBytes(Hex.DEFAULT_CHARSET_NAME), new byte[0]), 10);
        } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e) {
            throw new NonceLoaderException(204, e);
        }
    }
}
