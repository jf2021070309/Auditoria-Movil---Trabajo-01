package e.j.a;

import android.app.Activity;
import android.view.ViewGroup;
import e.j.d.w;
import h.o.b.p;
import i.a.e0;
import java.util.List;
import java.util.Objects;
/* JADX WARN: Incorrect field signature: TT; */
@h.m.i.a.e(c = "com.zipoapps.ads.AdManager$loadBanners$2", f = "AdManager.kt", l = {229}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends h.m.i.a.h implements p<e0, h.m.d<? super h.k>, Object> {
    public final /* synthetic */ List<m> a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f8467b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f8468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Le/j/a/m;>;TT;Le/j/a/b;Lh/m/d<-Le/j/a/f;>;)V */
    public f(List list, Activity activity, b bVar, h.m.d dVar) {
        super(2, dVar);
        this.a = list;
        this.f8467b = activity;
        this.f8468c = bVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new f(this.a, this.f8467b, this.f8468c, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        f fVar = new f(this.a, this.f8467b, this.f8468c, dVar);
        h.k kVar = h.k.a;
        fVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        w.E0(obj);
        for (m mVar : this.a) {
            Activity activity = this.f8467b;
            Objects.requireNonNull(mVar);
            if (((ViewGroup) activity.findViewById(0)).getChildCount() == 0) {
                b bVar = this.f8468c;
                h.r.f<Object>[] fVarArr = b.a;
                bVar.b();
                new StringBuilder().append("AdManager: Loading banner:");
                throw null;
            }
        }
        return h.k.a;
    }
}
