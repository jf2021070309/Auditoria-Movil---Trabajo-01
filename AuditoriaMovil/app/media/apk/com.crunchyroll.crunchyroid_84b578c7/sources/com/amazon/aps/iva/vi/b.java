package com.amazon.aps.iva.vi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.g8.e0;
import com.amazon.aps.iva.g8.f0;
import com.amazon.aps.iva.g8.g0;
import com.amazon.aps.iva.g8.i;
import com.amazon.aps.iva.g8.j0;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.vi.a;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: NavControllerAdapter.kt */
/* loaded from: classes.dex */
public class b<R extends com.amazon.aps.iva.vi.a> {
    public final i a;
    public final com.amazon.aps.iva.ui.c<?> b;

    /* compiled from: NavControllerAdapter.kt */
    @e(c = "com.crunchyroll.mvvm.navigation.compose.NavControllerAdapter$init$1", f = "NavControllerAdapter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.vi.a, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;
        public final /* synthetic */ b<R> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<R> bVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = bVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.i, dVar);
            aVar.h = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.vi.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            com.amazon.aps.iva.vi.a aVar2 = (com.amazon.aps.iva.vi.a) this.h;
            boolean a = j.a(aVar2, d.a);
            b<R> bVar = this.i;
            if (a) {
                bVar.c();
            } else {
                bVar.b(aVar2);
            }
            return q.a;
        }
    }

    public b(m0 m0Var, com.amazon.aps.iva.ui.c cVar) {
        j.f(m0Var, "navController");
        this.a = m0Var;
        this.b = cVar;
    }

    public final void a(g0 g0Var) {
        j.f(g0Var, "coroutineScope");
        com.amazon.aps.iva.dg.b.A(g0Var, new a0(this.b.c, new a(this, null)));
    }

    public void b(com.amazon.aps.iva.vi.a aVar) {
        j.f(aVar, FirebaseAnalytics.Param.DESTINATION);
        String a2 = aVar.a();
        i iVar = this.a;
        iVar.getClass();
        j.f(a2, "route");
        int i = com.amazon.aps.iva.g8.g0.j;
        Uri parse = Uri.parse(g0.a.a(a2));
        j.b(parse, "Uri.parse(this)");
        f0 f0Var = new f0(parse, null, null);
        j0 j0Var = iVar.c;
        if (j0Var != null) {
            g0.b j = j0Var.j(f0Var);
            if (j != null) {
                com.amazon.aps.iva.g8.g0 g0Var = j.b;
                Bundle d = g0Var.d(j.c);
                if (d == null) {
                    d = new Bundle();
                }
                Intent intent = new Intent();
                intent.setDataAndType(parse, null);
                intent.setAction(null);
                d.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                iVar.m(g0Var, d, null, null);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches request " + f0Var + " cannot be found in the navigation graph " + iVar.c);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + f0Var + ". Navigation graph has not been set for NavController " + iVar + '.').toString());
    }

    public void c() {
        Bundle bundle;
        int[] iArr;
        Bundle bundle2;
        Bundle bundle3;
        Intent intent;
        i iVar = this.a;
        boolean z = true;
        if (iVar.h() == 1) {
            Activity activity = iVar.b;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
            } else {
                iArr = null;
            }
            if (iArr != null) {
                if (iVar.f) {
                    j.c(activity);
                    Intent intent2 = activity.getIntent();
                    Bundle extras = intent2.getExtras();
                    j.c(extras);
                    int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                    j.c(intArray);
                    ArrayList c0 = o.c0(intArray);
                    ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    if (!c0.isEmpty()) {
                        int intValue = ((Number) c0.remove(f1.B(c0))).intValue();
                        if (parcelableArrayList != null) {
                            if (!parcelableArrayList.isEmpty()) {
                                Bundle bundle4 = (Bundle) parcelableArrayList.remove(f1.B(parcelableArrayList));
                            } else {
                                throw new NoSuchElementException("List is empty.");
                            }
                        }
                        if (!c0.isEmpty()) {
                            com.amazon.aps.iva.g8.g0 e = i.e(iVar.i(), intValue);
                            if (e instanceof j0) {
                                int i = j0.o;
                                intValue = j0.a.a((j0) e).h;
                            }
                            com.amazon.aps.iva.g8.g0 g = iVar.g();
                            int i2 = 0;
                            if ((g == null || intValue != g.h) ? false : false) {
                                e0 e0Var = new e0(iVar);
                                Bundle a2 = com.amazon.aps.iva.k3.e.a(new com.amazon.aps.iva.kb0.j("android-support-nav:controller:deepLinkIntent", intent2));
                                Bundle bundle5 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                                if (bundle5 != null) {
                                    a2.putAll(bundle5);
                                }
                                e0Var.b.putExtra("android-support-nav:controller:deepLinkExtras", a2);
                                Iterator it = c0.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    int i3 = i2 + 1;
                                    if (i2 >= 0) {
                                        int intValue2 = ((Number) next).intValue();
                                        if (parcelableArrayList != null) {
                                            bundle3 = (Bundle) parcelableArrayList.get(i2);
                                        } else {
                                            bundle3 = null;
                                        }
                                        e0Var.d.add(new e0.a(intValue2, bundle3));
                                        if (e0Var.c != null) {
                                            e0Var.c();
                                        }
                                        i2 = i3;
                                    } else {
                                        f1.S();
                                        throw null;
                                    }
                                }
                                e0Var.a().f();
                                activity.finish();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new NoSuchElementException("List is empty.");
                }
                return;
            }
            com.amazon.aps.iva.g8.g0 g2 = iVar.g();
            j.c(g2);
            int i4 = g2.h;
            for (j0 j0Var = g2.c; j0Var != null; j0Var = j0Var.c) {
                if (j0Var.l != i4) {
                    Bundle bundle6 = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle6.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        j0 j0Var2 = iVar.c;
                        j.c(j0Var2);
                        Intent intent3 = activity.getIntent();
                        j.e(intent3, "activity!!.intent");
                        g0.b j = j0Var2.j(new f0(intent3));
                        if (j != null) {
                            bundle2 = j.c;
                        } else {
                            bundle2 = null;
                        }
                        if (bundle2 != null) {
                            bundle6.putAll(j.b.d(j.c));
                        }
                    }
                    e0 e0Var2 = new e0(iVar);
                    int i5 = j0Var.h;
                    ArrayList arrayList = e0Var2.d;
                    arrayList.clear();
                    arrayList.add(new e0.a(i5, null));
                    if (e0Var2.c != null) {
                        e0Var2.c();
                    }
                    e0Var2.b.putExtra("android-support-nav:controller:deepLinkExtras", bundle6);
                    e0Var2.a().f();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                i4 = j0Var.h;
            }
            return;
        }
        iVar.n();
    }
}
