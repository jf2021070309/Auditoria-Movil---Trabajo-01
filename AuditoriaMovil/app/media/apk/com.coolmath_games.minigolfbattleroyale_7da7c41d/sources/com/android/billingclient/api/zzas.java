package com.android.billingclient.api;

import android.text.TextUtils;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zzas {
    private String zza;

    private zzas() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzas(zzar zzarVar) {
    }

    public final zzas zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzat zzb() {
        if (TextUtils.isEmpty(this.zza)) {
            throw new IllegalArgumentException("SKU must be set.");
        }
        return new zzat(this.zza, null, null);
    }
}
