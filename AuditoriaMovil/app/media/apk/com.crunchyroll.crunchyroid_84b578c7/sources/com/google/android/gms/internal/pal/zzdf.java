package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.app.Application;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzdf implements zzdk {
    final /* synthetic */ Activity zza;

    public zzdf(zzdl zzdlVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.pal.zzdk
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.zza);
    }
}
