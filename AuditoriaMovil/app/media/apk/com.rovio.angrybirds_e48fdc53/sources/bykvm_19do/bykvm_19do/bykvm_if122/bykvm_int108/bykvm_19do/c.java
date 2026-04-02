package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.w;
import com.bytedance.msdk.adapter.config.IGMInitAdnResult;
import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import com.bytedance.msdk.adapter.config.TTOnNetworkInitializationFinishedListener;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.GMNetworkRequestInfo;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public abstract class c {
    private Context a;
    private IGMInitAdnResult b;
    private final Set<String> c = new CopyOnWriteArraySet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements IGMInitAdnResult {
        final /* synthetic */ long a;

        a(long j) {
            this.a = j;
        }

        @Override // com.bytedance.msdk.adapter.config.IGMInitAdnResult
        public void fail(AdError adError) {
            if (c.this.b != null) {
                c.this.b.fail(adError);
            }
            if (adError != null) {
                String b = c.this.b();
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(b, new Pair(false, "errorCode = " + adError.code + " errorMessage = " + adError.message));
            }
        }

        @Override // com.bytedance.msdk.adapter.config.IGMInitAdnResult
        public void success() {
            if (c.this.b != null) {
                c.this.b.success();
            }
            if (TextUtils.equals(c.this.b(), "pangle")) {
                w.d(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.a;
            Logger.d("TMe", "--==--time: " + c.this.b() + ", ----==----- " + elapsedRealtime);
            if (!c.this.c.contains(c.this.b())) {
                c.this.c.add(c.this.b());
                f0.c(c.this.b(), elapsedRealtime);
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(c.this.b(), new Pair(true, ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements TTOnNetworkInitializationFinishedListener {
        b() {
        }

        @Override // com.bytedance.msdk.adapter.config.TTOnNetworkInitializationFinishedListener
        public void onNetworkInitializationFinished(Class<? extends ITTAdapterConfiguration> cls, AdError adError) {
            if (TextUtils.equals(c.this.b(), "pangle")) {
                w.d(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
            }
            if (adError.code == 30011) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(c.this.b(), new Pair(true, ""));
                return;
            }
            String b = c.this.b();
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(b, new Pair(false, "errorCode = " + adError.code + " errorMessage = " + adError.message));
        }
    }

    public c(Context context) {
        this.a = context;
    }

    private void a(ITTAdapterConfiguration iTTAdapterConfiguration, Map<String, Object> map) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Logger.d("TMe", "--==--time: start " + b());
        iTTAdapterConfiguration.initAdn(this.a, map, new a(elapsedRealtime));
    }

    private void b(ITTAdapterConfiguration iTTAdapterConfiguration, Map<String, Object> map) {
        iTTAdapterConfiguration.initializeNetwork(this.a, map, new b());
    }

    private void b(GMNetworkRequestInfo gMNetworkRequestInfo) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(b());
        if (gMNetworkRequestInfo == null && a2 == null) {
            return;
        }
        c(gMNetworkRequestInfo);
    }

    private void c(GMNetworkRequestInfo gMNetworkRequestInfo) {
        try {
            if (this.a == null) {
                throw new Exception("adn init context is null");
            }
            String a2 = a();
            if (!TextUtils.isEmpty(a2)) {
                throw new Exception("adn init " + a2);
            }
            Map<String, Object> d = d();
            if (d == null) {
                throw new Exception("adn init getConfig() is null");
            }
            d.put(GMAdConstant.EXTRA_ADNNAME, b());
            ITTAdapterConfiguration a3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c.b().a(b());
            if (a3.isNewInitFunction()) {
                a(a3, d);
            } else {
                b(a3, d);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(b(), new Pair(false, th.toString()));
        }
    }

    protected abstract String a();

    public void a(IGMInitAdnResult iGMInitAdnResult) {
        this.b = iGMInitAdnResult;
        b((GMNetworkRequestInfo) null);
    }

    public void a(GMNetworkRequestInfo gMNetworkRequestInfo) {
        b(gMNetworkRequestInfo);
    }

    public void a(GMNetworkRequestInfo gMNetworkRequestInfo, IGMInitAdnResult iGMInitAdnResult) {
        this.b = iGMInitAdnResult;
        b(gMNetworkRequestInfo);
    }

    protected abstract String b();

    /* JADX INFO: Access modifiers changed from: protected */
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a c() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(b());
    }

    protected abstract Map<String, Object> d();

    public void e() {
        b((GMNetworkRequestInfo) null);
    }
}
