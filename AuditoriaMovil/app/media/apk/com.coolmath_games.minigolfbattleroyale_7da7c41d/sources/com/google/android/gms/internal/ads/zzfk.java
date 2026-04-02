package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfk {
    private long zza;
    private long zzb;
    private boolean zzc;

    private final long zzd(long j) {
        return this.zza + Math.max(0L, ((this.zzb - 529) * 1000000) / j);
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
        if (byteBuffer != null) {
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                i = (i << 8) | (byteBuffer.get(i2) & UByte.MAX_VALUE);
            }
            int zzi = zzoo.zzi(i);
            if (zzi == -1) {
                this.zzc = true;
                this.zzb = 0L;
                this.zza = zzafVar.zzd;
                Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                return zzafVar.zzd;
            }
            long zzd = zzd(zzafvVar.zzz);
            this.zzb += zzi;
            return zzd;
        }
        throw null;
    }

    public final long zzc(zzafv zzafvVar) {
        return zzd(zzafvVar.zzz);
    }
}
