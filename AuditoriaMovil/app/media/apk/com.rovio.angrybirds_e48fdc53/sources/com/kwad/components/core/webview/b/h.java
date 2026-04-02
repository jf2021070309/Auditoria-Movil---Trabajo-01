package com.kwad.components.core.webview.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.api.AdError;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.a.s;
import com.kwad.components.core.webview.b.a.t;
import com.kwad.components.core.webview.b.a.u;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.n;
import com.kwad.components.core.webview.b.b.y;
import com.kwad.components.core.webview.b.c.d;
import com.kwad.components.core.webview.jshandler.aa;
import com.kwad.components.core.webview.jshandler.ad;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.as;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.t;
import com.kwad.components.core.webview.jshandler.u;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.components.offline.api.tk.ITkOfflineCompo;
import com.kwad.components.offline.api.tk.TKDownloadListener;
import com.kwad.components.offline.api.tk.TkLoggerReporter;
import com.kwad.components.offline.api.tk.model.StyleTemplate;
import com.kwad.components.offline.api.tk.model.report.TKPerformMsg;
import com.kwad.sdk.api.proxy.app.FeedDownloadActivity;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.components.k;
import com.kwad.sdk.components.l;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.export.proxy.AdHttpBodyBuilder;
import com.kwad.sdk.export.proxy.AdHttpFormDataBuilder;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.au;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.q;
import com.kwad.sdk.utils.v;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class h implements com.kwad.sdk.components.i, com.kwad.sdk.core.webview.d.a.a {
    private static Map<Integer, WeakReference<com.kwad.components.core.webview.b.c.d>> Wi = new HashMap();
    private long Dh;
    private StyleTemplate QP;
    private com.kwad.sdk.core.download.e Tk;
    private com.kwad.components.core.webview.b.c.d VS;
    protected i VT;
    private com.kwad.sdk.core.webview.c.g VU;
    private com.kwad.components.core.n.a.c.c VV;
    private Future<?> VW;
    private l VX;
    private p VY;
    private boolean VZ;
    private boolean Wa;
    private boolean Wb;
    private boolean Wc;
    private boolean Wd;
    private int We;
    private long Wf;
    private long Wg;
    private Map<String, Object> Wh;
    private int Wj;
    private int Wk;
    protected com.kwad.sdk.core.webview.e Wl;
    private a Wm;
    private com.kwad.sdk.components.j Wn;
    private final Runnable Wo;
    private final Runnable Wp;
    private Activity mActivity;
    private AdTemplate mAdTemplate;
    protected final Context mContext;
    private long mInitTime;
    private final com.kwad.components.core.video.l mVideoPlayStateListener;
    private final y wt;
    protected long xM;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void onFailed();

        void onSuccess();
    }

    public h(long j, Context context) {
        this.VZ = false;
        this.Wa = false;
        this.Wb = false;
        this.Wc = false;
        this.Wd = false;
        this.We = 0;
        this.xM = -1L;
        this.Wj = 1000;
        this.Wk = 0;
        this.Wl = new com.kwad.sdk.core.webview.e();
        this.Wm = new a() { // from class: com.kwad.components.core.webview.b.h.17
            @Override // com.kwad.components.core.webview.b.h.a
            public final void onFailed() {
                h.this.rP();
                com.kwad.sdk.core.e.c.d("TKLoadController", AdError.ERROR_MEDIA_RENDER_MSG);
            }

            @Override // com.kwad.components.core.webview.b.h.a
            public final void onSuccess() {
                com.kwad.sdk.core.e.c.d("TKLoadController", "渲染成功");
            }
        };
        this.Wn = new com.kwad.sdk.components.j() { // from class: com.kwad.components.core.webview.b.h.19
            @Override // com.kwad.sdk.components.j
            public final void a(com.kwad.sdk.components.g gVar) {
                Activity activity = h.this.mActivity;
                if (activity == null) {
                    com.kwad.sdk.core.c.b.AT();
                    activity = com.kwad.sdk.core.c.b.getCurrentActivity();
                }
                if (activity == null || activity.isFinishing()) {
                    gVar.callbackPageStatus(false, "no host activity");
                    return;
                }
                StyleTemplate styleTemplate = new StyleTemplate();
                try {
                    styleTemplate.parseJson(styleTemplate, new JSONObject(gVar.getStyleTemplate()));
                    d.b bVar = new d.b();
                    bVar.setAdTemplate(h.this.rO());
                    bVar.a(styleTemplate);
                    bVar.aP(styleTemplate.templateId);
                    bVar.c(gVar);
                    com.kwad.components.core.webview.b.c.d b = com.kwad.components.core.webview.b.c.d.b(bVar);
                    b.show(activity.getFragmentManager(), "");
                    h.Wi.put(Integer.valueOf(gVar.getDialogId()), new WeakReference(b));
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTrace(th);
                    gVar.callbackPageStatus(false, "template parse failed");
                }
            }

            @Override // com.kwad.sdk.components.j
            public final void a(com.kwad.sdk.components.h hVar) {
                String message;
                if (hVar.getTemplateString() == null && hVar.getUrl() == null && hVar.getClassName() == null) {
                    message = "intent invalid";
                } else {
                    Activity activity = h.this.mActivity;
                    if (activity == null) {
                        com.kwad.sdk.core.c.b.AT();
                        activity = com.kwad.sdk.core.c.b.getCurrentActivity();
                    }
                    if (activity == null) {
                        hVar.callbackPageStatus(false, "no host activity");
                    }
                    Intent intent = hVar.getIntent();
                    try {
                        if (hVar.getTemplateString() != null) {
                            com.kwad.sdk.service.b.a(FeedDownloadActivity.class, com.kwad.components.core.s.a.a.class);
                            int qe = com.kwad.components.core.s.a.a.qe();
                            com.kwad.components.core.s.a.a.a(qe, "native_intent", hVar);
                            AdTemplate rO = h.this.rO();
                            if (rO != null) {
                                intent.putExtra("tk_ad_template", rO.toJson().toString());
                            }
                            intent.putExtra("tk_style_template", hVar.getTemplateString());
                            intent.putExtra("tk_id", qe);
                        } else if (hVar.getClassName() == null) {
                            intent.setData(Uri.parse(hVar.getUrl()));
                            activity.startActivity(intent);
                            hVar.callbackPageStatus(true, null);
                            return;
                        } else {
                            try {
                                com.kwad.sdk.service.b.a(FeedDownloadActivity.class, Class.forName(hVar.getClassName()));
                            } catch (ClassNotFoundException e) {
                                message = e.getMessage();
                            }
                        }
                        activity.startActivity(intent);
                        hVar.callbackPageStatus(true, null);
                        return;
                    } catch (Throwable th) {
                        message = th.getMessage();
                    }
                    intent.setClass(h.this.mContext, FeedDownloadActivity.class);
                }
                hVar.callbackPageStatus(false, message);
            }

            @Override // com.kwad.sdk.components.j
            public final void b(com.kwad.sdk.components.g gVar) {
                WeakReference weakReference = (WeakReference) h.Wi.get(Integer.valueOf(gVar.getDialogId()));
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((com.kwad.components.core.webview.b.c.d) weakReference.get()).dismiss();
            }
        };
        this.Wo = new Runnable() { // from class: com.kwad.components.core.webview.b.h.20
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.sdk.core.e.c.d("TKLoadController", "已经超时" + h.this.VT.getTkTemplateId());
                h.this.rT();
                h.a(h.this, true);
                h.this.rP();
            }
        };
        this.Wp = new Runnable() { // from class: com.kwad.components.core.webview.b.h.21
            @Override // java.lang.Runnable
            public final void run() {
                h.b(h.this, true);
                h.this.rP();
            }
        };
        this.mVideoPlayStateListener = new com.kwad.components.core.video.l() { // from class: com.kwad.components.core.webview.b.h.14
            private void g(double d) {
                h.this.wt.Xq = false;
                h.this.wt.Xm = false;
                h.this.wt.nQ = (int) ((d / 1000.0d) + 0.5d);
                jc();
            }

            private void jc() {
                if (h.this.VY == null || h.this.wt == null) {
                    return;
                }
                h.this.VY.a(h.this.wt);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayCompleted() {
                h.this.wt.Xm = true;
                h.this.wt.Xq = false;
                h.this.wt.nQ = com.kwad.sdk.core.response.b.a.G(com.kwad.sdk.core.response.b.d.ck(h.this.rO()));
                jc();
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayError(int i, int i2) {
                h.this.wt.Xq = true;
                h.this.wt.Xm = false;
                jc();
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayProgress(long j2, long j3) {
                g(j3);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayStart() {
                g(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPreparing() {
                g(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
            }
        };
        this.mContext = context;
        this.xM = j;
        this.wt = new y();
    }

    public h(Context context) {
        this.VZ = false;
        this.Wa = false;
        this.Wb = false;
        this.Wc = false;
        this.Wd = false;
        this.We = 0;
        this.xM = -1L;
        this.Wj = 1000;
        this.Wk = 0;
        this.Wl = new com.kwad.sdk.core.webview.e();
        this.Wm = new a() { // from class: com.kwad.components.core.webview.b.h.17
            @Override // com.kwad.components.core.webview.b.h.a
            public final void onFailed() {
                h.this.rP();
                com.kwad.sdk.core.e.c.d("TKLoadController", AdError.ERROR_MEDIA_RENDER_MSG);
            }

            @Override // com.kwad.components.core.webview.b.h.a
            public final void onSuccess() {
                com.kwad.sdk.core.e.c.d("TKLoadController", "渲染成功");
            }
        };
        this.Wn = new com.kwad.sdk.components.j() { // from class: com.kwad.components.core.webview.b.h.19
            @Override // com.kwad.sdk.components.j
            public final void a(com.kwad.sdk.components.g gVar) {
                Activity activity = h.this.mActivity;
                if (activity == null) {
                    com.kwad.sdk.core.c.b.AT();
                    activity = com.kwad.sdk.core.c.b.getCurrentActivity();
                }
                if (activity == null || activity.isFinishing()) {
                    gVar.callbackPageStatus(false, "no host activity");
                    return;
                }
                StyleTemplate styleTemplate = new StyleTemplate();
                try {
                    styleTemplate.parseJson(styleTemplate, new JSONObject(gVar.getStyleTemplate()));
                    d.b bVar = new d.b();
                    bVar.setAdTemplate(h.this.rO());
                    bVar.a(styleTemplate);
                    bVar.aP(styleTemplate.templateId);
                    bVar.c(gVar);
                    com.kwad.components.core.webview.b.c.d b = com.kwad.components.core.webview.b.c.d.b(bVar);
                    b.show(activity.getFragmentManager(), "");
                    h.Wi.put(Integer.valueOf(gVar.getDialogId()), new WeakReference(b));
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTrace(th);
                    gVar.callbackPageStatus(false, "template parse failed");
                }
            }

            @Override // com.kwad.sdk.components.j
            public final void a(com.kwad.sdk.components.h hVar) {
                String message;
                if (hVar.getTemplateString() == null && hVar.getUrl() == null && hVar.getClassName() == null) {
                    message = "intent invalid";
                } else {
                    Activity activity = h.this.mActivity;
                    if (activity == null) {
                        com.kwad.sdk.core.c.b.AT();
                        activity = com.kwad.sdk.core.c.b.getCurrentActivity();
                    }
                    if (activity == null) {
                        hVar.callbackPageStatus(false, "no host activity");
                    }
                    Intent intent = hVar.getIntent();
                    try {
                        if (hVar.getTemplateString() != null) {
                            com.kwad.sdk.service.b.a(FeedDownloadActivity.class, com.kwad.components.core.s.a.a.class);
                            int qe = com.kwad.components.core.s.a.a.qe();
                            com.kwad.components.core.s.a.a.a(qe, "native_intent", hVar);
                            AdTemplate rO = h.this.rO();
                            if (rO != null) {
                                intent.putExtra("tk_ad_template", rO.toJson().toString());
                            }
                            intent.putExtra("tk_style_template", hVar.getTemplateString());
                            intent.putExtra("tk_id", qe);
                        } else if (hVar.getClassName() == null) {
                            intent.setData(Uri.parse(hVar.getUrl()));
                            activity.startActivity(intent);
                            hVar.callbackPageStatus(true, null);
                            return;
                        } else {
                            try {
                                com.kwad.sdk.service.b.a(FeedDownloadActivity.class, Class.forName(hVar.getClassName()));
                            } catch (ClassNotFoundException e) {
                                message = e.getMessage();
                            }
                        }
                        activity.startActivity(intent);
                        hVar.callbackPageStatus(true, null);
                        return;
                    } catch (Throwable th) {
                        message = th.getMessage();
                    }
                    intent.setClass(h.this.mContext, FeedDownloadActivity.class);
                }
                hVar.callbackPageStatus(false, message);
            }

            @Override // com.kwad.sdk.components.j
            public final void b(com.kwad.sdk.components.g gVar) {
                WeakReference weakReference = (WeakReference) h.Wi.get(Integer.valueOf(gVar.getDialogId()));
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((com.kwad.components.core.webview.b.c.d) weakReference.get()).dismiss();
            }
        };
        this.Wo = new Runnable() { // from class: com.kwad.components.core.webview.b.h.20
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.sdk.core.e.c.d("TKLoadController", "已经超时" + h.this.VT.getTkTemplateId());
                h.this.rT();
                h.a(h.this, true);
                h.this.rP();
            }
        };
        this.Wp = new Runnable() { // from class: com.kwad.components.core.webview.b.h.21
            @Override // java.lang.Runnable
            public final void run() {
                h.b(h.this, true);
                h.this.rP();
            }
        };
        this.mVideoPlayStateListener = new com.kwad.components.core.video.l() { // from class: com.kwad.components.core.webview.b.h.14
            private void g(double d) {
                h.this.wt.Xq = false;
                h.this.wt.Xm = false;
                h.this.wt.nQ = (int) ((d / 1000.0d) + 0.5d);
                jc();
            }

            private void jc() {
                if (h.this.VY == null || h.this.wt == null) {
                    return;
                }
                h.this.VY.a(h.this.wt);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayCompleted() {
                h.this.wt.Xm = true;
                h.this.wt.Xq = false;
                h.this.wt.nQ = com.kwad.sdk.core.response.b.a.G(com.kwad.sdk.core.response.b.d.ck(h.this.rO()));
                jc();
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayError(int i, int i2) {
                h.this.wt.Xq = true;
                h.this.wt.Xm = false;
                jc();
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayProgress(long j2, long j3) {
                g(j3);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayStart() {
                g(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPreparing() {
                g(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
            }
        };
        this.mContext = context;
        this.xM = -1L;
        this.Wj = 1000;
        this.wt = new y();
    }

    public h(Context context, int i, int i2) {
        this.VZ = false;
        this.Wa = false;
        this.Wb = false;
        this.Wc = false;
        this.Wd = false;
        this.We = 0;
        this.xM = -1L;
        this.Wj = 1000;
        this.Wk = 0;
        this.Wl = new com.kwad.sdk.core.webview.e();
        this.Wm = new a() { // from class: com.kwad.components.core.webview.b.h.17
            @Override // com.kwad.components.core.webview.b.h.a
            public final void onFailed() {
                h.this.rP();
                com.kwad.sdk.core.e.c.d("TKLoadController", AdError.ERROR_MEDIA_RENDER_MSG);
            }

            @Override // com.kwad.components.core.webview.b.h.a
            public final void onSuccess() {
                com.kwad.sdk.core.e.c.d("TKLoadController", "渲染成功");
            }
        };
        this.Wn = new com.kwad.sdk.components.j() { // from class: com.kwad.components.core.webview.b.h.19
            @Override // com.kwad.sdk.components.j
            public final void a(com.kwad.sdk.components.g gVar) {
                Activity activity = h.this.mActivity;
                if (activity == null) {
                    com.kwad.sdk.core.c.b.AT();
                    activity = com.kwad.sdk.core.c.b.getCurrentActivity();
                }
                if (activity == null || activity.isFinishing()) {
                    gVar.callbackPageStatus(false, "no host activity");
                    return;
                }
                StyleTemplate styleTemplate = new StyleTemplate();
                try {
                    styleTemplate.parseJson(styleTemplate, new JSONObject(gVar.getStyleTemplate()));
                    d.b bVar = new d.b();
                    bVar.setAdTemplate(h.this.rO());
                    bVar.a(styleTemplate);
                    bVar.aP(styleTemplate.templateId);
                    bVar.c(gVar);
                    com.kwad.components.core.webview.b.c.d b = com.kwad.components.core.webview.b.c.d.b(bVar);
                    b.show(activity.getFragmentManager(), "");
                    h.Wi.put(Integer.valueOf(gVar.getDialogId()), new WeakReference(b));
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTrace(th);
                    gVar.callbackPageStatus(false, "template parse failed");
                }
            }

            @Override // com.kwad.sdk.components.j
            public final void a(com.kwad.sdk.components.h hVar) {
                String message;
                if (hVar.getTemplateString() == null && hVar.getUrl() == null && hVar.getClassName() == null) {
                    message = "intent invalid";
                } else {
                    Activity activity = h.this.mActivity;
                    if (activity == null) {
                        com.kwad.sdk.core.c.b.AT();
                        activity = com.kwad.sdk.core.c.b.getCurrentActivity();
                    }
                    if (activity == null) {
                        hVar.callbackPageStatus(false, "no host activity");
                    }
                    Intent intent = hVar.getIntent();
                    try {
                        if (hVar.getTemplateString() != null) {
                            com.kwad.sdk.service.b.a(FeedDownloadActivity.class, com.kwad.components.core.s.a.a.class);
                            int qe = com.kwad.components.core.s.a.a.qe();
                            com.kwad.components.core.s.a.a.a(qe, "native_intent", hVar);
                            AdTemplate rO = h.this.rO();
                            if (rO != null) {
                                intent.putExtra("tk_ad_template", rO.toJson().toString());
                            }
                            intent.putExtra("tk_style_template", hVar.getTemplateString());
                            intent.putExtra("tk_id", qe);
                        } else if (hVar.getClassName() == null) {
                            intent.setData(Uri.parse(hVar.getUrl()));
                            activity.startActivity(intent);
                            hVar.callbackPageStatus(true, null);
                            return;
                        } else {
                            try {
                                com.kwad.sdk.service.b.a(FeedDownloadActivity.class, Class.forName(hVar.getClassName()));
                            } catch (ClassNotFoundException e) {
                                message = e.getMessage();
                            }
                        }
                        activity.startActivity(intent);
                        hVar.callbackPageStatus(true, null);
                        return;
                    } catch (Throwable th) {
                        message = th.getMessage();
                    }
                    intent.setClass(h.this.mContext, FeedDownloadActivity.class);
                }
                hVar.callbackPageStatus(false, message);
            }

            @Override // com.kwad.sdk.components.j
            public final void b(com.kwad.sdk.components.g gVar) {
                WeakReference weakReference = (WeakReference) h.Wi.get(Integer.valueOf(gVar.getDialogId()));
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((com.kwad.components.core.webview.b.c.d) weakReference.get()).dismiss();
            }
        };
        this.Wo = new Runnable() { // from class: com.kwad.components.core.webview.b.h.20
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.sdk.core.e.c.d("TKLoadController", "已经超时" + h.this.VT.getTkTemplateId());
                h.this.rT();
                h.a(h.this, true);
                h.this.rP();
            }
        };
        this.Wp = new Runnable() { // from class: com.kwad.components.core.webview.b.h.21
            @Override // java.lang.Runnable
            public final void run() {
                h.b(h.this, true);
                h.this.rP();
            }
        };
        this.mVideoPlayStateListener = new com.kwad.components.core.video.l() { // from class: com.kwad.components.core.webview.b.h.14
            private void g(double d) {
                h.this.wt.Xq = false;
                h.this.wt.Xm = false;
                h.this.wt.nQ = (int) ((d / 1000.0d) + 0.5d);
                jc();
            }

            private void jc() {
                if (h.this.VY == null || h.this.wt == null) {
                    return;
                }
                h.this.VY.a(h.this.wt);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayCompleted() {
                h.this.wt.Xm = true;
                h.this.wt.Xq = false;
                h.this.wt.nQ = com.kwad.sdk.core.response.b.a.G(com.kwad.sdk.core.response.b.d.ck(h.this.rO()));
                jc();
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayError(int i3, int i22) {
                h.this.wt.Xq = true;
                h.this.wt.Xm = false;
                jc();
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayProgress(long j2, long j3) {
                g(j3);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayStart() {
                g(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPreparing() {
                g(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
            }
        };
        this.mContext = context;
        this.Wj = i;
        this.wt = new y();
        this.Wk = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TKDownloadListener tKDownloadListener) {
        StyleTemplate styleTemplate = this.QP;
        if (styleTemplate != null) {
            this.VV.loadTkFileByTemplateId(this.mContext, styleTemplate.templateId, this.QP.templateMd5, this.QP.templateUrl, this.QP.templateVersionCode, tKDownloadListener);
            return;
        }
        AdMatrixInfo.MatrixTemplate e = com.kwad.sdk.core.response.b.b.e(rO(), this.VT.getTkTemplateId());
        if (e == null) {
            return;
        }
        this.VV.loadTkFileByTemplateId(this.mContext, e.templateId, e.templateMd5, e.templateUrl, (int) e.templateVersionCode, tKDownloadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(StyleTemplate styleTemplate, final a aVar) {
        this.QP = styleTemplate;
        com.kwad.sdk.core.e.c.w("TKLoadController", "addTKView mTKPlugin.getState(): " + this.VV.getState());
        if (this.VV.getState() == ITkOfflineCompo.TKState.SO_FAIL) {
            aN(TKPerformMsg.ERROR_REASON.KSAD_TK_SO_FAIL);
            if (aVar != null) {
                aVar.onFailed();
            }
        } else if (TextUtils.isEmpty(styleTemplate.jsStr)) {
            aO(TKPerformMsg.ERROR_REASON.KSAD_TK_NO_TEMPLATE);
            if (aVar != null) {
                aVar.onFailed();
            }
        } else {
            try {
                rR();
                this.Wg = SystemClock.elapsedRealtime();
                l a2 = this.VV.a(this.mContext, styleTemplate.templateId, styleTemplate.templateVersionCode, styleTemplate.tkSouce);
                com.kwad.components.core.n.a.c.a.a.a(a2.getUniqId(), this.mAdTemplate);
                a2.a(this.Wn);
                AdTemplate adTemplate = this.mAdTemplate;
                if (adTemplate != null && adTemplate.mAdScene != null) {
                    rU().put("adStyle", Integer.valueOf(this.mAdTemplate.mAdScene.getAdStyle()));
                }
                a2.setCustomEnv(rU());
                this.VX = a2;
                com.kwad.sdk.core.webview.c.g gVar = this.VU;
                if (gVar != null) {
                    a2.b(gVar);
                }
                this.mInitTime = SystemClock.elapsedRealtime() - this.Wg;
                this.Wf = SystemClock.elapsedRealtime();
                rN();
                a(a2);
                File file = new File(this.VV.getJsBaseDir(this.mContext, this.VT.getTkTemplateId()));
                String str = styleTemplate.jsStr;
                a2.a(str, file.getAbsolutePath() + "/", new k() { // from class: com.kwad.components.core.webview.b.h.18
                    @Override // com.kwad.sdk.components.k
                    public final void onFailed(Throwable th) {
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.onFailed();
                        }
                        h.this.f(th);
                    }

                    @Override // com.kwad.sdk.components.k
                    public final void onSuccess() {
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.onSuccess();
                        }
                    }
                });
                View view = a2.getView();
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.VT.getTKContainer().addView(view);
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTrace(th);
                f(th);
                if (aVar != null) {
                    aVar.onFailed();
                }
            }
        }
    }

    private void a(l lVar) {
        com.kwad.components.core.e.d.c cVar = rO() != null ? new com.kwad.components.core.e.d.c(rO()) : null;
        this.VT.a(lVar, this.Wl);
        s sVar = new s();
        sVar.a(new s.a() { // from class: com.kwad.components.core.webview.b.h.23
            @Override // com.kwad.components.core.webview.b.a.s.a
            public final void a(com.kwad.components.core.webview.b.b.s sVar2) {
                if (TextUtils.isEmpty(sVar2.message)) {
                    return;
                }
                v.d(h.this.mContext, sVar2.message, 0L);
            }
        });
        a(lVar, sVar);
        a(lVar, c(this.Wl));
        a(lVar, new com.kwad.sdk.core.webview.d.a());
        a(lVar, new com.kwad.components.core.webview.b.a.f());
        a(lVar, mW() ? new r(this.Wl, cVar, this) : new u(this.Wl, cVar, this));
        a(lVar, new t());
        a(lVar, new com.kwad.components.core.webview.b.a.k());
        a(lVar, new x(this.Wl));
        a(lVar, new aa(this.Wl));
        w wVar = new w(this.Wl);
        wVar.a(new w.b() { // from class: com.kwad.components.core.webview.b.h.2
            @Override // com.kwad.components.core.webview.jshandler.w.b
            public final void c(w.a aVar) {
                h.this.VT.b(aVar);
            }
        });
        a(lVar, wVar);
        a(lVar, new ad(this.Wl, new ad.b() { // from class: com.kwad.components.core.webview.b.h.3
            @Override // com.kwad.components.core.webview.jshandler.ad.b
            public final void a(ad.a aVar) {
                h.this.b(aVar);
            }
        }));
        a(lVar, new ak(new ak.b() { // from class: com.kwad.components.core.webview.b.h.4
            @Override // com.kwad.components.core.webview.jshandler.ak.b
            public final void a(ak.a aVar) {
                if (aVar.status != 1) {
                    h.this.rP();
                    h.this.aO(aVar.errorMsg);
                } else if (h.this.Wa) {
                    h.this.rP();
                } else {
                    bj.b(h.this.Wp);
                    h.this.rS();
                    if (h.this.VT != null) {
                        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.h.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                h.this.VT.ej();
                            }
                        });
                        com.kwad.components.core.webview.b.d.b.si().c(h.this.VT.getTkTemplateId(), h.this.Wg - h.this.Dh, h.this.mInitTime, h.this.Wf > 0 ? SystemClock.elapsedRealtime() - h.this.Wf : 0L);
                    }
                }
            }
        }));
        ap apVar = new ap();
        a(lVar, apVar);
        this.VT.b(apVar);
        a(lVar, new as(this.Wl, cVar));
        p pVar = new p();
        this.VY = pVar;
        a(lVar, pVar);
        this.VT.a(this.VY);
        if (rO() != null && com.kwad.sdk.core.response.b.a.ax(com.kwad.sdk.core.response.b.d.ck(rO()))) {
            final com.kwad.components.core.webview.b.a.l lVar2 = new com.kwad.components.core.webview.b.a.l();
            a(lVar, lVar2);
            this.Tk = new com.kwad.sdk.core.download.e(rO()) { // from class: com.kwad.components.core.webview.b.h.5
                @Override // com.kwad.sdk.core.download.e, com.kwad.sdk.core.download.d
                public final void a(String str, int i, com.kwad.sdk.core.download.f fVar) {
                    super.a(str, i, fVar);
                    com.kwad.components.core.webview.b.b.b bVar = new com.kwad.components.core.webview.b.b.b();
                    bVar.WX = 1;
                    lVar2.a(bVar);
                }
            };
            com.kwad.sdk.core.download.c.Av().a(this.Tk, rO());
        }
        com.kwad.components.core.webview.b.a.t tVar = new com.kwad.components.core.webview.b.a.t();
        tVar.a(new t.a() { // from class: com.kwad.components.core.webview.b.h.6
            @Override // com.kwad.components.core.webview.b.a.t.a
            public final void b(com.kwad.components.core.webview.b.b.t tVar2) {
                h.this.VT.a(tVar2);
            }
        });
        a(lVar, tVar);
        com.kwad.components.core.webview.b.a.u uVar = new com.kwad.components.core.webview.b.a.u();
        uVar.a(new u.a() { // from class: com.kwad.components.core.webview.b.h.7
            @Override // com.kwad.components.core.webview.b.a.u.a
            public final void a(m mVar) {
                h.this.VT.b(mVar);
            }
        });
        a(lVar, uVar);
        o oVar = new o();
        a(lVar, oVar);
        this.VT.a(oVar);
        a(lVar, new com.kwad.components.core.webview.b.a.r() { // from class: com.kwad.components.core.webview.b.h.8
            @Override // com.kwad.components.core.webview.b.a.r
            public final void a(com.kwad.components.core.webview.b.b.r rVar) {
                super.a(rVar);
                if (h.this.mActivity == null) {
                    h hVar = h.this;
                    com.kwad.sdk.core.c.b.AT();
                    hVar.mActivity = com.kwad.sdk.core.c.b.getCurrentActivity();
                }
                if (h.this.mActivity == null || h.this.mActivity.isFinishing()) {
                    return;
                }
                if (h.this.VS != null) {
                    h.this.VS.dismiss();
                }
                d.b bVar = new d.b();
                bVar.setAdTemplate(h.this.rO());
                bVar.aP(rVar.templateId);
                h.this.VS = com.kwad.components.core.webview.b.c.d.b(bVar);
                h.this.VS.show(h.this.mActivity.getFragmentManager(), "");
            }
        });
        a(lVar, new com.kwad.components.core.webview.b.a.c() { // from class: com.kwad.components.core.webview.b.h.9
            @Override // com.kwad.components.core.webview.b.a.c
            public final void jf() {
                super.jf();
                if (h.this.VS != null) {
                    h.this.VS.dismiss();
                }
                if (h.this.VT != null) {
                    h.this.VT.eo();
                }
            }
        });
        a(lVar, new com.kwad.components.core.webview.jshandler.s(new com.kwad.sdk.core.webview.d.a.b() { // from class: com.kwad.components.core.webview.b.h.10
            @Override // com.kwad.sdk.core.webview.d.a.b
            public final void a(WebCloseStatus webCloseStatus) {
                h.this.VT.b(webCloseStatus);
            }
        }));
        a(lVar, new com.kwad.components.core.webview.b.a.d() { // from class: com.kwad.components.core.webview.b.h.11
            @Override // com.kwad.components.core.webview.b.a.d
            public final void a(com.kwad.components.core.webview.b.b.g gVar) {
                super.a(gVar);
                com.kwad.components.core.p.a.pC().a(gVar.UR, h.this.rO(), gVar.US);
            }
        });
        a(lVar, new com.kwad.components.core.webview.b.a.j() { // from class: com.kwad.components.core.webview.b.h.13
            @Override // com.kwad.components.core.webview.b.a.j
            public final void a(n nVar) {
                super.a(nVar);
                AdWebViewActivityProxy.launch(h.this.mContext, new AdWebViewActivityProxy.a.C0206a().as(nVar.title).at(nVar.url).ax(true).V(h.this.rO()).oE());
            }
        });
        a(lVar, new com.kwad.components.core.webview.b.a.a(rO()));
        a(lVar, new com.kwad.components.core.webview.b.a(rO()));
        a(this.Wl, cVar, lVar, this.VT.getTKContainer());
    }

    private static void a(l lVar, com.kwad.sdk.core.webview.c.a aVar) {
        lVar.c(aVar);
    }

    static /* synthetic */ boolean a(h hVar, boolean z) {
        hVar.VZ = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aM(String str) {
        rP();
        aN(str);
    }

    private void aN(String str) {
        ad(str);
        StyleTemplate rM = rM();
        if (rM == null) {
            return;
        }
        TkLoggerReporter.get().reportTKPerform(ILoggerReporter.Category.ERROR_LOG, new TKPerformMsg(this.We).setRenderState(4).setErrorReason(str).setTemplateId(this.VT.getTkTemplateId()).setVersionCode(String.valueOf(rM.templateVersionCode)).toJson());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aO(String str) {
        com.kwad.sdk.core.e.c.d("tkRender", "logTkRenderFail : " + str + ", templateId = " + this.VT.getTkTemplateId());
        ae(str);
        if (!this.Wb || this.Wc) {
            return;
        }
        this.Wc = true;
        TkLoggerReporter.get().reportTKPerform(ILoggerReporter.Category.ERROR_LOG, new TKPerformMsg(this.We).setRenderState(2).setErrorReason(str).setTemplateId(this.VT.getTkTemplateId()).setVersionCode(String.valueOf(this.QP.templateVersionCode)).toJson());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ad.a aVar) {
        FrameLayout tKContainer = this.VT.getTKContainer();
        if (tKContainer != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tKContainer.getLayoutParams();
            layoutParams.height = com.kwad.sdk.d.a.a.a(this.mContext, aVar.height);
            layoutParams.leftMargin = com.kwad.sdk.d.a.a.a(this.mContext, aVar.leftMargin);
            layoutParams.rightMargin = com.kwad.sdk.d.a.a.a(this.mContext, aVar.rightMargin);
            layoutParams.bottomMargin = com.kwad.sdk.d.a.a.a(this.mContext, aVar.bottomMargin);
            layoutParams.width = -1;
            tKContainer.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final StyleTemplate styleTemplate) {
        com.kwad.sdk.utils.i.e("", "renderType_tk", styleTemplate.templateId, styleTemplate.templateUrl);
        com.kwad.sdk.core.e.c.d("TKLoadController", "读取完毕，总耗时" + (SystemClock.elapsedRealtime() - this.Dh) + ", 读取成功" + styleTemplate.templateId);
        if (this.VZ) {
            return;
        }
        com.kwad.sdk.core.e.c.d("TKLoadController", "没有超时");
        bj.b(this.Wo);
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.h.12
            @Override // java.lang.Runnable
            public final void run() {
                h hVar = h.this;
                hVar.a(styleTemplate, hVar.Wm);
            }
        });
    }

    static /* synthetic */ boolean b(h hVar, boolean z) {
        hVar.Wa = true;
        return true;
    }

    static /* synthetic */ boolean c(h hVar, boolean z) {
        hVar.Wd = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Throwable th) {
        com.kwad.sdk.core.e.c.d("tkRender", "logTkRenderFail : " + th + ", templateId = " + this.VT.getTkTemplateId());
        StringBuilder sb = new StringBuilder("error:");
        sb.append(th.toString());
        ae(sb.toString());
        TkLoggerReporter.get().reportTKPerform(ILoggerReporter.Category.ERROR_LOG, new TKPerformMsg(this.We).setRenderState(3).setErrorReason(th.toString()).setTemplateId(this.VT.getTkTemplateId()).setVersionCode(String.valueOf(this.QP.templateVersionCode)).toJson());
    }

    private void rK() {
        this.Wb = false;
        this.Wc = false;
        this.VZ = false;
        this.Wa = false;
        this.Wd = false;
        this.Dh = 0L;
        this.Wg = 0L;
        this.mInitTime = 0L;
        this.Wf = 0L;
    }

    private void rL() {
        bj.runOnUiThreadDelay(this.Wo, this.Wj);
        int i = this.Wk;
        if (i > 0) {
            bj.runOnUiThreadDelay(this.Wp, i);
        }
        this.VW = GlobalThreadPools.CV().submit(new Runnable() { // from class: com.kwad.components.core.webview.b.h.1
            @Override // java.lang.Runnable
            public final void run() {
                h.this.Dh = SystemClock.elapsedRealtime();
                com.kwad.sdk.core.e.c.d("TKLoadController", "开始读取模板 id: " + h.this.VT.getTkTemplateId());
                h.this.a(new TKDownloadListener() { // from class: com.kwad.components.core.webview.b.h.1.1
                    @Override // com.kwad.components.offline.api.tk.TKDownloadListener
                    public final void onFailed(String str) {
                        h.this.aM(str);
                    }

                    @Override // com.kwad.components.offline.api.tk.TKDownloadListener
                    public final void onSuccess(StyleTemplate styleTemplate) {
                        h.this.b(styleTemplate);
                    }
                });
            }
        });
    }

    private StyleTemplate rM() {
        StyleTemplate styleTemplate = this.QP;
        if (styleTemplate != null) {
            return styleTemplate;
        }
        AdMatrixInfo.MatrixTemplate e = com.kwad.sdk.core.response.b.b.e(rO(), this.VT.getTkTemplateId());
        if (e == null) {
            return null;
        }
        com.kwad.components.core.n.a.c.c cVar = this.VV;
        if (cVar == null) {
            StyleTemplate styleTemplate2 = new StyleTemplate();
            styleTemplate2.templateId = e.templateId;
            styleTemplate2.templateMd5 = e.templateMd5;
            styleTemplate2.templateUrl = e.templateUrl;
            styleTemplate2.templateVersionCode = (int) e.templateVersionCode;
            styleTemplate2.tkSouce = 0;
            return styleTemplate2;
        }
        return cVar.checkStyleTemplateById(this.mContext, e.templateId, e.templateMd5, e.templateUrl, (int) e.templateVersionCode);
    }

    private void rN() {
        this.Wl.a(!ai.IK() ? 1 : 0, this.VT.getTouchCoordsView(), this.VT.getTKContainer(), this.VT.getTkTemplateId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rP() {
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.h.22
            @Override // java.lang.Runnable
            public final void run() {
                if (h.this.Wd) {
                    return;
                }
                h.c(h.this, true);
                h.this.VT.cd();
                com.kwad.components.core.webview.b.d.b.si().aT(h.this.VT.getTkTemplateId());
            }
        });
    }

    private void rQ() {
        StyleTemplate rM = rM();
        if (rM == null) {
            return;
        }
        this.We = rM.tkSouce;
        TkLoggerReporter.get().reportTKPerform(ILoggerReporter.Category.APM_LOG, new TKPerformMsg(this.We).setRenderState(-1).setTemplateId(this.VT.getTkTemplateId()).setVersionCode(String.valueOf(rM.templateVersionCode)).toJson());
    }

    private void rR() {
        this.Wb = true;
        TkLoggerReporter.get().reportTKPerform(ILoggerReporter.Category.APM_LOG, new TKPerformMsg(this.We).setRenderState(0).setTemplateId(this.VT.getTkTemplateId()).setVersionCode(String.valueOf(this.QP.templateVersionCode)).toJson());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rS() {
        if (!this.Wb || this.Wc) {
            return;
        }
        this.Wc = true;
        TkLoggerReporter.get().reportTKPerform(ILoggerReporter.Category.APM_LOG, new TKPerformMsg(this.We).setRenderState(1).setRenderTime(this.Wf > 0 ? SystemClock.elapsedRealtime() - this.Wf : 0L).setTemplateId(this.VT.getTkTemplateId()).setLoadTime(this.Wg - this.Dh).setInitTime(this.mInitTime).setVersionCode(String.valueOf(this.QP.templateVersionCode)).toJson());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rT() {
        com.kwad.sdk.core.e.c.d("tkRender", "logTkRenderFail : timeout, templateId = " + this.VT.getTkTemplateId());
        StyleTemplate rM = rM();
        if (rM == null) {
            return;
        }
        TkLoggerReporter.get().reportTKPerform(ILoggerReporter.Category.ERROR_LOG, new TKPerformMsg(this.We).setRenderState(3).setErrorReason("timeout").setTemplateId(this.VT.getTkTemplateId()).setVersionCode(String.valueOf(rM.templateVersionCode)).toJson());
    }

    private Map<String, Object> rU() {
        if (this.Wh == null) {
            HashMap hashMap = new HashMap();
            this.Wh = hashMap;
            hashMap.put("TKVersion", "5.0.3");
            this.Wh.put("SDKVersion", BuildConfig.VERSION_NAME);
            this.Wh.put("sdkType", 1);
        }
        return this.Wh;
    }

    private void rV() {
        if (this.VV == null || this.VX == null) {
            return;
        }
        File file = new File(new File(this.VV.getJsBaseDir(this.mContext, this.VT.getTkTemplateId())), "kcov.json");
        if (file.exists()) {
            try {
                String V = q.V(file);
                if (TextUtils.isEmpty(V)) {
                    return;
                }
                com.kwad.sdk.core.e.c.d("TKLoadController", "kcov.json:" + V);
                JSONObject jSONObject = new JSONObject(V);
                final String string = jSONObject.getString("gitHeadCommit");
                final String string2 = jSONObject.getString("coverageApi");
                final String string3 = jSONObject.getString("coverageTaskId");
                final String string4 = jSONObject.getString("currentBranch");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4)) {
                    com.kwad.sdk.core.e.c.d("TKLoadController", "尝试获取覆盖率统计...");
                    Object execute = this.VX.execute("JSON.stringify(this.__coverage__)");
                    if (execute instanceof String) {
                        final String str = (String) execute;
                        com.kwad.sdk.utils.g.execute(new Runnable() { // from class: com.kwad.components.core.webview.b.h.16
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.kwad.sdk.core.network.c doPost;
                                String str2;
                                com.kwad.sdk.core.network.c doPost2;
                                String str3;
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("coverage_task_id", Integer.valueOf(string3));
                                    jSONObject2.put(com.umeng.analytics.pro.as.m, "");
                                    jSONObject2.put("timestamp", System.currentTimeMillis() / 1000);
                                    jSONObject2.put("branch_name", string4);
                                    jSONObject2.put("version", BuildConfig.VERSION_NAME);
                                    jSONObject2.put("tk_version", String.valueOf(h.this.QP.templateVersionCode));
                                    jSONObject2.put("tk_template_ids", h.this.QP.templateId);
                                } catch (JSONException e) {
                                    com.kwad.sdk.core.e.c.printStackTrace(e);
                                }
                                if (com.kwad.sdk.g.wW().doPost(string2 + "/analysis/add/pkg/info", (Map<String, String>) null, jSONObject2).Bb()) {
                                    str2 = "上传TK覆盖率pkg完成:" + doPost.aoR;
                                } else {
                                    str2 = "上传覆盖率pkg失败";
                                }
                                com.kwad.sdk.core.e.c.d("TKLoadController", str2);
                                if (com.kwad.sdk.g.wW().doPost(string2 + "/attachment/ec", (Map<String, String>) null, new AdHttpBodyBuilder() { // from class: com.kwad.components.core.webview.b.h.16.1
                                    @Override // com.kwad.sdk.export.proxy.AdHttpBodyBuilder
                                    public final void buildFormData(AdHttpFormDataBuilder adHttpFormDataBuilder) {
                                        adHttpFormDataBuilder.addFormDataPart(MonitorConstants.EXTRA_DOWNLOAD_TASK_ID, string3);
                                        adHttpFormDataBuilder.addFormDataPart("os_build_model", Build.MODEL);
                                        adHttpFormDataBuilder.addFormDataPart("os_build_serial", "unknown");
                                        adHttpFormDataBuilder.addFormDataPart("os_build_brand", Build.BRAND);
                                        adHttpFormDataBuilder.addFormDataPart("app_version", BuildConfig.VERSION_NAME);
                                        adHttpFormDataBuilder.addFormDataPart("git_head_commit", string);
                                        adHttpFormDataBuilder.addFormDataPart("execute_type", "manual_qa");
                                        adHttpFormDataBuilder.addFormDataPart("uid", "");
                                        adHttpFormDataBuilder.addFormDataPart("did", au.getDeviceId());
                                        adHttpFormDataBuilder.addFormDataPart("execute_user", "");
                                        adHttpFormDataBuilder.addFormDataPart("url_type", "transform");
                                        try {
                                            adHttpFormDataBuilder.addFormDataPart("file", UUID.randomUUID().toString() + ".json", "application/octet-stream", str.getBytes("UTF-8"));
                                        } catch (UnsupportedEncodingException e2) {
                                            com.kwad.sdk.core.e.c.printStackTrace(e2);
                                        }
                                    }
                                }).Bb()) {
                                    str3 = "上传TK覆盖率完成:" + doPost2.aoR;
                                } else {
                                    str3 = "上传TK覆盖率失败";
                                }
                                com.kwad.sdk.core.e.c.d("TKLoadController", str3);
                            }
                        });
                        return;
                    }
                    return;
                }
                com.kwad.sdk.core.e.c.d("TKLoadController", "kcov.json数据不合法，缺少关键字段gitHeadCommit | coverageApi | coverageTaskId | currentBranch");
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            }
        }
    }

    public void a(Activity activity, AdTemplate adTemplate, i iVar) {
        this.mActivity = activity;
        this.mAdTemplate = adTemplate;
        this.Wl.setAdTemplate(adTemplate);
        this.VT = iVar;
        rK();
        FrameLayout tKContainer = this.VT.getTKContainer();
        if (tKContainer != null) {
            tKContainer.removeAllViews();
        }
        if (!com.kwad.sdk.core.config.d.zq()) {
            rP();
            return;
        }
        this.VV = (com.kwad.components.core.n.a.c.c) com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.c.c.class);
        rQ();
        com.kwad.sdk.core.e.c.d("TKLoadController", "bind mTKPlugin: " + this.VV);
        if (this.VV != null) {
            rL();
            return;
        }
        rP();
        ad(TKPerformMsg.ERROR_REASON.KSAD_TK_OFFLINE_FAILED);
        TkLoggerReporter.get().reportTKPerform(ILoggerReporter.Category.ERROR_LOG, new TKPerformMsg(this.We).setRenderState(4).setErrorReason(TKPerformMsg.ERROR_REASON.KSAD_TK_OFFLINE_FAILED).setTemplateId(this.VT.getTkTemplateId()).toJson());
    }

    public final void a(StyleTemplate styleTemplate) {
        this.QP = styleTemplate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, l lVar, ViewGroup viewGroup) {
    }

    public final void a(com.kwad.sdk.core.webview.c.g gVar) {
        this.VU = gVar;
    }

    @Override // com.kwad.sdk.core.webview.d.a.a
    public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
        i iVar = this.VT;
        if (iVar != null) {
            iVar.a(aVar);
        }
    }

    public final void a(String str, Object obj) {
        rU().put(str, obj);
    }

    protected void ad(String str) {
    }

    protected void ae(String str) {
    }

    protected ae c(com.kwad.sdk.core.webview.b bVar) {
        return new ae(bVar);
    }

    @Override // com.kwad.sdk.components.i
    public final void callJS(String str) {
        l lVar = this.VX;
        if (lVar != null) {
            lVar.a(str, null, null);
        }
    }

    public final String getTkTemplateId() {
        i iVar = this.VT;
        if (iVar == null) {
            return null;
        }
        return iVar.getTkTemplateId();
    }

    public void jx() {
        Future<?> future = this.VW;
        if (future != null) {
            future.cancel(true);
        }
        bj.b(this.Wo);
        bj.b(this.Wp);
        if (this.Tk != null) {
            com.kwad.sdk.core.download.c.Av().a(this.Tk);
        }
        com.kwad.components.core.webview.b.c.d dVar = this.VS;
        if (dVar != null) {
            dVar.dismiss();
        }
        if (com.kwad.components.core.a.mp.booleanValue()) {
            rV();
        }
        com.kwad.components.core.n.a.c.c cVar = this.VV;
        if (cVar != null) {
            cVar.onDestroy();
        }
        final l lVar = this.VX;
        if (lVar != null) {
            com.kwad.components.core.n.a.c.a.a.av(lVar.getUniqId());
            this.VX = null;
            bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.h.15
                @Override // java.lang.Runnable
                public final void run() {
                    l lVar2 = lVar;
                    if (lVar2 != null) {
                        lVar2.onDestroy();
                    }
                }
            });
        }
    }

    protected boolean mW() {
        return false;
    }

    public final com.kwad.sdk.core.webview.b rJ() {
        return this.Wl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AdTemplate rO() {
        return this.Wl.getAdTemplate();
    }
}
