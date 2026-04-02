package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.cx.c;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.application.a;
import kotlin.Metadata;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$5$etpContentService$3 extends l implements a<Boolean> {
    public static final EtpNetworkModuleImpl$5$etpContentService$3 INSTANCE = new EtpNetworkModuleImpl$5$etpContentService$3();

    public EtpNetworkModuleImpl$5$etpContentService$3() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        int i = com.ellation.crunchyroll.application.a.a;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(c.class, "bento");
            if (c != null) {
                return Boolean.valueOf(((c) c).isEnabled());
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.BentoConfigImpl");
        }
        j.m("instance");
        throw null;
    }
}
