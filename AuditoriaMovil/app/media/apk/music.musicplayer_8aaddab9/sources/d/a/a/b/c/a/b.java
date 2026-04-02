package d.a.a.b.c.a;

import java.util.List;
/* loaded from: classes.dex */
public class b {
    public static b a = new b(41);

    /* renamed from: b  reason: collision with root package name */
    public static b f4953b = new b(1005, "BARE");

    /* renamed from: c  reason: collision with root package name */
    public static b f4954c = new b(37);

    /* renamed from: d  reason: collision with root package name */
    public final int f4955d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4956e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f4957f;

    public b(int i2) {
        this.f4955d = i2;
        this.f4956e = null;
        this.f4957f = null;
    }

    public b(int i2, String str) {
        this.f4955d = i2;
        this.f4956e = str;
        this.f4957f = null;
    }

    public b(int i2, List<String> list) {
        this.f4955d = i2;
        this.f4956e = null;
        this.f4957f = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f4955d != bVar.f4955d) {
                return false;
            }
            String str = this.f4956e;
            String str2 = bVar.f4956e;
            return str == null ? str2 == null : str.equals(str2);
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.f4955d * 29;
        String str = this.f4956e;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str;
        StringBuilder B;
        String str2;
        int i2 = this.f4955d;
        if (i2 == 37) {
            str = "%";
        } else if (i2 == 41) {
            str = "RIGHT_PARENTHESIS";
        } else if (i2 == 1000) {
            str = "LITERAL";
        } else if (i2 != 1002) {
            switch (i2) {
                case 1004:
                    str = "SIMPLE_KEYWORD";
                    break;
                case 1005:
                    str = "COMPOSITE_KEYWORD";
                    break;
                case 1006:
                    str = "OPTION";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "FormatModifier";
        }
        if (this.f4956e == null) {
            B = e.a.d.a.a.A("Token(", str);
            str2 = ")";
        } else {
            B = e.a.d.a.a.B("Token(", str, ", \"");
            B.append(this.f4956e);
            str2 = "\")";
        }
        B.append(str2);
        return B.toString();
    }
}
