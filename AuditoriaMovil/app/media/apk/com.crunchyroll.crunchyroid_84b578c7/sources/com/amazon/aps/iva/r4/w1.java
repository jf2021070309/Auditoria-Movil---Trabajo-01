package com.amazon.aps.iva.r4;

import java.util.Set;
/* compiled from: SizeMode.kt */
/* loaded from: classes.dex */
public interface w1 {

    /* compiled from: SizeMode.kt */
    /* loaded from: classes.dex */
    public static final class a implements w1 {
        public final Set<com.amazon.aps.iva.o2.g> a;

        public a(Set<com.amazon.aps.iva.o2.g> set) {
            this.a = set;
            if (!set.isEmpty()) {
                return;
            }
            throw new IllegalArgumentException("The set of sizes cannot be empty".toString());
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
            if (!com.amazon.aps.iva.yb0.j.a(a.class, cls)) {
                return false;
            }
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.glance.appwidget.SizeMode.Responsive");
            if (com.amazon.aps.iva.yb0.j.a(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SizeMode.Responsive(sizes=" + this.a + ')';
        }
    }

    /* compiled from: SizeMode.kt */
    /* loaded from: classes.dex */
    public static final class b implements w1 {
        public static final b a = new b();

        public final String toString() {
            return "SizeMode.Single";
        }
    }
}
