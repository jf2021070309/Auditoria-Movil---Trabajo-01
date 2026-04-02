package e.d.b.e.a.a;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class y1 {
    public final z a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<e3> f6977b;

    /* renamed from: c  reason: collision with root package name */
    public final h1 f6978c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<Executor> f6979d;

    /* renamed from: e  reason: collision with root package name */
    public final t0 f6980e;

    public y1(z zVar, e.d.b.e.a.c.b0<e3> b0Var, h1 h1Var, e.d.b.e.a.c.b0<Executor> b0Var2, t0 t0Var) {
        this.a = zVar;
        this.f6977b = b0Var;
        this.f6978c = h1Var;
        this.f6979d = b0Var2;
        this.f6980e = t0Var;
    }

    public final void a(w1 w1Var) {
        File h2 = this.a.h(w1Var.f6822b, w1Var.f6968c, w1Var.f6969d);
        z zVar = this.a;
        String str = w1Var.f6822b;
        int i2 = w1Var.f6968c;
        long j2 = w1Var.f6969d;
        Objects.requireNonNull(zVar);
        File file = new File(new File(zVar.q(str, i2, j2), "_slices"), "_metadata");
        if (!h2.exists() || !file.exists()) {
            throw new p0(String.format("Cannot find pack files to move for pack %s.", w1Var.f6822b), w1Var.a);
        }
        File a = this.a.a(w1Var.f6822b, w1Var.f6968c, w1Var.f6969d);
        a.mkdirs();
        if (!h2.renameTo(a)) {
            throw new p0("Cannot move merged pack files to final location.", w1Var.a);
        }
        new File(this.a.a(w1Var.f6822b, w1Var.f6968c, w1Var.f6969d), "merge.tmp").delete();
        z zVar2 = this.a;
        String str2 = w1Var.f6822b;
        int i3 = w1Var.f6968c;
        long j3 = w1Var.f6969d;
        Objects.requireNonNull(zVar2);
        File file2 = new File(zVar2.a(str2, i3, j3), "_metadata");
        file2.mkdirs();
        if (!file.renameTo(file2)) {
            throw new p0("Cannot move metadata files to final location.", w1Var.a);
        }
        final z zVar3 = this.a;
        zVar3.getClass();
        this.f6979d.a().execute(new Runnable(zVar3) { // from class: e.d.b.e.a.a.x1
            public final z a;

            {
                this.a = zVar3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                z zVar4;
                ArrayList arrayList = (ArrayList) this.a.p();
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    File file3 = (File) arrayList.get(i4);
                    if (file3.listFiles() != null) {
                        z.c(file3);
                        long e2 = z.e(file3);
                        if (zVar4.f6983c.a() != e2) {
                            try {
                                new File(new File(file3, String.valueOf(e2)), "stale.tmp").createNewFile();
                            } catch (IOException unused) {
                                z.a.a(6, "Could not write staleness marker.", new Object[0]);
                            }
                        }
                        for (File file4 : file3.listFiles()) {
                            z.c(file4);
                        }
                    }
                }
            }
        });
        final h1 h1Var = this.f6978c;
        final String str3 = w1Var.f6822b;
        final int i4 = w1Var.f6968c;
        final long j4 = w1Var.f6969d;
        h1Var.a(new g1(h1Var, str3, i4, j4) { // from class: e.d.b.e.a.a.y0
            public final h1 a;

            /* renamed from: b  reason: collision with root package name */
            public final String f6974b;

            /* renamed from: c  reason: collision with root package name */
            public final int f6975c;

            /* renamed from: d  reason: collision with root package name */
            public final long f6976d;

            {
                this.a = h1Var;
                this.f6974b = str3;
                this.f6975c = i4;
                this.f6976d = j4;
            }

            @Override // e.d.b.e.a.a.g1
            public final Object a() {
                final h1 h1Var2 = this.a;
                String str4 = this.f6974b;
                int i5 = this.f6975c;
                long j5 = this.f6976d;
                Objects.requireNonNull(h1Var2);
                final List asList = Arrays.asList(str4);
                e1 e1Var = (e1) ((Map) h1Var2.a(new g1(h1Var2, asList) { // from class: e.d.b.e.a.a.z0
                    public final h1 a;

                    /* renamed from: b  reason: collision with root package name */
                    public final List f6984b;

                    {
                        this.a = h1Var2;
                        this.f6984b = asList;
                    }

                    @Override // e.d.b.e.a.a.g1
                    public final Object a() {
                        h1 h1Var3 = this.a;
                        List list = this.f6984b;
                        Objects.requireNonNull(h1Var3);
                        HashMap hashMap = new HashMap();
                        for (e1 e1Var2 : h1Var3.f6814f.values()) {
                            String str5 = e1Var2.f6773c.a;
                            if (list.contains(str5)) {
                                e1 e1Var3 = (e1) hashMap.get(str5);
                                if ((e1Var3 == null ? -1 : e1Var3.a) < e1Var2.a) {
                                    hashMap.put(str5, e1Var2);
                                }
                            }
                        }
                        return hashMap;
                    }
                })).get(str4);
                if (e1Var == null || e.d.b.d.a.m(e1Var.f6773c.f6755c)) {
                    h1.a.a(6, String.format("Could not find pack %s while trying to complete it", str4), new Object[0]);
                }
                z zVar4 = h1Var2.f6810b;
                if (zVar4.q(str4, i5, j5).exists()) {
                    z.j(zVar4.q(str4, i5, j5));
                }
                e1Var.f6773c.f6755c = 4;
                return null;
            }
        });
        this.f6980e.a(w1Var.f6822b);
        this.f6977b.a().b(w1Var.a, w1Var.f6822b);
    }
}
