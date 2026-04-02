package e.d.d.y.r;

import android.content.SharedPreferences;
import java.util.Date;
/* loaded from: classes2.dex */
public class n {
    public static final Date a = new Date(-1);

    /* renamed from: b  reason: collision with root package name */
    public static final Date f7795b = new Date(-1);

    /* renamed from: c  reason: collision with root package name */
    public final SharedPreferences f7796c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f7797d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final Object f7798e = new Object();

    /* loaded from: classes2.dex */
    public static class a {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public Date f7799b;

        public a(int i2, Date date) {
            this.a = i2;
            this.f7799b = date;
        }
    }

    public n(SharedPreferences sharedPreferences) {
        this.f7796c = sharedPreferences;
    }

    public a a() {
        a aVar;
        synchronized (this.f7798e) {
            aVar = new a(this.f7796c.getInt("num_failed_fetches", 0), new Date(this.f7796c.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public void b(int i2, Date date) {
        synchronized (this.f7798e) {
            this.f7796c.edit().putInt("num_failed_fetches", i2).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
