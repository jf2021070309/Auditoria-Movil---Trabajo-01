package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public class InitParams {
    private CreativeData creativeData;
    private EnvironmentData environmentData;

    /* loaded from: classes.dex */
    public static class InitParamsBuilder {
        private CreativeData creativeData;
        private EnvironmentData environmentData;

        public InitParams build() {
            return new InitParams(this.creativeData, this.environmentData);
        }

        public InitParamsBuilder creativeData(CreativeData creativeData) {
            this.creativeData = creativeData;
            return this;
        }

        public InitParamsBuilder environmentData(EnvironmentData environmentData) {
            this.environmentData = environmentData;
            return this;
        }

        public String toString() {
            return "InitParams.InitParamsBuilder(creativeData=" + this.creativeData + ", environmentData=" + this.environmentData + ")";
        }
    }

    public InitParams(CreativeData creativeData, EnvironmentData environmentData) {
        this.creativeData = creativeData;
        this.environmentData = environmentData;
    }

    public static InitParamsBuilder builder() {
        return new InitParamsBuilder();
    }

    public String toString() {
        return "InitParams(creativeData=" + this.creativeData + ", environmentData=" + this.environmentData + ")";
    }
}
