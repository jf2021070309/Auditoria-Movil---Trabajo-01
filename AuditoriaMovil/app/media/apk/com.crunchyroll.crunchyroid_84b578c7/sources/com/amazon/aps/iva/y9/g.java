package com.amazon.aps.iva.y9;

import bo.app.f0;
import bo.app.g5;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements IEventSubscriber {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                f0.a((f0) obj2, (g5) obj);
                return;
            default:
                BrazeInAppMessageManager.createInAppMessageEventSubscriber$lambda$8((BrazeInAppMessageManager) obj2, (InAppMessageEvent) obj);
                return;
        }
    }
}
