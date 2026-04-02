package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class zzepq implements zzerx<Bundle> {
    public final Bundle zza;

    public zzepq(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle zza = zzfbd.zza(bundle2, "device");
        zza.putBundle("android_mem_info", this.zza);
        bundle2.putBundle("device", zza);
    }
}
