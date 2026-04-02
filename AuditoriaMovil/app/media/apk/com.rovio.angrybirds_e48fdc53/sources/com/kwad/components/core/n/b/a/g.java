package com.kwad.components.core.n.b.a;

import com.kwad.components.offline.api.core.IOfflineHostApi;
import com.kwad.components.offline.api.core.adlive.ILive;
import com.kwad.components.offline.api.core.api.IAsync;
import com.kwad.components.offline.api.core.api.ICache;
import com.kwad.components.offline.api.core.api.ICrash;
import com.kwad.components.offline.api.core.api.IDownloader;
import com.kwad.components.offline.api.core.api.IEncrypt;
import com.kwad.components.offline.api.core.api.IEnvironment;
import com.kwad.components.offline.api.core.api.IImageLoader;
import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.components.offline.api.core.api.INet;
import com.kwad.components.offline.api.core.api.IOfflineCompoLogcat;
import com.kwad.components.offline.api.core.api.IVibratorUtil;
import com.kwad.components.offline.api.core.api.IZipper;
import com.kwad.components.offline.api.core.imageplayer.IImagePlayer;
import com.kwad.components.offline.api.core.network.IIdc;
import com.kwad.components.offline.api.core.video.IVideo;
import com.kwad.components.offline.api.core.webview.IWebView;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import java.io.File;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g implements IOfflineHostApi {
    private IAsync LG;
    private IEnvironment LH;
    private IZipper LI;
    private INet LJ;
    private IEncrypt LK;
    private IOfflineCompoLogcat LL;
    private ICrash LM;
    private ILoggerReporter LN;
    private IDownloader LO;
    private IImageLoader LP;
    private IVideo LQ;
    private ILive LR;
    private ICache LS;
    private IWebView LT;
    private IVibratorUtil LU;
    private IIdc LV;
    private IImagePlayer LW;

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IAsync async() {
        if (this.LG == null) {
            this.LG = new a();
        }
        return this.LG;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final ICache cache() {
        if (this.LS == null) {
            this.LS = new b();
        }
        return this.LS;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final ICrash crash() {
        if (this.LM == null) {
            this.LM = new ICrash() { // from class: com.kwad.components.core.n.b.a.g.1
                @Override // com.kwad.components.offline.api.core.api.ICrash
                public final void gatherException(Throwable th) {
                    com.kwad.sdk.service.c.gatherException(th);
                }
            };
        }
        return this.LM;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IDownloader downloader() {
        if (this.LO == null) {
            this.LO = new IDownloader() { // from class: com.kwad.components.core.n.b.a.g.3
                @Override // com.kwad.components.offline.api.core.api.IDownloader
                public final boolean downloadSync(File file, String str) {
                    return com.kwad.sdk.core.download.a.d(str, file);
                }
            };
        }
        return this.LO;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IEncrypt encrypt() {
        if (this.LK == null) {
            this.LK = new c();
        }
        return this.LK;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IEnvironment env() {
        if (this.LH == null) {
            this.LH = new d();
        }
        return this.LH;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IIdc idc() {
        if (this.LV == null) {
            this.LV = new j();
        }
        return this.LV;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IImageLoader imageLoader() {
        if (this.LP == null) {
            this.LP = new e();
        }
        return this.LP;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IImagePlayer imagePlayer() {
        com.kwad.components.core.g.d dVar = new com.kwad.components.core.g.d();
        this.LW = dVar;
        return dVar;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final ILive live() {
        if (this.LR == null) {
            this.LR = new com.kwad.components.core.n.b.b.a();
        }
        return this.LR;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IOfflineCompoLogcat log() {
        if (this.LL == null) {
            this.LL = new h();
        }
        return this.LL;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final ILoggerReporter loggerReporter() {
        if (this.LN == null) {
            this.LN = new ILoggerReporter() { // from class: com.kwad.components.core.n.b.a.g.2
                @Override // com.kwad.components.offline.api.core.api.ILoggerReporter
                public final void reportEvent(String str, BusinessType businessType, String str2, JSONObject jSONObject) {
                    KSLoggerReporter.a(str, businessType, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.d.aNO, str2, jSONObject);
                }
            };
        }
        return this.LN;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final INet net() {
        if (this.LJ == null) {
            this.LJ = new f();
        }
        return this.LJ;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IVibratorUtil vibratorUtil() {
        if (this.LU == null) {
            this.LU = new k();
        }
        return this.LU;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IVideo video() {
        if (this.LQ == null) {
            this.LQ = new com.kwad.components.core.n.b.c.e();
        }
        return this.LQ;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IWebView webview() {
        if (this.LT == null) {
            this.LT = new com.kwad.components.core.n.b.d.b();
        }
        return this.LT;
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final IZipper zipper() {
        if (this.LI == null) {
            this.LI = new l();
        }
        return this.LI;
    }
}
