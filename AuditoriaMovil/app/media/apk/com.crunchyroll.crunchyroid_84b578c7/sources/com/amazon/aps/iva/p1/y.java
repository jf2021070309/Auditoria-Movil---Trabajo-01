package com.amazon.aps.iva.p1;

import java.util.List;
/* compiled from: PointerEvent.kt */
/* loaded from: classes.dex */
public final class y {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final List<f> k;
    public e l;

    public y() {
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        com.amazon.aps.iva.yb0.j.f(list, "historical");
        this.k = list;
    }

    public final void a() {
        e eVar = this.l;
        eVar.b = true;
        eVar.a = true;
    }

    public final boolean b() {
        e eVar = this.l;
        if (!eVar.b && !eVar.a) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) x.b(this.a));
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append((Object) com.amazon.aps.iva.e1.c.h(this.c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append((Object) com.amazon.aps.iva.e1.c.h(this.g));
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i = this.i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "Unknown";
                    } else {
                        str = "Eraser";
                    }
                } else {
                    str = "Stylus";
                }
            } else {
                str = "Mouse";
            }
        } else {
            str = "Touch";
        }
        sb.append((Object) str);
        sb.append(", historical=");
        Object obj = this.k;
        if (obj == null) {
            obj = com.amazon.aps.iva.lb0.z.b;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) com.amazon.aps.iva.e1.c.h(this.j));
        sb.append(')');
        return sb.toString();
    }

    public y(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.l = new e(z3, z3);
    }
}
