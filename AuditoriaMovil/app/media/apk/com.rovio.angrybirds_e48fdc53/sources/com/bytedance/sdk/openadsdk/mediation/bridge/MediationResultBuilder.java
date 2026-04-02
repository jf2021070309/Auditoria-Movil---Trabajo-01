package com.bytedance.sdk.openadsdk.mediation.bridge;

import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;
/* loaded from: classes.dex */
public class MediationResultBuilder {
    private boolean a = false;
    private int b = -1;
    private String c = null;
    private ValueSet d = null;

    /* loaded from: classes.dex */
    private static final class ResultImpl implements Result {
        private final boolean a;
        private final int b;
        private final String c;
        private final ValueSet d;

        private ResultImpl(boolean z, int i, String str, ValueSet valueSet) {
            this.a = z;
            this.b = i;
            this.c = str;
            this.d = valueSet;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public int code() {
            return this.b;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public boolean isSuccess() {
            return this.a;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public String message() {
            return this.c;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public ValueSet values() {
            return this.d;
        }
    }

    private MediationResultBuilder() {
    }

    public static final MediationResultBuilder create() {
        return new MediationResultBuilder();
    }

    public Result build() {
        boolean z = this.a;
        int i = this.b;
        String str = this.c;
        ValueSet valueSet = this.d;
        if (valueSet == null) {
            valueSet = MediationValueSetBuilder.create().build();
        }
        return new ResultImpl(z, i, str, valueSet);
    }

    public MediationResultBuilder setCode(int i) {
        this.b = i;
        return this;
    }

    public MediationResultBuilder setMessage(String str) {
        this.c = str;
        return this;
    }

    public MediationResultBuilder setSuccess(boolean z) {
        this.a = z;
        return this;
    }

    public MediationResultBuilder setValues(ValueSet valueSet) {
        this.d = valueSet;
        return this;
    }
}
