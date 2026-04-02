package l.c.a;

import e.j.d.w;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class l extends l.c.a.t.e implements Serializable {
    public static final l a = new l(0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f9695b = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    /* renamed from: c  reason: collision with root package name */
    public final int f9696c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9697d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9698e;

    public l(int i2, int i3, int i4) {
        this.f9696c = i2;
        this.f9697d = i3;
        this.f9698e = i4;
    }

    public static l b(CharSequence charSequence) {
        w.k0(charSequence, "text");
        Matcher matcher = f9695b.matcher(charSequence);
        if (matcher.matches()) {
            int i2 = "-".equals(matcher.group(1)) ? -1 : 1;
            String group = matcher.group(2);
            String group2 = matcher.group(3);
            String group3 = matcher.group(4);
            String group4 = matcher.group(5);
            if (group != null || group2 != null || group3 != null || group4 != null) {
                try {
                    int f2 = f(charSequence, group, i2);
                    int f3 = f(charSequence, group2, i2);
                    int m0 = w.m0(f(charSequence, group4, i2), w.o0(f(charSequence, group3, i2), 7));
                    return ((f2 | f3) | m0) == 0 ? a : new l(f2, f3, m0);
                } catch (NumberFormatException e2) {
                    throw ((l.c.a.u.d) new l.c.a.u.d("Text cannot be parsed to a Period", charSequence, 0).initCause(e2));
                }
            }
        }
        throw new l.c.a.u.d("Text cannot be parsed to a Period", charSequence, 0);
    }

    public static int f(CharSequence charSequence, String str, int i2) {
        if (str == null) {
            return 0;
        }
        try {
            return w.o0(Integer.parseInt(str), i2);
        } catch (ArithmeticException e2) {
            throw ((l.c.a.u.d) new l.c.a.u.d("Text cannot be parsed to a Period", charSequence, 0).initCause(e2));
        }
    }

    private Object readResolve() {
        return ((this.f9696c | this.f9697d) | this.f9698e) == 0 ? a : this;
    }

    public l.c.a.w.d a(l.c.a.w.d dVar) {
        w.k0(dVar, "temporal");
        int i2 = this.f9696c;
        if (i2 != 0) {
            int i3 = this.f9697d;
            if (i3 != 0) {
                dVar = ((d) dVar).h((i2 * 12) + i3, l.c.a.w.b.MONTHS);
            } else {
                dVar = ((d) dVar).h(i2, l.c.a.w.b.YEARS);
            }
        } else {
            int i4 = this.f9697d;
            if (i4 != 0) {
                dVar = ((d) dVar).h(i4, l.c.a.w.b.MONTHS);
            }
        }
        int i5 = this.f9698e;
        if (i5 != 0) {
            return ((d) dVar).h(i5, l.c.a.w.b.DAYS);
        }
        return dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f9696c == lVar.f9696c && this.f9697d == lVar.f9697d && this.f9698e == lVar.f9698e;
        }
        return false;
    }

    public int hashCode() {
        return Integer.rotateLeft(this.f9698e, 16) + Integer.rotateLeft(this.f9697d, 8) + this.f9696c;
    }

    public String toString() {
        if (this == a) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i2 = this.f9696c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('Y');
        }
        int i3 = this.f9697d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        int i4 = this.f9698e;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('D');
        }
        return sb.toString();
    }
}
