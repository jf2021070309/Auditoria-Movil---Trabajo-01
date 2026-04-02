package com.amazon.aps.iva.kl;
/* compiled from: UpNextBannerViewModel.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.kj.e, com.amazon.aps.iva.kj.e, Boolean> {
    public static final l h = new l();

    public l() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Boolean invoke(com.amazon.aps.iva.kj.e eVar, com.amazon.aps.iva.kj.e eVar2) {
        String str;
        com.amazon.aps.iva.kj.e eVar3 = eVar;
        com.amazon.aps.iva.kj.e eVar4 = eVar2;
        String str2 = null;
        if (eVar3 != null) {
            str = eVar3.a;
        } else {
            str = null;
        }
        if (eVar4 != null) {
            str2 = eVar4.a;
        }
        return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(str, str2));
    }
}
