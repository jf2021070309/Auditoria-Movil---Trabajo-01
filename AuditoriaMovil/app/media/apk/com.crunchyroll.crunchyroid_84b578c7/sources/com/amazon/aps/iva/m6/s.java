package com.amazon.aps.iva.m6;

import android.net.Uri;
import com.amazon.aps.iva.m6.o;
import com.amazon.aps.iva.q5.a0;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.m0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.w;
import com.amazon.aps.iva.x5.c;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: ProgressiveDownloader.java */
/* loaded from: classes.dex */
public final class s implements o {
    public final Executor a;
    public final com.amazon.aps.iva.w5.i b;
    public final com.amazon.aps.iva.x5.c c;
    public final com.amazon.aps.iva.x5.i d;
    public o.a e;
    public volatile a f;
    public volatile boolean g;

    /* compiled from: ProgressiveDownloader.java */
    /* loaded from: classes.dex */
    public class a extends w<Void, IOException> {
        public a() {
        }

        @Override // com.amazon.aps.iva.t5.w
        public final void b() {
            s.this.d.j = true;
        }

        @Override // com.amazon.aps.iva.t5.w
        public final Void c() throws Exception {
            s.this.d.a();
            return null;
        }
    }

    public s(b0 b0Var, c.a aVar, Executor executor) {
        executor.getClass();
        this.a = executor;
        b0.g gVar = b0Var.c;
        gVar.getClass();
        Map emptyMap = Collections.emptyMap();
        Uri uri = gVar.b;
        String str = gVar.g;
        com.amazon.aps.iva.cq.b.E(uri, "The uri must be set.");
        com.amazon.aps.iva.w5.i iVar = new com.amazon.aps.iva.w5.i(uri, 0L, 1, null, emptyMap, 0L, -1L, str, 4, null);
        this.b = iVar;
        com.amazon.aps.iva.x5.c b = aVar.b();
        this.c = b;
        this.d = new com.amazon.aps.iva.x5.i(b, iVar, null, new com.amazon.aps.iva.g1.q(this, 4));
    }

    @Override // com.amazon.aps.iva.m6.o
    public final void a(o.a aVar) throws IOException, InterruptedException {
        this.e = aVar;
        boolean z = false;
        while (!z) {
            try {
                if (this.g) {
                    break;
                }
                this.f = new a();
                this.a.execute(this.f);
                try {
                    this.f.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof m0)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i = g0.a;
                        throw cause;
                    }
                }
            } finally {
                a aVar2 = this.f;
                aVar2.getClass();
                aVar2.a();
            }
        }
    }

    @Override // com.amazon.aps.iva.m6.o
    public final void cancel() {
        this.g = true;
        a aVar = this.f;
        if (aVar != null) {
            aVar.cancel(true);
        }
    }

    @Override // com.amazon.aps.iva.m6.o
    public final void remove() {
        com.amazon.aps.iva.x5.c cVar = this.c;
        cVar.a.j(((a0) cVar.e).b(this.b));
    }
}
