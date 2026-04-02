package com.google.android.gms.cast.tv.internal;

import android.app.Service;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Keep;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.CastLaunchRequest;
import com.google.android.gms.cast.tv.CastReceiverContext;
import com.google.android.gms.cast.tv.CastReceiverOptions;
import com.google.android.gms.cast.tv.SenderDisconnectedEventInfo;
import com.google.android.gms.cast.tv.SenderInfo;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.cast_tv.zzcl;
import com.google.android.gms.internal.cast_tv.zzco;
import com.google.android.gms.internal.cast_tv.zzdn;
import com.google.android.gms.internal.cast_tv.zzeb;
import com.google.android.gms.internal.cast_tv.zzeh;
import com.google.android.gms.internal.cast_tv.zzej;
import com.google.android.gms.internal.cast_tv.zzeq;
import com.google.android.gms.internal.cast_tv.zzes;
import com.google.android.gms.internal.cast_tv.zzfc;
import com.google.android.gms.internal.cast_tv.zzfe;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@Keep
/* loaded from: classes2.dex */
public final class CastTvHostService extends Service {
    private static final Logger log = new Logger("CastTvHostService");
    zzah systemAppChecker;
    private final zzag serviceStub = new zzag(this, null);
    private final zza castTvClientProxy = new zzs(this, null);
    final Map<Integer, zzt> uidToClientMap = new ConcurrentHashMap();

    /* renamed from: -$$Nest$sfgetlog */
    public static /* bridge */ /* synthetic */ Logger m49$$Nest$sfgetlog() {
        return log;
    }

    public void addClientEntry(final zzej zzejVar, final int i) {
        tearDownClient(i);
        if (zzejVar == null || !getOrInitSystemAppChecker().zza(i)) {
            return;
        }
        IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.google.android.gms.cast.tv.internal.zzg
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                CastTvHostService.this.m51x6f88ff4a(zzejVar, i);
            }
        };
        try {
            zzejVar.asBinder().linkToDeath(deathRecipient, 0);
            this.uidToClientMap.put(Integer.valueOf(i), new zzt(zzejVar, zzcl.zzb(), deathRecipient));
            getReceiverContext().zzj(this.castTvClientProxy);
        } catch (RemoteException unused) {
        }
    }

    public boolean checkIsSystemApp(int i) {
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(this).getApplicationInfo("com.google.android.apps.mediashell", 0);
            if (applicationInfo == null) {
                log.w("Application info not found for MediaShell", new Object[0]);
                return false;
            } else if ((applicationInfo.flags & 1) == 0) {
                log.w("MediaShell is not authorized to bind", new Object[0]);
                return false;
            } else if (applicationInfo.uid == i) {
                return true;
            } else {
                log.w("The calling package is not MediaShell", new Object[0]);
                return false;
            }
        } catch (PackageManager.NameNotFoundException e) {
            log.w("Application info not found for MediaShell".concat(String.valueOf(e.getMessage())), new Object[0]);
            return false;
        }
    }

    public void checkLaunchSupported(zzes zzesVar, final zzeh zzehVar) {
        if (zzesVar == null) {
            log.e("Rejecting launch request because the launch request is unrecognized", new Object[0]);
            notifyBooleanCallback(zzehVar, false);
            return;
        }
        getReceiverOptions().getLaunchRequestChecker().checkLaunchRequestSupported(parseCastLaunchRequest(zzesVar)).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.cast.tv.internal.zzj
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                CastTvHostService.this.m52xba11f0d8(zzehVar, (Boolean) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.cast.tv.internal.zzk
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CastTvHostService.this.m53xcac7bd99(zzehVar, exc);
            }
        });
    }

    public void dispatchClientOperation(zzu zzuVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, zzt> entry : this.uidToClientMap.entrySet()) {
            try {
                zzuVar.zza(entry.getValue());
            } catch (BadParcelableException e) {
                log.e("BadParcelableException happened when dispatching client operation, tearing down client", e);
                arrayList.add(entry.getKey());
            } catch (RemoteException e2) {
                log.e("RemoteException happened when dispatching client operation, tearing down client", e2);
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tearDownClient(((Integer) arrayList.get(i)).intValue());
        }
    }

    public static ApiException generateApiExceptionForErrorReason(zzco zzcoVar) {
        zzco zzcoVar2 = zzco.UNKNOWN;
        zzdn zzdnVar = zzdn.UNKNOWN;
        int ordinal = zzcoVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                log.e("Unknown error reason: %s", zzcoVar.name());
                                return new ApiException(zzai.zzg);
                            }
                            return new ApiException(zzai.zzf);
                        }
                        return new ApiException(zzai.zze);
                    }
                    return new ApiException(zzai.zzd);
                }
                return new ApiException(zzai.zzc);
            }
            return new ApiException(zzai.zzb);
        }
        return new ApiException(zzai.zzg);
    }

    private zzah getOrInitSystemAppChecker() {
        if (this.systemAppChecker == null) {
            this.systemAppChecker = new zzah() { // from class: com.google.android.gms.cast.tv.internal.zzh
                @Override // com.google.android.gms.cast.tv.internal.zzah
                public final boolean zza(int i) {
                    boolean checkIsSystemApp;
                    checkIsSystemApp = CastTvHostService.this.checkIsSystemApp(i);
                    return checkIsSystemApp;
                }
            };
        }
        return this.systemAppChecker;
    }

    private CastReceiverContext getReceiverContext() {
        CastReceiverContext.initInstance(this);
        return CastReceiverContext.getInstance();
    }

    private CastReceiverOptions getReceiverOptions() {
        return getReceiverContext().getReceiverOptions();
    }

    public void notifyBooleanCallback(zzeh zzehVar, boolean z) {
        try {
            zzehVar.zze(z);
        } catch (RemoteException unused) {
            log.e("Failed to notify boolean callback", new Object[0]);
        }
    }

    /* renamed from: onBinderDied */
    public void m51x6f88ff4a(zzej zzejVar, int i) {
        zzt zztVar = this.uidToClientMap.get(Integer.valueOf(i));
        if (zztVar != null && zztVar.zza == zzejVar) {
            tearDownClient(i);
        }
    }

    public void onMessage(String str, String str2, String str3, zzeq zzeqVar, int i) {
        Map<Integer, zzt> map = this.uidToClientMap;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            log.w("Dropping message because uid %s is never registered", valueOf);
        } else {
            getReceiverContext().zzf(str, str2, str3, zzeqVar);
        }
    }

    public void onSenderConnected(zzfe zzfeVar, int i) {
        zzt zztVar;
        if (zzfeVar == null) {
            log.e("Ignoring sender connected event as the sender info is unrecognized", new Object[0]);
            return;
        }
        SenderInfo parseSenderInfo = parseSenderInfo(zzfeVar);
        if (parseSenderInfo != null && (zztVar = this.uidToClientMap.get(Integer.valueOf(i))) != null && zztVar.zzd.add(parseSenderInfo.getSenderId())) {
            getReceiverContext().zzg(parseSenderInfo);
        }
    }

    public void onSenderDisconnected(zzfc zzfcVar, int i) {
        if (zzfcVar == null) {
            log.e("Ignoring sender connected event as the event info is unrecognized", new Object[0]);
            return;
        }
        zzt zztVar = this.uidToClientMap.get(Integer.valueOf(i));
        String zzd = zzfcVar.zza().zzd();
        if (zztVar != null && zztVar.zzd.remove(zzd)) {
            getReceiverContext().zzh(zzd, translatedDisconnectReason(zzfcVar.zza().zza()));
        }
    }

    public void onStopApplication(int i) {
        if (!getOrInitSystemAppChecker().zza(i)) {
            log.e("Uid %d is not authorized to stop the application", Integer.valueOf(i));
        } else {
            getReceiverContext().zzi();
        }
    }

    private CastLaunchRequest parseCastLaunchRequest(zzes zzesVar) {
        try {
            zzc.zze().zzh(this);
        } catch (zzb unused) {
        }
        CastLaunchRequest zza = zzc.zze().zza(zzesVar);
        if (zza == null) {
            return new CastLaunchRequest(null);
        }
        return zza;
    }

    private SenderInfo parseSenderInfo(zzfe zzfeVar) {
        try {
            zzc.zze().zzh(this);
        } catch (zzb unused) {
        }
        return zzc.zze().zzc(zzfeVar);
    }

    public void setClientInfo(int i, zzeb zzebVar) {
        zzcl zzb;
        zzt zztVar = this.uidToClientMap.get(Integer.valueOf(i));
        if (zztVar == null) {
            return;
        }
        if (zzebVar != null) {
            zzb = zzebVar.zza();
        } else {
            zzb = zzcl.zzb();
        }
        zztVar.zzc = zzb;
        getReceiverContext().zzl();
    }

    public void tearDown() {
        ArrayList arrayList = new ArrayList(this.uidToClientMap.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tearDownClient(((Integer) arrayList.get(i)).intValue());
        }
    }

    private void tearDownClient(int i) {
        zzt remove = this.uidToClientMap.remove(Integer.valueOf(i));
        if (remove == null) {
            return;
        }
        for (final String str : remove.zzd) {
            zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzf
                @Override // java.lang.Runnable
                public final void run() {
                    CastTvHostService.this.m54x24531d16(str);
                }
            });
        }
        remove.zza.asBinder().unlinkToDeath(remove.zzb, 0);
        if (this.uidToClientMap.isEmpty()) {
            getReceiverContext().zzk();
        }
    }

    @SenderDisconnectedEventInfo.DisconnectReason
    private static int translatedDisconnectReason(zzdn zzdnVar) {
        zzco zzcoVar = zzco.UNKNOWN;
        zzdn zzdnVar2 = zzdn.UNKNOWN;
        int ordinal = zzdnVar.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                return 0;
            }
        }
        return i;
    }

    /* renamed from: lambda$checkLaunchSupported$1$com-google-android-gms-cast-tv-internal-CastTvHostService */
    public /* synthetic */ void m52xba11f0d8(zzeh zzehVar, Boolean bool) {
        notifyBooleanCallback(zzehVar, bool.booleanValue());
    }

    /* renamed from: lambda$checkLaunchSupported$2$com-google-android-gms-cast-tv-internal-CastTvHostService */
    public /* synthetic */ void m53xcac7bd99(zzeh zzehVar, Exception exc) {
        notifyBooleanCallback(zzehVar, false);
    }

    /* renamed from: lambda$tearDownClient$3$com-google-android-gms-cast-tv-internal-CastTvHostService */
    public /* synthetic */ void m54x24531d16(String str) {
        getReceiverContext().zzh(str, 0);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        int i = zzaj.zza;
        if (PlatformVersion.isAtLeastM()) {
            return this.serviceStub;
        }
        return null;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        zzaj.zza().post(new Runnable() { // from class: com.google.android.gms.cast.tv.internal.zzi
            @Override // java.lang.Runnable
            public final void run() {
                CastTvHostService.this.tearDown();
            }
        });
        return false;
    }
}
