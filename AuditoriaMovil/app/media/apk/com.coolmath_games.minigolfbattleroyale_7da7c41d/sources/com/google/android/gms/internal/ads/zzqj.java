package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzqj {
    private final zzamf zza = new zzamf(8);
    private int zzb;

    private final long zzb(zznv zznvVar) throws IOException {
        zznp zznpVar = (zznp) zznvVar;
        int i = 0;
        zznpVar.zzh(this.zza.zzi(), 0, 1, false);
        int i2 = this.zza.zzi()[0] & UByte.MAX_VALUE;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (~i3);
            zznpVar.zzh(this.zza.zzi(), 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (this.zza.zzi()[i] & UByte.MAX_VALUE) + (i5 << 8);
            }
            this.zzb += i4 + 1;
            return i5;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zznv zznvVar) throws IOException {
        long zzb;
        int i;
        long zzo = zznvVar.zzo();
        int i2 = (zzo > (-1L) ? 1 : (zzo == (-1L) ? 0 : -1));
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (i2 != 0 && zzo <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = zzo;
        }
        int i3 = (int) j;
        zznp zznpVar = (zznp) zznvVar;
        zznpVar.zzh(this.zza.zzi(), 0, 4, false);
        long zzt = this.zza.zzt();
        this.zzb = 4;
        while (zzt != 440786851) {
            int i4 = this.zzb + 1;
            this.zzb = i4;
            if (i4 == i3) {
                return false;
            }
            zznpVar.zzh(this.zza.zzi(), 0, 1, false);
            zzt = ((zzt << 8) & (-256)) | (this.zza.zzi()[0] & UByte.MAX_VALUE);
        }
        long zzb2 = zzb(zznvVar);
        long j2 = this.zzb;
        if (zzb2 != Long.MIN_VALUE && (i2 == 0 || j2 + zzb2 < zzo)) {
            while (true) {
                int i5 = (this.zzb > (j2 + zzb2) ? 1 : (this.zzb == (j2 + zzb2) ? 0 : -1));
                if (i5 < 0) {
                    if (zzb(zznvVar) == Long.MIN_VALUE || (zzb = zzb(zznvVar)) < 0) {
                        return false;
                    }
                    if (i != 0) {
                        int i6 = (int) zzb;
                        zznpVar.zzj(i6, false);
                        this.zzb += i6;
                    }
                } else if (i5 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
