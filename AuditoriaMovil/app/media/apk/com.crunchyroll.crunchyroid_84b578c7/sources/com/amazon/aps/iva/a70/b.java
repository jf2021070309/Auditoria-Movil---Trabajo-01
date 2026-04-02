package com.amazon.aps.iva.a70;

import com.amazon.aps.iva.yb0.j;
/* compiled from: ActionMenuItem.kt */
/* loaded from: classes2.dex */
public class b {
    public final int a;
    public final Integer b;
    public final boolean c;
    public final Integer d;

    public b(int i, Integer num, boolean z, Integer num2) {
        this.a = i;
        this.b = num;
        this.c = z;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!j.a(cls2, cls)) {
            return false;
        }
        j.d(obj, "null cannot be cast to non-null type com.ellation.widgets.actionmenu.ActionMenuItem");
        if (this.a == ((b) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public /* synthetic */ b(int i, Integer num, boolean z, Integer num2, int i2) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? null : num2);
    }
}
