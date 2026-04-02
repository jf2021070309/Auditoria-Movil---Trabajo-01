package e.j.b.i;

import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class b {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8517b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f8518c;

    /* renamed from: d  reason: collision with root package name */
    public final List<a> f8519d;

    /* renamed from: e  reason: collision with root package name */
    public final List<Pair<String, a>> f8520e;

    /* renamed from: f  reason: collision with root package name */
    public final List<c> f8521f;

    public b(b bVar) {
        Bundle bundle = new Bundle();
        this.f8518c = bundle;
        ArrayList arrayList = new ArrayList();
        this.f8519d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f8520e = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f8521f = arrayList3;
        this.a = bVar.a;
        this.f8517b = bVar.f8517b;
        bundle.putAll(bVar.f8518c);
        arrayList.addAll(bVar.f8519d);
        arrayList2.addAll(bVar.f8520e);
        arrayList3.addAll(bVar.f8521f);
    }

    public b(String str, boolean z) {
        this.f8518c = new Bundle();
        this.f8519d = new ArrayList();
        this.f8520e = new ArrayList();
        this.f8521f = new ArrayList();
        this.a = str;
        this.f8517b = z;
    }

    public b a(String str, int i2) {
        this.f8519d.add(new a(this.a, str, i2));
        return this;
    }

    public <T> b b(String str, T t) {
        this.f8518c.putString(str, String.valueOf(t));
        return this;
    }

    public b c(String str, String str2) {
        this.f8518c.putString(null, String.valueOf(str2));
        return this;
    }
}
