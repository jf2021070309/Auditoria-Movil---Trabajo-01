package com.applovin.impl.mediation.debugger.ui.c;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.debugger.a.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.e;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b extends d {
    private final com.applovin.impl.mediation.debugger.a.b.b a;
    private List<c> b;
    private final List<c> d;
    private final List<c> e;
    private final List<c> f;
    private final List<c> g;
    private SpannedString h;

    /* loaded from: classes.dex */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.applovin.impl.mediation.debugger.a.b.b bVar, Context context) {
        super(context);
        this.a = bVar;
        if (bVar.a() == b.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.h = new SpannedString(spannableString);
        } else {
            this.h = new SpannedString("");
        }
        this.b = d();
        this.d = a(bVar.p());
        this.e = a(bVar.r());
        this.f = b(bVar.q());
        this.g = h();
        notifyDataSetChanged();
    }

    private int a(boolean z) {
        return z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }

    private c a(b.EnumC0016b enumC0016b) {
        c.a p = c.p();
        if (enumC0016b == b.EnumC0016b.READY) {
            p.a(this.c);
        }
        return p.a("Test Mode").b(enumC0016b.a()).b(enumC0016b.b()).d(enumC0016b.c()).a(true).a();
    }

    private List<c> a(com.applovin.impl.mediation.debugger.a.b.c cVar) {
        ArrayList arrayList = new ArrayList(1);
        if (cVar.a()) {
            boolean b = cVar.b();
            arrayList.add(c.a(b ? c.b.RIGHT_DETAIL : c.b.DETAIL).a("Cleartext Traffic").b(b ? null : this.h).d(cVar.c()).a(a(b)).c(b(b)).a(true ^ b).a());
        }
        return arrayList;
    }

    private List<c> a(List<com.applovin.impl.mediation.debugger.a.b.d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.a.b.d dVar : list) {
                boolean c = dVar.c();
                arrayList.add(c.a(c ? c.b.RIGHT_DETAIL : c.b.DETAIL).a(dVar.a()).b(c ? null : this.h).d(dVar.b()).a(a(c)).c(b(c)).a(!c).a());
            }
        }
        return arrayList;
    }

    private int b(boolean z) {
        return e.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.c);
    }

    private List<c> b(List<com.applovin.impl.mediation.debugger.a.b.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.a.b.a aVar : list) {
                boolean c = aVar.c();
                arrayList.add(c.a(c ? c.b.RIGHT_DETAIL : c.b.DETAIL).a(aVar.a()).b(c ? null : this.h).d(aVar.b()).a(a(c)).c(b(c)).a(!c).a());
            }
        }
        return arrayList;
    }

    private c c(List<String> list) {
        return c.p().a("Region/VPN Required").b(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private List<c> d() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(e());
        arrayList.add(f());
        arrayList.add(g());
        return arrayList;
    }

    private c e() {
        c.a b = c.p().a("SDK").b(this.a.i());
        if (TextUtils.isEmpty(this.a.i())) {
            b.a(a(this.a.d())).c(b(this.a.d()));
        }
        return b.a();
    }

    private String e(int i) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i ? "Initializing..." : "Waiting to Initialize...";
    }

    private c f() {
        c.a b = c.p().a("Adapter").b(this.a.j());
        if (TextUtils.isEmpty(this.a.j())) {
            b.a(a(this.a.e())).c(b(this.a.e()));
        }
        return b.a();
    }

    private c g() {
        c.a b;
        boolean z = false;
        if (this.a.s().B().b()) {
            b = c.p().a("Initialize with Activity Context").d("Please ensure that you are initializing the AppLovin MAX SDK with an Activity Context.").a(a(false)).c(b(false));
            z = true;
        } else {
            b = c.p().a("Initialization Status").b(e(this.a.b()));
        }
        return b.a(z).a();
    }

    private List<c> h() {
        ArrayList arrayList = new ArrayList(2);
        if (this.a.c() != b.EnumC0016b.NOT_SUPPORTED) {
            if (this.a.m() != null) {
                arrayList.add(c(this.a.m()));
            }
            arrayList.add(a(this.a.c()));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int a(int i) {
        return (i == a.INTEGRATIONS.ordinal() ? this.b : i == a.PERMISSIONS.ordinal() ? this.d : i == a.CONFIGURATION.ordinal() ? this.e : i == a.DEPENDENCIES.ordinal() ? this.f : this.g).size();
    }

    public com.applovin.impl.mediation.debugger.a.b.b a() {
        return this.a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected c b(int i) {
        return i == a.INTEGRATIONS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("INTEGRATIONS") : i == a.PERMISSIONS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("PERMISSIONS") : i == a.CONFIGURATION.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("CONFIGURATION") : i == a.DEPENDENCIES.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("DEPENDENCIES") : new com.applovin.impl.mediation.debugger.ui.d.e("TEST ADS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected List<c> c(int i) {
        return i == a.INTEGRATIONS.ordinal() ? this.b : i == a.PERMISSIONS.ordinal() ? this.d : i == a.CONFIGURATION.ordinal() ? this.e : i == a.DEPENDENCIES.ordinal() ? this.f : this.g;
    }

    public void c() {
        this.b = d();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }
}
