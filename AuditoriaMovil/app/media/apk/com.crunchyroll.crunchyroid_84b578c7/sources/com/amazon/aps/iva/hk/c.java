package com.amazon.aps.iva.hk;

import android.content.Context;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.q5.v0;
import com.amazon.aps.iva.qj.e;
import com.amazon.aps.iva.qj.h;
import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.s6.w;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.zj.d;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: CaptionsTrackSelector.kt */
/* loaded from: classes.dex */
public final class c implements b {
    public final g0<j> b;
    public final w c;
    public final com.amazon.aps.iva.xb0.a<Boolean> d;

    /* compiled from: CaptionsTrackSelector.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<j, j> {
        public final /* synthetic */ List<e> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.h = arrayList;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final j invoke(j jVar) {
            j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            return j.a(jVar2, false, 0L, 0L, 0.0f, 0L, null, null, 0, null, null, null, null, null, null, null, this.h, false, null, null, 3932159);
        }
    }

    public c(Context context, g gVar, d dVar, com.amazon.aps.iva.xb0.a aVar, v0 v0Var) {
        this.b = v0Var;
        this.c = gVar;
        this.d = aVar;
        g.c cVar = (g.c) gVar.I();
        cVar.getClass();
        g.c.a aVar2 = new g.c.a(cVar);
        aVar2.m(context);
        gVar.U(aVar2.b());
    }

    @Override // com.amazon.aps.iva.hk.b
    public final void a() {
        w wVar = this.c;
        wVar.U(wVar.I().a().o(3, true).b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.hk.b
    public final void b(com.amazon.aps.iva.q5.v0 v0Var) {
        String str;
        com.amazon.aps.iva.yb0.j.f(v0Var, "tracks");
        ArrayList arrayList = new ArrayList();
        UnmodifiableIterator<v0.a> it = v0Var.b.iterator();
        while (it.hasNext()) {
            v0.a next = it.next();
            if (next.c.d == 3 && next.g()) {
                for (int i = 0; i < next.b; i++) {
                    if (next.i(i) && (str = next.c(i).d) != null) {
                        List E0 = q.E0(str, new String[]{"-"});
                        if (E0.size() == 2) {
                            StringBuilder sb = new StringBuilder();
                            Locale locale = Locale.ROOT;
                            String lowerCase = ((String) E0.get(0)).toLowerCase(locale);
                            com.amazon.aps.iva.yb0.j.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            sb.append(lowerCase);
                            sb.append('-');
                            String upperCase = ((String) E0.get(1)).toUpperCase(locale);
                            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            sb.append(upperCase);
                            str = sb.toString();
                        }
                        arrayList.add(new e(str));
                    }
                }
            }
        }
        a aVar = new a(arrayList);
        g0<j> g0Var = this.b;
        com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
        g0Var.setValue(aVar.invoke(g0Var.getValue()));
    }

    @Override // com.amazon.aps.iva.hk.b
    public final void f(h hVar) {
        w wVar = this.c;
        wVar.U(wVar.I().a().l(hVar.a()).o(3, false).b());
    }
}
