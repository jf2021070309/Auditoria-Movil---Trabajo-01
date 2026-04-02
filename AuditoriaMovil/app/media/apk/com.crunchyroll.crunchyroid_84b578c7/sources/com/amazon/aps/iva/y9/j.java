package com.amazon.aps.iva.y9;

import bo.app.w0;
import bo.app.y5;
import com.braze.events.IEventSubscriber;
import com.braze.events.SdkDataWipeEvent;
import com.braze.ui.contentcards.ContentCardsFragment;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements IEventSubscriber {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                w0.a((w0) obj2, (y5) obj);
                return;
            default:
                ContentCardsFragment.di((ContentCardsFragment) obj2, (SdkDataWipeEvent) obj);
                return;
        }
    }
}
