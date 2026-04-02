package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.zzabh;
import com.google.android.gms.internal.pal.zzabi;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzabi<MessageType extends zzabi<MessageType, BuilderType>, BuilderType extends zzabh<MessageType, BuilderType>> implements zzaef {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.pal.zzaef
    public final zzaby zzaI() {
        try {
            int zzat = zzat();
            zzaby zzabyVar = zzaby.zzb;
            byte[] bArr = new byte[zzat];
            zzach zzC = zzach.zzC(bArr);
            zzaG(zzC);
            zzC.zzD();
            return new zzabv(bArr);
        } catch (IOException e) {
            throw new RuntimeException(e.e("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public int zzap() {
        throw null;
    }

    public void zzar(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final byte[] zzas() {
        try {
            byte[] bArr = new byte[zzat()];
            zzach zzC = zzach.zzC(bArr);
            zzaG(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e.e("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
