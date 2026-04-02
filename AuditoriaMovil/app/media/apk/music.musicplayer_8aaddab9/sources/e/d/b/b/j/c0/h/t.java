package e.d.b.b.j.c0.h;

import com.google.auto.value.AutoValue;
import e.d.b.b.j.c0.h.r;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
@AutoValue
/* loaded from: classes.dex */
public abstract class t {

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: e.d.b.b.j.c0.h.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0135a {
            public abstract a a();

            public abstract AbstractC0135a b(long j2);

            public abstract AbstractC0135a c(long j2);
        }

        public static AbstractC0135a a() {
            r.b bVar = new r.b();
            Set<b> emptySet = Collections.emptySet();
            Objects.requireNonNull(emptySet, "Null flags");
            bVar.f6181c = emptySet;
            return bVar;
        }

        public abstract long b();

        public abstract Set<b> c();

        public abstract long d();
    }

    /* loaded from: classes.dex */
    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract e.d.b.b.j.e0.a a();

    public long b(e.d.b.b.d dVar, long j2, int i2) {
        long a2 = j2 - a().a();
        a aVar = c().get(dVar);
        long b2 = aVar.b();
        int i3 = i2 - 1;
        double max = Math.max(1.0d, Math.log(10000.0d) / Math.log((b2 > 1 ? b2 : 2L) * i3));
        double pow = Math.pow(3.0d, i3);
        double d2 = b2;
        Double.isNaN(d2);
        Double.isNaN(d2);
        return Math.min(Math.max((long) (pow * d2 * max), a2), aVar.d());
    }

    public abstract Map<e.d.b.b.d, a> c();
}
