package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzkg implements zzkh {
    final /* synthetic */ Activity zza;

    public zzkg(zzki zzkiVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkh
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.zza);
    }
}
