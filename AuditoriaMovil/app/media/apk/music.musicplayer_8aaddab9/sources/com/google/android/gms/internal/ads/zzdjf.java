package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzdjf extends zzdgm<VideoController.VideoLifecycleCallbacks> {
    @GuardedBy("this")
    private boolean zzb;

    public zzdjf(Set<zzdih<VideoController.VideoLifecycleCallbacks>> set) {
        super(set);
    }

    public final void zza() {
        zzk(zzdja.zza);
    }

    public final void zzb() {
        zzk(zzdjb.zza);
    }

    public final synchronized void zzc() {
        zzk(zzdjc.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        if (!this.zzb) {
            zzk(zzdjd.zza);
            this.zzb = true;
        }
        zzk(zzdje.zza);
    }
}
