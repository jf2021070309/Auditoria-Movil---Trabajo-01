package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.zzao;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
/* loaded from: classes4.dex */
public class FirebaseMessaging {
    public static final String INSTANCE_ID_SCOPE = "FCM";
    @SuppressLint({"FirebaseUnknownNullness"})
    static TransportFactory zza;
    private final Context zzb;
    private final FirebaseInstanceId zzc;
    private final zzu zzd;

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, UserAgentPublisher userAgentPublisher, HeartBeatInfo heartBeatInfo, FirebaseInstallationsApi firebaseInstallationsApi, TransportFactory transportFactory) {
        zza = transportFactory;
        this.zzc = firebaseInstanceId;
        Context applicationContext = firebaseApp.getApplicationContext();
        this.zzb = applicationContext;
        this.zzd = new zzu(firebaseApp, firebaseInstanceId, new zzao(applicationContext), userAgentPublisher, heartBeatInfo, firebaseInstallationsApi, applicationContext, zzi.zza(), new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io")));
        zzi.zzb().execute(new Runnable(this) { // from class: com.google.firebase.messaging.zzk
            private final FirebaseMessaging zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza();
            }
        });
    }

    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(FirebaseApp.getInstance());
        }
        return firebaseMessaging;
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return zzp.zza();
    }

    public boolean isAutoInitEnabled() {
        return this.zzc.zzh();
    }

    public void send(RemoteMessage remoteMessage) {
        if (!TextUtils.isEmpty(remoteMessage.getTo())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.zzb, 0, intent2, 0));
            intent.setPackage("com.google.android.gms");
            intent.putExtras(remoteMessage.zza);
            this.zzb.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void setAutoInitEnabled(boolean z) {
        this.zzc.zzb(z);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        zzp.zza(z);
    }

    public Task<Void> subscribeToTopic(String str) {
        return this.zzd.zza(str);
    }

    public Task<Void> unsubscribeFromTopic(String str) {
        return this.zzd.zzb(str);
    }

    public final /* synthetic */ void zza() {
        if (isAutoInitEnabled()) {
            this.zzd.zza();
        }
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
        }
        return firebaseMessaging;
    }
}
