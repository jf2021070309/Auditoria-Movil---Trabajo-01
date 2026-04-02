package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzepa implements zzerx<Bundle> {
    public final String zza;
    public final boolean zzb;

    public zzepa(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.zza);
        if (this.zzb) {
            bundle2.putString("de", "1");
        }
    }
}
