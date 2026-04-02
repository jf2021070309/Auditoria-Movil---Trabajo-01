package e.d.b.b.j.a0.a;
/* loaded from: classes.dex */
public final class c {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final long f6128b;

    /* renamed from: c  reason: collision with root package name */
    public final a f6129c;

    /* loaded from: classes.dex */
    public enum a implements e.d.d.p.k.e {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        a(int i2) {
            this.number_ = i2;
        }

        @Override // e.d.d.p.k.e
        public int getNumber() {
            return this.number_;
        }
    }

    static {
        a aVar = a.REASON_UNKNOWN;
    }

    public c(long j2, a aVar) {
        this.f6128b = j2;
        this.f6129c = aVar;
    }
}
