package com.kwad.sdk.ranger;

import java.util.List;
/* loaded from: classes3.dex */
public class d extends com.kwad.sdk.core.response.a.a {
    public long aGN;
    public List<String> aGO;
    public List<a> aGP;
    public long aGQ = 1000;
    public double aGR = 1.0d;
    public List<com.kwad.sdk.ranger.a.a> aGS;

    /* loaded from: classes3.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public String aGT;
        public String aGU;
    }

    private boolean da(int i) {
        return (Hm() || (this.aGN & ((long) i)) == 0) ? false : true;
    }

    public final boolean Hm() {
        return (this.aGN & 1) == 0;
    }

    public final boolean Hn() {
        return da(2);
    }

    public final boolean Ho() {
        return da(4);
    }

    public final boolean Hp() {
        return da(16);
    }
}
