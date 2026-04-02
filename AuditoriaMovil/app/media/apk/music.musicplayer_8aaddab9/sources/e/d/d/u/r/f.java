package e.d.d.u.r;

import com.google.auto.value.AutoValue;
import e.d.d.u.r.b;
@AutoValue
/* loaded from: classes2.dex */
public abstract class f {

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract f a();

        public abstract a b(long j2);
    }

    /* loaded from: classes2.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        b.C0166b c0166b = new b.C0166b();
        c0166b.b(0L);
        return c0166b;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
