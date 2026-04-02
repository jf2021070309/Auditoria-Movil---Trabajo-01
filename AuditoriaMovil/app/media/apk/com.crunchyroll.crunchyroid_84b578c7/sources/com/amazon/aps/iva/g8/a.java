package com.amazon.aps.iva.g8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.amazon.aps.iva.g8.r0;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: ActivityNavigator.kt */
@r0.b("activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/aps/iva/g8/a;", "Lcom/amazon/aps/iva/g8/r0;", "Lcom/amazon/aps/iva/g8/a$a;", "a", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class a extends r0<C0294a> {
    public final Activity c;

    /* compiled from: ActivityNavigator.kt */
    /* renamed from: com.amazon.aps.iva.g8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0294a extends g0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0294a(r0<? extends C0294a> r0Var) {
            super(r0Var);
            com.amazon.aps.iva.yb0.j.f(r0Var, "activityNavigator");
        }

        @Override // com.amazon.aps.iva.g8.g0
        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0294a) || !super.equals(obj)) {
                return false;
            }
            C0294a c0294a = (C0294a) obj;
            C0294a c0294a2 = (C0294a) obj;
            if (!com.amazon.aps.iva.yb0.j.a(null, null)) {
                return false;
            }
            return true;
        }

        @Override // com.amazon.aps.iva.g8.g0
        public final int hashCode() {
            return (((super.hashCode() * 31) + 0) * 31) + 0;
        }

        @Override // com.amazon.aps.iva.g8.g0
        public final String toString() {
            String str = super.toString();
            com.amazon.aps.iva.yb0.j.e(str, "sb.toString()");
            return str;
        }
    }

    /* compiled from: ActivityNavigator.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Context, Context> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Context invoke(Context context) {
            Context context2 = context;
            com.amazon.aps.iva.yb0.j.f(context2, "it");
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    public a(Context context) {
        Object obj;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        Iterator it = com.amazon.aps.iva.ne0.k.R(context, b.h).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.c = (Activity) obj;
    }

    @Override // com.amazon.aps.iva.g8.r0
    public final C0294a a() {
        return new C0294a(this);
    }

    @Override // com.amazon.aps.iva.g8.r0
    public final g0 c(g0 g0Var) {
        throw new IllegalStateException(defpackage.e.f(new StringBuilder("Destination "), ((C0294a) g0Var).h, " does not have an Intent set.").toString());
    }

    @Override // com.amazon.aps.iva.g8.r0
    public final boolean f() {
        Activity activity = this.c;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
