package com.amazon.aps.iva.q4;

import com.amazon.aps.iva.yb0.j;
import java.util.Map;
/* compiled from: ActionParameters.kt */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: ActionParameters.kt */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (j.a(this.a, ((a) obj).a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return this.a;
        }
    }

    /* compiled from: ActionParameters.kt */
    /* loaded from: classes.dex */
    public static final class b<T> {
        public final a<T> a;
        public final T b;

        public b(a<T> aVar, T t) {
            j.f(aVar, "key");
            j.f(t, "value");
            this.a = aVar;
            this.b = t;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(this.a.a);
            sb.append(", ");
            return defpackage.b.b(sb, this.b, ')');
        }
    }

    public abstract Map<a<? extends Object>, Object> a();

    public abstract <T> T b(a<T> aVar);

    public abstract boolean c();
}
