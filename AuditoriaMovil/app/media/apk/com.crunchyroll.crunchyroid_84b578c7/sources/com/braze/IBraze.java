package com.braze;

import android.app.Activity;
import com.braze.models.outgoing.BrazeProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import kotlin.Metadata;
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J&\u0010\u0010\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&J0\u0010\u0010\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\b\u0010\u0011\u001a\u00020\u0004H&J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H&R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lcom/braze/IBraze;", "", "Landroid/app/Activity;", "activity", "Lcom/amazon/aps/iva/kb0/q;", "openSession", "closeSession", "", "eventName", "logCustomEvent", "Lcom/braze/models/outgoing/BrazeProperties;", "properties", "productId", "currencyCode", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "logPurchase", "requestImmediateDataFlush", "userId", "changeUser", "Lcom/braze/BrazeUser;", "getCurrentUser", "()Lcom/braze/BrazeUser;", "currentUser", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IBraze {
    void changeUser(String str);

    void closeSession(Activity activity);

    BrazeUser getCurrentUser();

    void logCustomEvent(String str);

    void logCustomEvent(String str, BrazeProperties brazeProperties);

    void logPurchase(String str, String str2, BigDecimal bigDecimal);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, BrazeProperties brazeProperties);

    void openSession(Activity activity);

    void requestImmediateDataFlush();
}
