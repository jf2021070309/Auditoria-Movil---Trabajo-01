package com.applovin.impl.mediation.debugger.ui.c;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.debugger.a.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b extends d {
    private final com.applovin.impl.mediation.debugger.a.b.b a;

    /* renamed from: b  reason: collision with root package name */
    private List<c> f3594b;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f3595d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f3596e;

    /* renamed from: f  reason: collision with root package name */
    private final List<c> f3597f;

    /* renamed from: g  reason: collision with root package name */
    private final List<c> f3598g;

    /* renamed from: h  reason: collision with root package name */
    private SpannedString f3599h;

    /* loaded from: classes.dex */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public b(com.applovin.impl.mediation.debugger.a.b.b bVar, Context context) {
        super(context);
        this.a = bVar;
        if (bVar.a() == b.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f3599h = new SpannedString(spannableString);
        } else {
            this.f3599h = new SpannedString("");
        }
        this.f3594b = d();
        this.f3595d = a(bVar.r());
        this.f3596e = a(bVar.t());
        this.f3597f = b(bVar.s());
        this.f3598g = h();
        notifyDataSetChanged();
    }

    private int a(boolean z) {
        return z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }

    private c a(b.EnumC0077b enumC0077b) {
        c.a p = c.p();
        if (enumC0077b == b.EnumC0077b.READY) {
            p.a(this.f3645c);
        }
        return p.a("Test Mode").b(enumC0077b.a()).b(enumC0077b.b()).d(enumC0077b.c()).a(true).a();
    }

    private List<c> a(com.applovin.impl.mediation.debugger.a.b.c cVar) {
        ArrayList arrayList = new ArrayList(1);
        if (cVar.a()) {
            boolean b2 = cVar.b();
            arrayList.add(c.a(b2 ? c.b.RIGHT_DETAIL : c.b.DETAIL).a("Cleartext Traffic").b(b2 ? null : this.f3599h).d(cVar.c()).a(a(b2)).c(b(b2)).a(true ^ b2).a());
        }
        return arrayList;
    }

    private List<c> a(List<com.applovin.impl.mediation.debugger.a.b.d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.a.b.d dVar : list) {
                boolean c2 = dVar.c();
                arrayList.add(c.a(c2 ? c.b.RIGHT_DETAIL : c.b.DETAIL).a(dVar.a()).b(c2 ? null : this.f3599h).d(dVar.b()).a(a(c2)).c(b(c2)).a(!c2).a());
            }
        }
        return arrayList;
    }

    private int b(boolean z) {
        return f.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f3645c);
    }

    private List<c> b(List<com.applovin.impl.mediation.debugger.a.b.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.a.b.a aVar : list) {
                boolean c2 = aVar.c();
                arrayList.add(c.a(c2 ? c.b.RIGHT_DETAIL : c.b.DETAIL).a(aVar.a()).b(c2 ? null : this.f3599h).d(aVar.b()).a(a(c2)).c(b(c2)).a(!c2).a());
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
        c.a b2 = c.p().a("SDK").b(this.a.j());
        if (TextUtils.isEmpty(this.a.j())) {
            b2.a(a(this.a.d())).c(b(this.a.d()));
        }
        return b2.a();
    }

    private String e(int i2) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i2 || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i2 || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i2) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i2 ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i2 ? "Initializing..." : "Waiting to Initialize...";
    }

    private c f() {
        c.a b2 = c.p().a("Adapter").b(this.a.k());
        if (TextUtils.isEmpty(this.a.k())) {
            b2.a(a(this.a.e())).c(b(this.a.e()));
        }
        return b2.a();
    }

    private c g() {
        c.a b2;
        boolean z = false;
        if (this.a.v().D().b()) {
            b2 = c.p().a("Initialize with Activity Context").d("Please ensure that you are initializing the AppLovin MAX SDK with an Activity Context.").a(a(false)).c(b(false));
            z = true;
        } else {
            b2 = c.p().a("Initialization Status").b(e(this.a.b()));
        }
        return b2.a(z).a();
    }

    private List<c> h() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.a.u())) {
            arrayList.add(c.a(c.b.DETAIL).a(this.a.u()).a());
        }
        if (this.a.c() != b.EnumC0077b.NOT_SUPPORTED) {
            if (this.a.n() != null) {
                arrayList.add(c(this.a.n()));
            }
            arrayList.add(a(this.a.c()));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int a(int i2) {
        return (i2 == a.INTEGRATIONS.ordinal() ? this.f3594b : i2 == a.PERMISSIONS.ordinal() ? this.f3595d : i2 == a.CONFIGURATION.ordinal() ? this.f3596e : i2 == a.DEPENDENCIES.ordinal() ? this.f3597f : this.f3598g).size();
    }

    public com.applovin.impl.mediation.debugger.a.b.b a() {
        return this.a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public c b(int i2) {
        return i2 == a.INTEGRATIONS.ordinal() ? new e("INTEGRATIONS") : i2 == a.PERMISSIONS.ordinal() ? new e("PERMISSIONS") : i2 == a.CONFIGURATION.ordinal() ? new e("CONFIGURATION") : i2 == a.DEPENDENCIES.ordinal() ? new e("DEPENDENCIES") : new e("TEST ADS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public List<c> c(int i2) {
        return i2 == a.INTEGRATIONS.ordinal() ? this.f3594b : i2 == a.PERMISSIONS.ordinal() ? this.f3595d : i2 == a.CONFIGURATION.ordinal() ? this.f3596e : i2 == a.DEPENDENCIES.ordinal() ? this.f3597f : this.f3598g;
    }

    public void c() {
        this.f3594b = d();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }
}
