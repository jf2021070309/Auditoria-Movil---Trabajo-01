package e.j.b.i;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes2.dex */
public class d extends e.j.b.d {
    public Map<String, a> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final String f8522b = UUID.randomUUID().toString();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8523c;

    public d(boolean z) {
        this.f8523c = z;
    }

    @Override // e.j.b.d
    public a a(a aVar) {
        return b(aVar.a, aVar.f8513b);
    }

    @Override // e.j.b.d
    public a b(String str, String str2) {
        return this.a.get(a.a(str, str2));
    }

    @Override // e.j.b.d
    public void e(a aVar) {
        this.a.put(a.a(aVar.a, aVar.f8513b), aVar);
    }
}
