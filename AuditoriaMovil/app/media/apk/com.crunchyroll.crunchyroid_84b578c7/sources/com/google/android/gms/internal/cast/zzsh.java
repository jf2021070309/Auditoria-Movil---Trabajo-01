package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzsg;
import com.google.android.gms.internal.cast.zzsh;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public abstract class zzsh<MessageType extends zzsh<MessageType, BuilderType>, BuilderType extends zzsg<MessageType, BuilderType>> implements zzux {
    protected int zza = 0;

    public int zzq(zzvi zzviVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzux
    public final zzsu zzr() {
        try {
            int zzu = zzu();
            zzsu zzsuVar = zzsu.zzb;
            byte[] bArr = new byte[zzu];
            zztc zzz = zztc.zzz(bArr, 0, zzu);
            zzJ(zzz);
            zzz.zzA();
            return new zzsr(bArr);
        } catch (IOException e) {
            throw new RuntimeException(e.e("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }
}
