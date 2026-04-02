package com.amazon.aps.iva.se0;

import java.util.concurrent.Future;
/* compiled from: Future.kt */
/* loaded from: classes4.dex */
public final class j extends k {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.amazon.aps.iva.se0.l
    public final void a(Throwable th) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (th != null) {
                    ((Future) obj).cancel(false);
                    return;
                }
                return;
            default:
                ((com.amazon.aps.iva.xb0.l) obj).invoke(th);
                return;
        }
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        switch (this.b) {
            case 0:
                a(th);
                return com.amazon.aps.iva.kb0.q.a;
            default:
                a(th);
                return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public final String toString() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((com.amazon.aps.iva.xb0.l) obj).getClass().getSimpleName() + '@' + j0.e(this) + ']';
        }
    }
}
