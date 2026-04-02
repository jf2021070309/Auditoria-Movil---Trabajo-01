package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IValueCallback;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: InAppMessageUserJavascriptInterface.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 A2\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b?\u0010@J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0007J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0007J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0007J\u001a\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0007J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0007J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0002H\u0007J \u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0007J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0007J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H\u0007J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H\u0007J\u0012\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0014\u00103\u001a\u0004\u0018\u0001022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0007J \u00106\u001a\u00020\u00042\u0006\u00105\u001a\u0002042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0007J#\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u0001072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b8\u00109J\u0012\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010\n\u001a\u00020\u0002H\u0007R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "", "", "firstName", "Lcom/amazon/aps/iva/kb0/q;", "setFirstName", "lastName", "setLastName", Scopes.EMAIL, "setEmail", "genderString", "setGender", "", "year", "monthInt", "day", "setDateOfBirth", "country", "setCountry", "language", "setLanguage", "homeCity", "setHomeCity", "subscriptionType", "setEmailNotificationSubscriptionType", "setPushNotificationSubscriptionType", "phoneNumber", "setPhoneNumber", "key", "jsonStringValue", "setCustomUserAttributeJSON", "jsonArrayString", "setCustomUserAttributeArray", "value", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "attribute", "incrementCustomUserAttribute", "", "latitude", "longitude", "setCustomLocationAttribute", "alias", "label", "addAlias", "subscriptionGroupId", "addToSubscriptionGroup", "removeFromSubscriptionGroup", "Lcom/braze/enums/Month;", "monthFromInt", "Lcom/braze/enums/NotificationSubscriptionType;", "subscriptionTypeFromJavascriptString", "Lcom/braze/BrazeUser;", "user", "setCustomAttribute", "", "parseStringArrayFromJsonString", "(Ljava/lang/String;)[Ljava/lang/String;", "Lcom/braze/enums/Gender;", "parseGender", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InAppMessageUserJavascriptInterface {
    public static final Companion Companion = new Companion(null);
    private final Context context;

    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0007\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface$Companion;", "", "Lcom/braze/Braze;", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "Lcom/amazon/aps/iva/kb0/q;", "block", "runOnUser", "", "JS_BRIDGE_ATTRIBUTE_VALUE", "Ljava/lang/String;", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runOnUser(Braze braze, final l<? super BrazeUser, q> lVar) {
            braze.getCurrentUser(new IValueCallback() { // from class: com.amazon.aps.iva.zb.a
                @Override // com.braze.events.IValueCallback
                public final void onSuccess(Object obj) {
                    InAppMessageUserJavascriptInterface.Companion.runOnUser$lambda$0(l.this, (BrazeUser) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runOnUser$lambda$0(l lVar, BrazeUser brazeUser) {
            j.f(lVar, "$block");
            j.f(brazeUser, "it");
            lVar.invoke(brazeUser);
        }
    }

    public InAppMessageUserJavascriptInterface(Context context) {
        j.f(context, "context");
        this.context = context;
    }

    @JavascriptInterface
    public final void addAlias(String str, String str2) {
        j.f(str, "alias");
        j.f(str2, "label");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$addAlias$1(str, str2));
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(String str, String str2) {
        j.f(str, "key");
        j.f(str2, "value");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$addToCustomAttributeArray$1(str, str2));
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(String str) {
        j.f(str, "subscriptionGroupId");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$addToSubscriptionGroup$1(str));
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(String str) {
        j.f(str, "attribute");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$incrementCustomUserAttribute$1(str));
    }

    public final Month monthFromInt(int i) {
        if (i >= 1 && i <= 12) {
            return Month.Companion.getMonth(i - 1);
        }
        return null;
    }

    public final Gender parseGender(String str) {
        j.f(str, "genderString");
        Locale locale = Locale.US;
        j.e(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        Gender gender = Gender.MALE;
        if (j.a(lowerCase, gender.forJsonPut())) {
            return gender;
        }
        Gender gender2 = Gender.FEMALE;
        if (j.a(lowerCase, gender2.forJsonPut())) {
            return gender2;
        }
        Gender gender3 = Gender.OTHER;
        if (j.a(lowerCase, gender3.forJsonPut())) {
            return gender3;
        }
        Gender gender4 = Gender.UNKNOWN;
        if (j.a(lowerCase, gender4.forJsonPut())) {
            return gender4;
        }
        Gender gender5 = Gender.NOT_APPLICABLE;
        if (j.a(lowerCase, gender5.forJsonPut())) {
            return gender5;
        }
        Gender gender6 = Gender.PREFER_NOT_TO_SAY;
        if (j.a(lowerCase, gender6.forJsonPut())) {
            return gender6;
        }
        return null;
    }

    public final String[] parseStringArrayFromJsonString(String str) {
        try {
            a aVar = new a(str);
            int e = aVar.e();
            ArrayList arrayList = new ArrayList(e);
            for (int i = 0; i < e; i++) {
                arrayList.add(aVar.d(i));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, InAppMessageUserJavascriptInterface$parseStringArrayFromJsonString$2.INSTANCE);
            return null;
        }
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(String str, String str2) {
        j.f(str, "key");
        j.f(str2, "value");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$removeFromCustomAttributeArray$1(str, str2));
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(String str) {
        j.f(str, "subscriptionGroupId");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$removeFromSubscriptionGroup$1(str));
    }

    @JavascriptInterface
    public final void setCountry(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setCountry$1(str));
    }

    public final void setCustomAttribute(BrazeUser brazeUser, String str, String str2) {
        j.f(brazeUser, "user");
        j.f(str, "key");
        j.f(str2, "jsonStringValue");
        try {
            Object obj = new c(str2).get("value");
            if (obj instanceof String) {
                brazeUser.setCustomUserAttribute(str, (String) obj);
            } else if (obj instanceof Boolean) {
                brazeUser.setCustomUserAttribute(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                brazeUser.setCustomUserAttribute(str, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                brazeUser.setCustomUserAttribute(str, ((Number) obj).doubleValue());
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new InAppMessageUserJavascriptInterface$setCustomAttribute$1(str, str2), 2, (Object) null);
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new InAppMessageUserJavascriptInterface$setCustomAttribute$2(str, str2));
        }
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(String str, double d, double d2) {
        j.f(str, "attribute");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setCustomLocationAttribute$1(str, d, d2));
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(String str, String str2) {
        j.f(str, "key");
        String[] parseStringArrayFromJsonString = parseStringArrayFromJsonString(str2);
        if (parseStringArrayFromJsonString != null) {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setCustomUserAttributeArray$2(str, parseStringArrayFromJsonString));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new InAppMessageUserJavascriptInterface$setCustomUserAttributeArray$1(str), 2, (Object) null);
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(String str, String str2) {
        j.f(str, "key");
        j.f(str2, "jsonStringValue");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setCustomUserAttributeJSON$1(this, str, str2));
    }

    @JavascriptInterface
    public final void setDateOfBirth(int i, int i2, int i3) {
        Month monthFromInt = monthFromInt(i2);
        if (monthFromInt != null) {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setDateOfBirth$2(i, monthFromInt, i3));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new InAppMessageUserJavascriptInterface$setDateOfBirth$1(i2), 2, (Object) null);
        }
    }

    @JavascriptInterface
    public final void setEmail(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setEmail$1(str));
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(String str) {
        j.f(str, "subscriptionType");
        NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(str);
        if (subscriptionTypeFromJavascriptString != null) {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setEmailNotificationSubscriptionType$2(subscriptionTypeFromJavascriptString));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new InAppMessageUserJavascriptInterface$setEmailNotificationSubscriptionType$1(str), 2, (Object) null);
        }
    }

    @JavascriptInterface
    public final void setFirstName(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setFirstName$1(str));
    }

    @JavascriptInterface
    public final void setGender(String str) {
        j.f(str, "genderString");
        Gender parseGender = parseGender(str);
        if (parseGender != null) {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setGender$2(parseGender));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new InAppMessageUserJavascriptInterface$setGender$1(str), 2, (Object) null);
        }
    }

    @JavascriptInterface
    public final void setHomeCity(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setHomeCity$1(str));
    }

    @JavascriptInterface
    public final void setLanguage(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setLanguage$1(str));
    }

    @JavascriptInterface
    public final void setLastName(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setLastName$1(str));
    }

    @JavascriptInterface
    public final void setPhoneNumber(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setPhoneNumber$1(str));
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(String str) {
        j.f(str, "subscriptionType");
        NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(str);
        if (subscriptionTypeFromJavascriptString != null) {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new InAppMessageUserJavascriptInterface$setPushNotificationSubscriptionType$2(subscriptionTypeFromJavascriptString));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new InAppMessageUserJavascriptInterface$setPushNotificationSubscriptionType$1(str), 2, (Object) null);
        }
    }

    public final NotificationSubscriptionType subscriptionTypeFromJavascriptString(String str) {
        return NotificationSubscriptionType.Companion.fromValue(str);
    }
}
