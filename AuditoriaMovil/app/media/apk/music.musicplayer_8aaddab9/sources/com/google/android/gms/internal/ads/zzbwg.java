package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzbwg extends zzbvo {
    private final MediationInterscrollerAd zza;

    public zzbwg(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zza = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final IObjectWrapper zze() {
        return ObjectWrapper.wrap(this.zza.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final boolean zzf() {
        return this.zza.shouldDelegateInterscrollerEffect();
    }
}
