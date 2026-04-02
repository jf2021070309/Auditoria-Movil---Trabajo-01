package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import com.amazon.aps.iva.c3.s;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.f0;
import com.google.android.gms.cast.CastRemoteDisplay;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzdx;
import com.google.android.gms.internal.cast.zzdy;
import com.google.android.gms.internal.cast.zzed;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@TargetApi(19)
@Deprecated
/* loaded from: classes2.dex */
public abstract class CastRemoteDisplayLocalService extends Service {
    private static final Logger zza = new Logger("CastRDLocalService");
    private static final int zzb = R.id.cast_notification_id;
    private static final Object zzc = new Object();
    private static final AtomicBoolean zzd = new AtomicBoolean(false);
    @SuppressLint({"StaticFieldLeak"})
    private static CastRemoteDisplayLocalService zze;
    private String zzf;
    private WeakReference zzg;
    private zzar zzh;
    private NotificationSettings zzi;
    private Notification zzj;
    private boolean zzk;
    private PendingIntent zzl;
    private CastDevice zzm;
    private Display zzn;
    private Context zzo;
    private ServiceConnection zzp;
    private Handler zzq;
    private f0 zzr;
    private CastRemoteDisplayClient zzt;
    private boolean zzs = false;
    private final f0.a zzu = new zzag(this);
    private final IBinder zzv = new zzao(this);

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public interface Callbacks {
        void onRemoteDisplayMuteStateChanged(boolean z);

        void onRemoteDisplaySessionEnded(CastRemoteDisplayLocalService castRemoteDisplayLocalService);

        void onRemoteDisplaySessionError(Status status);

        void onRemoteDisplaySessionStarted(CastRemoteDisplayLocalService castRemoteDisplayLocalService);

        void onServiceCreated(CastRemoteDisplayLocalService castRemoteDisplayLocalService);
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static final class NotificationSettings {
        private Notification zza;
        private PendingIntent zzb;
        private String zzc;
        private String zzd;

        /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
        /* loaded from: classes2.dex */
        public static final class Builder {
            private final NotificationSettings zza = new NotificationSettings(null);

            public NotificationSettings build() {
                if (this.zza.zza != null) {
                    if (TextUtils.isEmpty(this.zza.zzc)) {
                        if (TextUtils.isEmpty(this.zza.zzd)) {
                            if (this.zza.zzb != null) {
                                throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
                            }
                        } else {
                            throw new IllegalArgumentException("notificationText requires using the default notification");
                        }
                    } else {
                        throw new IllegalArgumentException("notificationTitle requires using the default notification");
                    }
                } else if (TextUtils.isEmpty(this.zza.zzc) && TextUtils.isEmpty(this.zza.zzd) && this.zza.zzb == null) {
                    throw new IllegalArgumentException("At least an argument must be provided");
                }
                return this.zza;
            }

            public Builder setNotification(Notification notification) {
                this.zza.zza = notification;
                return this;
            }

            public Builder setNotificationPendingIntent(PendingIntent pendingIntent) {
                this.zza.zzb = pendingIntent;
                return this;
            }

            public Builder setNotificationText(String str) {
                this.zza.zzd = str;
                return this;
            }

            public Builder setNotificationTitle(String str) {
                this.zza.zzc = str;
                return this;
            }
        }

        private NotificationSettings() {
        }

        public /* synthetic */ NotificationSettings(NotificationSettings notificationSettings, zzap zzapVar) {
            this.zza = notificationSettings.zza;
            this.zzb = notificationSettings.zzb;
            this.zzc = notificationSettings.zzc;
            this.zzd = notificationSettings.zzd;
        }

        public /* synthetic */ NotificationSettings(zzap zzapVar) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static class Options {
        @CastRemoteDisplay.Configuration
        int zza = 2;

        @CastRemoteDisplay.Configuration
        public int getConfigPreset() {
            return this.zza;
        }

        public void setConfigPreset(@CastRemoteDisplay.Configuration int i) {
            this.zza = i;
        }
    }

    public static CastRemoteDisplayLocalService getInstance() {
        CastRemoteDisplayLocalService castRemoteDisplayLocalService;
        synchronized (zzc) {
            castRemoteDisplayLocalService = zze;
        }
        return castRemoteDisplayLocalService;
    }

    public static void setDebugEnabled() {
        zza.zzb(true);
    }

    public static void startService(Context context, Class<? extends CastRemoteDisplayLocalService> cls, String str, CastDevice castDevice, NotificationSettings notificationSettings, Callbacks callbacks) {
        startServiceWithOptions(context, cls, str, castDevice, new Options(), notificationSettings, callbacks);
    }

    public static void startServiceWithOptions(Context context, Class<? extends CastRemoteDisplayLocalService> cls, String str, CastDevice castDevice, Options options, NotificationSettings notificationSettings, Callbacks callbacks) {
        Logger logger = zza;
        logger.d("Starting Service", new Object[0]);
        synchronized (zzc) {
            if (zze != null) {
                logger.w("An existing service had not been stopped before starting one", new Object[0]);
                zzw(true);
            }
        }
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, cls), 128);
            if (serviceInfo != null && serviceInfo.exported) {
                throw new IllegalStateException("The service must not be exported, verify the manifest configuration");
            }
            Preconditions.checkNotNull(context, "activityContext is required.");
            Preconditions.checkNotNull(cls, "serviceClass is required.");
            Preconditions.checkNotNull(str, "applicationId is required.");
            Preconditions.checkNotNull(castDevice, "device is required.");
            Preconditions.checkNotNull(options, "options is required.");
            Preconditions.checkNotNull(notificationSettings, "notificationSettings is required.");
            Preconditions.checkNotNull(callbacks, "callbacks is required.");
            if (notificationSettings.zza == null && notificationSettings.zzb == null) {
                throw new IllegalArgumentException("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
            }
            if (zzd.getAndSet(true)) {
                logger.e("Service is already being started, startService has been called twice", new Object[0]);
                return;
            }
            Intent intent = new Intent(context, cls);
            context.startService(intent);
            ConnectionTracker.getInstance().bindService(context, intent, new zzai(str, castDevice, options, notificationSettings, context, callbacks), 64);
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("Service not found, did you forget to configure it in the manifest?", e);
        }
    }

    public static void stopService() {
        zzw(false);
    }

    public static /* bridge */ /* synthetic */ void zzl(CastRemoteDisplayLocalService castRemoteDisplayLocalService, Display display) {
        if (display == null) {
            zza.e("Cast Remote Display session created without display", new Object[0]);
            return;
        }
        castRemoteDisplayLocalService.zzn = display;
        if (castRemoteDisplayLocalService.zzk) {
            Notification zzu = castRemoteDisplayLocalService.zzu(true);
            castRemoteDisplayLocalService.zzj = zzu;
            castRemoteDisplayLocalService.startForeground(zzb, zzu);
        }
        Callbacks callbacks = (Callbacks) castRemoteDisplayLocalService.zzg.get();
        if (callbacks != null) {
            callbacks.onRemoteDisplaySessionStarted(castRemoteDisplayLocalService);
        }
        Preconditions.checkNotNull(castRemoteDisplayLocalService.zzn, "display is required.");
        castRemoteDisplayLocalService.onCreatePresentation(castRemoteDisplayLocalService.zzn);
    }

    public static /* bridge */ /* synthetic */ void zzo(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        Callbacks callbacks = (Callbacks) castRemoteDisplayLocalService.zzg.get();
        if (callbacks != null) {
            callbacks.onRemoteDisplaySessionError(new Status(CastStatusCodes.ERROR_SERVICE_CREATION_FAILED));
        }
        stopService();
    }

    public static /* bridge */ /* synthetic */ void zzq(CastRemoteDisplayLocalService castRemoteDisplayLocalService, NotificationSettings notificationSettings) {
        Preconditions.checkMainThread("updateNotificationSettingsInternal must be called on the main thread");
        if (castRemoteDisplayLocalService.zzi != null) {
            if (castRemoteDisplayLocalService.zzk) {
                if (notificationSettings.zza == null) {
                    if (notificationSettings.zzb != null) {
                        castRemoteDisplayLocalService.zzi.zzb = notificationSettings.zzb;
                    }
                    if (!TextUtils.isEmpty(notificationSettings.zzc)) {
                        castRemoteDisplayLocalService.zzi.zzc = notificationSettings.zzc;
                    }
                    if (!TextUtils.isEmpty(notificationSettings.zzd)) {
                        castRemoteDisplayLocalService.zzi.zzd = notificationSettings.zzd;
                    }
                    castRemoteDisplayLocalService.zzj = castRemoteDisplayLocalService.zzu(true);
                } else {
                    throw new IllegalStateException("Current mode is default notification, notification attribute must not be provided");
                }
            } else {
                Preconditions.checkNotNull(notificationSettings.zza, "notification is required.");
                Notification notification = notificationSettings.zza;
                castRemoteDisplayLocalService.zzj = notification;
                castRemoteDisplayLocalService.zzi.zza = notification;
            }
            castRemoteDisplayLocalService.startForeground(zzb, castRemoteDisplayLocalService.zzj);
            return;
        }
        throw new IllegalStateException("No current notification settings to update");
    }

    public static boolean zzt(CastRemoteDisplayLocalService castRemoteDisplayLocalService, String str, CastDevice castDevice, Options options, NotificationSettings notificationSettings, Context context, ServiceConnection serviceConnection, Callbacks callbacks) {
        castRemoteDisplayLocalService.zzv("startRemoteDisplaySession");
        Preconditions.checkMainThread("Starting the Cast Remote Display must be done on the main thread");
        synchronized (zzc) {
            if (zze != null) {
                zza.w("An existing service had not been stopped before starting one", new Object[0]);
                return false;
            }
            zze = castRemoteDisplayLocalService;
            castRemoteDisplayLocalService.zzg = new WeakReference(callbacks);
            castRemoteDisplayLocalService.zzf = str;
            castRemoteDisplayLocalService.zzm = castDevice;
            castRemoteDisplayLocalService.zzo = context;
            castRemoteDisplayLocalService.zzp = serviceConnection;
            if (castRemoteDisplayLocalService.zzr == null) {
                castRemoteDisplayLocalService.zzr = f0.d(castRemoteDisplayLocalService.getApplicationContext());
            }
            Preconditions.checkNotNull(castRemoteDisplayLocalService.zzf, "applicationId is required.");
            String categoryForCast = CastMediaControlIntent.categoryForCast(castRemoteDisplayLocalService.zzf);
            if (categoryForCast != null) {
                ArrayList<String> arrayList = new ArrayList<>();
                if (!arrayList.contains(categoryForCast)) {
                    arrayList.add(categoryForCast);
                }
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                e0 e0Var = new e0(bundle, arrayList);
                castRemoteDisplayLocalService.zzv("addMediaRouterCallback");
                castRemoteDisplayLocalService.zzr.a(e0Var, castRemoteDisplayLocalService.zzu, 4);
                castRemoteDisplayLocalService.zzj = notificationSettings.zza;
                castRemoteDisplayLocalService.zzh = new zzar(null);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT");
                intentFilter.addAction("com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED");
                if (PlatformVersion.isAtLeastT()) {
                    castRemoteDisplayLocalService.registerReceiver(castRemoteDisplayLocalService.zzh, intentFilter, 4);
                } else {
                    zzdx.zza(castRemoteDisplayLocalService, castRemoteDisplayLocalService.zzh, intentFilter);
                }
                NotificationSettings notificationSettings2 = new NotificationSettings(notificationSettings, null);
                castRemoteDisplayLocalService.zzi = notificationSettings2;
                if (notificationSettings2.zza == null) {
                    castRemoteDisplayLocalService.zzk = true;
                    castRemoteDisplayLocalService.zzj = castRemoteDisplayLocalService.zzu(false);
                } else {
                    castRemoteDisplayLocalService.zzk = false;
                    castRemoteDisplayLocalService.zzj = castRemoteDisplayLocalService.zzi.zza;
                }
                castRemoteDisplayLocalService.startForeground(zzb, castRemoteDisplayLocalService.zzj);
                castRemoteDisplayLocalService.zzv("startRemoteDisplay");
                Intent intent = new Intent("com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED");
                Preconditions.checkNotNull(castRemoteDisplayLocalService.zzo, "activityContext is required.");
                intent.setPackage(castRemoteDisplayLocalService.zzo.getPackageName());
                PendingIntent broadcast = PendingIntent.getBroadcast(castRemoteDisplayLocalService, 0, intent, zzdy.zza);
                zzal zzalVar = new zzal(castRemoteDisplayLocalService);
                Preconditions.checkNotNull(castRemoteDisplayLocalService.zzf, "applicationId is required.");
                castRemoteDisplayLocalService.zzt.zze(castDevice, castRemoteDisplayLocalService.zzf, options.getConfigPreset(), broadcast, zzalVar).addOnCompleteListener(new zzam(castRemoteDisplayLocalService));
                Callbacks callbacks2 = (Callbacks) castRemoteDisplayLocalService.zzg.get();
                if (callbacks2 == null) {
                    return true;
                }
                callbacks2.onServiceCreated(castRemoteDisplayLocalService);
                return true;
            }
            throw new IllegalArgumentException("category must not be null");
        }
    }

    private final Notification zzu(boolean z) {
        int i;
        int i2;
        zzv("createDefaultNotification");
        String str = this.zzi.zzc;
        String str2 = this.zzi.zzd;
        if (z) {
            i = R.string.cast_notification_connected_message;
            i2 = R.drawable.cast_ic_notification_on;
        } else {
            i = R.string.cast_notification_connecting_message;
            i2 = R.drawable.cast_ic_notification_connecting;
        }
        if (TextUtils.isEmpty(str)) {
            str = (String) getPackageManager().getApplicationLabel(getApplicationInfo());
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = getString(i, this.zzm.getFriendlyName());
        }
        s sVar = new s(this, "cast_remote_display_local_service");
        sVar.e(str);
        sVar.d(str2);
        sVar.g = this.zzi.zzb;
        sVar.E.icon = i2;
        sVar.f(2, true);
        String string = getString(R.string.cast_notification_disconnect);
        if (this.zzl == null) {
            Preconditions.checkNotNull(this.zzo, "activityContext is required.");
            Intent intent = new Intent("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT");
            intent.setPackage(this.zzo.getPackageName());
            this.zzl = PendingIntent.getBroadcast(this, 0, intent, zzdy.zza | 134217728);
        }
        sVar.a(17301560, string, this.zzl);
        return sVar.b();
    }

    public final void zzv(String str) {
        zza.d("[Instance: %s] %s", this, str);
    }

    public static void zzw(boolean z) {
        Logger logger = zza;
        logger.d("Stopping Service", new Object[0]);
        zzd.set(false);
        synchronized (zzc) {
            CastRemoteDisplayLocalService castRemoteDisplayLocalService = zze;
            if (castRemoteDisplayLocalService == null) {
                logger.e("Service is already being stopped", new Object[0]);
                return;
            }
            zze = null;
            if (castRemoteDisplayLocalService.zzq != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    castRemoteDisplayLocalService.zzq.post(new zzaj(castRemoteDisplayLocalService, z));
                } else {
                    castRemoteDisplayLocalService.zzx(z);
                }
            }
        }
    }

    public final void zzx(boolean z) {
        zzv("Stopping Service");
        Preconditions.checkMainThread("stopServiceInstanceInternal must be called on the main thread");
        if (!z && this.zzr != null) {
            zzv("Setting default route");
            this.zzr.getClass();
            f0.b();
            f0.h hVar = f0.c().r;
            if (hVar != null) {
                f0.j(hVar);
            } else {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
        }
        if (this.zzh != null) {
            zzv("Unregistering notification receiver");
            unregisterReceiver(this.zzh);
        }
        zzv("stopRemoteDisplaySession");
        zzv("stopRemoteDisplay");
        this.zzt.stopRemoteDisplay().addOnCompleteListener(new zzan(this));
        Callbacks callbacks = (Callbacks) this.zzg.get();
        if (callbacks != null) {
            callbacks.onRemoteDisplaySessionEnded(this);
        }
        onDismissPresentation();
        zzv("Stopping the remote display Service");
        stopForeground(true);
        stopSelf();
        if (this.zzr != null) {
            Preconditions.checkMainThread("CastRemoteDisplayLocalService calls must be done on the main thread");
            zzv("removeMediaRouterCallback");
            this.zzr.i(this.zzu);
        }
        Context context = this.zzo;
        ServiceConnection serviceConnection = this.zzp;
        if (context != null && serviceConnection != null) {
            try {
                ConnectionTracker.getInstance().unbindService(context, serviceConnection);
            } catch (IllegalArgumentException unused) {
                zzv("No need to unbind service, already unbound");
            }
        }
        this.zzp = null;
        this.zzo = null;
        this.zzf = null;
        this.zzj = null;
        this.zzn = null;
    }

    public Display getCastRemoteDisplay() {
        return this.zzn;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        zzv("onBind");
        return this.zzv;
    }

    @Override // android.app.Service
    public void onCreate() {
        zzv("onCreate");
        super.onCreate();
        zzed zzedVar = new zzed(getMainLooper());
        this.zzq = zzedVar;
        zzedVar.postDelayed(new zzah(this), 100L);
        if (this.zzt == null) {
            this.zzt = CastRemoteDisplay.getClient(this);
        }
        if (!PlatformVersion.isAtLeastO()) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("cast_remote_display_local_service", getString(R.string.cast_notification_default_channel_name), 2);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    public abstract void onCreatePresentation(Display display);

    public abstract void onDismissPresentation();

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        zzv("onStartCommand");
        this.zzs = true;
        return 2;
    }

    @Deprecated
    public void updateNotificationSettings(NotificationSettings notificationSettings) {
        if (PlatformVersion.isAtLeastS()) {
            return;
        }
        Preconditions.checkNotNull(notificationSettings, "notificationSettings is required.");
        Preconditions.checkNotNull(this.zzq, "Service is not ready yet.");
        this.zzq.post(new zzak(this, notificationSettings));
    }
}
