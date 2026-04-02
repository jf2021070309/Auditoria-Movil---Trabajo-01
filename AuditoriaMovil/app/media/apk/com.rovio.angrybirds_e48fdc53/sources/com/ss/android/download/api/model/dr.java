package com.ss.android.download.api.model;
/* loaded from: classes3.dex */
public class dr {
    public String dr;
    public String g;
    public String ge;
    public String o;
    public String q;

    public dr(C0289dr c0289dr) {
        this.ge = "";
        this.dr = c0289dr.dr;
        this.ge = c0289dr.ge;
        this.o = c0289dr.o;
        this.g = c0289dr.g;
        this.q = c0289dr.q;
    }

    /* renamed from: com.ss.android.download.api.model.dr$dr  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0289dr {
        private String dr;
        private String g;
        private String ge;
        private String o;
        private String q;

        public C0289dr dr(String str) {
            this.dr = str;
            return this;
        }

        public C0289dr ge(String str) {
            this.ge = str;
            return this;
        }

        public C0289dr o(String str) {
            this.g = str;
            return this;
        }

        public C0289dr g(String str) {
            this.q = str;
            return this;
        }

        public dr dr() {
            return new dr(this);
        }
    }
}
