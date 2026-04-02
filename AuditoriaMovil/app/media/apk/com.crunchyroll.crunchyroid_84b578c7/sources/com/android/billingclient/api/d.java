package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.internal.play_billing.zzu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class d {
    public final String a;
    public final com.amazon.aps.iva.if0.c b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static final class a {
        public final String a;

        public a(com.amazon.aps.iva.if0.c cVar) throws com.amazon.aps.iva.if0.b {
            cVar.optString("formattedPrice");
            cVar.optLong("priceAmountMicros");
            cVar.optString("priceCurrencyCode");
            this.a = cVar.optString("offerIdToken");
            cVar.optString("offerId");
            cVar.optInt("offerType");
            com.amazon.aps.iva.if0.a optJSONArray = cVar.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.e(); i++) {
                    arrayList.add(optJSONArray.d(i));
                }
            }
            zzu.zzj(arrayList);
            if (cVar.has("fullPriceMicros")) {
                cVar.optLong("fullPriceMicros");
            }
            com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("discountDisplayInfo");
            if (optJSONObject != null) {
                optJSONObject.getInt("percentageDiscount");
            }
            com.amazon.aps.iva.if0.c optJSONObject2 = cVar.optJSONObject("validTimeWindow");
            if (optJSONObject2 != null) {
                optJSONObject2.getLong("startTimeMillis");
                optJSONObject2.getLong("endTimeMillis");
            }
            com.amazon.aps.iva.if0.c optJSONObject3 = cVar.optJSONObject("limitedQuantityInfo");
            if (optJSONObject3 != null) {
                optJSONObject3.getInt("maximumQuantity");
                optJSONObject3.getInt("remainingQuantity");
            }
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final long b;
        public final String c;
        public final String d;
        public final int e;
        public final int f;

        public b(com.amazon.aps.iva.if0.c cVar) {
            this.d = cVar.optString("billingPeriod");
            this.c = cVar.optString("priceCurrencyCode");
            this.a = cVar.optString("formattedPrice");
            this.b = cVar.optLong("priceAmountMicros");
            this.f = cVar.optInt("recurrenceMode");
            this.e = cVar.optInt("billingCycleCount");
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static class c {
        public final ArrayList a;

        public c(com.amazon.aps.iva.if0.a aVar) {
            ArrayList arrayList = new ArrayList();
            if (aVar != null) {
                for (int i = 0; i < aVar.e(); i++) {
                    com.amazon.aps.iva.if0.c j = aVar.j(i);
                    if (j != null) {
                        arrayList.add(new b(j));
                    }
                }
            }
            this.a = arrayList;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* renamed from: com.android.billingclient.api.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0933d {
        public final String a;
        public final String b;
        public final c c;
        public final ArrayList d;

        public C0933d(com.amazon.aps.iva.if0.c cVar) throws com.amazon.aps.iva.if0.b {
            cVar.optString("basePlanId");
            String optString = cVar.optString("offerId");
            this.a = true == optString.isEmpty() ? null : optString;
            this.b = cVar.getString("offerIdToken");
            this.c = new c(cVar.getJSONArray("pricingPhases"));
            com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("installmentPlanDetails");
            if (optJSONObject != null) {
                optJSONObject.getInt("commitmentPaymentsCount");
                optJSONObject.optInt("subsequentCommitmentPaymentsCount");
            }
            ArrayList arrayList = new ArrayList();
            com.amazon.aps.iva.if0.a optJSONArray = cVar.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.e(); i++) {
                    arrayList.add(optJSONArray.d(i));
                }
            }
            this.d = arrayList;
        }
    }

    public d(String str) throws com.amazon.aps.iva.if0.b {
        ArrayList arrayList;
        this.a = str;
        com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c(str);
        this.b = cVar;
        String optString = cVar.optString("productId");
        this.c = optString;
        String optString2 = cVar.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.e = cVar.optString("title");
                cVar.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                cVar.optString(MediaTrack.ROLE_DESCRIPTION);
                cVar.optString("packageDisplayName");
                cVar.optString("iconUrl");
                this.f = cVar.optString("skuDetailsToken");
                this.g = cVar.optString("serializedDocid");
                com.amazon.aps.iva.if0.a optJSONArray = cVar.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.e(); i++) {
                        arrayList2.add(new C0933d(optJSONArray.b(i)));
                    }
                    this.h = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.h = arrayList;
                }
                com.amazon.aps.iva.if0.c optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
                com.amazon.aps.iva.if0.a optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.e(); i2++) {
                        arrayList3.add(new a(optJSONArray2.b(i2)));
                    }
                    this.i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new a(optJSONObject));
                    this.i = arrayList3;
                    return;
                } else {
                    this.i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final a a() {
        ArrayList arrayList = this.i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (a) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return TextUtils.equals(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String cVar = this.b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        com.amazon.aps.iva.m80.a.c(sb, this.a, "', parsedJson=", cVar, ", productId='");
        sb.append(this.c);
        sb.append("', productType='");
        sb.append(this.d);
        sb.append("', title='");
        sb.append(this.e);
        sb.append("', productDetailsToken='");
        return com.amazon.aps.iva.ab.f.a(sb, this.f, "', subscriptionOfferDetails=", valueOf, "}");
    }
}
