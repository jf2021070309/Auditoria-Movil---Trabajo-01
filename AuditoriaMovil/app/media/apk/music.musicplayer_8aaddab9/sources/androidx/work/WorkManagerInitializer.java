package androidx.work;

import android.content.Context;
import c.c0.c;
import c.c0.d0.l;
import c.c0.r;
import c.c0.z;
import c.y.b;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b<z> {
    public static final String a = r.e("WrkMgrInitializer");

    @Override // c.y.b
    public List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // c.y.b
    public z b(Context context) {
        r.c().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        l.d(context, new c(new c.a()));
        return l.c(context);
    }
}
