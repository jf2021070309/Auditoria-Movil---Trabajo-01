package e.j.d.b0.e;

import com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity;
import e.j.d.c0.d0;
import e.j.d.w;
import h.k;
import h.m.i.a.h;
import h.o.b.p;
import h.o.c.j;
import i.a.e0;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity$onCreate$3$1$1", f = "StartLikeProActivity.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends h implements p<e0, h.m.d<? super k>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.j.d.k f8609b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ StartLikeProActivity f8610c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e.j.d.h f8611d;

    /* loaded from: classes2.dex */
    public static final class a implements i.a.h2.c<d0> {
        public final /* synthetic */ e.j.d.k a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e.j.d.h f8612b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ StartLikeProActivity f8613c;

        public a(e.j.d.k kVar, e.j.d.h hVar, StartLikeProActivity startLikeProActivity) {
            this.a = kVar;
            this.f8612b = hVar;
            this.f8613c = startLikeProActivity;
        }

        @Override // i.a.h2.c
        public Object b(d0 d0Var, h.m.d<? super k> dVar) {
            d0 d0Var2 = d0Var;
            if (w.U(d0Var2.a)) {
                this.a.f8813j.l(this.f8612b.a);
                StartLikeProActivity startLikeProActivity = this.f8613c;
                int i2 = StartLikeProActivity.f4936c;
                startLikeProActivity.y();
            } else {
                n.a.a.b("PremiumHelper").b(j.i("Purchase failed: ", new Integer(d0Var2.a.a)), new Object[0]);
            }
            return k.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e.j.d.k kVar, StartLikeProActivity startLikeProActivity, e.j.d.h hVar, h.m.d<? super f> dVar) {
        super(2, dVar);
        this.f8609b = kVar;
        this.f8610c = startLikeProActivity;
        this.f8611d = hVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<k> create(Object obj, h.m.d<?> dVar) {
        return new f(this.f8609b, this.f8610c, this.f8611d, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super k> dVar) {
        return new f(this.f8609b, this.f8610c, this.f8611d, dVar).invokeSuspend(k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            w.E0(obj);
            i.a.h2.b<d0> i3 = this.f8609b.i(this.f8610c, this.f8611d);
            a aVar2 = new a(this.f8609b, this.f8611d, this.f8610c);
            this.a = 1;
            if (i3.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.E0(obj);
        }
        return k.a;
    }
}
