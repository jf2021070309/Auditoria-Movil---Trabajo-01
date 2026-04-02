package e.a.a.a;

import com.android.billingclient.api.Purchase;
import java.util.List;
/* loaded from: classes.dex */
public final class g implements n {
    public final /* synthetic */ i.a.s a;

    public g(i.a.s sVar) {
        this.a = sVar;
    }

    public final void a(j jVar, List<Purchase> list) {
        h.o.c.j.d(jVar, "billingResult");
        h.o.c.j.d(list, "purchases");
        this.a.M(new o(jVar, list));
    }
}
