package com.amazon.aps.iva.g6;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.g6.d;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.r;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.y5.b;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
/* compiled from: OfflineLicenseHelper.java */
/* loaded from: classes.dex */
public final class x {
    public static final com.amazon.aps.iva.q5.v f;
    public final ConditionVariable a;
    public final b b;
    public final HandlerThread c;
    public final Handler d;
    public final e.a e;

    /* compiled from: OfflineLicenseHelper.java */
    /* loaded from: classes.dex */
    public class a implements e {
        public a() {
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void I(int i, v.b bVar) {
            x.this.a.open();
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void Q(int i, v.b bVar) {
            x.this.a.open();
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void S(int i, v.b bVar, Exception exc) {
            x.this.a.open();
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void f0(int i, v.b bVar) {
            x.this.a.open();
        }
    }

    static {
        v.a aVar = new v.a();
        aVar.n = new com.amazon.aps.iva.q5.r(new r.b[0]);
        f = aVar.a();
    }

    public x(b bVar, e.a aVar) {
        this.b = bVar;
        this.e = aVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
        this.a = new ConditionVariable();
        aVar.a(new Handler(handlerThread.getLooper()), new a());
    }

    public static x d(String str, b.a aVar, e.a aVar2) {
        HashMap hashMap = new HashMap();
        UUID uuid = com.amazon.aps.iva.q5.l.d;
        com.amazon.aps.iva.d90.a aVar3 = p.d;
        com.amazon.aps.iva.t6.i iVar = new com.amazon.aps.iva.t6.i();
        hashMap.clear();
        return new x(new b(uuid, aVar3, new q(str, false, aVar), hashMap, false, new int[0], false, iVar, 300000L), aVar2);
    }

    public final d a(final int i, final byte[] bArr, final com.amazon.aps.iva.q5.v vVar) throws d.a {
        vVar.p.getClass();
        final SettableFuture create = SettableFuture.create();
        ConditionVariable conditionVariable = this.a;
        conditionVariable.close();
        Handler handler = this.d;
        handler.post(new Runnable() { // from class: com.amazon.aps.iva.g6.v
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                byte[] bArr2 = bArr;
                SettableFuture settableFuture = create;
                com.amazon.aps.iva.q5.v vVar2 = vVar;
                x xVar = x.this;
                b bVar = xVar.b;
                try {
                    Looper myLooper = Looper.myLooper();
                    myLooper.getClass();
                    bVar.a(myLooper, p1.b);
                    bVar.g();
                    bVar.l(i2, bArr2);
                    d b = bVar.b(xVar.e, vVar2);
                    b.getClass();
                    settableFuture.set(b);
                } catch (Throwable th) {
                    settableFuture.setException(th);
                }
            }
        });
        try {
            d dVar = (d) create.get();
            conditionVariable.block();
            SettableFuture create2 = SettableFuture.create();
            handler.post(new com.amazon.aps.iva.i4.d(this, 3, dVar, create2));
            try {
                if (create2.get() == 0) {
                    return dVar;
                }
                throw ((d.a) create2.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final byte[] b(com.amazon.aps.iva.q5.v vVar) throws d.a {
        final d a2 = a(2, null, vVar);
        final SettableFuture create = SettableFuture.create();
        this.d.post(new Runnable() { // from class: com.amazon.aps.iva.g6.w
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = create;
                d dVar = a2;
                e.a aVar = this.e;
                try {
                    settableFuture.set(dVar.c());
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        });
        try {
            try {
                byte[] bArr = (byte[]) create.get();
                bArr.getClass();
                return bArr;
            } finally {
                e();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public final synchronized Pair<Long, Long> c(byte[] bArr) throws d.a {
        Pair<Long, Long> pair;
        try {
            bArr.getClass();
            try {
                d a2 = a(1, bArr, f);
                SettableFuture create = SettableFuture.create();
                this.d.post(new androidx.fragment.app.c(this, 1, create, a2));
                try {
                    pair = (Pair) create.get();
                    e();
                } catch (InterruptedException | ExecutionException e) {
                    throw new IllegalStateException(e);
                }
            } catch (d.a e2) {
                if (e2.getCause() instanceof r) {
                    return Pair.create(0L, 0L);
                }
                throw e2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return pair;
    }

    public final void e() {
        SettableFuture create = SettableFuture.create();
        this.d.post(new androidx.fragment.app.t(2, this, create));
        try {
            create.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }
}
