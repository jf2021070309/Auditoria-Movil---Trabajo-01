package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzkj extends zzag {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzkj(byte[] bArr) {
        super(false);
        if (bArr != null) {
            zzakt.zza(bArr.length > 0);
            this.zza = bArr;
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.zza, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzd(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws IOException {
        this.zzb = zzanVar.zza;
        zzb(zzanVar);
        long j = zzanVar.zzf;
        int length = this.zza.length;
        if (j <= length) {
            int i = (int) j;
            this.zzc = i;
            int i2 = length - i;
            this.zzd = i2;
            long j2 = zzanVar.zzg;
            if (j2 != -1) {
                this.zzd = (int) Math.min(i2, j2);
            }
            this.zze = true;
            zzc(zzanVar);
            long j3 = zzanVar.zzg;
            return j3 != -1 ? j3 : this.zzd;
        }
        throw new zzak(2008);
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() {
        if (this.zze) {
            this.zze = false;
            zze();
        }
        this.zzb = null;
    }
}
