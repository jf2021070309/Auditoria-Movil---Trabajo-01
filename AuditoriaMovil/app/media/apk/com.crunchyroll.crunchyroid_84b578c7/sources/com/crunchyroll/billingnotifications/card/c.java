package com.crunchyroll.billingnotifications.card;

import com.amazon.aps.iva.b8.i;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BillingNotificationCardUiModel.kt */
/* loaded from: classes.dex */
public abstract class c {
    public final int a;
    public final int b;
    public final int c;

    /* compiled from: BillingNotificationCardUiModel.kt */
    /* loaded from: classes.dex */
    public static final class a extends g {
        public final long f;

        public a(long j) {
            super(R.plurals.billing_notification_card_days_left_styled, R.plurals.billing_notification_card_days_left, j);
            this.f = j;
        }

        @Override // com.crunchyroll.billingnotifications.card.c.g
        public final long c() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f == ((a) obj).f) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Days(number="), this.f, ")");
        }
    }

    /* compiled from: BillingNotificationCardUiModel.kt */
    /* loaded from: classes.dex */
    public static final class b extends f {
        public static final b c = new b();

        public b() {
            super(R.string.billing_notification_generic_days_left_colored, R.string.billing_notification_generic_days_left);
        }
    }

    /* compiled from: BillingNotificationCardUiModel.kt */
    /* renamed from: com.crunchyroll.billingnotifications.card.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0953c extends g {
        public final long f;

        public C0953c(long j) {
            super(R.plurals.billing_notification_card_hours_left_styled, R.plurals.billing_notification_card_hours_left, j);
            this.f = j;
        }

        @Override // com.crunchyroll.billingnotifications.card.c.g
        public final long c() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0953c) && this.f == ((C0953c) obj).f) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Hours(number="), this.f, ")");
        }
    }

    /* compiled from: BillingNotificationCardUiModel.kt */
    /* loaded from: classes.dex */
    public static final class d extends g {
        public final long f;

        public d(long j) {
            super(R.plurals.billing_notification_card_months_left_styled, R.plurals.billing_notification_card_months_left, j);
            this.f = j;
        }

        @Override // com.crunchyroll.billingnotifications.card.c.g
        public final long c() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && this.f == ((d) obj).f) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Months(number="), this.f, ")");
        }
    }

    /* compiled from: BillingNotificationCardUiModel.kt */
    /* loaded from: classes.dex */
    public static final class e extends g {
        public final long f;
        public final long g;
        public final int h;

        public e(long j, long j2) {
            super(R.plurals.billing_notification_card_months_with_days_left_styled, R.plurals.billing_notification_card_months_with_days_left, j);
            this.f = j;
            this.g = j2;
            this.h = R.plurals.billing_notification_card_x_days_left;
        }

        @Override // com.crunchyroll.billingnotifications.card.c.g
        public final long c() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f == eVar.f && this.g == eVar.g && this.h == eVar.h) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.h) + i.a(this.g, Long.hashCode(this.f) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MonthsWithDays(number=");
            sb.append(this.f);
            sb.append(", numberOfDays=");
            sb.append(this.g);
            sb.append(", daysPluralRes=");
            return defpackage.e.f(sb, this.h, ")");
        }
    }

    /* compiled from: BillingNotificationCardUiModel.kt */
    /* loaded from: classes.dex */
    public static abstract class f {
        public final int a;
        public final int b;

        public f(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* compiled from: BillingNotificationCardUiModel.kt */
    /* loaded from: classes.dex */
    public static abstract class g extends f {
        public final long c;
        public final int d;
        public final int e;

        public g(int i, int i2, long j) {
            super(i, i2);
            this.c = j;
            this.d = i;
            this.e = i2;
        }

        @Override // com.crunchyroll.billingnotifications.card.c.f
        public final int a() {
            return this.e;
        }

        @Override // com.crunchyroll.billingnotifications.card.c.f
        public final int b() {
            return this.d;
        }

        public long c() {
            return this.c;
        }
    }

    public c(int i, int i2, int i3, f fVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public abstract f a();
}
