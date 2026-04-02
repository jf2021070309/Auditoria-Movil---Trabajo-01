package e.g.a.a;

import c.u.b.l;
import e.g.a.a.l;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class i extends l.b {
    public final /* synthetic */ List a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f7985b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f7986c;

    public i(j jVar, List list, List list2) {
        this.f7986c = jVar;
        this.a = list;
        this.f7985b = list2;
    }

    @Override // c.u.b.l.b
    public boolean a(int i2, int i3) {
        Object obj = this.a.get(i2);
        Object obj2 = this.f7985b.get(i3);
        if (obj != null && obj2 != null) {
            Objects.requireNonNull((l.a) this.f7986c.f7988c);
            return ((e.g.a.c.f) obj).equals((e.g.a.c.f) obj2);
        } else if (obj == null && obj2 == null) {
            return true;
        } else {
            throw new AssertionError();
        }
    }

    @Override // c.u.b.l.b
    public boolean b(int i2, int i3) {
        Object obj = this.a.get(i2);
        Object obj2 = this.f7985b.get(i3);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        Objects.requireNonNull((l.a) this.f7986c.f7988c);
        return ((e.g.a.c.f) obj).equals((e.g.a.c.f) obj2);
    }

    @Override // c.u.b.l.b
    public Object c(int i2, int i3) {
        Object obj = this.a.get(i2);
        Object obj2 = this.f7985b.get(i3);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        Objects.requireNonNull(this.f7986c.f7988c);
        return null;
    }

    @Override // c.u.b.l.b
    public int d() {
        return this.f7985b.size();
    }

    @Override // c.u.b.l.b
    public int e() {
        return this.a.size();
    }
}
