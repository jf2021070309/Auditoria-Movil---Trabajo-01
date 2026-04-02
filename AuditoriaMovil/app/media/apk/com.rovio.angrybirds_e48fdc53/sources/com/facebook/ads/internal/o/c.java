package com.facebook.ads.internal.o;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.ads.internal.o.f;
import com.facebook.ads.internal.p.a.m;
import com.facebook.ads.internal.p.a.n;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.i;
import com.facebook.ads.internal.q.a.l;
import com.facebook.ads.internal.q.c.d;
import java.security.MessageDigest;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
/* loaded from: classes2.dex */
public class c {
    private static final l i = new l();
    private static final ThreadPoolExecutor j = (ThreadPoolExecutor) Executors.newCachedThreadPool(i);
    private final Context a;
    private final com.facebook.ads.internal.l.a c;
    private Map<String, String> d;
    private a e;
    private b f;
    private com.facebook.ads.internal.p.a.a g;
    private final e b = e.a();
    private final String h = d.a();

    /* loaded from: classes2.dex */
    public interface a {
        void a(g gVar);

        void a(com.facebook.ads.internal.protocol.a aVar);
    }

    public c(Context context) {
        this.a = context.getApplicationContext();
        this.c = new com.facebook.ads.internal.l.a(this.a);
    }

    private void a(g gVar) {
        if (this.e != null) {
            this.e.a(gVar);
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.facebook.ads.internal.protocol.a aVar) {
        if (this.e != null) {
            this.e.a(aVar);
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            f a2 = this.b.a(str);
            com.facebook.ads.internal.h.c a3 = a2.a();
            if (a3 != null) {
                this.c.a(a3.b());
                com.facebook.ads.internal.o.a.a(a3.a().d(), this.f);
            }
            switch (a2.b()) {
                case ADS:
                    g gVar = (g) a2;
                    if (a3 != null) {
                        if (a3.a().e()) {
                            com.facebook.ads.internal.o.a.a(str, this.f);
                        }
                        String str2 = this.d != null ? this.d.get("CLIENT_REQUEST_ID") : null;
                        String c = a2.c();
                        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(str2)) {
                            StringBuilder sb = new StringBuilder();
                            for (int i2 = 0; i2 < "qo290s8p6q174sr59pr123o45pr7pp29".length(); i2++) {
                                char charAt = "qo290s8p6q174sr59pr123o45pr7pp29".charAt(i2);
                                if ((charAt >= 'a' && charAt <= 'm') || (charAt >= 'A' && charAt <= 'M')) {
                                    charAt = (char) (charAt + '\r');
                                } else if ((charAt >= 'n' && charAt <= 'z') || (charAt >= 'N' && charAt <= 'Z')) {
                                    charAt = (char) (charAt - '\r');
                                }
                                sb.append(charAt);
                            }
                            byte[] bytes = (str2 + c + sb.toString()).getBytes("iso-8859-1");
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                            messageDigest.update(bytes, 0, bytes.length);
                            if (!a2.d().equals(com.facebook.ads.internal.q.a.h.a(messageDigest.digest()))) {
                                com.facebook.ads.internal.q.d.a.a(new i(), this.a);
                            }
                            byte[] bytes2 = (c + str2 + sb.toString()).getBytes("iso-8859-1");
                            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
                            messageDigest2.update(bytes2, 0, bytes2.length);
                            com.facebook.ads.internal.f.e.a(new com.facebook.ads.internal.f.a(c, com.facebook.ads.internal.q.a.h.a(messageDigest2.digest())), this.a);
                        }
                        if (!TextUtils.isEmpty(a2.e()) && !TextUtils.isEmpty(str2)) {
                            new com.facebook.ads.internal.k.a(this.a, str2, a2.e()).a();
                        }
                    }
                    a(gVar);
                    return;
                case ERROR:
                    h hVar = (h) a2;
                    String f = hVar.f();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(hVar.g(), AdErrorType.ERROR_MESSAGE);
                    if (f != null) {
                        str = f;
                    }
                    a(com.facebook.ads.internal.protocol.a.a(adErrorTypeFromCode, str));
                    return;
                default:
                    a(com.facebook.ads.internal.protocol.a.a(AdErrorType.UNKNOWN_RESPONSE, str));
                    return;
            }
        } catch (Exception e) {
            a(com.facebook.ads.internal.protocol.a.a(AdErrorType.PARSER_FAILURE, e.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.internal.p.a.b b() {
        return new com.facebook.ads.internal.p.a.b() { // from class: com.facebook.ads.internal.o.c.2
            void a(m mVar) {
                com.facebook.ads.internal.o.a.b(c.this.f);
                c.this.g = null;
                try {
                    n a2 = mVar.a();
                    if (a2 != null) {
                        String e = a2.e();
                        f a3 = c.this.b.a(e);
                        if (a3.b() == f.a.ERROR) {
                            h hVar = (h) a3;
                            String f = hVar.f();
                            c.this.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.adErrorTypeFromCode(hVar.g(), AdErrorType.ERROR_MESSAGE), f == null ? e : f));
                            return;
                        }
                    }
                } catch (JSONException e2) {
                }
                c.this.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.NETWORK_ERROR, mVar.getMessage()));
            }

            @Override // com.facebook.ads.internal.p.a.b
            public void a(n nVar) {
                if (nVar != null) {
                    String e = nVar.e();
                    com.facebook.ads.internal.o.a.b(c.this.f);
                    c.this.g = null;
                    c.this.a(e);
                }
            }

            @Override // com.facebook.ads.internal.p.a.b
            public void a(Exception exc) {
                if (m.class.equals(exc.getClass())) {
                    a((m) exc);
                } else {
                    c.this.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.NETWORK_ERROR, exc.getMessage()));
                }
            }
        };
    }

    public void a() {
        if (this.g != null) {
            this.g.c(1);
            this.g.b(1);
            this.g = null;
        }
    }

    public void a(final b bVar) {
        a();
        if (com.facebook.ads.internal.q.c.d.c(this.a) == d.a.NONE) {
            a(new com.facebook.ads.internal.protocol.a(AdErrorType.NETWORK_ERROR, "No network connection"));
            return;
        }
        this.f = bVar;
        com.facebook.ads.internal.g.a.a(this.a);
        if (!com.facebook.ads.internal.o.a.a(bVar)) {
            j.submit(new Runnable() { // from class: com.facebook.ads.internal.o.c.1
                @Override // java.lang.Runnable
                public void run() {
                    com.facebook.ads.internal.c.b.a(c.this.a);
                    if (bVar.e().a()) {
                        try {
                            bVar.e().a(com.facebook.ads.internal.c.b.b);
                        } catch (com.facebook.ads.internal.protocol.b e) {
                            c.this.a(com.facebook.ads.internal.protocol.a.a(e));
                        }
                        c.this.a(bVar.e().b());
                        return;
                    }
                    c.this.d = bVar.f();
                    try {
                        c.this.d.put("M_BANNER_KEY", new String(Base64.encode((c.this.a.getPackageName() + " " + c.this.a.getPackageManager().getInstallerPackageName(c.this.a.getPackageName())).getBytes(), 2)));
                    } catch (Exception e2) {
                    }
                    try {
                        c.this.g = com.facebook.ads.internal.q.c.d.b(c.this.a, bVar.c == com.facebook.ads.internal.protocol.f.NATIVE_250 || bVar.c == com.facebook.ads.internal.protocol.f.NATIVE_UNKNOWN || bVar.c == null);
                        c.this.g.a(c.this.h, c.this.g.b().a(c.this.d), c.this.b());
                    } catch (Exception e3) {
                        c.this.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.AD_REQUEST_FAILED, e3.getMessage()));
                    }
                }
            });
            return;
        }
        String c = com.facebook.ads.internal.o.a.c(bVar);
        if (c != null) {
            a(c);
        } else {
            a(com.facebook.ads.internal.protocol.a.a(AdErrorType.LOAD_TOO_FREQUENTLY, null));
        }
    }

    public void a(a aVar) {
        this.e = aVar;
    }
}
