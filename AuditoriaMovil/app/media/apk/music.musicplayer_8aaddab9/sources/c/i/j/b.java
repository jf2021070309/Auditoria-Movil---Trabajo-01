package c.i.j;

import java.util.Objects;
/* loaded from: classes.dex */
public class b<F, S> {
    public final F a;

    /* renamed from: b  reason: collision with root package name */
    public final S f2126b;

    public b(F f2, S s) {
        this.a = f2;
        this.f2126b = s;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Objects.equals(bVar.a, this.a) && Objects.equals(bVar.f2126b, this.f2126b);
        }
        return false;
    }

    public int hashCode() {
        F f2 = this.a;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f2126b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Pair{");
        y.append(this.a);
        y.append(" ");
        y.append(this.f2126b);
        y.append("}");
        return y.toString();
    }
}
