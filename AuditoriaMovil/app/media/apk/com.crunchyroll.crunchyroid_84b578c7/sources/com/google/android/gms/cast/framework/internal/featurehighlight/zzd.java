package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzd extends AnimatorListenerAdapter {
    final /* synthetic */ zzh zza;

    public zzd(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zzh zzhVar = this.zza;
        Animator zza = zzh.zza(zzhVar);
        zzhVar.zza = zza;
        zza.start();
    }
}
