package e.d.b.e.a.b;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class c {
    public final Map<String, Object> a = new HashMap();

    public final synchronized boolean a() {
        Object obj = this.a.get("usingExtractorStream");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }
}
