package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class zzeob implements zzerx<Bundle> {
    public final double zza;
    public final boolean zzb;

    public zzeob(double d2, boolean z) {
        this.zza = d2;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle zza = zzfbd.zza(bundle2, "device");
        bundle2.putBundle("device", zza);
        Bundle zza2 = zzfbd.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
