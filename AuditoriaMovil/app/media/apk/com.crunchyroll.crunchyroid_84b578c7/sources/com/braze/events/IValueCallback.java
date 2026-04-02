package com.braze.events;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/braze/events/IValueCallback;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "value", "Lcom/amazon/aps/iva/kb0/q;", "onSuccess", "(Ljava/lang/Object;)V", "onError", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IValueCallback<T> {
    void onSuccess(T t);

    default void onError() {
    }
}
