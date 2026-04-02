package c.i.g;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes.dex */
public final class d implements e {
    public static final Locale[] a = new Locale[0];

    /* renamed from: b  reason: collision with root package name */
    public final Locale[] f2075b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i2 = c.a;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length != 1) {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        } else {
            new Locale(split[0]);
        }
    }

    public d(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f2075b = a;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < localeArr.length; i2++) {
            Locale locale = localeArr[i2];
            if (locale == null) {
                throw new NullPointerException(e.a.d.a.a.f("list[", i2, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                locale2.getLanguage();
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    locale2.getCountry();
                }
                int length = localeArr.length;
                hashSet.add(locale2);
            }
        }
        this.f2075b = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
    }

    @Override // c.i.g.e
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        Locale[] localeArr = ((d) obj).f2075b;
        if (this.f2075b.length != localeArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Locale[] localeArr2 = this.f2075b;
            if (i2 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
            i2++;
        }
    }

    @Override // c.i.g.e
    public Locale get(int i2) {
        if (i2 >= 0) {
            Locale[] localeArr = this.f2075b;
            if (i2 < localeArr.length) {
                return localeArr[i2];
            }
        }
        return null;
    }

    public int hashCode() {
        int i2 = 1;
        int i3 = 0;
        while (true) {
            Locale[] localeArr = this.f2075b;
            if (i3 >= localeArr.length) {
                return i2;
            }
            i2 = (i2 * 31) + localeArr[i3].hashCode();
            i3++;
        }
    }

    @Override // c.i.g.e
    public int size() {
        return this.f2075b.length;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f2075b;
            if (i2 >= localeArr.length) {
                y.append("]");
                return y.toString();
            }
            y.append(localeArr[i2]);
            if (i2 < this.f2075b.length - 1) {
                y.append(CoreConstants.COMMA_CHAR);
            }
            i2++;
        }
    }
}
