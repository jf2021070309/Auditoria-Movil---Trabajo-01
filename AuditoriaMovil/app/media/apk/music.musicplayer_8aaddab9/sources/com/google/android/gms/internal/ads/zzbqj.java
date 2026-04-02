package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;
/* loaded from: classes.dex */
public final class zzbqj extends zzbql {
    private final OnH5AdsEventListener zza;

    public zzbqj(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
