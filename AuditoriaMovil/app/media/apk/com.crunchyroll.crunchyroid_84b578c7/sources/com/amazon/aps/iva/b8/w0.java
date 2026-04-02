package com.amazon.aps.iva.b8;

import android.os.RemoteException;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements p1.b, com.amazon.aps.iva.t5.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w0(Object obj, int i) {
        this.c = obj;
        this.b = i;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        k<?> a;
        q.d dVar = (q.d) this.c;
        int i = this.b;
        try {
            a = (k) ((ListenableFuture) obj).get();
            com.amazon.aps.iva.cq.b.B(a, "LibraryResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            com.amazon.aps.iva.t5.p.h("Library operation failed", e);
            a = k.a(-1);
        } catch (CancellationException e2) {
            com.amazon.aps.iva.t5.p.h("Library operation cancelled", e2);
            a = k.a(1);
        } catch (ExecutionException e3) {
            e = e3;
            com.amazon.aps.iva.t5.p.h("Library operation failed", e);
            a = k.a(-1);
        }
        try {
            q.c cVar = dVar.d;
            com.amazon.aps.iva.cq.b.D(cVar);
            cVar.u(i, a);
        } catch (RemoteException e4) {
            com.amazon.aps.iva.t5.p.h("Failed to send result to browser " + dVar, e4);
        }
    }

    @Override // com.amazon.aps.iva.b8.p1.b
    public final void c(q.d dVar, v1 v1Var) {
        v1Var.E(((p1) this.c).w0(this.b, dVar, v1Var));
    }
}
