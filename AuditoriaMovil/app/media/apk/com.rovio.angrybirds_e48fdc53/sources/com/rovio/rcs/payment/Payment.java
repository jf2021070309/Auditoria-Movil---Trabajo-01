package com.rovio.rcs.payment;
/* loaded from: classes4.dex */
public class Payment {

    /* loaded from: classes4.dex */
    public enum PurchaseStatus {
        SUCCESS(0),
        FAILED(1),
        CANCELED(2),
        PENDING(3),
        RESTORED(4);
        
        private final int a;

        PurchaseStatus(int i) {
            this.a = i;
        }

        public static PurchaseStatus fromInt(int i) {
            return values()[i];
        }

        public int intValue() {
            return this.a;
        }
    }

    /* loaded from: classes4.dex */
    public enum ProviderStatus {
        OK(0),
        NO_NETWORK(1),
        NO_PROVIDER(2);
        
        private final int a;

        ProviderStatus(int i) {
            this.a = i;
        }

        public int intValue() {
            return this.a;
        }
    }
}
