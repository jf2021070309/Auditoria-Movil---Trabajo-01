package e.j.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import e.j.d.w;
import h.o.b.p;
import i.a.e0;
import java.util.List;
import java.util.Objects;
/* JADX WARN: Incorrect field signature: TT; */
@h.m.i.a.e(c = "com.zipoapps.ads.AdManager$loadBanners$1", f = "AdManager.kt", l = {197}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends h.m.i.a.h implements p<e0, h.m.d<? super h.k>, Object> {
    public final /* synthetic */ List<m> a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f8465b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f8466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Le/j/a/m;>;TT;Le/j/a/b;Lh/m/d<-Le/j/a/e;>;)V */
    public e(List list, Fragment fragment, b bVar, h.m.d dVar) {
        super(2, dVar);
        this.a = list;
        this.f8465b = fragment;
        this.f8466c = bVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new e(this.a, this.f8465b, this.f8466c, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        e eVar = new e(this.a, this.f8465b, this.f8466c, dVar);
        h.k kVar = h.k.a;
        eVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup viewGroup;
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        w.E0(obj);
        for (m mVar : this.a) {
            View view = this.f8465b.getView();
            boolean z = false;
            if (view == null) {
                viewGroup = null;
            } else {
                Objects.requireNonNull(mVar);
                viewGroup = (ViewGroup) view.findViewById(0);
            }
            if (viewGroup != null && viewGroup.getChildCount() == 0) {
                z = true;
                continue;
            }
            if (z) {
                b bVar = this.f8466c;
                h.r.f<Object>[] fVarArr = b.a;
                bVar.b();
                new StringBuilder().append("AdManager: Loading banner:");
                Objects.requireNonNull(mVar);
                throw null;
            }
        }
        return h.k.a;
    }
}
