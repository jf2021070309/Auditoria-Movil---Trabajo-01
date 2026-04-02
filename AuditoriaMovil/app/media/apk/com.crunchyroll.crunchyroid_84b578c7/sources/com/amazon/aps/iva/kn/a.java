package com.amazon.aps.iva.kn;

import android.content.Intent;
import android.net.Uri;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.na0.b;
import com.amazon.aps.iva.ya0.f;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SingularFeature.kt */
/* loaded from: classes2.dex */
public final class a {
    public boolean a;
    public final com.amazon.aps.iva.ln.b b;

    /* compiled from: SingularFeature.kt */
    /* renamed from: com.amazon.aps.iva.kn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0448a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public C0448a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            a.this.a = false;
            return q.a;
        }
    }

    public a(f fVar, v vVar) {
        this.b = new com.amazon.aps.iva.ln.b(fVar, vVar);
    }

    public final void a(Intent intent) {
        this.a = true;
        C0448a c0448a = new C0448a();
        com.amazon.aps.iva.ln.b bVar = this.b;
        bVar.getClass();
        com.amazon.aps.iva.na0.b bVar2 = new com.amazon.aps.iva.na0.b("crunchyrollinc_e8c79ab9", "aeb4fd44e51ee8d80a6266427e09b125");
        com.amazon.aps.iva.b6.d dVar = new com.amazon.aps.iva.b6.d(7, bVar, c0448a);
        if (bVar2.c == null) {
            bVar2.c = new b.a();
        }
        bVar2.h = dVar;
        bVar2.i = 10L;
        Uri data = intent.getData();
        bVar2.g = data;
        if (data != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            bVar2.j = true;
        }
        com.amazon.aps.iva.na0.a.b(bVar.a, bVar2);
    }
}
