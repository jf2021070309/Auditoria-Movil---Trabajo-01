package com.worldturner.medeia.parser.builder;

import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder;
import com.worldturner.medeia.parser.type.MapperType;
import kotlin.Metadata;
/* compiled from: ValueBuilder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0007\u001a\u00020\u0001H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\bH&J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00028\u00008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "Lcom/worldturner/medeia/parser/type/MapperType;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "value", "Lcom/amazon/aps/iva/kb0/q;", "add", "itemType", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "", "completed", "lastToken", "createValue", "", "toString", "", "startLevel", "I", "getStartLevel", "()I", "type", "Lcom/worldturner/medeia/parser/type/MapperType;", "getType", "()Lcom/worldturner/medeia/parser/type/MapperType;", "getCurrentProperty", "()Ljava/lang/String;", "setCurrentProperty", "(Ljava/lang/String;)V", "currentProperty", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationBuilder;", "getConsumerBuilder", "()Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationBuilder;", "consumerBuilder", "<init>", "(ILcom/worldturner/medeia/parser/type/MapperType;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public abstract class ValueBuilder<T extends MapperType> {
    private final int startLevel;
    private final T type;

    public ValueBuilder(int i, T t) {
        j.g(t, "type");
        this.startLevel = i;
        this.type = t;
    }

    /* renamed from: add */
    public abstract void mo61add(Object obj);

    public abstract boolean completed(JsonTokenData jsonTokenData);

    public abstract Object createValue(JsonTokenData jsonTokenData);

    public JsonTokenDataAndLocationBuilder getConsumerBuilder() {
        return null;
    }

    public abstract String getCurrentProperty();

    public final int getStartLevel() {
        return this.startLevel;
    }

    public final T getType() {
        return this.type;
    }

    public abstract MapperType itemType();

    public abstract void setCurrentProperty(String str);

    public String toString() {
        return e0.a(getClass()).k() + "(startLevel=" + this.startLevel + ", type=" + this.type + ')';
    }
}
