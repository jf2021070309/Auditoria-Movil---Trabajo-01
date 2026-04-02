package com.amazon.aps.iva.y9;

import bo.app.m0;
import bo.app.w0;
import bo.app.z1;
import com.braze.events.IEventSubscriber;
import java.util.concurrent.Semaphore;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements IEventSubscriber {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                bo.app.f.b((bo.app.f) obj3, (z1) obj2, (m0) obj);
                return;
            default:
                w0.a((w0) obj3, (Semaphore) obj2, (Throwable) obj);
                return;
        }
    }
}
