package com.amazon.aps.iva.g8;

import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.iva.ee0.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: NavDeepLink.kt */
/* loaded from: classes.dex */
public final class u {
    public static final Pattern p = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Pattern q = Pattern.compile("\\{(.+?)\\}");
    public final String a;
    public final String b = null;
    public final String c = null;
    public final ArrayList d;
    public String e;
    public final com.amazon.aps.iva.kb0.m f;
    public final com.amazon.aps.iva.kb0.m g;
    public final com.amazon.aps.iva.kb0.e h;
    public boolean i;
    public final com.amazon.aps.iva.kb0.e j;
    public final com.amazon.aps.iva.kb0.e k;
    public final com.amazon.aps.iva.kb0.e l;
    public final com.amazon.aps.iva.kb0.m m;
    public final com.amazon.aps.iva.kb0.m n;
    public boolean o;

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public String a;
        public final ArrayList b = new ArrayList();
    }

    public u(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = com.amazon.aps.iva.kb0.f.b(new c0(this));
        this.g = com.amazon.aps.iva.kb0.f.b(new a0(this));
        com.amazon.aps.iva.kb0.g gVar = com.amazon.aps.iva.kb0.g.NONE;
        this.h = com.amazon.aps.iva.kb0.f.a(gVar, new d0(this));
        this.j = com.amazon.aps.iva.kb0.f.a(gVar, new w(this));
        this.k = com.amazon.aps.iva.kb0.f.a(gVar, new v(this));
        this.l = com.amazon.aps.iva.kb0.f.a(gVar, new y(this));
        this.m = com.amazon.aps.iva.kb0.f.b(new x(this));
        this.n = com.amazon.aps.iva.kb0.f.b(new b0(this));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!p.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            boolean z = false;
            String substring = str.substring(0, matcher.start());
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            a(substring, arrayList, sb);
            if (!com.amazon.aps.iva.oe0.q.i0(sb, ".*", false) && !com.amazon.aps.iva.oe0.q.i0(sb, "([^/]+?)", false)) {
                z = true;
            }
            this.o = z;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            String sb2 = sb.toString();
            com.amazon.aps.iva.yb0.j.e(sb2, "uriRegex.toString()");
            this.e = com.amazon.aps.iva.oe0.m.f0(sb2, ".*", "\\E.*\\Q");
        }
    }

    public static void a(String str, List list, StringBuilder sb) {
        Matcher matcher = q.matcher(str);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            com.amazon.aps.iva.yb0.j.d(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i) {
                String substring = str.substring(i, matcher.start());
                com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]+?)");
            i = matcher.end();
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            com.amazon.aps.iva.yb0.j.e(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public final boolean b(Matcher matcher, Bundle bundle, Map<String, e> map) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                String str = (String) next;
                String decode = Uri.decode(matcher.group(i2));
                e eVar = map.get(str);
                try {
                    com.amazon.aps.iva.yb0.j.e(decode, "value");
                    if (eVar == null) {
                        bundle.putString(str, decode);
                        arrayList2.add(com.amazon.aps.iva.kb0.q.a);
                        i = i2;
                    } else {
                        throw null;
                    }
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                f1.S();
                throw null;
            }
        }
        return true;
    }

    public final boolean c(Uri uri, Bundle bundle, Map<String, e> map) {
        boolean z;
        Matcher matcher;
        boolean z2;
        String query;
        for (Map.Entry entry : ((Map) this.h.getValue()).entrySet()) {
            a aVar = (a) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters((String) entry.getKey());
            if (this.i && (query = uri.getQuery()) != null && !com.amazon.aps.iva.yb0.j.a(query, uri.toString())) {
                queryParameters = f1.J(query);
            }
            if (queryParameters != null) {
                for (String str : queryParameters) {
                    String str2 = aVar.a;
                    if (str2 != null) {
                        matcher = Pattern.compile(str2, 32).matcher(str);
                    } else {
                        matcher = null;
                    }
                    if (matcher != null && matcher.matches()) {
                        Bundle bundle2 = new Bundle();
                        try {
                            ArrayList arrayList = aVar.b;
                            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
                            Iterator it = arrayList.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i2 = i + 1;
                                if (i >= 0) {
                                    String str3 = (String) next;
                                    String group = matcher.group(i2);
                                    if (group == null) {
                                        group = "";
                                    }
                                    try {
                                        e eVar = map.get(str3);
                                        if (!bundle.containsKey(str3)) {
                                            z2 = true;
                                        } else if (eVar == null) {
                                            z2 = false;
                                        } else {
                                            throw null;
                                        }
                                        if (z2) {
                                            if (com.amazon.aps.iva.yb0.j.a(group, '{' + str3 + '}')) {
                                                continue;
                                            } else if (eVar == null) {
                                                bundle2.putString(str3, group);
                                            } else {
                                                throw null;
                                            }
                                        }
                                        arrayList2.add(com.amazon.aps.iva.kb0.q.a);
                                        i = i2;
                                    } catch (IllegalArgumentException unused) {
                                        continue;
                                    }
                                } else {
                                    f1.S();
                                    throw null;
                                }
                            }
                            bundle.putAll(bundle2);
                        } catch (IllegalArgumentException unused2) {
                        }
                    } else {
                        z = false;
                        continue;
                        break;
                    }
                }
            }
            z = true;
            continue;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!com.amazon.aps.iva.yb0.j.a(this.a, uVar.a) || !com.amazon.aps.iva.yb0.j.a(this.b, uVar.b) || !com.amazon.aps.iva.yb0.j.a(this.c, uVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }
}
