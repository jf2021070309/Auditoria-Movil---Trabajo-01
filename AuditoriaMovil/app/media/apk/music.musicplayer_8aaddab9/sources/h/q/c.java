package h.q;

import ch.qos.logback.classic.pattern.CallerDataConverter;
/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final c f8955d = null;

    /* renamed from: e  reason: collision with root package name */
    public static final c f8956e = new c(1, 0);

    public c(int i2, int i3) {
        super(i2, i3, 1);
    }

    @Override // h.q.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.a != cVar.a || this.f8950b != cVar.f8950b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // h.q.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.f8950b;
    }

    @Override // h.q.a
    public boolean isEmpty() {
        return this.a > this.f8950b;
    }

    @Override // h.q.a
    public String toString() {
        return this.a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f8950b;
    }
}
