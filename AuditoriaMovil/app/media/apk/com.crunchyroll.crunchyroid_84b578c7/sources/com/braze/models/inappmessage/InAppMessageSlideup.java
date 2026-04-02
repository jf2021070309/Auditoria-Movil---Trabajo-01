package com.braze.models.inappmessage;

import android.graphics.Color;
import bo.app.r1;
import bo.app.v2;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.Metadata;
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0019\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0018\u0010\u001dB+\b\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageSlideup;", "Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "Lcom/amazon/aps/iva/kb0/q;", "enableDarkTheme", "Lcom/amazon/aps/iva/if0/c;", "forJsonPut", "Lcom/braze/enums/inappmessage/SlideFrom;", "slideFrom", "Lcom/braze/enums/inappmessage/SlideFrom;", "getSlideFrom", "()Lcom/braze/enums/inappmessage/SlideFrom;", "setSlideFrom", "(Lcom/braze/enums/inappmessage/SlideFrom;)V", "", "chevronColor", "I", "getChevronColor", "()I", "setChevronColor", "(I)V", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "<init>", "()V", "jsonObject", "Lbo/app/r1;", "brazeManager", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;)V", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;Lcom/braze/enums/inappmessage/SlideFrom;I)V", "Companion", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InAppMessageSlideup extends InAppMessageWithImageBase {
    public static final Companion Companion = new Companion(null);
    private int chevronColor;
    private SlideFrom slideFrom;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageSlideup$Companion;", "", "()V", "CHEVRON_COLOR", "", "SLIDE_FROM", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
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
            return "Error creating JSON.";
        }
    }

    public InAppMessageSlideup() {
        this.slideFrom = SlideFrom.BOTTOM;
        this.chevronColor = Color.parseColor("#9B9B9B");
        setMessageTextAlign(TextAlign.START);
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        v2 inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.D, (Throwable) null, a.b, 2, (Object) null);
            return;
        }
        Integer b2 = inAppMessageDarkThemeWrapper.b();
        if ((b2 == null || b2.intValue() != -1) && inAppMessageDarkThemeWrapper.b() != null) {
            this.chevronColor = inAppMessageDarkThemeWrapper.b().intValue();
        }
    }

    public final int getChevronColor() {
        return this.chevronColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.SLIDEUP;
    }

    public final SlideFrom getSlideFrom() {
        return this.slideFrom;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public c forJsonPut() {
        c jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        c forJsonPut = super.forJsonPut();
        try {
            forJsonPut.put("slide_from", this.slideFrom.toString());
            forJsonPut.put("close_btn_color", this.chevronColor);
            forJsonPut.put("type", getMessageType().name());
        } catch (com.amazon.aps.iva.if0.b e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
        }
        return forJsonPut;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageSlideup(c cVar, r1 r1Var) {
        this(cVar, r1Var, (SlideFrom) JsonUtils.optEnum(cVar, "slide_from", SlideFrom.class, SlideFrom.BOTTOM), cVar.optInt("close_btn_color"));
        j.f(cVar, "jsonObject");
        j.f(r1Var, "brazeManager");
    }

    private InAppMessageSlideup(c cVar, r1 r1Var, SlideFrom slideFrom, int i) {
        super(cVar, r1Var);
        this.slideFrom = SlideFrom.BOTTOM;
        this.chevronColor = Color.parseColor("#9B9B9B");
        if (slideFrom != null) {
            this.slideFrom = slideFrom;
        }
        this.chevronColor = i;
        setCropType((CropType) JsonUtils.optEnum(cVar, "crop_type", CropType.class, CropType.FIT_CENTER));
        setMessageTextAlign((TextAlign) JsonUtils.optEnum(cVar, "text_align_message", TextAlign.class, TextAlign.START));
    }
}
