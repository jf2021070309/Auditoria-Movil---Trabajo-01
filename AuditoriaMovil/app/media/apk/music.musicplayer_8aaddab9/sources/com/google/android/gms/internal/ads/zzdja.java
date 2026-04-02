package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
/* loaded from: classes.dex */
public final /* synthetic */ class zzdja implements zzdgl {
    public static final zzdgl zza = new zzdja();

    private zzdja() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgl
    public final void zza(Object obj) {
        ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
    }
}
