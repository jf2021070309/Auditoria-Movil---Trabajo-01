package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12;

import android.content.Context;
import java.util.HashMap;
/* loaded from: classes.dex */
public class h {
    private static volatile h a;
    private static HashMap<Integer, f> b;
    private static HashMap<Integer, a> c;

    private h() {
        b = new HashMap<>();
        c = new HashMap<>();
    }

    public static h a() {
        h hVar;
        synchronized (h.class) {
            if (a == null) {
                synchronized (h.class) {
                    if (a == null) {
                        a = new h();
                    }
                }
            }
            hVar = a;
        }
        return hVar;
    }

    public a a(int i, Context context) {
        a aVar = c.get(Integer.valueOf(i));
        if (aVar == null) {
            a aVar2 = new a(context, i);
            c.put(Integer.valueOf(i), aVar2);
            return aVar2;
        }
        return aVar;
    }

    public f a(int i) {
        f fVar = b.get(Integer.valueOf(i));
        if (fVar == null) {
            f fVar2 = new f(i);
            b.put(Integer.valueOf(i), fVar2);
            return fVar2;
        }
        return fVar;
    }
}
