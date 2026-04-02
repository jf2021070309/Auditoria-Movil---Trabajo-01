package e.j.b.j;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import e.j.b.i.d;
/* loaded from: classes2.dex */
public class a extends e.j.b.a {
    public FirebaseAnalytics a;

    @Override // e.j.b.a
    @SuppressLint({"MissingPermission"})
    public void b(Application application, boolean z) {
        this.a = FirebaseAnalytics.getInstance(application);
        n.a.a.b("FirebasePlatform").g("Initialized", new Object[0]);
    }

    @Override // e.j.b.a
    public boolean c(Application application) {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            n.a.a.b("FirebasePlatform").g("FirebaseAnalytics not found!", new Object[0]);
            return false;
        }
    }

    @Override // e.j.b.a
    public void d(d dVar) {
    }

    @Override // e.j.b.a
    public void e(d dVar) {
    }

    @Override // e.j.b.a
    public void f(String str) {
        FirebaseAnalytics firebaseAnalytics = this.a;
        if (str.length() > 36) {
            str = str.substring(0, 36);
        }
        firebaseAnalytics.f4729b.zzM(str);
    }

    @Override // e.j.b.a
    public void g(String str, String str2) {
        this.a.f4729b.zzN(null, str, str2, false);
    }

    @Override // e.j.b.a
    public void h(String str, Bundle bundle) {
        FirebaseAnalytics firebaseAnalytics = this.a;
        a(bundle, 100);
        firebaseAnalytics.f4729b.zzx(str, bundle);
    }
}
