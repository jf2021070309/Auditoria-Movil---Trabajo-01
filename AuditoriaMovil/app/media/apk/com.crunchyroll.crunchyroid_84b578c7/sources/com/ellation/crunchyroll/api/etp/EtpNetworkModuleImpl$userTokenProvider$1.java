package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$userTokenProvider$1 extends l implements a<Long> {
    public static final EtpNetworkModuleImpl$userTokenProvider$1 INSTANCE = new EtpNetworkModuleImpl$userTokenProvider$1();

    public EtpNetworkModuleImpl$userTokenProvider$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
