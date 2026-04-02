package e.d.d.x;

import java.util.Objects;
import javax.annotation.Nonnull;
/* loaded from: classes.dex */
public final class c extends f {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7734b;

    public c(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f7734b = str2;
    }

    @Override // e.d.d.x.f
    @Nonnull
    public String a() {
        return this.a;
    }

    @Override // e.d.d.x.f
    @Nonnull
    public String b() {
        return this.f7734b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.a.equals(fVar.a()) && this.f7734b.equals(fVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f7734b.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("LibraryVersion{libraryName=");
        y.append(this.a);
        y.append(", version=");
        return e.a.d.a.a.r(y, this.f7734b, "}");
    }
}
