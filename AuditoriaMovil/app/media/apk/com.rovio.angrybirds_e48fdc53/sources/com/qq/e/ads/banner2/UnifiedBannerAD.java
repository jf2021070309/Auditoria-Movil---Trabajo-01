package com.qq.e.ads.banner2;

import android.app.Activity;
import android.content.Context;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.cfg.DownAPPConfirmPolicy;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.listeners.ADRewardListener;
import com.qq.e.comm.listeners.NegativeFeedbackListener;
import com.qq.e.comm.pi.IReward;
import com.qq.e.comm.pi.NFBI;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.pi.UBVI;
import com.qq.e.comm.util.AdErrorConvertor;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class UnifiedBannerAD extends LiteAbstractAD<UBVI> implements NFBI, IReward {
    private UnifiedBannerADListener g;
    private DownAPPConfirmPolicy h;
    private AtomicInteger i;
    private int j;
    private LoadAdParams k;
    private UnifiedBannerView l;
    private final ADListenerAdapter m;
    private volatile ServerSideVerificationOptions n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnifiedBannerAD(Activity activity, UnifiedBannerView unifiedBannerView, String str, UnifiedBannerADListener unifiedBannerADListener) {
        this(unifiedBannerView, unifiedBannerADListener);
        a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnifiedBannerAD(Activity activity, UnifiedBannerView unifiedBannerView, String str, String str2, UnifiedBannerADListener unifiedBannerADListener) {
        this(unifiedBannerView, unifiedBannerADListener);
        a(activity, str, str2);
    }

    private UnifiedBannerAD(UnifiedBannerView unifiedBannerView, UnifiedBannerADListener unifiedBannerADListener) {
        this.i = new AtomicInteger(0);
        this.j = 30;
        this.k = null;
        this.g = unifiedBannerADListener;
        this.l = unifiedBannerView;
        this.m = new ADListenerAdapter(unifiedBannerADListener);
    }

    @Override // com.qq.e.ads.AbstractAD
    protected Object a(Context context, POFactory pOFactory, String str, String str2, String str3) {
        return pOFactory.getUnifiedBannerViewDelegate(this.l, (Activity) context, str, str2, str3, this.m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DownAPPConfirmPolicy downAPPConfirmPolicy) {
        T t;
        this.h = downAPPConfirmPolicy;
        if (downAPPConfirmPolicy == null || (t = this.a) == 0) {
            return;
        }
        ((UBVI) t).setDownAPPConfirmPolicy(downAPPConfirmPolicy);
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int i) {
        UnifiedBannerADListener unifiedBannerADListener = this.g;
        if (unifiedBannerADListener != null) {
            unifiedBannerADListener.onNoAD(AdErrorConvertor.formatErrorCode(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        this.j = i;
        T t = this.a;
        if (t != 0) {
            ((UBVI) t).setRefresh(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void destroy() {
        T t = this.a;
        if (t != 0) {
            ((UBVI) t).destroy();
        } else {
            a("destroy");
        }
    }

    public String getAdNetWorkName() {
        T t = this.a;
        if (t != 0) {
            return ((UBVI) t).getAdNetWorkName();
        }
        a("getAdNetWorkName");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadAD() {
        if (a()) {
            if (!b()) {
                this.i.incrementAndGet();
                return;
            }
            T t = this.a;
            if (t != 0) {
                ((UBVI) t).fetchAd();
            } else {
                a("loadAD");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onWindowFocusChanged(boolean z) {
        T t = this.a;
        if (t != 0) {
            ((UBVI) t).onWindowFocusChanged(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLoadAdParams(LoadAdParams loadAdParams) {
        this.k = loadAdParams;
        T t = this.a;
        if (t != 0) {
            ((UBVI) t).setLoadAdParams(loadAdParams);
        }
    }

    @Override // com.qq.e.comm.pi.NFBI
    public void setNegativeFeedbackListener(NegativeFeedbackListener negativeFeedbackListener) {
        this.m.setNegativeFeedbackListener(negativeFeedbackListener);
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setRewardListener(ADRewardListener aDRewardListener) {
        this.m.setAdRewardListener(aDRewardListener);
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.n = serverSideVerificationOptions;
        T t = this.a;
        if (t != 0) {
            ((UBVI) t).setServerSideVerificationOptions(serverSideVerificationOptions);
        }
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void a(Object obj) {
        UBVI ubvi = (UBVI) obj;
        DownAPPConfirmPolicy downAPPConfirmPolicy = this.h;
        if (downAPPConfirmPolicy != null) {
            this.h = downAPPConfirmPolicy;
            T t = this.a;
            if (t != 0) {
                ((UBVI) t).setDownAPPConfirmPolicy(downAPPConfirmPolicy);
            }
        }
        int i = this.j;
        this.j = i;
        T t2 = this.a;
        if (t2 != 0) {
            ((UBVI) t2).setRefresh(i);
        }
        LoadAdParams loadAdParams = this.k;
        this.k = loadAdParams;
        T t3 = this.a;
        if (t3 != 0) {
            ((UBVI) t3).setLoadAdParams(loadAdParams);
        }
        ubvi.setServerSideVerificationOptions(this.n);
        while (this.i.getAndDecrement() > 0) {
            loadAD();
        }
    }
}
