package com.segment.analytics.android.integrations.appboy;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.if0.c;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.IBraze;
import com.braze.configuration.BrazeConfig;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.SdkFlavor;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.StringUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.segment.analytics.Analytics;
import com.segment.analytics.Properties;
import com.segment.analytics.Traits;
import com.segment.analytics.ValueMap;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.Logger;
import com.segment.analytics.integrations.TrackPayload;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* loaded from: classes4.dex */
public class AppboyIntegration extends Integration<Braze> {
    private static final String API_KEY_KEY = "apiKey";
    private static final String AUTOMATIC_IN_APP_MESSAGE_REGISTRATION_ENABLED = "automatic_in_app_message_registration_enabled";
    private static final String BRAZE_KEY = "Appboy";
    private static final String CURRENCY_KEY = "currency";
    private static final String CUSTOM_ENDPOINT_KEY = "customEndpoint";
    private static final String DEFAULT_CURRENCY_CODE = "USD";
    private static final String REVENUE_KEY = "revenue";
    private final boolean mAutomaticInAppMessageRegistrationEnabled;
    private final IBraze mBraze;
    private final Context mContext;
    private final Logger mLogger;
    private final String mToken;
    private static final Set<String> MALE_TOKENS = new HashSet(Arrays.asList("M", "MALE"));
    private static final Set<String> FEMALE_TOKENS = new HashSet(Arrays.asList("F", "FEMALE"));
    private static final List<String> RESERVED_KEYS = Arrays.asList("birthday", Scopes.EMAIL, "firstName", "lastName", "gender", "phone", "address", "anonymousId", "userId");
    public static final Integration.Factory FACTORY = new Integration.Factory() { // from class: com.segment.analytics.android.integrations.appboy.AppboyIntegration.1
        @Override // com.segment.analytics.integrations.Integration.Factory
        public Integration<?> create(ValueMap valueMap, Analytics analytics) {
            Logger logger = analytics.logger(AppboyIntegration.BRAZE_KEY);
            String string = valueMap.getString(AppboyIntegration.API_KEY_KEY);
            SdkFlavor sdkFlavor = SdkFlavor.SEGMENT;
            boolean z = valueMap.getBoolean(AppboyIntegration.AUTOMATIC_IN_APP_MESSAGE_REGISTRATION_ENABLED, true);
            if (StringUtils.isNullOrBlank(string)) {
                logger.info("Braze+Segment integration attempted to initialize without api key.", new Object[0]);
                return null;
            }
            String string2 = valueMap.getString(AppboyIntegration.CUSTOM_ENDPOINT_KEY);
            BrazeConfig.Builder sdkMetadata = new BrazeConfig.Builder().setApiKey(string).setSdkFlavor(sdkFlavor).setSdkMetadata(EnumSet.of(BrazeSdkMetadata.SEGMENT));
            if (!StringUtils.isNullOrBlank(string2)) {
                sdkMetadata.setCustomEndpoint(string2);
            }
            Context applicationContext = analytics.getApplication().getApplicationContext();
            Braze.configure(applicationContext, sdkMetadata.build());
            Braze.getInstance(applicationContext);
            logger.verbose("Configured Braze+Segment integration and initialized Braze.", new Object[0]);
            return new AppboyIntegration(applicationContext, string, logger, z);
        }

        @Override // com.segment.analytics.integrations.Integration.Factory
        public String key() {
            return AppboyIntegration.BRAZE_KEY;
        }
    };

    public AppboyIntegration(Context context, String str, Logger logger, boolean z) {
        this.mBraze = null;
        this.mContext = context;
        this.mToken = str;
        this.mLogger = logger;
        this.mAutomaticInAppMessageRegistrationEnabled = z;
    }

    @Override // com.segment.analytics.integrations.Integration
    public void flush() {
        super.flush();
        this.mLogger.verbose("Calling appboy.requestImmediateDataFlush().", new Object[0]);
        getInternalInstance().requestImmediateDataFlush();
    }

    public IBraze getInternalInstance() {
        Context context = this.mContext;
        if (context != null) {
            return Braze.getInstance(context);
        }
        return this.mBraze;
    }

    public String getToken() {
        return this.mToken;
    }

    @Override // com.segment.analytics.integrations.Integration
    public void identify(IdentifyPayload identifyPayload) {
        super.identify(identifyPayload);
        if (!StringUtils.isNullOrBlank(identifyPayload.userId())) {
            getInternalInstance().changeUser(identifyPayload.userId());
        }
        Traits traits = identifyPayload.traits();
        BrazeUser currentUser = getInternalInstance().getCurrentUser();
        if (currentUser == null) {
            this.mLogger.info("Braze.getCurrentUser() was null, aborting identify", new Object[0]);
            return;
        }
        Date birthday = traits.birthday();
        if (birthday != null) {
            Calendar calendar = Calendar.getInstance(Locale.US);
            calendar.setTime(birthday);
            currentUser.setDateOfBirth(calendar.get(1), Month.values()[calendar.get(2)], calendar.get(5));
        }
        String email = traits.email();
        if (!StringUtils.isNullOrBlank(email)) {
            currentUser.setEmail(email);
        }
        String firstName = traits.firstName();
        if (!StringUtils.isNullOrBlank(firstName)) {
            currentUser.setFirstName(firstName);
        }
        String lastName = traits.lastName();
        if (!StringUtils.isNullOrBlank(lastName)) {
            currentUser.setLastName(lastName);
        }
        String gender = traits.gender();
        if (!StringUtils.isNullOrBlank(gender)) {
            if (MALE_TOKENS.contains(gender.toUpperCase())) {
                currentUser.setGender(Gender.MALE);
            } else if (FEMALE_TOKENS.contains(gender.toUpperCase())) {
                currentUser.setGender(Gender.FEMALE);
            }
        }
        String phone = traits.phone();
        if (!StringUtils.isNullOrBlank(phone)) {
            currentUser.setPhoneNumber(phone);
        }
        Traits.Address address = traits.address();
        if (address != null) {
            String city = address.city();
            if (!StringUtils.isNullOrBlank(city)) {
                currentUser.setHomeCity(city);
            }
            String country = address.country();
            if (!StringUtils.isNullOrBlank(country)) {
                currentUser.setCountry(country);
            }
        }
        for (String str : traits.keySet()) {
            if (RESERVED_KEYS.contains(str)) {
                this.mLogger.debug("Skipping reserved key %s", str);
            } else {
                Object obj = traits.get(str);
                if (obj instanceof Boolean) {
                    currentUser.setCustomUserAttribute(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    currentUser.setCustomUserAttribute(str, ((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    currentUser.setCustomUserAttribute(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Float) {
                    currentUser.setCustomUserAttribute(str, ((Float) obj).floatValue());
                } else if (obj instanceof Long) {
                    currentUser.setCustomUserAttribute(str, ((Long) obj).longValue());
                } else if (obj instanceof Date) {
                    currentUser.setCustomUserAttributeToSecondsFromEpoch(str, ((Date) obj).getTime() / 1000);
                } else if (obj instanceof String) {
                    currentUser.setCustomUserAttribute(str, (String) obj);
                } else if (obj instanceof String[]) {
                    currentUser.setCustomAttributeArray(str, (String[]) obj);
                } else if (obj instanceof List) {
                    ArrayList arrayList = new ArrayList((Collection) obj);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof String) {
                            arrayList2.add((String) next);
                        }
                    }
                    if (arrayList2.size() > 0) {
                        currentUser.setCustomAttributeArray(str, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                } else {
                    this.mLogger.info("Braze can't map segment value for custom Braze user attribute with key %s and value %s", str, obj);
                }
            }
        }
    }

    public void logPurchaseForSingleItem(String str, String str2, BigDecimal bigDecimal, c cVar) {
        if (cVar != null && cVar.length() != 0) {
            this.mLogger.verbose("Calling appboy.logPurchase for purchase %s for %.02f %s with properties %s.", str, bigDecimal, str2, cVar.toString());
            getInternalInstance().logPurchase(str, str2, bigDecimal, new BrazeProperties(cVar));
            return;
        }
        this.mLogger.verbose("Calling appboy.logPurchase for purchase %s for %.02f %s with no properties.", str, bigDecimal, str2);
        getInternalInstance().logPurchase(str, str2, bigDecimal);
    }

    @Override // com.segment.analytics.integrations.Integration
    public void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        if (this.mAutomaticInAppMessageRegistrationEnabled) {
            BrazeInAppMessageManager.getInstance().unregisterInAppMessageManager(activity);
        }
    }

    @Override // com.segment.analytics.integrations.Integration
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        if (this.mAutomaticInAppMessageRegistrationEnabled) {
            BrazeInAppMessageManager.getInstance().registerInAppMessageManager(activity);
        }
    }

    @Override // com.segment.analytics.integrations.Integration
    public void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        getInternalInstance().openSession(activity);
    }

    @Override // com.segment.analytics.integrations.Integration
    public void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
        getInternalInstance().closeSession(activity);
    }

    @Override // com.segment.analytics.integrations.Integration
    public void track(TrackPayload trackPayload) {
        String currency;
        super.track(trackPayload);
        if (trackPayload == null) {
            return;
        }
        String event = trackPayload.event();
        Properties properties = trackPayload.properties();
        try {
            if (event.equals("Install Attributed")) {
                ValueMap valueMap = (ValueMap) properties.get(FirebaseAnalytics.Param.CAMPAIGN);
                BrazeUser currentUser = getInternalInstance().getCurrentUser();
                if (valueMap != null && currentUser != null) {
                    currentUser.setAttributionData(new AttributionData(valueMap.getString(FirebaseAnalytics.Param.SOURCE), valueMap.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), valueMap.getString("ad_group"), valueMap.getString("ad_creative")));
                    return;
                }
                return;
            }
        } catch (Exception e) {
            this.mLogger.verbose("This Install Attributed event is not in the proper format and cannot be logged. The exception is %s.", e);
        }
        c jsonObject = properties.toJsonObject();
        double revenue = properties.revenue();
        if (revenue == 0.0d && !event.equals("Order Completed") && !event.equals("Completed Order")) {
            if (jsonObject != null && jsonObject.length() != 0) {
                this.mLogger.verbose("Calling appboy.logCustomEvent for event %s with properties %s.", event, jsonObject.toString());
                getInternalInstance().logCustomEvent(event, new BrazeProperties(jsonObject));
                return;
            }
            this.mLogger.verbose("Calling appboy.logCustomEvent for event %s", event);
            getInternalInstance().logCustomEvent(event);
            return;
        }
        if (StringUtils.isNullOrBlank(properties.currency())) {
            currency = DEFAULT_CURRENCY_CODE;
        } else {
            currency = properties.currency();
        }
        jsonObject.remove(REVENUE_KEY);
        jsonObject.remove("currency");
        if (properties.products() != null) {
            for (Properties.Product product : properties.products()) {
                logPurchaseForSingleItem(product.id(), currency, BigDecimal.valueOf(product.price()), jsonObject);
            }
            return;
        }
        logPurchaseForSingleItem(event, currency, BigDecimal.valueOf(revenue), jsonObject);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.segment.analytics.integrations.Integration
    public Braze getUnderlyingInstance() {
        Context context = this.mContext;
        if (context != null) {
            return Braze.getInstance(context);
        }
        return (Braze) this.mBraze;
    }

    public AppboyIntegration(IBraze iBraze, String str, Logger logger, boolean z) {
        this.mContext = null;
        this.mBraze = iBraze;
        this.mToken = str;
        this.mLogger = logger;
        this.mAutomaticInAppMessageRegistrationEnabled = z;
    }
}
