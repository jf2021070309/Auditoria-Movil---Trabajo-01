package e.a.a.a;

import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.List;
/* loaded from: classes.dex */
public final class f implements l {
    public final /* synthetic */ i.a.s a;

    public f(i.a.s sVar) {
        this.a = sVar;
    }

    public final void a(j jVar, List<PurchaseHistoryRecord> list) {
        h.o.c.j.d(jVar, "billingResult");
        this.a.M(new m(jVar, list));
    }
}
