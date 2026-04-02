package androidx.glance.appwidget;

import android.appwidget.AppWidgetProviderInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.n1.c;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.r4.i0;
import com.amazon.aps.iva.r4.j0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MyPackageReplacedReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/glance/appwidget/MyPackageReplacedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "glance-appwidget_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class MyPackageReplacedReceiver extends BroadcastReceiver {

    /* compiled from: MyPackageReplacedReceiver.kt */
    @e(c = "androidx.glance.appwidget.MyPackageReplacedReceiver$onReceive$1", f = "MyPackageReplacedReceiver.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends i implements p<g0, d<? super q>, Object> {
        public int h;
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, d<? super a> dVar) {
            super(2, dVar);
            this.i = context;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new a(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                i0 i0Var = new i0(this.i);
                this.h = 1;
                String packageName = i0Var.a.getPackageName();
                List<AppWidgetProviderInfo> installedProviders = i0Var.b.getInstalledProviders();
                j.e(installedProviders, "appWidgetManager.installedProviders");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : installedProviders) {
                    if (j.a(((AppWidgetProviderInfo) obj2).provider.getPackageName(), packageName)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
                }
                Object a = ((com.amazon.aps.iva.z3.i) i0Var.c.getValue()).a(new j0(com.amazon.aps.iva.lb0.x.c1(arrayList2), null), this);
                if (a != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                    a = q.a;
                }
                if (a == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        c.k(this, new a(context, null));
    }
}
