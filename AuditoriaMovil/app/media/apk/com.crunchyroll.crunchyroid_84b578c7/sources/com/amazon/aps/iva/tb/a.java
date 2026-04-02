package com.amazon.aps.iva.tb;

import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.SdkDataWipeEvent;
import com.braze.ui.contentcards.ContentCardsFragment;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements IEventSubscriber {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ContentCardsFragment.onResume$lambda$0((ContentCardsFragment) obj2, (ContentCardsUpdatedEvent) obj);
                return;
            default:
                BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$1((BrazeInAppMessageManager) obj2, (SdkDataWipeEvent) obj);
                return;
        }
    }
}
