package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzbmb implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    private final zzbnb zza;

    public zzbmb(zzbnb zzbnbVar) {
        this.zza = zzbnbVar;
        try {
            zzbnbVar.zzr();
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzq(ObjectWrapper.wrap(view));
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
            return false;
        }
    }
}
