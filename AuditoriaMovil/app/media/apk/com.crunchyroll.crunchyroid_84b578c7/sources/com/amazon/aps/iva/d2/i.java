package com.amazon.aps.iva.d2;

import android.text.Layout;
import java.util.ArrayList;
/* compiled from: LayoutHelper.kt */
/* loaded from: classes.dex */
public final class i {
    public final Layout a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean[] d;
    public char[] e;

    /* compiled from: LayoutHelper.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int a = com.amazon.aps.iva.a0.r.a(this.b, Integer.hashCode(this.a) * 31, 31);
            boolean z = this.c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(this.a);
            sb.append(", end=");
            sb.append(this.b);
            sb.append(", isRtl=");
            return defpackage.a.b(sb, this.c, ')');
        }
    }

    public i(Layout layout) {
        com.amazon.aps.iva.yb0.j.f(layout, "layout");
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            CharSequence text = this.a.getText();
            com.amazon.aps.iva.yb0.j.e(text, "layout.text");
            int q0 = com.amazon.aps.iva.oe0.q.q0(text, '\n', i, false, 4);
            if (q0 < 0) {
                i = this.a.getText().length();
            } else {
                i = q0 + 1;
            }
            arrayList.add(Integer.valueOf(i));
        } while (i < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.b.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01df, code lost:
        if (r10 == r1.c) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d2.i.a(int, boolean, boolean):float");
    }

    public final int b(int i) {
        boolean z;
        while (i > 0) {
            char charAt = this.a.getText().charAt(i - 1);
            boolean z2 = true;
            if (charAt != ' ' && charAt != '\n' && charAt != 5760) {
                if (8192 <= charAt && charAt < 8203) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!z || charAt == 8199) && charAt != 8287 && charAt != 12288) {
                    z2 = false;
                }
            }
            if (!z2) {
                break;
            }
            i--;
        }
        return i;
    }
}
