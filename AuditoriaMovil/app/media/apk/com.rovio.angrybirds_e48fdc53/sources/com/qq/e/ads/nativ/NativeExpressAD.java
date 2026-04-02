package com.qq.e.ads.nativ;

import android.content.Context;
import com.qq.e.ads.NativeAbstractAD;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.adevent.ADEvent;
import com.qq.e.comm.adevent.ADListener;
import com.qq.e.comm.adevent.AdEventType;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.listeners.ADRewardListener;
import com.qq.e.comm.listeners.NegativeFeedbackListener;
import com.qq.e.comm.pi.IReward;
import com.qq.e.comm.pi.NEADI;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.util.AdErrorConvertor;
import com.qq.e.comm.util.GDTLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public class NativeExpressAD extends NativeAbstractAD<NEADI> implements IReward {
    private volatile int g;
    private volatile int h;
    private List<Integer> i = Collections.synchronizedList(new ArrayList());
    private VideoOption j;
    private ADSize k;
    private NativeExpressADListener l;
    private final ADListenerAdapter m;
    private LoadAdParams n;
    private volatile ServerSideVerificationOptions o;

    /* loaded from: classes3.dex */
    public static class ADListenerAdapter implements ADListener {
        private NativeExpressADListener a;
        private NativeExpressMediaListener b;
        private NegativeFeedbackListener c;
        private ADRewardListener d;

        public ADListenerAdapter(NativeExpressADListener nativeExpressADListener) {
            this.a = nativeExpressADListener;
        }

        public ADListenerAdapter(NativeExpressMediaListener nativeExpressMediaListener) {
            this.b = nativeExpressMediaListener;
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(ADEvent aDEvent) {
            if (NativeExpressAD.a(this.a, aDEvent) || NativeExpressAD.a(this.b, aDEvent) || NativeExpressAD.a(this.c, aDEvent)) {
                return;
            }
            NativeExpressAD.a(this.d, aDEvent);
        }

        public void setAdRewardListener(ADRewardListener aDRewardListener) {
            this.d = aDRewardListener;
        }

        public void setMediaListener(NativeExpressMediaListener nativeExpressMediaListener) {
            this.b = nativeExpressMediaListener;
        }

        public void setNegativeFeedbackListener(NegativeFeedbackListener negativeFeedbackListener) {
            this.c = negativeFeedbackListener;
        }
    }

    /* loaded from: classes3.dex */
    public interface NativeExpressADListener extends NativeAbstractAD.BasicADListener {
        void onADClicked(NativeExpressADView nativeExpressADView);

        void onADClosed(NativeExpressADView nativeExpressADView);

        void onADExposure(NativeExpressADView nativeExpressADView);

        void onADLeftApplication(NativeExpressADView nativeExpressADView);

        void onADLoaded(List<NativeExpressADView> list);

        void onRenderFail(NativeExpressADView nativeExpressADView);

        void onRenderSuccess(NativeExpressADView nativeExpressADView);
    }

    public NativeExpressAD(Context context, ADSize aDSize, String str, NativeExpressADListener nativeExpressADListener) {
        this.l = nativeExpressADListener;
        this.m = new ADListenerAdapter(nativeExpressADListener);
        if (a(aDSize)) {
            return;
        }
        a(context, str);
    }

    public NativeExpressAD(Context context, ADSize aDSize, String str, NativeExpressADListener nativeExpressADListener, String str2) {
        this.l = nativeExpressADListener;
        this.m = new ADListenerAdapter(nativeExpressADListener);
        if (a(aDSize)) {
            return;
        }
        a(context, str, str2);
    }

    private boolean a(ADSize aDSize) {
        if (aDSize != null) {
            this.k = aDSize;
            return false;
        }
        GDTLogger.e("初始化错误：参数adSize不能为空");
        a(2001);
        return true;
    }

    static boolean a(NativeExpressADListener nativeExpressADListener, ADEvent aDEvent) {
        if (nativeExpressADListener != null) {
            int type = aDEvent.getType();
            if (type == 100) {
                List<NativeExpressADView> list = (List) aDEvent.getParam(List.class);
                if (list != null) {
                    nativeExpressADListener.onADLoaded(list);
                }
            } else if (type == 101) {
                Integer num = (Integer) aDEvent.getParam(Integer.class);
                if (num != null) {
                    nativeExpressADListener.onNoAD(AdErrorConvertor.formatErrorCode(num.intValue()));
                }
            } else if (type == 103) {
                NativeExpressADView nativeExpressADView = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView != null) {
                    nativeExpressADListener.onADExposure(nativeExpressADView);
                }
            } else if (type == 303) {
                NativeExpressADView nativeExpressADView2 = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView2 != null) {
                    nativeExpressADListener.onADLeftApplication(nativeExpressADView2);
                }
            } else if (type == 105) {
                NativeExpressADView nativeExpressADView3 = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView3 != null) {
                    nativeExpressADListener.onADClicked(nativeExpressADView3);
                }
            } else if (type == 106) {
                NativeExpressADView nativeExpressADView4 = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView4 != null) {
                    nativeExpressADListener.onADClosed(nativeExpressADView4);
                    nativeExpressADView4.negativeFeedback();
                }
            } else if (type == 109) {
                NativeExpressADView nativeExpressADView5 = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView5 != null) {
                    nativeExpressADListener.onRenderSuccess(nativeExpressADView5);
                }
            } else if (type == 110) {
                NativeExpressADView nativeExpressADView6 = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView6 != null) {
                    nativeExpressADListener.onRenderFail(nativeExpressADView6);
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.qq.e.ads.NativeAbstractAD, com.qq.e.ads.AbstractAD
    public void a(NEADI neadi) {
        super.a((NativeExpressAD) neadi);
        neadi.setMinVideoDuration(this.g);
        neadi.setMaxVideoDuration(this.h);
        ((NEADI) this.a).setServerSideVerificationOptions(this.o);
        VideoOption videoOption = this.j;
        if (videoOption != null) {
            setVideoOption(videoOption);
        }
        synchronized (this.i) {
            Iterator<Integer> it = this.i.iterator();
            while (it.hasNext()) {
                if (this.a != 0) {
                    if (this.n != null) {
                        ((NEADI) this.a).loadAd(it.next().intValue(), this.n);
                    } else {
                        ((NEADI) this.a).loadAd(it.next().intValue());
                    }
                }
            }
        }
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int i) {
        NativeExpressADListener nativeExpressADListener = this.l;
        if (nativeExpressADListener != null) {
            nativeExpressADListener.onNoAD(AdErrorConvertor.formatErrorCode(i));
        }
    }

    public String getAdNetWorkName() {
        T t = this.a;
        if (t != 0) {
            return ((NEADI) t).getAdNetWorkName();
        }
        a("getAdNetWorkName");
        return null;
    }

    public void loadAD(int i) {
        loadAD(i, null);
    }

    public void loadAD(int i, LoadAdParams loadAdParams) {
        if (a()) {
            if (loadAdParams != null) {
                setAdParams(loadAdParams);
            }
            if (!b()) {
                synchronized (this.i) {
                    this.i.add(Integer.valueOf(i));
                }
                return;
            }
            T t = this.a;
            if (t == 0) {
                a("loadAD");
                return;
            }
            LoadAdParams loadAdParams2 = this.n;
            NEADI neadi = (NEADI) t;
            if (loadAdParams2 != null) {
                neadi.loadAd(i, loadAdParams2);
            } else {
                neadi.loadAd(i);
            }
        }
    }

    public void setAdParams(LoadAdParams loadAdParams) {
        this.n = loadAdParams;
    }

    public void setMaxVideoDuration(int i) {
        this.h = i;
        if (this.h > 0 && this.g > this.h) {
            GDTLogger.e("maxVideoDuration 设置值非法，不得小于minVideoDuration");
        }
        T t = this.a;
        if (t != 0) {
            ((NEADI) t).setMaxVideoDuration(this.h);
        }
    }

    public void setMinVideoDuration(int i) {
        this.g = i;
        if (this.h > 0 && this.g > this.h) {
            GDTLogger.e("minVideoDuration 设置值非法，不得大于maxVideoDuration");
        }
        T t = this.a;
        if (t != 0) {
            ((NEADI) t).setMinVideoDuration(this.g);
        }
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setRewardListener(ADRewardListener aDRewardListener) {
        this.m.setAdRewardListener(aDRewardListener);
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.o = serverSideVerificationOptions;
        T t = this.a;
        if (t != 0) {
            ((NEADI) t).setServerSideVerificationOptions(serverSideVerificationOptions);
        }
    }

    public void setVideoOption(VideoOption videoOption) {
        this.j = videoOption;
        T t = this.a;
        if (t == 0 || videoOption == null) {
            return;
        }
        ((NEADI) t).setVideoOption(videoOption);
    }

    static boolean a(NativeExpressMediaListener nativeExpressMediaListener, ADEvent aDEvent) {
        NativeExpressADView nativeExpressADView;
        if (nativeExpressMediaListener != null && (nativeExpressADView = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class)) != null) {
            int type = aDEvent.getType();
            if (type == 201) {
                nativeExpressMediaListener.onVideoCached(nativeExpressADView);
                return true;
            } else if (type == 202) {
                nativeExpressMediaListener.onVideoStart(nativeExpressADView);
                return true;
            } else if (type == 204) {
                nativeExpressMediaListener.onVideoPause(nativeExpressADView);
                return true;
            } else if (type == 206) {
                nativeExpressMediaListener.onVideoComplete(nativeExpressADView);
                return true;
            } else if (type == 207) {
                Integer num = (Integer) aDEvent.getParam(1, Integer.class);
                if (num != null) {
                    nativeExpressMediaListener.onVideoError(nativeExpressADView, AdErrorConvertor.formatErrorCode(num.intValue()));
                    return true;
                }
                return true;
            } else if (type == 301) {
                nativeExpressMediaListener.onVideoPageOpen(nativeExpressADView);
                return true;
            } else if (type == 302) {
                nativeExpressMediaListener.onVideoPageClose(nativeExpressADView);
                return true;
            } else {
                switch (type) {
                    case AdEventType.VIDEO_INIT /* 209 */:
                        nativeExpressMediaListener.onVideoInit(nativeExpressADView);
                        return true;
                    case AdEventType.VIDEO_READY /* 210 */:
                        Integer num2 = (Integer) aDEvent.getParam(1, Integer.class);
                        if (num2 != null) {
                            nativeExpressMediaListener.onVideoReady(nativeExpressADView, num2.intValue());
                            return true;
                        }
                        return true;
                    case AdEventType.VIDEO_LOADING /* 211 */:
                        nativeExpressMediaListener.onVideoLoading(nativeExpressADView);
                        return true;
                }
            }
        }
        return false;
    }

    static boolean a(NegativeFeedbackListener negativeFeedbackListener, ADEvent aDEvent) {
        if (negativeFeedbackListener != null && aDEvent.getType() == 304) {
            negativeFeedbackListener.onComplainSuccess();
            return true;
        }
        return false;
    }

    static boolean a(ADRewardListener aDRewardListener, ADEvent aDEvent) {
        if (aDRewardListener != null && aDEvent.getType() == 104) {
            String str = (String) aDEvent.getParam(String.class);
            if (str != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("transId", str);
                aDRewardListener.onReward(hashMap);
            }
            return true;
        }
        return false;
    }

    @Override // com.qq.e.ads.AbstractAD
    protected Object a(Context context, POFactory pOFactory, String str, String str2, String str3) {
        return pOFactory.getNativeExpressADDelegate(context, this.k, str, str2, str3, this.m);
    }
}
