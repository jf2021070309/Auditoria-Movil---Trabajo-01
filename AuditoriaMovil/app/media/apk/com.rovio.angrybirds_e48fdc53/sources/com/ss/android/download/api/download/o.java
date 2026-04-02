package com.ss.android.download.api.download;

import org.json.JSONObject;
@Deprecated
/* loaded from: classes3.dex */
public class o implements DownloadEventConfig {
    private String bn;
    private boolean cu;
    private String dr;
    private String g;
    private boolean ge;
    private boolean il;
    private String ll;
    private String lp;
    private String o;
    private String q;
    private String rb;
    private String t;
    private boolean v;
    private String wb;
    private String x;
    private String xu;
    private Object yk;

    public o() {
    }

    private o(dr drVar) {
        this.dr = drVar.dr;
        this.ge = drVar.ge;
        this.o = drVar.o;
        this.g = drVar.g;
        this.q = drVar.q;
        this.bn = drVar.bn;
        this.rb = drVar.rb;
        this.xu = drVar.xu;
        this.ll = drVar.ll;
        this.wb = drVar.wb;
        this.t = drVar.t;
        this.yk = drVar.yk;
        this.cu = drVar.cu;
        this.v = drVar.v;
        this.il = drVar.il;
        this.x = drVar.x;
        this.lp = drVar.lp;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getRefer() {
        return this.lp;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickButtonTag() {
        return this.dr;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickItemTag() {
        return null;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickLabel() {
        return this.o;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickStartLabel() {
        return this.g;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickPauseLabel() {
        return this.q;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickContinueLabel() {
        return this.bn;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickInstallLabel() {
        return this.rb;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getStorageDenyLabel() {
        return this.wb;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public Object getExtraEventObject() {
        return this.yk;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public int getDownloadScene() {
        return 0;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public boolean isEnableClickEvent() {
        return this.ge;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public boolean isEnableV3Event() {
        return this.cu;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public JSONObject getExtraJson() {
        return null;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public JSONObject getParamsJson() {
        return null;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public void setDownloadScene(int i) {
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public void setRefer(String str) {
    }

    /* loaded from: classes3.dex */
    public static final class dr {
        private String bn;
        private boolean cu;
        private String dr;
        private String g;
        private boolean ge;
        private boolean il;
        private String ll;
        private String lp;
        private String o;
        private String q;
        private String rb;
        private String t;
        private boolean v;
        private String wb;
        private String x;
        private String xu;
        private Object yk;

        public o dr() {
            return new o(this);
        }
    }
}
