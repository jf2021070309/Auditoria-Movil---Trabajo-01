package c.c0.d0.t;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.c0.d0.l f1535b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f1536c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f1537d;

    public c(c.c0.d0.l lVar, String str, boolean z) {
        this.f1535b = lVar;
        this.f1536c = str;
        this.f1537d = z;
    }

    @Override // c.c0.d0.t.d
    public void c() {
        WorkDatabase workDatabase = this.f1535b.f1372f;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((c.c0.d0.s.r) workDatabase.q()).g(this.f1536c)).iterator();
            while (it.hasNext()) {
                a(this.f1535b, (String) it.next());
            }
            workDatabase.k();
            workDatabase.g();
            if (this.f1537d) {
                b(this.f1535b);
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
