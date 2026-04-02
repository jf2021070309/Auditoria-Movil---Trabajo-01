package c.c0.d0.t;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.c0.d0.l f1533b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f1534c;

    public b(c.c0.d0.l lVar, String str) {
        this.f1533b = lVar;
        this.f1534c = str;
    }

    @Override // c.c0.d0.t.d
    public void c() {
        WorkDatabase workDatabase = this.f1533b.f1372f;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((c.c0.d0.s.r) workDatabase.q()).h(this.f1534c)).iterator();
            while (it.hasNext()) {
                a(this.f1533b, (String) it.next());
            }
            workDatabase.k();
            workDatabase.g();
            b(this.f1533b);
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
