package c.g.a;
/* loaded from: classes.dex */
public class e<T> {
    public final Object[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f1698b;

    public e(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i2];
    }

    public T a() {
        int i2 = this.f1698b;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = this.a;
            T t = (T) objArr[i3];
            objArr[i3] = null;
            this.f1698b = i2 - 1;
            return t;
        }
        return null;
    }

    public boolean b(T t) {
        int i2 = this.f1698b;
        Object[] objArr = this.a;
        if (i2 < objArr.length) {
            objArr[i2] = t;
            this.f1698b = i2 + 1;
            return true;
        }
        return false;
    }
}
