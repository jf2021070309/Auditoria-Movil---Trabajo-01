package ch.qos.logback.core.html;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ScanException;
import e.a.d.a.a;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class HTMLLayoutBase<E> extends LayoutBase<E> {
    public CssBuilder cssBuilder;
    public Converter<E> head;
    public String pattern;
    public String title = "Logback Log Messages";
    public long counter = 0;

    private void buildHeaderRowForTable(StringBuilder sb) {
        sb.append("<tr class=\"header\">");
        sb.append(CoreConstants.LINE_SEPARATOR);
        for (Converter<E> converter = this.head; converter != null; converter = converter.getNext()) {
            if (computeConverterName(converter) != null) {
                sb.append("<td class=\"");
                sb.append(computeConverterName(converter));
                sb.append("\">");
                sb.append(computeConverterName(converter));
                sb.append("</td>");
                sb.append(CoreConstants.LINE_SEPARATOR);
            }
        }
        sb.append("</tr>");
        sb.append(CoreConstants.LINE_SEPARATOR);
    }

    public String computeConverterName(Converter<E> converter) {
        String simpleName = converter.getClass().getSimpleName();
        int indexOf = simpleName.indexOf("Converter");
        return indexOf == -1 ? simpleName : simpleName.substring(0, indexOf);
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getContentType() {
        return "text/html";
    }

    public CssBuilder getCssBuilder() {
        return this.cssBuilder;
    }

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
        return hashMap;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getFileFooter() {
        return a.r(new StringBuilder(), CoreConstants.LINE_SEPARATOR, "</body></html>");
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getFileHeader() {
        StringBuilder A = a.A("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"", " \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
        String str = CoreConstants.LINE_SEPARATOR;
        a.M(A, str, "<html>", str, "  <head>");
        A.append(str);
        A.append("    <title>");
        a.L(A, this.title, "</title>", str);
        this.cssBuilder.addCss(A);
        A.append(str);
        A.append("  </head>");
        A.append(str);
        return a.r(A, "<body>", str);
    }

    public String getPattern() {
        return this.pattern;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationFooter() {
        return "</table>";
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationHeader() {
        StringBuilder y = a.y("<hr/>");
        String str = CoreConstants.LINE_SEPARATOR;
        y.append(str);
        y.append("<p>Log session start time ");
        y.append(new Date());
        y.append("</p><p></p>");
        y.append(str);
        a.L(y, str, "<table cellspacing=\"0\">", str);
        buildHeaderRowForTable(y);
        return y.toString();
    }

    public String getTitle() {
        return this.title;
    }

    public void setCssBuilder(CssBuilder cssBuilder) {
        this.cssBuilder = cssBuilder;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        boolean z;
        try {
            Parser parser = new Parser(this.pattern);
            parser.setContext(getContext());
            Converter<E> compile = parser.compile(parser.parse(), getEffectiveConverterMap());
            this.head = compile;
            ConverterUtil.startConverters(compile);
            z = false;
        } catch (ScanException e2) {
            addError("Incorrect pattern found", e2);
            z = true;
        }
        if (z) {
            return;
        }
        this.started = true;
    }

    public void startNewTableIfLimitReached(StringBuilder sb) {
        if (this.counter >= AbstractComponentTracker.LINGERING_TIMEOUT) {
            this.counter = 0L;
            sb.append("</table>");
            String str = CoreConstants.LINE_SEPARATOR;
            a.M(sb, str, "<p></p>", "<table cellspacing=\"0\">", str);
            buildHeaderRowForTable(sb);
        }
    }
}
