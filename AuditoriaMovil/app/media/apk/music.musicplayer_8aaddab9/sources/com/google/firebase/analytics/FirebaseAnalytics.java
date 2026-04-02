package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzib;
import com.google.android.gms.tasks.Tasks;
import e.d.d.k.d;
import e.d.d.u.g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics a;

    /* renamed from: b  reason: collision with root package name */
    public final zzee f4729b;

    /* renamed from: c  reason: collision with root package name */
    public ExecutorService f4730c;

    public FirebaseAnalytics(zzee zzeeVar) {
        Preconditions.checkNotNull(zzeeVar);
        this.f4729b = zzeeVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (a == null) {
                    a = new FirebaseAnalytics(zzee.zzg(context, null, null, null, null));
                }
            }
        }
        return a;
    }

    @Keep
    public static zzib getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzee zzg = zzee.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new d(zzg);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = g.a;
            return (String) Tasks.await(g.f(e.d.d.g.b()).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        } catch (ExecutionException e3) {
            throw new IllegalStateException(e3.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f4729b.zzG(activity, str, str2);
    }
}
