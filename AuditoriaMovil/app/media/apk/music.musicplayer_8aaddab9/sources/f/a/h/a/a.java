package f.a.h.a;

import e.j.d.w;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class a extends AtomicReference<f.a.g.a> implements f.a.e.b {
    public a(f.a.g.a aVar) {
        super(aVar);
    }

    @Override // f.a.e.b
    public void dispose() {
        f.a.g.a andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e2) {
            w.D0(e2);
            w.e0(e2);
        }
    }
}
