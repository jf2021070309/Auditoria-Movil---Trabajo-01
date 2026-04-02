package com.braze.models.inappmessage;

import android.graphics.Color;
import bo.app.p1;
import bo.app.r1;
import bo.app.t2;
import bo.app.v2;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001DB\t\b\u0014¢\u0006\u0004\b;\u0010<B\u0019\b\u0016\u0012\u0006\u0010=\u001a\u00020\n\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b;\u0010@BI\b\u0012\u0012\u0006\u0010=\u001a\u00020\n\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u0010A\u001a\u000201¢\u0006\u0004\b;\u0010BJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\u0018¨\u0006E"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageImmersiveBase;", "Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "Lcom/braze/models/inappmessage/MessageButton;", "messageButton", "", "logButtonClick", "Lcom/amazon/aps/iva/kb0/q;", "onAfterClosed", "enableDarkTheme", "Lcom/amazon/aps/iva/if0/c;", "forJsonPut", "", "headerTextColor", "I", "getHeaderTextColor", "()I", "setHeaderTextColor", "(I)V", "closeButtonColor", "getCloseButtonColor", "setCloseButtonColor", "", "header", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "setHeader", "(Ljava/lang/String;)V", "", "messageButtons", "Ljava/util/List;", "getMessageButtons", "()Ljava/util/List;", "setMessageButtons", "(Ljava/util/List;)V", "Lcom/braze/enums/inappmessage/ImageStyle;", "imageStyle", "Lcom/braze/enums/inappmessage/ImageStyle;", "getImageStyle", "()Lcom/braze/enums/inappmessage/ImageStyle;", "setImageStyle", "(Lcom/braze/enums/inappmessage/ImageStyle;)V", "frameColor", "Ljava/lang/Integer;", "getFrameColor", "()Ljava/lang/Integer;", "setFrameColor", "(Ljava/lang/Integer;)V", "Lcom/braze/enums/inappmessage/TextAlign;", "headerTextAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "getHeaderTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setHeaderTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "wasButtonClickLogged", "Z", "buttonIdClicked", "<init>", "()V", "jsonObject", "Lbo/app/r1;", "brazeManager", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;)V", "messageTextAlign", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;Ljava/lang/String;IILcom/braze/enums/inappmessage/ImageStyle;Lcom/braze/enums/inappmessage/TextAlign;Lcom/braze/enums/inappmessage/TextAlign;)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class InAppMessageImmersiveBase extends InAppMessageWithImageBase implements IInAppMessageImmersive {
    public static final a Companion = new a(null);
    private String buttonIdClicked;
    private int closeButtonColor;
    private Integer frameColor;
    private String header;
    private TextAlign headerTextAlign;
    private int headerTextColor;
    private ImageStyle imageStyle;
    private List<? extends MessageButton> messageButtons;
    private boolean wasButtonClickLogged;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
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
            return "Cannot apply dark theme with a null themes wrapper";
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
            return "Trigger id not found (this is expected for test sends). Not logging button click.";
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
            return "Button click already logged for this message. Ignoring.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot log a button click because the BrazeManager is null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.f(i) instanceof com.amazon.aps.iva.if0.c);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Object a(int i) {
            return (com.amazon.aps.iva.if0.c) this.b.get(i);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public InAppMessageImmersiveBase() {
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = z.b;
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        v2 inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
            return;
        }
        if (inAppMessageDarkThemeWrapper.c() != null) {
            setFrameColor(inAppMessageDarkThemeWrapper.c());
        }
        if (inAppMessageDarkThemeWrapper.b() != null) {
            setCloseButtonColor(inAppMessageDarkThemeWrapper.b().intValue());
        }
        if (inAppMessageDarkThemeWrapper.d() != null) {
            setHeaderTextColor(inAppMessageDarkThemeWrapper.d().intValue());
        }
        for (MessageButton messageButton : getMessageButtons()) {
            messageButton.enableDarkTheme();
        }
    }

    public int getCloseButtonColor() {
        return this.closeButtonColor;
    }

    public Integer getFrameColor() {
        return this.frameColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public String getHeader() {
        return this.header;
    }

    public TextAlign getHeaderTextAlign() {
        return this.headerTextAlign;
    }

    public int getHeaderTextColor() {
        return this.headerTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public List<MessageButton> getMessageButtons() {
        return this.messageButtons;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public boolean logButtonClick(MessageButton messageButton) {
        boolean z;
        j.f(messageButton, "messageButton");
        r1 brazeManager = getBrazeManager();
        String triggerId = getTriggerId();
        if (triggerId != null && !m.b0(triggerId)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
            return false;
        } else if (this.wasButtonClickLogged) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, d.b, 2, (Object) null);
            return false;
        } else if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, e.b, 2, (Object) null);
            return false;
        } else {
            this.buttonIdClicked = messageButton.getStringId();
            p1 a2 = bo.app.j.h.a(triggerId, messageButton);
            if (a2 != null) {
                brazeManager.a(a2);
            }
            this.wasButtonClickLogged = true;
            return true;
        }
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        boolean z;
        super.onAfterClosed();
        r1 brazeManager = getBrazeManager();
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
                if (!z2 && brazeManager != null) {
                    brazeManager.a(new t2(getTriggerId(), this.buttonIdClicked));
                }
            }
        }
    }

    public void setCloseButtonColor(int i) {
        this.closeButtonColor = i;
    }

    public void setFrameColor(Integer num) {
        this.frameColor = num;
    }

    public void setHeader(String str) {
        this.header = str;
    }

    public void setHeaderTextAlign(TextAlign textAlign) {
        j.f(textAlign, "<set-?>");
        this.headerTextAlign = textAlign;
    }

    public void setHeaderTextColor(int i) {
        this.headerTextColor = i;
    }

    public void setImageStyle(ImageStyle imageStyle) {
        j.f(imageStyle, "<set-?>");
        this.imageStyle = imageStyle;
    }

    public void setMessageButtons(List<? extends MessageButton> list) {
        j.f(list, "<set-?>");
        this.messageButtons = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public com.amazon.aps.iva.if0.c forJsonPut() {
        com.amazon.aps.iva.if0.c jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        com.amazon.aps.iva.if0.c forJsonPut = super.forJsonPut();
        try {
            forJsonPut.putOpt("header", getHeader());
            forJsonPut.put("header_text_color", getHeaderTextColor());
            forJsonPut.put("close_btn_color", getCloseButtonColor());
            forJsonPut.putOpt("image_style", getImageStyle().toString());
            forJsonPut.putOpt("text_align_header", getHeaderTextAlign().toString());
            Integer frameColor = getFrameColor();
            if (frameColor != null) {
                forJsonPut.put("frame_color", frameColor.intValue());
            }
            com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
            for (MessageButton messageButton : getMessageButtons()) {
                aVar.put(messageButton.forJsonPut());
            }
            forJsonPut.put("btns", aVar);
        } catch (com.amazon.aps.iva.if0.b unused) {
        }
        return forJsonPut;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InAppMessageImmersiveBase(com.amazon.aps.iva.if0.c r17, bo.app.r1 r18) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.models.inappmessage.InAppMessageImmersiveBase.<init>(com.amazon.aps.iva.if0.c, bo.app.r1):void");
    }

    private InAppMessageImmersiveBase(com.amazon.aps.iva.if0.c cVar, r1 r1Var, String str, int i, int i2, ImageStyle imageStyle, TextAlign textAlign, TextAlign textAlign2) {
        super(cVar, r1Var);
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = z.b;
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
        setHeader(str);
        setHeaderTextColor(i);
        setCloseButtonColor(i2);
        if (cVar.has("frame_color")) {
            setFrameColor(Integer.valueOf(cVar.optInt("frame_color")));
        }
        setImageStyle(imageStyle);
        setHeaderTextAlign(textAlign);
        setMessageTextAlign(textAlign2);
    }
}
