package h.o.c;

import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class b implements h.r.a, Serializable {
    public transient h.r.a a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8936b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f8937c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8938d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8939e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8940f;

    /* loaded from: classes2.dex */
    public static class a implements Serializable {
        public static final a a = new a();
    }

    public b() {
        this.f8936b = a.a;
        this.f8937c = null;
        this.f8938d = null;
        this.f8939e = null;
        this.f8940f = false;
    }

    public b(Object obj, Class cls, String str, String str2, boolean z) {
        this.f8936b = obj;
        this.f8937c = cls;
        this.f8938d = str;
        this.f8939e = str2;
        this.f8940f = z;
    }

    public h.r.a b() {
        h.r.a aVar = this.a;
        if (aVar == null) {
            h.r.a t = t();
            this.a = t;
            return t;
        }
        return aVar;
    }

    public abstract h.r.a t();

    public h.r.c u() {
        h.r.c dVar;
        Class cls = this.f8937c;
        if (cls == null) {
            return null;
        }
        if (this.f8940f) {
            Objects.requireNonNull(r.a);
            dVar = new l(cls, "");
        } else {
            Objects.requireNonNull(r.a);
            dVar = new d(cls);
        }
        return dVar;
    }
}
