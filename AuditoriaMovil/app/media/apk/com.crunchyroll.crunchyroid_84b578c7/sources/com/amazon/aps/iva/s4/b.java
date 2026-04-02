package com.amazon.aps.iva.s4;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.glance.appwidget.action.ActionTrampolineActivity;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import com.amazon.aps.iva.r4.a2;
/* compiled from: ActionTrampoline.kt */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: ActionTrampoline.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.ACTIVITY.ordinal()] = 1;
            iArr[c.BROADCAST.ordinal()] = 2;
            iArr[c.CALLBACK.ordinal()] = 3;
            iArr[c.SERVICE.ordinal()] = 4;
            iArr[c.FOREGROUND_SERVICE.ordinal()] = 5;
            a = iArr;
        }
    }

    public static final Intent a(Intent intent, a2 a2Var, int i, c cVar) {
        Class cls;
        com.amazon.aps.iva.yb0.j.f(intent, "<this>");
        com.amazon.aps.iva.yb0.j.f(cVar, "type");
        if (cVar == c.ACTIVITY) {
            cls = ActionTrampolineActivity.class;
        } else {
            cls = InvisibleActionTrampolineActivity.class;
        }
        Intent intent2 = new Intent(a2Var.a, cls);
        intent2.setData(b(a2Var, i, cVar));
        intent2.putExtra("ACTION_TYPE", cVar.name());
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    public static final Uri b(a2 a2Var, int i, c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "type");
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(cVar.name());
        builder.appendQueryParameter("appWidgetId", String.valueOf(a2Var.b));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", com.amazon.aps.iva.o2.g.d(a2Var.j));
        if (a2Var.f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(a2Var.k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(a2Var.l));
        }
        Uri build = builder.build();
        com.amazon.aps.iva.yb0.j.e(build, "Builder().apply {\n    sc…        )\n    }\n}.build()");
        return build;
    }

    public static final void c(Activity activity, Intent intent) {
        com.amazon.aps.iva.yb0.j.f(activity, "<this>");
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra != null) {
            Intent intent2 = (Intent) parcelableExtra;
            if (intent.hasExtra("android.widget.extra.CHECKED")) {
                intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
            }
            String stringExtra = intent.getStringExtra("ACTION_TYPE");
            if (stringExtra != null) {
                int i = a.a[c.valueOf(stringExtra).ordinal()];
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                i.a.a(activity, intent2);
                            }
                        } else {
                            activity.startService(intent2);
                        }
                    } else {
                        activity.sendBroadcast(intent2);
                    }
                } else {
                    activity.startActivity(intent2);
                }
                activity.finish();
                return;
            }
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type".toString());
        }
        throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.".toString());
    }
}
