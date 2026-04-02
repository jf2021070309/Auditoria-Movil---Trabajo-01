package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public class FirebaseInstanceId {
    private static zzaz zzb;
    @VisibleForTesting
    private static ScheduledExecutorService zzd;
    @VisibleForTesting
    private final Executor zze;
    private final FirebaseApp zzf;
    private final zzao zzg;
    private final zzt zzh;
    private final zzat zzi;
    private final FirebaseInstallationsApi zzj;
    private boolean zzk;
    private final zza zzl;
    private static final long zza = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern zzc = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId(FirebaseApp firebaseApp, Subscriber subscriber, UserAgentPublisher userAgentPublisher, HeartBeatInfo heartBeatInfo, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, new zzao(firebaseApp.getApplicationContext()), zzh.zzb(), zzh.zzb(), subscriber, userAgentPublisher, heartBeatInfo, firebaseInstallationsApi);
    }

    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public static boolean zzd() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj() {
        if (zza(zzb())) {
            zzk();
        }
    }

    private final synchronized void zzk() {
        if (!this.zzk) {
            zza(0L);
        }
    }

    private final String zzl() {
        try {
            zzb.zzb(this.zzf.getPersistenceKey());
            Task<String> id = this.zzj.getId();
            Preconditions.checkNotNull(id, "Task must not be null");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            id.addOnCompleteListener(zzn.zza, new OnCompleteListener(countDownLatch) { // from class: com.google.firebase.iid.zzm
                private final CountDownLatch zza;

                {
                    this.zza = countDownLatch;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.zza.countDown();
                }
            });
            countDownLatch.await(NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, TimeUnit.MILLISECONDS);
            if (id.isSuccessful()) {
                return id.getResult();
            }
            if (id.isCanceled()) {
                throw new CancellationException("Task is already canceled");
            }
            throw new IllegalStateException(id.getException());
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    private final String zzm() {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.zzf.getName())) {
            return "";
        }
        return this.zzf.getPersistenceKey();
    }

    public void deleteInstanceId() throws IOException {
        zza(this.zzf);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            zza(this.zzj.delete());
            zze();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public void deleteToken(String str, String str2) throws IOException {
        zza(this.zzf);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String zza2 = zza(str2);
            zza(this.zzh.zzb(zzl(), str, zza2));
            zzb.zzb(zzm(), str, zza2);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public long getCreationTime() {
        return zzb.zza(this.zzf.getPersistenceKey());
    }

    public String getId() {
        zza(this.zzf);
        zzj();
        return zzl();
    }

    public Task<InstanceIdResult> getInstanceId() {
        return zza(zzao.zza(this.zzf), "*");
    }

    @Deprecated
    public String getToken() {
        zza(this.zzf);
        zzay zzb2 = zzb();
        if (zza(zzb2)) {
            zzk();
        }
        return zzay.zza(zzb2);
    }

    public final FirebaseApp zza() {
        return this.zzf;
    }

    public final zzay zzb() {
        return zzb(zzao.zza(this.zzf), "*");
    }

    public final String zzc() throws IOException {
        return getToken(zzao.zza(this.zzf), "*");
    }

    public final synchronized void zze() {
        zzb.zza();
        if (this.zzl.zza()) {
            zzk();
        }
    }

    @VisibleForTesting
    public final boolean zzf() {
        return this.zzg.zza();
    }

    public final void zzg() {
        zzb.zzc(zzm());
        zzk();
    }

    @VisibleForTesting
    public final boolean zzh() {
        return this.zzl.zza();
    }

    public final /* synthetic */ void zzi() {
        if (this.zzl.zza()) {
            zzj();
        }
    }

    @Keep
    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        return (FirebaseInstanceId) firebaseApp.get(FirebaseInstanceId.class);
    }

    @VisibleForTesting
    private final zzay zzb(String str, String str2) {
        return zzb.zza(zzm(), str, str2);
    }

    public final synchronized void zza(boolean z) {
        this.zzk = z;
    }

    @VisibleForTesting
    public final void zzb(boolean z) {
        this.zzl.zza(z);
    }

    public final synchronized void zza(long j) {
        zza(new zzbb(this, Math.min(Math.max(30L, j << 1), zza)), j);
        this.zzk = true;
    }

    /* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
    /* loaded from: classes4.dex */
    public class zza {
        private boolean zzb;
        private final Subscriber zzc;
        private boolean zzd;
        private EventHandler<DataCollectionDefaultChange> zze;
        private Boolean zzf;

        public zza(Subscriber subscriber) {
            this.zzc = subscriber;
        }

        private final synchronized void zzb() {
            if (this.zzd) {
                return;
            }
            this.zzb = zzd();
            Boolean zzc = zzc();
            this.zzf = zzc;
            if (zzc == null && this.zzb) {
                EventHandler<DataCollectionDefaultChange> eventHandler = new EventHandler(this) { // from class: com.google.firebase.iid.zzq
                    private final FirebaseInstanceId.zza zza;

                    {
                        this.zza = this;
                    }

                    @Override // com.google.firebase.events.EventHandler
                    public final void handle(Event event) {
                        FirebaseInstanceId.zza zzaVar = this.zza;
                        synchronized (zzaVar) {
                            if (zzaVar.zza()) {
                                FirebaseInstanceId.this.zzj();
                            }
                        }
                    }
                };
                this.zze = eventHandler;
                this.zzc.subscribe(DataCollectionDefaultChange.class, eventHandler);
            }
            this.zzd = true;
        }

        private final Boolean zzc() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseInstanceId.this.zzf.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean zzd() {
            return true;
        }

        public final synchronized boolean zza() {
            zzb();
            Boolean bool = this.zzf;
            if (bool != null) {
                return bool.booleanValue();
            }
            return this.zzb && FirebaseInstanceId.this.zzf.isDataCollectionDefaultEnabled();
        }

        public final synchronized void zza(boolean z) {
            zzb();
            EventHandler<DataCollectionDefaultChange> eventHandler = this.zze;
            if (eventHandler != null) {
                this.zzc.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                this.zze = null;
            }
            SharedPreferences.Editor edit = FirebaseInstanceId.this.zzf.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.zzj();
            }
            this.zzf = Boolean.valueOf(z);
        }
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, zzao zzaoVar, Executor executor, Executor executor2, Subscriber subscriber, UserAgentPublisher userAgentPublisher, HeartBeatInfo heartBeatInfo, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.zzk = false;
        if (zzao.zza(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (zzb == null) {
                    zzb = new zzaz(firebaseApp.getApplicationContext());
                }
            }
            this.zzf = firebaseApp;
            this.zzg = zzaoVar;
            this.zzh = new zzt(firebaseApp, zzaoVar, executor, userAgentPublisher, heartBeatInfo, firebaseInstallationsApi);
            this.zze = executor2;
            this.zzl = new zza(subscriber);
            this.zzi = new zzat(executor);
            this.zzj = firebaseInstallationsApi;
            executor2.execute(new Runnable(this) { // from class: com.google.firebase.iid.zzl
                private final FirebaseInstanceId zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi();
                }
            });
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public String getToken(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InstanceIdResult) zza(zza(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    public static void zza(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (zzd == null) {
                zzd = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            zzd.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    private static void zza(FirebaseApp firebaseApp) {
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getProjectId(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        Preconditions.checkArgument(firebaseApp.getOptions().getApplicationId().contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(zzc.matcher(firebaseApp.getOptions().getApiKey()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private final Task<InstanceIdResult> zza(final String str, String str2) {
        final String zza2 = zza(str2);
        return Tasks.forResult(null).continueWithTask(this.zze, new Continuation(this, str, zza2) { // from class: com.google.firebase.iid.zzk
            private final FirebaseInstanceId zza;
            private final String zzb;
            private final String zzc;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = zza2;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.zza.zza(this.zzb, this.zzc, task);
            }
        });
    }

    private final <T> T zza(Task<T> task) throws IOException {
        try {
            return (T) Tasks.await(task, NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    zze();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        }
    }

    private static String zza(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase(AppMeasurement.FCM_ORIGIN) || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    public final boolean zza(zzay zzayVar) {
        return zzayVar == null || zzayVar.zzb(this.zzg.zzc());
    }

    public final /* synthetic */ Task zza(final String str, final String str2, Task task) throws Exception {
        final String zzl = zzl();
        zzay zzb2 = zzb(str, str2);
        if (!zza(zzb2)) {
            return Tasks.forResult(new zzaa(zzl, zzb2.zza));
        }
        return this.zzi.zza(str, str2, new zzav(this, zzl, str, str2) { // from class: com.google.firebase.iid.zzp
            private final FirebaseInstanceId zza;
            private final String zzb;
            private final String zzc;
            private final String zzd;

            {
                this.zza = this;
                this.zzb = zzl;
                this.zzc = str;
                this.zzd = str2;
            }

            @Override // com.google.firebase.iid.zzav
            public final Task zza() {
                return this.zza.zza(this.zzb, this.zzc, this.zzd);
            }
        });
    }

    public final /* synthetic */ Task zza(final String str, final String str2, final String str3) {
        return this.zzh.zza(str, str2, str3).onSuccessTask(this.zze, new SuccessContinuation(this, str2, str3, str) { // from class: com.google.firebase.iid.zzo
            private final FirebaseInstanceId zza;
            private final String zzb;
            private final String zzc;
            private final String zzd;

            {
                this.zza = this;
                this.zzb = str2;
                this.zzc = str3;
                this.zzd = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.zza.zza(this.zzb, this.zzc, this.zzd, (String) obj);
            }
        });
    }

    public final /* synthetic */ Task zza(String str, String str2, String str3, String str4) throws Exception {
        zzb.zza(zzm(), str, str2, str4, this.zzg.zzc());
        return Tasks.forResult(new zzaa(str3, str4));
    }
}
