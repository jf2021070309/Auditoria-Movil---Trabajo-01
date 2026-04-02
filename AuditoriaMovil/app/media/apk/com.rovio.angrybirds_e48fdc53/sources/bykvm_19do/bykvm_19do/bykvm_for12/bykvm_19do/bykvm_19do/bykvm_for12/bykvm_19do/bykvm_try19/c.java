package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_try19;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1.g;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.UUID;
/* loaded from: classes.dex */
public class c implements bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_try19.b {
    private final Context a;
    private final e b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(str);
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(c.this.b.a(), this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends g {
        private final d b;
        private final String c;

        private b(d dVar, String str) {
            super("AdsStats");
            this.b = dVar;
            this.c = str;
        }

        /* synthetic */ b(c cVar, d dVar, String str, a aVar) {
            this(dVar, str);
        }

        private String c(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.c)) ? str.replace("{UID}", this.c).replace("__UID__", this.c) : str;
        }

        String a(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(c.b().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }

        boolean b(String str) {
            return !TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"));
        }

        @Override // java.lang.Runnable
        public void run() {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b = j.m().b();
            if (b == null || j.m().d() == null || !b.f() || !b(this.b.c())) {
                return;
            }
            if (this.b.b() == 0) {
                c.this.b.b(this.b);
                return;
            }
            while (this.b.b() > 0) {
                try {
                    b.j();
                    if (this.b.b() == 5) {
                        c.this.b.a(this.b);
                    }
                } catch (Throwable th) {
                }
                if (!b.a(c.this.a())) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                String c = this.b.c();
                if (b.d() == 0) {
                    c = c(this.b.c());
                    if (this.b.d()) {
                        c = a(c);
                    }
                }
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1.c i = b.i();
                if (i == null) {
                    return;
                }
                i.a("User-Agent", b.k());
                i.a(c);
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1.e eVar = null;
                try {
                    eVar = i.i();
                    b.a(eVar.isSuccess());
                } catch (Throwable th2) {
                }
                if (eVar != null && eVar.isSuccess()) {
                    c.this.b.b(this.b);
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("trackurl", "track success : " + this.b.c());
                    b.a(true, 200, System.currentTimeMillis() - currentTimeMillis);
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("trackurl", "track fail : " + this.b.c());
                d dVar = this.b;
                dVar.a(dVar.b() - 1);
                if (this.b.b() == 0) {
                    c.this.b.b(this.b);
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("trackurl", "track fail and delete : " + this.b.c());
                    return;
                }
                c.this.b.c(this.b);
                if (eVar != null) {
                    b.a(false, eVar.a(), System.currentTimeMillis());
                } else {
                    b.a(false, 0, System.currentTimeMillis());
                }
            }
        }
    }

    public c(Context context, e eVar) {
        this.a = context;
        this.b = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<d> list, String str) {
        if (list == null || list.size() == 0) {
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2 = j.m().b();
        for (d dVar : list) {
            if (b2 != null && b2.a() != null) {
                b2.a().execute(new b(this, dVar, str, null));
            }
        }
    }

    static /* synthetic */ Random b() {
        return c();
    }

    private static Random c() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable th) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public Context a() {
        Context context = this.a;
        return context == null ? j.m().d() : context;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_try19.b
    public void a(String str) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2 = j.m().b();
        if (b2 == null || j.m().d() == null || !b2.f()) {
            return;
        }
        a aVar = new a("trackFailedUrls", str);
        aVar.a(1);
        if (b2.a() != null) {
            b2.a().execute(aVar);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_try19.b
    public void a(String str, List<String> list, boolean z) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2 = j.m().b();
        if (b2 == null || j.m().d() == null || b2.a() == null || !b2.f() || list == null || list.size() == 0) {
            return;
        }
        for (String str2 : list) {
            b2.a().execute(new b(this, new d(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), str2, z, 5), str, null));
        }
    }
}
