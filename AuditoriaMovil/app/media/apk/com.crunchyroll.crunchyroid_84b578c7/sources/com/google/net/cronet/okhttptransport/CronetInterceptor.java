package com.google.net.cronet.okhttptransport;

import com.amazon.aps.iva.m6.e;
import com.google.common.base.Preconditions;
import com.google.net.cronet.okhttptransport.RequestResponseConverter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
/* loaded from: classes4.dex */
public final class CronetInterceptor implements Interceptor, AutoCloseable {
    private static final int CANCELLATION_CHECK_INTERVAL_MILLIS = 500;
    private static final String TAG = "CronetInterceptor";
    private final Map<Call, UrlRequest> activeCalls;
    private final RequestResponseConverter converter;
    private final ScheduledExecutorService scheduledExecutor;

    /* loaded from: classes4.dex */
    public static final class Builder extends RequestResponseConverterBasedBuilder<Builder, CronetInterceptor> {
        public Builder(CronetEngine cronetEngine) {
            super(cronetEngine, Builder.class);
        }

        @Override // com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder
        public CronetInterceptor build(RequestResponseConverter requestResponseConverter) {
            return new CronetInterceptor(requestResponseConverter);
        }
    }

    /* loaded from: classes4.dex */
    public class CronetInterceptorResponseBody extends CronetTransportResponseBody {
        private final Call call;

        @Override // com.google.net.cronet.okhttptransport.CronetTransportResponseBody
        public void customCloseHook() {
            CronetInterceptor.this.activeCalls.remove(this.call);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private CronetInterceptorResponseBody(ResponseBody responseBody, Call call) {
            super(responseBody);
            CronetInterceptor.this = r1;
            this.call = call;
        }
    }

    public /* synthetic */ void lambda$new$0() {
        Iterator<Map.Entry<Call, UrlRequest>> it = this.activeCalls.entrySet().iterator();
        while (it.hasNext()) {
            try {
                Map.Entry<Call, UrlRequest> next = it.next();
                if (next.getKey().isCanceled()) {
                    it.remove();
                    next.getValue().cancel();
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    public static Builder newBuilder(CronetEngine cronetEngine) {
        return new Builder(cronetEngine);
    }

    private Response toInterceptorResponse(Response response, Call call) {
        Preconditions.checkNotNull(response.body());
        if (response.body() instanceof CronetInterceptorResponseBody) {
            return response;
        }
        return response.newBuilder().body(new CronetInterceptorResponseBody(response.body(), call)).build();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.scheduledExecutor.shutdown();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        if (!chain.call().isCanceled()) {
            RequestResponseConverter.CronetRequestAndOkHttpResponse convert = this.converter.convert(chain.request(), chain.readTimeoutMillis(), chain.writeTimeoutMillis());
            this.activeCalls.put(chain.call(), convert.getRequest());
            try {
                convert.getRequest().start();
                return toInterceptorResponse(convert.getResponse(), chain.call());
            } catch (IOException | RuntimeException e) {
                this.activeCalls.remove(chain.call());
                throw e;
            }
        }
        throw new IOException("Canceled");
    }

    private CronetInterceptor(RequestResponseConverter requestResponseConverter) {
        this.activeCalls = new ConcurrentHashMap();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.scheduledExecutor = scheduledThreadPoolExecutor;
        this.converter = (RequestResponseConverter) Preconditions.checkNotNull(requestResponseConverter);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new e(this, 8), 500L, 500L, TimeUnit.MILLISECONDS);
    }
}
