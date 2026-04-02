package com.amazon.aps.iva.s2;

import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.s2.b;
import java.util.Arrays;
import java.util.Comparator;
/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.s2.b {
    public h[] f;
    public h[] g;
    public int h;
    public final b i;

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<h> {
        @Override // java.util.Comparator
        public final int compare(h hVar, h hVar2) {
            return hVar.c - hVar2.c;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class b {
        public h a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder b = defpackage.c.b(str);
                    b.append(this.a.i[i]);
                    b.append(" ");
                    str = b.toString();
                }
            }
            StringBuilder b2 = x.b(str, "] ");
            b2.append(this.a);
            return b2.toString();
        }
    }

    public g(c cVar) {
        super(cVar);
        this.f = new h[128];
        this.g = new h[128];
        this.h = 0;
        this.i = new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r9 < r8) goto L32;
     */
    @Override // com.amazon.aps.iva.s2.b, com.amazon.aps.iva.s2.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.s2.h a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r11.h
            if (r2 >= r4) goto L57
            com.amazon.aps.iva.s2.h[] r4 = r11.f
            r5 = r4[r2]
            int r6 = r5.c
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L54
        L13:
            com.amazon.aps.iva.s2.g$b r6 = r11.i
            r6.a = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L36
        L1c:
            if (r7 < 0) goto L32
            com.amazon.aps.iva.s2.h r4 = r6.a
            float[] r4 = r4.i
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2a
            goto L32
        L2a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2f
            goto L33
        L2f:
            int r7 = r7 + (-1)
            goto L1c
        L32:
            r5 = r1
        L33:
            if (r5 == 0) goto L54
            goto L53
        L36:
            r4 = r4[r3]
        L38:
            if (r7 < 0) goto L50
            float[] r8 = r4.i
            r8 = r8[r7]
            com.amazon.aps.iva.s2.h r9 = r6.a
            float[] r9 = r9.i
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4b
            int r7 = r7 + (-1)
            goto L38
        L4b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L50
            goto L51
        L50:
            r5 = r1
        L51:
            if (r5 == 0) goto L54
        L53:
            r3 = r2
        L54:
            int r2 = r2 + 1
            goto L4
        L57:
            if (r3 != r0) goto L5b
            r12 = 0
            return r12
        L5b:
            com.amazon.aps.iva.s2.h[] r12 = r11.f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s2.g.a(boolean[]):com.amazon.aps.iva.s2.h");
    }

    @Override // com.amazon.aps.iva.s2.b
    public final boolean e() {
        if (this.h == 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.s2.b
    public final void i(d dVar, com.amazon.aps.iva.s2.b bVar, boolean z) {
        boolean z2;
        h hVar = bVar.a;
        if (hVar == null) {
            return;
        }
        b.a aVar = bVar.d;
        int f = aVar.f();
        for (int i = 0; i < f; i++) {
            h b2 = aVar.b(i);
            float h = aVar.h(i);
            b bVar2 = this.i;
            bVar2.a = b2;
            boolean z3 = b2.b;
            float[] fArr = hVar.i;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = bVar2.a.i;
                    float f2 = (fArr[i2] * h) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        bVar2.a.i[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    g.this.k(bVar2.a);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * h;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        bVar2.a.i[i3] = f4;
                    } else {
                        bVar2.a.i[i3] = 0.0f;
                    }
                }
                z2 = true;
            }
            if (z2) {
                j(b2);
            }
            this.b = (bVar.b * h) + this.b;
        }
        k(hVar);
    }

    public final void j(h hVar) {
        int i;
        int i2 = this.h + 1;
        h[] hVarArr = this.f;
        if (i2 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f = hVarArr2;
            this.g = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.f;
        int i3 = this.h;
        hVarArr3[i3] = hVar;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && hVarArr3[i4 - 1].c > hVar.c) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new a());
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        hVar.b = true;
        hVar.a(this);
    }

    public final void k(h hVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == hVar) {
                while (true) {
                    int i2 = this.h;
                    if (i < i2 - 1) {
                        h[] hVarArr = this.f;
                        int i3 = i + 1;
                        hVarArr[i] = hVarArr[i3];
                        i = i3;
                    } else {
                        this.h = i2 - 1;
                        hVar.b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // com.amazon.aps.iva.s2.b
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            h hVar = this.f[i];
            b bVar = this.i;
            bVar.a = hVar;
            str = str + bVar + " ";
        }
        return str;
    }
}
