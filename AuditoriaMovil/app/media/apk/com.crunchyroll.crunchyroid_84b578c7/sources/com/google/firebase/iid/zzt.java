package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.aps.iva.j0.j0;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzt {
    private final FirebaseApp zza;
    private final zzao zzb;
    private final zzau zzc;
    private final Executor zzd;
    private final UserAgentPublisher zze;
    private final HeartBeatInfo zzf;
    private final FirebaseInstallationsApi zzg;

    public zzt(FirebaseApp firebaseApp, zzao zzaoVar, Executor executor, UserAgentPublisher userAgentPublisher, HeartBeatInfo heartBeatInfo, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, zzaoVar, executor, new zzau(firebaseApp.getApplicationContext(), zzaoVar), userAgentPublisher, heartBeatInfo, firebaseInstallationsApi);
    }

    public final Task<String> zza(String str, String str2, String str3) {
        return zzb(zza(str, str2, str3, new Bundle()));
    }

    public final Task<Void> zzb(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return zza(zzb(zza(str, str2, str3, bundle)));
    }

    public final Task<Void> zzc(String str, String str2, String str3) {
        String str4;
        String str5;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "/topics/".concat(valueOf);
        } else {
            str4 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str4);
        String valueOf2 = String.valueOf(str3);
        if (valueOf2.length() != 0) {
            str5 = "/topics/".concat(valueOf2);
        } else {
            str5 = new String("/topics/");
        }
        return zza(zzb(zza(str, str2, str5, bundle)));
    }

    public final Task<Void> zzd(String str, String str2, String str3) {
        String str4;
        String str5;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "/topics/".concat(valueOf);
        } else {
            str4 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str4);
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        if (valueOf2.length() != 0) {
            str5 = "/topics/".concat(valueOf2);
        } else {
            str5 = new String("/topics/");
        }
        return zza(zzb(zza(str, str2, str5, bundle)));
    }

    private zzt(FirebaseApp firebaseApp, zzao zzaoVar, Executor executor, zzau zzauVar, UserAgentPublisher userAgentPublisher, HeartBeatInfo heartBeatInfo, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.zza = firebaseApp;
        this.zzb = zzaoVar;
        this.zzc = zzauVar;
        this.zzd = executor;
        this.zze = userAgentPublisher;
        this.zzf = heartBeatInfo;
        this.zzg = firebaseInstallationsApi;
    }

    private final Task<Bundle> zza(final String str, final String str2, final String str3, final Bundle bundle) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzd.execute(new Runnable(this, str, str2, str3, bundle, taskCompletionSource) { // from class: com.google.firebase.iid.zzs
            private final zzt zza;
            private final String zzb;
            private final String zzc;
            private final String zzd;
            private final Bundle zze;
            private final TaskCompletionSource zzf;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = str2;
                this.zzd = str3;
                this.zze = bundle;
                this.zzf = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
            }
        });
        return taskCompletionSource.getTask();
    }

    private final Bundle zzb(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.zza.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.zzb.zze()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.zzb.zzc());
        bundle.putString("app_ver_name", this.zzb.zzd());
        bundle.putString("firebase-app-name-hash", zza());
        try {
            String token = ((InstallationTokenResult) Tasks.await(this.zzg.getToken(false))).getToken();
            if (!TextUtils.isEmpty(token)) {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        String version = LibraryVersion.getInstance().getVersion("firebase-iid");
        if ("UNKNOWN".equals(version)) {
            version = j0.c(19, "unknown_", GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        }
        String valueOf = String.valueOf(version);
        bundle.putString("cliv", valueOf.length() != 0 ? "fiid-".concat(valueOf) : new String("fiid-"));
        HeartBeatInfo.HeartBeat heartBeatCode = this.zzf.getHeartBeatCode("fire-iid");
        if (heartBeatCode != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
            bundle.putString("Firebase-Client", this.zze.getUserAgent());
        }
        return bundle;
    }

    private final String zza() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.zza.getName().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private static <T> Task<Void> zza(Task<T> task) {
        return task.continueWith(zzh.zza(), zzv.zza);
    }

    public final /* synthetic */ void zza(String str, String str2, String str3, Bundle bundle, TaskCompletionSource taskCompletionSource) {
        try {
            zzb(str, str2, str3, bundle);
            taskCompletionSource.setResult(this.zzc.zza(bundle));
        } catch (IOException e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<String> zzb(Task<Bundle> task) {
        return task.continueWith(this.zzd, new Continuation(this) { // from class: com.google.firebase.iid.zzu
            private final zzt zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Bundle bundle = (Bundle) task2.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null) {
                        return string;
                    }
                    String string2 = bundle.getString("unregistered");
                    if (string2 != null) {
                        return string2;
                    }
                    String string3 = bundle.getString("error");
                    if (!"RST".equals(string3)) {
                        if (string3 != null) {
                            throw new IOException(string3);
                        }
                        new StringBuilder(String.valueOf(bundle).length() + 21);
                        new Throwable();
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    throw new IOException("INSTANCE_ID_RESET");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        });
    }
}
