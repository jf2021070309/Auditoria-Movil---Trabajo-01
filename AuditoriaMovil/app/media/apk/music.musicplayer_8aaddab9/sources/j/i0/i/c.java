package j.i0.i;
/* loaded from: classes2.dex */
public final class c {
    public static final k.h a = k.h.h(":");

    /* renamed from: b  reason: collision with root package name */
    public static final k.h f9363b = k.h.h(":status");

    /* renamed from: c  reason: collision with root package name */
    public static final k.h f9364c = k.h.h(":method");

    /* renamed from: d  reason: collision with root package name */
    public static final k.h f9365d = k.h.h(":path");

    /* renamed from: e  reason: collision with root package name */
    public static final k.h f9366e = k.h.h(":scheme");

    /* renamed from: f  reason: collision with root package name */
    public static final k.h f9367f = k.h.h(":authority");

    /* renamed from: g  reason: collision with root package name */
    public final k.h f9368g;

    /* renamed from: h  reason: collision with root package name */
    public final k.h f9369h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9370i;

    public c(String str, String str2) {
        this(k.h.h(str), k.h.h(str2));
    }

    public c(k.h hVar, String str) {
        this(hVar, k.h.h(str));
    }

    public c(k.h hVar, k.h hVar2) {
        this.f9368g = hVar;
        this.f9369h = hVar2;
        this.f9370i = hVar.i() + 32 + hVar2.i();
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f9368g.equals(cVar.f9368g) && this.f9369h.equals(cVar.f9369h);
        }
        return false;
    }

    public int hashCode() {
        return this.f9369h.hashCode() + ((this.f9368g.hashCode() + 527) * 31);
    }

    public String toString() {
        return j.i0.c.m("%s: %s", this.f9368g.K(), this.f9369h.K());
    }
}
