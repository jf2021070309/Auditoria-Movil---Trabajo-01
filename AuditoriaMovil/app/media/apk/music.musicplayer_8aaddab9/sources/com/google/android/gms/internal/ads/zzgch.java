package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* loaded from: classes.dex */
public final class zzgch extends ThreadLocal<Cipher> {
    public static final Cipher zza() {
        try {
            return zzgdb.zza.zzb("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
