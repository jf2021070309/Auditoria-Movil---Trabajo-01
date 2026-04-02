package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgkj extends zzgkh implements zzxp {
    private int zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgkj(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzxo.zzc(byteBuffer.get());
        zzxo.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
