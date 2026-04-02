package e.d.b.d.w;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class b implements c {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6589b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).a;
            f2 += ((b) cVar).f6589b;
        }
        this.a = cVar;
        this.f6589b = f2;
    }

    @Override // e.d.b.d.w.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.f6589b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.f6589b == bVar.f6589b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.f6589b)});
    }
}
