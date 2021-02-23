package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Validator {

    public static <T> String check(T req) throws IllegalAccessException {

        return validateInfo(req);

    }

    private static <T> String validateInfo(T req) throws IllegalAccessException {
        //获取所有字段
        Field[] fields = req.getClass().getDeclaredFields();

        for (Field field : fields) {
            //获取字段上的所有注解
            Annotation[] annotations = field.getAnnotations();

            for (Annotation annotation : annotations) {
                //注解是否为StringType
                if (!(annotation instanceof StringType)) {
                    continue;
                }

                // 设置属性为可访问的
                field.setAccessible(true);

                StringType stringType = field.getAnnotation(StringType.class);

                if (!"String".equals(field.getType().getSimpleName())) {
                    return field.getName() + "为非字符型字段，不能使用该注解";
                }

                Object o = field.get(req);
                String s = (String) o;

                boolean isEmpty = s.isEmpty();
                if (!(isEmpty == stringType.allowEmpty())) {
                    return stringType.name() + "不能为空";
                }

                if (s.length() > stringType.maxLength()) {
                    return stringType.name() + "超过最大长度" + stringType.maxLength();
                }

            }

        }

        return "校验通过";
    }
}
