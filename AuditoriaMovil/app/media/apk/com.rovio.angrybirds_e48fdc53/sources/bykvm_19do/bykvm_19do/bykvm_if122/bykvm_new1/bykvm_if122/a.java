package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122;

import android.text.TextUtils;
import com.bytedance.msdk.adapter.util.Logger;
/* loaded from: classes.dex */
public class a implements b {
    private final String a = a.class.getSimpleName();
    private long b;
    private long c;
    private String d;

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public void b(String str) {
        this.d = str;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public boolean i() {
        return TextUtils.isEmpty(this.d);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public void j() {
        this.c = System.currentTimeMillis();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public long k() {
        String str = this.a;
        Logger.i(str, "getIfUseNewSdkinit = " + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().p());
        long j = this.c - this.b;
        String str2 = this.a;
        Logger.i(str2, "InitMethodDuration = " + j);
        return j;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public long l() {
        long currentTimeMillis = System.currentTimeMillis() - this.b;
        String str = this.a;
        Logger.i(str, "SplashFillDuration = " + currentTimeMillis);
        return currentTimeMillis;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public long m() {
        long currentTimeMillis = System.currentTimeMillis() - this.b;
        String str = this.a;
        Logger.i(str, "SplashRequestDuration = " + currentTimeMillis);
        return currentTimeMillis;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public boolean n() {
        boolean equals = TextUtils.equals(this.d, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a.c);
        String str = this.a;
        Logger.i(str, "canUploadInitDuration = " + equals + " 当sessionId = " + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a.c + " 存储的sessionId = " + this.d);
        return !equals;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public void o() {
        this.b = System.currentTimeMillis();
    }
}
