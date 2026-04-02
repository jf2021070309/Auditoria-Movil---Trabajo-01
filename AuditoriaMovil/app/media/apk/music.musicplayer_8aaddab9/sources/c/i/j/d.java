package c.i.j;
/* loaded from: classes.dex */
public class d<T> implements c<T> {
    public final Object[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f2127b;

    public d(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i2];
    }

    @Override // c.i.j.c
    public boolean a(T t) {
        int i2;
        boolean z;
        int i3 = 0;
        while (true) {
            i2 = this.f2127b;
            if (i3 >= i2) {
                z = false;
                break;
            } else if (this.a[i3] == t) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        Object[] objArr = this.a;
        if (i2 < objArr.length) {
            objArr[i2] = t;
            this.f2127b = i2 + 1;
            return true;
        }
        return false;
    }

    @Override // c.i.j.c
    public T b() {
        int i2 = this.f2127b;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = this.a;
            T t = (T) objArr[i3];
            objArr[i3] = null;
            this.f2127b = i2 - 1;
            return t;
        }
        return null;
    }
}
