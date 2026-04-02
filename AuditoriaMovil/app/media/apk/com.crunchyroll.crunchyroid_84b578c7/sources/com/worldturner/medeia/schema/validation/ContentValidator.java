package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.e0.f;
import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.a;
import com.amazon.aps.iva.va0.c;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationFailedException;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Locale;
import kotlin.Metadata;
import org.apache.commons.codec.binary.Base64;
/* compiled from: ContentValidator.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u001b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lcom/worldturner/medeia/schema/validation/ContentValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "", "string", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/schema/validation/DecodingResult;", "validateContentEncoding", "decoding", "Lcom/worldturner/medeia/api/ValidationResult;", "validateContentMediaType", "", "startLevel", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "validate", "contentMediaType", "Ljava/lang/String;", "getContentMediaType", "()Ljava/lang/String;", "contentEncoding", "getContentEncoding", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ContentValidator implements SchemaValidator, SchemaValidatorInstance {
    public static final Companion Companion = new Companion(null);
    private final String contentEncoding;
    private final String contentMediaType;

    /* compiled from: ContentValidator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ContentValidator$Companion;", "", "()V", "create", "Lcom/worldturner/medeia/schema/validation/ContentValidator;", "contentMediaType", "", "contentEncoding", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ContentValidator create(String str, String str2) {
            if (SchemaValidatorKt.isAnyNotNull(str, str2)) {
                return new ContentValidator(str, str2);
            }
            return null;
        }
    }

    public ContentValidator(String str, String str2) {
        String str3;
        String str4 = null;
        if (str != null) {
            Locale locale = Locale.US;
            j.b(locale, "Locale.US");
            str3 = str.toLowerCase(locale);
            j.b(str3, "(this as java.lang.String).toLowerCase(locale)");
        } else {
            str3 = null;
        }
        this.contentMediaType = str3;
        if (str2 != null) {
            Locale locale2 = Locale.US;
            j.b(locale2, "Locale.US");
            str4 = str2.toLowerCase(locale2);
            j.b(str4, "(this as java.lang.String).toLowerCase(locale)");
        }
        this.contentEncoding = str4;
    }

    private final DecodingResult validateContentEncoding(String str, JsonTokenLocation jsonTokenLocation) {
        String str2 = this.contentEncoding;
        if (str2 != null && str2.hashCode() == -1396204209 && str2.equals("base64")) {
            try {
                Charset charset = a.b;
                if (str != null) {
                    byte[] bytes = str.getBytes(charset);
                    j.b(bytes, "(this as java.lang.String).getBytes(charset)");
                    if (Base64.isBase64(bytes)) {
                        return new DecodingResult(Base64.decodeBase64(bytes), null, null, 6, null);
                    }
                    throw new IllegalArgumentException();
                }
                throw new o("null cannot be cast to non-null type java.lang.String");
            } catch (IllegalArgumentException e) {
                return new DecodingResult(null, null, new FailedValidationResult("contentEncoding", (String) null, "Invalid base64 data: " + e.getMessage(), jsonTokenLocation, (Collection) null, 18, (e) null), 3, null);
            }
        }
        return new DecodingResult(null, str, null, 5, null);
    }

    private final ValidationResult validateContentMediaType(DecodingResult decodingResult, JsonTokenLocation jsonTokenLocation) {
        String str = this.contentMediaType;
        if (str != null && str.hashCode() == -43840953 && str.equals("application/json")) {
            try {
                new f(decodingResult.toString());
                return OkValidationResult.INSTANCE;
            } catch (c e) {
                return new FailedValidationResult("contentMediaType", (String) null, "Invalid JSON: " + e.getMessage(), jsonTokenLocation, (Collection) null, 18, (e) null);
            } catch (ValidationFailedException e2) {
                return (ValidationResult) x.t0(e2.getFailures());
            }
        }
        return OkValidationResult.INSTANCE;
    }

    public final String getContentEncoding() {
        return this.contentEncoding;
    }

    public final String getContentMediaType() {
        return this.contentMediaType;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (jsonTokenData.getType() != JsonTokenType.VALUE_TEXT) {
            return OkValidationResult.INSTANCE;
        }
        String text = jsonTokenData.getText();
        if (text != null) {
            DecodingResult validateContentEncoding = validateContentEncoding(text, jsonTokenLocation);
            FailedValidationResult failure = validateContentEncoding.getFailure();
            if (failure != null) {
                return failure;
            }
            return validateContentMediaType(validateContentEncoding, jsonTokenLocation);
        }
        j.l();
        throw null;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return this;
    }
}
