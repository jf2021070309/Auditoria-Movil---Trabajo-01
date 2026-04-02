package e.d.b.b.j.y;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes.dex */
public final class c extends h {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.b.b.j.e0.a f6297b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.b.j.e0.a f6298c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6299d;

    public c(Context context, e.d.b.b.j.e0.a aVar, e.d.b.b.j.e0.a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f6297b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f6298c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f6299d = str;
    }

    @Override // e.d.b.b.j.y.h
    public Context a() {
        return this.a;
    }

    @Override // e.d.b.b.j.y.h
    public String b() {
        return this.f6299d;
    }

    @Override // e.d.b.b.j.y.h
    public e.d.b.b.j.e0.a c() {
        return this.f6298c;
    }

    @Override // e.d.b.b.j.y.h
    public e.d.b.b.j.e0.a d() {
        return this.f6297b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.a.equals(hVar.a()) && this.f6297b.equals(hVar.d()) && this.f6298c.equals(hVar.c()) && this.f6299d.equals(hVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f6297b.hashCode()) * 1000003) ^ this.f6298c.hashCode()) * 1000003) ^ this.f6299d.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("CreationContext{applicationContext=");
        y.append(this.a);
        y.append(", wallClock=");
        y.append(this.f6297b);
        y.append(", monotonicClock=");
        y.append(this.f6298c);
        y.append(", backendName=");
        return e.a.d.a.a.r(y, this.f6299d, "}");
    }
}
