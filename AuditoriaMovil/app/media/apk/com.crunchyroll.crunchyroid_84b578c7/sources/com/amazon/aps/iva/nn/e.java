package com.amazon.aps.iva.nn;

import android.content.Context;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: FiltersListFormatter.kt */
/* loaded from: classes2.dex */
public final class e implements d {
    public final Context a;

    /* compiled from: FiltersListFormatter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mn.b, CharSequence> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(com.amazon.aps.iva.mn.b bVar) {
            com.amazon.aps.iva.mn.b bVar2 = bVar;
            j.f(bVar2, "it");
            String string = e.this.a.getString(bVar2.getTitle());
            j.e(string, "context.getString(it.title)");
            return string;
        }
    }

    public e(Context context) {
        this.a = context;
    }

    @Override // com.amazon.aps.iva.nn.d
    public final String a(List<? extends com.amazon.aps.iva.mn.b> list) {
        j.f(list, "filters");
        return x.B0(list, ", ", null, null, new a(), 30);
    }
}
