package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.qq.e.comm.pi.ACTD;
import java.io.IOException;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ak implements MessagingChannel {
    private final FirebaseApp a;
    private final zzan b;
    private final q c;
    private final Executor d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ak(FirebaseApp firebaseApp, zzan zzanVar, Executor executor) {
        this(firebaseApp, zzanVar, executor, new q(firebaseApp.getApplicationContext(), zzanVar));
    }

    private ak(FirebaseApp firebaseApp, zzan zzanVar, Executor executor, q qVar) {
        this.a = firebaseApp;
        this.b = zzanVar;
        this.c = qVar;
        this.d = executor;
    }

    @Override // com.google.firebase.iid.MessagingChannel
    public final boolean isAvailable() {
        return this.b.zzac() != 0;
    }

    @Override // com.google.firebase.iid.MessagingChannel
    public final boolean isChannelBuilt() {
        return true;
    }

    @Override // com.google.firebase.iid.MessagingChannel
    public final Task<Void> buildChannel(String str, String str2) {
        return Tasks.forResult(null);
    }

    @Override // com.google.firebase.iid.MessagingChannel
    public final Task<String> getToken(String str, String str2, String str3, String str4) {
        return b(a(str, str3, str4, new Bundle()));
    }

    @Override // com.google.firebase.iid.MessagingChannel
    public final Task<Void> deleteToken(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return a(b(a(str, str3, str4, bundle)));
    }

    @Override // com.google.firebase.iid.MessagingChannel
    public final Task<Void> deleteInstanceId(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("iid-operation", "delete");
        bundle.putString("delete", "1");
        return a(b(a(str, "*", "*", bundle)));
    }

    @Override // com.google.firebase.iid.MessagingChannel
    public final Task<Void> ackMessage(String str) {
        return null;
    }

    @Override // com.google.firebase.iid.MessagingChannel
    public final Task<Void> subscribeToTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    @Override // com.google.firebase.iid.MessagingChannel
    public final Task<Void> unsubscribeFromTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        bundle.putString("delete", "1");
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    private final Task<Bundle> a(String str, String str2, String str3, final Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString(ACTD.APPID_KEY, str);
        bundle.putString("gmp_app_id", this.a.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.b.zzaf()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.zzad());
        bundle.putString("app_ver_name", this.b.zzae());
        bundle.putString("cliv", "fiid-12451000");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.execute(new Runnable(this, bundle, taskCompletionSource) { // from class: com.google.firebase.iid.al
            private final ak a;
            private final Bundle b;
            private final TaskCompletionSource c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.b = bundle;
                this.c = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b, this.c);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        String valueOf = String.valueOf(bundle);
        Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 21).append("Unexpected response: ").append(valueOf).toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private final <T> Task<Void> a(Task<T> task) {
        return task.continueWith(ac.a(), new am(this));
    }

    private final Task<String> b(Task<Bundle> task) {
        return task.continueWith(this.d, new an(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle, TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(this.c.a(bundle));
        } catch (IOException e) {
            taskCompletionSource.setException(e);
        }
    }
}
