package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.p1;
import bo.app.r1;
import bo.app.t2;
import bo.app.v2;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oe0.m;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b'\u0018\u0000 \u0091\u00012\u00020\u00012\u00020\u0002:\u0002\u0092\u0001B\n\b\u0010¢\u0006\u0005\b\u008e\u0001\u0010'B0\b\u0017\u0012\u0007\u0010\u008f\u0001\u001a\u00020\u000f\u0012\u0006\u0010x\u001a\u00020w\u0012\b\b\u0002\u0010n\u001a\u00020\u0003\u0012\b\b\u0002\u0010p\u001a\u00020\u0003¢\u0006\u0006\b\u008e\u0001\u0010\u0090\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR(\u0010 \u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b&\u0010'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u0010.\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b.\u0010!\u0012\u0004\b1\u0010'\u001a\u0004\b/\u0010#\"\u0004\b0\u0010%R(\u00102\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b2\u0010!\u0012\u0004\b5\u0010'\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%R\"\u00107\u001a\u0002068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010?\u001a\u00020=2\u0006\u0010>\u001a\u00020=8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010T\u001a\u00020S8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010[\u001a\u00020Z8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010a\u001a\u00020=8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\ba\u0010@\u001a\u0004\bb\u0010B\"\u0004\bc\u0010DR\"\u0010d\u001a\u00020=8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bd\u0010@\u001a\u0004\be\u0010B\"\u0004\bf\u0010DR\"\u0010g\u001a\u00020=8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bg\u0010@\u001a\u0004\bh\u0010B\"\u0004\bi\u0010DR\"\u0010j\u001a\u00020=8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bj\u0010@\u001a\u0004\bk\u0010B\"\u0004\bl\u0010DR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010oR$\u0010q\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010x\u001a\u0004\u0018\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R)\u0010\u007f\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u008b\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010#R\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010\n8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\u001a¨\u0006\u0093\u0001"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/models/inappmessage/IInAppMessageThemeable;", "", "logImpression", "logClick", "Lcom/amazon/aps/iva/kb0/q;", "onAfterClosed", "enableDarkTheme", "", "", "getRemoteAssetPathsForPrefetch", "", "remotePathToLocalAssetMap", "setLocalPrefetchedAssetPaths", "Lcom/amazon/aps/iva/if0/c;", "forJsonPut", "Lcom/braze/enums/inappmessage/ClickAction;", "internalClickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "Landroid/net/Uri;", "internalUri", "Landroid/net/Uri;", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "openUriInWebView", "Z", "getOpenUriInWebView", "()Z", "setOpenUriInWebView", "(Z)V", "getOpenUriInWebView$annotations", "()V", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "setExtras", "(Ljava/util/Map;)V", "animateIn", "getAnimateIn", "setAnimateIn", "getAnimateIn$annotations", "animateOut", "getAnimateOut", "setAnimateOut", "getAnimateOut$annotations", "Lcom/braze/enums/inappmessage/DismissType;", "dismissType", "Lcom/braze/enums/inappmessage/DismissType;", "getDismissType", "()Lcom/braze/enums/inappmessage/DismissType;", "setDismissType", "(Lcom/braze/enums/inappmessage/DismissType;)V", "", "value", "durationInMilliseconds", "I", "getDurationInMilliseconds", "()I", "setDurationInMilliseconds", "(I)V", "Lcom/braze/enums/inappmessage/Orientation;", "orientation", "Lcom/braze/enums/inappmessage/Orientation;", "getOrientation", "()Lcom/braze/enums/inappmessage/Orientation;", "setOrientation", "(Lcom/braze/enums/inappmessage/Orientation;)V", "Lcom/braze/enums/inappmessage/CropType;", "cropType", "Lcom/braze/enums/inappmessage/CropType;", "getCropType", "()Lcom/braze/enums/inappmessage/CropType;", "setCropType", "(Lcom/braze/enums/inappmessage/CropType;)V", "Lcom/braze/enums/inappmessage/TextAlign;", "messageTextAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "getMessageTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setMessageTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "", "expirationTimestamp", "J", "getExpirationTimestamp", "()J", "setExpirationTimestamp", "(J)V", "iconBackgroundColor", "getIconBackgroundColor", "setIconBackgroundColor", "messageTextColor", "getMessageTextColor", "setMessageTextColor", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "iconColor", "getIconColor", "setIconColor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "impressionLogged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "clickLogged", "jsonObject", "Lcom/amazon/aps/iva/if0/c;", "getJsonObject", "()Lcom/amazon/aps/iva/if0/c;", "setJsonObject", "(Lcom/amazon/aps/iva/if0/c;)V", "Lbo/app/r1;", "brazeManager", "Lbo/app/r1;", "getBrazeManager", "()Lbo/app/r1;", "setBrazeManager", "(Lbo/app/r1;)V", "Lbo/app/v2;", "inAppMessageDarkThemeWrapper", "Lbo/app/v2;", "getInAppMessageDarkThemeWrapper", "()Lbo/app/v2;", "setInAppMessageDarkThemeWrapper", "(Lbo/app/v2;)V", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "getUri", "()Landroid/net/Uri;", "uri", "isControl", "getTriggerId", "triggerId", "<init>", "json", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;ZZ)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class InAppMessageBase implements IInAppMessage, IInAppMessageThemeable {
    public static final a Companion = new a(null);
    private boolean animateIn;
    private boolean animateOut;
    private int backgroundColor;
    private r1 brazeManager;
    private final AtomicBoolean clickLogged;
    private CropType cropType;
    private DismissType dismissType;
    private int durationInMilliseconds;
    private long expirationTimestamp;
    private Map<String, String> extras;
    private String icon;
    private int iconBackgroundColor;
    private int iconColor;
    private final AtomicBoolean impressionLogged;
    private v2 inAppMessageDarkThemeWrapper;
    private ClickAction internalClickAction;
    private Uri internalUri;
    private com.amazon.aps.iva.if0.c jsonObject;
    private String message;
    private TextAlign messageTextAlign;
    private int messageTextColor;
    private boolean openUriInWebView;
    private Orientation orientation;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.b = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.e.f(new StringBuilder("Requested in-app message duration "), this.b, " is lower than the minimum of 999. Defaulting to 5000 milliseconds.");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.b = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.e.f(new StringBuilder("Set in-app message duration to "), this.b, " milliseconds.");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to construct json for in-app message";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final f b = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message click.";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final g b = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message click because the BrazeManager is null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final h b = new h();

        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Click already logged for this in-app message. Ignoring.";
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final i b = new i();

        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Logging click on in-app message";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final j b = new j();

        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message impression.";
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final k b = new k();

        public k() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message impression because the BrazeManager is null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final l b = new l();

        public l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Impression already logged for this in-app message. Ignoring.";
        }
    }

    public InAppMessageBase() {
        this.internalClickAction = ClickAction.NONE;
        this.extras = a0.b;
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = 5000;
        this.orientation = Orientation.ANY;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        v2 v2Var = this.inAppMessageDarkThemeWrapper;
        if (v2Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
            return;
        }
        if (v2Var.a() != null) {
            setBackgroundColor(v2Var.a().intValue());
        }
        if (v2Var.f() != null) {
            setIconColor(v2Var.f().intValue());
        }
        if (v2Var.e() != null) {
            setIconBackgroundColor(v2Var.e().intValue());
        }
        if (v2Var.g() != null) {
            setMessageTextColor(v2Var.g().intValue());
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateIn() {
        return this.animateIn;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateOut() {
        return this.animateOut;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final r1 getBrazeManager() {
        return this.brazeManager;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public ClickAction getClickAction() {
        return this.internalClickAction;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public CropType getCropType() {
        return this.cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public DismissType getDismissType() {
        return this.dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getDurationInMilliseconds() {
        return this.durationInMilliseconds;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Map<String, String> getExtras() {
        return this.extras;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getIcon() {
        return this.icon;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconColor() {
        return this.iconColor;
    }

    public final v2 getInAppMessageDarkThemeWrapper() {
        return this.inAppMessageDarkThemeWrapper;
    }

    public final com.amazon.aps.iva.if0.c getJsonObject() {
        return this.jsonObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getMessage() {
        return this.message;
    }

    public TextAlign getMessageTextAlign() {
        return this.messageTextAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getMessageTextColor() {
        return this.messageTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return z.b;
    }

    public final String getTriggerId() {
        com.amazon.aps.iva.if0.c cVar = this.jsonObject;
        if (cVar != null) {
            return cVar.optString("trigger_id");
        }
        return null;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Uri getUri() {
        return this.internalUri;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean isControl() {
        com.amazon.aps.iva.if0.c cVar = this.jsonObject;
        if (cVar != null && cVar.optBoolean("is_control")) {
            return true;
        }
        return false;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logClick() {
        boolean z;
        String triggerId = getTriggerId();
        if (triggerId != null && !m.b0(triggerId)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f.b, 3, (Object) null);
            return false;
        }
        r1 r1Var = this.brazeManager;
        if (r1Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, g.b, 2, (Object) null);
            return false;
        } else if (this.clickLogged.get() && getMessageType() != MessageType.HTML) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, h.b, 2, (Object) null);
            return false;
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, i.b, 2, (Object) null);
            p1 g2 = bo.app.j.h.g(triggerId);
            if (g2 != null) {
                r1Var.a(g2);
            }
            this.clickLogged.set(true);
            return true;
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        boolean z;
        String triggerId = getTriggerId();
        if (triggerId != null && !m.b0(triggerId)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.D, (Throwable) null, j.b, 2, (Object) null);
            return false;
        }
        r1 r1Var = this.brazeManager;
        if (r1Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, k.b, 2, (Object) null);
            return false;
        } else if (this.impressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, l.b, 2, (Object) null);
            return false;
        } else {
            p1 i2 = bo.app.j.h.i(triggerId);
            if (i2 != null) {
                r1Var.a(i2);
            }
            this.impressionLogged.set(true);
            return true;
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        boolean z;
        r1 r1Var;
        String triggerId = getTriggerId();
        if (this.clickLogged.get()) {
            if (triggerId != null && triggerId.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z && (r1Var = this.brazeManager) != null) {
                r1Var.a(new t2(triggerId));
            }
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateIn(boolean z) {
        this.animateIn = z;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateOut(boolean z) {
        this.animateOut = z;
    }

    public void setBackgroundColor(int i2) {
        this.backgroundColor = i2;
    }

    public void setCropType(CropType cropType) {
        com.amazon.aps.iva.yb0.j.f(cropType, "<set-?>");
        this.cropType = cropType;
    }

    public void setDismissType(DismissType dismissType) {
        com.amazon.aps.iva.yb0.j.f(dismissType, "<set-?>");
        this.dismissType = dismissType;
    }

    public void setDurationInMilliseconds(int i2) {
        if (i2 < 999) {
            this.durationInMilliseconds = 5000;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(i2), 3, (Object) null);
            return;
        }
        this.durationInMilliseconds = i2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(i2), 3, (Object) null);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExpirationTimestamp(long j2) {
        this.expirationTimestamp = j2;
    }

    public void setExtras(Map<String, String> map) {
        com.amazon.aps.iva.yb0.j.f(map, "<set-?>");
        this.extras = map;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIconBackgroundColor(int i2) {
        this.iconBackgroundColor = i2;
    }

    public void setIconColor(int i2) {
        this.iconColor = i2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
        com.amazon.aps.iva.yb0.j.f(map, "remotePathToLocalAssetMap");
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        com.amazon.aps.iva.yb0.j.f(textAlign, "<set-?>");
        this.messageTextAlign = textAlign;
    }

    public void setMessageTextColor(int i2) {
        this.messageTextColor = i2;
    }

    public void setOpenUriInWebView(boolean z) {
        this.openUriInWebView = z;
    }

    public void setOrientation(Orientation orientation) {
        com.amazon.aps.iva.yb0.j.f(orientation, "<set-?>");
        this.orientation = orientation;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.IPutIntoJson
    public com.amazon.aps.iva.if0.c forJsonPut() {
        com.amazon.aps.iva.if0.c cVar = this.jsonObject;
        if (cVar != null) {
            return cVar;
        }
        com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
        try {
            cVar2.putOpt("message", getMessage());
            cVar2.put("duration", getDurationInMilliseconds());
            cVar2.putOpt("trigger_id", getTriggerId());
            cVar2.putOpt("click_action", getClickAction().toString());
            cVar2.putOpt("message_close", getDismissType().toString());
            if (getUri() != null) {
                cVar2.put("uri", String.valueOf(getUri()));
            }
            cVar2.put("use_webview", getOpenUriInWebView());
            cVar2.put("animate_in", getAnimateIn());
            cVar2.put("animate_out", getAnimateOut());
            cVar2.put("bg_color", getBackgroundColor());
            cVar2.put("text_color", getMessageTextColor());
            cVar2.put("icon_color", getIconColor());
            cVar2.put("icon_bg_color", getIconBackgroundColor());
            cVar2.putOpt("icon", getIcon());
            cVar2.putOpt("crop_type", getCropType().toString());
            cVar2.putOpt("orientation", getOrientation().toString());
            cVar2.putOpt("text_align_message", getMessageTextAlign().toString());
            cVar2.putOpt("is_control", Boolean.valueOf(isControl()));
            if (!getExtras().isEmpty()) {
                cVar2.put("extras", (Object) getExtras());
            }
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
        }
        return cVar2;
    }

    public /* synthetic */ InAppMessageBase(com.amazon.aps.iva.if0.c cVar, r1 r1Var, boolean z, boolean z2, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(cVar, r1Var, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }

    public InAppMessageBase(com.amazon.aps.iva.if0.c cVar, r1 r1Var, boolean z, boolean z2) {
        String upperCase;
        DismissType[] values;
        String upperCase2;
        ClickAction[] values2;
        int i2;
        String upperCase3;
        Orientation[] values3;
        int i3;
        com.amazon.aps.iva.yb0.j.f(cVar, "json");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        this.internalClickAction = ClickAction.NONE;
        this.extras = a0.b;
        boolean z3 = true;
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = 5000;
        Orientation orientation = Orientation.ANY;
        this.orientation = orientation;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
        this.jsonObject = cVar;
        this.brazeManager = r1Var;
        setMessage(cVar.optString("message"));
        setAnimateIn(cVar.optBoolean("animate_in", true));
        setAnimateOut(cVar.optBoolean("animate_out", true));
        setDurationInMilliseconds(cVar.optInt("duration"));
        setIcon(cVar.optString("icon"));
        try {
            com.braze.support.c cVar2 = com.braze.support.c.a;
            String string = cVar.getString("orientation");
            com.amazon.aps.iva.yb0.j.e(string, "jsonObject.getString(key)");
            Locale locale = Locale.US;
            com.amazon.aps.iva.yb0.j.e(locale, "US");
            upperCase3 = string.toUpperCase(locale);
            com.amazon.aps.iva.yb0.j.e(upperCase3, "this as java.lang.String).toUpperCase(locale)");
        } catch (Exception unused) {
        }
        for (Orientation orientation2 : Orientation.values()) {
            if (com.amazon.aps.iva.yb0.j.a(orientation2.name(), upperCase3)) {
                orientation = orientation2;
                setOrientation(orientation);
                setOpenUriInWebView(cVar.optBoolean("use_webview", false));
                setIconBackgroundColor(cVar.optInt("icon_bg_color"));
                setMessageTextColor(cVar.optInt("text_color"));
                setBackgroundColor(cVar.optInt("bg_color"));
                setIconColor(cVar.optInt("icon_color"));
                this.impressionLogged.set(z);
                this.clickLogged.set(z2);
                setExtras(JsonUtils.convertJSONObjectToMap(cVar.optJSONObject("extras")));
                String optString = cVar.optString("uri");
                ClickAction clickAction = ClickAction.NONE;
                try {
                    com.braze.support.c cVar3 = com.braze.support.c.a;
                    String string2 = cVar.getString("click_action");
                    com.amazon.aps.iva.yb0.j.e(string2, "jsonObject.getString(key)");
                    Locale locale2 = Locale.US;
                    com.amazon.aps.iva.yb0.j.e(locale2, "US");
                    upperCase2 = string2.toUpperCase(locale2);
                    com.amazon.aps.iva.yb0.j.e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                } catch (Exception unused2) {
                }
                for (ClickAction clickAction2 : ClickAction.values()) {
                    if (com.amazon.aps.iva.yb0.j.a(clickAction2.name(), upperCase2)) {
                        clickAction = clickAction2;
                        if (clickAction == ClickAction.URI) {
                            if (optString != null && !m.b0(optString)) {
                                z3 = false;
                            }
                            if (!z3) {
                                this.internalUri = Uri.parse(optString);
                            }
                        }
                        this.internalClickAction = clickAction;
                        DismissType dismissType = DismissType.AUTO_DISMISS;
                        try {
                            com.braze.support.c cVar4 = com.braze.support.c.a;
                            String string3 = cVar.getString("message_close");
                            com.amazon.aps.iva.yb0.j.e(string3, "jsonObject.getString(key)");
                            Locale locale3 = Locale.US;
                            com.amazon.aps.iva.yb0.j.e(locale3, "US");
                            upperCase = string3.toUpperCase(locale3);
                            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
                        } catch (Exception unused3) {
                        }
                        for (DismissType dismissType2 : DismissType.values()) {
                            if (com.amazon.aps.iva.yb0.j.a(dismissType2.name(), upperCase)) {
                                dismissType = dismissType2;
                                setDismissType(dismissType == DismissType.SWIPE ? DismissType.MANUAL : dismissType);
                                this.inAppMessageDarkThemeWrapper = com.braze.support.h.a(cVar);
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
