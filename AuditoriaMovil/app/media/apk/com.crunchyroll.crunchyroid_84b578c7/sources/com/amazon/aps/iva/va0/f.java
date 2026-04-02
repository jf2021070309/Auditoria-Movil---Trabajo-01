package com.amazon.aps.iva.va0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Uri.kt */
/* loaded from: classes4.dex */
public final class f {
    public static final URI a;

    /* compiled from: Uri.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oe0.c, String> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(com.amazon.aps.iva.oe0.c cVar) {
            com.amazon.aps.iva.oe0.c cVar2 = cVar;
            j.g(cVar2, "r");
            char charAt = cVar2.getValue().charAt(0);
            x.x(16);
            String num = Integer.toString(charAt, 16);
            j.b(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            return "%".concat(num);
        }
    }

    static {
        URI create = URI.create("");
        if (create != null) {
            a = create;
        } else {
            j.l();
            throw null;
        }
    }

    public static final String a(String str) {
        j.g(str, "s");
        Pattern compile = Pattern.compile("[\\\\|#<>\\^%\\[\\]{}\" ]");
        j.e(compile, "compile(pattern)");
        a aVar = a.h;
        j.f(aVar, "transform");
        Matcher matcher = compile.matcher(str);
        j.e(matcher, "nativePattern.matcher(input)");
        int i = 0;
        com.amazon.aps.iva.oe0.e h = com.amazon.aps.iva.a60.b.h(matcher, 0, str);
        if (h == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, Integer.valueOf(h.a().b).intValue());
            sb.append((CharSequence) aVar.invoke(h));
            i = Integer.valueOf(h.a().c).intValue() + 1;
            h = h.b();
            if (i >= length) {
                break;
            }
        } while (h != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        String sb2 = sb.toString();
        j.e(sb2, "sb.toString()");
        return sb2;
    }

    public static final boolean b(URI uri) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        j.g(uri, "receiver$0");
        String rawAuthority = uri.getRawAuthority();
        if (rawAuthority != null && rawAuthority.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String rawPath = uri.getRawPath();
            if (rawPath != null && rawPath.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                String rawQuery = uri.getRawQuery();
                if (rawQuery != null && rawQuery.length() != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    String rawSchemeSpecificPart = uri.getRawSchemeSpecificPart();
                    if (rawSchemeSpecificPart != null && rawSchemeSpecificPart.length() != 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        String rawUserInfo = uri.getRawUserInfo();
                        if (rawUserInfo != null && rawUserInfo.length() != 0) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final boolean c(URI uri) {
        j.g(uri, "receiver$0");
        if (uri.getFragment() != null) {
            return true;
        }
        return false;
    }

    public static final URI d(URI uri, String str, boolean z) {
        String sb;
        j.g(uri, "receiver$0");
        j.g(str, "fragment");
        if (c(uri)) {
            sb = uri.toString();
            j.b(sb, "this.toString()");
            if (z) {
                str = a(str);
            }
            j.f(str, "replacement");
            int q0 = q.q0(sb, '#', 0, false, 6);
            if (q0 != -1) {
                sb = q.A0(sb, q0 + 1, sb.length(), str).toString();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri);
            sb2.append('#');
            if (z) {
                str = a(str);
            }
            sb2.append(str);
            sb = sb2.toString();
        }
        URI create = URI.create(sb);
        if (create != null) {
            return create;
        }
        j.l();
        throw null;
    }

    public static final URI e(URI uri, URI uri2) {
        j.g(uri, "receiver$0");
        j.g(uri2, "relative");
        String uri3 = uri2.toString();
        j.b(uri3, "relative.toString()");
        if (m.h0(uri3, "#", false)) {
            String substring = uri3.substring(1);
            j.b(substring, "(this as java.lang.String).substring(startIndex)");
            return d(uri, substring, false);
        }
        URI resolve = uri.resolve(uri2);
        if (resolve != null) {
            return resolve;
        }
        j.l();
        throw null;
    }

    public static final URI f(URI uri) {
        j.g(uri, "receiver$0");
        String uri2 = uri.toString();
        j.b(uri2, "it");
        String concat = uri2.concat("#");
        j.f(concat, "missingDelimiterValue");
        int t0 = q.t0(uri2, '#', 0, 6);
        if (t0 != -1) {
            concat = q.A0(uri2, t0 + 1, uri2.length(), "").toString();
        }
        return new URI(concat);
    }
}
