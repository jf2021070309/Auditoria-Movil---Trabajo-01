package com.amazon.aps.iva.y9;

import bo.app.c1;
import bo.app.d5;
import bo.app.e1;
import bo.app.f0;
import bo.app.p4;
import com.braze.events.IEventSubscriber;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements IEventSubscriber {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                c1.a((c1) obj2, (e1) obj);
                return;
            case 1:
                f0.a((f0) obj2, (p4) obj);
                return;
            default:
                bo.app.m.b((bo.app.m) obj2, (d5) obj);
                return;
        }
    }
}
