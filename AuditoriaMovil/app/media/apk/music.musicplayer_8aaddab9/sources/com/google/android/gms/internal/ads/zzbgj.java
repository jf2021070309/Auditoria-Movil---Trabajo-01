package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;
/* loaded from: classes.dex */
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
