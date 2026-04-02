package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class zzenq implements zzerx<Bundle> {
    private final String zza;
    private final int zzb;

    public zzenq(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        Bundle zza = zzfbd.zza(bundle2, "pii");
        bundle2.putBundle("pii", zza);
        zza.putString("pvid", this.zza);
        zza.putInt("pvid_s", this.zzb);
    }
}
