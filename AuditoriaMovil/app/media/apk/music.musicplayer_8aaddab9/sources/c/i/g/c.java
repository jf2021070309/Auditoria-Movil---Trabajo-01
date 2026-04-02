package c.i.g;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class c {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public e f2074b;

    static {
        a(new Locale[0]);
    }

    public c(e eVar) {
        this.f2074b = eVar;
    }

    public static c a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new c(new f(new LocaleList(localeArr))) : new c(new d(localeArr));
    }

    public Locale b(int i2) {
        return this.f2074b.get(i2);
    }

    public int c() {
        return this.f2074b.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f2074b.equals(((c) obj).f2074b);
    }

    public int hashCode() {
        return this.f2074b.hashCode();
    }

    public String toString() {
        return this.f2074b.toString();
    }
}
