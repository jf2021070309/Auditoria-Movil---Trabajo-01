package m;

import j.p;
import j.r;
import j.s;
import j.v;
import j.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class y {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f9908b = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: c  reason: collision with root package name */
    public final String f9909c;

    /* renamed from: d  reason: collision with root package name */
    public final j.s f9910d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f9911e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public s.a f9912f;

    /* renamed from: g  reason: collision with root package name */
    public final z.a f9913g = new z.a();

    /* renamed from: h  reason: collision with root package name */
    public final r.a f9914h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public j.u f9915i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f9916j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public v.a f9917k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public p.a f9918l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public j.c0 f9919m;

    /* loaded from: classes2.dex */
    public static class a extends j.c0 {
        public final j.c0 a;

        /* renamed from: b  reason: collision with root package name */
        public final j.u f9920b;

        public a(j.c0 c0Var, j.u uVar) {
            this.a = c0Var;
            this.f9920b = uVar;
        }

        @Override // j.c0
        public long a() throws IOException {
            return this.a.a();
        }

        @Override // j.c0
        public j.u b() {
            return this.f9920b;
        }

        @Override // j.c0
        public void c(k.f fVar) throws IOException {
            this.a.c(fVar);
        }
    }

    public y(String str, j.s sVar, @Nullable String str2, @Nullable j.r rVar, @Nullable j.u uVar, boolean z, boolean z2, boolean z3) {
        this.f9909c = str;
        this.f9910d = sVar;
        this.f9911e = str2;
        this.f9915i = uVar;
        this.f9916j = z;
        if (rVar != null) {
            this.f9914h = rVar.e();
        } else {
            this.f9914h = new r.a();
        }
        if (z2) {
            this.f9918l = new p.a();
        } else if (z3) {
            v.a aVar = new v.a();
            this.f9917k = aVar;
            j.u uVar2 = j.v.f9556b;
            Objects.requireNonNull(uVar2, "type == null");
            if (uVar2.f9554d.equals("multipart")) {
                aVar.f9564b = uVar2;
                return;
            }
            throw new IllegalArgumentException("multipart != " + uVar2);
        }
    }

    public void a(String str, String str2, boolean z) {
        if (z) {
            p.a aVar = this.f9918l;
            Objects.requireNonNull(aVar);
            Objects.requireNonNull(str, "name == null");
            aVar.a.add(j.s.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, null));
            aVar.f9532b.add(j.s.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, null));
            return;
        }
        p.a aVar2 = this.f9918l;
        Objects.requireNonNull(aVar2);
        Objects.requireNonNull(str, "name == null");
        aVar2.a.add(j.s.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, null));
        aVar2.f9532b.add(j.s.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, null));
    }

    public void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f9914h.a(str, str2);
            return;
        }
        try {
            this.f9915i = j.u.b(str2);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(e.a.d.a.a.k("Malformed content type: ", str2), e2);
        }
    }

    public void c(j.r rVar, j.c0 c0Var) {
        v.a aVar = this.f9917k;
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(c0Var, "body == null");
        if (rVar != null && rVar.c("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (rVar != null && rVar.c("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        aVar.f9565c.add(new v.b(rVar, c0Var));
    }

    public void d(String str, @Nullable String str2, boolean z) {
        String str3 = this.f9911e;
        if (str3 != null) {
            s.a k2 = this.f9910d.k(str3);
            this.f9912f = k2;
            if (k2 == null) {
                StringBuilder y = e.a.d.a.a.y("Malformed URL. Base: ");
                y.append(this.f9910d);
                y.append(", Relative: ");
                y.append(this.f9911e);
                throw new IllegalArgumentException(y.toString());
            }
            this.f9911e = null;
        }
        if (z) {
            s.a aVar = this.f9912f;
            Objects.requireNonNull(aVar);
            Objects.requireNonNull(str, "encodedName == null");
            if (aVar.f9550g == null) {
                aVar.f9550g = new ArrayList();
            }
            aVar.f9550g.add(j.s.b(str, " \"'<>#&=", true, false, true, true));
            aVar.f9550g.add(str2 != null ? j.s.b(str2, " \"'<>#&=", true, false, true, true) : null);
            return;
        }
        s.a aVar2 = this.f9912f;
        Objects.requireNonNull(aVar2);
        Objects.requireNonNull(str, "name == null");
        if (aVar2.f9550g == null) {
            aVar2.f9550g = new ArrayList();
        }
        aVar2.f9550g.add(j.s.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
        aVar2.f9550g.add(str2 != null ? j.s.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
    }
}
