package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class zzenx implements zzerx<Bundle> {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final float zzg;
    public final boolean zzh;

    public zzenx(int i2, boolean z, boolean z2, int i3, int i4, int i5, float f2, boolean z3) {
        this.zza = i2;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = f2;
        this.zzh = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.zza);
        bundle2.putBoolean("ma", this.zzb);
        bundle2.putBoolean("sp", this.zzc);
        bundle2.putInt("muv", this.zzd);
        bundle2.putInt("rm", this.zze);
        bundle2.putInt("riv", this.zzf);
        bundle2.putFloat("android_app_volume", this.zzg);
        bundle2.putBoolean("android_app_muted", this.zzh);
    }
}
