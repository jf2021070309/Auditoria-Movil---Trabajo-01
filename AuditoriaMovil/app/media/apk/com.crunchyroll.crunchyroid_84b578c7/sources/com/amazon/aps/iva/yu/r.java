package com.amazon.aps.iva.yu;

import com.ellation.crunchyroll.api.etp.error.ApiErrorContext;
import com.ellation.crunchyroll.api.etp.error.BadRequestException;
import com.ellation.crunchyroll.api.etp.error.ConflictException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: AddToCrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ q h;
    public final /* synthetic */ com.amazon.aps.iva.nv.e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, com.amazon.aps.iva.nv.e eVar) {
        super(1);
        this.h = qVar;
        this.i = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        u view;
        com.amazon.aps.iva.u70.i iVar;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "throwable");
        q qVar = this.h;
        view = qVar.getView();
        String str = this.i.e;
        com.amazon.aps.iva.yb0.j.f(str, "crunchylistTitle");
        boolean z = false;
        if (th2 instanceof ConflictException) {
            iVar = new a(new String[]{str}, 0);
        } else {
            if (th2 instanceof BadRequestException) {
                List<ApiErrorContext> contexts = ((BadRequestException) th2).getError().getContexts();
                if (!(contexts instanceof Collection) || !contexts.isEmpty()) {
                    Iterator<T> it = contexts.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (com.amazon.aps.iva.yb0.j.a(((ApiErrorContext) it.next()).getCode(), "content.add_custom_list_item_v2.reached_max_private")) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    iVar = new g(str);
                }
            }
            iVar = com.amazon.aps.iva.bt.c.b;
        }
        view.F(iVar);
        qVar.c.closeScreen();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
