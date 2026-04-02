package c.i.d.c;

import java.util.List;
/* loaded from: classes.dex */
public final class i {
    public final int[] a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f2016b;

    public i(int i2, int i3) {
        this.a = new int[]{i2, i3};
        this.f2016b = new float[]{0.0f, 1.0f};
    }

    public i(int i2, int i3, int i4) {
        this.a = new int[]{i2, i3, i4};
        this.f2016b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public i(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.a = new int[size];
        this.f2016b = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            this.a[i2] = list.get(i2).intValue();
            this.f2016b[i2] = list2.get(i2).floatValue();
        }
    }
}
