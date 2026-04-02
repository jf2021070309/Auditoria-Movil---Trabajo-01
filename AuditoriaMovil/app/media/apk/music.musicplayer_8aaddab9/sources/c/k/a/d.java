package c.k.a;

import android.graphics.Rect;
import c.k.a.a;
import java.util.Comparator;
/* loaded from: classes.dex */
public class d<T> implements Comparator<T> {
    public final Rect a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final Rect f2267b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2268c;

    /* renamed from: d  reason: collision with root package name */
    public final b<T> f2269d;

    public d(boolean z, b<T> bVar) {
        this.f2268c = z;
        this.f2269d = bVar;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        Rect rect = this.a;
        Rect rect2 = this.f2267b;
        ((a.C0044a) this.f2269d).a(t, rect);
        ((a.C0044a) this.f2269d).a(t2, rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        if (i4 < i5) {
            return this.f2268c ? 1 : -1;
        } else if (i4 > i5) {
            return this.f2268c ? -1 : 1;
        } else {
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.right;
            int i9 = rect2.right;
            if (i8 < i9) {
                return this.f2268c ? 1 : -1;
            } else if (i8 > i9) {
                return this.f2268c ? -1 : 1;
            } else {
                return 0;
            }
        }
    }
}
