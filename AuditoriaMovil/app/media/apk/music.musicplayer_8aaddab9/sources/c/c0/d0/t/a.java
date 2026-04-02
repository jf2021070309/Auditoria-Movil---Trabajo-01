package c.c0.d0.t;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
/* loaded from: classes.dex */
public class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.c0.d0.l f1531b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ UUID f1532c;

    public a(c.c0.d0.l lVar, UUID uuid) {
        this.f1531b = lVar;
        this.f1532c = uuid;
    }

    @Override // c.c0.d0.t.d
    public void c() {
        WorkDatabase workDatabase = this.f1531b.f1372f;
        workDatabase.c();
        try {
            a(this.f1531b, this.f1532c.toString());
            workDatabase.k();
            workDatabase.g();
            b(this.f1531b);
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
