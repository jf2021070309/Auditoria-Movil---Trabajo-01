package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.c2.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AnnotatedString.kt */
/* loaded from: classes.dex */
public final class c {
    public static final b a = new b("", null, 6);

    public static final ArrayList a(int i, int i2, List list) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj = list.get(i3);
                    b.C0158b c0158b = (b.C0158b) obj;
                    if (c(i, i2, c0158b.b, c0158b.c)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    b.C0158b c0158b2 = (b.C0158b) arrayList.get(i4);
                    arrayList2.add(new b.C0158b(c0158b2.a, c0158b2.d, Math.max(i, c0158b2.b) - i, Math.min(i2, c0158b2.c) - i));
                }
                if (!arrayList2.isEmpty()) {
                    return arrayList2;
                }
            }
            return null;
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
    }

    public static final List<b.C0158b<u>> b(b bVar, int i, int i2) {
        List<b.C0158b<u>> list;
        if (i == i2 || (list = bVar.c) == null) {
            return null;
        }
        if (i == 0 && i2 >= bVar.b.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            b.C0158b<u> c0158b = list.get(i3);
            b.C0158b<u> c0158b2 = c0158b;
            if (c(i, i2, c0158b2.b, c0158b2.c)) {
                arrayList.add(c0158b);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            b.C0158b c0158b3 = (b.C0158b) arrayList.get(i4);
            arrayList2.add(new b.C0158b(com.amazon.aps.iva.aq.j.j(c0158b3.b, i, i2) - i, com.amazon.aps.iva.aq.j.j(c0158b3.c, i, i2) - i, c0158b3.a));
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
        if (r1 == r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0033, code lost:
        if (r4 == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(int r4, int r5, int r6, int r7) {
        /*
            int r0 = java.lang.Math.max(r4, r6)
            int r1 = java.lang.Math.min(r5, r7)
            r2 = 1
            if (r0 < r1) goto L3c
            r0 = 0
            if (r4 > r6) goto L20
            if (r7 > r5) goto L20
            if (r5 != r7) goto L1e
            if (r6 != r7) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = r0
        L17:
            if (r4 != r5) goto L1b
            r3 = r2
            goto L1c
        L1b:
            r3 = r0
        L1c:
            if (r1 != r3) goto L20
        L1e:
            r1 = r2
            goto L21
        L20:
            r1 = r0
        L21:
            if (r1 != 0) goto L3c
            if (r6 > r4) goto L37
            if (r5 > r7) goto L37
            if (r7 != r5) goto L35
            if (r4 != r5) goto L2d
            r4 = r2
            goto L2e
        L2d:
            r4 = r0
        L2e:
            if (r6 != r7) goto L32
            r5 = r2
            goto L33
        L32:
            r5 = r0
        L33:
            if (r4 != r5) goto L37
        L35:
            r4 = r2
            goto L38
        L37:
            r4 = r0
        L38:
            if (r4 == 0) goto L3b
            goto L3c
        L3b:
            r2 = r0
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c2.c.c(int, int, int, int):boolean");
    }
}
