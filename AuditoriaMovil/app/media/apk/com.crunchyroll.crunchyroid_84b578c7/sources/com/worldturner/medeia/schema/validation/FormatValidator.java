package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.FormatValidation;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: FormatValidator.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B%\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b$\u0010%J\"\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/worldturner/medeia/schema/validation/FormatValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "", "value", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "", "msg", "Lcom/worldturner/medeia/api/FailedValidationResult;", "failedValidation", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "startLevel", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/api/ValidationResult;", "validate", "format", "Ljava/lang/String;", "getFormat", "()Ljava/lang/String;", "", "Lcom/worldturner/medeia/api/FormatValidation;", "customFormats", "Ljava/util/Map;", "getCustomFormats", "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class FormatValidator implements SchemaValidator, SchemaValidatorInstance {
    public static final Companion Companion = new Companion(null);
    private final Map<String, FormatValidation> customFormats;
    private final String format;

    /* compiled from: FormatValidator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Lcom/worldturner/medeia/schema/validation/FormatValidator$Companion;", "", "()V", "create", "Lcom/worldturner/medeia/schema/validation/FormatValidator;", "format", "", "customFormats", "", "Lcom/worldturner/medeia/api/FormatValidation;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final FormatValidator create(String str, Map<String, ? extends FormatValidation> map) {
            j.g(map, "customFormats");
            if (str != null) {
                return new FormatValidator(str, map);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FormatValidator(String str, Map<String, ? extends FormatValidation> map) {
        j.g(str, "format");
        j.g(map, "customFormats");
        this.format = str;
        this.customFormats = map;
    }

    private final FailedValidationResult failedValidation(Object obj, JsonTokenLocation jsonTokenLocation, String str) {
        return new FailedValidationResult("format", (String) null, "Invalid " + this.format + " '" + obj + "': " + str, jsonTokenLocation, (Collection) null, 18, (e) null);
    }

    public final Map<String, FormatValidation> getCustomFormats() {
        return this.customFormats;
    }

    public final String getFormat() {
        return this.format;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
        return failedValidation((java.lang.Object) r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
        return failedValidation((java.lang.Object) r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
        return com.worldturner.medeia.api.OkValidationResult.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
        return com.worldturner.medeia.api.OkValidationResult.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r1.equals("uri-reference") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r1.equals("iri-reference") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        java.net.URI.create(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
        if (r1.equals("time") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e3, code lost:
        if (r1.equals("date") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ea, code lost:
        if (r1.equals("uri") != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f3, code lost:
        if (r1.equals("iri") != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f5, code lost:
        r0 = java.net.URI.create(r5);
        com.amazon.aps.iva.yb0.j.b(r0, "uri");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0100, code lost:
        if (r0.isAbsolute() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0102, code lost:
        r5 = com.worldturner.medeia.api.OkValidationResult.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0106, code lost:
        r5 = failedValidation(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010c, code lost:
        r5 = failedValidation(r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0117, code lost:
        if (r1.equals("date-time") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0119, code lost:
        new java.text.SimpleDateFormat().parse(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0124, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.worldturner.medeia.api.ValidationResult] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x010c -> B:105:0x0170). Please submit an issue!!! */
    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.worldturner.medeia.api.ValidationResult validate(com.worldturner.medeia.parser.JsonTokenData r5, com.worldturner.medeia.parser.JsonTokenLocation r6) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.worldturner.medeia.schema.validation.FormatValidator.validate(com.worldturner.medeia.parser.JsonTokenData, com.worldturner.medeia.parser.JsonTokenLocation):com.worldturner.medeia.api.ValidationResult");
    }

    public /* synthetic */ FormatValidator(String str, Map map, int i, e eVar) {
        this(str, (i & 2) != 0 ? a0.b : map);
    }

    private final FailedValidationResult failedValidation(Object obj, JsonTokenLocation jsonTokenLocation) {
        return new FailedValidationResult("format", (String) null, "Invalid " + this.format + " '" + obj + '\'', jsonTokenLocation, (Collection) null, 18, (e) null);
    }

    private final FailedValidationResult failedValidation(Object obj, JsonTokenLocation jsonTokenLocation, Exception exc) {
        FailedValidationResult failedValidation;
        String message = exc.getMessage();
        return (message == null || (failedValidation = failedValidation(obj, jsonTokenLocation, message)) == null) ? failedValidation(obj, jsonTokenLocation) : failedValidation;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return this;
    }
}
