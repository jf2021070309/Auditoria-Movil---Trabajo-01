package com.amazon.aps.iva.y7;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.amazon.aps.iva.d2.k;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.v;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: WebvttCueParser.java */
/* loaded from: classes.dex */
public final class f {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map<String, Integer> c;
    public static final Map<String, Integer> d;

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final k c = new k(5);
        public final b a;
        public final int b;

        public a(b bVar, int i) {
            this.a = bVar;
            this.b = i;
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final int b;
        public final String c;
        public final Set<String> d;

        public b(String str, int i, String str2, Set<String> set) {
            this.b = i;
            this.a = str;
            this.c = str2;
            this.d = set;
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {
        public final int b;
        public final com.amazon.aps.iva.y7.d c;

        public c(int i, com.amazon.aps.iva.y7.d dVar) {
            this.b = i;
            this.c = dVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.b, cVar.b);
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static final class d {
        public CharSequence c;
        public long a = 0;
        public long b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        /* JADX WARN: Code restructure failed: missing block: B:42:0x006c, code lost:
            if (r7 == 0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.s5.a.C0695a a() {
            /*
                r13 = this;
                float r0 = r13.h
                r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r3 = 1056964608(0x3f000000, float:0.5)
                r4 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 5
                r7 = 4
                if (r2 == 0) goto L11
                goto L1c
            L11:
                int r0 = r13.d
                if (r0 == r7) goto L1b
                if (r0 == r6) goto L19
                r0 = r3
                goto L1c
            L19:
                r0 = r5
                goto L1c
            L1b:
                r0 = r4
            L1c:
                int r2 = r13.i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r2 == r8) goto L26
                goto L35
            L26:
                int r2 = r13.d
                if (r2 == r11) goto L34
                if (r2 == r9) goto L32
                if (r2 == r7) goto L34
                if (r2 == r6) goto L32
                r2 = r11
                goto L35
            L32:
                r2 = r10
                goto L35
            L34:
                r2 = 0
            L35:
                com.amazon.aps.iva.s5.a$a r8 = new com.amazon.aps.iva.s5.a$a
                r8.<init>()
                int r12 = r13.d
                if (r12 == r11) goto L51
                if (r12 == r10) goto L4e
                if (r12 == r9) goto L4b
                if (r12 == r7) goto L51
                if (r12 == r6) goto L4b
                com.amazon.aps.iva.t5.p.g()
                r6 = 0
                goto L53
            L4b:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L53
            L4e:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L53
            L51:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            L53:
                r8.c = r6
                float r6 = r13.e
                int r7 = r13.f
                int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r9 == 0) goto L68
                if (r7 != 0) goto L68
                int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r4 < 0) goto L6e
                int r4 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                if (r4 <= 0) goto L68
                goto L6e
            L68:
                if (r9 == 0) goto L6c
                r1 = r6
                goto L6f
            L6c:
                if (r7 != 0) goto L6f
            L6e:
                r1 = r5
            L6f:
                r8.e = r1
                r8.f = r7
                int r1 = r13.g
                r8.g = r1
                r8.h = r0
                r8.i = r2
                float r1 = r13.j
                if (r2 == 0) goto L9a
                if (r2 == r11) goto L8e
                if (r2 != r10) goto L84
                goto L9c
            L84:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = java.lang.String.valueOf(r2)
                r0.<init>(r1)
                throw r0
            L8e:
                int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                r3 = 1073741824(0x40000000, float:2.0)
                if (r2 > 0) goto L96
                float r0 = r0 * r3
                goto L9c
            L96:
                float r5 = r5 - r0
                float r0 = r5 * r3
                goto L9c
            L9a:
                float r0 = r5 - r0
            L9c:
                float r0 = java.lang.Math.min(r1, r0)
                r8.l = r0
                int r0 = r13.k
                r8.p = r0
                java.lang.CharSequence r0 = r13.c
                if (r0 == 0) goto Lac
                r8.a = r0
            Lac:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y7.f.d.a():com.amazon.aps.iva.s5.a$a");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, b bVar, String str, List list, List list2) {
        char c2;
        char c3;
        char c4;
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5 = bVar.b;
        int length = spannableStringBuilder.length();
        String str2 = bVar.a;
        str2.getClass();
        int hashCode = str2.hashCode();
        int i6 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        c2 = 5;
                                    }
                                    c2 = 65535;
                                } else {
                                    if (str2.equals("u")) {
                                        c2 = 4;
                                    }
                                    c2 = 65535;
                                }
                            } else {
                                if (str2.equals("c")) {
                                    c2 = 2;
                                }
                                c2 = 65535;
                            }
                        } else {
                            if (str2.equals("b")) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c2 = 7;
                        }
                        c2 = 65535;
                    }
                } else {
                    if (str2.equals("lang")) {
                        c2 = 6;
                    }
                    c2 = 65535;
                }
            } else {
                if (str2.equals("i")) {
                    c2 = 3;
                }
                c2 = 65535;
            }
        } else {
            if (str2.equals("")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i5, length, 33);
                break;
            case 2:
                for (String str3 : bVar.d) {
                    Map<String, Integer> map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i5, length, 33);
                    } else {
                        Map<String, Integer> map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i5, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i5, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
                break;
            case 7:
                int c5 = c(list2, str, bVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, a.c);
                int i7 = bVar.b;
                int i8 = 0;
                int i9 = 0;
                while (i8 < arrayList.size()) {
                    if ("rt".equals(((a) arrayList.get(i8)).a.a)) {
                        a aVar = (a) arrayList.get(i8);
                        int c6 = c(list2, str, aVar.a);
                        if (c6 == i6) {
                            if (c5 != i6) {
                                c6 = c5;
                            } else {
                                c6 = 1;
                            }
                        }
                        int i10 = aVar.a.b - i9;
                        int i11 = aVar.b - i9;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i10, i11);
                        spannableStringBuilder.delete(i10, i11);
                        spannableStringBuilder.setSpan(new com.amazon.aps.iva.s5.e(subSequence.toString(), c6), i7, i10, 33);
                        i9 = subSequence.length() + i9;
                        i7 = i10;
                    }
                    i8++;
                    i6 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b2 = b(list2, str, bVar);
        for (int i12 = 0; i12 < b2.size(); i12++) {
            com.amazon.aps.iva.y7.d dVar = ((c) b2.get(i12)).c;
            if (dVar != null) {
                int i13 = dVar.l;
                if (i13 == -1 && dVar.m == -1) {
                    i = -1;
                } else {
                    if (i13 == 1) {
                        c3 = 1;
                    } else {
                        c3 = 0;
                    }
                    if (dVar.m == 1) {
                        c4 = 2;
                    } else {
                        c4 = 0;
                    }
                    i = c4 | c3;
                }
                if (i != -1) {
                    int i14 = dVar.l;
                    if (i14 == -1 && dVar.m == -1) {
                        i4 = -1;
                    } else {
                        if (i14 == 1) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (dVar.m == 1) {
                            i3 = 2;
                        } else {
                            i3 = 0;
                        }
                        i4 = i2 | i3;
                    }
                    w.n(spannableStringBuilder, new StyleSpan(i4), i5, length);
                }
                if (dVar.j == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i5, length, 33);
                }
                if (dVar.k == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
                }
                if (dVar.g) {
                    if (dVar.g) {
                        w.n(spannableStringBuilder, new ForegroundColorSpan(dVar.f), i5, length);
                    } else {
                        throw new IllegalStateException("Font color not defined");
                    }
                }
                if (dVar.i) {
                    if (dVar.i) {
                        w.n(spannableStringBuilder, new BackgroundColorSpan(dVar.h), i5, length);
                    } else {
                        throw new IllegalStateException("Background color not defined.");
                    }
                }
                if (dVar.e != null) {
                    w.n(spannableStringBuilder, new TypefaceSpan(dVar.e), i5, length);
                }
                int i15 = dVar.n;
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            w.n(spannableStringBuilder, new RelativeSizeSpan(dVar.o / 100.0f), i5, length);
                        }
                    } else {
                        w.n(spannableStringBuilder, new RelativeSizeSpan(dVar.o), i5, length);
                    }
                } else {
                    w.n(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.o, true), i5, length);
                }
                if (dVar.q) {
                    spannableStringBuilder.setSpan(new com.amazon.aps.iva.s5.c(), i5, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, b bVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.amazon.aps.iva.y7.d dVar = (com.amazon.aps.iva.y7.d) list.get(i2);
            String str2 = bVar.a;
            if (dVar.a.isEmpty() && dVar.b.isEmpty() && dVar.c.isEmpty() && dVar.d.isEmpty()) {
                i = TextUtils.isEmpty(str2);
            } else {
                int a2 = com.amazon.aps.iva.y7.d.a(com.amazon.aps.iva.y7.d.a(com.amazon.aps.iva.y7.d.a(0, Ints.MAX_POWER_OF_TWO, dVar.a, str), 2, dVar.b, str2), 4, dVar.d, bVar.c);
                if (a2 != -1) {
                    if (bVar.d.containsAll(dVar.c)) {
                        i = a2 + (dVar.c.size() * 4);
                    }
                }
                i = 0;
            }
            if (i > 0) {
                arrayList.add(new c(i, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List<com.amazon.aps.iva.y7.d> list, String str, b bVar) {
        ArrayList b2 = b(list, str, bVar);
        for (int i = 0; i < b2.size(); i++) {
            int i2 = ((c) b2.get(i)).c.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static e d(String str, Matcher matcher, v vVar, ArrayList arrayList) {
        d dVar = new d();
        try {
            String group = matcher.group(1);
            group.getClass();
            dVar.a = h.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            dVar.b = h.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, dVar);
            StringBuilder sb = new StringBuilder();
            String f = vVar.f();
            while (!TextUtils.isEmpty(f)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(f.trim());
                f = vVar.f();
            }
            dVar.c = f(str, sb.toString(), arrayList);
            return new e(dVar.a().a(), dVar.a, dVar.b);
        } catch (NumberFormatException unused) {
            matcher.group();
            p.g();
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c1, code lost:
        if (r6.equals("start") == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, com.amazon.aps.iva.y7.f.d r19) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y7.f.e(java.lang.String, com.amazon.aps.iva.y7.f$d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r16, java.lang.String r17, java.util.List<com.amazon.aps.iva.y7.d> r18) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y7.f.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, d dVar) {
        int indexOf = str.indexOf(44);
        char c2 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    "Invalid anchor value: ".concat(substring);
                    p.g();
                    i = Integer.MIN_VALUE;
                    break;
            }
            dVar.g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            dVar.e = h.b(str);
            dVar.f = 0;
            return;
        }
        dVar.e = Integer.parseInt(str);
        dVar.f = 1;
    }
}
