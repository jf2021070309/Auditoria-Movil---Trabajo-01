package bo.app;

import com.braze.support.BrazeLogger;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class b1 implements o1 {
    public static final a e = new a(null);
    private final int a;
    private final int b;
    private final Random c;
    private int d;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final int a(Random random, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(random, "random");
            return Math.min(i, i2) + random.nextInt(Math.abs(i - i2) + 1);
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.yb0.b0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.yb0.b0 b0Var) {
            super(0);
            this.b = b0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.e.f(new StringBuilder("Sleep time too small: "), this.b.b, " increasing to 250");
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
            return "Computing new sleep delay. Previous sleep delay: " + b1.this.d;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.yb0.b0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.yb0.b0 b0Var) {
            super(0);
            this.c = b0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "New sleep duration: " + b1.this.d + " ms. Default sleep duration: " + this.c.b + " ms. Max sleep: " + b1.this.a + " ms.";
        }
    }

    public b1(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = new Random();
    }

    public void c() {
        this.d = 0;
    }

    @Override // bo.app.o1
    public int a() {
        return a(this.b);
    }

    public boolean b() {
        return this.d != 0;
    }

    public int a(int i) {
        com.amazon.aps.iva.yb0.b0 b0Var = new com.amazon.aps.iva.yb0.b0();
        b0Var.b = i;
        if (i < 250) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(b0Var), 3, (Object) null);
            b0Var.b = 250;
        }
        if (this.d == 0) {
            this.d = 250;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new c(), 3, (Object) null);
        this.d = Math.min(this.a, e.a(this.c, Math.max(b0Var.b, this.d), this.d * 3));
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new d(b0Var), 3, (Object) null);
        return this.d;
    }

    public /* synthetic */ b1(int i, int i2, int i3, com.amazon.aps.iva.yb0.e eVar) {
        this(i, (i3 & 2) != 0 ? (int) TimeUnit.SECONDS.toMillis(1L) : i2);
    }
}
