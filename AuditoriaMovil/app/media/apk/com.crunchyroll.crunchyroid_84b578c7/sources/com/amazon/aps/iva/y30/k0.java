package com.amazon.aps.iva.y30;
/* compiled from: SettingsModule.kt */
/* loaded from: classes2.dex */
public final class k0 implements e0 {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] d = {com.amazon.aps.iva.k.q.a(k0.class, "selectedHeaderViewModel", "getSelectedHeaderViewModel()Lcom/ellation/crunchyroll/presentation/settings/viewmodels/SelectedHeaderViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(k0.class, "maturityRestrictionsViewModel", "getMaturityRestrictionsViewModel()Lcom/ellation/crunchyroll/presentation/settings/maturityrestrictions/MaturityRestrictionsViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(k0.class, "settingsViewModel", "getSettingsViewModel()Lcom/ellation/crunchyroll/presentation/settings/SettingsViewModelImpl;", 0)};
    public final com.amazon.aps.iva.ez.a a;
    public final com.amazon.aps.iva.ez.a b;
    public final com.amazon.aps.iva.ez.a c;

    public k0(com.amazon.aps.iva.v10.a aVar) {
        this.a = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.k40.d.class, new j0(aVar), null);
        this.b = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.d40.g.class, new h0(aVar), f0.h);
        this.c = new com.amazon.aps.iva.ez.a(n0.class, new i0(aVar), g0.h);
    }

    @Override // com.amazon.aps.iva.y30.e0
    public final com.amazon.aps.iva.k40.d a() {
        return (com.amazon.aps.iva.k40.d) this.a.getValue(this, d[0]);
    }

    @Override // com.amazon.aps.iva.y30.e0
    public final com.amazon.aps.iva.d40.g b() {
        return (com.amazon.aps.iva.d40.g) this.b.getValue(this, d[1]);
    }

    @Override // com.amazon.aps.iva.y30.e0
    public final n0 c() {
        return (n0) this.c.getValue(this, d[2]);
    }
}
