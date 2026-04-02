package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzmt extends zzmu {
    public zzmt(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.pal.zzmu
    public final zzms zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzmr(bArr, i);
    }
}
