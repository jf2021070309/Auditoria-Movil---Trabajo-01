package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class zzepe implements zzerx<Bundle> {
    private final boolean zza;

    public zzepe(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        bundle.putBoolean("is_gbid", this.zza);
    }
}
