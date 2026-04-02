package c.p;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class g0 {
    public final Map<String, Object> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f2460b = false;

    public void a() {
    }

    public <T> T b(String str, T t) {
        Object obj;
        synchronized (this.a) {
            obj = this.a.get(str);
            if (obj == null) {
                this.a.put(str, t);
            }
        }
        if (obj != null) {
            t = obj;
        }
        if (this.f2460b && (t instanceof Closeable)) {
            try {
                ((Closeable) t).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return t;
    }
}
