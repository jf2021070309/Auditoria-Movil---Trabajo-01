package e.d.d.l;
/* loaded from: classes2.dex */
public class v {
    public final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7127b;

    public v(Class cls, boolean z, t tVar) {
        this.a = cls;
        this.f7127b = z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            return vVar.a.equals(this.a) && vVar.f7127b == this.f7127b;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f7127b).hashCode();
    }
}
