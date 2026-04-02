package com.google.android.tv.ads.controls;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
final class zzb extends AnimatorListenerAdapter {
    final /* synthetic */ ErrorMessageFragment zza;

    public zzb(ErrorMessageFragment errorMessageFragment) {
        this.zza = errorMessageFragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.zza.requireActivity().finish();
    }
}
