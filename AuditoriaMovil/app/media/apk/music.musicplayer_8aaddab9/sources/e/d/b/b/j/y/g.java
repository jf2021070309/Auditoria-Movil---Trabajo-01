package e.d.b.b.j.y;

import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class g {

    /* loaded from: classes.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static g a() {
        return new b(a.FATAL_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
