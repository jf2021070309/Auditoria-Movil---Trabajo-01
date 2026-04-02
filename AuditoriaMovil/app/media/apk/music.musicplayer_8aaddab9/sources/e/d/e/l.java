package e.d.e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class l extends o implements Iterable<o> {
    public final List<o> a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<o> iterator() {
        return this.a.iterator();
    }
}
