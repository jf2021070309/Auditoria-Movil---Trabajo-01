package c.p;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class m0 {
    public final HashMap<String, g0> a = new HashMap<>();

    public final void a() {
        for (g0 g0Var : this.a.values()) {
            g0Var.f2460b = true;
            Map<String, Object> map = g0Var.a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : g0Var.a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
            }
            g0Var.a();
        }
        this.a.clear();
    }
}
