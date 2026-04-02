package e.d.d.u.q;

import com.google.auto.value.AutoValue;
import e.d.d.u.q.c;
import java.util.Objects;
@AutoValue
/* loaded from: classes2.dex */
public abstract class d {
    public static final /* synthetic */ int a = 0;

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract d a();

        public abstract a b(c.a aVar);
    }

    static {
        Long l2 = 0L;
        Objects.requireNonNull(c.a.ATTEMPT_MIGRATION, "Null registrationStatus");
        String str = l2 == null ? " expiresInSecs" : "";
        if (l2 == null) {
            str = e.a.d.a.a.k(str, " tokenCreationEpochInSecs");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }
        l2.longValue();
        l2.longValue();
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract c.a f();

    public abstract long g();

    public boolean h() {
        return f() == c.a.REGISTER_ERROR;
    }

    public boolean i() {
        c.a aVar = ((e.d.d.u.q.a) this).f7594c;
        return aVar == c.a.NOT_GENERATED || aVar == c.a.ATTEMPT_MIGRATION;
    }

    public boolean j() {
        return f() == c.a.REGISTERED;
    }

    public abstract a k();
}
