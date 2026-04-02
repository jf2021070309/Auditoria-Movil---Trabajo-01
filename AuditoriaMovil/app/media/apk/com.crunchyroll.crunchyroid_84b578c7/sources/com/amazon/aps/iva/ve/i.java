package com.amazon.aps.iva.ve;
/* compiled from: BillingStateMonitor.kt */
/* loaded from: classes.dex */
public abstract class i {

    /* compiled from: BillingStateMonitor.kt */
    /* loaded from: classes.dex */
    public static final class a extends i {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.a == ((a) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("NearEnd(timeLeft="), this.a, ")");
        }
    }

    /* compiled from: BillingStateMonitor.kt */
    /* loaded from: classes.dex */
    public static final class b extends i {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.a == ((b) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("PeriodStarted(timeLeft="), this.a, ")");
        }
    }
}
