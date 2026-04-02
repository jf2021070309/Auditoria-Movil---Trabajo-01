package com.android.billingclient.api;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zzai {
    private final List<PurchaseHistoryRecord> zza;
    private final BillingResult zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
        this.zza = list;
        this.zzb = billingResult;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final BillingResult zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<PurchaseHistoryRecord> zzb() {
        return this.zza;
    }
}
