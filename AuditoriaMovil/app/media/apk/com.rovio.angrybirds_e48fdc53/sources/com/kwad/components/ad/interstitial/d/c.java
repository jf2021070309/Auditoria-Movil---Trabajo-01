package com.kwad.components.ad.interstitial.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.View;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.video.a;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.imageloader.core.assist.FailReason;
import com.kwad.sdk.core.imageloader.core.decode.DecodedResult;
import com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener;
import com.kwad.sdk.core.imageloader.utils.BlurUtils;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.bc;
import com.kwad.sdk.widget.KSFrameLayout;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c extends com.kwad.sdk.mvp.a {
    public KsAdVideoPlayConfig dJ;
    public com.kwad.sdk.core.video.videoview.a ex;
    public com.kwad.components.core.webview.b.e.e gv;
    public KsInterstitialAd.AdInteractionListener hB;
    public com.kwad.components.ad.interstitial.d hI;
    public com.kwad.components.ad.interstitial.e.b hz;
    public com.kwad.components.ad.interstitial.f.f ji;
    public boolean jk;
    public boolean jl;
    public boolean jm;
    public a jn;
    public KSFrameLayout jq;
    public d jr;
    public boolean jv;
    public com.kwad.components.core.e.d.c mApkDownloadHelper;
    public List<a> jo = new CopyOnWriteArrayList();
    public List<h> jp = new CopyOnWriteArrayList();
    private Handler mHandler = new Handler(Looper.getMainLooper());
    public volatile boolean ju = false;
    public int jw = -1;
    public List<a.c> jt = new CopyOnWriteArrayList();
    private List<e> jj = new CopyOnWriteArrayList();
    public List<InterfaceC0156c> js = new ArrayList();

    /* renamed from: com.kwad.components.ad.interstitial.d.c$4  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass4 implements ImageLoadingListener {
        final /* synthetic */ View eX;
        final /* synthetic */ Context jB;

        AnonymousClass4(Context context, View view) {
            this.jB = context;
            this.eX = view;
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final boolean onDecode(String str, InputStream inputStream, DecodedResult decodedResult) {
            return false;
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingCancelled(String str, View view) {
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingComplete(String str, View view, final DecodedResult decodedResult) {
            com.kwad.sdk.utils.g.execute(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.c.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap bitmap = decodedResult.mBitmap;
                    com.kwad.sdk.core.e.c.d("InterstitialCallerContext", "onLoadingComplete before blur");
                    Bitmap stackBlur = BlurUtils.stackBlur(bitmap, 50, false);
                    com.kwad.sdk.core.e.c.d("InterstitialCallerContext", "onLoadingComplete after blur");
                    float dimension = AnonymousClass4.this.jB.getResources().getDimension(R.dimen.ksad_interstitial_icon_radius);
                    final RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(AnonymousClass4.this.jB.getResources(), stackBlur);
                    create.setCornerRadius(dimension);
                    AnonymousClass4.this.eX.post(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.c.4.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass4.this.eX.setBackground(create);
                        }
                    });
                }
            });
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingFailed(String str, View view, FailReason failReason) {
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingStarted(String str, View view) {
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void cl();
    }

    /* loaded from: classes.dex */
    public static class b {
        private final Context context;
        private int jG;
        private boolean jH;
        private int jI;
        private boolean jJ;
        private ac.a jK;
        public double jL;
        public boolean jM;

        public b(Context context) {
            this.context = context;
        }

        public final b a(ac.a aVar) {
            this.jK = aVar;
            return this;
        }

        public final b c(double d) {
            this.jL = d;
            return this;
        }

        public final int cW() {
            return this.jG;
        }

        public final boolean cX() {
            return this.jH;
        }

        public final boolean cY() {
            return this.jJ;
        }

        public final int cZ() {
            return this.jI;
        }

        public final double da() {
            return this.jL;
        }

        public final Context getContext() {
            return this.context;
        }

        public final ac.a getTouchCoords() {
            return this.jK;
        }

        public final b k(boolean z) {
            this.jH = z;
            return this;
        }

        public final b l(boolean z) {
            this.jJ = true;
            return this;
        }

        public final b m(boolean z) {
            this.jM = true;
            return this;
        }

        public final b y(int i) {
            this.jG = i;
            return this;
        }

        public final b z(int i) {
            this.jI = i;
            return this;
        }
    }

    /* renamed from: com.kwad.components.ad.interstitial.d.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0156c {
        void db();
    }

    /* loaded from: classes.dex */
    public interface d {
        void dc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        void onError();
    }

    private static int a(long j, AdTemplate adTemplate) {
        if (j == -1) {
            return -1;
        }
        float H = ((float) com.kwad.sdk.core.response.b.a.H(com.kwad.sdk.core.response.b.d.ck(adTemplate))) / 1000.0f;
        if (H != 0.0f) {
            return Math.round((((float) j) / H) * 100.0f);
        }
        return -1;
    }

    private static long a(com.kwad.sdk.core.video.videoview.a aVar) {
        if (aVar == null) {
            return -1L;
        }
        return aVar.getCurrentPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, Context context) {
        KsInterstitialAd.AdInteractionListener adInteractionListener;
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, new com.kwad.sdk.core.report.j().ck(i).cg(i2).cr(ai.IK() ? 2 : 1).BZ(), (JSONObject) null);
        if (!this.jm && (adInteractionListener = this.hB) != null) {
            adInteractionListener.onAdClicked();
        }
        this.jk = true;
        if (this.jm) {
            return;
        }
        cl();
    }

    public static boolean a(Context context, AdInfo adInfo) {
        return com.kwad.sdk.core.response.b.a.aO(adInfo) && !ai.IK();
    }

    private static int b(com.kwad.sdk.core.video.videoview.a aVar) {
        if (aVar == null) {
            return -1;
        }
        long duration = aVar.getDuration();
        long currentPosition = aVar.getCurrentPosition();
        if (duration != 0) {
            return Math.round((((float) currentPosition) / ((float) duration)) * 100.0f);
        }
        return -1;
    }

    public final boolean M(Context context) {
        if (this.mAdTemplate == null || context == null) {
            com.kwad.sdk.core.e.c.w("InterstitialCallerContext", "isPlayable illegal params: " + this.mAdTemplate + ", context: " + context);
            return false;
        }
        return com.kwad.sdk.core.response.b.a.bv(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    public final void a(final Context context, final int i, int i2, int i3) {
        com.kwad.components.core.e.d.a.a(new a.C0197a(context).S(this.mAdTemplate).b(this.mApkDownloadHelper).al(false).ao(2).am(6).an(i).a(new a.b() { // from class: com.kwad.components.ad.interstitial.d.c.3
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                c.this.a(r2, i, context);
            }
        }));
    }

    public final void a(Context context, AdInfo adInfo, AdTemplate adTemplate, View view) {
        if (view == null) {
            return;
        }
        String url = com.kwad.sdk.core.response.b.a.bi(adInfo).getUrl();
        if (bc.isNullString(url)) {
            return;
        }
        KSImageLoader.loadImage(url, adTemplate, KSImageLoader.IMGOPTION_NORMAL, new AnonymousClass4(context, view));
    }

    public final void a(a aVar) {
        if (aVar == null) {
            return;
        }
        this.jo.add(aVar);
    }

    public final void a(final b bVar) {
        boolean z = bVar.cW() == 1;
        if ((com.kwad.components.ad.interstitial.a.b.cE() || z || bVar.cY() || bVar.jM) && com.kwad.components.core.e.d.a.a(new a.C0197a(bVar.getContext()).S(this.mAdTemplate).b(this.mApkDownloadHelper).al(z).am(1).an(bVar.jI).ao(bVar.cW()).a(new a.b() { // from class: com.kwad.components.ad.interstitial.d.c.1
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                c.this.b(bVar);
            }
        })) == 0 && this.hI != null && com.kwad.components.ad.interstitial.a.b.cH()) {
            a(false, -1, this.ex);
            this.mHandler.postDelayed(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.hI.dismiss();
                }
            }, 500L);
        }
    }

    public final void a(e eVar) {
        this.jj.add(eVar);
    }

    public final void a(h hVar) {
        if (hVar == null) {
            return;
        }
        this.jp.add(hVar);
    }

    public final void a(a.c cVar) {
        if (this.jt.contains(cVar)) {
            return;
        }
        this.jt.add(cVar);
    }

    public final void a(boolean z, int i, com.kwad.sdk.core.video.videoview.a aVar) {
        long j;
        int a2;
        if (aVar != null) {
            j = a(aVar);
            a2 = b(aVar);
        } else {
            j = i;
            a2 = a(j, this.mAdTemplate);
        }
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, z ? 14 : 1, j, a2, this.hI.getTimerHelper().getTime(), null);
    }

    public final void b(Context context, AdTemplate adTemplate) {
        if (this.ju) {
            return;
        }
        com.kwad.components.core.page.a.launch(context, adTemplate);
        this.ju = true;
    }

    public final void b(a aVar) {
        if (aVar == null) {
            return;
        }
        this.jo.remove(aVar);
    }

    public final void b(b bVar) {
        KsInterstitialAd.AdInteractionListener adInteractionListener;
        com.kwad.sdk.core.report.j jVar = new com.kwad.sdk.core.report.j();
        jVar.c(bVar.getTouchCoords());
        if (!bVar.cX() && !bVar.jJ) {
            bVar.z(153);
        }
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, new com.kwad.sdk.core.report.j().cg(bVar.cZ()).c(bVar.getTouchCoords()).cr(ai.IK() ? 2 : 1).i(bVar.da()), (JSONObject) null);
        com.kwad.sdk.core.video.videoview.a aVar = this.ex;
        if (aVar != null) {
            long a2 = a(aVar);
            int b2 = b(this.ex);
            jVar.ae(a2);
            jVar.cl(b2);
        }
        if (!this.jm && (adInteractionListener = this.hB) != null) {
            adInteractionListener.onAdClicked();
        }
        this.jk = true;
        if (this.jm) {
            return;
        }
        cl();
    }

    public final void b(h hVar) {
        if (hVar == null) {
            return;
        }
        this.jp.remove(hVar);
    }

    public final void b(a.c cVar) {
        this.jt.remove(cVar);
    }

    public final void cQ() {
        List<e> list = this.jj;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (e eVar : this.jj) {
            if (eVar != null) {
                eVar.onError();
            }
        }
    }

    public final void cR() {
        d dVar = this.jr;
        if (dVar != null) {
            dVar.dc();
        }
    }

    public final void cS() {
        for (InterfaceC0156c interfaceC0156c : this.js) {
            interfaceC0156c.db();
        }
    }

    public final void cT() {
        for (h hVar : this.jp) {
            hVar.dw();
        }
    }

    public final void cU() {
        for (h hVar : this.jp) {
            hVar.dx();
        }
    }

    public final boolean cV() {
        com.kwad.components.ad.interstitial.f.f fVar = this.ji;
        boolean z = fVar == null || fVar.getParent() == null;
        com.kwad.sdk.core.e.c.d("InterstitialCallerContext", "isH5Interstitial :" + z);
        return z;
    }

    public final void cl() {
        for (a aVar : this.jo) {
            aVar.cl();
        }
        a aVar2 = this.jn;
        if (aVar2 != null) {
            aVar2.cl();
        }
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
        this.mHandler.removeCallbacksAndMessages(null);
        this.jt.clear();
        this.jj.clear();
        this.js.clear();
        this.jp.clear();
        com.kwad.components.ad.interstitial.e.b bVar = this.hz;
        if (bVar != null) {
            bVar.sC();
        }
    }
}
