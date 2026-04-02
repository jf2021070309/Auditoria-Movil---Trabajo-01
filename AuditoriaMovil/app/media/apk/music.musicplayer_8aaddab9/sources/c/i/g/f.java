package c.i.g;

import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class f implements e {
    public final LocaleList a;

    public f(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // c.i.g.e
    public Object a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((e) obj).a());
    }

    @Override // c.i.g.e
    public Locale get(int i2) {
        return this.a.get(i2);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // c.i.g.e
    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }
}
