package com.google.android.gms.cast.framework.media.widget;

import com.google.android.gms.cast.Cast;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzl extends Cast.Listener {
    final /* synthetic */ ExpandedControllerActivity zza;

    public zzl(ExpandedControllerActivity expandedControllerActivity) {
        this.zza = expandedControllerActivity;
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onDeviceNameChanged() {
        this.zza.zzn();
    }
}
