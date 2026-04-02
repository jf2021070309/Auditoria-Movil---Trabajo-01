package com.braze.support;

import bo.app.r1;
import bo.app.v2;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageHtmlFull;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class h {
    private static final String a = BrazeLogger.INSTANCE.getBrazeLogTag("InAppMessageModelUtils");

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
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
            return "Deserializing control in-app message.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "In-app message type was unknown for in-app message: " + JsonUtils.getPrettyPrintedString(this.b);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Unknown in-app message type. Returning null: " + JsonUtils.getPrettyPrintedString(this.b);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to deserialize the in-app message: " + JsonUtils.getPrettyPrintedString(this.b) + ". Returning null.";
        }
    }

    public static final IInAppMessage a(com.amazon.aps.iva.if0.c cVar, r1 r1Var) {
        IInAppMessage inAppMessageFull;
        String upperCase;
        MessageType[] values;
        int i;
        j.f(cVar, "inAppMessageJson");
        j.f(r1Var, "brazeManager");
        try {
            if (c(cVar)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.D, (Throwable) null, (com.amazon.aps.iva.xb0.a) b.b, 4, (Object) null);
                return new InAppMessageControl(cVar, r1Var);
            }
            try {
                com.braze.support.c cVar2 = com.braze.support.c.a;
                String string = cVar.getString("type");
                j.e(string, "jsonObject.getString(key)");
                Locale locale = Locale.US;
                j.e(locale, "US");
                upperCase = string.toUpperCase(locale);
                j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            } catch (Exception unused) {
                r5 = null;
            }
            for (MessageType messageType : MessageType.values()) {
                if (j.a(messageType.name(), upperCase)) {
                    if (messageType == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.I, (Throwable) null, (com.amazon.aps.iva.xb0.a) new c(cVar), 4, (Object) null);
                        return null;
                    }
                    int i2 = a.a[messageType.ordinal()];
                    if (i2 == 1) {
                        inAppMessageFull = new InAppMessageFull(cVar, r1Var);
                    } else if (i2 == 2) {
                        inAppMessageFull = new InAppMessageModal(cVar, r1Var);
                    } else if (i2 == 3) {
                        inAppMessageFull = new InAppMessageSlideup(cVar, r1Var);
                    } else if (i2 == 4) {
                        inAppMessageFull = new InAppMessageHtmlFull(cVar, r1Var);
                    } else if (i2 != 5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, (com.amazon.aps.iva.xb0.a) new d(cVar), 4, (Object) null);
                        return null;
                    } else {
                        inAppMessageFull = new InAppMessageHtml(cVar, r1Var);
                    }
                    return inAppMessageFull;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, (Throwable) e2, (com.amazon.aps.iva.xb0.a<String>) new e(cVar));
            return null;
        }
    }

    public static final com.amazon.aps.iva.if0.a b(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.if0.a aVar;
        com.amazon.aps.iva.if0.c optJSONObject;
        j.f(cVar, "inAppMessageJson");
        com.amazon.aps.iva.if0.c optJSONObject2 = cVar.optJSONObject("themes");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("dark")) != null) {
            aVar = optJSONObject.optJSONArray("btns");
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return new com.amazon.aps.iva.if0.a();
        }
        return aVar;
    }

    public static final boolean c(com.amazon.aps.iva.if0.c cVar) {
        j.f(cVar, "inAppMessageJson");
        return cVar.optBoolean("is_control", false);
    }

    public static final v2 a(com.amazon.aps.iva.if0.c cVar) {
        j.f(cVar, "inAppMessageJson");
        com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("themes");
        com.amazon.aps.iva.if0.c optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("dark") : null;
        if (optJSONObject2 != null) {
            return new v2(optJSONObject2);
        }
        return null;
    }
}
