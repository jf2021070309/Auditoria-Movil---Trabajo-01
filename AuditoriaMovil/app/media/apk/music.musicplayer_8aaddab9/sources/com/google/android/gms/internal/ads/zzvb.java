package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class zzvb implements zzvc {
    private final ByteBuffer zza;

    public zzvb(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzb(MessageDigest[] messageDigestArr, long j2, int i2) throws IOException {
        ByteBuffer slice;
        synchronized (this.zza) {
            int i3 = (int) j2;
            this.zza.position(i3);
            this.zza.limit(i3 + i2);
            slice = this.zza.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
