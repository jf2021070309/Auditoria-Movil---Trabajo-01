package com.braze.managers;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import bo.app.a5;
import bo.app.r1;
import bo.app.z1;
import bo.app.z2;
import com.amazon.aps.iva.kb0.q;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.BrazeGeofence;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 l2\u00020\u00012\u00020\u0001:\u0001lB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010g\u001a\u00020f\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010i\u001a\u00020h¢\u0006\u0004\bj\u0010kJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0007J\u001e\u0010\u0019\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\n\u001a\u00020\tH\u0007R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010&\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R \u0010-\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010+\u001a\u0004\b/\u00100R\u001c\u00103\u001a\n 2*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00109\u001a\u0002088\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010+\u001a\u0004\b;\u0010<R&\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00140>8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u0010+\u001a\u0004\bA\u0010BR\"\u0010D\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010+\u001a\u0004\bF\u0010GR(\u0010J\u001a\u00020I8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bJ\u0010K\u0012\u0004\bP\u0010+\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010Q\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bW\u0010+\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR(\u0010X\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bX\u0010Y\u0012\u0004\b]\u0010+\u001a\u0004\bX\u0010Z\"\u0004\b[\u0010\\R(\u0010_\u001a\u00020^8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b_\u0010`\u0012\u0004\be\u0010+\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d¨\u0006m"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager;", "", "Landroid/content/Context;", "context", "", "isGeofencesEnabledFromEnvironment", "reRegisterGeofences", "Lcom/amazon/aps/iva/kb0/q;", "setUpGeofences", "Landroid/app/PendingIntent;", "geofenceRequestIntent", "tearDownGeofences", "Lcom/braze/models/IBrazeLocation;", FirebaseAnalytics.Param.LOCATION, "requestGeofenceRefresh", "ignoreRateLimit", "Lbo/app/y4;", "serverConfig", "configureFromServerConfig", "", "Lcom/braze/models/BrazeGeofence;", "geofenceList", "registerGeofences", "onLocationRequestComplete", "requestSingleLocationUpdateFromGooglePlay", "registerGeofencesWithGooglePlay", "Lbo/app/r1;", "brazeManager", "Lbo/app/r1;", "getBrazeManager", "()Lbo/app/r1;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lbo/app/a5;", "serverConfigStorageProvider", "Lbo/app/a5;", "Lbo/app/l;", "brazeGeofenceApi", "Lbo/app/l;", "getBrazeGeofenceApi", "()Lbo/app/l;", "getBrazeGeofenceApi$annotations", "()V", "Lbo/app/n;", "brazeLocationApi", "Lbo/app/n;", "getBrazeLocationApi", "()Lbo/app/n;", "getBrazeLocationApi$annotations", "kotlin.jvm.PlatformType", "applicationContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "geofenceListLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/content/SharedPreferences;", "geofenceStorageSharedPreferences", "Landroid/content/SharedPreferences;", "getGeofenceStorageSharedPreferences", "()Landroid/content/SharedPreferences;", "getGeofenceStorageSharedPreferences$annotations", "", "brazeGeofences", "Ljava/util/List;", "getBrazeGeofences", "()Ljava/util/List;", "getBrazeGeofences$annotations", "geofenceTransitionPendingIntent", "Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent", "()Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent$annotations", "Lbo/app/m;", "brazeGeofenceReEligibilityManager", "Lbo/app/m;", "getBrazeGeofenceReEligibilityManager", "()Lbo/app/m;", "setBrazeGeofenceReEligibilityManager", "(Lbo/app/m;)V", "getBrazeGeofenceReEligibilityManager$annotations", "geofenceRequestLocation", "Lcom/braze/models/IBrazeLocation;", "getGeofenceRequestLocation", "()Lcom/braze/models/IBrazeLocation;", "setGeofenceRequestLocation", "(Lcom/braze/models/IBrazeLocation;)V", "getGeofenceRequestLocation$annotations", "isGeofencesEnabled", "Z", "()Z", "setGeofencesEnabled", "(Z)V", "isGeofencesEnabled$annotations", "", "maxNumToRegister", "I", "getMaxNumToRegister", "()I", "setMaxNumToRegister", "(I)V", "getMaxNumToRegister$annotations", "", "apiKey", "Lbo/app/z1;", "internalIEventMessenger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lbo/app/r1;Lcom/braze/configuration/BrazeConfigurationProvider;Lbo/app/a5;Lbo/app/z1;)V", "Companion", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeGeofenceManager {
    public static final Companion Companion = new Companion(null);
    private final Context applicationContext;
    private final bo.app.l brazeGeofenceApi;
    private bo.app.m brazeGeofenceReEligibilityManager;
    private final List<BrazeGeofence> brazeGeofences;
    private final bo.app.n brazeLocationApi;
    private final r1 brazeManager;
    private final BrazeConfigurationProvider configurationProvider;
    private final ReentrantLock geofenceListLock;
    private IBrazeLocation geofenceRequestLocation;
    private final SharedPreferences geofenceStorageSharedPreferences;
    private final PendingIntent geofenceTransitionPendingIntent;
    private boolean isGeofencesEnabled;
    private int maxNumToRegister;
    private final a5 serverConfigStorageProvider;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager$Companion;", "", "", "apiKey", "getGeofenceSharedPreferencesName", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getGeofencesEnabledFromConfiguration", "Lbo/app/a5;", "serverConfigStorageProvider", "getGeofencesEnabledFromServerConfig", "", "getMaxNumToRegister", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "Lcom/braze/models/BrazeGeofence;", "retrieveBrazeGeofencesFromLocalStorage", "GEOFENCE_STORAGE_SHARED_PREFS_LOCATION", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Geofences enabled in server configuration.";
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
                return "Geofences explicitly disabled via server configuration.";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final c b = new c();

            public c() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Geofences implicitly disabled via server configuration.";
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
                return "Did not find stored geofences.";
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
                return "Failed to find stored geofence keys.";
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return defpackage.b.c(new StringBuilder("Received null or blank serialized geofence string for geofence id "), this.b, " from shared preferences. Not parsing.");
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
                return "Encountered Json exception while parsing stored geofence: " + this.b;
            }
        }

        /* loaded from: classes.dex */
        public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Encountered unexpected exception while parsing stored geofence: " + this.b;
            }
        }

        public /* synthetic */ Companion(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final String getGeofenceSharedPreferencesName(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "apiKey");
            return "com.appboy.managers.geofences.storage.".concat(str);
        }

        public final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider brazeConfigurationProvider) {
            com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
            return brazeConfigurationProvider.isGeofencesEnabled();
        }

        public final boolean getGeofencesEnabledFromServerConfig(a5 a5Var) {
            com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
            if (a5Var.s()) {
                if (a5Var.r()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
                    return true;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, b.b, 2, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
            return false;
        }

        public final int getMaxNumToRegister(a5 a5Var) {
            com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
            if (a5Var.i() > 0) {
                return a5Var.i();
            }
            return 20;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006a A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<com.braze.models.BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage(android.content.SharedPreferences r15) {
            /*
                r14 = this;
                java.lang.String r0 = "sharedPreferences"
                com.amazon.aps.iva.yb0.j.f(r15, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Map r1 = r15.getAll()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1b
                boolean r4 = r1.isEmpty()
                if (r4 == 0) goto L19
                goto L1b
            L19:
                r4 = r2
                goto L1c
            L1b:
                r4 = r3
            L1c:
                if (r4 == 0) goto L2b
                com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.managers.BrazeGeofenceManager$Companion$d r9 = com.braze.managers.BrazeGeofenceManager.Companion.d.b
                r7 = 0
                r8 = 0
                r10 = 3
                r11 = 0
                r6 = r14
                com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11)
                return r0
            L2b:
                java.util.Set r1 = r1.keySet()
                boolean r4 = r1.isEmpty()
                if (r4 == 0) goto L43
                com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.W
                com.braze.managers.BrazeGeofenceManager$Companion$e r9 = com.braze.managers.BrazeGeofenceManager.Companion.e.b
                r8 = 0
                r10 = 2
                r11 = 0
                r6 = r14
                com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11)
                return r0
            L43:
                java.util.Iterator r1 = r1.iterator()
            L47:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto La3
                java.lang.Object r4 = r1.next()
                java.lang.String r4 = (java.lang.String) r4
                r5 = 0
                java.lang.String r5 = r15.getString(r4, r5)
                if (r5 == 0) goto L67
                boolean r6 = com.amazon.aps.iva.oe0.m.b0(r5)     // Catch: java.lang.Exception -> L63 com.amazon.aps.iva.if0.b -> L65
                if (r6 == 0) goto L61
                goto L67
            L61:
                r6 = r2
                goto L68
            L63:
                r4 = move-exception
                goto L89
            L65:
                r4 = move-exception
                goto L96
            L67:
                r6 = r3
            L68:
                if (r6 == 0) goto L7b
                com.braze.support.BrazeLogger r7 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L63 com.amazon.aps.iva.if0.b -> L65
                com.braze.support.BrazeLogger$Priority r9 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> L63 com.amazon.aps.iva.if0.b -> L65
                r10 = 0
                com.braze.managers.BrazeGeofenceManager$Companion$f r11 = new com.braze.managers.BrazeGeofenceManager$Companion$f     // Catch: java.lang.Exception -> L63 com.amazon.aps.iva.if0.b -> L65
                r11.<init>(r4)     // Catch: java.lang.Exception -> L63 com.amazon.aps.iva.if0.b -> L65
                r12 = 2
                r13 = 0
                r8 = r14
                com.braze.support.BrazeLogger.brazelog$default(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L63 com.amazon.aps.iva.if0.b -> L65
                goto L47
            L7b:
                com.amazon.aps.iva.if0.c r4 = new com.amazon.aps.iva.if0.c     // Catch: java.lang.Exception -> L63 com.amazon.aps.iva.if0.b -> L65
                r4.<init>(r5)     // Catch: java.lang.Exception -> L63 com.amazon.aps.iva.if0.b -> L65
                com.braze.models.BrazeGeofence r6 = new com.braze.models.BrazeGeofence     // Catch: java.lang.Exception -> L63 com.amazon.aps.iva.if0.b -> L65
                r6.<init>(r4)     // Catch: java.lang.Exception -> L63 com.amazon.aps.iva.if0.b -> L65
                r0.add(r6)     // Catch: java.lang.Exception -> L63 com.amazon.aps.iva.if0.b -> L65
                goto L47
            L89:
                com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.E
                com.braze.managers.BrazeGeofenceManager$Companion$h r8 = new com.braze.managers.BrazeGeofenceManager$Companion$h
                r8.<init>(r5)
                r6.brazelog(r14, r7, r4, r8)
                goto L47
            L96:
                com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.E
                com.braze.managers.BrazeGeofenceManager$Companion$g r8 = new com.braze.managers.BrazeGeofenceManager$Companion$g
                r8.<init>(r5)
                r6.brazelog(r14, r7, r4, r8)
                goto L47
            La3:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.BrazeGeofenceManager.Companion.retrieveBrazeGeofencesFromLocalStorage(android.content.SharedPreferences):java.util.List");
        }

        private Companion() {
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "***Geofence API not found. Please include the android-sdk-location module***";
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a0 b = new a0();

        public a0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Geofences not set up.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.e4.e.c(new StringBuilder("Geofences enabled server config value "), this.b, " received.");
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final b0 b = new b0();

        public b0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not get pending intent to setup geofences";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Geofences enabled status newly set to " + BrazeGeofenceManager.this.isGeofencesEnabled() + " during server config update.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final c0 b = new c0();

        public c0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Tearing down geofences.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.e4.e.c(new StringBuilder("Geofences enabled status of `"), this.b, "` was unchanged during server config update.");
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final d0 b = new d0();

        public d0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Unregistering any Braze geofences from Google Play Services.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Max number to register newly set to " + BrazeGeofenceManager.this.getMaxNumToRegister() + " via server config.";
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
            return "Deleting locally stored geofences.";
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
            return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
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
            return "Fine grained location permissions not found. Geofences not enabled.";
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
            return "Background location access permission not found. Geofences not enabled.";
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
            return "Google Play Services not available. Geofences not enabled.";
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
            return "Braze Geofence API is not available";
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
            return "Google Play Services Location API not found. Geofences not enabled.";
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
            return "Location permissions granted and Google Play Services available. Braze Geofencing enabled via config.";
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ IBrazeLocation b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(IBrazeLocation iBrazeLocation) {
            super(0);
            this.b = iBrazeLocation;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Single location request was successful, requesting Geofence refresh. Location:\n " + this.b;
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
            return "Single location request was unsuccessful, not storing last updated time.";
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final s b = new s();

        public s() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not adding new geofences to local storage.";
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(List list) {
            super(0);
            this.b = list;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Received new geofence list of size: " + this.b.size();
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public u() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Reached maximum number of new geofences: " + BrazeGeofenceManager.this.getMaxNumToRegister();
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ BrazeGeofence b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(BrazeGeofence brazeGeofence) {
            super(0);
            this.b = brazeGeofence;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Adding new geofence to local storage: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public w() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Added " + BrazeGeofenceManager.this.getBrazeGeofences().size() + " new geofences to local storage.";
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final x b = new x();

        public x() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final y b = new y();

        public y() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        public z() {
            super(1);
        }

        public final void a(IBrazeLocation iBrazeLocation) {
            com.amazon.aps.iva.yb0.j.f(iBrazeLocation, FirebaseAnalytics.Param.LOCATION);
            BrazeGeofenceManager.this.onLocationRequestComplete(iBrazeLocation);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IBrazeLocation) obj);
            return q.a;
        }
    }

    public BrazeGeofenceManager(Context context, String str, r1 r1Var, BrazeConfigurationProvider brazeConfigurationProvider, a5 a5Var, z1 z1Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "apiKey");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalIEventMessenger");
        this.brazeManager = r1Var;
        this.configurationProvider = brazeConfigurationProvider;
        this.serverConfigStorageProvider = a5Var;
        bo.app.l lVar = new bo.app.l();
        this.brazeGeofenceApi = lVar;
        this.brazeLocationApi = new bo.app.n(context, com.braze.managers.a.d.a(brazeConfigurationProvider), brazeConfigurationProvider);
        this.applicationContext = context.getApplicationContext();
        this.geofenceListLock = new ReentrantLock();
        Companion companion = Companion;
        boolean z2 = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(companion.getGeofenceSharedPreferencesName(str), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.geofenceStorageSharedPreferences = sharedPreferences;
        this.brazeGeofences = com.amazon.aps.iva.lb0.x.Z0(companion.retrieveBrazeGeofencesFromLocalStorage(sharedPreferences));
        this.geofenceTransitionPendingIntent = lVar.b(context);
        this.brazeGeofenceReEligibilityManager = new bo.app.m(context, str, a5Var, z1Var);
        if (companion.getGeofencesEnabledFromServerConfig(a5Var) && isGeofencesEnabledFromEnvironment(context) && lVar.a()) {
            z2 = true;
        }
        this.isGeofencesEnabled = z2;
        this.maxNumToRegister = companion.getMaxNumToRegister(a5Var);
        if (!lVar.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
        }
        setUpGeofences(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void configureFromServerConfig(bo.app.y4 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "serverConfig"
            com.amazon.aps.iva.yb0.j.f(r12, r0)
            boolean r0 = r12.k()
            com.braze.support.BrazeLogger r8 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.managers.BrazeGeofenceManager$b r5 = new com.braze.managers.BrazeGeofenceManager$b
            r5.<init>(r0)
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r1 = r8
            r2 = r11
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7)
            r9 = 1
            r10 = 0
            if (r0 == 0) goto L34
            android.content.Context r0 = r11.applicationContext
            java.lang.String r1 = "applicationContext"
            com.amazon.aps.iva.yb0.j.e(r0, r1)
            boolean r0 = r11.isGeofencesEnabledFromEnvironment(r0)
            if (r0 == 0) goto L34
            bo.app.l r0 = r11.brazeGeofenceApi
            boolean r0 = r0.a()
            if (r0 == 0) goto L34
            r0 = r9
            goto L35
        L34:
            r0 = r10
        L35:
            boolean r1 = r11.isGeofencesEnabled
            if (r0 == r1) goto L63
            r11.isGeofencesEnabled = r0
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
            com.braze.managers.BrazeGeofenceManager$c r5 = new com.braze.managers.BrazeGeofenceManager$c
            r5.<init>()
            r4 = 0
            r6 = 2
            r7 = 0
            r1 = r8
            r2 = r11
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r11.isGeofencesEnabled
            if (r0 == 0) goto L5d
            r11.setUpGeofences(r10)
            com.braze.configuration.BrazeConfigurationProvider r0 = r11.configurationProvider
            boolean r0 = r0.isAutomaticGeofenceRequestsEnabled()
            if (r0 == 0) goto L71
            r11.requestGeofenceRefresh(r9)
            goto L71
        L5d:
            android.app.PendingIntent r0 = r11.geofenceTransitionPendingIntent
            r11.tearDownGeofences(r0)
            goto L71
        L63:
            com.braze.managers.BrazeGeofenceManager$d r5 = new com.braze.managers.BrazeGeofenceManager$d
            r5.<init>(r0)
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r1 = r8
            r2 = r11
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7)
        L71:
            int r0 = r12.m()
            if (r0 < 0) goto L88
            r11.maxNumToRegister = r0
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
            com.braze.managers.BrazeGeofenceManager$e r5 = new com.braze.managers.BrazeGeofenceManager$e
            r5.<init>()
            r4 = 0
            r6 = 2
            r7 = 0
            r1 = r8
            r2 = r11
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7)
        L88:
            bo.app.m r0 = r11.brazeGeofenceReEligibilityManager
            r0.a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.BrazeGeofenceManager.configureFromServerConfig(bo.app.y4):void");
    }

    public final List<BrazeGeofence> getBrazeGeofences() {
        return this.brazeGeofences;
    }

    public final int getMaxNumToRegister() {
        return this.maxNumToRegister;
    }

    public final boolean isGeofencesEnabled() {
        return this.isGeofencesEnabled;
    }

    public final boolean isGeofencesEnabledFromEnvironment(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        if (!Companion.getGeofencesEnabledFromConfiguration(this.configurationProvider)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.b, 3, (Object) null);
            return false;
        } else if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, i.b, 2, (Object) null);
            return false;
        } else if (Build.VERSION.SDK_INT >= 29 && !PermissionUtils.hasPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, j.b, 2, (Object) null);
            return false;
        } else if (!f.a(context)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, k.b, 3, (Object) null);
            return false;
        } else if (!this.brazeGeofenceApi.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, l.b, 3, (Object) null);
            return false;
        } else {
            try {
                Class.forName("com.google.android.gms.location.LocationServices", false, BrazeGeofenceManager.class.getClassLoader());
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, n.b, 3, (Object) null);
                return true;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, m.b, 3, (Object) null);
                return false;
            }
        }
    }

    public void onLocationRequestComplete(IBrazeLocation iBrazeLocation) {
        if (iBrazeLocation != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new o(iBrazeLocation), 3, (Object) null);
            requestGeofenceRefresh(iBrazeLocation);
            this.brazeGeofenceReEligibilityManager.a(DateTimeUtils.nowInSeconds());
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, p.b, 3, (Object) null);
    }

    public void registerGeofences(List<BrazeGeofence> list) {
        com.amazon.aps.iva.yb0.j.f(list, "geofenceList");
        ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(list);
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, s.b, 2, (Object) null);
            return;
        }
        if (this.geofenceRequestLocation != null) {
            Iterator it = Z0.iterator();
            while (it.hasNext()) {
                BrazeGeofence brazeGeofence = (BrazeGeofence) it.next();
                IBrazeLocation iBrazeLocation = this.geofenceRequestLocation;
                if (iBrazeLocation != null) {
                    brazeGeofence.setDistanceFromGeofenceRefresh(z2.a(iBrazeLocation.getLatitude(), iBrazeLocation.getLongitude(), brazeGeofence.getLatitude(), brazeGeofence.getLongitude()));
                }
            }
            if (Z0.size() > 1) {
                Collections.sort(Z0);
            }
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new t(Z0), 3, (Object) null);
            SharedPreferences.Editor edit = this.geofenceStorageSharedPreferences.edit();
            edit.clear();
            this.brazeGeofences.clear();
            Iterator it2 = Z0.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BrazeGeofence brazeGeofence2 = (BrazeGeofence) it2.next();
                if (i2 == this.maxNumToRegister) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new u(), 3, (Object) null);
                    break;
                }
                this.brazeGeofences.add(brazeGeofence2);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new v(brazeGeofence2), 3, (Object) null);
                edit.putString(brazeGeofence2.getId(), brazeGeofence2.forJsonPut().toString());
                i2++;
            }
            edit.apply();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new w(), 3, (Object) null);
            q qVar = q.a;
            reentrantLock.unlock();
            this.brazeGeofenceReEligibilityManager.a(Z0);
            setUpGeofences(true);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void registerGeofencesWithGooglePlay(List<BrazeGeofence> list, PendingIntent pendingIntent) {
        com.amazon.aps.iva.yb0.j.f(list, "geofenceList");
        com.amazon.aps.iva.yb0.j.f(pendingIntent, "geofenceRequestIntent");
        bo.app.l lVar = this.brazeGeofenceApi;
        Context context = this.applicationContext;
        com.amazon.aps.iva.yb0.j.e(context, "applicationContext");
        lVar.a(context, list, pendingIntent);
    }

    public void requestGeofenceRefresh(IBrazeLocation iBrazeLocation) {
        com.amazon.aps.iva.yb0.j.f(iBrazeLocation, FirebaseAnalytics.Param.LOCATION);
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, x.b, 3, (Object) null);
            return;
        }
        this.geofenceRequestLocation = iBrazeLocation;
        this.brazeManager.a(iBrazeLocation);
    }

    public final void requestSingleLocationUpdateFromGooglePlay() {
        this.brazeLocationApi.a(new z());
    }

    public final void setUpGeofences(boolean z2) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, a0.b, 3, (Object) null);
            return;
        }
        PendingIntent pendingIntent = this.geofenceTransitionPendingIntent;
        if (pendingIntent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b0.b, 3, (Object) null);
        } else if (z2) {
            ReentrantLock reentrantLock = this.geofenceListLock;
            reentrantLock.lock();
            try {
                registerGeofencesWithGooglePlay(this.brazeGeofences, pendingIntent);
                q qVar = q.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void tearDownGeofences(PendingIntent pendingIntent) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, c0.b, 3, (Object) null);
        if (pendingIntent != null) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, d0.b, 3, (Object) null);
            bo.app.l lVar = this.brazeGeofenceApi;
            Context context = this.applicationContext;
            com.amazon.aps.iva.yb0.j.e(context, "applicationContext");
            lVar.a(context, pendingIntent);
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, e0.b, 3, (Object) null);
            this.geofenceStorageSharedPreferences.edit().clear().apply();
            this.brazeGeofences.clear();
            q qVar = q.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void requestGeofenceRefresh(boolean z2) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, y.b, 3, (Object) null);
        } else if (this.brazeGeofenceReEligibilityManager.a(z2, DateTimeUtils.nowInSeconds())) {
            requestSingleLocationUpdateFromGooglePlay();
        }
    }
}
