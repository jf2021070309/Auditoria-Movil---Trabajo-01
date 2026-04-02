package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.d.s;
/* loaded from: classes.dex */
public class InneractiveAdRequest extends s {
    private String f;
    private String h;
    private u i;
    private boolean j = false;
    private InneractiveUserConfig g = new InneractiveUserConfig();

    public InneractiveAdRequest(String str) {
        this.f = str;
    }

    public String getSpotId() {
        return this.f;
    }

    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        this.g = inneractiveUserConfig;
    }

    public void setKeywords(String str) {
        this.h = str;
    }

    public void setMuteVideo(boolean z) {
        this.j = z;
    }

    public InneractiveUserConfig getUserParams() {
        return this.g;
    }

    public String getKeywords() {
        return this.h;
    }

    public void setSelectedUnitConfig(u uVar) {
        this.i = uVar;
    }

    public u getSelectedUnitConfig() {
        return this.i;
    }

    public boolean getMuteVideo() {
        return this.j;
    }
}
