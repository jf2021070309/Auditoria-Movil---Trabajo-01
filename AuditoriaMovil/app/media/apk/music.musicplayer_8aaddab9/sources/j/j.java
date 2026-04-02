package j;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class j {
    public static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f9512b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f9513c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f9514d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: e  reason: collision with root package name */
    public final String f9515e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9516f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9517g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9518h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9519i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f9520j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9521k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f9522l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f9523m;

    public j(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f9515e = str;
        this.f9516f = str2;
        this.f9517g = j2;
        this.f9518h = str3;
        this.f9519i = str4;
        this.f9520j = z;
        this.f9521k = z2;
        this.f9523m = z3;
        this.f9522l = z4;
    }

    public static int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static long b(String str, int i2, int i3) {
        int a2 = a(str, i2, i3, false);
        Matcher matcher = f9514d.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a2 < i3) {
            int a3 = a(str, a2 + 1, i3, true);
            matcher.region(a2, a3);
            if (i5 == -1 && matcher.usePattern(f9514d).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
                i8 = Integer.parseInt(matcher.group(2));
                i9 = Integer.parseInt(matcher.group(3));
            } else if (i6 == -1 && matcher.usePattern(f9513c).matches()) {
                i6 = Integer.parseInt(matcher.group(1));
            } else {
                if (i7 == -1) {
                    Pattern pattern = f9512b;
                    if (matcher.usePattern(pattern).matches()) {
                        i7 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(a).matches()) {
                    i4 = Integer.parseInt(matcher.group(1));
                }
            }
            a2 = a(str, a3 + 1, i3, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 >= 1601) {
            if (i7 != -1) {
                if (i6 < 1 || i6 > 31) {
                    throw new IllegalArgumentException();
                }
                if (i5 < 0 || i5 > 23) {
                    throw new IllegalArgumentException();
                }
                if (i8 < 0 || i8 > 59) {
                    throw new IllegalArgumentException();
                }
                if (i9 < 0 || i9 > 59) {
                    throw new IllegalArgumentException();
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(j.i0.c.f9281n);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i4);
                gregorianCalendar.set(2, i7 - 1);
                gregorianCalendar.set(5, i6);
                gregorianCalendar.set(11, i5);
                gregorianCalendar.set(12, i8);
                gregorianCalendar.set(13, i9);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            return jVar.f9515e.equals(this.f9515e) && jVar.f9516f.equals(this.f9516f) && jVar.f9518h.equals(this.f9518h) && jVar.f9519i.equals(this.f9519i) && jVar.f9517g == this.f9517g && jVar.f9520j == this.f9520j && jVar.f9521k == this.f9521k && jVar.f9522l == this.f9522l && jVar.f9523m == this.f9523m;
        }
        return false;
    }

    public int hashCode() {
        int x = e.a.d.a.a.x(this.f9519i, e.a.d.a.a.x(this.f9518h, e.a.d.a.a.x(this.f9516f, e.a.d.a.a.x(this.f9515e, 527, 31), 31), 31), 31);
        long j2 = this.f9517g;
        return ((((((((x + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f9520j ? 1 : 0)) * 31) + (!this.f9521k ? 1 : 0)) * 31) + (!this.f9522l ? 1 : 0)) * 31) + (!this.f9523m ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9515e);
        sb.append('=');
        sb.append(this.f9516f);
        if (this.f9522l) {
            if (this.f9517g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(j.i0.g.d.a.get().format(new Date(this.f9517g)));
            }
        }
        if (!this.f9523m) {
            sb.append("; domain=");
            sb.append(this.f9518h);
        }
        sb.append("; path=");
        sb.append(this.f9519i);
        if (this.f9520j) {
            sb.append("; secure");
        }
        if (this.f9521k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
