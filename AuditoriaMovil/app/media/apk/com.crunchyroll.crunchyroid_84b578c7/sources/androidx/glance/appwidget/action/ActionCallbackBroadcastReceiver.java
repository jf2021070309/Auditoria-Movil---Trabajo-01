package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.k3.e;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.q4.c;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.s4.u;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
/* compiled from: ActionCallbackBroadcastReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "glance-appwidget_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ActionCallbackBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    /* compiled from: ActionCallbackBroadcastReceiver.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static Intent a(Context context, Class cls, int i, c cVar) {
            j.f(context, "context");
            j.f(cls, "callbackClass");
            j.f(cVar, "parameters");
            Intent putExtra = new Intent(context, ActionCallbackBroadcastReceiver.class).setPackage(context.getPackageName()).putExtra("ActionCallbackBroadcastReceiver:callbackClass", cls.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", i);
            j.e(putExtra, "Intent(context, ActionCa…AppWidgetId, appWidgetId)");
            Map<c.a<? extends Object>, Object> a = cVar.a();
            ArrayList arrayList = new ArrayList(a.size());
            for (Map.Entry<c.a<? extends Object>, Object> entry : a.entrySet()) {
                arrayList.add(new com.amazon.aps.iva.kb0.j(entry.getKey().a, entry.getValue()));
            }
            Object[] array = arrayList.toArray(new com.amazon.aps.iva.kb0.j[0]);
            j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            com.amazon.aps.iva.kb0.j[] jVarArr = (com.amazon.aps.iva.kb0.j[]) array;
            putExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", e.a((com.amazon.aps.iva.kb0.j[]) Arrays.copyOf(jVarArr, jVarArr.length)));
            return putExtra;
        }
    }

    /* compiled from: ActionCallbackBroadcastReceiver.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver$onReceive$1", f = "ActionCallbackBroadcastReceiver.kt", l = {64}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements p<g0, d<? super q>, Object> {
        public int h;
        public final /* synthetic */ Intent i;
        public final /* synthetic */ Context j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Intent intent, d dVar) {
            super(2, dVar);
            this.i = intent;
            this.j = context;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new b(this.j, this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Intent intent = this.i;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        Bundle bundle = extras.getBundle("ActionCallbackBroadcastReceiver:parameters");
                        if (bundle != null) {
                            com.amazon.aps.iva.q4.d I = w.I(new c.b[0]);
                            Set<String> keySet = bundle.keySet();
                            j.e(keySet, "paramsBundle.keySet()");
                            for (String str : keySet) {
                                j.e(str, "key");
                                I.d(new c.a(str), bundle.get(str));
                            }
                            if (extras.containsKey("android.widget.extra.CHECKED")) {
                                I.d(u.a, Boolean.valueOf(extras.getBoolean("android.widget.extra.CHECKED")));
                            }
                            String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
                            if (string != null) {
                                if (intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                                    extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId");
                                    Context context = this.j;
                                    this.h = 1;
                                    Class<?> cls = Class.forName(string);
                                    if (com.amazon.aps.iva.s4.a.class.isAssignableFrom(cls)) {
                                        Object newInstance = cls.newInstance();
                                        j.d(newInstance, "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback");
                                        q a = ((com.amazon.aps.iva.s4.a) newInstance).a(context, I);
                                        if (a != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                                            a = q.a;
                                        }
                                        if (a == aVar) {
                                            return aVar;
                                        }
                                    } else {
                                        throw new IllegalStateException("Provided class must implement ActionCallback.".toString());
                                    }
                                } else {
                                    throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId".toString());
                                }
                            } else {
                                throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("The intent must have action parameters extras.".toString());
                    }
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
            return q.a;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        com.amazon.aps.iva.n1.c.k(this, new b(context, intent, null));
    }
}
