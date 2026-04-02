package com.bytedance.sdk.openadsdk.api;

import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;
/* loaded from: classes.dex */
public final class o {
    private boolean dr = false;
    private int ge = -1;
    private String o = null;
    private ValueSet g = null;

    private o() {
    }

    public static final o dr() {
        return new o();
    }

    public o dr(boolean z) {
        this.dr = z;
        return this;
    }

    public o dr(int i) {
        this.ge = i;
        return this;
    }

    public o dr(ValueSet valueSet) {
        this.g = valueSet;
        return this;
    }

    public Result ge() {
        boolean z = this.dr;
        int i = this.ge;
        String str = this.o;
        ValueSet valueSet = this.g;
        if (valueSet == null) {
            valueSet = g.dr().ge();
        }
        return new dr(z, i, str, valueSet);
    }

    /* loaded from: classes.dex */
    private static final class dr implements Result {
        private final boolean dr;
        private final ValueSet g;
        private final int ge;
        private final String o;

        private dr(boolean z, int i, String str, ValueSet valueSet) {
            this.dr = z;
            this.ge = i;
            this.o = str;
            this.g = valueSet;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public boolean isSuccess() {
            return this.dr;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public int code() {
            return this.ge;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public String message() {
            return this.o;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public ValueSet values() {
            return this.g;
        }
    }
}
