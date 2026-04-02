package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;
/* loaded from: classes.dex */
public final class zzgdc implements zzgdj<Cipher> {
    @Override // com.google.android.gms.internal.ads.zzgdj
    public final /* bridge */ /* synthetic */ Cipher zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
