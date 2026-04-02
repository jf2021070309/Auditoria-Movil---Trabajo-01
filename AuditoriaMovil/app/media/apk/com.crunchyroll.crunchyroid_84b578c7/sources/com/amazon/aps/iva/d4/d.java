package com.amazon.aps.iva.d4;

import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
/* compiled from: Preferences.kt */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: Preferences.kt */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public final String a;

        public a(String str) {
            j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return j.a(this.a, ((a) obj).a);
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

    /* compiled from: Preferences.kt */
    /* loaded from: classes.dex */
    public static final class b<T> {
        public final a<T> a;
        public final T b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> boolean b(a<T> aVar);

    public abstract <T> T c(a<T> aVar);

    public final com.amazon.aps.iva.d4.a d() {
        return new com.amazon.aps.iva.d4.a((Map<a<?>, Object>) i0.b0(a()), false);
    }

    public final com.amazon.aps.iva.d4.a e() {
        return new com.amazon.aps.iva.d4.a((Map<a<?>, Object>) i0.b0(a()), true);
    }
}
