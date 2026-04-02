package e.d.b.d.m;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public class w {
    public static AtomicReference<v> a = new AtomicReference<>();

    public static long a(long j2) {
        Calendar e2 = e();
        e2.setTimeInMillis(j2);
        return b(e2).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar f2 = f(calendar);
        Calendar e2 = e();
        e2.set(f2.get(1), f2.get(2), f2.get(5));
        return e2;
    }

    public static TimeZone c() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        v vVar = a.get();
        if (vVar == null) {
            vVar = v.a;
        }
        TimeZone timeZone = vVar.f6465c;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = vVar.f6464b;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(c());
        return calendar;
    }

    public static Calendar e() {
        return f(null);
    }

    public static Calendar f(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(c());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
