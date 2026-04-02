package com.amazon.aps.iva.md0;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: JvmMemberSignature.kt */
/* loaded from: classes4.dex */
public abstract class d {

    /* compiled from: JvmMemberSignature.kt */
    /* loaded from: classes4.dex */
    public static final class a extends d {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            j.f(str2, "desc");
            this.a = str;
            this.b = str2;
        }

        @Override // com.amazon.aps.iva.md0.d
        public final String a() {
            return this.a + ':' + this.b;
        }

        @Override // com.amazon.aps.iva.md0.d
        public final String b() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.md0.d
        public final String c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    /* loaded from: classes4.dex */
    public static final class b extends d {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            j.f(str2, "desc");
            this.a = str;
            this.b = str2;
        }

        @Override // com.amazon.aps.iva.md0.d
        public final String a() {
            return this.a + this.b;
        }

        @Override // com.amazon.aps.iva.md0.d
        public final String b() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.md0.d
        public final String c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }
}
