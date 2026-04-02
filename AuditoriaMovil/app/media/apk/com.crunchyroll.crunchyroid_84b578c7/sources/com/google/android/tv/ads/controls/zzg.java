package com.google.android.tv.ads.controls;

import android.animation.AnimatorSet;
import com.amazon.aps.iva.e.m;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
final class zzg extends m {
    final /* synthetic */ AnimatorSet zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(WhyThisAdFragment whyThisAdFragment, boolean z, AnimatorSet animatorSet) {
        super(true);
        this.zza = animatorSet;
    }

    @Override // com.amazon.aps.iva.e.m
    public final void handleOnBackPressed() {
        this.zza.start();
    }
}
