package com.amazon.aps.iva.y9;

import bo.app.l5;
import bo.app.w;
import bo.app.w0;
import com.braze.events.IEventSubscriber;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements IEventSubscriber {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ l(w0 w0Var, int i) {
        this.a = i;
        this.b = w0Var;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.a;
        w0 w0Var = this.b;
        switch (i) {
            case 0:
                w0.a(w0Var, (l5) obj);
                return;
            default:
                w0.a(w0Var, (w) obj);
                return;
        }
    }
}
