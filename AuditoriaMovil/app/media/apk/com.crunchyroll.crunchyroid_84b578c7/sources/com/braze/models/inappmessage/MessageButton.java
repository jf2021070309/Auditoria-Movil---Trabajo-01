package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.c3;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0017\u0018\u0000 <2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001=B\t\b\u0016¢\u0006\u0004\b6\u00107B\u001d\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b6\u00109Bc\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010*\u001a\u00020\f\u0012\b\b\u0001\u0010.\u001a\u00020\f\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u00101\u001a\u00020\f¢\u0006\u0004\b6\u0010;J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\f8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u000f\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\f8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u000f\u001a\u0004\b/\u0010\u0011\"\u0004\b0\u0010-R\"\u00101\u001a\u00020\f8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u000f\u001a\u0004\b2\u0010\u0011\"\u0004\b3\u0010-R\u0011\u00105\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b4\u0010 ¨\u0006>"}, d2 = {"Lcom/braze/models/inappmessage/MessageButton;", "Lcom/braze/models/IPutIntoJson;", "Lcom/amazon/aps/iva/if0/c;", "Lcom/braze/models/inappmessage/IInAppMessageThemeable;", "Lcom/amazon/aps/iva/kb0/q;", "enableDarkTheme", "forJsonPut", "jsonObject", "Lcom/amazon/aps/iva/if0/c;", "Lbo/app/c3;", "darkTheme", "Lbo/app/c3;", "", "<set-?>", "id", "I", "getId", "()I", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "Landroid/net/Uri;", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "", "openUriInWebview", "Z", "getOpenUriInWebview", "()Z", "setOpenUriInWebview", "(Z)V", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "(I)V", "textColor", "getTextColor", "setTextColor", "borderColor", "getBorderColor", "setBorderColor", "getStringId", "stringId", "<init>", "()V", "darkThemeObject", "(Lcom/amazon/aps/iva/if0/c;Lcom/amazon/aps/iva/if0/c;)V", "darkThemeJsonObject", "(Lcom/amazon/aps/iva/if0/c;Lcom/amazon/aps/iva/if0/c;ILcom/braze/enums/inappmessage/ClickAction;Ljava/lang/String;Ljava/lang/String;IIZI)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class MessageButton implements IPutIntoJson<c>, IInAppMessageThemeable {
    public static final a Companion = new a(null);
    private static final String TAG = BrazeLogger.getBrazeLogTag(MessageButton.class);
    private int backgroundColor;
    private int borderColor;
    private ClickAction clickAction;
    private c3 darkTheme;
    private int id;
    private c jsonObject;
    private boolean openUriInWebview;
    private String text;
    private int textColor;
    private Uri uri;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(e eVar) {
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

    public MessageButton() {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.backgroundColor = parseColor;
        this.textColor = -1;
        this.borderColor = parseColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        c3 c3Var = this.darkTheme;
        if (c3Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) b.b, 6, (Object) null);
            return;
        }
        if (c3Var.a() != null) {
            this.backgroundColor = c3Var.a().intValue();
        }
        if (c3Var.c() != null) {
            this.textColor = c3Var.c().intValue();
        }
        if (c3Var.b() != null) {
            this.borderColor = c3Var.b().intValue();
        }
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final ClickAction getClickAction() {
        return this.clickAction;
    }

    public final boolean getOpenUriInWebview() {
        return this.openUriInWebview;
    }

    public final String getStringId() {
        return String.valueOf(this.id);
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final Uri getUri() {
        return this.uri;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.IPutIntoJson
    public c forJsonPut() {
        try {
            c cVar = new c();
            cVar.put("id", this.id);
            cVar.put("click_action", this.clickAction.toString());
            Uri uri = this.uri;
            if (uri != null) {
                cVar.put("uri", String.valueOf(uri));
            }
            cVar.putOpt("text", this.text);
            cVar.put("bg_color", this.backgroundColor);
            cVar.put("text_color", this.textColor);
            cVar.put("use_webview", this.openUriInWebview);
            cVar.put("border_color", this.borderColor);
            return cVar;
        } catch (com.amazon.aps.iva.if0.b unused) {
            return this.jsonObject;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MessageButton(com.amazon.aps.iva.if0.c r14, com.amazon.aps.iva.if0.c r15) {
        /*
            r13 = this;
            java.lang.String r0 = "jsonObject"
            com.amazon.aps.iva.yb0.j.f(r14, r0)
            java.lang.String r0 = "id"
            r1 = -1
            int r5 = r14.optInt(r0, r1)
            java.lang.String r0 = "click_action"
            com.braze.enums.inappmessage.ClickAction r1 = com.braze.enums.inappmessage.ClickAction.NEWS_FEED
            r2 = 0
            com.braze.support.c r3 = com.braze.support.c.a     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = r14.getString(r0)     // Catch: java.lang.Exception -> L4d
            java.lang.String r3 = "jsonObject.getString(key)"
            com.amazon.aps.iva.yb0.j.e(r0, r3)     // Catch: java.lang.Exception -> L4d
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = "US"
            com.amazon.aps.iva.yb0.j.e(r3, r4)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = r0.toUpperCase(r3)     // Catch: java.lang.Exception -> L4d
            java.lang.String r3 = "this as java.lang.String).toUpperCase(locale)"
            com.amazon.aps.iva.yb0.j.e(r0, r3)     // Catch: java.lang.Exception -> L4d
            com.braze.enums.inappmessage.ClickAction[] r3 = com.braze.enums.inappmessage.ClickAction.values()     // Catch: java.lang.Exception -> L4d
            int r4 = r3.length     // Catch: java.lang.Exception -> L4d
            r6 = r2
        L32:
            if (r6 >= r4) goto L45
            r7 = r3[r6]     // Catch: java.lang.Exception -> L4d
            java.lang.String r8 = r7.name()     // Catch: java.lang.Exception -> L4d
            boolean r8 = com.amazon.aps.iva.yb0.j.a(r8, r0)     // Catch: java.lang.Exception -> L4d
            if (r8 == 0) goto L42
            r6 = r7
            goto L4e
        L42:
            int r6 = r6 + 1
            goto L32
        L45:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Exception -> L4d
            java.lang.String r3 = "Array contains no element matching the predicate."
            r0.<init>(r3)     // Catch: java.lang.Exception -> L4d
            throw r0     // Catch: java.lang.Exception -> L4d
        L4d:
            r6 = r1
        L4e:
            java.lang.String r0 = "uri"
            java.lang.String r7 = r14.optString(r0)
            java.lang.String r0 = "text"
            java.lang.String r8 = r14.optString(r0)
            java.lang.String r0 = "jsonObject.optString(TEXT)"
            com.amazon.aps.iva.yb0.j.e(r8, r0)
            java.lang.String r0 = "bg_color"
            int r9 = r14.optInt(r0)
            java.lang.String r0 = "text_color"
            int r10 = r14.optInt(r0)
            java.lang.String r0 = "use_webview"
            boolean r11 = r14.optBoolean(r0, r2)
            java.lang.String r0 = "border_color"
            int r12 = r14.optInt(r0)
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.models.inappmessage.MessageButton.<init>(com.amazon.aps.iva.if0.c, com.amazon.aps.iva.if0.c):void");
    }

    private MessageButton(c cVar, c cVar2, int i, ClickAction clickAction, String str, String str2, int i2, int i3, boolean z, int i4) {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.backgroundColor = parseColor;
        this.textColor = -1;
        this.borderColor = parseColor;
        this.jsonObject = cVar;
        this.id = i;
        this.clickAction = clickAction;
        if (clickAction == ClickAction.URI) {
            if (!(str == null || m.b0(str))) {
                this.uri = Uri.parse(str);
            }
        }
        this.text = str2;
        this.backgroundColor = i2;
        this.textColor = i3;
        this.openUriInWebview = z;
        this.borderColor = i4;
        this.darkTheme = cVar2 != null ? new c3(cVar2) : null;
    }
}
