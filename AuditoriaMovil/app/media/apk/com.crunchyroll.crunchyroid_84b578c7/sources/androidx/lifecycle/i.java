package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.o;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: LifecycleDispatcher.kt */
/* loaded from: classes.dex */
public final class i {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.i5.h {
        @Override // com.amazon.aps.iva.i5.h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            int i = o.c;
            o.b.b(activity);
        }
    }
}
