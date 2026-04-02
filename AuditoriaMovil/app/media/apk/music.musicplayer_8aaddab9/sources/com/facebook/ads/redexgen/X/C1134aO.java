package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import java.util.HashMap;
/* renamed from: com.facebook.ads.redexgen.X.aO  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1134aO extends C03866m {
    public final Context A00;
    public final ApplicationInfo A01;
    public final C6C A02;
    public final C7F A03;

    public C1134aO(Context context, C6C c6c) {
        super(context, c6c);
        this.A01 = context.getApplicationInfo();
        this.A00 = context;
        this.A02 = c6c;
        this.A03 = C7F.A00(this.A00, this.A02.A0a(), this.A02.A0g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A05(HashMap<Integer, C1135aP> hashMap) {
        return new C1055Xx(SystemClock.elapsedRealtime(), A02(), hashMap, AnonymousClass79.A06);
    }

    public final InterfaceC03956v A0G() {
        return new C1145aZ(this);
    }

    public final InterfaceC03956v A0H() {
        return new C1147ab(this);
    }

    public final InterfaceC03956v A0I() {
        return new C1148ac(this);
    }

    public final InterfaceC03956v A0J() {
        return new C1152ag(this);
    }

    public final InterfaceC03956v A0K() {
        return new C1140aU(this);
    }

    public final InterfaceC03956v A0L() {
        return new C1137aR(this);
    }

    public final InterfaceC03956v A0M() {
        return new C1144aY(this);
    }

    public final InterfaceC03956v A0N() {
        return new C1143aX(this);
    }

    public final InterfaceC03956v A0O() {
        return new C1139aT(this);
    }

    public final InterfaceC03956v A0P() {
        return new C1136aQ(this);
    }

    public final InterfaceC03956v A0Q() {
        return new C1138aS(this);
    }

    public final InterfaceC03956v A0R() {
        return new C1141aV(this);
    }

    public final InterfaceC03956v A0S() {
        return new C1142aW(this);
    }

    public final InterfaceC03956v A0T() {
        return new C1154ai(this);
    }

    public final InterfaceC03956v A0U() {
        return new C1153ah(this);
    }

    public final InterfaceC03956v A0V() {
        return new C1151af(this);
    }

    public final InterfaceC03956v A0W() {
        return new C1150ae(this);
    }

    public final InterfaceC03956v A0X() {
        return new C1149ad(this);
    }

    public final InterfaceC03956v A0Y() {
        return new C1146aa(this);
    }
}
