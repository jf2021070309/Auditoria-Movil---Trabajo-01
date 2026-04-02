package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* loaded from: classes.dex */
public final class zzbyd implements Runnable {
    public final /* synthetic */ AdOverlayInfoParcel zza;
    public final /* synthetic */ zzbye zzb;

    public zzbyd(zzbye zzbyeVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzb = zzbyeVar;
        this.zza = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzt.zzb();
        activity = this.zzb.zza;
        com.google.android.gms.ads.internal.overlay.zzm.zza(activity, this.zza, true);
    }
}
