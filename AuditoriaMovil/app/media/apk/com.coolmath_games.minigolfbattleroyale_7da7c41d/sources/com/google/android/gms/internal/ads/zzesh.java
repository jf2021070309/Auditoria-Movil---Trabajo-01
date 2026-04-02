package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzesh implements zzerx<Bundle> {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzesh(String str, int i, int i2, int i3, boolean z, int i4) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
        this.zzf = i4;
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
