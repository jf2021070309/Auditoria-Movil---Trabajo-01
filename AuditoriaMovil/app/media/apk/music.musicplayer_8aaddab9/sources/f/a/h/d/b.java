package f.a.h.d;
/* loaded from: classes2.dex */
public final class b<T> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f8918b;

    /* renamed from: c  reason: collision with root package name */
    public int f8919c;

    /* renamed from: d  reason: collision with root package name */
    public T[] f8920d;

    public b() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.a = numberOfLeadingZeros - 1;
        this.f8919c = (int) (numberOfLeadingZeros * 0.75f);
        this.f8920d = (T[]) new Object[numberOfLeadingZeros];
    }

    public static int b(int i2) {
        int i3 = i2 * (-1640531527);
        return i3 ^ (i3 >>> 16);
    }

    public boolean a(T t) {
        T t2;
        T[] tArr = this.f8920d;
        int i2 = this.a;
        int b2 = b(t.hashCode()) & i2;
        T t3 = tArr[b2];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                b2 = (b2 + 1) & i2;
                t2 = tArr[b2];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[b2] = t;
        int i3 = this.f8918b + 1;
        this.f8918b = i3;
        if (i3 >= this.f8919c) {
            T[] tArr2 = this.f8920d;
            int length = tArr2.length;
            int i4 = length << 1;
            int i5 = i4 - 1;
            T[] tArr3 = (T[]) new Object[i4];
            while (true) {
                int i6 = i3 - 1;
                if (i3 == 0) {
                    break;
                }
                do {
                    length--;
                } while (tArr2[length] == null);
                int b3 = b(tArr2[length].hashCode()) & i5;
                if (tArr3[b3] != null) {
                    do {
                        b3 = (b3 + 1) & i5;
                    } while (tArr3[b3] != null);
                }
                tArr3[b3] = tArr2[length];
                i3 = i6;
            }
            this.a = i5;
            this.f8919c = (int) (i4 * 0.75f);
            this.f8920d = tArr3;
        }
        return true;
    }
}
