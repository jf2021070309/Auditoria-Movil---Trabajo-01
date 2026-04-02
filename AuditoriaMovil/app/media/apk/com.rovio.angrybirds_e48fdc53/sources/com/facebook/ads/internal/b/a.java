package com.facebook.ads.internal.b;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.facebook.ads.internal.q.a.o;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class a implements o<Bundle> {
    private final View a;
    private final List<d> b;
    private c c;

    public a(View view, List<b> list) {
        this.a = view;
        this.b = new ArrayList(list.size());
        for (b bVar : list) {
            this.b.add(new d(bVar));
        }
        this.c = new c();
    }

    public a(View view, List<b> list, Bundle bundle) {
        this.a = view;
        this.b = new ArrayList(list.size());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("TESTS");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                this.c = (c) bundle.getSerializable("STATISTICS");
                return;
            } else {
                this.b.add(new d(list.get(i2), (Bundle) parcelableArrayList.get(i2)));
                i = i2 + 1;
            }
        }
    }

    public void a() {
        this.c.a();
    }

    public void a(double d, double d2) {
        if (d2 >= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            this.c.b(d, d2);
        }
        double c = com.facebook.ads.internal.r.a.a(this.a, 0).c();
        this.c.a(d, c);
        for (d dVar : this.b) {
            dVar.a(d, c);
        }
    }

    public c b() {
        return this.c;
    }

    @Override // com.facebook.ads.internal.q.a.o
    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("STATISTICS", this.c);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.b.size());
        for (d dVar : this.b) {
            arrayList.add(dVar.g());
        }
        bundle.putParcelableArrayList("TESTS", arrayList);
        return bundle;
    }
}
