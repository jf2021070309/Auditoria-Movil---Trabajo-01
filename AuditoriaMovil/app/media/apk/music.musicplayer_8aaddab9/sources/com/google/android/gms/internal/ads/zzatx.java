package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzatx implements zzatz {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;

    public zzatx(byte[] bArr) {
        Objects.requireNonNull(bArr);
        zzaup.zza(bArr.length > 0);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final long zza(zzaub zzaubVar) throws IOException {
        this.zzb = zzaubVar.zza;
        long j2 = zzaubVar.zzc;
        int i2 = (int) j2;
        this.zzc = i2;
        long j3 = zzaubVar.zzd;
        int length = (int) (j3 == -1 ? this.zza.length - j2 : j3);
        this.zzd = length;
        if (length <= 0 || i2 + length > this.zza.length) {
            int length2 = this.zza.length;
            StringBuilder sb = new StringBuilder(77);
            sb.append("Unsatisfiable range: [");
            sb.append(i2);
            sb.append(", ");
            sb.append(j3);
            sb.append("], length: ");
            sb.append(length2);
            throw new IOException(sb.toString());
        }
        return length;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final int zzb(byte[] bArr, int i2, int i3) throws IOException {
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
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final void zzd() throws IOException {
        this.zzb = null;
    }
}
