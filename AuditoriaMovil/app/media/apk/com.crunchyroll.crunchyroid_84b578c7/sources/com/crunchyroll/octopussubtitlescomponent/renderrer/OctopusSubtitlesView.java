package com.crunchyroll.octopussubtitlescomponent.renderrer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.g;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.i5.i0;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i9.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xi.d;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: OctopusSubtitlesView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/crunchyroll/octopussubtitlescomponent/renderrer/OctopusSubtitlesView;", "Landroid/widget/FrameLayout;", "Lcom/amazon/aps/iva/xi/d;", "Lcom/amazon/aps/iva/i5/o;", "", "f", "Z", "getScaleSubtitlesDown", "()Z", "setScaleSubtitlesDown", "(Z)V", "scaleSubtitlesDown", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "octopus-subtitles-component_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes.dex */
public final class OctopusSubtitlesView extends FrameLayout implements d, o {
    public static final /* synthetic */ int h = 0;
    public com.amazon.aps.iva.xi.c b;
    public final WebView c;
    public com.amazon.aps.iva.wi.b d;
    public boolean e;
    public boolean f;
    public final ArrayList g;

    /* compiled from: OctopusSubtitlesView.kt */
    /* loaded from: classes.dex */
    public static final class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            j.f(consoleMessage, "consoleMessage");
            if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                OctopusSubtitlesView.this.g.add(consoleMessage);
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* compiled from: OctopusSubtitlesView.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.a<q> {
        public b(com.amazon.aps.iva.xi.b bVar) {
            super(0, bVar, com.amazon.aps.iva.xi.b.class, "onOctopusLoaded", "onOctopusLoaded()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((com.amazon.aps.iva.xi.b) this.receiver).a();
            return q.a;
        }
    }

    /* compiled from: OctopusSubtitlesView.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            OctopusSubtitlesView octopusSubtitlesView = OctopusSubtitlesView.this;
            com.amazon.aps.iva.se0.i.d(x.O(octopusSubtitlesView), null, null, new com.crunchyroll.octopussubtitlescomponent.renderrer.a(octopusSubtitlesView, null), 3);
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OctopusSubtitlesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        this.g = new ArrayList();
        try {
            WebView webView = new WebView(context);
            this.c = webView;
            addView(webView);
        } catch (RuntimeException unused) {
            this.c = null;
        }
    }

    @Override // com.amazon.aps.iva.xi.d
    public final boolean B() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.xi.d
    public final void G(long j) {
        WebView webView = this.c;
        if (webView != null) {
            webView.loadUrl("javascript:" + ("setCurrentTime(" + TimeUnit.MILLISECONDS.toSeconds(j) + ");"));
        }
    }

    public final void Z() {
        ArrayList arrayList = this.g;
        if (!arrayList.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ConsoleMessage consoleMessage = (ConsoleMessage) it.next();
                Appendable append = stringBuffer.append((CharSequence) (consoleMessage.message() + " (" + consoleMessage.sourceId() + ':' + consoleMessage.lineNumber() + ')'));
                j.e(append, "append(value)");
                j.e(append.append('\n'), "append('\\n')");
            }
            com.amazon.aps.iva.wi.b bVar = this.d;
            if (bVar != null) {
                String stringBuffer2 = stringBuffer.toString();
                j.e(stringBuffer2, "errorMessage.toString()");
                bVar.c(stringBuffer2);
                arrayList.clear();
                return;
            }
            j.m("subtitlesRendererComponent");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.amazon.aps.iva.xi.d
    public final void g(String str) {
        j.f(str, "uri");
        WebView webView = this.c;
        if (webView != null) {
            String c2 = e.c(com.amazon.aps.iva.k.q.c("loadSubtitles(\"", str, "\", "), this.f, ");");
            webView.loadUrl("javascript:" + c2);
        }
        Z();
    }

    @Override // com.amazon.aps.iva.i5.o
    public g getLifecycle() {
        o a2 = i0.a(this);
        j.c(a2);
        return a2.getLifecycle();
    }

    public final boolean getScaleSubtitlesDown() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.xi.d
    public final void hide() {
        setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        super.onAttachedToWindow();
        o a2 = i0.a(this);
        if (a2 != null) {
            lifecycleCoroutineScopeImpl = x.O(a2);
        } else {
            lifecycleCoroutineScopeImpl = null;
        }
        j.c(lifecycleCoroutineScopeImpl);
        com.amazon.aps.iva.wi.b bVar = this.d;
        if (bVar != null) {
            com.amazon.aps.iva.xi.c cVar = new com.amazon.aps.iva.xi.c(this, lifecycleCoroutineScopeImpl, bVar);
            this.b = cVar;
            cVar.b();
            return;
        }
        j.m("subtitlesRendererComponent");
        throw null;
    }

    @Override // com.amazon.aps.iva.xi.d
    public final void r() {
        WebView webView = this.c;
        if (webView != null) {
            webView.loadUrl("javascript:dispose();");
        }
    }

    public final void setScaleSubtitlesDown(boolean z) {
        this.f = z;
    }

    @Override // com.amazon.aps.iva.xi.d
    public final void show() {
        setVisibility(0);
    }

    @Override // com.amazon.aps.iva.xi.d
    public final void y() {
        WebSettings webSettings;
        WebSettings webSettings2;
        WebSettings webSettings3;
        WebView webView = this.c;
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        if (webView != null) {
            webSettings = webView.getSettings();
        } else {
            webSettings = null;
        }
        if (webSettings != null) {
            webSettings.setJavaScriptEnabled(true);
        }
        if (webView != null) {
            webSettings2 = webView.getSettings();
        } else {
            webSettings2 = null;
        }
        if (webSettings2 != null) {
            webSettings2.setMediaPlaybackRequiresUserGesture(false);
        }
        if (webView != null) {
            webSettings3 = webView.getSettings();
        } else {
            webSettings3 = null;
        }
        if (webSettings3 != null) {
            webSettings3.setDomStorageEnabled(true);
        }
        if (webView != null) {
            webView.setWebChromeClient(new a());
        }
        if (webView != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.amazon.aps.iva.o3.c("/assets/", new f.a(getContext())));
            arrayList.add(new com.amazon.aps.iva.o3.c("/res/", new f.e(getContext())));
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getFilesDir());
            sb.append('/');
            arrayList.add(new com.amazon.aps.iva.o3.c(sb.toString(), new f.b(getContext(), getContext().getFilesDir())));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.o3.c cVar = (com.amazon.aps.iva.o3.c) it.next();
                arrayList2.add(new f.d((String) cVar.a, (f.c) cVar.b));
            }
            f fVar = new f(arrayList2);
            com.amazon.aps.iva.xi.c cVar2 = this.b;
            if (cVar2 != null) {
                webView.setWebViewClient(new com.amazon.aps.iva.xi.a(fVar, new b(cVar2)));
            } else {
                j.m("presenter");
                throw null;
            }
        }
        setLayerType(2, null);
        setBackgroundColor(0);
        WebView.setWebContentsDebuggingEnabled(this.e);
        if (webView != null) {
            com.amazon.aps.iva.wi.b bVar = this.d;
            if (bVar != null) {
                webView.addJavascriptInterface(new com.amazon.aps.iva.xi.e(bVar, this.e, new c()), "Android");
            } else {
                j.m("subtitlesRendererComponent");
                throw null;
            }
        }
        if (webView != null) {
            webView.loadUrl("https://appassets.androidplatform.net/assets/index.html");
        }
    }
}
