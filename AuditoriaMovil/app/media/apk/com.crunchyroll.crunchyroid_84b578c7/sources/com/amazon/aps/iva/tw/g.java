package com.amazon.aps.iva.tw;

import android.content.Context;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.GsonHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: UserDownloadsStore.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.xe.c<b> implements com.amazon.aps.iva.mw.f {
    public final c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, d dVar) {
        super(new e(context, GsonHolder.getInstance()));
        j.f(context, "context");
        this.c = dVar;
    }

    @Override // com.amazon.aps.iva.xe.c, com.amazon.aps.iva.xe.d
    public final void clear() {
        super.clear();
        this.c.clear();
    }

    @Override // com.amazon.aps.iva.mw.f
    public final void p(String... strArr) {
        j.f(strArr, "downloadId");
        X0(o.b0(strArr));
        this.c.p((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.amazon.aps.iva.mw.f
    public final ArrayList s() {
        List<b> T0 = x.T0(q(), new f(this.c.y0().c()));
        ArrayList arrayList = new ArrayList(r.Y(T0));
        for (b bVar : T0) {
            arrayList.add(bVar.a());
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.mw.f
    public final void t(String... strArr) {
        j.f(strArr, "downloadId");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!contains(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new b((String) it.next()));
        }
        n1(arrayList2);
        String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
        this.c.P0((String[]) Arrays.copyOf(strArr2, strArr2.length));
    }
}
