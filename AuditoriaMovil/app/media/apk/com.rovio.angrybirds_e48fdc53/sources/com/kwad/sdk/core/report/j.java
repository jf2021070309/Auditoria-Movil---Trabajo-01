package com.kwad.sdk.core.report;

import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ac;
/* loaded from: classes.dex */
public final class j {
    private z.b arf = new z.b();

    private void Ca() {
        if (this.arf.atA == null) {
            this.arf.atA = new z.a();
        }
    }

    public final z.b BZ() {
        return this.arf;
    }

    public final j a(z.a aVar) {
        this.arf.atA = aVar;
        return this;
    }

    public final j a(AdTemplate adTemplate, String str, String str2, com.kwad.sdk.g.a<AdTrackLog> aVar) {
        Ca();
        this.arf.atA.c(adTemplate, str, str2);
        if (aVar != null && this.arf.atA.asY != null) {
            aVar.accept(this.arf.atA.asY);
        }
        return this;
    }

    public final j ae(long j) {
        this.arf.vC = j;
        return this;
    }

    public final j c(ac.a aVar) {
        this.arf.jK = aVar;
        return this;
    }

    public final j cg(int i) {
        this.arf.jI = i;
        return this;
    }

    public final j ch(int i) {
        this.arf.atb = i;
        return this;
    }

    public final j ci(int i) {
        this.arf.atc = i;
        return this;
    }

    public final j cj(int i) {
        this.arf.arG = i;
        return this;
    }

    public final j ck(int i) {
        this.arf.ath = i;
        return this;
    }

    public final j cl(int i) {
        this.arf.atC = i;
        return this;
    }

    public final j cm(int i) {
        this.arf.atH = i;
        return this;
    }

    public final j cn(int i) {
        this.arf.cu(i);
        return this;
    }

    public final j co(int i) {
        this.arf.atJ = i;
        return this;
    }

    public final j cp(int i) {
        this.arf.atK = i;
        return this;
    }

    public final j cq(int i) {
        this.arf.atL = i;
        return this;
    }

    public final j cr(int i) {
        this.arf.ati = i;
        return this;
    }

    public final j dt(String str) {
        this.arf.US = str;
        return this;
    }

    public final j du(String str) {
        this.arf.atF = str;
        return this;
    }

    public final j i(double d) {
        this.arf.jL = d;
        return this;
    }

    public final j t(int i, int i2) {
        this.arf.atd = i + "," + i2;
        return this;
    }
}
