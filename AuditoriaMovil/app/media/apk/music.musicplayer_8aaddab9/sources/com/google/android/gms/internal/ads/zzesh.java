package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class zzesh implements zzerx<Bundle> {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzesh(String str, int i2, int i3, int i4, boolean z, int i5) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = z;
        this.zzf = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.zza;
        zzfbd.zzb(bundle2, "carrier", str, !TextUtils.isEmpty(str));
        zzfbd.zzc(bundle2, "cnt", Integer.valueOf(this.zzb), this.zzb != -2);
        bundle2.putInt("gnt", this.zzc);
        bundle2.putInt("pt", this.zzd);
        Bundle zza = zzfbd.zza(bundle2, "device");
        bundle2.putBundle("device", zza);
        Bundle zza2 = zzfbd.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzf);
        zza2.putBoolean("active_network_metered", this.zze);
    }
}
