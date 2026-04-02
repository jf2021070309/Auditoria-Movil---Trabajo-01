package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.n.e;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class ab implements AdAdapter {
    public abstract String A();

    public abstract List<com.facebook.ads.internal.n.e> B();

    public abstract int C();

    public abstract int D();

    public abstract com.facebook.ads.internal.n.c E();

    public String G() {
        return q();
    }

    public abstract void a(int i);

    public abstract void a(Context context, ac acVar, com.facebook.ads.internal.m.c cVar, Map<String, Object> map, e.d dVar);

    public abstract void a(View view, List<View> list);

    public abstract void a(ac acVar);

    public abstract void a(Map<String, String> map);

    public boolean a_() {
        return true;
    }

    public abstract void b(Map<String, String> map);

    public abstract void b_();

    public abstract String c();

    public abstract boolean c_();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public final AdPlacementType getPlacementType() {
        return AdPlacementType.NATIVE;
    }

    public abstract boolean h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract com.facebook.ads.internal.n.f l();

    public abstract com.facebook.ads.internal.n.f m();

    public abstract com.facebook.ads.internal.n.h n();

    public abstract String o();

    public abstract String p();

    public abstract String q();

    public abstract String r();

    public abstract String s();

    public abstract com.facebook.ads.internal.n.g t();

    public abstract com.facebook.ads.internal.n.f u();

    public abstract String v();

    public abstract String w();

    public abstract String x();

    public abstract String y();

    public abstract com.facebook.ads.internal.n.j z();
}
