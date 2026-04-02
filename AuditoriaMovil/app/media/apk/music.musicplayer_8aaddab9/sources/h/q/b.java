package h.q;

import h.l.h;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class b extends h {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8952b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8953c;

    /* renamed from: d  reason: collision with root package name */
    public int f8954d;

    public b(int i2, int i3, int i4) {
        this.a = i4;
        this.f8952b = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f8953c = z;
        this.f8954d = z ? i2 : i3;
    }

    @Override // h.l.h
    public int a() {
        int i2 = this.f8954d;
        if (i2 != this.f8952b) {
            this.f8954d = this.a + i2;
        } else if (!this.f8953c) {
            throw new NoSuchElementException();
        } else {
            this.f8953c = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8953c;
    }
}
