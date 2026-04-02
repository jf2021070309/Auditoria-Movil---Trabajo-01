package c.a.h.d;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import h.o.c.j;
/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: c.a.h.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0011a<T> {
        public final T a;

        public C0011a(T t) {
            this.a = t;
        }
    }

    public abstract Intent a(Context context, I i2);

    public C0011a<O> b(Context context, I i2) {
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return null;
    }

    public abstract O c(int i2, Intent intent);
}
