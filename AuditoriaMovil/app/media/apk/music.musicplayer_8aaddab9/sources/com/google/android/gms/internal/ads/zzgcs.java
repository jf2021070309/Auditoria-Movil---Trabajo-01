package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes.dex */
public abstract class zzgcs implements zzftg {
    private final zzgcq zza;
    private final zzgcq zzb;

    public zzgcs(byte[] bArr) throws GeneralSecurityException {
        if (!zzfvw.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.zza = zzb(bArr, 1);
        this.zzb = zzb(bArr, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzftg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= (Integer.MAX_VALUE - this.zza.zzc()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(this.zza.zzc() + length + 16);
            if (allocate.remaining() >= this.zza.zzc() + length + 16) {
                int position = allocate.position();
                this.zza.zzd(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.zza.zzc()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                byte[] bArr4 = new byte[32];
                this.zzb.zze(bArr3, 0).get(bArr4);
                int remaining = allocate.remaining();
                int i2 = remaining % 16;
                int i3 = i2 == 0 ? remaining : (remaining + 16) - i2;
                ByteBuffer order = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(0);
                order.put(allocate);
                order.position(i3);
                order.putLong(0L);
                order.putLong(remaining);
                byte[] zza = zzgdm.zza(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(zza);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public abstract zzgcq zzb(byte[] bArr, int i2) throws InvalidKeyException;
}
