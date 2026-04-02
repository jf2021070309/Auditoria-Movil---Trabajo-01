package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.braze.support.BrazeFileUtils;
import com.braze.support.WebContentUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
/* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1", f = "DefaultInAppMessageViewLifecycleListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1 extends i implements p<g0, d<? super q>, Object> {
    int label;

    public DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1(d<? super DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1> dVar) {
        super(2, dVar);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1(dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            Activity activity = BrazeInAppMessageManager.Companion.getInstance().getActivity();
            if (activity != null) {
                BrazeFileUtils.deleteFileOrDirectory(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(activity));
            }
            return q.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
