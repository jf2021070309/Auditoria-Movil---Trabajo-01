package com.amazon.aps.iva.ab0;

import android.content.Context;
import com.amazon.aps.iva.ab0.c;
import com.amazon.aps.iva.ab0.h;
import com.amazon.aps.iva.eb0.i;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.k.w;
import com.amazon.aps.iva.o0.o3;
import com.amazon.aps.iva.q.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PhoneNumberUtil.java */
/* loaded from: classes4.dex */
public final class d {
    public static final Logger h = Logger.getLogger(d.class.getName());
    public static final Map<Integer, String> i;
    public static final Set<Integer> j;
    public static final Set<Integer> k;
    public static final Map<Character, Character> l;
    public static final Map<Character, Character> m;
    public static final Map<Character, Character> n;
    public static final Map<Character, Character> o;
    public static final Pattern p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s;
    public static final Pattern t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public static final Pattern x;
    public static final Pattern y;
    public final com.amazon.aps.iva.eb0.g a;
    public final Map<Integer, List<String>> b;
    public final o3 c = new o3(2);
    public final HashSet d = new HashSet(35);
    public final com.amazon.aps.iva.bb0.b e = new com.amazon.aps.iva.bb0.b();
    public final HashSet f = new HashSet(320);
    public final HashSet g = new HashSet();

    /* compiled from: PhoneNumberUtil.java */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[c.values().length];
            c = iArr;
            try {
                iArr[c.PREMIUM_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[c.TOLL_FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[c.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[c.FIXED_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[c.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[c.SHARED_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[c.VOIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[c.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[c.PAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[c.UAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[c.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[b.values().length];
            b = iArr2;
            try {
                iArr2[b.E164.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[b.INTERNATIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[b.RFC3966.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[b.NATIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[h.a.values().length];
            a = iArr3;
            try {
                iArr3[h.a.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[h.a.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[h.a.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[h.a.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* compiled from: PhoneNumberUtil.java */
    /* loaded from: classes4.dex */
    public enum b {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    /* compiled from: PhoneNumberUtil.java */
    /* loaded from: classes4.dex */
    public enum c {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    /* compiled from: PhoneNumberUtil.java */
    /* renamed from: com.amazon.aps.iva.ab0.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0111d {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        i = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        k = Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        m = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        n = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        l = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            char charValue = ch.charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue)), Character.valueOf(charValue));
            hashMap6.put(Character.valueOf(charValue), Character.valueOf(charValue));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        o = Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = m;
        sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb2 = sb.toString();
        p = Pattern.compile("[+＋]+");
        q = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        r = Pattern.compile("(\\p{Nd})");
        s = Pattern.compile("[+＋\\p{Nd}]");
        t = Pattern.compile("[\\\\/] *x");
        u = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        v = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String e = defpackage.e.e("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", sb2, "\\p{Nd}]*");
        String a2 = a(true);
        a(false);
        w = Pattern.compile("(?:" + a2 + ")$", 66);
        x = Pattern.compile(e + "(?:" + a2 + ")?", 66);
        Pattern.compile("(\\D+)");
        y = Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
    }

    public d(com.amazon.aps.iva.eb0.h hVar, HashMap hashMap) {
        this.a = hVar;
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.g.add((Integer) entry.getKey());
            } else {
                this.f.addAll(list);
            }
        }
        if (this.f.remove("001")) {
            h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll((Collection) hashMap.get(1));
    }

    public static String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(";ext=" + c(20));
        sb.append("|");
        sb.append("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + c(20) + "#?");
        sb.append("|");
        sb.append("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + c(9) + "#?");
        String c2 = defpackage.b.c(sb, "|", "[- ]+" + c(6) + "#");
        if (z) {
            return c2 + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + c(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + c(9) + "#?");
        }
        return c2;
    }

    public static d b(Context context) {
        if (context != null) {
            w wVar = new w(context.getAssets());
            com.amazon.aps.iva.cb0.a aVar = new com.amazon.aps.iva.cb0.a(wVar);
            return new d(new com.amazon.aps.iva.eb0.h(aVar.b, wVar, aVar.a), f1.y());
        }
        throw new IllegalArgumentException("context could not be null.");
    }

    public static String c(int i2) {
        return com.amazon.aps.iva.c80.a.d("(\\p{Nd}{1,", i2, "})");
    }

    public static g g(f fVar, c cVar) {
        switch (a.c[cVar.ordinal()]) {
            case 1:
                return fVar.k;
            case 2:
                return fVar.i;
            case 3:
                return fVar.g;
            case 4:
            case 5:
                return fVar.e;
            case 6:
                return fVar.m;
            case 7:
                return fVar.q;
            case 8:
                return fVar.o;
            case 9:
                return fVar.s;
            case 10:
                return fVar.u;
            case 11:
                return fVar.y;
            default:
                return fVar.c;
        }
    }

    public static void j(StringBuilder sb) {
        if (v.matcher(sb).matches()) {
            int length = sb.length();
            StringBuilder sb2 = new StringBuilder(sb.length());
            for (int i2 = 0; i2 < sb.length(); i2++) {
                Character ch = n.get(Character.valueOf(Character.toUpperCase(sb.charAt(i2))));
                if (ch != null) {
                    sb2.append(ch);
                }
            }
            sb.replace(0, length, sb2.toString());
            return;
        }
        sb.replace(0, sb.length(), k(sb));
    }

    public static String k(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int digit = Character.digit(charSequence.charAt(i2), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    public static void m(int i2, b bVar, StringBuilder sb) {
        int i3 = a.b[bVar.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
                return;
            }
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
            return;
        }
        sb.insert(0, i2).insert(0, '+');
    }

    public static EnumC0111d n(StringBuilder sb, f fVar, c cVar) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        g g = g(fVar, cVar);
        if (g.d.isEmpty()) {
            arrayList = fVar.c.d;
        } else {
            arrayList = g.d;
        }
        ArrayList arrayList2 = g.e;
        if (cVar == c.FIXED_LINE_OR_MOBILE) {
            g g2 = g(fVar, c.FIXED_LINE);
            if (g2.d.size() == 1 && ((Integer) g2.d.get(0)).intValue() == -1) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return n(sb, fVar, c.MOBILE);
            }
            g g3 = g(fVar, c.MOBILE);
            if (g3.d.size() == 1 && ((Integer) g3.d.get(0)).intValue() == -1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList arrayList4 = g3.d;
                if (arrayList4.size() == 0) {
                    arrayList4 = fVar.c.d;
                }
                arrayList3.addAll(arrayList4);
                Collections.sort(arrayList3);
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList5 = g3.e;
                if (isEmpty) {
                    arrayList2 = arrayList5;
                } else {
                    ArrayList arrayList6 = new ArrayList(arrayList2);
                    arrayList6.addAll(arrayList5);
                    Collections.sort(arrayList6);
                    arrayList2 = arrayList6;
                }
                arrayList = arrayList3;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return EnumC0111d.INVALID_LENGTH;
        }
        int length = sb.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return EnumC0111d.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        if (intValue == length) {
            return EnumC0111d.IS_POSSIBLE;
        }
        if (intValue > length) {
            return EnumC0111d.TOO_SHORT;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return EnumC0111d.TOO_LONG;
        }
        if (arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length))) {
            return EnumC0111d.IS_POSSIBLE;
        }
        return EnumC0111d.INVALID_LENGTH;
    }

    public final String d(h hVar, b bVar) {
        String str;
        ArrayList arrayList;
        com.amazon.aps.iva.bb0.b bVar2;
        e eVar;
        int i2;
        int i3 = (hVar.c > 0L ? 1 : (hVar.c == 0L ? 0 : -1));
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i4 = hVar.b;
        StringBuilder sb2 = new StringBuilder();
        if (hVar.g && (i2 = hVar.i) > 0) {
            char[] cArr = new char[i2];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(hVar.c);
        String sb3 = sb2.toString();
        b bVar3 = b.E164;
        if (bVar == bVar3) {
            sb.append(sb3);
            m(i4, bVar3, sb);
        } else {
            Integer valueOf = Integer.valueOf(i4);
            Map<Integer, List<String>> map = this.b;
            if (!map.containsKey(valueOf)) {
                sb.append(sb3);
            } else {
                List<String> list = map.get(Integer.valueOf(i4));
                if (list == null) {
                    str = "ZZ";
                } else {
                    str = list.get(0);
                }
                f f = f(i4, str);
                if (f.Y.size() != 0 && bVar != b.NATIONAL) {
                    arrayList = f.Y;
                } else {
                    arrayList = f.X;
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    bVar2 = this.e;
                    if (hasNext) {
                        eVar = (e) it.next();
                        int size = eVar.d.size();
                        if (size != 0) {
                            if (!bVar2.a((String) eVar.d.get(size - 1)).matcher(sb3).lookingAt()) {
                                continue;
                            }
                        }
                        if (bVar2.a(eVar.b).matcher(sb3).matches()) {
                            break;
                        }
                    } else {
                        eVar = null;
                        break;
                    }
                }
                if (eVar != null) {
                    String str2 = eVar.c;
                    Matcher matcher = bVar2.a(eVar.b).matcher(sb3);
                    b bVar4 = b.NATIONAL;
                    String str3 = eVar.f;
                    if (bVar == bVar4 && str3 != null && str3.length() > 0) {
                        sb3 = matcher.replaceAll(y.matcher(str2).replaceFirst(str3));
                    } else {
                        sb3 = matcher.replaceAll(str2);
                    }
                    if (bVar == b.RFC3966) {
                        Matcher matcher2 = q.matcher(sb3);
                        if (matcher2.lookingAt()) {
                            sb3 = matcher2.replaceFirst("");
                        }
                        sb3 = matcher2.reset(sb3).replaceAll("-");
                    }
                }
                sb.append(sb3);
                if (hVar.d && hVar.e.length() > 0) {
                    if (bVar == b.RFC3966) {
                        sb.append(";ext=");
                        sb.append(hVar.e);
                    } else if (f.Q) {
                        sb.append(f.R);
                        sb.append(hVar.e);
                    } else {
                        sb.append(" ext. ");
                        sb.append(hVar.e);
                    }
                }
                m(i4, bVar, sb);
            }
        }
        return sb.toString();
    }

    public final f e(String str) {
        boolean z;
        if (str != null && this.f.contains(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        com.amazon.aps.iva.eb0.h hVar = (com.amazon.aps.iva.eb0.h) this.a;
        hVar.getClass();
        if (true ^ str.equals("001")) {
            f fVar = (f) ((com.amazon.aps.iva.eb0.b) hVar.b.a(((i) hVar.a).a(str))).b.a.get(str);
            String concat = "Missing metadata for region code ".concat(str);
            if (fVar != null) {
                return fVar;
            }
            throw new com.amazon.aps.iva.ab0.b(concat);
        }
        throw new IllegalArgumentException(str.concat(" region code is a non-geo entity"));
    }

    public final f f(int i2, String str) {
        boolean z;
        if ("001".equals(str)) {
            f fVar = null;
            if (!this.g.contains(Integer.valueOf(i2))) {
                return null;
            }
            com.amazon.aps.iva.eb0.h hVar = (com.amazon.aps.iva.eb0.h) this.a;
            hVar.getClass();
            List list = (List) f1.y().get(Integer.valueOf(i2));
            if (list != null && !list.contains("001")) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                com.amazon.aps.iva.eb0.e<Integer> eVar = ((com.amazon.aps.iva.eb0.b) hVar.b.a(((i) hVar.a).a(Integer.valueOf(i2)))).a;
                Integer valueOf = Integer.valueOf(i2);
                if (valueOf != null) {
                    fVar = (f) eVar.a.get(valueOf);
                } else {
                    eVar.getClass();
                }
                String a2 = c0.a("Missing metadata for country code ", i2);
                if (fVar == null) {
                    throw new com.amazon.aps.iva.ab0.b(a2);
                }
                return fVar;
            }
            throw new IllegalArgumentException(i2 + " calling code belongs to a geo entity");
        }
        return e(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(java.lang.CharSequence r7, com.amazon.aps.iva.ab0.f r8, java.lang.StringBuilder r9, com.amazon.aps.iva.ab0.h r10) throws com.amazon.aps.iva.ab0.c {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ab0.d.h(java.lang.CharSequence, com.amazon.aps.iva.ab0.f, java.lang.StringBuilder, com.amazon.aps.iva.ab0.h):int");
    }

    public final void i(StringBuilder sb, f fVar, StringBuilder sb2) {
        int length = sb.length();
        String str = fVar.T;
        if (length != 0 && str.length() != 0) {
            Matcher matcher = this.e.a(str).matcher(sb);
            if (matcher.lookingAt()) {
                g gVar = fVar.c;
                o3 o3Var = this.c;
                boolean a2 = o3Var.a(sb, gVar);
                int groupCount = matcher.groupCount();
                String str2 = fVar.V;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (a2 && !o3Var.a(sb3.toString(), gVar)) {
                        return;
                    }
                    if (sb2 != null && groupCount > 1) {
                        sb2.append(matcher.group(1));
                    }
                    sb.replace(0, sb.length(), sb3.toString());
                } else if (a2 && !o3Var.a(sb.substring(matcher.end()), gVar)) {
                } else {
                    if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                }
            }
        }
    }

    public final h l(CharSequence charSequence, String str) throws com.amazon.aps.iva.ab0.c {
        CharSequence charSequence2;
        boolean matches;
        boolean z;
        boolean z2;
        int h2;
        String str2;
        boolean matches2;
        int i2;
        h hVar = new h();
        if (charSequence != null) {
            if (charSequence.length() <= 250) {
                StringBuilder sb = new StringBuilder();
                String charSequence3 = charSequence.toString();
                int indexOf = charSequence3.indexOf(";phone-context=");
                String str3 = "";
                if (indexOf >= 0) {
                    int i3 = indexOf + 15;
                    if (i3 < charSequence3.length() - 1 && charSequence3.charAt(i3) == '+') {
                        int indexOf2 = charSequence3.indexOf(59, i3);
                        if (indexOf2 > 0) {
                            sb.append(charSequence3.substring(i3, indexOf2));
                        } else {
                            sb.append(charSequence3.substring(i3));
                        }
                    }
                    int indexOf3 = charSequence3.indexOf("tel:");
                    if (indexOf3 >= 0) {
                        i2 = indexOf3 + 4;
                    } else {
                        i2 = 0;
                    }
                    sb.append(charSequence3.substring(i2, indexOf));
                } else {
                    Matcher matcher = s.matcher(charSequence3);
                    if (!matcher.find()) {
                        charSequence2 = "";
                    } else {
                        charSequence2 = charSequence3.subSequence(matcher.start(), charSequence3.length());
                        Matcher matcher2 = u.matcher(charSequence2);
                        if (matcher2.find()) {
                            charSequence2 = charSequence2.subSequence(0, matcher2.start());
                        }
                        Matcher matcher3 = t.matcher(charSequence2);
                        if (matcher3.find()) {
                            charSequence2 = charSequence2.subSequence(0, matcher3.start());
                        }
                    }
                    sb.append(charSequence2);
                }
                int indexOf4 = sb.indexOf(";isub=");
                if (indexOf4 > 0) {
                    sb.delete(indexOf4, sb.length());
                }
                int length = sb.length();
                Pattern pattern = x;
                if (length < 2) {
                    matches = false;
                } else {
                    matches = pattern.matcher(sb).matches();
                }
                if (matches) {
                    if (str != null && this.f.contains(str)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Pattern pattern2 = p;
                    if (!z && (sb.length() == 0 || !pattern2.matcher(sb).lookingAt())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        Matcher matcher4 = w.matcher(sb);
                        if (matcher4.find()) {
                            String substring = sb.substring(0, matcher4.start());
                            if (substring.length() < 2) {
                                matches2 = false;
                            } else {
                                matches2 = pattern.matcher(substring).matches();
                            }
                            if (matches2) {
                                int groupCount = matcher4.groupCount();
                                int i4 = 1;
                                while (true) {
                                    if (i4 > groupCount) {
                                        break;
                                    } else if (matcher4.group(i4) != null) {
                                        str3 = matcher4.group(i4);
                                        sb.delete(matcher4.start(), sb.length());
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                        }
                        if (str3.length() > 0) {
                            hVar.d = true;
                            hVar.e = str3;
                        }
                        f e = e(str);
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            h2 = h(sb, e, sb2, hVar);
                        } catch (com.amazon.aps.iva.ab0.c e2) {
                            Matcher matcher5 = pattern2.matcher(sb);
                            c.a aVar = c.a.INVALID_COUNTRY_CODE;
                            c.a aVar2 = e2.b;
                            if (aVar2 == aVar && matcher5.lookingAt()) {
                                h2 = h(sb.substring(matcher5.end()), e, sb2, hVar);
                                if (h2 == 0) {
                                    throw new com.amazon.aps.iva.ab0.c(c.a.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                                }
                            } else {
                                throw new com.amazon.aps.iva.ab0.c(aVar2, e2.getMessage());
                            }
                        }
                        if (h2 != 0) {
                            List<String> list = this.b.get(Integer.valueOf(h2));
                            if (list == null) {
                                str2 = "ZZ";
                            } else {
                                str2 = list.get(0);
                            }
                            if (!str2.equals(str)) {
                                e = f(h2, str2);
                            }
                        } else {
                            j(sb);
                            sb2.append((CharSequence) sb);
                            if (str != null) {
                                hVar.b = e.K;
                            }
                        }
                        if (sb2.length() >= 2) {
                            if (e != null) {
                                StringBuilder sb3 = new StringBuilder();
                                StringBuilder sb4 = new StringBuilder(sb2);
                                i(sb4, e, sb3);
                                EnumC0111d n2 = n(sb4, e, c.UNKNOWN);
                                if (n2 != EnumC0111d.TOO_SHORT && n2 != EnumC0111d.IS_POSSIBLE_LOCAL_ONLY && n2 != EnumC0111d.INVALID_LENGTH) {
                                    sb2 = sb4;
                                }
                            }
                            int length2 = sb2.length();
                            if (length2 >= 2) {
                                if (length2 <= 17) {
                                    if (sb2.length() > 1 && sb2.charAt(0) == '0') {
                                        hVar.f = true;
                                        hVar.g = true;
                                        int i5 = 1;
                                        while (i5 < sb2.length() - 1 && sb2.charAt(i5) == '0') {
                                            i5++;
                                        }
                                        if (i5 != 1) {
                                            hVar.h = true;
                                            hVar.i = i5;
                                        }
                                    }
                                    hVar.c = Long.parseLong(sb2.toString());
                                    return hVar;
                                }
                                throw new com.amazon.aps.iva.ab0.c(c.a.TOO_LONG, "The string supplied is too long to be a phone number.");
                            }
                            throw new com.amazon.aps.iva.ab0.c(c.a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                        }
                        throw new com.amazon.aps.iva.ab0.c(c.a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                    }
                    throw new com.amazon.aps.iva.ab0.c(c.a.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
                }
                throw new com.amazon.aps.iva.ab0.c(c.a.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
            }
            throw new com.amazon.aps.iva.ab0.c(c.a.TOO_LONG, "The string supplied was too long to parse.");
        }
        throw new com.amazon.aps.iva.ab0.c(c.a.NOT_A_NUMBER, "The phone number supplied was null.");
    }
}
