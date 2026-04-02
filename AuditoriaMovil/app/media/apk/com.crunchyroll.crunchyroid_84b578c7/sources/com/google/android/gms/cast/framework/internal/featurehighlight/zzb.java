package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzb extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ View zza;
    final /* synthetic */ zzg zzb;

    public zzb(zzh zzhVar, View view, boolean z, zzg zzgVar) {
        this.zza = view;
        this.zzb = zzgVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.zza.getParent() != null) {
            this.zza.performClick();
        }
        this.zzb.zzb();
        return true;
    }
}
