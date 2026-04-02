package c.u.b;
/* loaded from: classes.dex */
public class d implements t {
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public int f2591b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2592c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2593d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Object f2594e = null;

    public d(t tVar) {
        this.a = tVar;
    }

    @Override // c.u.b.t
    public void a(int i2, int i3) {
        e();
        this.a.a(i2, i3);
    }

    @Override // c.u.b.t
    public void b(int i2, int i3) {
        int i4;
        if (this.f2591b == 1 && i2 >= (i4 = this.f2592c)) {
            int i5 = this.f2593d;
            if (i2 <= i4 + i5) {
                this.f2593d = i5 + i3;
                this.f2592c = Math.min(i2, i4);
                return;
            }
        }
        e();
        this.f2592c = i2;
        this.f2593d = i3;
        this.f2591b = 1;
    }

    @Override // c.u.b.t
    public void c(int i2, int i3) {
        int i4;
        if (this.f2591b == 2 && (i4 = this.f2592c) >= i2 && i4 <= i2 + i3) {
            this.f2593d += i3;
            this.f2592c = i2;
            return;
        }
        e();
        this.f2592c = i2;
        this.f2593d = i3;
        this.f2591b = 2;
    }

    @Override // c.u.b.t
    public void d(int i2, int i3, Object obj) {
        int i4;
        if (this.f2591b == 3) {
            int i5 = this.f2592c;
            int i6 = this.f2593d;
            if (i2 <= i5 + i6 && (i4 = i2 + i3) >= i5 && this.f2594e == obj) {
                this.f2592c = Math.min(i2, i5);
                this.f2593d = Math.max(i6 + i5, i4) - this.f2592c;
                return;
            }
        }
        e();
        this.f2592c = i2;
        this.f2593d = i3;
        this.f2594e = obj;
        this.f2591b = 3;
    }

    public void e() {
        int i2 = this.f2591b;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            this.a.b(this.f2592c, this.f2593d);
        } else if (i2 == 2) {
            this.a.c(this.f2592c, this.f2593d);
        } else if (i2 == 3) {
            this.a.d(this.f2592c, this.f2593d, this.f2594e);
        }
        this.f2594e = null;
        this.f2591b = 0;
    }
}
