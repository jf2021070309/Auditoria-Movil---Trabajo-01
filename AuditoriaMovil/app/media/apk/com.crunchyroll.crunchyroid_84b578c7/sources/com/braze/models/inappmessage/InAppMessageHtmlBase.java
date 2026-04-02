package com.braze.models.inappmessage;

import bo.app.p1;
import bo.app.r1;
import bo.app.t2;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.inappmessage.MessageType;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.Metadata;
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0015\u0010\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageHtmlBase;", "Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "", "", "remotePathToLocalAssetMap", "Lcom/amazon/aps/iva/kb0/q;", "setLocalPrefetchedAssetPaths", "buttonId", "", "logButtonClick", "onAfterClosed", "localAssetsDirectoryUrl", "Ljava/lang/String;", "getLocalAssetsDirectoryUrl", "()Ljava/lang/String;", "setLocalAssetsDirectoryUrl", "(Ljava/lang/String;)V", "wasButtonClickLogged", "Z", "buttonIdClicked", "<init>", "()V", "Lcom/amazon/aps/iva/if0/c;", "jsonObject", "Lbo/app/r1;", "brazeManager", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class InAppMessageHtmlBase extends InAppMessageBase implements IInAppMessageHtml {
    private String buttonIdClicked;
    private String localAssetsDirectoryUrl;
    private boolean wasButtonClickLogged;

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging html in-app message button click for id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Button Id was null or blank for this html in-app message. Ignoring.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Button click already logged for this html in-app message. Ignoring.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an html in-app message button click because the BrazeManager is null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Logged button click for button id: " + this.b + " and trigger id: " + this.c;
        }
    }

    public InAppMessageHtmlBase() {
        setOpenUriInWebView(true);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public String getLocalAssetsDirectoryUrl() {
        return this.localAssetsDirectoryUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public boolean logButtonClick(String str) {
        boolean z;
        j.f(str, "buttonId");
        String triggerId = getTriggerId();
        r1 brazeManager = getBrazeManager();
        if (triggerId != null && triggerId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(str), 3, (Object) null);
            return false;
        } else if (m.b0(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, b.b, 2, (Object) null);
            return false;
        } else if (this.wasButtonClickLogged && getMessageType() != MessageType.HTML) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
            return false;
        } else if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, d.b, 2, (Object) null);
            return false;
        } else {
            p1 d2 = bo.app.j.h.d(triggerId, str);
            if (d2 != null) {
                brazeManager.a(d2);
            }
            this.buttonIdClicked = str;
            this.wasButtonClickLogged = true;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(str, triggerId), 3, (Object) null);
            return true;
        }
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        boolean z;
        r1 brazeManager;
        super.onAfterClosed();
        if (this.wasButtonClickLogged) {
            String triggerId = getTriggerId();
            boolean z2 = false;
            if (triggerId != null && !m.b0(triggerId)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                String str = this.buttonIdClicked;
                if (str == null || m.b0(str)) {
                    z2 = true;
                }
                if (!z2 && (brazeManager = getBrazeManager()) != null) {
                    brazeManager.a(new t2(getTriggerId(), this.buttonIdClicked));
                }
            }
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public void setLocalAssetsDirectoryUrl(String str) {
        this.localAssetsDirectoryUrl = str;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
        j.f(map, "remotePathToLocalAssetMap");
        if (!map.isEmpty()) {
            setLocalAssetsDirectoryUrl(((String[]) map.values().toArray(new String[0]))[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtmlBase(com.amazon.aps.iva.if0.c cVar, r1 r1Var) {
        super(cVar, r1Var, false, false, 12, null);
        j.f(cVar, "jsonObject");
        j.f(r1Var, "brazeManager");
        setOpenUriInWebView(cVar.optBoolean("use_webview", true));
    }
}
