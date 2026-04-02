package com.amazon.aps.iva.ck;

import android.annotation.SuppressLint;
import android.net.Uri;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.o6.q;
import com.amazon.aps.iva.pj.e;
import com.amazon.aps.iva.t6.j;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerErrorHandler.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes.dex */
public final class e implements d {
    public final g0<j> a;
    public final com.amazon.aps.iva.oj.a b;
    public final f c;
    public final String d = d.class.getSimpleName();

    /* compiled from: PlayerErrorHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<j, j> {
        public final /* synthetic */ com.amazon.aps.iva.dk.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.dk.c cVar) {
            super(1);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final j invoke(j jVar) {
            j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            return j.a(jVar2, false, 0L, 0L, 0.0f, 0L, com.amazon.aps.iva.nk.e.IDLE, null, 0, this.h, new com.amazon.aps.iva.nk.c(com.amazon.aps.iva.nk.b.ERROR, 6), null, null, null, null, null, null, false, null, null, 4189631);
        }
    }

    public e(v0 v0Var, com.amazon.aps.iva.oj.a aVar, f fVar) {
        this.a = v0Var;
        this.b = aVar;
        this.c = fVar;
    }

    @Override // com.amazon.aps.iva.ck.d
    public final void a(com.amazon.aps.iva.dk.c cVar) {
        String str = this.d;
        com.amazon.aps.iva.yb0.j.e(str, "producer");
        this.b.b(str, c(cVar));
    }

    @Override // com.amazon.aps.iva.ck.d
    public final void b(com.amazon.aps.iva.dk.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "error");
        i.C(this.a, new a(cVar));
        if (cVar.d) {
            String str = this.d;
            com.amazon.aps.iva.yb0.j.e(str, "producer");
            this.b.b(str, c(cVar));
        }
    }

    public final e.h c(com.amazon.aps.iva.dk.c cVar) {
        String str;
        q qVar;
        Uri uri;
        String str2 = cVar.e;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        int i = cVar.c;
        String str4 = cVar.f;
        long j = this.a.getValue().c;
        j.c cVar2 = this.c.b;
        if (cVar2 != null && (qVar = cVar2.a) != null && (uri = qVar.b) != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        return new e.h(str3, i, str4, cVar, j, str);
    }
}
