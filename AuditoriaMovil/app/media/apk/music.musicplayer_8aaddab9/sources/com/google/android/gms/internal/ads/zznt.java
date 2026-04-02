package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zznt implements zzox {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzs(zzafv zzafvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final int zzt(zzah zzahVar, int i2, boolean z, int i3) throws IOException {
        int zzg = zzahVar.zzg(this.zza, 0, Math.min(4096, i2));
        if (zzg == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzu(zzamf zzamfVar, int i2, int i3) {
        zzamfVar.zzk(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzv(long j2, int i2, int i3, int i4, zzow zzowVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final int zzx(zzah zzahVar, int i2, boolean z) throws IOException {
        return zzov.zza(this, zzahVar, i2, true);
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzy(zzamf zzamfVar, int i2) {
        zzov.zzb(this, zzamfVar, i2);
    }
}
