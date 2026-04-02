package com.amazon.aps.iva.dr;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.gr.p;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
/* compiled from: JetpackViewAttributesProvider.kt */
/* loaded from: classes2.dex */
public final class c implements p {
    @Override // com.amazon.aps.iva.gr.p
    public final void a(View view, LinkedHashMap linkedHashMap) {
        String concat;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof RecyclerView) && view != null && (view.getLayoutParams() instanceof RecyclerView.q)) {
                linkedHashMap.put("action.target.parent.index", Integer.valueOf(((RecyclerView) parent).getChildAdapterPosition(view)));
                linkedHashMap.put("action.target.parent.classname", parent.getClass().getCanonicalName());
                View view2 = (View) parent;
                try {
                    concat = view2.getResources().getResourceEntryName(view2.getId());
                    if (concat == null) {
                        int id = view2.getId();
                        x.x(16);
                        String num = Integer.toString(id, 16);
                        j.e(num, "toString(this, checkRadix(radix))");
                        concat = "0x".concat(num);
                    }
                } catch (Resources.NotFoundException unused) {
                    int id2 = view2.getId();
                    x.x(16);
                    String num2 = Integer.toString(id2, 16);
                    j.e(num2, "toString(this, checkRadix(radix))");
                    concat = "0x".concat(num2);
                }
                linkedHashMap.put("action.target.parent.resource_id", concat);
                return;
            }
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (j.a(c.class, cls)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c.class.hashCode();
    }
}
