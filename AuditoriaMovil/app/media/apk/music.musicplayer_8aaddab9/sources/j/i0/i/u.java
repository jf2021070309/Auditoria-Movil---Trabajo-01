package j.i0.i;
/* loaded from: classes2.dex */
public final class u {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f9490b = new int[10];

    public int a() {
        if ((this.a & 128) != 0) {
            return this.f9490b[7];
        }
        return 65535;
    }

    public u b(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f9490b;
            if (i2 < iArr.length) {
                this.a = (1 << i2) | this.a;
                iArr[i2] = i3;
            }
        }
        return this;
    }
}
