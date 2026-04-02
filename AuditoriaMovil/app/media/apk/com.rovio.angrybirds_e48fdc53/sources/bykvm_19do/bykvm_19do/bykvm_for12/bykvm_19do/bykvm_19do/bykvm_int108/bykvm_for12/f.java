package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.y;
import java.net.InetAddress;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class f implements c {
    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.a b;
    private boolean c;
    private b d;
    private Context f;
    private e g;
    private int r;
    private long a = 0;
    private boolean e = false;
    private int h = 0;
    private long i = 19700101000L;
    private int j = 0;
    private HashMap<String, Integer> k = new HashMap<>();
    private HashMap<String, Integer> l = new HashMap<>();
    private int m = 0;
    private HashMap<String, Integer> n = new HashMap<>();
    private HashMap<String, Integer> o = new HashMap<>();
    private boolean p = true;
    private Map<String, Integer> q = new HashMap();
    Handler s = new a(Looper.getMainLooper());

    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 10000) {
                return;
            }
            f.this.b(message.arg1 != 0);
        }
    }

    private f() {
    }

    public f(int i) {
        this.r = i;
    }

    private String a(y yVar) {
        if (yVar == null || yVar.g() == null || yVar.g().o() == null) {
            return "";
        }
        try {
            return InetAddress.getByName(yVar.g().o().getHost()).getHostAddress();
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a0 r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.f.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a0, java.lang.String):void");
    }

    private void a(boolean z, long j) {
        if (this.s.hasMessages(10000)) {
            return;
        }
        Message obtainMessage = this.s.obtainMessage();
        obtainMessage.what = 10000;
        obtainMessage.arg1 = z ? 1 : 0;
        if (j > 0) {
            this.s.sendMessageDelayed(obtainMessage, j);
        } else {
            this.s.sendMessage(obtainMessage);
        }
    }

    private boolean a(int i) {
        if (i >= 100 && i < 1000) {
            d c = c();
            if (c != null && !TextUtils.isEmpty(c.m)) {
                String str = c.m;
                if (!str.contains("" + i)) {
                }
            }
            return false;
        }
        return true;
    }

    private void b(String str) {
        Map<String, String> e;
        if (TextUtils.isEmpty(str) || (e = e()) == null || !e.containsValue(str)) {
            return;
        }
        if (this.q.get(str) == null) {
            this.q.put(str, 1);
        } else {
            this.q.put(str, Integer.valueOf(this.q.get(str).intValue() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        d c = c();
        if (c == null) {
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-doUpdateRemote, " + z);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.a + (c.k * 1000) <= elapsedRealtime) {
            this.a = elapsedRealtime;
            h.a().a(this.r, this.f).a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.e.a(this.f));
        } else if (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a()) {
            String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-doUpdateRemote, time limit，当前时间：" + format + "，下次更新TNC配置剩余倒计时：" + (((this.a + (c.k * 1000)) - elapsedRealtime) / 1000) + "s");
        }
    }

    private boolean b(int i) {
        return i >= 200 && i < 400;
    }

    private boolean c(String str) {
        Map<String, String> e = e();
        if (e == null) {
            return false;
        }
        String str2 = e.get(str);
        if (TextUtils.isEmpty(str2) || this.q.get(str2) == null || this.q.get(str2).intValue() < 3) {
            return false;
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-handleHostMapping, TNC host faild num over limit: " + str);
        return true;
    }

    private void d(String str) {
        if (!TextUtils.isEmpty(str) && this.q.containsKey(str)) {
            this.q.put(str, 0);
        }
    }

    private void i() {
        SharedPreferences sharedPreferences = this.f.getSharedPreferences(f(), 0);
        this.h = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.i = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    private void j() {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-resetTNCControlState");
        this.j = 0;
        this.k.clear();
        this.l.clear();
        this.m = 0;
        this.n.clear();
        this.o.clear();
    }

    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.a a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto Le7
            java.lang.String r0 = "/network/get_network"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto Le7
            java.lang.String r0 = "/get_domains/v4"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto Le7
            java.lang.String r0 = "/ies/speed"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L20
            goto Le7
        L20:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L31
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r1.getProtocol()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r1.getHost()     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r1 = move-exception
            goto L33
        L31:
            r1 = move-exception
            r2 = r0
        L33:
            r1.printStackTrace()
        L36:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto Le7
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4c
            java.lang.String r1 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le7
        L4c:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Le7
            boolean r1 = r6.c(r0)
            java.lang.String r3 = "TNCManager_GroMore"
            if (r1 == 0) goto L6c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Gromore-handleHostMapping, TNC host faild num over limit: "
        L61:
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lda
        L6c:
            java.util.Map r1 = r6.e()
            if (r1 == 0) goto Lde
            boolean r4 = r1.containsKey(r0)
            if (r4 != 0) goto L79
            goto Lde
        L79:
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto Le7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Gromore-handleHostMapping, match, origin: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = "://"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            boolean r2 = r7.startsWith(r0)
            if (r2 == 0) goto Lc9
            java.lang.String r7 = r7.replaceFirst(r0, r1)
        Lc9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Gromore-handleHostMapping, target: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
        Lda:
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a(r3, r0)
            goto Le7
        Lde:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Gromore-handleHostMapping, nomatch: "
            goto L61
        Le7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.f.a(java.lang.String):java.lang.String");
    }

    public void a(Context context, boolean z) {
        synchronized (this) {
            if (!this.e) {
                this.f = context;
                this.p = z;
                this.g = new e(context, z, this.r);
                if (z) {
                    i();
                }
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-initTnc, isMainProc: " + z + " probeCmd: " + this.h + " probeVersion: " + this.i);
                this.b = h.a().a(this.r, this.f);
                this.e = true;
            }
        }
    }

    public void a(y yVar, a0 a0Var) {
        synchronized (this) {
            if (yVar != null && a0Var != null) {
                if (this.p && bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.e.a(this.f)) {
                    URL url = null;
                    try {
                        url = yVar.g().o();
                    } catch (Exception e) {
                    }
                    if (url != null) {
                        String protocol = url.getProtocol();
                        String host = url.getHost();
                        String path = url.getPath();
                        String a2 = a(yVar);
                        int k = a0Var.k();
                        if (("http".equals(protocol) || "https".equals(protocol)) && !TextUtils.isEmpty(a2)) {
                            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-onResponse, url: " + protocol + "://" + host + "#" + a2 + "#" + k);
                            d c = c();
                            if (c != null && c.b) {
                                a(a0Var, host);
                            }
                            if (c != null) {
                                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-onResponse, url matched: " + protocol + "://" + host + "#" + a2 + "#" + k + " " + this.j + "#" + this.k.size() + "#" + this.l.size() + " " + this.m + "#" + this.n.size() + "#" + this.o.size());
                                if (k > 0) {
                                    if (b(k)) {
                                        if (this.j > 0 || this.m > 0) {
                                            j();
                                        }
                                        d(host);
                                    } else if (!a(k)) {
                                        this.m++;
                                        this.n.put(path, 0);
                                        this.o.put(a2, 0);
                                        if (this.m >= c.h && this.n.size() >= c.i && this.o.size() >= c.j) {
                                            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-onResponse, url doUpdate: " + protocol + "://" + host + "#" + a2 + "#" + k);
                                            a(false, 0L);
                                            j();
                                        }
                                        b(host);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(y yVar, Exception exc) {
        d c;
        synchronized (this) {
            if (yVar != null) {
                if (yVar.g() != null && exc != null && this.p && bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.e.a(this.f)) {
                    URL url = null;
                    try {
                        url = yVar.g().o();
                    } catch (Exception e) {
                    }
                    if (url != null) {
                        String protocol = url.getProtocol();
                        String host = url.getHost();
                        String path = url.getPath();
                        String a2 = a(yVar);
                        if (("http".equals(protocol) || "https".equals(protocol)) && (c = c()) != null) {
                            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-onError, url matched: " + protocol + "://" + host + "#" + a2 + "# （mReqToCnt：" + this.j + "）#" + this.k.size() + "#" + this.l.size() + " " + this.m + "#" + this.n.size() + "#" + this.o.size());
                            this.j = this.j + 1;
                            this.k.put(path, 0);
                            this.l.put(a2, 0);
                            if (this.j >= c.e && this.k.size() >= c.f && this.l.size() >= c.g) {
                                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-onError, url doUpate: " + protocol + "://" + host + "#" + a2);
                                a(false, 0L);
                                j();
                            }
                            b(host);
                        }
                    }
                }
            }
        }
    }

    public void a(b bVar) {
        this.d = bVar;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public b b() {
        return this.d;
    }

    public d c() {
        e eVar = this.g;
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public e d() {
        return this.g;
    }

    public Map<String, String> e() {
        d c = c();
        if (c != null) {
            return c.d;
        }
        return null;
    }

    public String f() {
        return "ttnet_tnc_config" + this.r;
    }

    public boolean g() {
        return this.c;
    }

    public void h() {
        this.q.clear();
    }
}
