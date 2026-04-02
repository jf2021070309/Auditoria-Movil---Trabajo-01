package com.braze;

import bo.app.a5;
import bo.app.b2;
import bo.app.l6;
import bo.app.n5;
import bo.app.p1;
import bo.app.r1;
import com.amazon.aps.iva.o0.t1;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.models.outgoing.AttributionData;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.ValidationUtils;
import com.google.android.gms.common.Scopes;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010F\u001a\u00020\u0002\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bV\u0010WJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0002J\u0010\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0002J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0005J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0010J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020)J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020*J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020+J\u0016\u0010,\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002J\u0016\u0010-\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002J%\u00100\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u000e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020.¢\u0006\u0004\b0\u00101J\u0016\u00103\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u00102\u001a\u00020*J\u001a\u00105\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u00020\u0010H\u0007J\u0010\u00108\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u000106J\u001e\u0010<\u001a\u00020;2\u0006\u0010&\u001a\u00020\u00022\u0006\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020+J\"\u0010>\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010=\u001a\u00020\u0005H\u0007J\u0016\u0010?\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u00102\u001a\u00020*R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010Q\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/braze/BrazeUser;", "", "", "alias", "label", "", "addAlias", "firstName", "setFirstName", "lastName", "setLastName", Scopes.EMAIL, "setEmail", "Lcom/braze/enums/Gender;", "gender", "setGender", "", "year", "Lcom/braze/enums/Month;", "month", "day", "setDateOfBirth", "country", "setCountry", "homeCity", "setHomeCity", "language", "setLanguage", "Lcom/braze/enums/NotificationSubscriptionType;", "emailNotificationSubscriptionType", "setEmailNotificationSubscriptionType", "pushNotificationSubscriptionType", "setPushNotificationSubscriptionType", "subscriptionGroupId", "addToSubscriptionGroup", "removeFromSubscriptionGroup", "phoneNumber", "setPhoneNumber", "key", "value", "setCustomUserAttribute", "", "", "", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "", "values", "setCustomAttributeArray", "(Ljava/lang/String;[Ljava/lang/String;)Z", "secondsFromEpoch", "setCustomUserAttributeToSecondsFromEpoch", "incrementValue", "incrementCustomUserAttribute", "Lcom/braze/models/outgoing/AttributionData;", "attributionData", "setAttributionData", "latitude", "longitude", "Lcom/amazon/aps/iva/kb0/q;", "setLocationCustomAttribute", "merge", "setCustomAttribute", "setCustomAttributeToSecondsFromEpoch", "Lbo/app/l6;", "userCache", "Lbo/app/l6;", "Lbo/app/r1;", "brazeManager", "Lbo/app/r1;", "internalUserId", "Ljava/lang/String;", "Lbo/app/b2;", "locationManager", "Lbo/app/b2;", "Lbo/app/a5;", "serverConfigStorageProvider", "Lbo/app/a5;", "Ljava/util/concurrent/locks/ReentrantLock;", "userIdLock", "Ljava/util/concurrent/locks/ReentrantLock;", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "<init>", "(Lbo/app/l6;Lbo/app/r1;Ljava/lang/String;Lbo/app/b2;Lbo/app/a5;)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeUser {
    private final r1 brazeManager;
    private volatile String internalUserId;
    private final b2 locationManager;
    private final a5 serverConfigStorageProvider;
    private final l6 userCache;
    private final ReentrantLock userIdLock;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set alias: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String str, long j) {
            super(0);
            this.b = str;
            this.c = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Failed to set custom attribute ");
            sb.append(this.b);
            sb.append(" to ");
            return com.amazon.aps.iva.c.b.b(sb, this.c, " seconds from epoch.");
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
            return "Custom attribute key was invalid. Not adding to attribute array.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;
        final /* synthetic */ Month c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(int i, Month month, int i2) {
            super(0);
            this.b = i;
            this.c = month;
            this.d = i2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set date of birth to: " + this.b + '-' + this.c.getValue() + '-' + this.d;
        }
    }

    /* loaded from: classes.dex */
    public static final class d1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "User object user id set to: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Failed to add custom attribute with key '"), this.b, "'.");
        }
    }

    /* loaded from: classes.dex */
    public static final class e0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final e0 b = new e0();

        public e0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Invalid email parameter: email is required to be non-empty. Not setting email.";
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
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Email address is not valid: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to add user to subscription group " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class g0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set email to: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i) {
            super(0);
            this.b = str;
            this.c = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Failed to increment custom attribute ");
            sb.append(this.b);
            sb.append(" by ");
            return com.amazon.aps.iva.d0.b2.b(sb, this.c, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class h0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ NotificationSubscriptionType b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.b = notificationSubscriptionType;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set email notification subscription to: " + this.b;
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
            return "Custom attribute key was invalid. Not removing from attribute array.";
        }
    }

    /* loaded from: classes.dex */
    public static final class i0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final i0 b = new i0();

        public i0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Failed to remove custom attribute with key '"), this.b, "'.");
        }
    }

    /* loaded from: classes.dex */
    public static final class j0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set first name to: " + this.b;
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
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
        }
    }

    /* loaded from: classes.dex */
    public static final class k0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Gender b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(Gender gender) {
            super(0);
            this.b = gender;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set gender to: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to remove user from subscription group " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class l0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final l0 b = new l0();

        public l0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final m b = new m();

        public m() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set attribution data.";
        }
    }

    /* loaded from: classes.dex */
    public static final class m0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set home city to: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final n b = new n();

        public n() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Invalid country parameter: country is required to be non-blank. Not setting country.";
        }
    }

    /* loaded from: classes.dex */
    public static final class n0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final n0 b = new n0();

        public n0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Invalid language parameter: language is required to be non-empty. Not setting language.";
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set country to: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class o0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set language to: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final p b = new p();

        public p() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not add unsupported custom attribute value with key: " + this.b + " and value: " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class q0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final q0 b = new q0();

        public q0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not build NestedCustomAttributeEvent for key " + this.b + " and " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class r0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set last name to: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Failed to set custom attribute array with key: '"), this.b, "'.");
        }
    }

    /* loaded from: classes.dex */
    public static final class s0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final s0 b = new s0();

        public s0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Custom location attribute key was invalid. Not setting attribute.";
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return t1.b(new StringBuilder("Failed to set custom boolean attribute "), this.b, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class t0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ double b;
        final /* synthetic */ double c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(double d, double d2) {
            super(0);
            this.b = d;
            this.c = d2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot set custom location attribute due with invalid latitude '" + this.b + " and longitude '" + this.c + '\'';
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return t1.b(new StringBuilder("Failed to set custom integer attribute "), this.b, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class u0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ double c;
        final /* synthetic */ double d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(String str, double d, double d2) {
            super(0);
            this.b = str;
            this.c = d;
            this.d = d2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom location attribute with key '" + this.b + "' and latitude '" + this.c + "' and longitude '" + this.d + '\'';
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return t1.b(new StringBuilder("Failed to set custom float attribute "), this.b, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class v0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final v0 b = new v0();

        public v0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return t1.b(new StringBuilder("Failed to set custom long attribute "), this.b, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class w0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return t1.b(new StringBuilder("Failed to set custom string attribute "), this.b, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class x0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set phone number to: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return t1.b(new StringBuilder("Failed to set custom double attribute "), this.b, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class y0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ NotificationSubscriptionType b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.b = notificationSubscriptionType;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set push notification subscription to: " + this.b;
        }
    }

    public BrazeUser(l6 l6Var, r1 r1Var, String str, b2 b2Var, a5 a5Var) {
        com.amazon.aps.iva.yb0.j.f(l6Var, "userCache");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        com.amazon.aps.iva.yb0.j.f(str, "internalUserId");
        com.amazon.aps.iva.yb0.j.f(b2Var, "locationManager");
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
        this.userCache = l6Var;
        this.brazeManager = r1Var;
        this.internalUserId = str;
        this.locationManager = b2Var;
        this.serverConfigStorageProvider = a5Var;
        this.userIdLock = new ReentrantLock();
    }

    public static /* synthetic */ boolean incrementCustomUserAttribute$default(BrazeUser brazeUser, String str, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        return brazeUser.incrementCustomUserAttribute(str, i2);
    }

    public static /* synthetic */ boolean setCustomAttribute$default(BrazeUser brazeUser, String str, Object obj, boolean z, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return brazeUser.setCustomAttribute(str, obj, z);
    }

    public final boolean addAlias(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "alias");
        com.amazon.aps.iva.yb0.j.f(str2, "label");
        if (com.amazon.aps.iva.oe0.m.b0(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
            return false;
        } else if (com.amazon.aps.iva.oe0.m.b0(str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
            return false;
        } else {
            try {
                p1 g2 = bo.app.j.h.g(str, str2);
                if (g2 == null) {
                    return false;
                }
                return this.brazeManager.a(g2);
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new c(str));
                return false;
            }
        }
    }

    public final boolean addToCustomAttributeArray(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(str2, "value");
        try {
            if (!com.braze.support.b.a(str, this.serverConfigStorageProvider.b())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, d.b, 2, (Object) null);
                return false;
            } else if (!com.braze.support.b.b(str2)) {
                return false;
            } else {
                p1 a2 = bo.app.j.h.a(ValidationUtils.ensureBrazeFieldLength(str), ValidationUtils.ensureBrazeFieldLength(str2));
                if (a2 == null) {
                    return false;
                }
                return this.brazeManager.a(a2);
            }
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new e(str));
            return false;
        }
    }

    public final boolean addToSubscriptionGroup(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "subscriptionGroupId");
        try {
            if (com.amazon.aps.iva.oe0.m.b0(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, f.b, 2, (Object) null);
                return false;
            }
            p1 a2 = bo.app.j.h.a(str, n5.SUBSCRIBED);
            if (a2 != null) {
                this.brazeManager.a(a2);
                return true;
            }
            return true;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new g(str));
            return false;
        }
    }

    public final String getUserId() {
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            return this.internalUserId;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean incrementCustomUserAttribute(String str, int i2) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        try {
            if (!com.braze.support.b.a(str, this.serverConfigStorageProvider.b())) {
                return false;
            }
            p1 a2 = bo.app.j.h.a(ValidationUtils.ensureBrazeFieldLength(str), i2);
            if (a2 == null) {
                return false;
            }
            return this.brazeManager.a(a2);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new h(str, i2));
            return false;
        }
    }

    public final boolean removeFromCustomAttributeArray(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(str2, "value");
        try {
            if (!com.braze.support.b.a(str, this.serverConfigStorageProvider.b())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, i.b, 2, (Object) null);
                return false;
            } else if (!com.braze.support.b.b(str2)) {
                return false;
            } else {
                p1 f2 = bo.app.j.h.f(ValidationUtils.ensureBrazeFieldLength(str), ValidationUtils.ensureBrazeFieldLength(str2));
                if (f2 == null) {
                    return false;
                }
                return this.brazeManager.a(f2);
            }
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new j(str));
            return false;
        }
    }

    public final boolean removeFromSubscriptionGroup(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "subscriptionGroupId");
        try {
            if (com.amazon.aps.iva.oe0.m.b0(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, k.b, 2, (Object) null);
                return false;
            }
            p1 a2 = bo.app.j.h.a(str, n5.UNSUBSCRIBED);
            if (a2 != null) {
                this.brazeManager.a(a2);
                return true;
            }
            return true;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new l(str));
            return false;
        }
    }

    public final boolean setAttributionData(AttributionData attributionData) {
        try {
            this.userCache.a(attributionData);
            return true;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, m.b);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0011, B:13:0x001f), top: B:17:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[Catch: Exception -> 0x000c, TRY_LEAVE, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0011, B:13:0x001f), top: B:17:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setCountry(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto Le
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r11)     // Catch: java.lang.Exception -> Lc
            if (r2 != r0) goto Le
            r2 = r0
            goto Lf
        Lc:
            r0 = move-exception
            goto L25
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L1f
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> Lc
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> Lc
            r6 = 0
            com.braze.BrazeUser$n r7 = com.braze.BrazeUser.n.b     // Catch: java.lang.Exception -> Lc
            r8 = 2
            r9 = 0
            r4 = r10
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lc
            return r1
        L1f:
            bo.app.l6 r2 = r10.userCache     // Catch: java.lang.Exception -> Lc
            r2.a(r11)     // Catch: java.lang.Exception -> Lc
            return r0
        L25:
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$o r4 = new com.braze.BrazeUser$o
            r4.<init>(r11)
            r2.brazelog(r10, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setCountry(java.lang.String):boolean");
    }

    public final boolean setCustomAttribute(String str, Object obj, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(obj, "value");
        if (!com.braze.support.b.a(str, this.serverConfigStorageProvider.b())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, p.b, 2, (Object) null);
            return false;
        }
        String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
        Object a2 = com.braze.support.b.a(com.braze.support.b.a, obj, 0, 2, null);
        if (a2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new q(str, obj), 2, (Object) null);
            return false;
        } else if ((a2 instanceof com.amazon.aps.iva.if0.c) && z) {
            p1 a3 = bo.app.j.h.a(ensureBrazeFieldLength, (com.amazon.aps.iva.if0.c) a2);
            if (a3 == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new r(ensureBrazeFieldLength, a2), 2, (Object) null);
                return false;
            }
            return this.brazeManager.a(a3);
        } else {
            return this.userCache.a(ensureBrazeFieldLength, a2);
        }
    }

    public final boolean setCustomAttributeArray(String str, String[] strArr) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(strArr, "values");
        try {
            if (!com.braze.support.b.a(str, this.serverConfigStorageProvider.b())) {
                return false;
            }
            p1 a2 = bo.app.j.h.a(ValidationUtils.ensureBrazeFieldLength(str), com.braze.support.b.a(strArr));
            if (a2 == null) {
                return false;
            }
            return this.brazeManager.a(a2);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new s(str));
            return false;
        }
    }

    public final boolean setCustomAttributeToSecondsFromEpoch(String str, long j2) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        return setCustomAttribute$default(this, str, DateTimeUtils.createDate(j2), false, 4, null);
    }

    public final boolean setCustomUserAttribute(String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        try {
            return setCustomAttribute$default(this, str, Boolean.valueOf(z), false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new t(str));
            return false;
        }
    }

    public final boolean setCustomUserAttributeToSecondsFromEpoch(String str, long j2) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        try {
            return setCustomAttributeToSecondsFromEpoch(str, j2);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new c0(str, j2));
            return false;
        }
    }

    public final boolean setDateOfBirth(int i2, Month month, int i3) {
        com.amazon.aps.iva.yb0.j.f(month, "month");
        try {
            return this.userCache.b(DateTimeUtils.formatDate$default(DateTimeUtils.createDate$default(i2, month.getValue(), i3, 0, 0, 0, 56, null), BrazeDateFormat.SHORT, null, 2, null));
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new d0(i2, month, i3));
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012 A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0012, B:14:0x0022, B:19:0x0030, B:26:0x0045, B:29:0x004b, B:30:0x004e, B:33:0x005b, B:36:0x0062, B:37:0x0072), top: B:41:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setEmail(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto Lf
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r11)     // Catch: java.lang.Exception -> Lc
            if (r2 != r0) goto Lf
            r2 = r0
            goto L10
        Lc:
            r0 = move-exception
            goto L79
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L20
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> Lc
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> Lc
            r6 = 0
            com.braze.BrazeUser$e0 r7 = com.braze.BrazeUser.e0.b     // Catch: java.lang.Exception -> Lc
            r8 = 2
            r9 = 0
            r4 = r10
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lc
            return r1
        L20:
            if (r11 == 0) goto L58
            int r2 = r11.length()     // Catch: java.lang.Exception -> Lc
            int r2 = r2 - r0
            r3 = r1
            r4 = r3
        L29:
            if (r3 > r2) goto L4e
            if (r4 != 0) goto L2f
            r5 = r3
            goto L30
        L2f:
            r5 = r2
        L30:
            char r5 = r11.charAt(r5)     // Catch: java.lang.Exception -> Lc
            r6 = 32
            int r5 = com.amazon.aps.iva.yb0.j.h(r5, r6)     // Catch: java.lang.Exception -> Lc
            if (r5 > 0) goto L3e
            r5 = r0
            goto L3f
        L3e:
            r5 = r1
        L3f:
            if (r4 != 0) goto L48
            if (r5 != 0) goto L45
            r4 = r0
            goto L29
        L45:
            int r3 = r3 + 1
            goto L29
        L48:
            if (r5 != 0) goto L4b
            goto L4e
        L4b:
            int r2 = r2 + (-1)
            goto L29
        L4e:
            int r2 = r2 + r0
            java.lang.CharSequence r0 = r11.subSequence(r3, r2)     // Catch: java.lang.Exception -> Lc
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lc
            goto L59
        L58:
            r0 = 0
        L59:
            if (r0 == 0) goto L72
            boolean r2 = com.braze.support.ValidationUtils.isValidEmailAddress(r0)     // Catch: java.lang.Exception -> Lc
            if (r2 == 0) goto L62
            goto L72
        L62:
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> Lc
            r5 = 0
            r6 = 0
            com.braze.BrazeUser$f0 r7 = new com.braze.BrazeUser$f0     // Catch: java.lang.Exception -> Lc
            r7.<init>(r11)     // Catch: java.lang.Exception -> Lc
            r8 = 3
            r9 = 0
            r4 = r10
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lc
            goto L78
        L72:
            bo.app.l6 r2 = r10.userCache     // Catch: java.lang.Exception -> Lc
            boolean r1 = r2.c(r0)     // Catch: java.lang.Exception -> Lc
        L78:
            return r1
        L79:
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$g0 r4 = new com.braze.BrazeUser$g0
            r4.<init>(r11)
            r2.brazelog(r10, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setEmail(java.lang.String):boolean");
    }

    public final boolean setEmailNotificationSubscriptionType(NotificationSubscriptionType notificationSubscriptionType) {
        com.amazon.aps.iva.yb0.j.f(notificationSubscriptionType, "emailNotificationSubscriptionType");
        try {
            this.userCache.a(notificationSubscriptionType);
            return true;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new h0(notificationSubscriptionType));
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0011, B:13:0x001f), top: B:17:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[Catch: Exception -> 0x000c, TRY_LEAVE, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0011, B:13:0x001f), top: B:17:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setFirstName(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto Le
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r11)     // Catch: java.lang.Exception -> Lc
            if (r2 != r0) goto Le
            r2 = r0
            goto Lf
        Lc:
            r0 = move-exception
            goto L25
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L1f
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> Lc
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> Lc
            r6 = 0
            com.braze.BrazeUser$i0 r7 = com.braze.BrazeUser.i0.b     // Catch: java.lang.Exception -> Lc
            r8 = 2
            r9 = 0
            r4 = r10
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lc
            return r1
        L1f:
            bo.app.l6 r2 = r10.userCache     // Catch: java.lang.Exception -> Lc
            r2.d(r11)     // Catch: java.lang.Exception -> Lc
            return r0
        L25:
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$j0 r4 = new com.braze.BrazeUser$j0
            r4.<init>(r11)
            r2.brazelog(r10, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setFirstName(java.lang.String):boolean");
    }

    public final boolean setGender(Gender gender) {
        com.amazon.aps.iva.yb0.j.f(gender, "gender");
        try {
            this.userCache.a(gender);
            return true;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new k0(gender));
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0011, B:13:0x001f), top: B:17:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[Catch: Exception -> 0x000c, TRY_LEAVE, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0011, B:13:0x001f), top: B:17:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setHomeCity(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto Le
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r11)     // Catch: java.lang.Exception -> Lc
            if (r2 != r0) goto Le
            r2 = r0
            goto Lf
        Lc:
            r0 = move-exception
            goto L25
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L1f
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> Lc
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> Lc
            r6 = 0
            com.braze.BrazeUser$l0 r7 = com.braze.BrazeUser.l0.b     // Catch: java.lang.Exception -> Lc
            r8 = 2
            r9 = 0
            r4 = r10
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lc
            return r1
        L1f:
            bo.app.l6 r2 = r10.userCache     // Catch: java.lang.Exception -> Lc
            r2.e(r11)     // Catch: java.lang.Exception -> Lc
            return r0
        L25:
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$m0 r4 = new com.braze.BrazeUser$m0
            r4.<init>(r11)
            r2.brazelog(r10, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setHomeCity(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0011, B:13:0x001f), top: B:17:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[Catch: Exception -> 0x000c, TRY_LEAVE, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0011, B:13:0x001f), top: B:17:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setLanguage(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto Le
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r11)     // Catch: java.lang.Exception -> Lc
            if (r2 != r0) goto Le
            r2 = r0
            goto Lf
        Lc:
            r0 = move-exception
            goto L25
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L1f
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> Lc
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> Lc
            r6 = 0
            com.braze.BrazeUser$n0 r7 = com.braze.BrazeUser.n0.b     // Catch: java.lang.Exception -> Lc
            r8 = 2
            r9 = 0
            r4 = r10
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lc
            return r1
        L1f:
            bo.app.l6 r2 = r10.userCache     // Catch: java.lang.Exception -> Lc
            r2.f(r11)     // Catch: java.lang.Exception -> Lc
            return r0
        L25:
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$o0 r4 = new com.braze.BrazeUser$o0
            r4.<init>(r11)
            r2.brazelog(r10, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setLanguage(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0011, B:13:0x001f), top: B:17:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[Catch: Exception -> 0x000c, TRY_LEAVE, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0011, B:13:0x001f), top: B:17:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setLastName(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto Le
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r11)     // Catch: java.lang.Exception -> Lc
            if (r2 != r0) goto Le
            r2 = r0
            goto Lf
        Lc:
            r0 = move-exception
            goto L25
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L1f
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> Lc
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> Lc
            r6 = 0
            com.braze.BrazeUser$q0 r7 = com.braze.BrazeUser.q0.b     // Catch: java.lang.Exception -> Lc
            r8 = 2
            r9 = 0
            r4 = r10
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lc
            return r1
        L1f:
            bo.app.l6 r2 = r10.userCache     // Catch: java.lang.Exception -> Lc
            r2.g(r11)     // Catch: java.lang.Exception -> Lc
            return r0
        L25:
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$r0 r4 = new com.braze.BrazeUser$r0
            r4.<init>(r11)
            r2.brazelog(r10, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setLastName(java.lang.String):boolean");
    }

    public final void setLocationCustomAttribute(String str, double d2, double d3) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        try {
            if (!com.braze.support.b.a(str, this.serverConfigStorageProvider.b())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, s0.b, 2, (Object) null);
            } else if (!ValidationUtils.isValidLocation(d2, d3)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new t0(d2, d3), 2, (Object) null);
            } else {
                p1 a2 = bo.app.j.h.a(ValidationUtils.ensureBrazeFieldLength(str), d2, d3);
                if (a2 != null) {
                    this.brazeManager.a(a2);
                }
            }
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new u0(str, d2, d3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012 A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:11:0x0012, B:14:0x0022, B:19:0x0030, B:26:0x0045, B:29:0x004b, B:30:0x004e, B:33:0x005b, B:36:0x0062, B:38:0x0073), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setPhoneNumber(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto Lf
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r11)     // Catch: java.lang.Exception -> Lc
            if (r2 != r0) goto Lf
            r2 = r0
            goto L10
        Lc:
            r0 = move-exception
            goto L7a
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L20
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> Lc
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> Lc
            r6 = 0
            com.braze.BrazeUser$v0 r7 = com.braze.BrazeUser.v0.b     // Catch: java.lang.Exception -> Lc
            r8 = 2
            r9 = 0
            r4 = r10
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lc
            return r1
        L20:
            if (r11 == 0) goto L58
            int r2 = r11.length()     // Catch: java.lang.Exception -> Lc
            int r2 = r2 - r0
            r3 = r1
            r4 = r3
        L29:
            if (r3 > r2) goto L4e
            if (r4 != 0) goto L2f
            r5 = r3
            goto L30
        L2f:
            r5 = r2
        L30:
            char r5 = r11.charAt(r5)     // Catch: java.lang.Exception -> Lc
            r6 = 32
            int r5 = com.amazon.aps.iva.yb0.j.h(r5, r6)     // Catch: java.lang.Exception -> Lc
            if (r5 > 0) goto L3e
            r5 = r0
            goto L3f
        L3e:
            r5 = r1
        L3f:
            if (r4 != 0) goto L48
            if (r5 != 0) goto L45
            r4 = r0
            goto L29
        L45:
            int r3 = r3 + 1
            goto L29
        L48:
            if (r5 != 0) goto L4b
            goto L4e
        L4b:
            int r2 = r2 + (-1)
            goto L29
        L4e:
            int r2 = r2 + r0
            java.lang.CharSequence r0 = r11.subSequence(r3, r2)     // Catch: java.lang.Exception -> Lc
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lc
            goto L59
        L58:
            r0 = 0
        L59:
            if (r0 == 0) goto L73
            boolean r2 = com.braze.support.ValidationUtils.isValidPhoneNumber(r0)     // Catch: java.lang.Exception -> Lc
            if (r2 == 0) goto L62
            goto L73
        L62:
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> Lc
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> Lc
            r6 = 0
            com.braze.BrazeUser$w0 r7 = new com.braze.BrazeUser$w0     // Catch: java.lang.Exception -> Lc
            r7.<init>(r0)     // Catch: java.lang.Exception -> Lc
            r8 = 2
            r9 = 0
            r4 = r10
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lc
            return r1
        L73:
            bo.app.l6 r2 = r10.userCache     // Catch: java.lang.Exception -> Lc
            boolean r11 = r2.h(r0)     // Catch: java.lang.Exception -> Lc
            return r11
        L7a:
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$x0 r4 = new com.braze.BrazeUser$x0
            r4.<init>(r11)
            r2.brazelog(r10, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setPhoneNumber(java.lang.String):boolean");
    }

    public final boolean setPushNotificationSubscriptionType(NotificationSubscriptionType notificationSubscriptionType) {
        com.amazon.aps.iva.yb0.j.f(notificationSubscriptionType, "pushNotificationSubscriptionType");
        try {
            this.userCache.b(notificationSubscriptionType);
            return true;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new y0(notificationSubscriptionType));
            return false;
        }
    }

    public final void setUserId(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "userId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d1(str), 2, (Object) null);
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            if (!com.amazon.aps.iva.yb0.j.a(this.internalUserId, "") && !com.amazon.aps.iva.yb0.j.a(this.internalUserId, str)) {
                throw new IllegalArgumentException("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [" + this.internalUserId + "], tried to change to: [" + str + ']');
            }
            this.internalUserId = str;
            this.userCache.i(str);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean setCustomUserAttribute(String str, int i2) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        try {
            return setCustomAttribute$default(this, str, Integer.valueOf(i2), false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new u(str));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String str, float f2) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        try {
            return setCustomAttribute$default(this, str, Float.valueOf(f2), false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new v(str));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String str, long j2) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        try {
            return setCustomAttribute$default(this, str, Long.valueOf(j2), false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new w(str));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(str2, "value");
        try {
            return setCustomAttribute$default(this, str, str2, false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new x(str));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String str, double d2) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        try {
            return setCustomAttribute$default(this, str, Double.valueOf(d2), false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new y(str));
            return false;
        }
    }
}
