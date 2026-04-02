package c.f;
/* loaded from: classes.dex */
public class e<E> implements Cloneable {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1647b = false;

    /* renamed from: c  reason: collision with root package name */
    public long[] f1648c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f1649d;

    /* renamed from: e  reason: collision with root package name */
    public int f1650e;

    public e() {
        int f2 = d.f(10);
        this.f1648c = new long[f2];
        this.f1649d = new Object[f2];
    }

    public void a(long j2, E e2) {
        int i2 = this.f1650e;
        if (i2 != 0 && j2 <= this.f1648c[i2 - 1]) {
            g(j2, e2);
            return;
        }
        if (this.f1647b && i2 >= this.f1648c.length) {
            d();
        }
        int i3 = this.f1650e;
        if (i3 >= this.f1648c.length) {
            int f2 = d.f(i3 + 1);
            long[] jArr = new long[f2];
            Object[] objArr = new Object[f2];
            long[] jArr2 = this.f1648c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1649d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1648c = jArr;
            this.f1649d = objArr;
        }
        this.f1648c[i3] = j2;
        this.f1649d[i3] = e2;
        this.f1650e = i3 + 1;
    }

    public void b() {
        int i2 = this.f1650e;
        Object[] objArr = this.f1649d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1650e = 0;
        this.f1647b = false;
    }

    /* renamed from: c */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f1648c = (long[]) this.f1648c.clone();
            eVar.f1649d = (Object[]) this.f1649d.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void d() {
        int i2 = this.f1650e;
        long[] jArr = this.f1648c;
        Object[] objArr = this.f1649d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != a) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1647b = false;
        this.f1650e = i3;
    }

    public E e(long j2) {
        return f(j2, null);
    }

    public E f(long j2, E e2) {
        int b2 = d.b(this.f1648c, this.f1650e, j2);
        if (b2 >= 0) {
            Object[] objArr = this.f1649d;
            if (objArr[b2] != a) {
                return (E) objArr[b2];
            }
        }
        return e2;
    }

    public void g(long j2, E e2) {
        int b2 = d.b(this.f1648c, this.f1650e, j2);
        if (b2 >= 0) {
            this.f1649d[b2] = e2;
            return;
        }
        int i2 = b2 ^ (-1);
        int i3 = this.f1650e;
        if (i2 < i3) {
            Object[] objArr = this.f1649d;
            if (objArr[i2] == a) {
                this.f1648c[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f1647b && i3 >= this.f1648c.length) {
            d();
            i2 = d.b(this.f1648c, this.f1650e, j2) ^ (-1);
        }
        int i4 = this.f1650e;
        if (i4 >= this.f1648c.length) {
            int f2 = d.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f1648c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1649d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1648c = jArr;
            this.f1649d = objArr2;
        }
        int i5 = this.f1650e;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f1648c;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f1649d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f1650e - i2);
        }
        this.f1648c[i2] = j2;
        this.f1649d[i2] = e2;
        this.f1650e++;
    }

    public int j() {
        if (this.f1647b) {
            d();
        }
        return this.f1650e;
    }

    public E k(int i2) {
        if (this.f1647b) {
            d();
        }
        return (E) this.f1649d[i2];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1650e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1650e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f1647b) {
                d();
            }
            sb.append(this.f1648c[i2]);
            sb.append('=');
            E k2 = k(i2);
            if (k2 != this) {
                sb.append(k2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
