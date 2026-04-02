package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzgda implements zzftg {
    private final zzgdl zza;
    private final zzfty zzb;

    public zzgda(zzgdl zzgdlVar, zzfty zzftyVar, int i2) {
        this.zza = zzgdlVar;
        this.zzb = zzftyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza = this.zza.zza(bArr);
        return zzgco.zza(zza, this.zzb.zza(zzgco.zza(bArr2, zza, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
