package com.amazon.aps.iva.y9;

import bo.app.c1;
import bo.app.f0;
import bo.app.k4;
import bo.app.o4;
import com.braze.events.IEventSubscriber;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements IEventSubscriber {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                c1.a((c1) obj2, (k4) obj);
                return;
            default:
                f0.a((f0) obj2, (o4) obj);
                return;
        }
    }
}
