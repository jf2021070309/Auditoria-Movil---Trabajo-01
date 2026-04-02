package e.d.b.b;

import java.util.Objects;
/* loaded from: classes.dex */
public final class a<T> extends c<T> {
    public final T a;

    /* renamed from: b  reason: collision with root package name */
    public final d f6041b;

    public a(Integer num, T t, d dVar) {
        Objects.requireNonNull(t, "Null payload");
        this.a = t;
        Objects.requireNonNull(dVar, "Null priority");
        this.f6041b = dVar;
    }

    @Override // e.d.b.b.c
    public Integer a() {
        return null;
    }

    @Override // e.d.b.b.c
    public T b() {
        return this.a;
    }

    @Override // e.d.b.b.c
    public d c() {
        return this.f6041b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return cVar.a() == null && this.a.equals(cVar.b()) && this.f6041b.equals(cVar.c());
        }
        return false;
    }

    public int hashCode() {
        return this.f6041b.hashCode() ^ (((-721379959) ^ this.a.hashCode()) * 1000003);
    }

    public String toString() {
        return "Event{code=" + ((Object) null) + ", payload=" + this.a + ", priority=" + this.f6041b + "}";
    }
}
