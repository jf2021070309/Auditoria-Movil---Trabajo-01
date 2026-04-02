package com.amazon.aps.iva.p1;

import com.amazon.aps.iva.e4.t0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: InternalPointerInput.kt */
/* loaded from: classes.dex */
public final class b0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List<f> i;
    public final long j;

    public b0() {
        throw null;
    }

    public b0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (!x.a(this.a, b0Var.a) || this.b != b0Var.b || !com.amazon.aps.iva.e1.c.a(this.c, b0Var.c) || !com.amazon.aps.iva.e1.c.a(this.d, b0Var.d) || this.e != b0Var.e || Float.compare(this.f, b0Var.f) != 0) {
            return false;
        }
        if (this.g == b0Var.g) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.h == b0Var.h && com.amazon.aps.iva.yb0.j.a(this.i, b0Var.i) && com.amazon.aps.iva.e1.c.a(this.j, b0Var.j)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = com.amazon.aps.iva.b8.i.a(this.b, Long.hashCode(this.a) * 31, 31);
        int i = com.amazon.aps.iva.e1.c.e;
        int a2 = com.amazon.aps.iva.b8.i.a(this.d, com.amazon.aps.iva.b8.i.a(this.c, a, 31), 31);
        int i2 = 1;
        boolean z = this.e;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int a3 = com.amazon.aps.iva.a0.r.a(this.g, t0.b(this.f, (a2 + i3) * 31, 31), 31);
        boolean z2 = this.h;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        return Long.hashCode(this.j) + defpackage.a.a(this.i, (a3 + i2) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) x.b(this.a));
        sb.append(", uptime=");
        sb.append(this.b);
        sb.append(", positionOnScreen=");
        sb.append((Object) com.amazon.aps.iva.e1.c.h(this.c));
        sb.append(", position=");
        sb.append((Object) com.amazon.aps.iva.e1.c.h(this.d));
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        int i = this.g;
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
        sb.append(", issuesEnterExit=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) com.amazon.aps.iva.e1.c.h(this.j));
        sb.append(')');
        return sb.toString();
    }
}
