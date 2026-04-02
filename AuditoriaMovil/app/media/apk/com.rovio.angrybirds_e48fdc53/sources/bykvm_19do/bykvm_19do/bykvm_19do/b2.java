package bykvm_19do.bykvm_19do.bykvm_19do;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;
/* loaded from: classes.dex */
public class b2 {
    private static long n;
    private static b o;
    private final j2 a;
    private final k2 b;
    private b0 c;
    private b0 d;
    String e;
    private long f;
    private int g;
    private long h = -1;
    private volatile boolean i;
    private long j;
    private int k;
    private String l;
    private z m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends d0 {
        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b2(k2 k2Var, j2 j2Var) {
        this.b = k2Var;
        this.a = j2Var;
    }

    public static long a(j2 j2Var) {
        long j = n + 1;
        n = j;
        if (j % 1000 == 0) {
            j2Var.a(j + 1000);
        }
        return n;
    }

    private void a(u uVar, ArrayList<u> arrayList, boolean z) {
        synchronized (this) {
            long j = uVar instanceof b ? -1L : uVar.a;
            this.e = UUID.randomUUID().toString();
            n = this.a.b();
            this.h = j;
            this.i = z;
            this.j = 0L;
            if (l0.a) {
                l0.a("startSession, " + this.e + ", hadUi:" + z + " data:" + uVar, null);
            }
            if (z) {
                Calendar calendar = Calendar.getInstance();
                String str = "" + calendar.get(1) + calendar.get(2) + calendar.get(5);
                if (TextUtils.isEmpty(this.l)) {
                    this.l = this.a.u();
                    this.k = this.a.v();
                }
                if (str.equals(this.l)) {
                    this.k++;
                } else {
                    this.l = str;
                    this.k = 1;
                }
                this.a.a(str, this.k);
                this.g = 0;
            }
            if (j != -1) {
                z zVar = new z();
                zVar.c = this.e;
                zVar.b = a(this.a);
                zVar.a = this.h;
                zVar.j = this.b.d();
                zVar.i = this.b.c();
                if (this.a.N()) {
                    zVar.e = bykvm_19do.bykvm_19do.bykvm_19do.a.c();
                    zVar.f = bykvm_19do.bykvm_19do.bykvm_19do.a.d();
                }
                arrayList.add(zVar);
                this.m = zVar;
                if (l0.a) {
                    l0.a("gen launch, " + zVar.c + ", hadUi:" + z, null);
                }
            }
        }
    }

    public static boolean b(u uVar) {
        if (uVar instanceof b0) {
            return ((b0) uVar).j();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b d() {
        if (o == null) {
            o = new b();
        }
        o.a = System.currentTimeMillis();
        return o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle a(long j, long j2) {
        Bundle bundle;
        synchronized (this) {
            if (this.a.x() && c() && j - this.f > j2) {
                bundle = new Bundle();
                bundle.putInt("session_no", this.k);
                int i = this.g + 1;
                this.g = i;
                bundle.putInt("send_times", i);
                bundle.putLong("current_duration", (j - this.f) / 1000);
                bundle.putString(com.umeng.analytics.pro.u.a, u.a(this.h));
                this.f = j;
            } else {
                bundle = null;
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z a() {
        z zVar;
        synchronized (this) {
            zVar = this.m;
        }
        return zVar;
    }

    public void a(u uVar) {
        if (uVar != null) {
            uVar.d = this.b.f();
            uVar.c = this.e;
            uVar.b = a(this.a);
            if (this.a.N()) {
                uVar.e = bykvm_19do.bykvm_19do.bykvm_19do.a.c();
                uVar.f = bykvm_19do.bykvm_19do.bykvm_19do.a.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(bykvm_19do.bykvm_19do.bykvm_19do.u r13, java.util.ArrayList<bykvm_19do.bykvm_19do.bykvm_19do.u> r14) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof bykvm_19do.bykvm_19do.bykvm_19do.b0
            boolean r1 = b(r13)
            long r2 = r12.h
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L19
            boolean r1 = b(r13)
        L15:
            r12.a(r13, r14, r1)
            goto L45
        L19:
            boolean r2 = r12.i
            if (r2 != 0) goto L23
            if (r1 == 0) goto L23
            r12.a(r13, r14, r5)
            goto L45
        L23:
            long r6 = r12.j
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L37
            long r8 = r13.a
            bykvm_19do.bykvm_19do.bykvm_19do.j2 r2 = r12.a
            long r10 = r2.P()
            long r6 = r6 + r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 <= 0) goto L37
            goto L43
        L37:
            long r6 = r12.h
            long r8 = r13.a
            r10 = 7200000(0x6ddd00, double:3.5572727E-317)
            long r8 = r8 + r10
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L44
        L43:
            goto L15
        L44:
            r5 = 0
        L45:
            if (r0 == 0) goto Lae
            r0 = r13
            bykvm_19do.bykvm_19do.bykvm_19do.b0 r0 = (bykvm_19do.bykvm_19do.bykvm_19do.b0) r0
            boolean r1 = r0.j()
            if (r1 == 0) goto L89
            long r1 = r13.a
            r12.f = r1
            r12.j = r3
            r14.add(r13)
            java.lang.String r14 = r0.j
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto Lb5
            bykvm_19do.bykvm_19do.bykvm_19do.b0 r14 = r12.d
            r1 = 500(0x1f4, double:2.47E-321)
            if (r14 == 0) goto L78
            long r3 = r0.a
            long r6 = r14.a
            long r3 = r3 - r6
            long r6 = r14.i
            long r3 = r3 - r6
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 >= 0) goto L78
        L73:
            java.lang.String r14 = r14.k
            r0.j = r14
            goto Lb5
        L78:
            bykvm_19do.bykvm_19do.bykvm_19do.b0 r14 = r12.c
            if (r14 == 0) goto Lb5
            long r3 = r0.a
            long r6 = r14.a
            long r3 = r3 - r6
            long r6 = r14.i
            long r3 = r3 - r6
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto Lb5
            goto L73
        L89:
            long r1 = r13.a
            android.os.Bundle r1 = r12.a(r1, r3)
            if (r1 == 0) goto L96
            java.lang.String r2 = "play_session"
            bykvm_19do.bykvm_19do.bykvm_19do.a.a(r2, r1)
        L96:
            r12.f = r3
            long r1 = r0.a
            r12.j = r1
            r14.add(r13)
            boolean r14 = r0.k()
            if (r14 == 0) goto La8
            r12.c = r0
            goto Lb5
        La8:
            r12.d = r0
            r14 = 0
            r12.c = r14
            goto Lb5
        Lae:
            boolean r0 = r13 instanceof bykvm_19do.bykvm_19do.bykvm_19do.b2.b
            if (r0 != 0) goto Lb5
            r14.add(r13)
        Lb5:
            r12.a(r13)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.b2.a(bykvm_19do.bykvm_19do.bykvm_19do.u, java.util.ArrayList):boolean");
    }

    public boolean b() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return b() && this.j == 0;
    }
}
