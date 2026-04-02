package j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class r {
    public final String[] a;

    /* loaded from: classes2.dex */
    public static final class a {
        public final List<String> a = new ArrayList(20);

        public a a(String str, String str2) {
            r.a(str);
            r.b(str2, str);
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public a b(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public a c(String str) {
            int i2 = 0;
            while (i2 < this.a.size()) {
                if (str.equalsIgnoreCase(this.a.get(i2))) {
                    this.a.remove(i2);
                    this.a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }
    }

    public r(a aVar) {
        List<String> list = aVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    public r(String[] strArr) {
        this.a = strArr;
    }

    public static void a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(j.i0.c.m("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
            }
        }
    }

    public static void b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(e.a.d.a.a.l("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new IllegalArgumentException(j.i0.c.m("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str2, str));
            }
        }
    }

    public static r f(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            for (int i2 = 0; i2 < strArr2.length; i2++) {
                if (strArr2[i2] == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i2] = strArr2[i2].trim();
            }
            for (int i3 = 0; i3 < strArr2.length; i3 += 2) {
                String str = strArr2[i3];
                String str2 = strArr2[i3 + 1];
                a(str);
                b(str2, str);
            }
            return new r(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    @Nullable
    public String c(String str) {
        String[] strArr = this.a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public String d(int i2) {
        return this.a[i2 * 2];
    }

    public a e() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof r) && Arrays.equals(((r) obj).a, this.a);
    }

    public int g() {
        return this.a.length / 2;
    }

    public String h(int i2) {
        return this.a[(i2 * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int g2 = g();
        for (int i2 = 0; i2 < g2; i2++) {
            sb.append(d(i2));
            sb.append(": ");
            sb.append(h(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}
