package com.ellation.crunchyroll.cast.dependencies;

import android.app.Activity;
import com.amazon.aps.iva.k.c;
import com.amazon.aps.iva.k50.g;
import com.amazon.aps.iva.k50.i;
import com.amazon.aps.iva.k50.j;
import kotlin.Metadata;
/* compiled from: CastRouters.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/cast/dependencies/CastRouters;", "", "Lcom/amazon/aps/iva/k/c;", "activity", "Lcom/amazon/aps/iva/k50/j;", "createSubscriptionFlowRouter", "Landroid/app/Activity;", "Lcom/amazon/aps/iva/k50/i;", "createStartupRouter", "Lcom/amazon/aps/iva/k50/g;", "createSettingsRouter", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastRouters {
    g createSettingsRouter(Activity activity);

    i createStartupRouter(Activity activity);

    j createSubscriptionFlowRouter(c cVar);
}
