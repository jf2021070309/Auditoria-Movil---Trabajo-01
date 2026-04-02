package com.rovio.rcs.payment.google;
/* loaded from: classes4.dex */
public class Consts {
    public static final boolean DEBUG = true;
    public static final String EXTRA_PARAMS_KEY_ACCOUNT_ID = "accountId";
    public static final String EXTRA_PARAMS_KEY_SKUS_TO_REPLACE = "skusToReplace";
    public static final String GET_SKU_DETAILS_ITEM_LIST = "ITEM_ID_LIST";
    public static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    public static final String IN_APP_BILLING_SERVICE_ACTION = "com.android.vending.billing.InAppBillingService.BIND";
    public static final String IN_APP_BILLING_SERVICE_PACKAGE = "com.android.vending";
    public static final String ITEM_TYPE_INAPP = "inapp";
    public static final String ITEM_TYPE_SUBSCRIPTION = "subs";
    public static final int MAX_SKU_DETAILS = 20;
    public static final String RESPONSE_BUY_INTENT = "BUY_INTENT";
    public static final String RESPONSE_CODE = "RESPONSE_CODE";
    public static final String RESPONSE_GET_SKU_DETAILS_LIST = "DETAILS_LIST";
    public static final String RESPONSE_INAPP_ITEM_LIST = "INAPP_PURCHASE_ITEM_LIST";
    public static final String RESPONSE_INAPP_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
    public static final String RESPONSE_INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    public static final String RESPONSE_INAPP_SIGNATURE = "INAPP_DATA_SIGNATURE";
    public static final String RESPONSE_INAPP_SIGNATURE_LIST = "INAPP_DATA_SIGNATURE_LIST";

    /* loaded from: classes4.dex */
    public enum ResponseCode {
        RESULT_OK,
        RESULT_USER_CANCELED,
        RESULT_SERVICE_UNAVAILABLE,
        RESULT_BILLING_UNAVAILABLE,
        RESULT_ITEM_UNAVAILABLE,
        RESULT_DEVELOPER_ERROR,
        RESULT_ERROR,
        RESULT_ITEM_ALREADY_OWNED,
        RESULT_ITEM_NOT_OWNED;

        public static ResponseCode valueOf(int i) {
            ResponseCode[] values = values();
            return (i < 0 || i >= values.length) ? RESULT_ERROR : values[i];
        }
    }
}
