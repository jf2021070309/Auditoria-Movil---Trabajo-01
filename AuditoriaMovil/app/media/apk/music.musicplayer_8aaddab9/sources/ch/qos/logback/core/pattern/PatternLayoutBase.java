package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.StatusManager;
import e.a.d.a.a;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class PatternLayoutBase<E> extends LayoutBase<E> {
    public static final int INTIAL_STRING_BUILDER_SIZE = 256;
    public Converter<E> head;
    public Map<String, String> instanceConverterMap = new HashMap();
    public boolean outputPatternAsHeader = false;
    public String pattern;
    public PostCompileProcessor<E> postCompileProcessor;

    public abstract Map<String, String> getDefaultConverterMap();

    public Map<String, String> getEffectiveConverterMap() {
        Map map;
        HashMap hashMap = new HashMap();
        Map<String, String> defaultConverterMap = getDefaultConverterMap();
        if (defaultConverterMap != null) {
            hashMap.putAll(defaultConverterMap);
        }
        Context context = getContext();
        if (context != null && (map = (Map) context.getObject(CoreConstants.PATTERN_RULE_REGISTRY)) != null) {
            hashMap.putAll(map);
        }
        hashMap.putAll(this.instanceConverterMap);
        return hashMap;
    }

    public Map<String, String> getInstanceConverterMap() {
        return this.instanceConverterMap;
    }

    public String getPattern() {
        return this.pattern;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationHeader() {
        if (this.outputPatternAsHeader) {
            return getPresentationHeaderPrefix() + this.pattern;
        }
        return super.getPresentationHeader();
    }

    public String getPresentationHeaderPrefix() {
        return "";
    }

    public boolean isOutputPatternAsHeader() {
        return this.outputPatternAsHeader;
    }

    public void setContextForConverters(Converter<E> converter) {
        ConverterUtil.setContextForConverters(getContext(), converter);
    }

    public void setOutputPatternAsHeader(boolean z) {
        this.outputPatternAsHeader = z;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }

    public void setPostCompileProcessor(PostCompileProcessor<E> postCompileProcessor) {
        this.postCompileProcessor = postCompileProcessor;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String str = this.pattern;
        if (str == null || str.length() == 0) {
            addError("Empty or null pattern.");
            return;
        }
        try {
            Parser parser = new Parser(this.pattern);
            if (getContext() != null) {
                parser.setContext(getContext());
            }
            Converter<E> compile = parser.compile(parser.parse(), getEffectiveConverterMap());
            this.head = compile;
            PostCompileProcessor<E> postCompileProcessor = this.postCompileProcessor;
            if (postCompileProcessor != null) {
                postCompileProcessor.process(this.context, compile);
            }
            ConverterUtil.setContextForConverters(getContext(), this.head);
            ConverterUtil.startConverters(this.head);
            super.start();
        } catch (ScanException e2) {
            StatusManager statusManager = getContext().getStatusManager();
            StringBuilder y = a.y("Failed to parse pattern \"");
            y.append(getPattern());
            y.append("\".");
            statusManager.add(new ErrorStatus(y.toString(), this, e2));
        }
    }

    public String toString() {
        return getClass().getName() + "(\"" + getPattern() + "\")";
    }

    public String writeLoopOnConverters(E e2) {
        StringBuilder sb = new StringBuilder(256);
        for (Converter<E> converter = this.head; converter != null; converter = converter.getNext()) {
            converter.write(sb, e2);
        }
        return sb.toString();
    }
}
