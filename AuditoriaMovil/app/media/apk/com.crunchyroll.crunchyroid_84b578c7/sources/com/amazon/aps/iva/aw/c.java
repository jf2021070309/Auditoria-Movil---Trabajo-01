package com.amazon.aps.iva.aw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: DownloadingDetailsMonitorImpl.kt */
@e(c = "com.ellation.crunchyroll.downloading.detailsmonitor.DownloadingDetailsMonitorImpl$syncDetails$1", f = "DownloadingDetailsMonitorImpl.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<g0, d<? super q>, Object> {
    public ArrayList h;
    public int i;
    public final /* synthetic */ e0[] j;
    public final /* synthetic */ a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e0[] e0VarArr, a aVar, d<? super c> dVar) {
        super(2, dVar);
        this.j = e0VarArr;
        this.k = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new c(this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        e0[] e0VarArr;
        ArrayList<e0> arrayList;
        boolean z;
        Object obj2;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.i;
        a aVar2 = this.k;
        if (i != 0) {
            if (i == 1) {
                arrayList = this.h;
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            ArrayList arrayList2 = new ArrayList();
            for (e0 e0Var : this.j) {
                if (!e0Var.i() && !e0Var.j()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList2.add(e0Var);
                }
            }
            InternalDownloadsManager internalDownloadsManager = aVar2.d;
            String str = aVar2.b.a;
            this.h = arrayList2;
            this.i = 1;
            Object v = internalDownloadsManager.v(str, this);
            if (v == aVar) {
                return aVar;
            }
            arrayList = arrayList2;
            obj = v;
        }
        List list = (List) obj;
        for (e0 e0Var2 : arrayList) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (j.a(((PlayableAsset) obj2).getId(), e0Var2.e())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (((PlayableAsset) obj2) != null) {
                aVar2.e.put(e0Var2.e(), new Long(e0Var2.b()));
            }
        }
        aVar2.b();
        return q.a;
    }
}
