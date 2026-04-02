package e.d.d.m;

import e.d.d.m.j.j.z;
import java.util.Objects;
/* loaded from: classes.dex */
public class i {
    public final z a;

    public i(z zVar) {
        this.a = zVar;
    }

    public static i a() {
        e.d.d.g b2 = e.d.d.g.b();
        b2.a();
        i iVar = (i) b2.f7043g.a(i.class);
        Objects.requireNonNull(iVar, "FirebaseCrashlytics component is not present.");
        return iVar;
    }

    public void b(Throwable th) {
        if (th == null) {
            e.d.d.m.j.f.a.d("A null value was passed to recordException. Ignoring.");
        } else {
            this.a.f(th);
        }
    }
}
