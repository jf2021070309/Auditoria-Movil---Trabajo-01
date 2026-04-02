package c.f;
/* loaded from: classes.dex */
public class i<E> implements Cloneable {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public int[] f1666b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f1667c;

    /* renamed from: d  reason: collision with root package name */
    public int f1668d;

    public i() {
        int e2 = d.e(10);
        this.f1666b = new int[e2];
        this.f1667c = new Object[e2];
    }

    public void a(int i2, E e2) {
        int i3 = this.f1668d;
        if (i3 != 0 && i2 <= this.f1666b[i3 - 1]) {
            f(i2, e2);
            return;
        }
        if (i3 >= this.f1666b.length) {
            int e3 = d.e(i3 + 1);
            int[] iArr = new int[e3];
            Object[] objArr = new Object[e3];
            int[] iArr2 = this.f1666b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1667c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1666b = iArr;
            this.f1667c = objArr;
        }
        this.f1666b[i3] = i2;
        this.f1667c[i3] = e2;
        this.f1668d = i3 + 1;
    }

    /* renamed from: b */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f1666b = (int[]) this.f1666b.clone();
            iVar.f1667c = (Object[]) this.f1667c.clone();
            return iVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E c(int i2) {
        return d(i2, null);
    }

    public E d(int i2, E e2) {
        int a2 = d.a(this.f1666b, this.f1668d, i2);
        if (a2 >= 0) {
            Object[] objArr = this.f1667c;
            if (objArr[a2] != a) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public int e(int i2) {
        return this.f1666b[i2];
    }

    public void f(int i2, E e2) {
        int a2 = d.a(this.f1666b, this.f1668d, i2);
        if (a2 >= 0) {
            this.f1667c[a2] = e2;
            return;
        }
        int i3 = a2 ^ (-1);
        int i4 = this.f1668d;
        if (i3 < i4) {
            Object[] objArr = this.f1667c;
            if (objArr[i3] == a) {
                this.f1666b[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (i4 >= this.f1666b.length) {
            int e3 = d.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f1666b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1667c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1666b = iArr;
            this.f1667c = objArr2;
        }
        int i5 = this.f1668d - i3;
        if (i5 != 0) {
            int[] iArr3 = this.f1666b;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5);
            Object[] objArr4 = this.f1667c;
            System.arraycopy(objArr4, i3, objArr4, i6, this.f1668d - i3);
        }
        this.f1666b[i3] = i2;
        this.f1667c[i3] = e2;
        this.f1668d++;
    }

    public int g() {
        return this.f1668d;
    }

    public E j(int i2) {
        return (E) this.f1667c[i2];
    }

    public String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1668d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1668d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            E j2 = j(i2);
            if (j2 != this) {
                sb.append(j2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
