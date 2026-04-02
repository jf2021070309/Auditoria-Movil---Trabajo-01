package com.google.android.gms.internal.cast;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.amazon.aps.iva.x.h;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public class zzee extends AnimatorListenerAdapter {
    private final h zza = new h();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.zza.put(animator, Boolean.TRUE);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.zza.put(animator, Boolean.FALSE);
    }

    public final boolean zza(Animator animator) {
        if (this.zza.containsKey(animator) && ((Boolean) this.zza.getOrDefault(animator, null)).booleanValue()) {
            return true;
        }
        return false;
    }
}
