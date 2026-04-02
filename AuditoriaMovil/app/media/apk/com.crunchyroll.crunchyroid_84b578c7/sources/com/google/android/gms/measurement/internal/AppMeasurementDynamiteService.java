package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.x.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.3.0 */
@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcb {
    zzgd zza = null;
    private final Map zzb = new a();

    private final void zzb() {
        if (this.zza != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        zzb();
        this.zza.zzv().zzW(zzcfVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.zza.zzd().zzd(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.zza.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzU(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.zza.zzd().zze(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        long zzq = this.zza.zzv().zzq();
        zzb();
        this.zza.zzv().zzV(zzcfVar, zzq);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaB().zzp(new zzi(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzo());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaB().zzp(new zzm(this, zzcfVar, str, str2));
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
        zzik zzq = this.zza.zzq();
        if (zzq.zzt.zzw() != null) {
            str = zzq.zzt.zzw();
        } else {
            try {
                str = zziq.zzc(zzq.zzt.zzaw(), "google_app_id", zzq.zzt.zzz());
            } catch (IllegalStateException e) {
                zzq.zzt.zzaA().zzd().zzb("getGoogleAppId failed with exception", e);
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
        this.zza.zzv().zzU(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getSessionId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzik zzq = this.zza.zzq();
        zzq.zzt.zzaB().zzp(new zzhy(zzq, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i) throws RemoteException {
        zzb();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        this.zza.zzv().zzQ(zzcfVar, this.zza.zzq().zzi().booleanValue());
                        return;
                    }
                    this.zza.zzv().zzU(zzcfVar, this.zza.zzq().zzl().intValue());
                    return;
                }
                zzlp zzv = this.zza.zzv();
                double doubleValue = this.zza.zzq().zzj().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    zzcfVar.zze(bundle);
                    return;
                } catch (RemoteException e) {
                    zzv.zzt.zzaA().zzk().zzb("Error returning double value to wrapper", e);
                    return;
                }
            }
            this.zza.zzv().zzV(zzcfVar, this.zza.zzq().zzm().longValue());
            return;
        }
        this.zza.zzv().zzW(zzcfVar, this.zza.zzq().zzr());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaB().zzp(new zzk(this, zzcfVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcl zzclVar, long j) throws RemoteException {
        zzgd zzgdVar = this.zza;
        if (zzgdVar == null) {
            this.zza = zzgd.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzclVar, Long.valueOf(j));
        } else {
            e.e(zzgdVar, "Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaB().zzp(new zzn(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzE(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        Bundle bundle2;
        zzb();
        Preconditions.checkNotEmpty(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.zza.zzaB().zzp(new zzj(this, zzcfVar, new zzau(str2, new zzas(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Object unwrap;
        Object unwrap2;
        zzb();
        Object obj = null;
        if (iObjectWrapper == null) {
            unwrap = null;
        } else {
            unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            unwrap2 = null;
        } else {
            unwrap2 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj = ObjectWrapper.unwrap(iObjectWrapper3);
        }
        this.zza.zzaA().zzu(i, true, false, str, unwrap, unwrap2, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        zzb();
        zzij zzijVar = this.zza.zzq().zza;
        if (zzijVar != null) {
            this.zza.zzq().zzB();
            zzijVar.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzij zzijVar = this.zza.zzq().zza;
        if (zzijVar != null) {
            this.zza.zzq().zzB();
            zzijVar.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzij zzijVar = this.zza.zzq().zza;
        if (zzijVar != null) {
            this.zza.zzq().zzB();
            zzijVar.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzij zzijVar = this.zza.zzq().zza;
        if (zzijVar != null) {
            this.zza.zzq().zzB();
            zzijVar.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        zzb();
        zzij zzijVar = this.zza.zzq().zza;
        Bundle bundle = new Bundle();
        if (zzijVar != null) {
            this.zza.zzq().zzB();
            zzijVar.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zza.zzaA().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzB();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzB();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        zzb();
        zzcfVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzhg zzhgVar;
        zzb();
        synchronized (this.zzb) {
            zzhgVar = (zzhg) this.zzb.get(Integer.valueOf(zzciVar.zzd()));
            if (zzhgVar == null) {
                zzhgVar = new zzp(this, zzciVar);
                this.zzb.put(Integer.valueOf(zzciVar.zzd()), zzhgVar);
            }
        }
        this.zza.zzq().zzJ(zzhgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzK(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            com.amazon.aps.iva.m80.a.a(this.zza, "Conditional user property must not be null");
        } else {
            this.zza.zzq().zzQ(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(final Bundle bundle, final long j) throws RemoteException {
        zzb();
        final zzik zzq = this.zza.zzq();
        zzq.zzt.zzaB().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhj
            @Override // java.lang.Runnable
            public final void run() {
                zzik zzikVar = zzik.this;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(zzikVar.zzt.zzh().zzm())) {
                    zzikVar.zzS(bundle2, 0, j2);
                } else {
                    zzikVar.zzt.zzaA().zzl().zza("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzS(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        zzb();
        this.zza.zzs().zzw((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        zzik zzq = this.zza.zzq();
        zzq.zza();
        zzq.zzt.zzaB().zzp(new zzih(zzq, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(Bundle bundle) {
        final Bundle bundle2;
        zzb();
        final zzik zzq = this.zza.zzq();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        zzq.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhk
            @Override // java.lang.Runnable
            public final void run() {
                zzik.this.zzC(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzb();
        zzo zzoVar = new zzo(this, zzciVar);
        if (this.zza.zzaB().zzs()) {
            this.zza.zzq().zzT(zzoVar);
        } else {
            this.zza.zzaB().zzp(new zzl(this, zzoVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzck zzckVar) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzU(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        zzik zzq = this.zza.zzq();
        zzq.zzt.zzaB().zzp(new zzho(zzq, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(final String str, long j) throws RemoteException {
        zzb();
        final zzik zzq = this.zza.zzq();
        if (str != null && TextUtils.isEmpty(str)) {
            e.e(zzq.zzt, "User ID must be non-empty or null");
            return;
        }
        zzq.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhl
            @Override // java.lang.Runnable
            public final void run() {
                zzik zzikVar = zzik.this;
                if (zzikVar.zzt.zzh().zzp(str)) {
                    zzikVar.zzt.zzh().zzo();
                }
            }
        });
        zzq.zzX(null, "_id", str, true, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzX(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzhg zzhgVar;
        zzb();
        synchronized (this.zzb) {
            zzhgVar = (zzhg) this.zzb.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (zzhgVar == null) {
            zzhgVar = new zzp(this, zzciVar);
        }
        this.zza.zzq().zzZ(zzhgVar);
    }
}
