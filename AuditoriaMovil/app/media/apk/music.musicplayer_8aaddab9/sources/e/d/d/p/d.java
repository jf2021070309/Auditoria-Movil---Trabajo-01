package e.d.d.p;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes2.dex */
public final class d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f7541b;

    public d(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.f7541b = map;
    }

    public d(String str, Map map, a aVar) {
        this.a = str;
        this.f7541b = map;
    }

    public static d a(String str) {
        return new d(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.f7541b.equals(dVar.f7541b);
        }
        return false;
    }

    public int hashCode() {
        return this.f7541b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("FieldDescriptor{name=");
        y.append(this.a);
        y.append(", properties=");
        y.append(this.f7541b.values());
        y.append("}");
        return y.toString();
    }
}
