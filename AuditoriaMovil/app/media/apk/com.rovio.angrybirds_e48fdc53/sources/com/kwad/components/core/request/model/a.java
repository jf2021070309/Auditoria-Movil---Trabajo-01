package com.kwad.components.core.request.model;

import android.text.TextUtils;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.sdk.core.network.f;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    public final ImpInfo Lp;
    public final com.kwad.components.core.request.b PM;
    public List<String> PN;
    public boolean PO;
    public boolean PP;
    public c PQ;

    /* renamed from: com.kwad.components.core.request.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0211a {
        public ImpInfo Lp;
        public com.kwad.components.core.request.b PM;
        public boolean PO;
        public boolean PP;

        public final C0211a a(com.kwad.components.core.request.b bVar) {
            this.PM = bVar;
            return this;
        }

        public final C0211a aD(boolean z) {
            this.PO = true;
            return this;
        }

        public final C0211a aE(boolean z) {
            this.PP = z;
            return this;
        }

        public final C0211a e(ImpInfo impInfo) {
            this.Lp = impInfo;
            return this;
        }

        public final a pL() {
            if (com.kwad.components.ad.e.a.mp.booleanValue() && (this.Lp == null || this.PM == null)) {
                throw new IllegalStateException("AdRequestParams build Illegal");
            }
            return new a(this, (byte) 0);
        }
    }

    private a(C0211a c0211a) {
        this.Lp = c0211a.Lp;
        this.PM = c0211a.PM;
        this.PO = c0211a.PO;
        this.PP = c0211a.PP;
    }

    /* synthetic */ a(C0211a c0211a, byte b) {
        this(c0211a);
    }

    public static void a(a aVar, int i, String str, boolean z) {
        aVar.PM.a(i, str, z);
    }

    public static void a(a aVar, AdResultData adResultData, boolean z) {
        boolean isAdResultDataEmpty = adResultData.isAdResultDataEmpty();
        com.kwad.components.core.request.b bVar = aVar.PM;
        if (isAdResultDataEmpty) {
            bVar.a(f.aoZ.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? f.aoZ.msg : adResultData.testErrorMsg, z);
        } else {
            bVar.a(adResultData, z);
        }
    }

    public final int getAdNum() {
        if (this.Lp.adScene != null) {
            return this.Lp.adScene.getAdNum();
        }
        return 1;
    }

    public final int getAdStyle() {
        if (this.Lp.adScene != null) {
            return this.Lp.adScene.adStyle;
        }
        return 0;
    }

    public final long getPosId() {
        if (this.Lp.adScene != null) {
            return this.Lp.adScene.getPosId();
        }
        return -1L;
    }
}
