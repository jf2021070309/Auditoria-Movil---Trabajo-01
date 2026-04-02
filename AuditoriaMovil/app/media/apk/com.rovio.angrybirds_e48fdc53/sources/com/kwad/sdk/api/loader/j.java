package com.kwad.sdk.api.loader;

import com.kwad.sdk.api.loader.a;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j {
    public static int aiI = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private int aiJ;
        private int aiK;
        private String aiL;
        private String aiM;
        private long aiN;
        private int aiO;
        private String aiP;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a T(long j) {
            this.aiN = j;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a bQ(int i) {
            this.aiJ = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a bR(int i) {
            this.aiK = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a bS(int i) {
            this.aiO = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a bV(String str) {
            this.aiL = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a bW(String str) {
            this.aiM = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a bX(String str) {
            this.aiP = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("load_status", Integer.valueOf(this.aiJ));
                jSONObject.putOpt("update_count", Integer.valueOf(this.aiK));
                jSONObject.putOpt("dynamic_version", this.aiL);
                jSONObject.putOpt("download_url", this.aiM);
                jSONObject.putOpt("duration_ms", Long.valueOf(this.aiN));
                jSONObject.putOpt("error_code", Integer.valueOf(this.aiO));
                jSONObject.putOpt("error_msg", this.aiP);
            } catch (Exception e) {
            }
            return jSONObject;
        }

        public final String toString() {
            return "MonitorInfo{load_status=" + this.aiJ + ", update_count=" + this.aiK + ", dynamic_version='" + this.aiL + "', download_url='" + this.aiM + "', duration_ms=" + this.aiN + ", error_code=" + this.aiO + ", error_msg='" + this.aiP + "'}";
        }
    }

    private static void a(int i, a.C0242a c0242a, long j, int i2, String str) {
        if (c0242a == null) {
            return;
        }
        try {
            JSONObject json = new a((byte) 0).bQ(i).bR(aiI).bV(c0242a.sdkVersion).bW(c0242a.ain).T(j).bS(i2).bX(str).toJson();
            StringBuilder sb = new StringBuilder("status:");
            sb.append(i);
            sb.append("--jo:");
            sb.append(json);
            com.kwad.sdk.api.c.c("reportDynamicUpdate", json);
        } catch (Throwable th) {
        }
    }

    public static void a(a.C0242a c0242a) {
        aiI++;
        a(1, c0242a, 0L, 0, "");
    }

    public static void a(a.C0242a c0242a, int i, String str) {
        a(4, c0242a, 0L, i, str);
    }

    public static void a(a.C0242a c0242a, long j) {
        a(2, c0242a, j, 0, "");
    }

    public static void a(a.C0242a c0242a, long j, String str) {
        a(3, c0242a, j, 0, str);
    }

    public static void b(a.C0242a c0242a) {
        a(5, c0242a, 0L, 0, "");
    }

    public static void b(a.C0242a c0242a, int i, String str) {
        a(7, c0242a, 0L, i, str);
    }

    public static void b(a.C0242a c0242a, long j) {
        a(6, c0242a, j, 0, "");
    }
}
