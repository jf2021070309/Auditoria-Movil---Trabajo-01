package com.fyber.inneractive.sdk.d;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.m.a;
import com.fyber.inneractive.sdk.m.d;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class e extends b<com.fyber.inneractive.sdk.j.f, m> {
    a.b g = new a.b() { // from class: com.fyber.inneractive.sdk.d.e.1
        @Override // com.fyber.inneractive.sdk.m.a.b
        public final void a(com.fyber.inneractive.sdk.m.a aVar) {
            IAlog.b("%sweb view returned onReady!", IAlog.a(e.this));
            UnitDisplayType unitDisplayType = e.this.b != 0 ? ((com.fyber.inneractive.sdk.j.f) e.this.b).r : null;
            if (unitDisplayType != null && unitDisplayType.isFullscreenUnit()) {
                e.a(e.this);
            }
            e.this.h();
        }

        @Override // com.fyber.inneractive.sdk.m.a.b
        public final void a(InneractiveErrorCode inneractiveErrorCode) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            e.this.a((InneractiveError) inneractiveInfrastructureError);
            IAlog.b("%sweb view returned onFailedLoading!", IAlog.a(e.this));
            e.this.a(inneractiveInfrastructureError);
            if (inneractiveErrorCode == InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED) {
                new n.a(com.fyber.inneractive.sdk.h.l.MRAID_ERROR_UNSECURE_CONTENT, e.this.a, e.this.b, e.this.e.b()).b(null);
            }
        }
    };
    private IAmraidWebViewController h;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.b
    public final String b() {
        return "send_failed_display_creatives";
    }

    @Override // com.fyber.inneractive.sdk.d.b
    public final void a() {
        int i;
        String str;
        String str2;
        this.c = new m(g(), this.e);
        ((m) this.c).a((m) this.b);
        ((m) this.c).k = this.f;
        UnitDisplayType unitDisplayType = ((com.fyber.inneractive.sdk.j.f) this.b).r;
        d.EnumC0045d enumC0045d = d.EnumC0045d.INLINE;
        if (unitDisplayType == null) {
            this.g.a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
            return;
        }
        int i2 = AnonymousClass2.a[unitDisplayType.ordinal()];
        boolean z = false;
        if (i2 == 1 || i2 == 2) {
            i = d.a.a;
            if (this.a == null || this.a.getAllowFullscreen()) {
                enumC0045d = d.EnumC0045d.INTERSTITIAL;
            }
        } else {
            i = d.a.a;
        }
        try {
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(com.fyber.inneractive.sdk.util.l.p(), com.fyber.inneractive.sdk.util.e.a(unitDisplayType, IAConfigManager.c().a), enumC0045d, i, d.e.c, !((com.fyber.inneractive.sdk.j.f) this.b).a.contains("iaNotifyLoadFinished"));
            this.h = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.c);
            this.h.setAdRequest(this.a);
            if (this.a != null && this.a.getSelectedUnitConfig() != null && this.a.getSelectedUnitConfig().h() != null) {
                this.h.setMuteMraidVideo(((m) this.c).k() && this.a.getSelectedUnitConfig().h().a() != UnitDisplayType.REWARDED);
            }
            ((m) this.c).a = this.h;
            if (this.b != 0) {
                UnitDisplayType unitDisplayType2 = ((com.fyber.inneractive.sdk.j.f) this.b).r;
                if (this.a == null || this.a.getAllowFullscreen()) {
                    z = true;
                }
                String a = a(unitDisplayType2, z);
                str2 = a(unitDisplayType2);
                str = a;
            } else {
                str = "";
                str2 = str;
            }
            this.h.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit());
            this.h.a(com.fyber.inneractive.sdk.config.a.b(), "" + ((com.fyber.inneractive.sdk.j.f) this.b).a, str, str2, this.g, TimeUnit.SECONDS.toMillis(IAConfigManager.f().a.a.a("DisplayAdLoadTimeOutInSeconds", 10, 3)));
        } catch (Throwable th) {
            a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th));
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.d.e$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.d.b, com.fyber.inneractive.sdk.e.a
    public final void e() {
        IAmraidWebViewController iAmraidWebViewController;
        if (this.c != 0 && (iAmraidWebViewController = this.h) != null) {
            iAmraidWebViewController.c();
            this.h = null;
        }
        super.e();
    }

    public static String a(UnitDisplayType unitDisplayType, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (unitDisplayType != null && unitDisplayType.isFullscreenUnit() && !z) {
            sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
        }
        return sb.toString();
    }

    public static String a(UnitDisplayType unitDisplayType) {
        StringBuilder sb = new StringBuilder();
        if (unitDisplayType != null && !unitDisplayType.isFullscreenUnit()) {
            if (unitDisplayType == UnitDisplayType.BANNER) {
                sb.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
            } else {
                sb.append(" #iawrapper { position:unset !important; display: unset !important; }");
            }
        }
        return sb.toString();
    }

    static /* synthetic */ void a(e eVar) {
        try {
            new n.a(com.fyber.inneractive.sdk.h.m.EVENT_READY_ON_CLIENT, eVar.a, eVar.c != 0 ? ((m) eVar.c).f() : null).b(null);
        } catch (Exception unused) {
        }
    }
}
