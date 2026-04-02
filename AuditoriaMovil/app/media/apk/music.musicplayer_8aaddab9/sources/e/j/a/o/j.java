package e.j.a.o;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.net.SyslogConstants;
import h.o.b.p;
import i.a.e0;
@h.m.i.a.e(c = "com.zipoapps.ads.exitads.ExitAds$loadExitAd$1", f = "ExitAds.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends h.m.i.a.h implements p<e0, h.m.d<? super h.k>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f8499b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f8500c;

    /* loaded from: classes2.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ ViewGroup a;

        public a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            h.o.c.j.e(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.a.setMinimumHeight(view.getHeight());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, Activity activity, h.m.d<? super j> dVar) {
        super(2, dVar);
        this.f8499b = fVar;
        this.f8500c = activity;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new j(this.f8499b, this.f8500c, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        return new j(this.f8499b, this.f8500c, dVar).invokeSuspend(h.k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
        if (((android.view.ViewGroup) r8.findViewById(music.musicplayer.R.id.ph_ad_close_container)).getChildCount() == 0) goto L20;
     */
    @Override // h.m.i.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.m.h.a r0 = h.m.h.a.COROUTINE_SUSPENDED
            int r1 = r7.a
            r2 = 2131296741(0x7f0901e5, float:1.8211407E38)
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            e.j.d.w.E0(r8)
            goto L76
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            e.j.d.w.E0(r8)
            e.j.a.o.f r8 = r7.f8499b
            android.app.Activity r1 = r7.f8500c
            java.util.Objects.requireNonNull(r8)
            r8 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r8 = r1.findViewById(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r4 = 2131296743(0x7f0901e7, float:1.8211411E38)
            android.view.View r4 = r8.findViewById(r4)
            r5 = 0
            if (r4 != 0) goto L5a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r1)
            r6 = 2131493020(0x7f0c009c, float:1.8609508E38)
            android.view.View r4 = r4.inflate(r6, r8, r5)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r6 = 2131493018(0x7f0c009a, float:1.8609504E38)
            android.view.View r1 = r1.inflate(r6, r8, r5)
            r8.addView(r1)
            r8.addView(r4)
            e.j.a.o.c r8 = new e.j.a.o.c
            r8.<init>()
            c.i.k.d0.C(r4, r8)
            goto L66
        L5a:
            android.view.View r8 = r8.findViewById(r2)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r8 = r8.getChildCount()
            if (r8 != 0) goto L67
        L66:
            r5 = 1
        L67:
            if (r5 == 0) goto Lb4
            e.j.a.o.f r8 = r7.f8499b
            android.app.Activity r1 = r7.f8500c
            r7.a = r3
            java.lang.Object r8 = e.j.a.o.f.a(r8, r1, r7)
            if (r8 != r0) goto L76
            return r0
        L76:
            android.view.View r8 = (android.view.View) r8
            android.app.Activity r0 = r7.f8500c
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.util.concurrent.atomic.AtomicInteger r1 = c.i.k.d0.a
            boolean r1 = c.i.k.d0.f.c(r8)
            if (r1 == 0) goto L96
            boolean r1 = r8.isLayoutRequested()
            if (r1 != 0) goto L96
            int r1 = r8.getHeight()
            r0.setMinimumHeight(r1)
            goto L9e
        L96:
            e.j.a.o.j$a r1 = new e.j.a.o.j$a
            r1.<init>(r0)
            r8.addOnLayoutChangeListener(r1)
        L9e:
            r0.addView(r8)
            android.app.Activity r8 = r7.f8500c
            r0 = 2131296742(0x7f0901e6, float:1.821141E38)
            android.view.View r8 = r8.findViewById(r0)
            java.lang.String r0 = "activity.findViewById<Vi….id.ph_ad_close_progress)"
            h.o.c.j.d(r8, r0)
            r0 = 8
            r8.setVisibility(r0)
        Lb4:
            h.k r8 = h.k.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.a.o.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
