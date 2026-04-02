package com.kwad.sdk.api.proxy.app;

import android.content.Context;
import com.kwad.sdk.api.loader.Loader;
import com.kwad.sdk.api.proxy.BaseProxyService;
import com.kwad.sdk.api.proxy.IServiceProxy;
/* loaded from: classes.dex */
public class FileDownloadService {

    /* loaded from: classes.dex */
    public static class SeparateProcessService extends BaseProxyService {
        @Override // com.kwad.sdk.api.proxy.BaseProxyService
        public IServiceProxy getDelegate(Context context) {
            return (IServiceProxy) Loader.get().newComponentProxy(context, SeparateProcessService.class, this);
        }
    }

    /* loaded from: classes.dex */
    public static class SharedMainProcessService extends BaseProxyService {
        @Override // com.kwad.sdk.api.proxy.BaseProxyService
        public IServiceProxy getDelegate(Context context) {
            return (IServiceProxy) Loader.get().newComponentProxy(context, SharedMainProcessService.class, this);
        }
    }
}
