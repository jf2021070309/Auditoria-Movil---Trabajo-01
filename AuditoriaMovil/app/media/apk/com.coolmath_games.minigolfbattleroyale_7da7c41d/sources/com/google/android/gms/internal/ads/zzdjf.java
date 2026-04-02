package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdjf extends zzdgm<VideoController.VideoLifecycleCallbacks> {
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: protected */
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
