package com.amazon.aps.iva.mp;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: DatadogDataConstraints.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.mp.a {
    public static final Set<String> b = l1.I("host", "device", FirebaseAnalytics.Param.SOURCE, "service");
    public final List<l<String, String>> a = f1.K(a.h, C0520b.h, c.h, d.h, e.h, new f());

    /* compiled from: DatadogDataConstraints.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements l<String, String> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(String str) {
            String str2 = str;
            j.f(str2, "it");
            Locale locale = Locale.US;
            j.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
    }

    /* compiled from: DatadogDataConstraints.kt */
    /* renamed from: com.amazon.aps.iva.mp.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0520b extends com.amazon.aps.iva.yb0.l implements l<String, String> {
        public static final C0520b h = new C0520b();

        public C0520b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(String str) {
            Character ch;
            boolean z;
            String str2 = str;
            j.f(str2, "it");
            com.amazon.aps.iva.ec0.c cVar = new com.amazon.aps.iva.ec0.c('a', 'z');
            boolean z2 = false;
            if (q.n0(str2) >= 0) {
                ch = Character.valueOf(str2.charAt(0));
            } else {
                ch = null;
            }
            if (ch != null) {
                char charValue = ch.charValue();
                if (j.h(97, charValue) <= 0 && j.h(charValue, cVar.c) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            if (!z2) {
                return null;
            }
            return str2;
        }
    }

    /* compiled from: DatadogDataConstraints.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements l<String, String> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(String str) {
            String str2 = str;
            j.f(str2, "it");
            Pattern compile = Pattern.compile("[^a-z0-9_:./-]");
            j.e(compile, "compile(pattern)");
            String replaceAll = compile.matcher(str2).replaceAll("_");
            j.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            return replaceAll;
        }
    }

    /* compiled from: DatadogDataConstraints.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements l<String, String> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(String str) {
            String str2 = str;
            j.f(str2, "it");
            if (q.k0(str2, ':')) {
                String substring = str2.substring(0, q.n0(str2));
                j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
            return str2;
        }
    }

    /* compiled from: DatadogDataConstraints.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements l<String, String> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(String str) {
            String str2 = str;
            j.f(str2, "it");
            if (str2.length() > 200) {
                String substring = str2.substring(0, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
                j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
            return str2;
        }
    }

    /* compiled from: DatadogDataConstraints.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements l<String, String> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(String str) {
            String str2 = str;
            j.f(str2, "it");
            b.this.getClass();
            boolean z = false;
            int q0 = q.q0(str2, ':', 0, false, 6);
            if (q0 > 0) {
                String substring = str2.substring(0, q0);
                j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                z = b.b.contains(substring);
            }
            if (z) {
                return null;
            }
            return str2;
        }
    }

    @Override // com.amazon.aps.iva.mp.a
    public final <T> Map<String, T> a(Map<String, ? extends T> map, String str, String str2, Set<String> set) {
        int i;
        String d2;
        j.f(map, "attributes");
        j.f(set, "reservedKeys");
        if (str == null) {
            i = 0;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                boolean z = true;
                if (i2 >= str.length()) {
                    break;
                }
                char charAt = str.charAt(i2);
                i2++;
                if (charAt != '.') {
                    z = false;
                }
                if (z) {
                    i3++;
                }
            }
            i = i3 + 1;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ? extends T>> it = map.entrySet().iterator();
        while (true) {
            com.amazon.aps.iva.kb0.j jVar = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ? extends T> next = it.next();
            if (next.getKey() == null) {
                com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "\"" + next + "\" is an invalid attribute, and was ignored.", null, 6);
            } else if (set.contains(next.getKey())) {
                com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "\"" + next + "\" key was in the reservedKeys set, and was dropped.", null, 6);
            } else {
                String key = next.getKey();
                ArrayList arrayList2 = new ArrayList(key.length());
                int i4 = 0;
                int i5 = i;
                while (i4 < key.length()) {
                    char charAt2 = key.charAt(i4);
                    i4++;
                    if (charAt2 == '.' && (i5 = i5 + 1) > 9) {
                        charAt2 = '_';
                    }
                    arrayList2.add(Character.valueOf(charAt2));
                }
                char[] cArr = new char[arrayList2.size()];
                Iterator it2 = arrayList2.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    cArr[i6] = ((Character) it2.next()).charValue();
                    i6++;
                }
                String str3 = new String(cArr);
                if (!j.a(str3, next.getKey())) {
                    com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.b;
                    String key2 = next.getKey();
                    com.amazon.aps.iva.iq.a.e(aVar, "Key \"" + ((Object) key2) + "\" was modified to \"" + str3 + "\" to match our constraints.", null, 6);
                }
                jVar = new com.amazon.aps.iva.kb0.j(str3, next.getValue());
            }
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        int size = arrayList.size() - 128;
        if (size > 0) {
            if (str2 != null) {
                d2 = "Too many attributes were added for [" + str2 + "], " + size + " had to be discarded.";
            } else {
                d2 = com.amazon.aps.iva.c80.a.d("Too many attributes were added, ", size, " had to be discarded.");
            }
            com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.b, d2, null, 6);
        }
        return i0.Z(x.U0(arrayList, 128));
    }

    @Override // com.amazon.aps.iva.mp.a
    public final List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Iterator<T> it = this.a.iterator();
            String str2 = str;
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (str2 == null) {
                    str2 = null;
                } else {
                    str2 = (String) lVar.invoke(str2);
                }
            }
            if (str2 == null) {
                com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, defpackage.e.e("\"", str, "\" is an invalid tag, and was ignored."), null, 6);
            } else if (!j.a(str2, str)) {
                com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.b, com.amazon.aps.iva.e4.e.b("tag \"", str, "\" was modified to \"", str2, "\" to match our constraints."), null, 6);
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        int size = arrayList.size() - 100;
        if (size > 0) {
            com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.b, com.amazon.aps.iva.c80.a.d("too many tags were added, ", size, " had to be discarded."), null, 6);
        }
        return x.U0(arrayList, 100);
    }

    @Override // com.amazon.aps.iva.mp.a
    public final LinkedHashMap c(Map map) {
        j.f(map, "timings");
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.w(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            CharSequence charSequence = (CharSequence) entry.getKey();
            Pattern compile = Pattern.compile("[^a-zA-Z0-9\\-_.@$]");
            j.e(compile, "compile(pattern)");
            j.f(charSequence, "input");
            String replaceAll = compile.matcher(charSequence).replaceAll("_");
            j.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            if (!j.a(replaceAll, entry.getKey())) {
                com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.b;
                String format = String.format(Locale.US, "Invalid timing name: %s, sanitized to: %s", Arrays.copyOf(new Object[]{entry.getKey(), replaceAll}, 2));
                j.e(format, "format(locale, this, *args)");
                com.amazon.aps.iva.iq.a.e(aVar, format, null, 6);
            }
            linkedHashMap.put(replaceAll, entry.getValue());
        }
        return linkedHashMap;
    }
}
