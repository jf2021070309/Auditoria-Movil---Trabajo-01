package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzf extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzh zzb;

    public zzf(zzh zzhVar, Runnable runnable) {
        this.zzb = zzhVar;
        this.zza = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.zzb.setVisibility(8);
        this.zzb.zza = null;
        this.zza.run();
    }
}
