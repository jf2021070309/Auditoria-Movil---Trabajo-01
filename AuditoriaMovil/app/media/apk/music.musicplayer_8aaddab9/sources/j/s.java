package j;

import ch.qos.logback.core.CoreConstants;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public final class s {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public final String f9536b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9537c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9538d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9539e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9540f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f9541g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f9542h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final String f9543i;

    /* renamed from: j  reason: collision with root package name */
    public final String f9544j;

    /* loaded from: classes.dex */
    public static final class a {
        @Nullable
        public String a;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f9547d;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f9549f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public List<String> f9550g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public String f9551h;

        /* renamed from: b  reason: collision with root package name */
        public String f9545b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f9546c = "";

        /* renamed from: e  reason: collision with root package name */
        public int f9548e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f9549f = arrayList;
            arrayList.add("");
        }

        public s a() {
            if (this.a != null) {
                if (this.f9547d != null) {
                    return new s(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public a b(@Nullable String str) {
            this.f9550g = str != null ? s.p(s.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:115:0x0215
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public j.s.a c(@javax.annotation.Nullable j.s r22, java.lang.String r23) {
            /*
                Method dump skipped, instructions count: 967
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j.s.a.c(j.s, java.lang.String):j.s$a");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f9545b.isEmpty() || !this.f9546c.isEmpty()) {
                sb.append(this.f9545b);
                if (!this.f9546c.isEmpty()) {
                    sb.append(CoreConstants.COLON_CHAR);
                    sb.append(this.f9546c);
                }
                sb.append('@');
            }
            String str2 = this.f9547d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f9547d);
                    sb.append(']');
                } else {
                    sb.append(this.f9547d);
                }
            }
            int i2 = this.f9548e;
            if (i2 != -1 || this.a != null) {
                if (i2 == -1) {
                    i2 = s.d(this.a);
                }
                String str3 = this.a;
                if (str3 == null || i2 != s.d(str3)) {
                    sb.append(CoreConstants.COLON_CHAR);
                    sb.append(i2);
                }
            }
            List<String> list = this.f9549f;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append('/');
                sb.append(list.get(i3));
            }
            if (this.f9550g != null) {
                sb.append('?');
                s.j(sb, this.f9550g);
            }
            if (this.f9551h != null) {
                sb.append('#');
                sb.append(this.f9551h);
            }
            return sb.toString();
        }
    }

    public s(a aVar) {
        this.f9536b = aVar.a;
        this.f9537c = m(aVar.f9545b, false);
        this.f9538d = m(aVar.f9546c, false);
        this.f9539e = aVar.f9547d;
        int i2 = aVar.f9548e;
        this.f9540f = i2 == -1 ? d(aVar.a) : i2;
        this.f9541g = n(aVar.f9549f, false);
        List<String> list = aVar.f9550g;
        this.f9542h = list != null ? n(list, true) : null;
        String str = aVar.f9551h;
        this.f9543i = str != null ? l(str, 0, str.length(), false) : null;
        this.f9544j = aVar.toString();
    }

    public static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            int i5 = -1;
            int i6 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !o(str, i4, i3)))) || (codePointAt == 43 && z3)))) {
                k.d dVar = new k.d();
                dVar.n0(str, i2, i4);
                k.d dVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            dVar.m0(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= i6 && z4) || str2.indexOf(codePointAt2) != i5 || (codePointAt2 == 37 && (!z || (z2 && !o(str, i4, i3)))))) {
                            if (dVar2 == null) {
                                dVar2 = new k.d();
                            }
                            if (charset == null || charset.equals(j.i0.c.f9276i)) {
                                dVar2.o0(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i4;
                                h.o.c.j.e(str, "string");
                                h.o.c.j.e(charset, "charset");
                                if (!(i4 >= 0)) {
                                    throw new IllegalArgumentException(h.o.c.j.i("beginIndex < 0: ", Integer.valueOf(i4)).toString());
                                }
                                if (!(charCount >= i4)) {
                                    throw new IllegalArgumentException(e.a.d.a.a.g("endIndex < beginIndex: ", charCount, " < ", i4).toString());
                                }
                                if (!(charCount <= str.length())) {
                                    StringBuilder z5 = e.a.d.a.a.z("endIndex > string.length: ", charCount, " > ");
                                    z5.append(str.length());
                                    throw new IllegalArgumentException(z5.toString().toString());
                                } else if (h.o.c.j.a(charset, h.t.a.a)) {
                                    dVar2.n0(str, i4, charCount);
                                } else {
                                    String substring = str.substring(i4, charCount);
                                    h.o.c.j.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    byte[] bytes = substring.getBytes(charset);
                                    h.o.c.j.d(bytes, "(this as java.lang.String).getBytes(charset)");
                                    dVar2.f0(bytes, 0, bytes.length);
                                }
                            }
                            while (!dVar2.p()) {
                                int readByte = dVar2.readByte() & 255;
                                dVar.h0(37);
                                char[] cArr = a;
                                dVar.h0(cArr[(readByte >> 4) & 15]);
                                dVar.h0(cArr[readByte & 15]);
                            }
                        } else {
                            dVar.o0(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                    i5 = -1;
                    i6 = 128;
                }
                return dVar.K();
            }
            i4 += Character.charCount(codePointAt);
        }
        return str.substring(i2, i3);
    }

    public static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    public static String c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void j(StringBuilder sb, List<String> list) {
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

    public static String l(String str, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                k.d dVar = new k.d();
                dVar.n0(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i3) {
                        if (codePointAt == 43 && z) {
                            dVar.h0(32);
                        }
                        dVar.o0(codePointAt);
                    } else {
                        int g2 = j.i0.c.g(str.charAt(i5 + 1));
                        int g3 = j.i0.c.g(str.charAt(i4));
                        if (g2 != -1 && g3 != -1) {
                            dVar.h0((g2 << 4) + g3);
                            i5 = i4;
                        }
                        dVar.o0(codePointAt);
                    }
                    i5 += Character.charCount(codePointAt);
                }
                return dVar.K();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    public static String m(String str, boolean z) {
        return l(str, 0, str.length(), z);
    }

    public static boolean o(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && j.i0.c.g(str.charAt(i2 + 1)) != -1 && j.i0.c.g(str.charAt(i4)) != -1;
    }

    public static List<String> p(String str) {
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
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public String e() {
        if (this.f9538d.isEmpty()) {
            return "";
        }
        int indexOf = this.f9544j.indexOf(64);
        return this.f9544j.substring(this.f9544j.indexOf(58, this.f9536b.length() + 3) + 1, indexOf);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof s) && ((s) obj).f9544j.equals(this.f9544j);
    }

    public String f() {
        int indexOf = this.f9544j.indexOf(47, this.f9536b.length() + 3);
        String str = this.f9544j;
        return this.f9544j.substring(indexOf, j.i0.c.j(str, indexOf, str.length(), "?#"));
    }

    public List<String> g() {
        int indexOf = this.f9544j.indexOf(47, this.f9536b.length() + 3);
        String str = this.f9544j;
        int j2 = j.i0.c.j(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < j2) {
            int i2 = indexOf + 1;
            int i3 = j.i0.c.i(this.f9544j, i2, j2, '/');
            arrayList.add(this.f9544j.substring(i2, i3));
            indexOf = i3;
        }
        return arrayList;
    }

    @Nullable
    public String h() {
        if (this.f9542h == null) {
            return null;
        }
        int indexOf = this.f9544j.indexOf(63) + 1;
        String str = this.f9544j;
        return this.f9544j.substring(indexOf, j.i0.c.i(str, indexOf, str.length(), '#'));
    }

    public int hashCode() {
        return this.f9544j.hashCode();
    }

    public String i() {
        if (this.f9537c.isEmpty()) {
            return "";
        }
        int length = this.f9536b.length() + 3;
        String str = this.f9544j;
        return this.f9544j.substring(length, j.i0.c.j(str, length, str.length(), ":@"));
    }

    @Nullable
    public a k(String str) {
        try {
            a aVar = new a();
            aVar.c(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List<String> n(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? l(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public URI q() {
        a aVar = new a();
        aVar.a = this.f9536b;
        aVar.f9545b = i();
        aVar.f9546c = e();
        aVar.f9547d = this.f9539e;
        aVar.f9548e = this.f9540f != d(this.f9536b) ? this.f9540f : -1;
        aVar.f9549f.clear();
        aVar.f9549f.addAll(g());
        aVar.b(h());
        aVar.f9551h = this.f9543i == null ? null : this.f9544j.substring(this.f9544j.indexOf(35) + 1);
        int size = aVar.f9549f.size();
        for (int i2 = 0; i2 < size; i2++) {
            aVar.f9549f.set(i2, b(aVar.f9549f.get(i2), "[]", true, true, false, true));
        }
        List<String> list = aVar.f9550g;
        if (list != null) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str = aVar.f9550g.get(i3);
                if (str != null) {
                    aVar.f9550g.set(i3, b(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = aVar.f9551h;
        if (str2 != null) {
            aVar.f9551h = b(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public String toString() {
        return this.f9544j;
    }
}
