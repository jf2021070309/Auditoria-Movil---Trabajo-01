package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.zzbt;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzbr;
import com.google.android.gms.internal.cast.zzbs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public class CastSession extends Session {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = new Logger("CastSession");
    private final Context zzc;
    private final Set zzd;
    private final zzam zze;
    private final CastOptions zzf;
    private final com.google.android.gms.internal.cast.zzbf zzg;
    private final com.google.android.gms.cast.framework.media.internal.zzv zzh;
    private com.google.android.gms.cast.zzr zzi;
    private RemoteMediaClient zzj;
    private CastDevice zzk;
    private Cast.ApplicationConnectionResult zzl;
    private zzs zzm;
    private final zzo zzn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastSession(Context context, String str, String str2, CastOptions castOptions, com.google.android.gms.internal.cast.zzbf zzbfVar, com.google.android.gms.cast.framework.media.internal.zzv zzvVar) {
        super(context, str, str2);
        zzo zzoVar = new Object() { // from class: com.google.android.gms.cast.framework.zzo
        };
        this.zzd = new HashSet();
        this.zzc = context.getApplicationContext();
        this.zzf = castOptions;
        this.zzg = zzbfVar;
        this.zzh = zzvVar;
        this.zzn = zzoVar;
        this.zze = com.google.android.gms.internal.cast.zzag.zzb(context, castOptions, zzn(), new zzw(this, null));
    }

    public static /* bridge */ /* synthetic */ void zzh(CastSession castSession, int i) {
        castSession.zzh.zzi(i);
        com.google.android.gms.cast.zzr zzrVar = castSession.zzi;
        if (zzrVar != null) {
            zzrVar.zzf();
            castSession.zzi = null;
        }
        castSession.zzk = null;
        RemoteMediaClient remoteMediaClient = castSession.zzj;
        if (remoteMediaClient != null) {
            remoteMediaClient.zzs(null);
            castSession.zzj = null;
        }
        castSession.zzl = null;
    }

    public static /* bridge */ /* synthetic */ void zzi(CastSession castSession, String str, Task task) {
        if (castSession.zze == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                Cast.ApplicationConnectionResult applicationConnectionResult = (Cast.ApplicationConnectionResult) task.getResult();
                castSession.zzl = applicationConnectionResult;
                if (applicationConnectionResult.getStatus() != null && applicationConnectionResult.getStatus().isSuccess()) {
                    zzb.d("%s() -> success result", str);
                    RemoteMediaClient remoteMediaClient = new RemoteMediaClient(new com.google.android.gms.cast.internal.zzaq(null));
                    castSession.zzj = remoteMediaClient;
                    remoteMediaClient.zzs(castSession.zzi);
                    castSession.zzj.registerCallback(new zzr(castSession));
                    castSession.zzj.zzq();
                    castSession.zzh.zzh(castSession.zzj, castSession.getCastDevice());
                    castSession.zze.zzf((ApplicationMetadata) Preconditions.checkNotNull(applicationConnectionResult.getApplicationMetadata()), applicationConnectionResult.getApplicationStatus(), (String) Preconditions.checkNotNull(applicationConnectionResult.getSessionId()), applicationConnectionResult.getWasLaunched());
                    return;
                } else if (applicationConnectionResult.getStatus() != null) {
                    zzb.d("%s() -> failure result", str);
                    castSession.zze.zzg(applicationConnectionResult.getStatus().getStatusCode());
                    return;
                }
            } else {
                Exception exception = task.getException();
                if (exception instanceof ApiException) {
                    castSession.zze.zzg(((ApiException) exception).getStatusCode());
                    return;
                }
            }
            castSession.zze.zzg(2476);
        } catch (RemoteException e) {
            zzb.d(e, "Unable to call %s on %s.", "methods", "zzam");
        }
    }

    private final void zzo(Bundle bundle) {
        CastMediaOptions castMediaOptions;
        NotificationOptions notificationOptions;
        boolean z;
        CastDevice fromBundle = CastDevice.getFromBundle(bundle);
        this.zzk = fromBundle;
        if (fromBundle == null) {
            if (isResuming()) {
                notifyFailedToResumeSession(2153);
                return;
            } else {
                notifyFailedToStartSession(2151);
                return;
            }
        }
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null) {
            zzrVar.zzf();
            this.zzi = null;
        }
        zzb.d("Acquiring a connection to Google Play Services for %s", this.zzk);
        CastDevice castDevice = (CastDevice) Preconditions.checkNotNull(this.zzk);
        Bundle bundle2 = new Bundle();
        CastOptions castOptions = this.zzf;
        if (castOptions == null) {
            castMediaOptions = null;
        } else {
            castMediaOptions = castOptions.getCastMediaOptions();
        }
        if (castMediaOptions == null) {
            notificationOptions = null;
        } else {
            notificationOptions = castMediaOptions.getNotificationOptions();
        }
        boolean z2 = true;
        if (castMediaOptions != null && castMediaOptions.zza()) {
            z = true;
        } else {
            z = false;
        }
        if (notificationOptions == null) {
            z2 = false;
        }
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", z2);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.zzg.zzs());
        Cast.CastOptions.Builder builder = new Cast.CastOptions.Builder(castDevice, new zzy(this, null));
        builder.zzc(bundle2);
        com.google.android.gms.cast.zzr zza2 = Cast.zza(this.zzc, builder.build());
        zza2.zzk(new zzaa(this, null));
        this.zzi = zza2;
        zza2.zze();
    }

    public void addCastListener(Cast.Listener listener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (listener != null) {
            this.zzd.add(listener);
        }
    }

    @Override // com.google.android.gms.cast.framework.Session
    public void end(boolean z) {
        zzam zzamVar = this.zze;
        if (zzamVar != null) {
            try {
                zzamVar.zze(z, 0);
            } catch (RemoteException e) {
                zzb.d(e, "Unable to call %s on %s.", "disconnectFromDevice", "zzam");
            }
            notifySessionEnded(0);
        }
    }

    public int getActiveInputState() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null && zzrVar.zzl()) {
            return zzrVar.zzb();
        }
        return -1;
    }

    public Cast.ApplicationConnectionResult getApplicationConnectionResult() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzl;
    }

    public ApplicationMetadata getApplicationMetadata() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null && zzrVar.zzl()) {
            return zzrVar.zzd();
        }
        return null;
    }

    public String getApplicationStatus() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null && zzrVar.zzl()) {
            return zzrVar.zzj();
        }
        return null;
    }

    public CastDevice getCastDevice() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzk;
    }

    public RemoteMediaClient getRemoteMediaClient() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzj;
    }

    @Override // com.google.android.gms.cast.framework.Session
    public long getSessionRemainingTimeMs() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        RemoteMediaClient remoteMediaClient = this.zzj;
        if (remoteMediaClient == null) {
            return 0L;
        }
        return remoteMediaClient.getStreamDuration() - this.zzj.getApproximateStreamPosition();
    }

    public int getStandbyState() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null && zzrVar.zzl()) {
            return zzrVar.zzc();
        }
        return -1;
    }

    public double getVolume() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null && zzrVar.zzl()) {
            return zzrVar.zza();
        }
        return 0.0d;
    }

    public boolean isMute() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null && zzrVar.zzl() && zzrVar.zzm()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.cast.framework.Session
    public void onResuming(Bundle bundle) {
        this.zzk = CastDevice.getFromBundle(bundle);
    }

    @Override // com.google.android.gms.cast.framework.Session
    public void onStarting(Bundle bundle) {
        this.zzk = CastDevice.getFromBundle(bundle);
    }

    public void removeCastListener(Cast.Listener listener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (listener != null) {
            this.zzd.remove(listener);
        }
    }

    public void removeMessageReceivedCallbacks(String str) throws IOException, IllegalArgumentException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null) {
            zzrVar.zzg(str);
        }
    }

    public void requestStatus() throws IOException, IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null) {
            ((zzbt) zzrVar).doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzbi
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    int i = zzbt.zzf;
                    ((com.google.android.gms.cast.internal.zzag) ((com.google.android.gms.cast.internal.zzx) obj).getService()).zzl();
                    ((TaskCompletionSource) obj2).setResult(null);
                }
            }).setMethodKey(8404).build());
        }
    }

    @Override // com.google.android.gms.cast.framework.Session
    public void resume(Bundle bundle) {
        zzo(bundle);
    }

    public PendingResult<Status> sendMessage(String str, String str2) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar == null) {
            return PendingResults.immediatePendingResult(new Status(17));
        }
        return zzbs.zza(zzrVar.zzh(str, str2), new zzbr() { // from class: com.google.android.gms.cast.framework.zzp
        }, new zzbr() { // from class: com.google.android.gms.cast.framework.zzq
        });
    }

    public void setMessageReceivedCallbacks(String str, Cast.MessageReceivedCallback messageReceivedCallback) throws IOException, IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null && zzrVar.zzl()) {
            zzrVar.zzi(str, messageReceivedCallback);
        }
    }

    public void setMute(final boolean z) throws IOException, IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null && zzrVar.zzl()) {
            final zzbt zzbtVar = (zzbt) zzrVar;
            zzbtVar.doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzbc
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    zzbt.this.zzL(z, (com.google.android.gms.cast.internal.zzx) obj, (TaskCompletionSource) obj2);
                }
            }).setMethodKey(8412).build());
        }
    }

    public void setVolume(final double d) throws IOException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null && zzrVar.zzl()) {
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                final zzbt zzbtVar = (zzbt) zzrVar;
                zzbtVar.doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzaz
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        zzbt.this.zzM(d, (com.google.android.gms.cast.internal.zzx) obj, (TaskCompletionSource) obj2);
                    }
                }).setMethodKey(8411).build());
                return;
            }
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
    }

    @Override // com.google.android.gms.cast.framework.Session
    public void start(Bundle bundle) {
        zzo(bundle);
    }

    public final com.google.android.gms.cast.framework.media.internal.zzv zze() {
        return this.zzh;
    }

    public final void zzj(zzs zzsVar) {
        this.zzm = zzsVar;
    }

    @Override // com.google.android.gms.cast.framework.Session
    public final void zzk(Bundle bundle) {
        boolean z;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        CastDevice fromBundle = CastDevice.getFromBundle(bundle);
        if (fromBundle != null && !fromBundle.equals(this.zzk)) {
            if (!TextUtils.isEmpty(fromBundle.getFriendlyName()) && ((castDevice2 = this.zzk) == null || !TextUtils.equals(castDevice2.getFriendlyName(), fromBundle.getFriendlyName()))) {
                z = true;
            } else {
                z = false;
            }
            this.zzk = fromBundle;
            Logger logger = zzb;
            Object[] objArr = new Object[2];
            objArr[0] = fromBundle;
            if (true != z) {
                str = "unchanged";
            } else {
                str = "changed";
            }
            objArr[1] = str;
            logger.d("update to device (%s) with name %s", objArr);
            if (z && (castDevice = this.zzk) != null) {
                com.google.android.gms.cast.framework.media.internal.zzv zzvVar = this.zzh;
                if (zzvVar != null) {
                    zzvVar.zzk(castDevice);
                }
                Iterator it = new HashSet(this.zzd).iterator();
                while (it.hasNext()) {
                    ((Cast.Listener) it.next()).onDeviceNameChanged();
                }
            }
        }
    }

    public final boolean zzl() {
        return this.zzg.zzs();
    }
}
