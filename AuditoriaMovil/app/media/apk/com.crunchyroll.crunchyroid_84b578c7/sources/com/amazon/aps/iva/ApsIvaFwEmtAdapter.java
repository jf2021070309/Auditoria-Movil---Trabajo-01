package com.amazon.aps.iva;

import android.content.Context;
import android.view.ViewGroup;
import com.amazon.aps.iva.ApsIvaFwEmtAdapter;
import com.amazon.aps.iva.h6.r;
import com.amazon.aps.iva.oa.a;
import com.amazon.aps.iva.types.CreativeData;
import com.amazon.aps.iva.types.EnvironmentData;
import com.amazon.aps.iva.types.LoadStatus;
import com.amazon.aps.iva.types.SimidCreative;
import com.amazon.aps.iva.u1.n;
import com.amazon.aps.iva.util.LogUtils;
import com.amazon.aps.iva.wa.q;
import com.amazon.aps.iva.xa.b;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import lombok.NonNull;
/* loaded from: classes.dex */
public class ApsIvaFwEmtAdapter extends ApsIvaSdkBaseImpl {
    public SimidCreativeParser k;

    /* loaded from: classes.dex */
    public static class ApsIvaFwEmtAdapterBuilder {
        public Context a;
        public ViewGroup b;
        public ApsIvaListener c;
        public EnvironmentData d;
        public b e;
        public LogUtils.LOG_LEVEL f;
        public List<SimidCreative> g;

        public ApsIvaFwEmtAdapterBuilder apsIvaListener(@NonNull ApsIvaListener apsIvaListener) {
            if (apsIvaListener != null) {
                this.c = apsIvaListener;
                return this;
            }
            throw new NullPointerException("apsIvaListener is marked non-null but is null");
        }

        public ApsIvaFwEmtAdapter build() {
            return new ApsIvaFwEmtAdapter(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        public ApsIvaFwEmtAdapterBuilder context(@NonNull Context context) {
            if (context != null) {
                this.a = context;
                return this;
            }
            throw new NullPointerException("context is marked non-null but is null");
        }

        public ApsIvaFwEmtAdapterBuilder environmentData(@NonNull EnvironmentData environmentData) {
            if (environmentData != null) {
                this.d = environmentData;
                return this;
            }
            throw new NullPointerException("environmentData is marked non-null but is null");
        }

        public ApsIvaFwEmtAdapterBuilder logLevel(LogUtils.LOG_LEVEL log_level) {
            this.f = log_level;
            return this;
        }

        public ApsIvaFwEmtAdapterBuilder metricsLogger(@NonNull b bVar) {
            if (bVar != null) {
                this.e = bVar;
                return this;
            }
            throw new NullPointerException("metricsLogger is marked non-null but is null");
        }

        public ApsIvaFwEmtAdapterBuilder simidCreativeList(List<SimidCreative> list) {
            this.g = list;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ApsIvaFwEmtAdapter.ApsIvaFwEmtAdapterBuilder(context=");
            sb.append(this.a);
            sb.append(", viewGroup=");
            sb.append(this.b);
            sb.append(", apsIvaListener=");
            sb.append(this.c);
            sb.append(", environmentData=");
            sb.append(this.d);
            sb.append(", metricsLogger=");
            sb.append(this.e);
            sb.append(", logLevel=");
            sb.append(this.f);
            sb.append(", simidCreativeList=");
            return a.b(sb, this.g, ")");
        }

        public ApsIvaFwEmtAdapterBuilder viewGroup(@NonNull ViewGroup viewGroup) {
            if (viewGroup != null) {
                this.b = viewGroup;
                return this;
            }
            throw new NullPointerException("viewGroup is marked non-null but is null");
        }
    }

    public ApsIvaFwEmtAdapter(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull ApsIvaListener apsIvaListener, @NonNull EnvironmentData environmentData, @NonNull b bVar, LogUtils.LOG_LEVEL log_level, List<SimidCreative> list) {
        if (context != null) {
            if (viewGroup != null) {
                if (apsIvaListener != null) {
                    if (environmentData != null) {
                        if (bVar != null) {
                            try {
                                this.k = new com.amazon.aps.iva.ya.a(bVar);
                                if (list != null && list.size() > 0) {
                                    this.g = this.k.parse(list);
                                }
                            } catch (RuntimeException e) {
                                LogUtils.e("ApsIvaFwEmtAdapter", String.format("Error Initializing ApsIvaFwEmtAdapter: %s", e));
                            }
                            a(context, viewGroup, apsIvaListener, environmentData, bVar, a(), log_level);
                            return;
                        }
                        throw new NullPointerException("metricsLogger is marked non-null but is null");
                    }
                    throw new NullPointerException("environmentData is marked non-null but is null");
                }
                throw new NullPointerException("apsIvaListener is marked non-null but is null");
            }
            throw new NullPointerException("viewGroup is marked non-null but is null");
        }
        throw new NullPointerException("context is marked non-null but is null");
    }

    public static ApsIvaFwEmtAdapterBuilder builder(Context context, ApsIvaListener apsIvaListener, EnvironmentData environmentData, ViewGroup viewGroup) {
        b rVar;
        com.amazon.aps.iva.ta.a a = com.amazon.aps.iva.l9.a.d().a();
        a.a(context);
        try {
            rVar = new com.amazon.aps.iva.xa.a(com.amazon.aps.iva.va.b.c().b(), new n(new com.amazon.aps.iva.l9.a(new URL(a.f))), environmentData, a);
        } catch (MalformedURLException e) {
            LogUtils.e("ApsIvaFwEmtAdapter", String.format("Error Creating Metrics Logger: %s", e));
            rVar = new r(1);
        }
        return defaultBuilder().context(context).apsIvaListener(apsIvaListener).environmentData(environmentData).viewGroup(viewGroup).metricsLogger(rVar);
    }

    public static ApsIvaFwEmtAdapterBuilder defaultBuilder() {
        return new ApsIvaFwEmtAdapterBuilder();
    }

    public final q<LoadStatus> a() {
        return new q() { // from class: com.amazon.aps.iva.pa.a
            @Override // com.amazon.aps.iva.wa.q
            public final void a(Object obj) {
                Map<String, CreativeData> map;
                LoadStatus loadStatus = (LoadStatus) obj;
                ApsIvaFwEmtAdapter apsIvaFwEmtAdapter = ApsIvaFwEmtAdapter.this;
                apsIvaFwEmtAdapter.getClass();
                LogUtils.i("ApsIvaFwEmtAdapter", "Ad container status changed to: %s", loadStatus.toString());
                apsIvaFwEmtAdapter.f = loadStatus;
                if (loadStatus == LoadStatus.SUCCEEDED && (map = apsIvaFwEmtAdapter.g) != null && map.size() > 0) {
                    for (String str : apsIvaFwEmtAdapter.g.keySet()) {
                        apsIvaFwEmtAdapter.initializeAd(str, false);
                    }
                }
            }
        };
    }

    @Override // com.amazon.aps.iva.ApsIvaSdkBaseImpl
    public LoadStatus getContainerLoadStatus() {
        return super.getContainerLoadStatus();
    }
}
