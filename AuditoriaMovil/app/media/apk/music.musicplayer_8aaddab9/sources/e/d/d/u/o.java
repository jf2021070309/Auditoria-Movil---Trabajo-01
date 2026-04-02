package e.d.d.u;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class o {
    public static final long a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f7590b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: c  reason: collision with root package name */
    public static o f7591c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.d.u.s.a f7592d;

    public o(e.d.d.u.s.a aVar) {
        this.f7592d = aVar;
    }

    public static o c() {
        if (e.d.d.u.s.a.a == null) {
            e.d.d.u.s.a.a = new e.d.d.u.s.a();
        }
        e.d.d.u.s.a aVar = e.d.d.u.s.a.a;
        if (f7591c == null) {
            f7591c = new o(aVar);
        }
        return f7591c;
    }

    public long a() {
        Objects.requireNonNull(this.f7592d);
        return System.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public boolean d(e.d.d.u.q.d dVar) {
        if (TextUtils.isEmpty(dVar.a())) {
            return true;
        }
        return dVar.b() + dVar.g() < b() + a;
    }
}
