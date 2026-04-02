package e.d.d.k;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class c implements Callable<String> {
    public final /* synthetic */ FirebaseAnalytics a;

    public c(FirebaseAnalytics firebaseAnalytics) {
        this.a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        return this.a.f4729b.zzk();
    }
}
