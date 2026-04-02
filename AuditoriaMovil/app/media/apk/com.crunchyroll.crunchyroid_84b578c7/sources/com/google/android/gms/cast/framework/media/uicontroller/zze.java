package com.google.android.gms.cast.framework.media.uicontroller;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zze implements View.OnClickListener {
    final /* synthetic */ UIMediaController zza;

    public zze(UIMediaController uIMediaController) {
        this.zza = uIMediaController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.onSkipPrevClicked(view);
    }
}
