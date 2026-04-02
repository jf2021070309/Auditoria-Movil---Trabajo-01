package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.error.AdBreakError;
/* loaded from: classes.dex */
public abstract class d extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ AdError a;

        a(AdError adError) {
            this.a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.b(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.d {
        b() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.d
        public void callback() {
            Log.i("TMe", "adn init registerADNInitCallback load config v2 --------------------");
            d.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.j();
            d.super.U();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Context context, String str) {
        super(context, str);
    }

    private boolean g0() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar != null) {
            for (k kVar : cVar.F()) {
                if (TextUtils.equals(kVar.e(), "pangle") && kVar.G()) {
                    return true;
                }
            }
        }
        return false;
    }

    private AdError h0() {
        AdSlot adSlot;
        if (!this.L || (adSlot = this.h) == null) {
            return null;
        }
        AdSlot shallowCopy = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.b.getShallowCopy(adSlot);
        shallowCopy.setLinkedId(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.d());
        AdBreakError adBreakError = new AdBreakError(AdError.ERROR_CODE_LOADED, AdError.getMessage(AdError.ERROR_CODE_LOADED));
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(shallowCopy, cVar != null ? cVar.G() : null, true, j(), (int) AdError.ERROR_CODE_LOADED);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar2 = this.d;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(shallowCopy, adBreakError, cVar2 != null ? cVar2.G() : null, j());
        return adBreakError;
    }

    private AdError i0() {
        AdSlot adSlot;
        if (!this.M || (adSlot = this.h) == null) {
            return null;
        }
        AdSlot shallowCopy = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.b.getShallowCopy(adSlot);
        shallowCopy.setLinkedId(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.d());
        AdBreakError adBreakError = new AdBreakError(AdError.ERROR_CODE_SHOWED, AdError.getMessage(AdError.ERROR_CODE_SHOWED));
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(shallowCopy, cVar != null ? cVar.G() : null, true, j(), (int) AdError.ERROR_CODE_SHOWED);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar2 = this.d;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(shallowCopy, adBreakError, cVar2 != null ? cVar2.G() : null, j());
        return adBreakError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        if (g0() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.f()) {
            ThreadHelper.runOnThreadPool(new c());
        } else {
            super.U();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void U() {
        String str;
        if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().r()) {
            str = "adn init load config v1 --------------------";
        } else if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().y()) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(new b());
            return;
        } else {
            str = "adn init load config v2 --------------------";
        }
        Log.i("TMe", str);
        j0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean f0() {
        if (this.h == null) {
            return true;
        }
        AdError i0 = i0();
        if (i0 == null && (i0 = h0()) == null) {
            return true;
        }
        ThreadHelper.runOnUiThread(new a(i0));
        return false;
    }
}
