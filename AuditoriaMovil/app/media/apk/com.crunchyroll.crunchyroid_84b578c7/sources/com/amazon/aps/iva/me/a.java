package com.amazon.aps.iva.me;

import android.content.SharedPreferences;
import com.amazon.aps.iva.xb0.l;
import com.crunchyroll.billingnotifications.cancelled.CancellationCompleteActivity;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
/* compiled from: BillingNotificationDependencies.kt */
/* loaded from: classes.dex */
public interface a {
    com.amazon.aps.iva.xb0.a a(CancellationCompleteActivity cancellationCompleteActivity);

    String b();

    com.amazon.aps.iva.ve.a c();

    l<String, String> d();

    j e();

    SharedPreferences g();

    SubscriptionProcessorService getSubscriptionProcessorService();
}
