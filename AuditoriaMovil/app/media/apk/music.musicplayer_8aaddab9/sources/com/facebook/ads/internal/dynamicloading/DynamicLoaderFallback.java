package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
@Keep
/* loaded from: classes.dex */
public class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    /* loaded from: classes.dex */
    public class a implements InvocationHandler {
        public final /* synthetic */ List a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Map f4464b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ List f4465c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ List f4466d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Map f4467e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ List f4468f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ List f4469g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Method f4470h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Method f4471i;

        public a(List list, Map map, List list2, List list3, Map map2, List list4, List list5, Method method, Method method2) {
            this.a = list;
            this.f4464b = map;
            this.f4465c = list2;
            this.f4466d = list3;
            this.f4467e = map2;
            this.f4468f = list4;
            this.f4469g = list5;
            this.f4470h = method;
            this.f4471i = method2;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getReturnType().isPrimitive()) {
                if (method.getReturnType().equals(Void.TYPE)) {
                    Iterator it = this.a.iterator();
                    while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, this.f4464b))) {
                    }
                    for (Method method2 : this.f4465c) {
                        if (DynamicLoaderFallback.equalsMethods(method, method2) && DynamicLoaderFallback.reportError(obj, this.f4464b)) {
                            return null;
                        }
                    }
                    return null;
                }
                return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
            } else if (method.getReturnType().equals(String.class)) {
                return "";
            } else {
                Object newProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
                Iterator it2 = this.f4466d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next())) {
                            DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.f4467e.get(obj), (AdListener) objArr[0]);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (Method method3 : this.f4468f) {
                    if (DynamicLoaderFallback.equalsMethods(method, method3)) {
                        this.f4467e.put(newProxyInstance, obj);
                    }
                }
                for (Method method4 : this.f4469g) {
                    if (DynamicLoaderFallback.equalsMethods(method, method4)) {
                        for (Object obj2 : objArr) {
                            if (obj2 instanceof Ad) {
                                this.f4464b.put(newProxyInstance, (Ad) obj2);
                            }
                        }
                    }
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f4470h)) {
                    this.f4464b.put(objArr[1], (Ad) objArr[0]);
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f4471i)) {
                    this.f4464b.put(objArr[1], (Ad) objArr[0]);
                }
                return newProxyInstance;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ AdListener a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Ad f4472b;

        public b(AdListener adListener, Ad ad) {
            this.a = adListener;
            this.f4472b = ad;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.onError(this.f4472b, new AdError(-1, DynamicLoaderFactory.DEX_LOADING_ERROR_MESSAGE));
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public Method a;

        /* renamed from: b  reason: collision with root package name */
        public final InvocationHandler f4473b = new a();

        /* loaded from: classes.dex */
        public class a implements InvocationHandler {
            public a() {
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                c.this.a = method;
                return null;
            }
        }

        public c(a aVar) {
        }

        public <T> T a(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f4473b));
        }
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        c cVar = new c(null);
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.a(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(cVar.a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(cVar.a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(cVar.a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(cVar.a);
        dynamicLoader.createNativeAdApi(null, null);
        Method method = cVar.a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method method2 = cVar.a;
        arrayList.add(cVar.a);
        arrayList2.add(cVar.a);
        ((NativeAdBaseApi) cVar.a(NativeAdBaseApi.class)).buildLoadAdConfig(null);
        arrayList4.add(cVar.a);
        arrayList.add(cVar.a);
        arrayList2.add(cVar.a);
        ((InterstitialAdApi) cVar.a(InterstitialAdApi.class)).buildLoadAdConfig();
        arrayList4.add(cVar.a);
        arrayList.add(cVar.a);
        arrayList2.add(cVar.a);
        ((RewardedVideoAdApi) cVar.a(RewardedVideoAdApi.class)).buildLoadAdConfig();
        arrayList4.add(cVar.a);
        arrayList.add(cVar.a);
        arrayList2.add(cVar.a);
        ((AdViewApi) cVar.a(AdViewApi.class)).buildLoadAdConfig();
        arrayList4.add(cVar.a);
        ((AdView.AdViewLoadConfigBuilder) cVar.a(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) cVar.a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.a);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList, hashMap, arrayList2, arrayList3, hashMap2, arrayList4, arrayList5, method, method2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new b(adListener, ad), 500L);
            return true;
        }
        return false;
    }
}
