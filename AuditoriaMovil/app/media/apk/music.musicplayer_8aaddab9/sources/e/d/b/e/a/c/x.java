package e.d.b.e.a.c;

import java.lang.ref.Reference;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
/* loaded from: classes2.dex */
public final class x extends u {
    public final w a = new w();

    @Override // e.d.b.e.a.c.u
    public final void a(Throwable th, Throwable th2) {
        List<Throwable> putIfAbsent;
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        w wVar = this.a;
        while (true) {
            Reference<? extends Throwable> poll = wVar.f7013b.poll();
            if (poll == null) {
                break;
            }
            wVar.a.remove(poll);
        }
        List<Throwable> list = wVar.a.get(new v(th, null));
        if (list == null && (putIfAbsent = wVar.a.putIfAbsent(new v(th, wVar.f7013b), (list = new Vector<>(2)))) != null) {
            list = putIfAbsent;
        }
        list.add(th2);
    }
}
