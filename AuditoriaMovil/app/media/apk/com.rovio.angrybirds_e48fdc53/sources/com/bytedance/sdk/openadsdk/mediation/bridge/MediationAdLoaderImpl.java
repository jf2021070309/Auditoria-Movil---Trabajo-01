package com.bytedance.sdk.openadsdk.mediation.bridge;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.umeng.analytics.pro.o;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class MediationAdLoaderImpl implements IMediationAdLoader {
    public static final String TAG = "TTMediationSDK";
    private Bridge a;
    public MediationAdSlotValueSet mSlotValueSet;

    private Object a(Object obj, String str) throws IllegalAccessException {
        Field a = a(obj.getClass(), str);
        if (a != null) {
            return a(a, obj);
        }
        return null;
    }

    private Object a(Field field, Object obj) throws IllegalAccessException {
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        return field.get(obj);
    }

    private Field a(Class<?> cls, String str) {
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (declaredField.isAccessible()) {
                    return declaredField;
                }
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public final <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 8241) {
            load((Context) valueSet.objectValue(8009, Context.class), (ValueSet) valueSet.objectValue(8424, ValueSet.class));
        }
        return (T) callFunction(i, valueSet, cls);
    }

    public <T> T callFunction(int i, ValueSet valueSet, Class<T> cls) {
        return null;
    }

    public String getAdm() {
        Bridge bridge = this.a;
        return bridge != null ? (String) bridge.call(8137, null, String.class) : "";
    }

    public String getAdnId() {
        MediationAdSlotValueSet mediationAdSlotValueSet = this.mSlotValueSet;
        if (mediationAdSlotValueSet != null) {
            return mediationAdSlotValueSet.getADNId();
        }
        return null;
    }

    public Bridge getGMBridge() {
        Bridge bridge = this.a;
        if (bridge != null) {
            return (Bridge) bridge.call(8127, null, Bridge.class);
        }
        return null;
    }

    public int getLoadTimeOut() {
        MediationAdSlotValueSet mediationAdSlotValueSet = this.mSlotValueSet;
        if (mediationAdSlotValueSet != null) {
            return mediationAdSlotValueSet.getAdLoadTimeOut();
        }
        return 3000;
    }

    public Activity getOriginActivity(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            return (Activity) a(activity, "mOriginActivity");
        } catch (Throwable th) {
            return null;
        }
    }

    public int getOriginType() {
        MediationAdSlotValueSet mediationAdSlotValueSet = this.mSlotValueSet;
        if (mediationAdSlotValueSet != null) {
            return mediationAdSlotValueSet.getOriginType();
        }
        return 0;
    }

    public String getRitId() {
        MediationAdSlotValueSet mediationAdSlotValueSet = this.mSlotValueSet;
        if (mediationAdSlotValueSet != null) {
            return mediationAdSlotValueSet.getRitId();
        }
        return null;
    }

    public boolean getSplashShakeButton() {
        MediationAdSlotValueSet mediationAdSlotValueSet = this.mSlotValueSet;
        if (mediationAdSlotValueSet != null) {
            return mediationAdSlotValueSet.isSplashShakeButton();
        }
        return false;
    }

    public boolean hasNotifyFail() {
        Boolean bool;
        Bridge bridge = this.a;
        if (bridge == null || (bool = (Boolean) bridge.call(o.a.A, null, Boolean.class)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isClientBidding() {
        Bridge bridge = this.a;
        if (bridge != null) {
            return ((Boolean) bridge.call(8110, null, Boolean.class)).booleanValue();
        }
        return false;
    }

    public boolean isMultiBidding() {
        Bridge bridge = this.a;
        if (bridge != null) {
            return ((Boolean) bridge.call(8141, null, Boolean.class)).booleanValue();
        }
        return false;
    }

    public boolean isServerBidding() {
        Bridge bridge = this.a;
        if (bridge != null) {
            return ((Boolean) bridge.call(8136, null, Boolean.class)).booleanValue();
        }
        return false;
    }

    public boolean isSplashPreLoad() {
        MediationAdSlotValueSet mediationAdSlotValueSet = this.mSlotValueSet;
        if (mediationAdSlotValueSet != null) {
            return mediationAdSlotValueSet.isSplashPreLoad();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationAdLoader
    public final void load(Context context, ValueSet valueSet) {
        MediationAdSlotValueSet create = MediationAdSlotValueSet.create(valueSet);
        this.mSlotValueSet = create;
        this.a = create.getAdLoaderCallback();
        realLoader(context, create);
    }

    public void notifyAdCache(Bridge bridge, int i, String str) {
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8303, bridge);
            create.add(8014, i);
            create.add(8015, str);
            this.a.call(8112, create.build(), Void.class);
        }
    }

    public void notifyAdFailed(int i, String str) {
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8014, i);
            create.add(8015, str);
            this.a.call(8108, create.build(), Void.class);
        }
    }

    public void notifyAdSuccess(Bridge bridge, Bridge bridge2) {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8035, bridge);
        bridge2.call(8128, create.build(), Void.class);
        if (this.a != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bridge2);
            notifyAdSuccess(arrayList);
        }
    }

    public void notifyAdSuccess(List<Bridge> list) {
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8303, list);
            this.a.call(8107, create.build(), Bridge.class);
        }
    }

    public abstract void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet);

    public void removeSelfFromParent(View view) {
        if (view != null) {
            try {
                ViewParent parent = view.getParent();
                if (parent == null || !(parent instanceof ViewGroup)) {
                    return;
                }
                ((ViewGroup) parent).removeView(view);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
