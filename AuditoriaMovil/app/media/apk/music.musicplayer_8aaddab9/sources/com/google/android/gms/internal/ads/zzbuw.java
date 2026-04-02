package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzbuw extends zzcoc {
    private final AppMeasurementSdk zza;

    public zzbuw(AppMeasurementSdk appMeasurementSdk) {
        this.zza = appMeasurementSdk;
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final void zzb(Bundle bundle) throws RemoteException {
        this.zza.performAction(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final Bundle zzc(Bundle bundle) throws RemoteException {
        return this.zza.performActionWithResponse(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final void zzd(String str, String str2, Bundle bundle) throws RemoteException {
        this.zza.logEvent(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final void zze(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.setUserProperty(str, str2, iObjectWrapper != null ? ObjectWrapper.unwrap(iObjectWrapper) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final Map zzf(String str, String str2, boolean z) throws RemoteException {
        return this.zza.getUserProperties(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final int zzg(String str) throws RemoteException {
        return this.zza.getMaxUserProperties(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final void zzh(Bundle bundle) throws RemoteException {
        this.zza.setConditionalUserProperty(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final void zzi(String str, String str2, Bundle bundle) throws RemoteException {
        this.zza.clearConditionalUserProperty(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final List zzj(String str, String str2) throws RemoteException {
        return this.zza.getConditionalUserProperties(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final String zzk() throws RemoteException {
        return this.zza.getAppInstanceId();
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final String zzl() throws RemoteException {
        return this.zza.getGmpAppId();
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final long zzm() throws RemoteException {
        return this.zza.generateEventId();
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final void zzn(String str) throws RemoteException {
        this.zza.beginAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final void zzo(String str) throws RemoteException {
        this.zza.endAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final void zzp(Bundle bundle) throws RemoteException {
        this.zza.setConsent(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final void zzq(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.zza.setCurrentScreen(iObjectWrapper != null ? (Activity) ObjectWrapper.unwrap(iObjectWrapper) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final String zzr() throws RemoteException {
        return this.zza.getCurrentScreenName();
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final String zzs() throws RemoteException {
        return this.zza.getCurrentScreenClass();
    }

    @Override // com.google.android.gms.internal.ads.zzcod
    public final String zzt() throws RemoteException {
        return this.zza.getAppIdOrigin();
    }
}
