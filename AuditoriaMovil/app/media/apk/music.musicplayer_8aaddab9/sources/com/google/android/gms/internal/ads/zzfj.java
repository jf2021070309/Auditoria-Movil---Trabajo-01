package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class zzfj extends zzaf {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzfj() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzaf, com.google.android.gms.internal.ads.zzz
    public final void zza() {
        super.zza();
        this.zzg = 0;
    }

    public final void zzl(int i2) {
        this.zzh = i2;
    }

    public final long zzm() {
        return this.zzf;
    }

    public final int zzn() {
        return this.zzg;
    }

    public final boolean zzo() {
        return this.zzg > 0;
    }

    public final boolean zzp(zzaf zzafVar) {
        ByteBuffer byteBuffer;
        zzakt.zza(!zzafVar.zzh(1073741824));
        zzakt.zza(!zzafVar.zzh(268435456));
        zzakt.zza(!zzafVar.zzh(4));
        if (zzo()) {
            if (this.zzg >= this.zzh || zzafVar.zzh(Level.ALL_INT) != zzh(Level.ALL_INT)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzafVar.zzb;
            if (byteBuffer2 != null && (byteBuffer = this.zzb) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i2 = this.zzg;
        this.zzg = i2 + 1;
        if (i2 == 0) {
            this.zzd = zzafVar.zzd;
            if (zzafVar.zzh(1)) {
                zzf(1);
            }
        }
        if (zzafVar.zzh(Level.ALL_INT)) {
            zzf(Level.ALL_INT);
        }
        ByteBuffer byteBuffer3 = zzafVar.zzb;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzafVar.zzd;
        return true;
    }
}
