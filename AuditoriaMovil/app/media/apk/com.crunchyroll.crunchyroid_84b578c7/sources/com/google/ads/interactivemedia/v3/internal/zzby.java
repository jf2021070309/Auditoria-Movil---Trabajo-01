package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzby implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzby zza = new zzby();
    private boolean zzb;
    private boolean zzc;
    private zzcd zzd;

    private zzby() {
    }

    public static zzby zza() {
        return zza;
    }

    private final void zze() {
        String str;
        boolean z = this.zzc;
        for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zzbx.zza().zzc()) {
            zzcj zzh = zzeVar.zzh();
            if (zzh.zzk()) {
                if (true != z) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                zzcc.zza().zzb(zzh.zza(), "setState", str);
            }
        }
    }

    private final void zzf(boolean z) {
        if (this.zzc != z) {
            this.zzc = z;
            if (this.zzb) {
                zze();
                if (this.zzd != null) {
                    if (!z) {
                        zzcz.zzd().zzi();
                    } else {
                        zzcz.zzd().zzh();
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzf(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View zzg;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z = true;
        boolean z2 = true;
        for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zzbx.zza().zzb()) {
            if (zzeVar.zzk() && (zzg = zzeVar.zzg()) != null && zzg.hasWindowFocus()) {
                z2 = false;
            }
        }
        zzf((i == 100 || !z2) ? false : false);
    }

    public final void zzb() {
        this.zzb = true;
        this.zzc = false;
        zze();
    }

    public final void zzc() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = null;
    }

    public final void zzd(zzcd zzcdVar) {
        this.zzd = zzcdVar;
    }
}
