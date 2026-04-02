package com.bytedance.msdk.api;

import com.facebook.applinks.AppLinkData;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class BaiduRequestParameters {
    public static final int ADS_TYPE_DOWNLOAD = 2;
    public static final int ADS_TYPE_OPENPAGE = 1;
    public static final int DOWNLOAD_APP_CONFIRM_ALWAYS = 2;
    public static final int DOWNLOAD_APP_CONFIRM_CUSTOM_BY_APP = 4;
    public static final int DOWNLOAD_APP_CONFIRM_NEVER = 3;
    public static final int DOWNLOAD_APP_CONFIRM_ONLY_MOBILE = 1;
    public static final int MAX_ASSETS_RESERVED = 15;
    private final String a;
    private boolean b;
    private Map<String, String> c;
    private int d;
    private int e;
    private int f;

    /* loaded from: classes.dex */
    public static class Builder {
        private String a;
        private Map<String, String> b = new HashMap();
        private boolean c = false;
        private int d = 640;
        private int e = 480;
        private int f = 1;

        public final Builder addExtra(String str, String str2) {
            if ("page_title".equals(str)) {
                this.b.put("mpt", String.valueOf(1));
            }
            this.b.put(str, str2);
            return this;
        }

        public final BaiduRequestParameters build() {
            return new BaiduRequestParameters(this);
        }

        @Deprecated
        public final Builder confirmDownloading(boolean z) {
            downloadAppConfirmPolicy(z ? 2 : 3);
            return this;
        }

        public final Builder downloadAppConfirmPolicy(int i) {
            this.f = i;
            return this;
        }

        public final Builder setHeight(int i) {
            this.e = i;
            return this;
        }

        public final Builder setKeywords(String str) {
            this.a = str;
            return this;
        }

        public final Builder setWidth(int i) {
            this.d = i;
            return this;
        }
    }

    private BaiduRequestParameters(Builder builder) {
        this.d = 0;
        this.e = 0;
        this.a = builder.a;
        this.d = builder.d;
        this.e = builder.e;
        this.b = builder.c;
        this.f = builder.f;
        setExtras(builder.b);
    }

    public int getAPPConfirmPolicy() {
        return this.f;
    }

    public Map<String, String> getExtras() {
        return this.c;
    }

    public int getHeight() {
        return this.e;
    }

    public final String getKeywords() {
        return this.a;
    }

    public int getWidth() {
        return this.d;
    }

    public boolean isConfirmDownloading() {
        return this.b;
    }

    public void setExtras(Map<String, String> map) {
        this.c = map;
    }

    public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("mKeywords", this.a);
        hashMap.put("confirmDownloading", Boolean.valueOf(this.b));
        HashMap hashMap2 = new HashMap();
        Map<String, String> map = this.c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        hashMap.put(AppLinkData.ARGUMENTS_EXTRAS_KEY, hashMap2);
        return hashMap;
    }
}
