package e.j.a;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import e.j.a.b;
import e.j.d.w;
import h.o.b.p;
import i.a.c0;
import i.a.e0;
import i.a.o0;
import i.a.p1;
@h.m.i.a.e(c = "com.zipoapps.ads.AdManager$loadBanner$1", f = "AdManager.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends h.m.i.a.h implements p<e0, h.m.d<? super h.k>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8462b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f8463c;

    @h.m.i.a.e(c = "com.zipoapps.ads.AdManager$loadBanner$1$banner$1", f = "AdManager.kt", l = {165}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.h implements p<e0, h.m.d<? super View>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f8464b;

        /* renamed from: e.j.a.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0184a extends AdListener {
            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                e.j.d.b.g(e.j.d.k.a.a().f8813j, b.a.BANNER, null, 2);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                e.j.d.b.e(e.j.d.k.a.a().f8813j, b.a.BANNER, null, 2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, h.m.d<? super a> dVar) {
            super(2, dVar);
            this.f8464b = bVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new a(this.f8464b, dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super View> dVar) {
            return new a(this.f8464b, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                w.E0(obj);
                b bVar = this.f8464b;
                C0184a c0184a = new C0184a();
                this.a = 1;
                obj = b.e(bVar, null, c0184a, false, this, 5);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.E0(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ViewGroup viewGroup, b bVar, h.m.d<? super d> dVar) {
        super(2, dVar);
        this.f8462b = viewGroup;
        this.f8463c = bVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new d(this.f8462b, this.f8463c, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        return new d(this.f8462b, this.f8463c, dVar).invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            w.E0(obj);
            c0 c0Var = o0.a;
            p1 p1Var = i.a.i2.l.f9078c;
            a aVar2 = new a(this.f8463c, null);
            this.a = 1;
            obj = w.J0(p1Var, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.E0(obj);
        }
        View view = (View) obj;
        if (view != null) {
            this.f8462b.addView(view);
        }
        return h.k.a;
    }
}
