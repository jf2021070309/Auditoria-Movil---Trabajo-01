package e.h.g;

import java.util.HashMap;
import java.util.Locale;
/* loaded from: classes.dex */
public class n0<E> extends HashMap<String, E> {
    public final HashMap<String, E> a = new HashMap<>(100);

    public boolean a(String str) {
        if (str != null) {
            boolean containsKey = this.a.containsKey(str);
            return !containsKey ? super.containsKey(str.toLowerCase(Locale.US)) : containsKey;
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: b */
    public E put(String str, E e2) {
        if (str != null) {
            this.a.put(str, e2);
            return (E) super.put(str.toLowerCase(Locale.US), e2);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        this.a.clear();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public E get(Object obj) {
        String str;
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return null;
        }
        E e2 = this.a.get(str);
        return e2 == null ? (E) super.get(str.toLowerCase(Locale.US)) : e2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public E remove(Object obj) {
        String str;
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return null;
        }
        this.a.remove(str);
        return (E) super.remove(str.toLowerCase(Locale.US));
    }
}
