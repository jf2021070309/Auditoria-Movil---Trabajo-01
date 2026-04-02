package e.j.b.j;

import android.app.Application;
import android.os.Bundle;
import e.j.b.i.d;
import n.a.a;
/* loaded from: classes2.dex */
public class c extends e.j.b.a {
    @Override // e.j.b.a
    public void b(Application application, boolean z) {
        n.a.a.b("TestLogPlatform").g("Initialized", new Object[0]);
    }

    @Override // e.j.b.a
    public boolean c(Application application) {
        return true;
    }

    @Override // e.j.b.a
    public void d(d dVar) {
        n.a.a.b("TestLogPlatform").a("Session finish: %s", dVar.f8522b);
    }

    @Override // e.j.b.a
    public void e(d dVar) {
        n.a.a.b("TestLogPlatform").a("Session start: %s", dVar.f8522b);
    }

    @Override // e.j.b.a
    public void f(String str) {
        n.a.a.b("TestLogPlatform").a("Set user id: %s", str);
    }

    @Override // e.j.b.a
    public void g(String str, String str2) {
        a.c b2 = n.a.a.b("TestLogPlatform");
        b2.a("Set user property: " + str + "=" + str2, new Object[0]);
    }

    @Override // e.j.b.a
    public void h(String str, Bundle bundle) {
        a.c b2 = n.a.a.b("TestLogPlatform");
        StringBuilder B = e.a.d.a.a.B("Event: ", str, " Params: ");
        B.append(bundle.toString());
        b2.a(B.toString(), new Object[0]);
    }
}
