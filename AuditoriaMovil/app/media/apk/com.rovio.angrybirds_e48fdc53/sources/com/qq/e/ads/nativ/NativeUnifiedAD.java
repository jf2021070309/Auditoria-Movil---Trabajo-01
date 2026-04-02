package com.qq.e.ads.nativ;

import android.content.Context;
import android.text.TextUtils;
import com.qq.e.ads.NativeAbstractAD;
import com.qq.e.comm.adevent.ADEvent;
import com.qq.e.comm.adevent.ADListener;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.pi.NUADI;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.util.AdErrorConvertor;
import com.qq.e.comm.util.GDTLogger;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class NativeUnifiedAD extends NativeAbstractAD<NUADI> {
    private AdListenerAdapter g;
    private NativeADUnifiedListener h;
    private List<Integer> i = new ArrayList();
    private List<String> j;
    private volatile int k;
    private volatile int l;
    private String m;
    private LoadAdParams n;

    /* loaded from: classes3.dex */
    private static class AdListenerAdapter implements ADListener {
        private NativeADUnifiedListener a;

        public AdListenerAdapter(NativeADUnifiedListener nativeADUnifiedListener) {
            this.a = nativeADUnifiedListener;
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(ADEvent aDEvent) {
            Integer num;
            if (this.a != null) {
                int type = aDEvent.getType();
                if (type != 100) {
                    if (type == 101 && (num = (Integer) aDEvent.getParam(Integer.class)) != null) {
                        this.a.onNoAD(AdErrorConvertor.formatErrorCode(num.intValue()));
                        return;
                    }
                    return;
                }
                List<NativeUnifiedADData> list = (List) aDEvent.getParam(List.class);
                if (list == null || list.size() <= 0) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (NativeUnifiedADData nativeUnifiedADData : list) {
                    arrayList.add(new NativeUnifiedADDataAdapter(nativeUnifiedADData));
                }
                this.a.onADLoaded(arrayList);
            }
        }
    }

    public NativeUnifiedAD(Context context, String str, NativeADUnifiedListener nativeADUnifiedListener) {
        this.h = nativeADUnifiedListener;
        this.g = new AdListenerAdapter(nativeADUnifiedListener);
        a(context, str);
    }

    public NativeUnifiedAD(Context context, String str, NativeADUnifiedListener nativeADUnifiedListener, String str2) {
        this.h = nativeADUnifiedListener;
        this.g = new AdListenerAdapter(nativeADUnifiedListener);
        a(context, str, str2);
    }

    private void a(int i, boolean z) {
        if (a()) {
            if (!b()) {
                if (z) {
                    this.i.add(Integer.valueOf(i));
                    return;
                }
                return;
            }
            T t = this.a;
            if (t != 0) {
                LoadAdParams loadAdParams = this.n;
                NUADI nuadi = (NUADI) t;
                if (loadAdParams != null) {
                    nuadi.loadData(i, loadAdParams);
                } else {
                    nuadi.loadData(i);
                }
            }
        }
    }

    @Override // com.qq.e.ads.AbstractAD
    protected Object a(Context context, POFactory pOFactory, String str, String str2, String str3) {
        return pOFactory.getNativeAdManagerDelegate(context, str, str2, str3, this.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.qq.e.ads.NativeAbstractAD, com.qq.e.ads.AbstractAD
    public void a(NUADI nuadi) {
        super.a((NativeUnifiedAD) nuadi);
        nuadi.setMinVideoDuration(this.k);
        nuadi.setMaxVideoDuration(this.l);
        nuadi.setVastClassName(this.m);
        List<String> list = this.j;
        if (list != null) {
            setCategories(list);
        }
        for (Integer num : this.i) {
            a(num.intValue(), false);
        }
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int i) {
        NativeADUnifiedListener nativeADUnifiedListener = this.h;
        if (nativeADUnifiedListener != null) {
            nativeADUnifiedListener.onNoAD(AdErrorConvertor.formatErrorCode(i));
        }
    }

    public String getAdNetWorkName() {
        T t = this.a;
        if (t != 0) {
            return ((NUADI) t).getAdNetWorkName();
        }
        a("getAdNetWorkName");
        return null;
    }

    public void loadData(int i) {
        a(i, true);
    }

    public void loadData(int i, LoadAdParams loadAdParams) {
        this.n = loadAdParams;
        loadData(i);
    }

    public void setCategories(List<String> list) {
        this.j = list;
        T t = this.a;
        if (t == 0 || list == null) {
            return;
        }
        ((NUADI) t).setCategories(list);
    }

    public void setMaxVideoDuration(int i) {
        this.l = i;
        if (this.l > 0 && this.k > this.l) {
            GDTLogger.e("maxVideoDuration 设置值非法，不得小于minVideoDuration");
        }
        T t = this.a;
        if (t != 0) {
            ((NUADI) t).setMaxVideoDuration(this.l);
        }
    }

    public void setMinVideoDuration(int i) {
        this.k = i;
        if (this.l > 0 && this.k > this.l) {
            GDTLogger.e("minVideoDuration 设置值非法，不得大于maxVideoDuration");
        }
        T t = this.a;
        if (t != 0) {
            ((NUADI) t).setMinVideoDuration(this.k);
        }
    }

    public void setVastClassName(String str) {
        if (TextUtils.isEmpty(str)) {
            GDTLogger.e("Vast class name 不能为空");
            return;
        }
        this.m = str;
        T t = this.a;
        if (t != 0) {
            ((NUADI) t).setVastClassName(str);
        }
    }
}
