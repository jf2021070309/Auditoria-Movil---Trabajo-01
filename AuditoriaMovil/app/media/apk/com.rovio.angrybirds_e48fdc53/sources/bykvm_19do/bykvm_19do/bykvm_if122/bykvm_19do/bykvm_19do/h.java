package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do;

import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.TTRequestExtraParams;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.api.v2.slot.GMAdSlotFullVideo;
import com.bytedance.msdk.api.v2.slot.GMAdSlotInterstitialFull;
import com.bytedance.msdk.api.v2.slot.GMAdSlotRewardVideo;
import com.bytedance.msdk.base.TTBaseAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class h extends TTAbsAdLoaderAdapter {
    private String w;
    private a x;

    /* loaded from: classes.dex */
    static class a implements Bridge {
        private TTAbsAdLoaderAdapter a;
        private int b;
        private int c;
        private Bridge d;

        public a(int i, int i2, TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter) {
            this.b = i;
            this.c = i2;
            this.a = tTAbsAdLoaderAdapter;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private TTBaseAd a() {
            switch (this.b) {
                case 1:
                    return new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do.a(this.a);
                case 2:
                    return new d(this.a);
                case 3:
                    return new g(this.a);
                case 5:
                case 9:
                    return new e(this.a);
                case 7:
                    return new f(this.a);
                case 8:
                    return new c(this.a);
                case 10:
                    int i = this.c;
                    if (i == 1) {
                        return new d(this.a);
                    }
                    if (i == 2) {
                        return new c(this.a);
                    }
                    break;
            }
            return null;
        }

        public String a(Context context, String str, Object obj) {
            if (this.d != null) {
                MediationValueSetBuilder create = MediationValueSetBuilder.create();
                create.add(8009, context);
                create.add(8007, str);
                create.add(8044, obj);
                this.d.call(8139, create.build(), Void.class);
                return null;
            }
            return null;
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            boolean hasNotifyFail;
            if (i == 8108) {
                this.a.notifyAdFailed(new AdError(valueSet.intValue(8014), valueSet.stringValue(8015)));
            } else if (i == 8112) {
                Bridge bridge = (Bridge) valueSet.objectValue(8303, Bridge.class);
                int intValue = valueSet.intValue(8014);
                String stringValue = valueSet.stringValue(8015);
                if (bridge instanceof TTBaseAd) {
                    this.a.notifyAdVideoCache((TTBaseAd) bridge, new AdError(intValue, stringValue));
                }
            } else if (i != 8107) {
                if (i == 8127) {
                    return (T) a();
                }
                if (i == 8110) {
                    hasNotifyFail = this.a.isClientBidding();
                } else if (i == 8136) {
                    hasNotifyFail = this.a.isServerBidding();
                } else if (i == 8141) {
                    hasNotifyFail = this.a.isMultiBidding();
                } else if (i == 8137) {
                    return (T) this.a.getAdm();
                } else {
                    if (i == 8138) {
                        this.d = (Bridge) valueSet.objectValue(8043, Bridge.class);
                    } else if (i == 8210) {
                        hasNotifyFail = this.a.hasNotifyFail();
                    }
                }
                return (T) Boolean.valueOf(hasNotifyFail);
            } else {
                List list = (List) valueSet.objectValue(8303, List.class);
                if (list.size() <= 0 || (list.get(0) instanceof e)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof TTBaseAd) {
                            arrayList.add((TTBaseAd) obj);
                        }
                    }
                    this.a.notifyAdLoaded(arrayList);
                } else if (list.get(0) instanceof TTBaseAd) {
                    this.a.notifyAdLoaded((TTBaseAd) list.get(0));
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    public h(String str) {
        this.w = str;
    }

    public static MediationValueSetBuilder a(Context context, TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter, GMAdSlotBase gMAdSlotBase, String str, String str2, Map<String, Object> map, AdSlot adSlot) {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8090, gMAdSlotBase.getValueSet());
        create.add(8007, tTAbsAdLoaderAdapter.getAdSlotId());
        create.add(4, tTAbsAdLoaderAdapter.getAdapterRit());
        create.add(8003, tTAbsAdLoaderAdapter.getAdNetWorkName());
        create.add(8009, context);
        create.add(8044, gMAdSlotBase.getParams());
        create.add(8429, str);
        create.add(8430, str2);
        create.add(11, adSlot.isSupportDeepLink());
        create.add(20, adSlot.getAdloadSeq());
        Map<String, String> customData = gMAdSlotBase instanceof GMAdSlotInterstitialFull ? ((GMAdSlotInterstitialFull) gMAdSlotBase).getCustomData() : gMAdSlotBase instanceof GMAdSlotFullVideo ? ((GMAdSlotFullVideo) gMAdSlotBase).getCustomData() : gMAdSlotBase instanceof GMAdSlotRewardVideo ? ((GMAdSlotRewardVideo) gMAdSlotBase).getCustomData() : null;
        if (customData != null) {
            create.add(8013, customData);
        }
        if (map != null) {
            create.add(8096, map.get(TTRequestExtraParams.PARAM_AD_LOAD_TIMEOUT) != null ? ((Integer) map.get(TTRequestExtraParams.PARAM_AD_LOAD_TIMEOUT)).intValue() : 3000);
        }
        Object obj = map.get("contentUrl");
        if (obj instanceof String) {
            create.add(8083, (String) obj);
        }
        Object obj2 = map.get("testDevices");
        if (obj2 instanceof String) {
            create.add(8084, (String) obj2);
        }
        Object obj3 = map.get("tt_ad_origin_type");
        if (obj3 != null) {
            int intValue = ((Integer) obj3).intValue();
            if (intValue == 1 || intValue == 3) {
                create.add(8033, true);
            }
            create.add(8085, intValue);
        }
        Object obj4 = map.get("tt_ad_sub_type");
        if (obj4 != null) {
            create.add(8094, ((Integer) obj4).intValue());
        }
        return create;
    }

    private void a(Context context, String str, ValueSet valueSet) {
        try {
            Object newInstance = Class.forName(str).newInstance();
            if (newInstance instanceof Bridge) {
                MediationValueSetBuilder create = MediationValueSetBuilder.create();
                create.add(8009, context);
                create.add(8424, valueSet);
                ((Bridge) newInstance).call(8241, create.build(), null);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter
    public void destroy() {
    }

    @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter
    public String getAdNetWorkName() {
        k kVar = this.mWaterFallConfig;
        return kVar != null ? kVar.e() : "";
    }

    @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter
    public String getBiddingToken(Context context, String str, GMAdSlotBase gMAdSlotBase) {
        if (this.x == null || gMAdSlotBase == null) {
            return null;
        }
        return this.x.a(context, str, MediationAdSlotValueSet.create(gMAdSlotBase.getValueSet()).getBaiduRequestParameters());
    }

    @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter
    public String getSdkVersion() {
        ITTAdapterConfiguration a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c.b().a(getAdNetWorkName());
        if (a2 != null) {
            return a2.getNetworkSdkVersion();
        }
        return null;
    }

    @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter
    public final void loadAd(Context context, Map<String, Object> map) {
        MediationValueSetBuilder a2 = a(context, this, this.mGMAdSlotBase, this.mWaterfallAbTestParam, getClientReqId(), map, this.mAdSlot);
        a aVar = new a(this.mAdSlot.getAdType(), this.mSubAdType, this);
        this.x = aVar;
        a2.add(8011, aVar);
        a(context, this.w, a2.build());
    }
}
