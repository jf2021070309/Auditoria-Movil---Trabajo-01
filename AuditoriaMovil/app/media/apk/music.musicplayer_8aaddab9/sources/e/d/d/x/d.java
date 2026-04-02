package e.d.d.x;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes2.dex */
public class d implements h {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final e f7735b;

    public d(Set<f> set, e eVar) {
        this.a = b(set);
        this.f7735b = eVar;
    }

    public static String b(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // e.d.d.x.h
    public String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        e eVar = this.f7735b;
        synchronized (eVar.f7736b) {
            unmodifiableSet = Collections.unmodifiableSet(eVar.f7736b);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        e eVar2 = this.f7735b;
        synchronized (eVar2.f7736b) {
            unmodifiableSet2 = Collections.unmodifiableSet(eVar2.f7736b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
