package com.google.net.cronet.okhttptransport;

import com.google.common.base.Preconditions;
import com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class RequestResponseConverterBasedBuilder<SubBuilderT extends RequestResponseConverterBasedBuilder<?, ? extends ObjectBeingBuiltT>, ObjectBeingBuiltT> {
    private static final int DEFAULT_THREAD_POOL_SIZE = 4;
    private final SubBuilderT castedThis;
    private final CronetEngine cronetEngine;
    private int uploadDataProviderExecutorSize = 4;
    private RedirectStrategy redirectStrategy = null;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestResponseConverterBasedBuilder(CronetEngine cronetEngine, Class<SubBuilderT> cls) {
        this.cronetEngine = (CronetEngine) Preconditions.checkNotNull(cronetEngine);
        Preconditions.checkArgument(getClass().equals(cls));
        this.castedThis = this;
    }

    public ObjectBeingBuiltT build() {
        if (this.redirectStrategy == null) {
            this.redirectStrategy = RedirectStrategy.defaultStrategy();
        }
        return build(new RequestResponseConverter(this.cronetEngine, Executors.newFixedThreadPool(this.uploadDataProviderExecutorSize), RequestBodyConverterImpl.create(Executors.newCachedThreadPool()), new ResponseConverter(), this.redirectStrategy));
    }

    public abstract ObjectBeingBuiltT build(RequestResponseConverter requestResponseConverter);

    public final SubBuilderT setRedirectStrategy(RedirectStrategy redirectStrategy) {
        Preconditions.checkNotNull(redirectStrategy);
        this.redirectStrategy = redirectStrategy;
        return this.castedThis;
    }

    public final SubBuilderT setUploadDataProviderExecutorSize(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The number of threads must be positive!");
        this.uploadDataProviderExecutorSize = i;
        return this.castedThis;
    }
}
