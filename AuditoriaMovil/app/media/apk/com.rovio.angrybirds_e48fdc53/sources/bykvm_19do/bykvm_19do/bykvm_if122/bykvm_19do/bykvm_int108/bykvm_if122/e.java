package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122;

import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.base.TTBaseAd;
/* loaded from: classes.dex */
public class e implements Comparable<e> {
    public TTBaseAd a;
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d b;
    private long c;
    private boolean d = false;
    private AdSlot e;

    public e(TTBaseAd tTBaseAd, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar, long j, AdSlot adSlot) {
        this.a = tTBaseAd;
        this.b = dVar;
        this.c = j;
        this.e = adSlot;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(e eVar) {
        return this.a.compareTo(eVar.a);
    }

    public AdSlot a() {
        return this.e;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }
}
