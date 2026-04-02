package e.j.d.y.c;

import ch.qos.logback.core.joran.action.Action;
import e.j.d.w;
import h.o.c.j;
import h.t.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public final class a implements e.j.d.y.a {
    public final HashMap<String, String> a = new HashMap<>();

    @Override // e.j.d.y.a
    public Map<String, String> a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.j.d.y.a
    public <T> T b(String str, T t) {
        j.e(str, Action.KEY_ATTRIBUTE);
        Object obj = null;
        obj = null;
        obj = null;
        if (t instanceof String) {
            obj = this.a.get(str);
        } else if (t instanceof Boolean) {
            String str2 = this.a.get(str);
            if (str2 != null) {
                obj = g.t(str2);
            }
        } else if (t instanceof Long) {
            String str3 = this.a.get(str);
            if (str3 != null) {
                obj = g.u(str3);
            }
        } else if (!(t instanceof Double)) {
            throw new IllegalStateException("Unsupported type");
        } else {
            String str4 = this.a.get(str);
            if (str4 != null) {
                obj = w.G0(str4);
            }
        }
        return obj == null ? t : obj;
    }

    @Override // e.j.d.y.a
    public boolean contains(String str) {
        j.e(str, Action.KEY_ATTRIBUTE);
        return this.a.containsKey(str);
    }

    @Override // e.j.d.y.a
    public String name() {
        return "Debug Override";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("Debug Override");
            j.d(sb, "append(value)");
            sb.append('\n');
            j.d(sb, "append('\\n')");
            Set<Map.Entry<String, String>> entrySet = this.a.entrySet();
            j.d(entrySet, "values.entries");
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                j.d(entry, "(key, value)");
                sb.append(((String) entry.getKey()) + " : " + ((String) entry.getValue()));
                j.d(sb, "append(value)");
                sb.append('\n');
                j.d(sb, "append('\\n')");
            }
        }
        String sb2 = sb.toString();
        j.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
