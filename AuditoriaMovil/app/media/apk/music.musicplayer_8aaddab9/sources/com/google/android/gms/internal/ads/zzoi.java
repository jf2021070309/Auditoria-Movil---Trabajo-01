package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public class zzoi implements zznv {
    private final zznv zza;

    public zzoi(zznv zznvVar) {
        this.zza = zznvVar;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final boolean zza(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        return this.zza.zza(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zzb(byte[] bArr, int i2, int i3) throws IOException {
        ((zznp) this.zza).zza(bArr, i2, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final int zzc(int i2) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zze(int i2) throws IOException {
        ((zznp) this.zza).zzd(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final int zzf(byte[] bArr, int i2, int i3) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i2, int i3) throws IOException {
        return this.zza.zzg(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final boolean zzh(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        return this.zza.zzh(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zzi(byte[] bArr, int i2, int i3) throws IOException {
        ((zznp) this.zza).zzh(bArr, i2, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zzk(int i2) throws IOException {
        ((zznp) this.zza).zzj(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zzl() {
        this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public long zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public long zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public long zzo() {
        return this.zza.zzo();
    }
}
