package l.c.a.u;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public abstract class g {
    public static final AtomicReference<g> a = new AtomicReference<>();

    /* loaded from: classes2.dex */
    public static class a {
        public static final g a;

        static {
            AtomicReference<g> atomicReference = g.a;
            atomicReference.compareAndSet(null, new k());
            a = atomicReference.get();
        }
    }

    public abstract String a(l.c.a.w.i iVar, long j2, l lVar, Locale locale);
}
