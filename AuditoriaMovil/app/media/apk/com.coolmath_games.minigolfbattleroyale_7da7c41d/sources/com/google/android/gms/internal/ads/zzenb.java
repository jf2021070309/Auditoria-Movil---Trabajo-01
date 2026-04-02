package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzenb implements zzerx<Bundle> {
    private final Bundle zza;

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.zza.isEmpty()) {
            return;
        }
        bundle2.putBundle("installed_adapter_data", this.zza);
    }
}
