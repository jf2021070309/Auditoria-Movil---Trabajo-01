package com.braze.support;

import bo.app.a5;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.d0;
import com.braze.support.BrazeLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J6\u0010\u0012\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u001c\u0010\u0017\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0007R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006'"}, d2 = {"Lcom/braze/support/ValidationUtils;", "", "", "emailAddress", "", "isValidEmailAddress", "phoneNumber", "isValidPhoneNumber", "field", "ensureBrazeFieldLength", "productId", "currencyCode", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "", FirebaseAnalytics.Param.QUANTITY, "Lbo/app/a5;", "serverConfigStorageProvider", "isValidLogPurchaseInput", "eventName", "isValidLogCustomEventInput", "campaignId", "pageId", "isValidPushStoryClickInput", "", "latitude", "longitude", "isValidLocation", "", "VALID_CURRENCY_CODES", "Ljava/util/Set;", "getVALID_CURRENCY_CODES", "()Ljava/util/Set;", "Lcom/amazon/aps/iva/oe0/f;", "EMAIL_ADDRESS_REGEX", "Lcom/amazon/aps/iva/oe0/f;", "PHONE_NUMBER_REGEX", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ValidationUtils {
    public static final ValidationUtils INSTANCE = new ValidationUtils();
    private static final Set<String> VALID_CURRENCY_CODES = l1.I("AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL");
    private static final com.amazon.aps.iva.oe0.f EMAIL_ADDRESS_REGEX = new com.amazon.aps.iva.oe0.f(".+@.+\\..+");
    private static final com.amazon.aps.iva.oe0.f PHONE_NUMBER_REGEX = new com.amazon.aps.iva.oe0.f("^[0-9 .\\(\\)\\+\\-]+$");

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ d0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0 d0Var) {
            super(0);
            this.b = d0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Provided string field is too long [" + ((String) this.b.b).length() + "]. The max length is 255, truncating provided field.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The custom event name cannot be null or contain only whitespaces. Invalid custom event.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("The custom event is a blocklisted custom event: "), this.b, ". Invalid custom event.");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The productId is empty, not logging in-app purchase to Braze.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The productId is a blocklisted productId: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final f b = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The currencyCode is empty. Expected one of " + ValidationUtils.INSTANCE.getVALID_CURRENCY_CODES();
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The currencyCode " + this.b + " is invalid. Expected one of " + ValidationUtils.INSTANCE.getVALID_CURRENCY_CODES();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final h b = new h();

        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The price is null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i) {
            super(0);
            this.b = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.e.f(new StringBuilder("The requested purchase quantity of "), this.b, " is less than one. Invalid purchase");
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i) {
            super(0);
            this.b = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.e.f(new StringBuilder("The requested purchase quantity of "), this.b, " is greater than the maximum of 100");
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final k b = new k();

        public k() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Campaign ID cannot be null or blank";
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final l b = new l();

        public l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Push story page ID cannot be null or blank";
        }
    }

    private ValidationUtils() {
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v8, types: [T, java.lang.Object, java.lang.String] */
    public static final String ensureBrazeFieldLength(String str) {
        boolean z;
        if (str != null && !m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        d0 d0Var = new d0();
        ?? obj = q.O0(str).toString();
        d0Var.b = obj;
        if (obj.length() > 255) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new a(d0Var), 2, (Object) null);
            ?? substring = ((String) d0Var.b).substring(0, 255);
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            d0Var.b = substring;
        }
        return (String) d0Var.b;
    }

    public static final boolean isValidEmailAddress(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || str.length() > 255) {
            return false;
        }
        return EMAIL_ADDRESS_REGEX.b(str);
    }

    public static final boolean isValidLocation(double d2, double d3) {
        if (d2 < 90.0d && d2 > -90.0d && d3 < 180.0d && d3 > -180.0d) {
            return true;
        }
        return false;
    }

    public static final boolean isValidLogCustomEventInput(String str, a5 a5Var) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
        if (str != null && !m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
        } else if (!a5Var.c().contains(str)) {
            return true;
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new c(str), 2, (Object) null);
        }
        return false;
    }

    public static final boolean isValidLogPurchaseInput(String str, String str2, BigDecimal bigDecimal, int i2, a5 a5Var) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
        if (str != null && !m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, d.b, 2, (Object) null);
        } else if (a5Var.d().contains(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new e(str), 2, (Object) null);
        } else {
            if (str2 != null && !m.b0(str2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, f.b, 2, (Object) null);
            } else {
                Set<String> set = VALID_CURRENCY_CODES;
                String obj = q.O0(str2).toString();
                Locale locale = Locale.US;
                com.amazon.aps.iva.yb0.j.e(locale, "US");
                String upperCase = obj.toUpperCase(locale);
                com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
                if (!set.contains(upperCase)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new g(str2), 2, (Object) null);
                } else if (bigDecimal == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, h.b, 2, (Object) null);
                } else if (i2 <= 0) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new i(i2), 2, (Object) null);
                } else if (i2 <= 100) {
                    return true;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new j(i2), 2, (Object) null);
                }
            }
        }
        return false;
    }

    public static final boolean isValidPhoneNumber(String str) {
        if (str != null && PHONE_NUMBER_REGEX.b(str)) {
            return true;
        }
        return false;
    }

    public static final boolean isValidPushStoryClickInput(String str, String str2) {
        boolean z;
        boolean z2;
        if (str != null && !m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, k.b, 2, (Object) null);
        } else {
            if (str2 != null && !m.b0(str2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, l.b, 2, (Object) null);
        }
        return false;
    }

    public final Set<String> getVALID_CURRENCY_CODES() {
        return VALID_CURRENCY_CODES;
    }
}
