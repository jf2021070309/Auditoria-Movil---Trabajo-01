package e.d.b.b.j;

import java.util.Set;
/* loaded from: classes.dex */
public final class s implements e.d.b.b.g {
    public final Set<e.d.b.b.b> a;

    /* renamed from: b  reason: collision with root package name */
    public final r f6281b;

    /* renamed from: c  reason: collision with root package name */
    public final u f6282c;

    public s(Set<e.d.b.b.b> set, r rVar, u uVar) {
        this.a = set;
        this.f6281b = rVar;
        this.f6282c = uVar;
    }

    @Override // e.d.b.b.g
    public <T> e.d.b.b.f<T> a(String str, Class<T> cls, e.d.b.b.b bVar, e.d.b.b.e<T, byte[]> eVar) {
        if (this.a.contains(bVar)) {
            return new t(this.f6281b, str, bVar, eVar, this.f6282c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.a));
    }
}
