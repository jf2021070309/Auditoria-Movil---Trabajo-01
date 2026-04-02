package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbqt;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public final class H5AdsRequestHandler {
    private final zzbqt zza;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbqt(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zzb();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.zza.zza(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return zzbqt.zzc(str);
    }
}
