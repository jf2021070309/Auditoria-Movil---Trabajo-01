package com.amazon.aps.iva.v90;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.k.q;
/* compiled from: PhilologyInterceptor.kt */
/* loaded from: classes4.dex */
public final class c implements com.amazon.aps.iva.ya0.d {
    public static final c a = new c();

    @Override // com.amazon.aps.iva.ya0.d
    public final com.amazon.aps.iva.ya0.c a(com.amazon.aps.iva.za0.b bVar) {
        com.amazon.aps.iva.ya0.c a2 = bVar.a(bVar.c);
        a2.getClass();
        AttributeSet attributeSet = a2.d;
        View view = null;
        View view2 = a2.a;
        if (view2 != null && attributeSet != null) {
            i a3 = a.c.a(view2);
            if (a3 == null) {
                if (view2 instanceof Toolbar) {
                    a3 = com.amazon.aps.iva.w90.a.b;
                } else {
                    a3 = null;
                }
                if (a3 == null) {
                    if (view2 instanceof androidx.appcompat.widget.Toolbar) {
                        a3 = com.amazon.aps.iva.bo.e.b;
                    } else if (view2 instanceof TextView) {
                        a3 = com.amazon.aps.iva.ff0.b.d;
                    } else {
                        a3 = null;
                    }
                }
                if (a3 == null) {
                    a3 = z.b;
                }
            }
            view2 = a3.e(view2, attributeSet);
        }
        String str = a2.b;
        if (str != null) {
            if (view2 != null) {
                if (com.amazon.aps.iva.yb0.j.a(str, view2.getClass().getName())) {
                    view = view2;
                } else {
                    StringBuilder c = q.c("name (", str, ") must be the view's fully qualified name (");
                    c.append(view2.getClass().getName());
                    c.append(')');
                    throw new IllegalStateException(c.toString().toString());
                }
            }
            Context context = a2.c;
            if (context != null) {
                return new com.amazon.aps.iva.ya0.c(view, str, context, attributeSet);
            }
            throw new IllegalStateException("context == null");
        }
        throw new IllegalStateException("name == null".toString());
    }
}
