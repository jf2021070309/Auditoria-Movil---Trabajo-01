package c.g.a;

import java.util.Arrays;
/* loaded from: classes.dex */
public class g implements Comparable<g> {
    public static int a = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1705b;

    /* renamed from: f  reason: collision with root package name */
    public float f1709f;

    /* renamed from: j  reason: collision with root package name */
    public a f1713j;

    /* renamed from: c  reason: collision with root package name */
    public int f1706c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f1707d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f1708e = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1710g = false;

    /* renamed from: h  reason: collision with root package name */
    public float[] f1711h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public float[] f1712i = new float[9];

    /* renamed from: k  reason: collision with root package name */
    public b[] f1714k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    public int f1715l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f1716m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f1717n = -1;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public g(a aVar) {
        this.f1713j = aVar;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f1715l;
            if (i2 >= i3) {
                b[] bVarArr = this.f1714k;
                if (i3 >= bVarArr.length) {
                    this.f1714k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f1714k;
                int i4 = this.f1715l;
                bVarArr2[i4] = bVar;
                this.f1715l = i4 + 1;
                return;
            } else if (this.f1714k[i2] == bVar) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void b(b bVar) {
        int i2 = this.f1715l;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f1714k[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.f1714k;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f1715l--;
                return;
            }
            i3++;
        }
    }

    public void c() {
        this.f1713j = a.UNKNOWN;
        this.f1708e = 0;
        this.f1706c = -1;
        this.f1707d = -1;
        this.f1709f = 0.0f;
        this.f1710g = false;
        this.f1717n = -1;
        int i2 = this.f1715l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1714k[i3] = null;
        }
        this.f1715l = 0;
        this.f1716m = 0;
        this.f1705b = false;
        Arrays.fill(this.f1712i, 0.0f);
    }

    @Override // java.lang.Comparable
    public int compareTo(g gVar) {
        return this.f1706c - gVar.f1706c;
    }

    public void d(d dVar, float f2) {
        this.f1709f = f2;
        this.f1710g = true;
        this.f1717n = -1;
        int i2 = this.f1715l;
        this.f1707d = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1714k[i3].k(dVar, this, false);
        }
        this.f1715l = 0;
    }

    public final void e(d dVar, b bVar) {
        int i2 = this.f1715l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1714k[i3].l(dVar, bVar, false);
        }
        this.f1715l = 0;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("");
        y.append(this.f1706c);
        return y.toString();
    }
}
