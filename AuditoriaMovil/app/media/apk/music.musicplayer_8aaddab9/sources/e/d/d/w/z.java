package e.d.d.w;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e.d.d.r.f;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class z {
    public final e.d.d.g a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f7728b;

    /* renamed from: c  reason: collision with root package name */
    public final Rpc f7729c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.d.t.b<e.d.d.x.h> f7730d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.d.t.b<e.d.d.r.f> f7731e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.d.u.h f7732f;

    public z(e.d.d.g gVar, d0 d0Var, e.d.d.t.b<e.d.d.x.h> bVar, e.d.d.t.b<e.d.d.r.f> bVar2, e.d.d.u.h hVar) {
        gVar.a();
        Rpc rpc = new Rpc(gVar.f7040d);
        this.a = gVar;
        this.f7728b = d0Var;
        this.f7729c = rpc;
        this.f7730d = bVar;
        this.f7731e = bVar2;
        this.f7732f = hVar;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(new Executor() { // from class: e.d.d.w.y
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new Continuation() { // from class: e.d.d.w.x
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Objects.requireNonNull(z.this);
                Bundle bundle = (Bundle) task2.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string == null && (string = bundle.getString("unregistered")) == null) {
                        String string2 = bundle.getString("error");
                        if ("RST".equals(string2)) {
                            throw new IOException("INSTANCE_ID_RESET");
                        }
                        if (string2 != null) {
                            throw new IOException(string2);
                        }
                        Log.w("FirebaseMessaging", "Unexpected response: ".concat(bundle.toString()), new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    return string;
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        });
    }

    public final void b(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        int i2;
        String str3;
        String str4;
        f.a a;
        PackageInfo c2;
        bundle.putString(Action.SCOPE_ATTRIBUTE, str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        e.d.d.g gVar = this.a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f7042f.f7049b);
        d0 d0Var = this.f7728b;
        synchronized (d0Var) {
            if (d0Var.f7667d == 0 && (c2 = d0Var.c("com.google.android.gms")) != null) {
                d0Var.f7667d = c2.versionCode;
            }
            i2 = d0Var.f7667d;
        }
        bundle.putString("gmsv", Integer.toString(i2));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f7728b.a());
        d0 d0Var2 = this.f7728b;
        synchronized (d0Var2) {
            if (d0Var2.f7666c == null) {
                d0Var2.e();
            }
            str3 = d0Var2.f7666c;
        }
        bundle.putString("app_ver_name", str3);
        e.d.d.g gVar2 = this.a;
        gVar2.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f7041e.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String a2 = ((e.d.d.u.l) Tasks.await(this.f7732f.a(false))).a();
            if (TextUtils.isEmpty(a2)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", a2);
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e2);
        }
        bundle.putString("appid", (String) Tasks.await(this.f7732f.getId()));
        bundle.putString("cliv", "fcm-23.0.0");
        e.d.d.r.f fVar = this.f7731e.get();
        e.d.d.x.h hVar = this.f7730d.get();
        if (fVar == null || hVar == null || (a = fVar.a("fire-iid")) == f.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(a.getCode()));
        bundle.putString("Firebase-Client", hVar.a());
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        try {
            b(str, str2, bundle);
            return this.f7729c.send(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return Tasks.forException(e2);
        }
    }
}
