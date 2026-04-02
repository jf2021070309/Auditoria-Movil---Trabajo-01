package com.rovio.rcs.ads;

import android.app.Activity;
import com.rovio.rcs.ads.WebViewAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
class WebViewAdFactory {
    private static final String TAG = "WebViewAdFactory";
    private static final boolean VERBOSE_LOGGING = false;
    private static WebViewAdFactory m_instance;
    private List<CachedView> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface LoadListener {
        void onWebViewAdReady(String str, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WebViewAdFactory instance() {
        if (m_instance == null) {
            m_instance = new WebViewAdFactory();
        }
        return m_instance;
    }

    private WebViewAdFactory() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final String str, String str2, Activity activity, final LoadListener loadListener) {
        CachedView cachedView = new CachedView(str, new WebViewAd(new WebViewAd.WebViewAdListener() { // from class: com.rovio.rcs.ads.WebViewAdFactory.1
            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onUrlLoaded(boolean z) {
                loadListener.onWebViewAdReady(str, z);
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onLinkClicked(String str3) {
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onRovioTrackEvent(String str3, String str4) {
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onVideoEnded(String str3, float f) {
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onVideoStarted() {
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onViewVisible() {
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onViewHidden() {
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onViewExpanded() {
            }

            @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
            public void onViewCollapsed() {
            }
        }, activity));
        cachedView.view.b(str2);
        if (str2.equals("mraid") || str.indexOf(60) >= 0) {
            cachedView.view.d(str);
        } else {
            cachedView.view.c(str);
        }
        this.a.add(cachedView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebViewAd a(String str) {
        int indexOf = this.a.indexOf(new CachedView(str, null));
        if (indexOf >= 0) {
            this.a.remove(indexOf);
            return this.a.get(indexOf).view;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(LoadListener loadListener) {
        Iterator<CachedView> it = this.a.iterator();
        while (it.hasNext()) {
            CachedView next = it.next();
            if (next.view != null && next.view.a() == loadListener) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class CachedView {
        public String url;
        public WebViewAd view;

        CachedView(String str, WebViewAd webViewAd) {
            this.url = str;
            this.view = webViewAd;
        }

        public boolean equals(Object obj) {
            if (obj instanceof CachedView) {
                return this.url.equals(((CachedView) obj).url);
            }
            return false;
        }
    }
}
