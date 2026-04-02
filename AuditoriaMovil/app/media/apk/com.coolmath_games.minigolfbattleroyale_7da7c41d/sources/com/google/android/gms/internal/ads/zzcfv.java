package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcfv implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzchl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfv(zzcfw zzcfwVar, Context context, zzchl zzchlVar) {
        this.zza = context;
        this.zzb = zzchlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzb.zzd(e);
            zzcgt.zzg("Exception while getting advertising Id info", e);
        }
    }
}
