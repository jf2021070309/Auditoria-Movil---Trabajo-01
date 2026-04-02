package e.c.a.s;
/* loaded from: classes.dex */
public class i {
    public Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f6029b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f6030c;

    public i() {
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.f6029b = cls2;
        this.f6030c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.f6029b.equals(iVar.f6029b) && j.b(this.f6030c, iVar.f6030c);
    }

    public int hashCode() {
        int hashCode = (this.f6029b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class<?> cls = this.f6030c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MultiClassKey{first=");
        y.append(this.a);
        y.append(", second=");
        y.append(this.f6029b);
        y.append('}');
        return y.toString();
    }
}
