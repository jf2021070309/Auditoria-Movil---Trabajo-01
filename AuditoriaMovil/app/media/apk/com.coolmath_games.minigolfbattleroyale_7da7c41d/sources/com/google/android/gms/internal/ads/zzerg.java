package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzerg implements zzerx<Bundle> {
    private final String zza;

    public zzerg(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(this.zza)) {
            return;
        }
        bundle2.putString("query_info", this.zza);
    }
}
