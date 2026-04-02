package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.WebContentUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class u5 implements j2 {
    public static final a e = new a(null);
    private final SharedPreferences a;
    private final Map b;
    private final Map c;
    private final File d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: bo.app.u5$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0084a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ File[] b;

            /* renamed from: bo.app.u5$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0085a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
                public static final C0085a b = new C0085a();

                public C0085a() {
                    super(1);
                }

                @Override // com.amazon.aps.iva.xb0.l
                /* renamed from: a */
                public final CharSequence invoke(File file) {
                    String name = file.getName();
                    com.amazon.aps.iva.yb0.j.e(name, "it.name");
                    return name;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0084a(File[] fileArr) {
                super(0);
                this.b = fileArr;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Local triggered asset directory contains files: ".concat(com.amazon.aps.iva.lb0.o.V(this.b, " , ", null, null, C0085a.b, 30));
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ File b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(File file) {
                super(0);
                this.b = file;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Deleting obsolete asset '" + this.b.getPath() + "' from filesystem.";
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
                return "Exception while deleting obsolete assets from filesystem.";
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return defpackage.b.c(new StringBuilder("Not removing local path for remote path "), this.b, " from cache because it is being preserved until the end of the app run.");
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
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
                StringBuilder sb = new StringBuilder("Removing obsolete local path ");
                sb.append(this.b);
                sb.append(" for obsolete remote path ");
                return defpackage.b.c(sb, this.c, " from cache.");
            }
        }

        /* loaded from: classes.dex */
        public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ com.amazon.aps.iva.yb0.d0 b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(com.amazon.aps.iva.yb0.d0 d0Var, String str) {
                super(0);
                this.b = d0Var;
                this.c = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Using file extension " + ((String) this.b.b) + " for remote asset url: " + this.c;
            }
        }

        /* loaded from: classes.dex */
        public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                StringBuilder sb = new StringBuilder("Retrieving trigger local asset path '");
                sb.append(this.b);
                sb.append("' from local storage for remote path '");
                return com.amazon.aps.iva.o0.t1.b(sb, this.c, '\'');
            }
        }

        /* loaded from: classes.dex */
        public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return com.amazon.aps.iva.o0.t1.b(new StringBuilder("Encountered unexpected exception while parsing stored triggered action local assets on remote asset '"), this.b, '\'');
            }
        }

        /* loaded from: classes.dex */
        public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ q2 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(q2 q2Var) {
                super(0);
                this.b = q2Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Pre-fetch off for triggered action " + this.b.getId() + ". Not pre-fetching assets.";
            }
        }

        /* loaded from: classes.dex */
        public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ q2 b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(q2 q2Var, String str) {
                super(0);
                this.b = q2Var;
                this.c = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                StringBuilder sb = new StringBuilder("Received new remote path for triggered action ");
                sb.append(this.b.getId());
                sb.append(" at ");
                return com.amazon.aps.iva.o0.t1.b(sb, this.c, '.');
            }
        }

        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final void a(File file, Map map, Map map2) {
            com.amazon.aps.iva.yb0.j.f(file, "triggeredAssetDirectory");
            com.amazon.aps.iva.yb0.j.f(map, "remoteToLocalAssetsMap");
            com.amazon.aps.iva.yb0.j.f(map2, "preservedLocalAssetMap");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new C0084a(listFiles), 2, (Object) null);
            try {
                ArrayList arrayList = new ArrayList();
                for (File file2 : listFiles) {
                    if (!map.containsValue(file2.getPath())) {
                        arrayList.add(file2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!map2.containsValue(((File) next).getPath())) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    File file3 = (File) it2.next();
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, u5.e, (BrazeLogger.Priority) null, (Throwable) null, new b(file3), 3, (Object) null);
                    com.amazon.aps.iva.yb0.j.e(file3, "obsoleteFile");
                    BrazeFileUtils.deleteFileOrDirectory(file3);
                }
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, c.b);
            }
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object, java.lang.String] */
        public final String b(String str) {
            boolean z;
            int t0;
            com.amazon.aps.iva.yb0.j.f(str, "remoteAssetUrl");
            com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
            d0Var.b = "";
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String lastPathSegment = parse.getLastPathSegment();
                if (lastPathSegment != null && lastPathSegment.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && (t0 = com.amazon.aps.iva.oe0.q.t0(lastPathSegment, '.', 0, 6)) > -1) {
                    ?? substring = lastPathSegment.substring(t0);
                    com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String).substring(startIndex)");
                    d0Var.b = substring;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, u5.e, BrazeLogger.Priority.V, (Throwable) null, new g(d0Var, str), 2, (Object) null);
                }
            }
            return IntentUtils.getRequestCode() + ((String) d0Var.b);
        }

        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0046 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0027 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Map a(android.content.SharedPreferences r15) {
            /*
                r14 = this;
                java.lang.String r0 = "storagePrefs"
                com.amazon.aps.iva.yb0.j.f(r15, r0)
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
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
                if (r4 == 0) goto L1f
                return r0
            L1f:
                java.util.Set r1 = r1.keySet()
                java.util.Iterator r1 = r1.iterator()
            L27:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L6c
                java.lang.Object r4 = r1.next()
                java.lang.String r4 = (java.lang.String) r4
                r5 = 0
                java.lang.String r5 = r15.getString(r4, r5)     // Catch: java.lang.Exception -> L5e
                if (r5 == 0) goto L43
                boolean r6 = com.amazon.aps.iva.oe0.m.b0(r5)     // Catch: java.lang.Exception -> L5e
                if (r6 == 0) goto L41
                goto L43
            L41:
                r6 = r2
                goto L44
            L43:
                r6 = r3
            L44:
                if (r6 != 0) goto L27
                com.braze.support.BrazeLogger r7 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L5e
                r9 = 0
                r10 = 0
                bo.app.u5$a$h r11 = new bo.app.u5$a$h     // Catch: java.lang.Exception -> L5e
                r11.<init>(r5, r4)     // Catch: java.lang.Exception -> L5e
                r12 = 3
                r13 = 0
                r8 = r14
                com.braze.support.BrazeLogger.brazelog$default(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L5e
                java.lang.String r6 = "remoteAssetKey"
                com.amazon.aps.iva.yb0.j.e(r4, r6)     // Catch: java.lang.Exception -> L5e
                r0.put(r4, r5)     // Catch: java.lang.Exception -> L5e
                goto L27
            L5e:
                r5 = move-exception
                com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.E
                bo.app.u5$a$i r8 = new bo.app.u5$a$i
                r8.<init>(r4)
                r6.brazelog(r14, r7, r5, r8)
                goto L27
            L6c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bo.app.u5.a.a(android.content.SharedPreferences):java.util.Map");
        }

        public final void a(SharedPreferences.Editor editor, Map map, Set set, Map map2) {
            com.amazon.aps.iva.yb0.j.f(editor, "editor");
            com.amazon.aps.iva.yb0.j.f(map, "localAssetPaths");
            com.amazon.aps.iva.yb0.j.f(set, "newRemotePathStrings");
            com.amazon.aps.iva.yb0.j.f(map2, "preservedLocalAssetPathMap");
            Iterator it = new HashSet(map.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (map2.containsKey(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(str), 3, (Object) null);
                } else if (!set.contains(str)) {
                    map.remove(str);
                    editor.remove(str);
                    String str2 = (String) map.get(str);
                    if (!(str2 == null || com.amazon.aps.iva.oe0.m.b0(str2))) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(str2, str), 3, (Object) null);
                        BrazeFileUtils.deleteFileOrDirectory(new File(str2));
                    }
                }
            }
        }

        public final boolean a(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "path");
            return new File(str).exists();
        }

        public final com.amazon.aps.iva.kb0.j a(List list) {
            com.amazon.aps.iva.yb0.j.f(list, "triggeredActions");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q2 q2Var = (q2) it.next();
                if (!q2Var.d()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(q2Var), 3, (Object) null);
                } else {
                    for (h4 h4Var : q2Var.l()) {
                        String b2 = h4Var.b();
                        if (!com.amazon.aps.iva.oe0.m.b0(b2)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new k(q2Var, b2), 3, (Object) null);
                            linkedHashSet.add(h4Var);
                            linkedHashSet2.add(b2);
                        }
                    }
                }
            }
            return new com.amazon.aps.iva.kb0.j(linkedHashSet, linkedHashSet2);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i4.values().length];
            try {
                iArr[i4.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i4.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i4.FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Storing local triggered action html zip asset at local path " + this.b + " for remote path " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Failed to store html zip asset for remote path "), this.b, ". Not storing local asset");
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
            return "Could not download " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Map c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Map map) {
            super(0);
            this.b = str;
            this.c = map;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Not caching " + this.b + " due to headers " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Uri b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Uri uri, String str) {
            super(0);
            this.b = uri;
            this.c = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Storing local triggered action asset at local path " + this.b.getPath() + " for remote path " + this.c;
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
            return defpackage.b.c(new StringBuilder("Failed to store asset for remote path "), this.b, ". Not storing local asset");
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(q2 q2Var) {
            super(0);
            this.b = q2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: " + this.b.getId();
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Found local asset at path " + this.b + " for remote asset at path: " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not find local asset for remote path " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(q2 q2Var) {
            super(0);
            this.b = q2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "No local assets found for action id: " + this.b.getId();
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Adding new local path '");
            sb.append(this.b);
            sb.append("' for remote path '");
            return defpackage.b.c(sb, this.c, "' to cache.");
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to add new local path for remote path " + this.b;
        }
    }

    public u5(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.triggers.local_assets.".concat(str), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
        this.b = e.a(sharedPreferences);
        this.c = new LinkedHashMap();
        this.d = new File(context.getCacheDir().getPath() + "/ab_triggers");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058 A[SYNTHETIC] */
    @Override // bo.app.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.List r12) {
        /*
            r11 = this;
            java.lang.String r0 = "triggeredActions"
            com.amazon.aps.iva.yb0.j.f(r12, r0)
            bo.app.u5$a r0 = bo.app.u5.e
            com.amazon.aps.iva.kb0.j r12 = r0.a(r12)
            A r1 = r12.b
            java.util.Set r1 = (java.util.Set) r1
            B r12 = r12.c
            java.util.Set r12 = (java.util.Set) r12
            android.content.SharedPreferences r2 = r11.a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "localAssetEditor"
            com.amazon.aps.iva.yb0.j.e(r2, r3)
            java.util.Map r3 = r11.b
            java.util.Map r4 = r11.c
            r0.a(r2, r3, r12, r4)
            java.io.File r12 = r11.d
            java.util.Map r3 = r11.b
            java.util.Map r4 = r11.c
            r0.a(r12, r3, r4)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r0 = r1.iterator()
        L37:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            r3 = r1
            bo.app.h4 r3 = (bo.app.h4) r3
            java.util.Map r4 = r11.b
            java.lang.String r3 = r3.b()
            boolean r3 = r4.containsKey(r3)
            if (r3 != 0) goto L37
            r12.add(r1)
            goto L37
        L54:
            java.util.Iterator r12 = r12.iterator()
        L58:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r12.next()
            bo.app.h4 r0 = (bo.app.h4) r0
            java.lang.String r1 = r0.b()
            java.lang.String r0 = r11.a(r0)     // Catch: java.lang.Exception -> L92
            if (r0 == 0) goto L77
            boolean r3 = com.amazon.aps.iva.oe0.m.b0(r0)     // Catch: java.lang.Exception -> L92
            if (r3 == 0) goto L75
            goto L77
        L75:
            r3 = 0
            goto L78
        L77:
            r3 = 1
        L78:
            if (r3 != 0) goto L58
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L92
            r6 = 0
            r7 = 0
            bo.app.u5$m r8 = new bo.app.u5$m     // Catch: java.lang.Exception -> L92
            r8.<init>(r0, r1)     // Catch: java.lang.Exception -> L92
            r9 = 3
            r10 = 0
            r5 = r11
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L92
            java.util.Map r3 = r11.b     // Catch: java.lang.Exception -> L92
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L92
            r2.putString(r1, r0)     // Catch: java.lang.Exception -> L92
            goto L58
        L92:
            r0 = move-exception
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.E
            bo.app.u5$n r5 = new bo.app.u5$n
            r5.<init>(r1)
            r3.brazelog(r11, r4, r0, r5)
            goto L58
        La0:
            r2.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.u5.a(java.util.List):void");
    }

    @Override // bo.app.j2
    public Map a(q2 q2Var) {
        com.amazon.aps.iva.yb0.j.f(q2Var, "triggeredAction");
        if (!q2Var.d()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(q2Var), 3, (Object) null);
            return com.amazon.aps.iva.lb0.a0.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (h4 h4Var : q2Var.l()) {
            String b2 = h4Var.b();
            String str = (String) this.b.get(b2);
            if (str != null && e.a(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(str, b2), 3, (Object) null);
                this.c.put(b2, str);
                linkedHashMap.put(b2, str);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new k(b2), 2, (Object) null);
            }
        }
        if (linkedHashMap.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new l(q2Var), 2, (Object) null);
        }
        return linkedHashMap;
    }

    public final String a(h4 h4Var) {
        Long a2;
        com.amazon.aps.iva.yb0.j.f(h4Var, "remotePath");
        String b2 = h4Var.b();
        int i2 = b.a[h4Var.a().ordinal()];
        boolean z = true;
        if (i2 == 1) {
            String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(this.d, b2);
            if (localHtmlUrlFromRemoteUrl != null && !com.amazon.aps.iva.oe0.m.b0(localHtmlUrlFromRemoteUrl)) {
                z = false;
            }
            if (!z) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(localHtmlUrlFromRemoteUrl, b2), 2, (Object) null);
                return localHtmlUrlFromRemoteUrl;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(b2), 3, (Object) null);
            return null;
        } else if (i2 != 2 && i2 != 3) {
            throw new com.amazon.aps.iva.kb0.h();
        } else {
            String b3 = e.b(b2);
            try {
                String file = this.d.toString();
                com.amazon.aps.iva.yb0.j.e(file, "triggeredAssetDirectory.toString()");
                com.amazon.aps.iva.kb0.j downloadFileToPath$default = BrazeFileUtils.downloadFileToPath$default(file, b2, b3, null, 8, null);
                File file2 = (File) downloadFileToPath$default.b;
                Map map = (Map) downloadFileToPath$default.c;
                String str = (String) map.get("expires");
                if (str != null && (a2 = com.braze.support.g.a(str)) != null && a2.longValue() <= 0) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(b2, map), 3, (Object) null);
                    return null;
                }
                Uri fromFile = Uri.fromFile(file2);
                if (fromFile != null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new g(fromFile, b2), 2, (Object) null);
                    return fromFile.getPath();
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(b2), 3, (Object) null);
                return null;
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new e(b2));
                return null;
            }
        }
    }
}
