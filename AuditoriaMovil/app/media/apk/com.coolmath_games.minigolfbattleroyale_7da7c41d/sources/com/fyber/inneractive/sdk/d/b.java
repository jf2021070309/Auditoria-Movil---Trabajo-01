package com.fyber.inneractive.sdk.d;

import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.d.g;
import com.fyber.inneractive.sdk.e.a;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.j.e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class b<Response extends com.fyber.inneractive.sdk.j.e, Content extends g> implements com.fyber.inneractive.sdk.e.a {
    protected InneractiveAdRequest a;
    protected Response b;
    protected Content c;
    protected u d;
    protected com.fyber.inneractive.sdk.config.a.s e;
    protected boolean f = false;
    private a.InterfaceC0043a g;

    public abstract void a();

    public abstract String b();

    @Override // com.fyber.inneractive.sdk.e.a
    public void e() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.g = null;
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.e.a
    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar, com.fyber.inneractive.sdk.config.a.s sVar, a.InterfaceC0043a interfaceC0043a) {
        this.a = inneractiveAdRequest;
        this.b = eVar;
        this.g = interfaceC0043a;
        this.e = sVar;
        if (inneractiveAdRequest == null) {
            this.d = com.fyber.inneractive.sdk.config.a.a(eVar.p);
        }
        a();
    }

    @Override // com.fyber.inneractive.sdk.e.a
    public final void a(com.fyber.inneractive.sdk.j.e eVar, com.fyber.inneractive.sdk.config.a.s sVar, boolean z, a.InterfaceC0043a interfaceC0043a) {
        this.f = z;
        a((InneractiveAdRequest) null, eVar, sVar, interfaceC0043a);
    }

    @Override // com.fyber.inneractive.sdk.e.a
    public final Content f() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final u g() {
        InneractiveAdRequest inneractiveAdRequest = this.a;
        return inneractiveAdRequest == null ? this.d : inneractiveAdRequest.getSelectedUnitConfig();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(InneractiveError inneractiveError) {
        new a(this.b, this.a, b(), this.e.b()).a(inneractiveError);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        if (this.a != null) {
            com.fyber.inneractive.sdk.f.c.a().a(this.a.d).e();
        }
        a.InterfaceC0043a interfaceC0043a = this.g;
        if (interfaceC0043a != null) {
            interfaceC0043a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        Content content;
        if (this.g != null) {
            InneractiveAdRequest inneractiveAdRequest = this.a;
            Response response = this.b;
            if (inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS && ((content = this.c) == null || content.a_() || this.c.isVideoAd())) {
                IAlog.b("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                String arrays = inneractiveInfrastructureError.getCause() != null ? Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace()) : com.fyber.inneractive.sdk.util.q.a();
                com.fyber.inneractive.sdk.config.a.s sVar = this.e;
                n.a aVar = new n.a(com.fyber.inneractive.sdk.h.l.IA_AD_LOAD_FAILED, inneractiveAdRequest, response, sVar == null ? null : sVar.b());
                aVar.a(new n.b().a("message", inneractiveInfrastructureError.getErrorCode().toString()).a("description", arrays).a("extra_description", inneractiveInfrastructureError.description()));
                aVar.b(null);
            }
            this.g.a(inneractiveInfrastructureError);
        }
    }
}
