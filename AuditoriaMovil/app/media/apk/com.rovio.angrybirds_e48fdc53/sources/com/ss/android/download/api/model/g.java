package com.ss.android.download.api.model;
/* loaded from: classes3.dex */
public class g {
    private String dr;
    private String ge;

    public g(dr drVar) {
        this.dr = drVar.dr;
        this.ge = drVar.ge;
    }

    public String dr() {
        return this.dr;
    }

    /* loaded from: classes3.dex */
    public static class dr {
        private String dr;
        private String ge;

        public dr dr(String str) {
            this.dr = str;
            return this;
        }

        public g dr() {
            return new g(this);
        }
    }
}
