package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeow implements zzerx<Bundle> {
    public final Bundle zza;

    public zzeow(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        bundle.putBundle("content_info", this.zza);
    }
}
