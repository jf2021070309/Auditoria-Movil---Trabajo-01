package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import com.amazon.aps.iva.lb0.z;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ProcessLifecycleInitializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lcom/amazon/aps/iva/w8/b;", "Lcom/amazon/aps/iva/i5/o;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements com.amazon.aps.iva.w8.b<com.amazon.aps.iva.i5.o> {
    @Override // com.amazon.aps.iva.w8.b
    public final com.amazon.aps.iva.i5.o a(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.w8.a c = com.amazon.aps.iva.w8.a.c(context);
        com.amazon.aps.iva.yb0.j.e(c, "getInstance(context)");
        if (c.b.contains(ProcessLifecycleInitializer.class)) {
            if (!i.a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                com.amazon.aps.iva.yb0.j.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new i.a());
            }
            m mVar = m.j;
            mVar.getClass();
            mVar.f = new Handler();
            mVar.g.c(g.a.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            com.amazon.aps.iva.yb0.j.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new n(mVar));
            return mVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }

    @Override // com.amazon.aps.iva.w8.b
    public final List<Class<? extends com.amazon.aps.iva.w8.b<?>>> dependencies() {
        return z.b;
    }
}
