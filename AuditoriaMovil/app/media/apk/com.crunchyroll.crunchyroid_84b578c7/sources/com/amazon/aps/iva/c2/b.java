package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.o0.t1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* compiled from: AnnotatedString.kt */
/* loaded from: classes.dex */
public final class b implements CharSequence {
    public final String b;
    public final List<C0158b<u>> c;
    public final List<C0158b<n>> d;
    public final List<C0158b<? extends Object>> e;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return f1.t(Integer.valueOf(((C0158b) t).b), Integer.valueOf(((C0158b) t2).b));
        }
    }

    public b() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, List<C0158b<u>> list, List<C0158b<n>> list2, List<? extends C0158b<? extends Object>> list3) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        if (list2 != null) {
            List T0 = com.amazon.aps.iva.lb0.x.T0(list2, new c());
            int size = T0.size();
            int i = -1;
            int i2 = 0;
            while (i2 < size) {
                C0158b c0158b = (C0158b) T0.get(i2);
                if (c0158b.b >= i) {
                    int length = this.b.length();
                    int i3 = c0158b.c;
                    if (!(i3 <= length)) {
                        throw new IllegalArgumentException(("ParagraphStyle range [" + c0158b.b + ", " + i3 + ") is out of boundary").toString());
                    }
                    i2++;
                    i = i3;
                } else {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
            }
        }
    }

    public final List<C0158b<String>> a(int i, int i2) {
        boolean z;
        List<C0158b<? extends Object>> list = this.e;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0158b<? extends Object> c0158b = list.get(i3);
                C0158b<? extends Object> c0158b2 = c0158b;
                if ((c0158b2.a instanceof String) && com.amazon.aps.iva.c2.c.c(i, i2, c0158b2.b, c0158b2.c)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(c0158b);
                }
            }
            return arrayList;
        }
        return com.amazon.aps.iva.lb0.z.b;
    }

    public final b b(b bVar) {
        a aVar = new a(this);
        aVar.b(bVar);
        return aVar.f();
    }

    @Override // java.lang.CharSequence
    /* renamed from: c */
    public final b subSequence(int i, int i2) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str = this.b;
            if (i == 0 && i2 == str.length()) {
                return this;
            }
            String substring = str.substring(i, i2);
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new b(substring, com.amazon.aps.iva.c2.c.a(i, i2, this.c), com.amazon.aps.iva.c2.c.a(i, i2, this.d), com.amazon.aps.iva.c2.c.a(i, i2, this.e));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, bVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, bVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, bVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, bVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.b.hashCode() * 31;
        int i3 = 0;
        List<C0158b<u>> list = this.c;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List<C0158b<n>> list2 = this.d;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        List<C0158b<? extends Object>> list3 = this.e;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        return i5 + i3;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    /* compiled from: AnnotatedString.kt */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {
        public final StringBuilder b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;
        public final ArrayList f;

        /* compiled from: AnnotatedString.kt */
        /* renamed from: com.amazon.aps.iva.c2.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0157a<T> {
            public final T a;
            public final int b;
            public int c;
            public final String d;

            public /* synthetic */ C0157a(Object obj, int i, int i2, String str, int i3) {
                this(obj, (i3 & 8) != 0 ? "" : str, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2);
            }

            public final C0158b<T> a(int i) {
                boolean z;
                int i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i3 = this.b;
                    return new C0158b<>(this.a, this.d, i3, i);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0157a)) {
                    return false;
                }
                C0157a c0157a = (C0157a) obj;
                if (com.amazon.aps.iva.yb0.j.a(this.a, c0157a.a) && this.b == c0157a.b && this.c == c0157a.c && com.amazon.aps.iva.yb0.j.a(this.d, c0157a.d)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                int hashCode;
                T t = this.a;
                if (t == null) {
                    hashCode = 0;
                } else {
                    hashCode = t.hashCode();
                }
                return this.d.hashCode() + com.amazon.aps.iva.a0.r.a(this.c, com.amazon.aps.iva.a0.r.a(this.b, hashCode * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.a);
                sb.append(", start=");
                sb.append(this.b);
                sb.append(", end=");
                sb.append(this.c);
                sb.append(", tag=");
                return t1.b(sb, this.d, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0157a(Object obj, String str, int i, int i2) {
                com.amazon.aps.iva.yb0.j.f(str, "tag");
                this.a = obj;
                this.b = i;
                this.c = i2;
                this.d = str;
            }
        }

        public a() {
            this.b = new StringBuilder(16);
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f = new ArrayList();
        }

        public final void a(u uVar, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(uVar, "style");
            this.c.add(new C0157a(uVar, i, i2, null, 8));
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence instanceof b) {
                b((b) charSequence);
            } else {
                this.b.append(charSequence);
            }
            return this;
        }

        public final void b(b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "text");
            StringBuilder sb = this.b;
            int length = sb.length();
            sb.append(bVar.b);
            List<C0158b<u>> list = bVar.c;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C0158b<u> c0158b = list.get(i);
                    a(c0158b.a, c0158b.b + length, c0158b.c + length);
                }
            }
            List<C0158b<n>> list2 = bVar.d;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C0158b<n> c0158b2 = list2.get(i2);
                    n nVar = c0158b2.a;
                    int i3 = c0158b2.c + length;
                    com.amazon.aps.iva.yb0.j.f(nVar, "style");
                    this.d.add(new C0157a(nVar, c0158b2.b + length, i3, null, 8));
                }
            }
            List<C0158b<? extends Object>> list3 = bVar.e;
            if (list3 != null) {
                int size3 = list3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    C0158b<? extends Object> c0158b3 = list3.get(i4);
                    this.e.add(new C0157a(c0158b3.a, c0158b3.d, c0158b3.b + length, c0158b3.c + length));
                }
            }
        }

        public final void c(int i) {
            boolean z;
            ArrayList arrayList = this.f;
            if (i < arrayList.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                while (arrayList.size() - 1 >= i) {
                    if (!arrayList.isEmpty()) {
                        ((C0157a) arrayList.remove(arrayList.size() - 1)).c = this.b.length();
                    } else {
                        throw new IllegalStateException("Nothing to pop.".toString());
                    }
                }
                return;
            }
            throw new IllegalStateException((i + " should be less than " + arrayList.size()).toString());
        }

        public final void d(String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(str, "tag");
            com.amazon.aps.iva.yb0.j.f(str2, "annotation");
            C0157a c0157a = new C0157a(str2, this.b.length(), 0, str, 4);
            ArrayList arrayList = this.f;
            arrayList.add(c0157a);
            this.e.add(c0157a);
            arrayList.size();
        }

        public final int e(u uVar) {
            C0157a c0157a = new C0157a(uVar, this.b.length(), 0, null, 12);
            ArrayList arrayList = this.f;
            arrayList.add(c0157a);
            this.c.add(c0157a);
            return arrayList.size() - 1;
        }

        public final b f() {
            StringBuilder sb = this.b;
            String sb2 = sb.toString();
            com.amazon.aps.iva.yb0.j.e(sb2, "text.toString()");
            ArrayList arrayList = this.c;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((C0157a) arrayList.get(i)).a(sb.length()));
            }
            ArrayList arrayList3 = null;
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            ArrayList arrayList4 = this.d;
            ArrayList arrayList5 = new ArrayList(arrayList4.size());
            int size2 = arrayList4.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList5.add(((C0157a) arrayList4.get(i2)).a(sb.length()));
            }
            if (arrayList5.isEmpty()) {
                arrayList5 = null;
            }
            ArrayList arrayList6 = this.e;
            ArrayList arrayList7 = new ArrayList(arrayList6.size());
            int size3 = arrayList6.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList7.add(((C0157a) arrayList6.get(i3)).a(sb.length()));
            }
            if (!arrayList7.isEmpty()) {
                arrayList3 = arrayList7;
            }
            return new b(sb2, arrayList2, arrayList5, arrayList3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.util.List<com.amazon.aps.iva.c2.b$b<? extends java.lang.Object>>] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List, java.util.List<com.amazon.aps.iva.c2.b$b<com.amazon.aps.iva.c2.n>>] */
        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            ?? r8;
            ?? r1;
            boolean z = charSequence instanceof b;
            StringBuilder sb = this.b;
            if (z) {
                b bVar = (b) charSequence;
                com.amazon.aps.iva.yb0.j.f(bVar, "text");
                int length = sb.length();
                String str = bVar.b;
                sb.append((CharSequence) str, i, i2);
                List<C0158b<u>> b = com.amazon.aps.iva.c2.c.b(bVar, i, i2);
                if (b != null) {
                    int size = b.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C0158b<u> c0158b = b.get(i3);
                        a(c0158b.a, c0158b.b + length, c0158b.c + length);
                    }
                }
                List list = null;
                if (i == i2 || (r8 = bVar.d) == 0) {
                    r8 = 0;
                } else if (i != 0 || i2 < str.length()) {
                    ArrayList arrayList = new ArrayList(r8.size());
                    int size2 = r8.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Object obj = r8.get(i4);
                        C0158b c0158b2 = (C0158b) obj;
                        if (com.amazon.aps.iva.c2.c.c(i, i2, c0158b2.b, c0158b2.c)) {
                            arrayList.add(obj);
                        }
                    }
                    r8 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        C0158b c0158b3 = (C0158b) arrayList.get(i5);
                        r8.add(new C0158b(com.amazon.aps.iva.aq.j.j(c0158b3.b, i, i2) - i, com.amazon.aps.iva.aq.j.j(c0158b3.c, i, i2) - i, c0158b3.a));
                    }
                }
                if (r8 != 0) {
                    int size4 = r8.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        C0158b c0158b4 = (C0158b) r8.get(i6);
                        n nVar = (n) c0158b4.a;
                        int i7 = c0158b4.c + length;
                        com.amazon.aps.iva.yb0.j.f(nVar, "style");
                        this.d.add(new C0157a(nVar, c0158b4.b + length, i7, null, 8));
                    }
                }
                if (i != i2 && (r1 = bVar.e) != 0) {
                    if (i != 0 || i2 < str.length()) {
                        ArrayList arrayList2 = new ArrayList(r1.size());
                        int size5 = r1.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            Object obj2 = r1.get(i8);
                            C0158b c0158b5 = (C0158b) obj2;
                            if (com.amazon.aps.iva.c2.c.c(i, i2, c0158b5.b, c0158b5.c)) {
                                arrayList2.add(obj2);
                            }
                        }
                        r1 = new ArrayList(arrayList2.size());
                        int size6 = arrayList2.size();
                        for (int i9 = 0; i9 < size6; i9++) {
                            C0158b c0158b6 = (C0158b) arrayList2.get(i9);
                            r1.add(new C0158b(c0158b6.a, c0158b6.d, com.amazon.aps.iva.aq.j.j(c0158b6.b, i, i2) - i, com.amazon.aps.iva.aq.j.j(c0158b6.c, i, i2) - i));
                        }
                    }
                    list = r1;
                }
                if (list != null) {
                    int size7 = list.size();
                    for (int i10 = 0; i10 < size7; i10++) {
                        C0158b c0158b7 = (C0158b) list.get(i10);
                        this.e.add(new C0157a(c0158b7.a, c0158b7.d, c0158b7.b + length, c0158b7.c + length));
                    }
                }
            } else {
                sb.append(charSequence, i, i2);
            }
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            this();
            com.amazon.aps.iva.yb0.j.f(bVar, "text");
            b(bVar);
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) {
            this.b.append(c);
            return this;
        }
    }

    /* compiled from: AnnotatedString.kt */
    /* renamed from: com.amazon.aps.iva.c2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0158b<T> {
        public final T a;
        public final int b;
        public final int c;
        public final String d;

        /* JADX WARN: Multi-variable type inference failed */
        public C0158b(Object obj, String str, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(str, "tag");
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (!(i <= i2)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0158b)) {
                return false;
            }
            C0158b c0158b = (C0158b) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, c0158b.a) && this.b == c0158b.b && this.c == c0158b.c && com.amazon.aps.iva.yb0.j.a(this.d, c0158b.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            T t = this.a;
            if (t == null) {
                hashCode = 0;
            } else {
                hashCode = t.hashCode();
            }
            return this.d.hashCode() + com.amazon.aps.iva.a0.r.a(this.c, com.amazon.aps.iva.a0.r.a(this.b, hashCode * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.a);
            sb.append(", start=");
            sb.append(this.b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", tag=");
            return t1.b(sb, this.d, ')');
        }

        public C0158b(int i, int i2, Object obj) {
            this(obj, "", i, i2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(java.lang.String r3, java.util.ArrayList r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            com.amazon.aps.iva.lb0.z r1 = com.amazon.aps.iva.lb0.z.b
            if (r0 == 0) goto L7
            r4 = r1
        L7:
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto Ld
            goto Le
        Ld:
            r1 = r0
        Le:
            java.lang.String r5 = "text"
            com.amazon.aps.iva.yb0.j.f(r3, r5)
            java.lang.String r5 = "spanStyles"
            com.amazon.aps.iva.yb0.j.f(r4, r5)
            java.lang.String r5 = "paragraphStyles"
            com.amazon.aps.iva.yb0.j.f(r1, r5)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L26
            r4 = r0
        L26:
            java.util.List r4 = (java.util.List) r4
            r2.<init>(r3, r4, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c2.b.<init>(java.lang.String, java.util.ArrayList, int):void");
    }
}
