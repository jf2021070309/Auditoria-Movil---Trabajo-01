package com.amazon.aps.iva.y9;

import bo.app.c6;
import bo.app.o0;
import bo.app.x5;
import bo.app.y2;
import com.braze.events.IEventSubscriber;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements IEventSubscriber {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                c6.b((c6) obj2, (x5) obj);
                return;
            default:
                o0.b((o0) obj2, (y2) obj);
                return;
        }
    }
}
