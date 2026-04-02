package l.c.a.w;

import e.j.d.w;
/* loaded from: classes2.dex */
public final class h implements f {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9808b;

    public h(int i2, l.c.a.b bVar, g gVar) {
        w.k0(bVar, "dayOfWeek");
        this.a = i2;
        this.f9808b = bVar.getValue();
    }

    @Override // l.c.a.w.f
    public d adjustInto(d dVar) {
        int i2 = dVar.get(a.DAY_OF_WEEK);
        int i3 = this.a;
        if (i3 >= 2 || i2 != this.f9808b) {
            if ((i3 & 1) == 0) {
                int i4 = i2 - this.f9808b;
                return dVar.h(i4 >= 0 ? 7 - i4 : -i4, b.DAYS);
            }
            int i5 = this.f9808b - i2;
            return dVar.f(i5 >= 0 ? 7 - i5 : -i5, b.DAYS);
        }
        return dVar;
    }
}
