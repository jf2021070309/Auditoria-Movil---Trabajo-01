package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.c0;
import com.amazon.aps.iva.oa0.s;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ConfigManagerRepoNetwork.java */
/* loaded from: classes4.dex */
public final class u extends s {
    public static final /* synthetic */ int b = 0;
    public final c0 a;

    /* compiled from: ConfigManagerRepoNetwork.java */
    /* loaded from: classes4.dex */
    public class a implements c0.a {
        public final /* synthetic */ s.a a;
        public final /* synthetic */ int b;

        public a(s.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }

        @Override // com.amazon.aps.iva.oa0.c0.a
        public final void a(int i, String str) {
            int i2 = this.b;
            u uVar = u.this;
            s.a aVar = this.a;
            if (i == 200 && str != null) {
                try {
                    h0 a = h0.a(new com.amazon.aps.iva.if0.c(str));
                    if (aVar != null) {
                        aVar.a(a);
                        return;
                    }
                    return;
                } catch (com.amazon.aps.iva.if0.b e) {
                    int i3 = u.b;
                    f1.b(e);
                    e.getMessage();
                    u.c(uVar, aVar, i2);
                    return;
                }
            }
            u.c(uVar, aVar, i2);
        }

        @Override // com.amazon.aps.iva.oa0.c0.a
        public final void onFailure(String str) {
            u.c(u.this, this.a, this.b);
        }
    }

    static {
        new com.amazon.aps.iva.b30.j(u.class.getSimpleName());
    }

    public u() {
    }

    public static void c(u uVar, s.a aVar, int i) {
        uVar.getClass();
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        if (i > 0) {
            newSingleThreadScheduledExecutor.schedule(new t(uVar, aVar, i), 3000L, TimeUnit.MILLISECONDS);
        } else if (aVar != null) {
            aVar.onError();
        }
    }

    @Override // com.amazon.aps.iva.oa0.s
    public final void a(s.a aVar) {
        d(aVar, 3);
    }

    public final void d(s.a aVar, int i) {
        HashMap hashMap = new HashMap();
        int i2 = f1.b;
        hashMap.put("sdk", u0.p.f.t);
        y yVar = u0.p.f;
        if (yVar != null) {
            hashMap.put("p", yVar.r);
            hashMap.put("n", yVar.q);
            hashMap.put("i", yVar.n);
            hashMap.put("v", yVar.u);
        }
        a aVar2 = new a(aVar, i);
        b0 b0Var = (b0) this.a;
        b0Var.getClass();
        Executors.newSingleThreadExecutor().execute(new a0(b0Var, hashMap, aVar2));
    }

    public u(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // com.amazon.aps.iva.oa0.s
    public final void b(h0 h0Var) {
    }
}
