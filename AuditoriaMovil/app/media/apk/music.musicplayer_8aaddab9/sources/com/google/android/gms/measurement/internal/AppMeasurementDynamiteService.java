package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c.f.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcb {
    @VisibleForTesting
    public zzfv zza = null;
    private final Map<Integer, zzgw> zzb = new a();

    @EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        zzb();
        this.zza.zzv().zzU(zzcfVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(String str, long j2) throws RemoteException {
        zzb();
        this.zza.zzd().zzd(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.zza.zzq().zzz(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j2) throws RemoteException {
        zzb();
        this.zza.zzq().zzV(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(String str, long j2) throws RemoteException {
        zzb();
        this.zza.zzd().zze(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        long zzq = this.zza.zzv().zzq();
        zzb();
        this.zza.zzv().zzT(zzcfVar, zzq);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzh(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzo());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzl(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzp());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzq());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        String str;
        zzb();
        zzia zzq = this.zza.zzq();
        if (zzq.zzs.zzw() != null) {
            str = zzq.zzs.zzw();
        } else {
            try {
                str = zzig.zzc(zzq.zzs.zzau(), "google_app_id", zzq.zzs.zzz());
            } catch (IllegalStateException e2) {
                zzq.zzs.zzay().zzd().zzb("getGoogleAppId failed with exception", e2);
                str = null;
            }
        }
        zzc(zzcfVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzq().zzh(str);
        zzb();
        this.zza.zzv().zzS(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i2) throws RemoteException {
        zzb();
        if (i2 == 0) {
            this.zza.zzv().zzU(zzcfVar, this.zza.zzq().zzr());
        } else if (i2 == 1) {
            this.zza.zzv().zzT(zzcfVar, this.zza.zzq().zzm().longValue());
        } else if (i2 != 2) {
            if (i2 == 3) {
                this.zza.zzv().zzS(zzcfVar, this.zza.zzq().zzl().intValue());
            } else if (i2 != 4) {
            } else {
                this.zza.zzv().zzO(zzcfVar, this.zza.zzq().zzi().booleanValue());
            }
        } else {
            zzkz zzv = this.zza.zzv();
            double doubleValue = this.zza.zzq().zzj().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcfVar.zzd(bundle);
            } catch (RemoteException e2) {
                zzv.zzs.zzay().zzk().zzb("Error returning double value to wrapper", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzj(this, zzcfVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcl zzclVar, long j2) throws RemoteException {
        zzfv zzfvVar = this.zza;
        if (zzfvVar == null) {
            this.zza = zzfv.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzclVar, Long.valueOf(j2));
        } else {
            e.a.d.a.a.H(zzfvVar, "Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzm(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws RemoteException {
        zzb();
        this.zza.zzq().zzE(str, str2, bundle, z, z2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j2) throws RemoteException {
        zzb();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzaz().zzp(new zzi(this, zzcfVar, new zzat(str2, new zzar(bundle), "app", j2), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i2, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        zzb();
        this.zza.zzay().zzt(i2, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j2) throws RemoteException {
        zzb();
        zzhz zzhzVar = this.zza.zzq().zza;
        if (zzhzVar != null) {
            this.zza.zzq().zzA();
            zzhzVar.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        zzhz zzhzVar = this.zza.zzq().zza;
        if (zzhzVar != null) {
            this.zza.zzq().zzA();
            zzhzVar.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        zzhz zzhzVar = this.zza.zzq().zza;
        if (zzhzVar != null) {
            this.zza.zzq().zzA();
            zzhzVar.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        zzhz zzhzVar = this.zza.zzq().zza;
        if (zzhzVar != null) {
            this.zza.zzq().zzA();
            zzhzVar.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j2) throws RemoteException {
        zzb();
        zzhz zzhzVar = this.zza.zzq().zza;
        Bundle bundle = new Bundle();
        if (zzhzVar != null) {
            this.zza.zzq().zzA();
            zzhzVar.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e2) {
            this.zza.zzay().zzk().zzb("Error returning bundle value to wrapper", e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzA();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzA();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j2) throws RemoteException {
        zzb();
        zzcfVar.zzd(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzgw zzgwVar;
        zzb();
        synchronized (this.zzb) {
            zzgwVar = this.zzb.get(Integer.valueOf(zzciVar.zzd()));
            if (zzgwVar == null) {
                zzgwVar = new zzo(this, zzciVar);
                this.zzb.put(Integer.valueOf(zzciVar.zzd()), zzgwVar);
            }
        }
        this.zza.zzq().zzJ(zzgwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j2) throws RemoteException {
        zzb();
        this.zza.zzq().zzK(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(Bundle bundle, long j2) throws RemoteException {
        zzb();
        if (bundle == null) {
            e.a.d.a.a.F(this.zza, "Conditional user property must not be null");
        } else {
            this.zza.zzq().zzQ(bundle, j2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(Bundle bundle, long j2) throws RemoteException {
        zzb();
        this.zza.zzq().zzT(bundle, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(Bundle bundle, long j2) throws RemoteException {
        zzb();
        this.zza.zzq().zzR(bundle, -20, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j2) throws RemoteException {
        zzb();
        this.zza.zzs().zzw((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        zzia zzq = this.zza.zzq();
        zzq.zza();
        zzq.zzs.zzaz().zzp(new zzhc(zzq, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final zzia zzq = this.zza.zzq();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzq.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzha
            @Override // java.lang.Runnable
            public final void run() {
                zzia.this.zzC(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzb();
        zzn zznVar = new zzn(this, zzciVar);
        if (this.zza.zzaz().zzs()) {
            this.zza.zzq().zzU(zznVar);
        } else {
            this.zza.zzaz().zzp(new zzk(this, zznVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzck zzckVar) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z, long j2) throws RemoteException {
        zzb();
        this.zza.zzq().zzV(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j2) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j2) throws RemoteException {
        zzb();
        zzia zzq = this.zza.zzq();
        zzq.zzs.zzaz().zzp(new zzhe(zzq, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(String str, long j2) throws RemoteException {
        zzb();
        if (str == null || str.length() != 0) {
            this.zza.zzq().zzY(null, "_id", str, true, j2);
        } else {
            e.a.d.a.a.H(this.zza, "User ID must be non-empty");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j2) throws RemoteException {
        zzb();
        this.zza.zzq().zzY(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzgw remove;
        zzb();
        synchronized (this.zzb) {
            remove = this.zzb.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (remove == null) {
            remove = new zzo(this, zzciVar);
        }
        this.zza.zzq().zzaa(remove);
    }
}
