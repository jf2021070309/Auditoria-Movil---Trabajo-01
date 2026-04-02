package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class zzgkj extends zzgkh implements zzxp {
    private int zza;

    public zzgkj(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzxo.zzc(byteBuffer.get());
        zzxo.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
