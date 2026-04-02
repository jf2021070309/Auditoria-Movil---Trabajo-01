package com.amazon.aps.iva.t4;

import com.amazon.aps.iva.yb0.j;
/* compiled from: LazyVerticalGrid.kt */
/* loaded from: classes.dex */
public abstract class f {

    /* compiled from: LazyVerticalGrid.kt */
    /* loaded from: classes.dex */
    public static final class a extends f {
        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!j.a(a.class, cls)) {
                return false;
            }
            j.d(obj, "null cannot be cast to non-null type androidx.glance.appwidget.lazy.GridCells.Adaptive");
            a aVar = (a) obj;
            if (com.amazon.aps.iva.o2.e.a(0.0f, 0.0f)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(0.0f);
        }
    }

    /* compiled from: LazyVerticalGrid.kt */
    /* loaded from: classes.dex */
    public static final class b extends f {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!j.a(b.class, cls)) {
                return false;
            }
            j.d(obj, "null cannot be cast to non-null type androidx.glance.appwidget.lazy.GridCells.Fixed");
            if (this.a == ((b) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a;
        }
    }
}
