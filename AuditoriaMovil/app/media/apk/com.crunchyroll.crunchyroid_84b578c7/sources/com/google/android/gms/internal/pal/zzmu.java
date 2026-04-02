package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
abstract class zzmu {
    private final zzms zza;
    private final zzms zzb;

    public zzmu(byte[] bArr) throws GeneralSecurityException {
        if (zzna.zza(1)) {
            this.zza = zza(bArr, 1);
            this.zzb = zza(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public abstract zzms zza(byte[] bArr, int i) throws InvalidKeyException;

    public final void zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i;
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            this.zza.zzd(byteBuffer, bArr, bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] bArr4 = new byte[32];
            this.zzb.zzc(bArr, 0).get(bArr4);
            int remaining = byteBuffer.remaining();
            int i2 = remaining % 16;
            if (i2 == 0) {
                i = remaining;
            } else {
                i = (remaining + 16) - i2;
            }
            ByteBuffer order = ByteBuffer.allocate(i + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr3);
            order.position(0);
            order.put(byteBuffer);
            order.position(i);
            order.putLong(0L);
            order.putLong(remaining);
            byte[] zza = zzmx.zza(bArr4, order.array());
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(zza);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length <= 2147483631) {
            ByteBuffer allocate = ByteBuffer.allocate(length + 16);
            zzb(allocate, bArr, bArr2, bArr3);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
