package e.j.b.j;

import android.app.Application;
import android.os.Bundle;
import com.flurry.android.FlurryAgent;
import e.j.b.i.d;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class b extends e.j.b.a {
    public Application a;

    @Override // e.j.b.a
    public void b(Application application, boolean z) {
        this.a = application;
    }

    @Override // e.j.b.a
    public boolean c(Application application) {
        try {
            Class.forName("com.flurry.android.FlurryAgent");
            return true;
        } catch (ClassNotFoundException unused) {
            n.a.a.b("FlurryPlatform").g("FlurryAnalytics not found!", new Object[0]);
            return false;
        }
    }

    @Override // e.j.b.a
    public void d(d dVar) {
        FlurryAgent.onEndSession(this.a);
    }

    @Override // e.j.b.a
    public void e(d dVar) {
        FlurryAgent.onStartSession(this.a);
    }

    @Override // e.j.b.a
    public void f(String str) {
        FlurryAgent.setUserId(str);
    }

    @Override // e.j.b.a
    public void g(String str, String str2) {
    }

    @Override // e.j.b.a
    public void h(String str, Bundle bundle) {
        a(bundle, 100);
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            hashMap.put(str2, String.valueOf(bundle.get(str2)));
        }
        FlurryAgent.logEvent(str, hashMap);
    }
}
