package rx.internal.util;

import java.util.Arrays;
import rx.functions.Action1;
import rx.internal.util.unsafe.Pow2;
/* loaded from: classes4.dex */
public final class OpenHashSet<T> {
    final float a;
    int b;
    int c;
    int d;
    T[] e;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    public OpenHashSet(int i) {
        this(i, 0.75f);
    }

    public OpenHashSet(int i, float f) {
        this.a = f;
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.b = roundToPowerOfTwo - 1;
        this.d = (int) (roundToPowerOfTwo * f);
        this.e = (T[]) new Object[roundToPowerOfTwo];
    }

    public boolean add(T t) {
        T t2;
        T[] tArr = this.e;
        int i = this.b;
        int a = a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.c + 1;
        this.c = i2;
        if (i2 >= this.d) {
            a();
        }
        return true;
    }

    public boolean remove(T t) {
        T t2;
        T[] tArr = this.e;
        int i = this.b;
        int a = a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return a(a, tArr, i);
    }

    boolean a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = a(t.hashCode()) & i2;
                if (i > i3) {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < a && a <= i3) {
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public void clear(Action1<? super T> action1) {
        if (this.c != 0) {
            T[] tArr = this.e;
            for (T t : tArr) {
                Object obj = (Object) t;
                if (obj != 0) {
                    action1.call(obj);
                }
            }
            Arrays.fill(tArr, (Object) null);
            this.c = 0;
        }
    }

    public void terminate() {
        this.c = 0;
        this.e = (T[]) new Object[0];
    }

    void a() {
        T[] tArr = this.e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = length;
        int i4 = this.c;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                } while (tArr[i3] == null);
                int a = a(tArr[i3].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[i3];
                i4 = i5;
            } else {
                this.b = i2;
                this.d = (int) (i * this.a);
                this.e = tArr2;
                return;
            }
        }
    }

    static int a(int i) {
        int i2 = (-1640531527) * i;
        return i2 ^ (i2 >>> 16);
    }

    public boolean isEmpty() {
        return this.c == 0;
    }

    public T[] values() {
        return this.e;
    }
}
