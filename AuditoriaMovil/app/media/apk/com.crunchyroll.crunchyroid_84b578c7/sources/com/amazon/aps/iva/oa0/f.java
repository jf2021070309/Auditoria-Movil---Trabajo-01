package com.amazon.aps.iva.oa0;

import android.content.Context;
import com.amazon.aps.iva.oa0.d0;
import com.amazon.aps.iva.oa0.g;
import com.amazon.aps.iva.oa0.h;
/* compiled from: ApiStartSession.java */
/* loaded from: classes4.dex */
public final class f implements Runnable {
    public final /* synthetic */ u0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ g.a d;

    /* compiled from: ApiStartSession.java */
    /* loaded from: classes4.dex */
    public class a extends d0.a {

        /* compiled from: ApiStartSession.java */
        /* renamed from: com.amazon.aps.iva.oa0.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class RunnableC0562a implements Runnable {
            public final /* synthetic */ int b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;

            public RunnableC0562a(int i, String str, String str2) {
                this.b = i;
                this.c = str;
                this.d = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                int i;
                a aVar = a.this;
                try {
                    f.this.d.getClass();
                    int i2 = this.b;
                    if (i2 != -1 && i2 != 257 && i2 != 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    f fVar = f.this;
                    if (!z && (i = g.this.b) < 3) {
                        Thread.sleep(i * 3000);
                        g.a aVar2 = fVar.d;
                        u0 u0Var = fVar.b;
                        String str = fVar.c;
                        aVar2.getClass();
                        int i3 = g.c;
                        new Thread(new f(aVar2, u0Var, str)).start();
                        return;
                    }
                    com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
                    cVar.put("responseCode", String.valueOf(i2));
                    cVar.put("signedData", this.c);
                    cVar.put("signature", this.d);
                    fVar.b.c(new h.c("__LicensingStatus", cVar.toString()));
                } catch (Throwable unused) {
                    int i4 = g.c;
                }
            }
        }

        public a() {
        }

        @Override // com.amazon.aps.iva.oa0.d0.a
        public final void a(int i, String str, String str2) {
            new Thread(new RunnableC0562a(i, str, str2)).start();
        }
    }

    public f(g.a aVar, u0 u0Var, String str) {
        this.d = aVar;
        this.b = u0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.this.b++;
        Context context = this.b.a;
        a aVar = new a();
        int i = d0.a;
        try {
            new e0(context, aVar).a();
        } catch (Throwable unused) {
            int i2 = d0.a;
        }
    }
}
