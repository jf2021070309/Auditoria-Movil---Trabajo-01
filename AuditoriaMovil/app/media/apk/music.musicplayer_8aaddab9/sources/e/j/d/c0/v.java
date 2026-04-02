package e.j.d.c0;

import android.content.SharedPreferences;
import com.facebook.applinks.AppLinkData;
import i.a.g1;
import i.a.o0;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.FacebookInstallData$fetchAndReport$2", f = "FacebookInstallData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super g1>, Object> {
    public /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f8787b;

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.FacebookInstallData$fetchAndReport$2$1", f = "FacebookInstallData.kt", l = {20}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public int f8788b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ w f8789c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar, h.m.d<? super a> dVar) {
            super(2, dVar);
            this.f8789c = wVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new a(this.f8789c, dVar);
        }

        @Override // h.o.b.p
        public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
            return new a(this.f8789c, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            w wVar;
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.f8788b;
            if (i2 == 0) {
                e.j.d.w.E0(obj);
                if (!this.f8789c.f8790b.a.getBoolean("is_facebook_install_handled", false)) {
                    w wVar2 = this.f8789c;
                    this.a = wVar2;
                    this.f8788b = 1;
                    Object a = wVar2.a(this);
                    if (a == aVar) {
                        return aVar;
                    }
                    wVar = wVar2;
                    obj = a;
                }
                return h.k.a;
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wVar = (w) this.a;
                e.j.d.w.E0(obj);
            }
            wVar.b((AppLinkData) obj);
            SharedPreferences.Editor edit = this.f8789c.f8790b.a.edit();
            edit.putBoolean("is_facebook_install_handled", true);
            edit.apply();
            return h.k.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, h.m.d<? super v> dVar) {
        super(2, dVar);
        this.f8787b = wVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        v vVar = new v(this.f8787b, dVar);
        vVar.a = obj;
        return vVar;
    }

    @Override // h.o.b.p
    public Object i(i.a.e0 e0Var, h.m.d<? super g1> dVar) {
        v vVar = new v(this.f8787b, dVar);
        vVar.a = e0Var;
        return vVar.invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        e.j.d.w.E0(obj);
        return e.j.d.w.Y((i.a.e0) this.a, o0.f9155b, null, new a(this.f8787b, null), 2, null);
    }
}
