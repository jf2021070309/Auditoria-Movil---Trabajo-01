package com.google.firebase.messaging;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.aps.iva.x.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.zzao;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzu {
    private static final long zza = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern zzb = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private final FirebaseInstanceId zzc;
    private final Context zzd;
    private final zzao zze;
    private final com.google.firebase.iid.zzt zzf;
    private final ScheduledExecutorService zzg;
    private boolean zzh;
    private int zzi;
    private final Map<Integer, TaskCompletionSource<Void>> zzj;
    private final zzv zzk;

    public zzu(FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, zzao zzaoVar, UserAgentPublisher userAgentPublisher, HeartBeatInfo heartBeatInfo, FirebaseInstallationsApi firebaseInstallationsApi, Context context, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this(firebaseInstanceId, zzaoVar, new zzv(context), new com.google.firebase.iid.zzt(firebaseApp, zzaoVar, executor, userAgentPublisher, heartBeatInfo, firebaseInstallationsApi), context, scheduledExecutorService);
    }

    private final synchronized Task<Void> zzc(String str) {
        String zza2;
        TaskCompletionSource<Void> taskCompletionSource;
        synchronized (this.zzk) {
            zza2 = this.zzk.zza();
            zzv zzvVar = this.zzk;
            StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 1 + String.valueOf(str).length());
            sb.append(zza2);
            sb.append(",");
            sb.append(str);
            zzvVar.zza(sb.toString());
        }
        taskCompletionSource = new TaskCompletionSource<>();
        this.zzj.put(Integer.valueOf(this.zzi + (TextUtils.isEmpty(zza2) ? 0 : zza2.split(",").length - 1)), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    private final synchronized boolean zzd() {
        return zzf() != null;
    }

    private final synchronized void zze() {
        if (!this.zzh) {
            zza(0L);
        }
    }

    private final String zzf() {
        String zza2;
        synchronized (this.zzk) {
            zza2 = this.zzk.zza();
        }
        if (!TextUtils.isEmpty(zza2)) {
            String[] split = zza2.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
            return null;
        }
        return null;
    }

    public final Task<Void> zza(String str) {
        String valueOf = String.valueOf(zza(str, "subscribeToTopic"));
        Task<Void> zzc = zzc(valueOf.length() != 0 ? "S!".concat(valueOf) : new String("S!"));
        zza();
        return zzc;
    }

    public final Task<Void> zzb(String str) {
        String valueOf = String.valueOf(zza(str, "unsubscribeFromTopic"));
        Task<Void> zzc = zzc(valueOf.length() != 0 ? "U!".concat(valueOf) : new String("U!"));
        zza();
        return zzc;
    }

    private zzu(FirebaseInstanceId firebaseInstanceId, zzao zzaoVar, zzv zzvVar, com.google.firebase.iid.zzt zztVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzh = false;
        this.zzi = 0;
        this.zzj = new a();
        this.zzc = firebaseInstanceId;
        this.zze = zzaoVar;
        this.zzk = zzvVar;
        this.zzf = zztVar;
        this.zzd = context;
        this.zzg = scheduledExecutorService;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: IOException -> 0x00af, TryCatch #0 {IOException -> 0x00af, blocks: (B:5:0x0010, B:19:0x0036, B:21:0x003c, B:22:0x0049, B:24:0x006c, B:25:0x007c, B:27:0x009f, B:10:0x001d, B:13:0x0027), top: B:42:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzd(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "!"
            java.lang.String[] r0 = r7.split(r0)
            int r1 = r0.length
            r2 = 2
            r3 = 1
            if (r1 != r2) goto Le5
            r1 = 0
            r2 = r0[r1]
            r0 = r0[r3]
            int r4 = r2.hashCode()     // Catch: java.io.IOException -> Laf
            r5 = 83
            if (r4 == r5) goto L27
            r5 = 85
            if (r4 == r5) goto L1d
            goto L31
        L1d:
            java.lang.String r4 = "U"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> Laf
            if (r2 == 0) goto L31
            r2 = r3
            goto L32
        L27:
            java.lang.String r4 = "S"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> Laf
            if (r2 == 0) goto L31
            r2 = r1
            goto L32
        L31:
            r2 = -1
        L32:
            if (r2 == 0) goto L7c
            if (r2 == r3) goto L49
            boolean r0 = zzc()     // Catch: java.io.IOException -> Laf
            if (r0 == 0) goto Le5
            int r7 = r7.length()     // Catch: java.io.IOException -> Laf
            int r7 = r7 + 24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Laf
            r0.<init>(r7)     // Catch: java.io.IOException -> Laf
            goto Le5
        L49:
            com.google.firebase.iid.FirebaseInstanceId r7 = r6.zzc     // Catch: java.io.IOException -> Laf
            com.google.android.gms.tasks.Task r7 = r7.getInstanceId()     // Catch: java.io.IOException -> Laf
            java.lang.Object r7 = zza(r7)     // Catch: java.io.IOException -> Laf
            com.google.firebase.iid.InstanceIdResult r7 = (com.google.firebase.iid.InstanceIdResult) r7     // Catch: java.io.IOException -> Laf
            com.google.firebase.iid.zzt r2 = r6.zzf     // Catch: java.io.IOException -> Laf
            java.lang.String r4 = r7.getId()     // Catch: java.io.IOException -> Laf
            java.lang.String r7 = r7.getToken()     // Catch: java.io.IOException -> Laf
            com.google.android.gms.tasks.Task r7 = r2.zzd(r4, r7, r0)     // Catch: java.io.IOException -> Laf
            zza(r7)     // Catch: java.io.IOException -> Laf
            boolean r7 = zzc()     // Catch: java.io.IOException -> Laf
            if (r7 == 0) goto Le5
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> Laf
            int r7 = r7.length()     // Catch: java.io.IOException -> Laf
            int r7 = r7 + 35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Laf
            r0.<init>(r7)     // Catch: java.io.IOException -> Laf
            goto Le5
        L7c:
            com.google.firebase.iid.FirebaseInstanceId r7 = r6.zzc     // Catch: java.io.IOException -> Laf
            com.google.android.gms.tasks.Task r7 = r7.getInstanceId()     // Catch: java.io.IOException -> Laf
            java.lang.Object r7 = zza(r7)     // Catch: java.io.IOException -> Laf
            com.google.firebase.iid.InstanceIdResult r7 = (com.google.firebase.iid.InstanceIdResult) r7     // Catch: java.io.IOException -> Laf
            com.google.firebase.iid.zzt r2 = r6.zzf     // Catch: java.io.IOException -> Laf
            java.lang.String r4 = r7.getId()     // Catch: java.io.IOException -> Laf
            java.lang.String r7 = r7.getToken()     // Catch: java.io.IOException -> Laf
            com.google.android.gms.tasks.Task r7 = r2.zzc(r4, r7, r0)     // Catch: java.io.IOException -> Laf
            zza(r7)     // Catch: java.io.IOException -> Laf
            boolean r7 = zzc()     // Catch: java.io.IOException -> Laf
            if (r7 == 0) goto Le5
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> Laf
            int r7 = r7.length()     // Catch: java.io.IOException -> Laf
            int r7 = r7 + 31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Laf
            r0.<init>(r7)     // Catch: java.io.IOException -> Laf
            goto Le5
        Laf:
            r7 = move-exception
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r2 = r7.getMessage()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            java.lang.String r2 = r7.getMessage()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lc9
            goto Ld1
        Lc9:
            java.lang.String r0 = r7.getMessage()
            if (r0 != 0) goto Ld0
            return r1
        Ld0:
            throw r7
        Ld1:
            java.lang.String r7 = r7.getMessage()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r7 = r7.length()
            int r7 = r7 + 53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            return r1
        Le5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.zzu.zzd(java.lang.String):boolean");
    }

    private static String zza(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            new StringBuilder(e.a(str2, 78));
            str = str.substring(8);
        }
        if (str == null || !zzb.matcher(str).matches()) {
            throw new IllegalArgumentException(com.amazon.aps.iva.d90.a.b(e.a(str, 79), "Invalid topic name: ", str, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        return str;
    }

    public final boolean zzb() throws IOException {
        TaskCompletionSource<Void> remove;
        while (true) {
            synchronized (this) {
                String zzf = zzf();
                if (zzf == null) {
                    zzc();
                    return true;
                } else if (!zzd(zzf)) {
                    return false;
                } else {
                    synchronized (this) {
                        remove = this.zzj.remove(Integer.valueOf(this.zzi));
                        synchronized (this.zzk) {
                            this.zzk.zzb(zzf);
                        }
                        this.zzi++;
                    }
                    if (remove != null) {
                        remove.setResult(null);
                    }
                }
            }
        }
    }

    public static boolean zzc() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final synchronized void zza() {
        if (zzd()) {
            zze();
        }
    }

    public final synchronized void zza(long j) {
        zza(new zzx(this, this.zzd, this.zze, Math.min(Math.max(30L, j << 1), zza)), j);
        this.zzh = true;
    }

    public final synchronized void zza(Runnable runnable, long j) {
        this.zzg.schedule(runnable, j, TimeUnit.SECONDS);
    }

    private static <T> T zza(Task<T> task) throws IOException {
        try {
            return (T) Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final synchronized void zza(boolean z) {
        this.zzh = z;
    }
}
