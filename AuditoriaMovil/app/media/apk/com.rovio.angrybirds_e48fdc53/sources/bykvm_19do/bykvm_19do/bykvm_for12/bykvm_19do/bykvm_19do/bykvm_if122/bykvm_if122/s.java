package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122;

import com.flurry.android.Constants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class s {
    private static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String a;
    private final String b;
    private final String c;
    final String d;
    final int e;
    private final List<String> f;
    private final String g;
    private final String h;

    /* loaded from: classes.dex */
    public static final class a {
        String a;
        String d;
        final List<String> f;
        List<String> g;
        String h;
        String b = "";
        String c = "";
        int e = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0025a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        private a a(String str, boolean z) {
            int i = 0;
            do {
                int a = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str, i, str.length(), "/\\");
                a(str, i, a, a < str.length(), z);
                i = a + 1;
            } while (i <= str.length());
            return this;
        }

        private static String a(String str, int i, int i2) {
            return bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(s.a(str, i, i2, false));
        }

        private void a(String str, int i, int i2, boolean z, boolean z2) {
            String a = s.a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (g(a)) {
                return;
            }
            if (h(a)) {
                d();
                return;
            }
            List<String> list = this.f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f;
                list2.set(list2.size() - 1, a);
            } else {
                this.f.add(a);
            }
            if (z) {
                this.f.add("");
            }
        }

        private static int b(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(s.a(str, i, i2, "", false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException e) {
                return -1;
            }
        }

        private static int c(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private void d() {
            List<String> list = this.f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f.isEmpty()) {
                this.f.add("");
                return;
            }
            List<String> list2 = this.f;
            list2.set(list2.size() - 1, "");
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0028 -> B:12:0x002a). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void d(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                goto L43
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L2a
            L1e:
                java.util.List<java.lang.String> r0 = r10.f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f
                r0.add(r2)
            L28:
                int r12 = r12 + 1
            L2a:
                r6 = r12
                if (r6 >= r13) goto L43
                java.lang.String r12 = "/\\"
                int r12 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(r11, r6, r13, r12)
                if (r12 >= r13) goto L37
                r0 = r3
                goto L38
            L37:
                r0 = 0
            L38:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L2a
                goto L28
            L43:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.s.a.d(java.lang.String, int, int):void");
        }

        private static int e(String str, int i, int i2) {
            char charAt;
            if (i2 - i >= 2 && (((charAt = str.charAt(i)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int f(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private boolean g(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean h(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        EnumC0025a a(s sVar, String str) {
            int a;
            int i;
            int b = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.b(str, 0, str.length());
            int c = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.c(str, b, str.length());
            if (e(str, b, c) != -1) {
                if (str.regionMatches(true, b, "https:", 0, 6)) {
                    this.a = "https";
                    b += 6;
                } else if (!str.regionMatches(true, b, "http:", 0, 5)) {
                    return EnumC0025a.UNSUPPORTED_SCHEME;
                } else {
                    this.a = "http";
                    b += 5;
                }
            } else if (sVar == null) {
                return EnumC0025a.MISSING_SCHEME;
            } else {
                this.a = sVar.a;
            }
            int f = f(str, b, c);
            char c2 = '?';
            char c3 = '#';
            if (f >= 2 || sVar == null || !sVar.a.equals(this.a)) {
                boolean z = false;
                boolean z2 = false;
                int i2 = b + f;
                while (true) {
                    a = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str, i2, c, "@/\\?#");
                    char charAt = a != c ? str.charAt(a) : (char) 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    } else if (charAt == '@') {
                        if (z) {
                            i = a;
                            this.c += "%40" + s.a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int a2 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str, i2, a, ':');
                            i = a;
                            String a3 = s.a(str, i2, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                a3 = this.b + "%40" + a3;
                            }
                            this.b = a3;
                            if (a2 != i) {
                                this.c = s.a(str, a2 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        }
                        i2 = i + 1;
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int c4 = c(str, i2, a);
                int i3 = c4 + 1;
                this.d = a(str, i2, c4);
                if (i3 < a) {
                    int b2 = b(str, i3, a);
                    this.e = b2;
                    if (b2 == -1) {
                        return EnumC0025a.INVALID_PORT;
                    }
                } else {
                    this.e = s.c(this.a);
                }
                if (this.d == null) {
                    return EnumC0025a.INVALID_HOST;
                }
                b = a;
            } else {
                this.b = sVar.f();
                this.c = sVar.b();
                this.d = sVar.d;
                this.e = sVar.e;
                this.f.clear();
                this.f.addAll(sVar.d());
                if (b == c || str.charAt(b) == '#') {
                    b(sVar.e());
                }
            }
            int a4 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str, b, c, "?#");
            d(str, b, a4);
            if (a4 < c && str.charAt(a4) == '?') {
                int a5 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str, a4, c, '#');
                this.g = s.e(s.a(str, a4 + 1, a5, " \"'<>#", true, false, true, true, null));
                a4 = a5;
            }
            if (a4 < c && str.charAt(a4) == '#') {
                this.h = s.a(str, 1 + a4, c, "", true, false, false, false, null);
            }
            return EnumC0025a.SUCCESS;
        }

        public a a(int i) {
            if (i > 0 && i <= 65535) {
                this.e = i;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i);
        }

        public a a(String str) {
            if (str != null) {
                return a(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public a a(String str, String str2) {
            if (str != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(s.a(str, " \"'<>#&=", true, false, true, true));
                this.g.add(str2 != null ? s.a(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public s a() {
            if (this.a != null) {
                if (this.d != null) {
                    return new s(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        int b() {
            int i = this.e;
            return i != -1 ? i : s.c(this.a);
        }

        public a b(String str) {
            this.g = str != null ? s.e(s.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        a c() {
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                this.f.set(i, s.a(this.f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.g.get(i2);
                    if (str != null) {
                        this.g.set(i2, s.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.h;
            if (str2 != null) {
                this.h = s.a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a c(String str) {
            if (str != null) {
                String a = a(str, 0, str.length());
                if (a != null) {
                    this.d = a;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        public a d(String str) {
            if (str != null) {
                this.c = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public a e(String str) {
            if (str != null) {
                String str2 = "http";
                if (!str.equalsIgnoreCase("http")) {
                    str2 = "https";
                    if (!str.equalsIgnoreCase("https")) {
                        throw new IllegalArgumentException("unexpected scheme: " + str);
                    }
                }
                this.a = str2;
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public a f(String str) {
            if (str != null) {
                this.b = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("://");
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            if (this.d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
            int b = b();
            if (b != s.c(this.a)) {
                sb.append(':');
                sb.append(b);
            }
            s.b(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                s.a(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    s(a aVar) {
        this.a = aVar.a;
        this.b = a(aVar.b, false);
        this.c = a(aVar.c, false);
        this.d = aVar.d;
        this.e = aVar.b();
        a(aVar.f, false);
        List<String> list = aVar.g;
        this.f = list != null ? a(list, true) : null;
        String str = aVar.h;
        this.g = str != null ? a(str, false) : null;
        this.h = aVar.toString();
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || a(str, i4, i3)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c();
            cVar.a(str, i2, i4);
            a(cVar, str, i4, i3, str2, z, z2, z3, z4, charset);
            return cVar.n();
        }
        return str.substring(i2, i3);
    }

    static String a(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c();
                cVar.a(str, i2, i4);
                a(cVar, str, i4, i3, z);
                return cVar.n();
            }
        }
        return str.substring(i2, i3);
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar2 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.a(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !a(str, i2, i3)))))) {
                    if (cVar2 == null) {
                        cVar2 = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c();
                    }
                    if (charset == null || charset.equals(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.i)) {
                        cVar2.c(codePointAt);
                    } else {
                        cVar2.a(str, i2, Character.charCount(codePointAt) + i2, charset);
                    }
                    while (!cVar2.f()) {
                        int readByte = cVar2.readByte() & Constants.UNKNOWN;
                        cVar.writeByte(37);
                        char[] cArr = i;
                        cVar.writeByte((int) cArr[(readByte >> 4) & 15]);
                        cVar.writeByte((int) cArr[readByte & 15]);
                    }
                } else {
                    cVar.c(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    static void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, String str, int i2, int i3, boolean z) {
        int i4;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt != 37 || (i4 = i2 + 2) >= i3) {
                if (codePointAt == 43 && z) {
                    cVar.writeByte(32);
                }
                cVar.c(codePointAt);
            } else {
                int a2 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str.charAt(i2 + 1));
                int a3 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str.charAt(i4));
                if (a2 != -1 && a3 != -1) {
                    cVar.writeByte((a2 << 4) + a3);
                    i2 = i4;
                }
                cVar.c(codePointAt);
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static boolean a(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str.charAt(i2 + 1)) != -1 && bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str.charAt(i4)) != -1;
    }

    static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    public static int c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static s d(String str) {
        a aVar = new a();
        if (aVar.a((s) null, str) == a.EnumC0025a.SUCCESS) {
            return aVar.a();
        }
        return null;
    }

    static List<String> e(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public a a(String str) {
        a aVar = new a();
        if (aVar.a(this, str) == a.EnumC0025a.SUCCESS) {
            return aVar;
        }
        return null;
    }

    public String a() {
        if (this.g == null) {
            return null;
        }
        return this.h.substring(this.h.indexOf(35) + 1);
    }

    public s b(String str) {
        a a2 = a(str);
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }

    public String b() {
        if (this.c.isEmpty()) {
            return "";
        }
        int indexOf = this.h.indexOf(58, this.a.length() + 3);
        return this.h.substring(indexOf + 1, this.h.indexOf(64));
    }

    public String c() {
        int indexOf = this.h.indexOf(47, this.a.length() + 3);
        String str = this.h;
        return this.h.substring(indexOf, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str, indexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int indexOf = this.h.indexOf(47, this.a.length() + 3);
        String str = this.h;
        int a2 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i2 = indexOf + 1;
            int a3 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(this.h, i2, a2, '/');
            arrayList.add(this.h.substring(i2, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public String e() {
        if (this.f == null) {
            return null;
        }
        int indexOf = this.h.indexOf(63) + 1;
        String str = this.h;
        return this.h.substring(indexOf, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str, indexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).h.equals(this.h);
    }

    public String f() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return this.h.substring(length, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.d;
    }

    public boolean h() {
        return this.a.equals("https");
    }

    public int hashCode() {
        return this.h.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = f();
        aVar.c = b();
        aVar.d = this.d;
        aVar.e = this.e != c(this.a) ? this.e : -1;
        aVar.f.clear();
        aVar.f.addAll(d());
        aVar.b(e());
        aVar.h = a();
        return aVar;
    }

    public int j() {
        return this.e;
    }

    public String k() {
        if (this.f == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        a(sb, this.f);
        return sb.toString();
    }

    public String l() {
        return a("/...").f("").d("").a().toString();
    }

    public String m() {
        return this.a;
    }

    public URI n() {
        String aVar = i().c().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception e2) {
                throw new RuntimeException(e);
            }
        }
    }

    public URL o() {
        try {
            return new URL(this.h);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.h;
    }
}
