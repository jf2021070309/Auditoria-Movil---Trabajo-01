package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzdd implements zzdk {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    public zzdd(zzdl zzdlVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.pal.zzdk
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.zza, this.zzb);
    }
}
