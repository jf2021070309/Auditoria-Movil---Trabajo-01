package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
final class d {
    private static final List<d> d = new ArrayList();
    Object a;
    h b;
    d c;

    private d(Object obj, h hVar) {
        this.a = obj;
        this.b = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(h hVar, Object obj) {
        synchronized (d) {
            int size = d.size();
            if (size > 0) {
                d remove = d.remove(size - 1);
                remove.a = obj;
                remove.b = hVar;
                remove.c = null;
                return remove;
            }
            return new d(obj, hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(d dVar) {
        dVar.a = null;
        dVar.b = null;
        dVar.c = null;
        synchronized (d) {
            if (d.size() < 10000) {
                d.add(dVar);
            }
        }
    }
}
