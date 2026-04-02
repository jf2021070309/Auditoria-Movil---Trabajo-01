package com.segment.analytics;

import com.segment.analytics.internal.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public class Properties extends ValueMap {
    private static final String CATEGORY_KEY = "category";
    private static final String COUPON_KEY = "coupon";
    private static final String CURRENCY_KEY = "currency";
    private static final String DISCOUNT_KEY = "discount";
    private static final String ID_KEY = "id";
    private static final String NAME_KEY = "name";
    private static final String ORDER_ID_KEY = "orderId";
    private static final String PATH_KEY = "path";
    private static final String PRICE_KEY = "price";
    private static final String PRODUCTS_KEY = "products";
    private static final String REFERRER_KEY = "referrer";
    private static final String REPEAT_KEY = "repeat";
    private static final String REVENUE_KEY = "revenue";
    private static final String SHIPPING_KEY = "shipping";
    private static final String SKU_KEY = "sku";
    private static final String SUBTOTAL_KEY = "subtotal";
    private static final String TAX_KEY = "tax";
    private static final String TITLE_KEY = "title";
    private static final String TOTAL_KEY = "total";
    private static final String URL_KEY = "url";
    private static final String VALUE_KEY = "value";

    /* loaded from: classes4.dex */
    public static class Product extends ValueMap {
        private static final String ID_KEY = "id";
        private static final String NAME_KEY = "name";
        private static final String PRICE_KEY = "price";
        private static final String PRODUCT_ID_KEY = "product_id";
        private static final String SKU_KEY = "sku";

        public Product(String str, String str2, double d) {
            put(ID_KEY, (Object) str);
            put(SKU_KEY, (Object) str2);
            put("price", (Object) Double.valueOf(d));
        }

        public String id() {
            String str = ID_KEY;
            if (getString(ID_KEY) == null) {
                str = PRODUCT_ID_KEY;
            }
            return getString(str);
        }

        public String name() {
            return getString("name");
        }

        public double price() {
            return getDouble("price", 0.0d);
        }

        public Product putName(String str) {
            return putValue("name", (Object) str);
        }

        public String sku() {
            return getString(SKU_KEY);
        }

        @Override // com.segment.analytics.ValueMap
        public Product putValue(String str, Object obj) {
            super.putValue(str, obj);
            return this;
        }

        private Product(Map<String, Object> map) {
            super(map);
        }
    }

    public Properties() {
    }

    public String category() {
        return getString(CATEGORY_KEY);
    }

    public String coupon() {
        return getString("coupon");
    }

    public String currency() {
        return getString("currency");
    }

    public double discount() {
        return getDouble("discount", 0.0d);
    }

    public boolean isRepeatCustomer() {
        return getBoolean(REPEAT_KEY, false);
    }

    public String name() {
        return getString("name");
    }

    public String orderId() {
        return getString(ORDER_ID_KEY);
    }

    public String path() {
        return getString(PATH_KEY);
    }

    public double price() {
        return getDouble("price", 0.0d);
    }

    public String productId() {
        return getString(ID_KEY);
    }

    public List<Product> products(Product... productArr) {
        return products();
    }

    public Properties putCategory(String str) {
        return putValue(CATEGORY_KEY, (Object) str);
    }

    public Properties putCoupon(String str) {
        return putValue("coupon", (Object) str);
    }

    public Properties putCurrency(String str) {
        return putValue("currency", (Object) str);
    }

    public Properties putDiscount(double d) {
        return putValue("discount", (Object) Double.valueOf(d));
    }

    public Properties putName(String str) {
        return putValue("name", (Object) str);
    }

    public Properties putOrderId(String str) {
        return putValue(ORDER_ID_KEY, (Object) str);
    }

    public Properties putPath(String str) {
        return putValue(PATH_KEY, (Object) str);
    }

    public Properties putPrice(double d) {
        return putValue("price", (Object) Double.valueOf(d));
    }

    public Properties putProductId(String str) {
        return putValue(ID_KEY, (Object) str);
    }

    public Properties putProducts(Product... productArr) {
        if (!Utils.isNullOrEmpty(productArr)) {
            ArrayList arrayList = new ArrayList(productArr.length);
            Collections.addAll(arrayList, productArr);
            return putValue(PRODUCTS_KEY, (Object) Collections.unmodifiableList(arrayList));
        }
        throw new IllegalArgumentException("products cannot be null or empty.");
    }

    public Properties putReferrer(String str) {
        return putValue(REFERRER_KEY, (Object) str);
    }

    public Properties putRepeatCustomer(boolean z) {
        return putValue(REPEAT_KEY, (Object) Boolean.valueOf(z));
    }

    public Properties putRevenue(double d) {
        return putValue(REVENUE_KEY, (Object) Double.valueOf(d));
    }

    public Properties putShipping(double d) {
        return putValue("shipping", (Object) Double.valueOf(d));
    }

    public Properties putSku(String str) {
        return putValue(SKU_KEY, (Object) str);
    }

    public Properties putSubtotal(double d) {
        return putValue(SUBTOTAL_KEY, (Object) Double.valueOf(d));
    }

    public Properties putTax(double d) {
        return putValue("tax", (Object) Double.valueOf(d));
    }

    public Properties putTitle(String str) {
        return putValue(TITLE_KEY, (Object) str);
    }

    public Properties putTotal(double d) {
        return putValue(TOTAL_KEY, (Object) Double.valueOf(d));
    }

    public Properties putUrl(String str) {
        return putValue("url", (Object) str);
    }

    public String referrer() {
        return getString(REFERRER_KEY);
    }

    public double revenue() {
        return getDouble(REVENUE_KEY, 0.0d);
    }

    public double shipping() {
        return getDouble("shipping", 0.0d);
    }

    public String sku() {
        return getString(SKU_KEY);
    }

    public double subtotal() {
        return getDouble(SUBTOTAL_KEY, 0.0d);
    }

    public double tax() {
        return getDouble("tax", 0.0d);
    }

    public String title() {
        return getString(TITLE_KEY);
    }

    public double total() {
        double d = getDouble(TOTAL_KEY, 0.0d);
        if (d != 0.0d) {
            return d;
        }
        double revenue = revenue();
        if (revenue != 0.0d) {
            return revenue;
        }
        return value();
    }

    public String url() {
        return getString("url");
    }

    public double value() {
        double d = getDouble("value", 0.0d);
        if (d != 0.0d) {
            return d;
        }
        return revenue();
    }

    public Properties(int i) {
        super(i);
    }

    public List<Product> products() {
        return getList(PRODUCTS_KEY, Product.class);
    }

    @Deprecated
    public double putSubtotal() {
        return subtotal();
    }

    @Override // com.segment.analytics.ValueMap
    public Properties putValue(String str, Object obj) {
        super.putValue(str, obj);
        return this;
    }

    public Properties(Map<String, Object> map) {
        super(map);
    }

    public Properties putValue(double d) {
        return putValue("value", (Object) Double.valueOf(d));
    }
}
