package com.amazon.aps.iva.rs;

import android.app.Activity;
import com.amazon.aps.iva.i5.v;
import java.io.Serializable;
/* compiled from: BillingClientLifecycleWrapper.kt */
/* loaded from: classes2.dex */
public interface f {
    Serializable a(com.amazon.aps.iva.ob0.d dVar);

    Object b(String str, com.amazon.aps.iva.ob0.d<? super o> dVar);

    v c();

    Serializable d(Activity activity, String str, String str2, int i, com.amazon.aps.iva.ob0.d dVar);

    void destroy();

    Serializable e(Activity activity, String str, com.amazon.aps.iva.ob0.d dVar);
}
