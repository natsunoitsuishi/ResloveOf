public interface IGenericTypeResolver {
    Class<?>[] resolveTypeArgument(Class<?> clazz, Class<?> generic);
}