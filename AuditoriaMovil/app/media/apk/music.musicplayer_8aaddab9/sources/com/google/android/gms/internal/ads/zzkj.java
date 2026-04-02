package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzkj extends zzag {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzkj(byte[] bArr) {
        super(false);
        Objects.requireNonNull(bArr);
        zzakt.zza(bArr.length > 0);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.zzd;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        System.arraycopy(this.zza, this.zzc, bArr, i2, min);
        this.zzc += min;
        this.zzd -= min;
        zzd(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws IOException {
        this.zzb = zzanVar.zza;
        zzb(zzanVar);
        long j2 = zzanVar.zzf;
        int length = this.zza.length;
        if (j2 <= length) {
            int i2 = (int) j2;
            this.zzc = i2;
            int i3 = length - i2;
            this.zzd = i3;
            long j3 = zzanVar.zzg;
            if (j3 != -1) {
                this.zzd = (int) Math.min(i3, j3);
            }
            this.zze = true;
            zzc(zzanVar);
            long j4 = zzanVar.zzg;
            return j4 != -1 ? j4 : this.zzd;
        }
        throw new zzak(AdError.REMOTE_ADS_SERVICE_ERROR);
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
