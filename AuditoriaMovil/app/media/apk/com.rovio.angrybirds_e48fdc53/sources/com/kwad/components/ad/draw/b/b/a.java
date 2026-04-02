package com.kwad.components.ad.draw.b.b;

import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class a {
    private InterfaceC0140a cv;
    private b cw;
    private boolean cx = false;
    private AdTemplate mAdTemplate;

    /* renamed from: com.kwad.components.ad.draw.b.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0140a {
        void ao();
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean ap();
    }

    public a(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
    }

    public final void a(InterfaceC0140a interfaceC0140a) {
        this.cv = interfaceC0140a;
    }

    public final void a(b bVar) {
        this.cw = bVar;
    }

    public final void an() {
        InterfaceC0140a interfaceC0140a;
        if (this.cx) {
            return;
        }
        this.cx = true;
        if (d.ck(this.mAdTemplate).status == 1 || d.ck(this.mAdTemplate).status == 2 || d.ck(this.mAdTemplate).status == 3) {
            return;
        }
        b bVar = this.cw;
        if ((bVar == null || !bVar.ap()) && (interfaceC0140a = this.cv) != null) {
            interfaceC0140a.ao();
        }
    }
}
