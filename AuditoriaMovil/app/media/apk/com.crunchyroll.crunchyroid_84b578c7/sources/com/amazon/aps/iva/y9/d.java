package com.amazon.aps.iva.y9;

import bo.app.b5;
import bo.app.c4;
import bo.app.d4;
import bo.app.f0;
import bo.app.s4;
import com.braze.events.IEventSubscriber;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements IEventSubscriber {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                c4.b((c4) obj2, (d4) obj);
                return;
            case 1:
                f0.b((f0) obj2, (b5) obj);
                return;
            default:
                bo.app.o.b((bo.app.o) obj2, (s4) obj);
                return;
        }
    }
}
