package com.amazon.aps.iva.y9;

import bo.app.c6;
import bo.app.f5;
import bo.app.g5;
import bo.app.w0;
import bo.app.w5;
import com.braze.events.IEventSubscriber;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements IEventSubscriber {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                w0.a((w0) obj2, (f5) obj);
                return;
            case 1:
                w0.a((w0) obj2, (g5) obj);
                return;
            default:
                c6.a((c6) obj2, (w5) obj);
                return;
        }
    }
}
