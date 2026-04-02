package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class zzs extends zzl {
    public zzs(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzl, com.google.android.gms.internal.ads.zzbzq
    public final void zzh(Bundle bundle) {
        com.google.android.gms.ads.internal.util.zze.zza("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzn = 4;
        this.zzb.finish();
    }
}
