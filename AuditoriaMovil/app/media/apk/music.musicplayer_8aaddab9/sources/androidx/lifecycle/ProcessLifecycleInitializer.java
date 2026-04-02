package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import c.p.b0;
import c.p.m;
import c.p.p;
import c.y.a;
import c.y.b;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements b<p> {
    @Override // c.y.b
    public List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // c.y.b
    public p b(Context context) {
        if (a.c(context).f2848d.contains(ProcessLifecycleInitializer.class)) {
            if (!m.a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new m.a());
            }
            b0 b0Var = b0.a;
            b0Var.c(context);
            return b0Var;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
