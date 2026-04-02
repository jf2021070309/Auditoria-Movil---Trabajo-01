package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.eC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1362eC<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    @Nullable
    public List<InterfaceC1358e8<ModelType, StateType>> A01 = null;
    public C1363eD A00 = C1363eD.A06;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eC != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1362eC(ModelType modeltype, StateType statetype, String str) {
        this.A02 = modeltype;
        this.A03 = statetype;
        this.A04 = str;
    }

    public static /* synthetic */ C1363eD A00(C1362eC c1362eC) {
        return c1362eC.A00;
    }

    public static /* synthetic */ Object A01(C1362eC c1362eC) {
        return c1362eC.A02;
    }

    public static /* synthetic */ Object A02(C1362eC c1362eC) {
        return c1362eC.A03;
    }

    public static /* synthetic */ String A03(C1362eC c1362eC) {
        return c1362eC.A04;
    }

    public static /* synthetic */ List A04(C1362eC c1362eC) {
        return c1362eC.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e8 != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eC != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C1362eC<ModelType, StateType> A05(InterfaceC1358e8<ModelType, StateType> interfaceC1358e8) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC1358e8);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eC != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C1363eD<ModelType, StateType> A06() {
        return new C1363eD<>(this);
    }
}
