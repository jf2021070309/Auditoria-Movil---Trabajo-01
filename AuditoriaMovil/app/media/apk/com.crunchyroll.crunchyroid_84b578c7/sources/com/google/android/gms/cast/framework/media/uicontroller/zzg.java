package com.google.android.gms.cast.framework.media.uicontroller;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzg implements View.OnClickListener {
    final /* synthetic */ long zza;
    final /* synthetic */ UIMediaController zzb;

    public zzg(UIMediaController uIMediaController, long j) {
        this.zzb = uIMediaController;
        this.zza = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzb.onRewindClicked(view, this.zza);
    }
}
