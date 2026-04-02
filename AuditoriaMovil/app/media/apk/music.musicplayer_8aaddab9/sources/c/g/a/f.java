package c.g.a;

import c.g.a.b;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public class f extends c.g.a.b {

    /* renamed from: f  reason: collision with root package name */
    public int f1699f;

    /* renamed from: g  reason: collision with root package name */
    public g[] f1700g;

    /* renamed from: h  reason: collision with root package name */
    public g[] f1701h;

    /* renamed from: i  reason: collision with root package name */
    public int f1702i;

    /* renamed from: j  reason: collision with root package name */
    public b f1703j;

    /* loaded from: classes.dex */
    public class a implements Comparator<g> {
        public a(f fVar) {
        }

        @Override // java.util.Comparator
        public int compare(g gVar, g gVar2) {
            return gVar.f1706c - gVar2.f1706c;
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public g a;

        public b(f fVar) {
        }

        public String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    StringBuilder y = e.a.d.a.a.y(str);
                    y.append(this.a.f1712i[i2]);
                    y.append(" ");
                    str = y.toString();
                }
            }
            StringBuilder A = e.a.d.a.a.A(str, "] ");
            A.append(this.a);
            return A.toString();
        }
    }

    public f(c cVar) {
        super(cVar);
        this.f1699f = 128;
        this.f1700g = new g[128];
        this.f1701h = new g[128];
        this.f1702i = 0;
        this.f1703j = new b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r8 < r7) goto L33;
     */
    @Override // c.g.a.b, c.g.a.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c.g.a.g a(c.g.a.d r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = 0
            r0 = -1
            r1 = 0
            r2 = -1
        L4:
            int r3 = r10.f1702i
            if (r1 >= r3) goto L5d
            c.g.a.g[] r3 = r10.f1700g
            r4 = r3[r1]
            int r5 = r4.f1706c
            boolean r5 = r12[r5]
            if (r5 == 0) goto L13
            goto L5a
        L13:
            c.g.a.f$b r5 = r10.f1703j
            r5.a = r4
            r4 = 8
            r6 = 1
            if (r2 != r0) goto L39
            java.util.Objects.requireNonNull(r5)
        L1f:
            if (r4 < 0) goto L35
            c.g.a.g r3 = r5.a
            float[] r3 = r3.f1712i
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2d
            goto L35
        L2d:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L32
            goto L36
        L32:
            int r4 = r4 + (-1)
            goto L1f
        L35:
            r6 = 0
        L36:
            if (r6 == 0) goto L5a
            goto L59
        L39:
            r3 = r3[r2]
            java.util.Objects.requireNonNull(r5)
        L3e:
            if (r4 < 0) goto L56
            float[] r7 = r3.f1712i
            r7 = r7[r4]
            c.g.a.g r8 = r5.a
            float[] r8 = r8.f1712i
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L51
            int r4 = r4 + (-1)
            goto L3e
        L51:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L56
            goto L57
        L56:
            r6 = 0
        L57:
            if (r6 == 0) goto L5a
        L59:
            r2 = r1
        L5a:
            int r1 = r1 + 1
            goto L4
        L5d:
            if (r2 != r0) goto L61
            r11 = 0
            return r11
        L61:
            c.g.a.g[] r11 = r10.f1700g
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.a.f.a(c.g.a.d, boolean[]):c.g.a.g");
    }

    @Override // c.g.a.b, c.g.a.d.a
    public void b(g gVar) {
        this.f1703j.a = gVar;
        Arrays.fill(gVar.f1712i, 0.0f);
        gVar.f1712i[gVar.f1708e] = 1.0f;
        m(gVar);
    }

    @Override // c.g.a.b, c.g.a.d.a
    public void clear() {
        this.f1702i = 0;
        this.f1678b = 0.0f;
    }

    @Override // c.g.a.b, c.g.a.d.a
    public boolean isEmpty() {
        return this.f1702i == 0;
    }

    @Override // c.g.a.b
    public void l(d dVar, c.g.a.b bVar, boolean z) {
        g gVar = bVar.a;
        if (gVar == null) {
            return;
        }
        b.a aVar = bVar.f1680d;
        int a2 = aVar.a();
        for (int i2 = 0; i2 < a2; i2++) {
            g e2 = aVar.e(i2);
            float h2 = aVar.h(i2);
            b bVar2 = this.f1703j;
            bVar2.a = e2;
            boolean z2 = true;
            if (e2.f1705b) {
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = bVar2.a.f1712i;
                    fArr[i3] = (gVar.f1712i[i3] * h2) + fArr[i3];
                    if (Math.abs(fArr[i3]) < 1.0E-4f) {
                        bVar2.a.f1712i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    f.this.n(bVar2.a);
                }
                z2 = false;
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = gVar.f1712i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * h2;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        bVar2.a.f1712i[i4] = f3;
                    } else {
                        bVar2.a.f1712i[i4] = 0.0f;
                    }
                }
            }
            if (z2) {
                m(e2);
            }
            this.f1678b = (bVar.f1678b * h2) + this.f1678b;
        }
        n(gVar);
    }

    public final void m(g gVar) {
        int i2;
        int i3 = this.f1702i + 1;
        g[] gVarArr = this.f1700g;
        if (i3 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.f1700g = gVarArr2;
            this.f1701h = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.f1700g;
        int i4 = this.f1702i;
        gVarArr3[i4] = gVar;
        int i5 = i4 + 1;
        this.f1702i = i5;
        if (i5 > 1 && gVarArr3[i5 - 1].f1706c > gVar.f1706c) {
            int i6 = 0;
            while (true) {
                i2 = this.f1702i;
                if (i6 >= i2) {
                    break;
                }
                this.f1701h[i6] = this.f1700g[i6];
                i6++;
            }
            Arrays.sort(this.f1701h, 0, i2, new a(this));
            for (int i7 = 0; i7 < this.f1702i; i7++) {
                this.f1700g[i7] = this.f1701h[i7];
            }
        }
        gVar.f1705b = true;
        gVar.a(this);
    }

    public final void n(g gVar) {
        int i2 = 0;
        while (i2 < this.f1702i) {
            if (this.f1700g[i2] == gVar) {
                while (true) {
                    int i3 = this.f1702i;
                    if (i2 >= i3 - 1) {
                        this.f1702i = i3 - 1;
                        gVar.f1705b = false;
                        return;
                    }
                    g[] gVarArr = this.f1700g;
                    int i4 = i2 + 1;
                    gVarArr[i2] = gVarArr[i4];
                    i2 = i4;
                }
            } else {
                i2++;
            }
        }
    }

    @Override // c.g.a.b
    public String toString() {
        StringBuilder A = e.a.d.a.a.A("", " goal -> (");
        A.append(this.f1678b);
        A.append(") : ");
        String sb = A.toString();
        for (int i2 = 0; i2 < this.f1702i; i2++) {
            this.f1703j.a = this.f1700g[i2];
            StringBuilder y = e.a.d.a.a.y(sb);
            y.append(this.f1703j);
            y.append(" ");
            sb = y.toString();
        }
        return sb;
    }
}
