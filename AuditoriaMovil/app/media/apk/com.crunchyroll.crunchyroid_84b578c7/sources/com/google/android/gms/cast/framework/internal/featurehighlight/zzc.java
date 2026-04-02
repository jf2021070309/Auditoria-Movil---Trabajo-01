package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzc implements View.OnLayoutChangeListener {
    final /* synthetic */ zzh zza;

    public zzc(zzh zzhVar, Runnable runnable) {
        this.zza = zzhVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.zza.zzk();
        this.zza.removeOnLayoutChangeListener(this);
    }
}
