package e.j.d.c0;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.Scopes;
/* loaded from: classes2.dex */
public final class u {
    public static final u a = new u();

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.ContactSupport$sendEmail$1", f = "ContactSupport.kt", l = {35, 43}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8779b;

        /* renamed from: c  reason: collision with root package name */
        public Object f8780c;

        /* renamed from: d  reason: collision with root package name */
        public Object f8781d;

        /* renamed from: e  reason: collision with root package name */
        public int f8782e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Activity f8783f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f8784g;

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.ContactSupport$sendEmail$1$1", f = "ContactSupport.kt", l = {}, m = "invokeSuspend")
        /* renamed from: e.j.d.c0.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0191a extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
            public final /* synthetic */ Activity a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Intent f8785b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ Uri f8786c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0191a(Activity activity, Intent intent, Uri uri, h.m.d<? super C0191a> dVar) {
                super(2, dVar);
                this.a = activity;
                this.f8785b = intent;
                this.f8786c = uri;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new C0191a(this.a, this.f8785b, this.f8786c, dVar);
            }

            @Override // h.o.b.p
            public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
                C0191a c0191a = new C0191a(this.a, this.f8785b, this.f8786c, dVar);
                h.k kVar = h.k.a;
                c0191a.invokeSuspend(kVar);
                return kVar;
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                e.j.d.w.E0(obj);
                try {
                    this.a.startActivity(this.f8785b);
                    e.j.d.k.a.a().f();
                } catch (ActivityNotFoundException unused) {
                    Activity activity = this.a;
                    Uri uri = this.f8786c;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setDataAndType(uri, "application/zip");
                    try {
                        activity.startActivity(intent);
                        e.j.d.k.a.a().f();
                    } catch (ActivityNotFoundException e2) {
                        n.a.a.f9946d.c(e2);
                    }
                }
                return h.k.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, String str, h.m.d<? super a> dVar) {
            super(2, dVar);
            this.f8783f = activity;
            this.f8784g = str;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new a(this.f8783f, this.f8784g, dVar);
        }

        @Override // h.o.b.p
        public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
            return new a(this.f8783f, this.f8784g, dVar).invokeSuspend(h.k.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x0145 A[RETURN] */
        @Override // h.m.i.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 562
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(e.j.d.c0.u r9, android.content.Context r10, h.m.d r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.u.a(e.j.d.c0.u, android.content.Context, h.m.d):java.lang.Object");
    }

    public static final void b(Activity activity, String str) {
        h.o.c.j.e(activity, "activity");
        h.o.c.j.e(str, Scopes.EMAIL);
        e.j.d.w.Y(c.p.q.a((c.p.p) activity), null, null, new a(activity, str, null), 3, null);
    }
}
