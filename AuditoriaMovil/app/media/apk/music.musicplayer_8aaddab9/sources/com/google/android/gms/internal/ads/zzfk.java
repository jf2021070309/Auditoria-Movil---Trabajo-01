package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzfk {
    private long zza;
    private long zzb;
    private boolean zzc;

    private final long zzd(long j2) {
        return Math.max(0L, ((this.zzb - 529) * 1000000) / j2) + this.zza;
    }

    public final void zza() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzc = false;
    }

    public final long zzb(zzafv zzafvVar, zzaf zzafVar) {
        if (this.zzb == 0) {
            this.zza = zzafVar.zzd;
        }
        if (this.zzc) {
            return zzafVar.zzd;
        }
        ByteBuffer byteBuffer = zzafVar.zzb;
        Objects.requireNonNull(byteBuffer);
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) | (byteBuffer.get(i3) & 255);
        }
        int zzi = zzoo.zzi(i2);
        if (zzi != -1) {
            long zzd = zzd(zzafvVar.zzz);
            this.zzb += zzi;
            return zzd;
        }
        this.zzc = true;
        this.zzb = 0L;
        this.zza = zzafVar.zzd;
        Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return zzafVar.zzd;
    }

    public final long zzc(zzafv zzafvVar) {
        return zzd(zzafvVar.zzz);
    }
}
