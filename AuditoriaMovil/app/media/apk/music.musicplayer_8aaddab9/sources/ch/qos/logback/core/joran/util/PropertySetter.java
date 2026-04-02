package ch.qos.logback.core.joran.util;

import ch.qos.logback.core.joran.spi.DefaultClass;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.PropertySetterException;
import e.a.d.a.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Locale;
/* loaded from: classes.dex */
public class PropertySetter extends ContextAwareBase {
    public MethodDescriptor[] methodDescriptors;
    public Object obj;
    public Class<?> objClass;
    public PropertyDescriptor[] propertyDescriptors;

    public PropertySetter(Object obj) {
        this.obj = obj;
        this.objClass = obj.getClass();
    }

    private String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
    }

    private AggregationType computeRawAggregationType(Method method) {
        Class<?> parameterClassForMethod = getParameterClassForMethod(method);
        return parameterClassForMethod == null ? AggregationType.NOT_FOUND : StringToObjectConverter.canBeBuiltFromSimpleString(parameterClassForMethod) ? AggregationType.AS_BASIC_PROPERTY : AggregationType.AS_COMPLEX_PROPERTY;
    }

    private Method findAdderMethod(String str) {
        String capitalizeFirstLetter = capitalizeFirstLetter(str);
        return getMethod("add" + capitalizeFirstLetter);
    }

    private Method findSetterMethod(String str) {
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor != null) {
            return propertyDescriptor.getWriteMethod();
        }
        return null;
    }

    private Class<?> getParameterClassForMethod(Method method) {
        if (method == null) {
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1) {
            return null;
        }
        return parameterTypes[0];
    }

    private boolean isSanityCheckSuccessful(String str, Method method, Class<?>[] clsArr, Object obj) {
        StringBuilder sb;
        String str2;
        Class<?> cls = obj.getClass();
        if (clsArr.length != 1) {
            sb = a.B("Wrong number of parameters in setter method for property [", str, "] in ");
            str2 = this.obj.getClass().getName();
        } else if (clsArr[0].isAssignableFrom(obj.getClass())) {
            return true;
        } else {
            StringBuilder y = a.y("A \"");
            y.append(cls.getName());
            y.append("\" object is not assignable to a \"");
            y.append(clsArr[0].getName());
            y.append("\" variable.");
            addError(y.toString());
            addError("The class \"" + clsArr[0].getName() + "\" was loaded by ");
            addError("[" + clsArr[0].getClassLoader() + "] whereas object of type ");
            sb = new StringBuilder();
            sb.append("\"");
            sb.append(cls.getName());
            sb.append("\" was loaded by [");
            sb.append(cls.getClassLoader());
            str2 = "].";
        }
        sb.append(str2);
        addError(sb.toString());
        return false;
    }

    private boolean isUnequivocallyInstantiable(Class<?> cls) {
        if (cls.isInterface()) {
            return false;
        }
        return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) != null;
    }

    public void addBasicProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String capitalizeFirstLetter = capitalizeFirstLetter(str);
        Method findAdderMethod = findAdderMethod(capitalizeFirstLetter);
        if (findAdderMethod == null) {
            addError("No adder for property [" + capitalizeFirstLetter + "].");
            return;
        }
        Class<?>[] parameterTypes = findAdderMethod.getParameterTypes();
        isSanityCheckSuccessful(capitalizeFirstLetter, findAdderMethod, parameterTypes, str2);
        try {
            if (StringToObjectConverter.convertArg(this, str2, parameterTypes[0]) != null) {
                invokeMethodWithSingleParameterOnThisObject(findAdderMethod, str2);
            }
        } catch (Throwable th) {
            StringBuilder y = a.y("Conversion to type [");
            y.append(parameterTypes[0]);
            y.append("] failed. ");
            addError(y.toString(), th);
        }
    }

    public void addComplexProperty(String str, Object obj) {
        Method findAdderMethod = findAdderMethod(str);
        if (findAdderMethod != null) {
            if (isSanityCheckSuccessful(str, findAdderMethod, findAdderMethod.getParameterTypes(), obj)) {
                invokeMethodWithSingleParameterOnThisObject(findAdderMethod, obj);
                return;
            }
            return;
        }
        StringBuilder B = a.B("Could not find method [add", str, "] in class [");
        B.append(this.objClass.getName());
        B.append("].");
        addError(B.toString());
    }

    public AggregationType computeAggregationType(String str) {
        Method findAdderMethod = findAdderMethod(str);
        if (findAdderMethod != null) {
            AggregationType computeRawAggregationType = computeRawAggregationType(findAdderMethod);
            int ordinal = computeRawAggregationType.ordinal();
            if (ordinal == 0) {
                return AggregationType.NOT_FOUND;
            }
            if (ordinal == 1) {
                return AggregationType.AS_BASIC_PROPERTY_COLLECTION;
            }
            if (ordinal == 2) {
                return AggregationType.AS_COMPLEX_PROPERTY_COLLECTION;
            }
            if (ordinal == 3 || ordinal == 4) {
                addError("Unexpected AggregationType " + computeRawAggregationType);
            }
        }
        Method findSetterMethod = findSetterMethod(str);
        return findSetterMethod != null ? computeRawAggregationType(findSetterMethod) : AggregationType.NOT_FOUND;
    }

    public <T extends Annotation> T getAnnotation(String str, Class<T> cls, Method method) {
        if (method != null) {
            return (T) method.getAnnotation(cls);
        }
        return null;
    }

    public Class<?> getByConcreteType(String str, Method method) {
        Class<?> parameterClassForMethod = getParameterClassForMethod(method);
        if (parameterClassForMethod != null && isUnequivocallyInstantiable(parameterClassForMethod)) {
            return parameterClassForMethod;
        }
        return null;
    }

    public Class<?> getClassNameViaImplicitRules(String str, AggregationType aggregationType, DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
        Class<?> findDefaultComponentType = defaultNestedComponentRegistry.findDefaultComponentType(this.obj.getClass(), str);
        if (findDefaultComponentType != null) {
            return findDefaultComponentType;
        }
        Method relevantMethod = getRelevantMethod(str, aggregationType);
        if (relevantMethod == null) {
            return null;
        }
        Class<?> defaultClassNameByAnnonation = getDefaultClassNameByAnnonation(str, relevantMethod);
        return defaultClassNameByAnnonation != null ? defaultClassNameByAnnonation : getByConcreteType(str, relevantMethod);
    }

    public Class<?> getDefaultClassNameByAnnonation(String str, Method method) {
        DefaultClass defaultClass = (DefaultClass) getAnnotation(str, DefaultClass.class, method);
        if (defaultClass != null) {
            return defaultClass.value();
        }
        return null;
    }

    public Method getMethod(String str) {
        if (this.methodDescriptors == null) {
            introspect();
        }
        int i2 = 0;
        while (true) {
            MethodDescriptor[] methodDescriptorArr = this.methodDescriptors;
            if (i2 >= methodDescriptorArr.length) {
                return null;
            }
            if (str.equals(methodDescriptorArr[i2].getName())) {
                return this.methodDescriptors[i2].getMethod();
            }
            i2++;
        }
    }

    public Object getObj() {
        return this.obj;
    }

    public Class<?> getObjClass() {
        return this.objClass;
    }

    public PropertyDescriptor getPropertyDescriptor(String str) {
        if (this.propertyDescriptors == null) {
            introspect();
        }
        int i2 = 0;
        while (true) {
            PropertyDescriptor[] propertyDescriptorArr = this.propertyDescriptors;
            if (i2 >= propertyDescriptorArr.length) {
                return null;
            }
            if (str.equals(propertyDescriptorArr[i2].getName())) {
                return this.propertyDescriptors[i2];
            }
            i2++;
        }
    }

    public Method getRelevantMethod(String str, AggregationType aggregationType) {
        String capitalizeFirstLetter = capitalizeFirstLetter(str);
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY_COLLECTION) {
            return findAdderMethod(capitalizeFirstLetter);
        }
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY) {
            return findSetterMethod(capitalizeFirstLetter);
        }
        throw new IllegalStateException(aggregationType + " not allowed here");
    }

    public void introspect() {
        try {
            this.propertyDescriptors = Introspector.getPropertyDescriptors(this.objClass);
            this.methodDescriptors = Introspector.getMethodDescriptors(this.objClass);
        } catch (IntrospectionException e2) {
            StringBuilder y = a.y("Failed to introspect ");
            y.append(this.obj);
            y.append(": ");
            y.append(e2.getMessage());
            addError(y.toString());
            this.propertyDescriptors = new PropertyDescriptor[0];
            this.methodDescriptors = new MethodDescriptor[0];
        }
    }

    public void invokeMethodWithSingleParameterOnThisObject(Method method, Object obj) {
        Class<?> cls = obj.getClass();
        try {
            method.invoke(this.obj, obj);
        } catch (Exception e2) {
            StringBuilder y = a.y("Could not invoke method ");
            y.append(method.getName());
            y.append(" in class ");
            y.append(this.obj.getClass().getName());
            y.append(" with parameter of type ");
            y.append(cls.getName());
            addError(y.toString(), e2);
        }
    }

    public void setComplexProperty(String str, Object obj) {
        StringBuilder B;
        Class<?> cls;
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor == null) {
            B = a.B("Could not find PropertyDescriptor for [", str, "] in ");
            cls = this.objClass;
        } else {
            Method writeMethod = propertyDescriptor.getWriteMethod();
            if (writeMethod != null) {
                if (isSanityCheckSuccessful(str, writeMethod, writeMethod.getParameterTypes(), obj)) {
                    try {
                        invokeMethodWithSingleParameterOnThisObject(writeMethod, obj);
                        return;
                    } catch (Exception e2) {
                        StringBuilder y = a.y("Could not set component ");
                        y.append(this.obj);
                        y.append(" for parent component ");
                        y.append(this.obj);
                        addError(y.toString(), e2);
                        return;
                    }
                }
                return;
            }
            B = a.B("Not setter method for property [", str, "] in ");
            cls = this.obj.getClass();
        }
        B.append(cls.getName());
        addWarn(B.toString());
    }

    public void setProperty(PropertyDescriptor propertyDescriptor, String str, String str2) throws PropertySetterException {
        Method writeMethod = propertyDescriptor.getWriteMethod();
        if (writeMethod == null) {
            throw new PropertySetterException(a.l("No setter for property [", str, "]."));
        }
        Class<?>[] parameterTypes = writeMethod.getParameterTypes();
        if (parameterTypes.length != 1) {
            throw new PropertySetterException("#params for setter != 1");
        }
        try {
            Object convertArg = StringToObjectConverter.convertArg(this, str2, parameterTypes[0]);
            if (convertArg != null) {
                try {
                    writeMethod.invoke(this.obj, convertArg);
                    return;
                } catch (Exception e2) {
                    throw new PropertySetterException(e2);
                }
            }
            StringBuilder y = a.y("Conversion to type [");
            y.append(parameterTypes[0]);
            y.append("] failed.");
            throw new PropertySetterException(y.toString());
        } catch (Throwable th) {
            StringBuilder y2 = a.y("Conversion to type [");
            y2.append(parameterTypes[0]);
            y2.append("] failed. ");
            throw new PropertySetterException(y2.toString(), th);
        }
    }

    public void setProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String decapitalize = Introspector.decapitalize(str);
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(decapitalize);
        if (propertyDescriptor == null) {
            StringBuilder B = a.B("No such property [", decapitalize, "] in ");
            B.append(this.objClass.getName());
            B.append(".");
            addWarn(B.toString());
            return;
        }
        try {
            setProperty(propertyDescriptor, decapitalize, str2);
        } catch (PropertySetterException e2) {
            addWarn("Failed to set property [" + decapitalize + "] to value \"" + str2 + "\". ", e2);
        }
    }
}
