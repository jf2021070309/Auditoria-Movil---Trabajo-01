package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbgj extends zzbgh {
    private final MuteThisAdListener zza;

    public zzbgj(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zze() {
        this.zza.onAdMuted();
    }
}
